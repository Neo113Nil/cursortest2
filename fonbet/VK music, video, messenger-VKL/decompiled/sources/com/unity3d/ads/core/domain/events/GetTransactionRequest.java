package com.unity3d.ads.core.domain.events;

import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import java.util.List;
import xsna.spj;

/* compiled from: GetTransactionRequest.kt */
/* loaded from: classes14.dex */
public interface GetTransactionRequest {
    Object invoke(List<TransactionEventRequestOuterClass.TransactionData> list, String str, TransactionEventRequestOuterClass.TransactionOrigin transactionOrigin, spj<? super TransactionEventRequestOuterClass.TransactionEventRequest> spjVar);
}
