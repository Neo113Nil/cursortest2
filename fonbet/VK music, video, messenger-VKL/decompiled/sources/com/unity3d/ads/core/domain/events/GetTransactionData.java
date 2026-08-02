package com.unity3d.ads.core.domain.events;

import com.unity3d.services.store.gpbl.bridges.PurchaseBridge;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;

/* compiled from: GetTransactionData.kt */
/* loaded from: classes14.dex */
public interface GetTransactionData {
    TransactionEventRequestOuterClass.TransactionData invoke(PurchaseBridge purchaseBridge, String str);
}
