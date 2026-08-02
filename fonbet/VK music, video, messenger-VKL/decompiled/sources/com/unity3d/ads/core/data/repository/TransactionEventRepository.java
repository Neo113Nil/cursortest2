package com.unity3d.ads.core.data.repository;

import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import xsna.baj0;

/* compiled from: TransactionEventRepository.kt */
/* loaded from: classes14.dex */
public interface TransactionEventRepository {
    void addTransactionEvent(TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest);

    baj0<TransactionEventRequestOuterClass.TransactionEventRequest> getTransactionEvents();
}
