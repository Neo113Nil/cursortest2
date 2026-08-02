package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.domain.GetByteStringId;
import com.unity3d.ads.core.extensions.TimestampExtensionsKt;
import com.unity3d.ads.core.extensions.TransactionStateExtensionsKt;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.unity3d.services.store.gpbl.bridges.PurchaseBridge;
import gatewayprotocol.v1.TransactionDataKt;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0096\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/unity3d/ads/core/domain/events/AndroidGetTransactionData;", "Lcom/unity3d/ads/core/domain/events/GetTransactionData;", "getByteStringId", "Lcom/unity3d/ads/core/domain/GetByteStringId;", "<init>", "(Lcom/unity3d/ads/core/domain/GetByteStringId;)V", "invoke", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionData;", "purchaseDetail", "Lcom/unity3d/services/store/gpbl/bridges/PurchaseBridge;", "productDetailJson", "", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidGetTransactionData implements GetTransactionData {

    @NotNull
    private final GetByteStringId getByteStringId;

    public AndroidGetTransactionData(@NotNull GetByteStringId getByteStringId) {
        getByteStringId.getClass();
        this.getByteStringId = getByteStringId;
    }

    @Override // com.unity3d.ads.core.domain.events.GetTransactionData
    @NotNull
    public TransactionEventRequestOuterClass.TransactionData invoke(@NotNull PurchaseBridge purchaseDetail, @NotNull String productDetailJson) {
        purchaseDetail.getClass();
        productDetailJson.getClass();
        TransactionDataKt.Dsl.Companion companion = TransactionDataKt.Dsl.INSTANCE;
        TransactionEventRequestOuterClass.TransactionData.Builder newBuilder = TransactionEventRequestOuterClass.TransactionData.newBuilder();
        newBuilder.getClass();
        TransactionDataKt.Dsl _create = companion._create(newBuilder);
        _create.setProductId(purchaseDetail.getOriginalJson().get(InAppPurchaseMetaData.KEY_PRODUCT_ID).toString());
        _create.setEventId(this.getByteStringId.invoke());
        Object obj = purchaseDetail.getOriginalJson().get("purchaseTime");
        obj.getClass();
        _create.setTimestamp(TimestampExtensionsKt.fromMillis(((Long) obj).longValue()));
        _create.setTransactionId(purchaseDetail.getOriginalJson().get("orderId").toString());
        _create.setProduct(productDetailJson);
        String jSONObject = purchaseDetail.getOriginalJson().toString();
        jSONObject.getClass();
        _create.setTransaction(jSONObject);
        String signature = purchaseDetail.getSignature();
        signature.getClass();
        _create.setSignature(signature);
        Object obj2 = purchaseDetail.getOriginalJson().get("purchaseState");
        obj2.getClass();
        _create.setTransactionState(TransactionStateExtensionsKt.fromPurchaseState(((Integer) obj2).intValue()));
        return _create._build();
    }
}
