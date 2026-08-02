package com.unity3d.ads.core.data.repository;

import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import kotlinx.coroutines.channels.BufferOverflow;
import xsna.baj0;
import xsna.caj0;
import xsna.lyd;
import xsna.rsr;
import xsna.sh50;

/* compiled from: AndroidTransactionEventRepository.kt */
/* loaded from: classes14.dex */
public final class AndroidTransactionEventRepository implements TransactionEventRepository {
    private final sh50<TransactionEventRequestOuterClass.TransactionEventRequest> _transactionEvents;
    private final baj0<TransactionEventRequestOuterClass.TransactionEventRequest> transactionEvents;

    public AndroidTransactionEventRepository() {
        caj0 a = lyd.a(10, 10, BufferOverflow.DROP_OLDEST);
        this._transactionEvents = a;
        this.transactionEvents = rsr.e(a);
    }

    @Override // com.unity3d.ads.core.data.repository.TransactionEventRepository
    public void addTransactionEvent(TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest) {
        this._transactionEvents.e(transactionEventRequest);
    }

    @Override // com.unity3d.ads.core.data.repository.TransactionEventRepository
    public baj0<TransactionEventRequestOuterClass.TransactionEventRequest> getTransactionEvents() {
        return this.transactionEvents;
    }
}
