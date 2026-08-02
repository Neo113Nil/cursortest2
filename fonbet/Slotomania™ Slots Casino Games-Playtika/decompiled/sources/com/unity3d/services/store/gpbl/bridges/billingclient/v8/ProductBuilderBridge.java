package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

import com.ironsource.X3;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.unity3d.services.core.reflection.GenericBridge;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProductBuilderBridge.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \r2\u00020\u0001:\u0001\rB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\b\u0010\u0007\u001a\u00020\bH\u0014J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\bJ\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/ProductBuilderBridge;", "Lcom/unity3d/services/core/reflection/GenericBridge;", "builderInstance", "", "(Ljava/lang/Object;)V", "build", "Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/ProductBridge;", "getClassName", "", ProductBuilderBridge.SET_PRODUCT_ID_METHOD, InAppPurchaseMetaData.KEY_PRODUCT_ID, ProductBuilderBridge.SET_PRODUCT_TYPE_METHOD, X3.i.m, k.M, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ProductBuilderBridge extends GenericBridge {
    private static final String BUILD_METHOD = "build";
    private static final String SET_PRODUCT_ID_METHOD = "setProductId";
    private static final String SET_PRODUCT_TYPE_METHOD = "setProductType";
    private Object builderInstance;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductBuilderBridge(Object builderInstance) {
        super(MapsKt.mapOf(TuplesKt.to(SET_PRODUCT_ID_METHOD, new Class[]{String.class}), TuplesKt.to(SET_PRODUCT_TYPE_METHOD, new Class[]{String.class}), TuplesKt.to("build", new Class[0])));
        Intrinsics.checkNotNullParameter(builderInstance, "builderInstance");
        this.builderInstance = builderInstance;
    }

    public final ProductBridge build() {
        return new ProductBridge(callNonVoidMethod("build", this.builderInstance, new Object[0]));
    }

    public final ProductBuilderBridge setProductType(String productType) {
        Intrinsics.checkNotNullParameter(productType, "productType");
        Object callNonVoidMethod = callNonVoidMethod(SET_PRODUCT_TYPE_METHOD, this.builderInstance, productType);
        Intrinsics.checkNotNullExpressionValue(callNonVoidMethod, "callNonVoidMethod(SET_PR…derInstance, productType)");
        this.builderInstance = callNonVoidMethod;
        return this;
    }

    public final ProductBuilderBridge setProductId(String productId) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Object callNonVoidMethod = callNonVoidMethod(SET_PRODUCT_ID_METHOD, this.builderInstance, productId);
        Intrinsics.checkNotNullExpressionValue(callNonVoidMethod, "callNonVoidMethod(SET_PR…ilderInstance, productId)");
        this.builderInstance = callNonVoidMethod;
        return this;
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    protected String getClassName() {
        return "com.android.billingclient.api.QueryProductDetailsParams$Product$Builder";
    }
}
