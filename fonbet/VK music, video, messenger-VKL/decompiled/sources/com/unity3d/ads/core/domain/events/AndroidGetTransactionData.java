package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.domain.GetByteStringId;
import com.unity3d.ads.core.extensions.TimestampExtensionsKt;
import com.unity3d.ads.core.extensions.TransactionStateExtensionsKt;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.unity3d.services.store.gpbl.bridges.PurchaseBridge;
import gatewayprotocol.v1.TransactionDataKt;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;

/* compiled from: AndroidGetTransactionData.kt */
/* loaded from: classes14.dex */
public final class AndroidGetTransactionData implements GetTransactionData {
    private final GetByteStringId getByteStringId;

    public AndroidGetTransactionData(GetByteStringId getByteStringId) {
        this.getByteStringId = getByteStringId;
    }

    @Override // com.unity3d.ads.core.domain.events.GetTransactionData
    public TransactionEventRequestOuterClass.TransactionData invoke(PurchaseBridge purchaseBridge, String str) {
        TransactionDataKt.Dsl _create = TransactionDataKt.Dsl.Companion._create(TransactionEventRequestOuterClass.TransactionData.newBuilder());
        _create.setProductId(purchaseBridge.getOriginalJson().get(InAppPurchaseMetaData.KEY_PRODUCT_ID).toString());
        _create.setEventId(this.getByteStringId.invoke());
        _create.setTimestamp(TimestampExtensionsKt.fromMillis(((Long) purchaseBridge.getOriginalJson().get("purchaseTime")).longValue()));
        _create.setTransactionId(purchaseBridge.getOriginalJson().get("orderId").toString());
        _create.setProduct(str);
        _create.setTransaction(purchaseBridge.getOriginalJson().toString());
        _create.setSignature(purchaseBridge.getSignature());
        _create.setTransactionState(TransactionStateExtensionsKt.fromPurchaseState(((Integer) purchaseBridge.getOriginalJson().get("purchaseState")).intValue()));
        return _create._build();
    }
}
