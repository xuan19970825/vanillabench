package org.vanilladb.bench.tpce.rte;

import org.vanilladb.bench.remote.SutResultSet;
import org.vanilladb.bench.tpce.TpceTransactionType;
import org.vanilladb.bench.tpce.data.Trade;

public class TradeResultParamGen implements TpceTxParamGenerator {
	
	private Trade trade;
	
	public TradeResultParamGen(Trade trade) {
		this.trade = trade;
	}

	@Override
	public TpceTransactionType getTxnType() {
		return TpceTransactionType.TRADE_RESULT;
	}

	@Override
	public Object[] generateParameter() {
		Object[] params = new Object[4];
		int idxCntr = 0;

		params[idxCntr++] = trade.getTradeId();
		params[idxCntr++] = trade.getCustomerId();
		params[idxCntr++] = trade.getCustomerAccountId();
		params[idxCntr++] = trade.getBrokerId();

		return params;
	}

	@Override
	public void onResponseReceived(SutResultSet result) {
		// do nothing
	}

}
