package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

import com.ironsource.U3;
import com.unity3d.services.core.reflection.GenericBridge;
import defpackage.tub;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0014J\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0010"}, d2 = {"Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/QueryPurchasesParamsBuilderBridge;", "Lcom/unity3d/services/core/reflection/GenericBridge;", "builderInstance", "", "<init>", "(Ljava/lang/Object;)V", "getBuilderInstance", "()Ljava/lang/Object;", "setBuilderInstance", "getClassName", "", QueryPurchasesParamsBuilderBridge.BUILD_METHOD, "Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/QueryProductDetailsParamsBridge;", QueryPurchasesParamsBuilderBridge.SET_PRODUCT_TYPE_METHOD, U3.i.m, "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class QueryPurchasesParamsBuilderBridge extends GenericBridge {

    @NotNull
    private static final String BUILD_METHOD = "build";

    @NotNull
    private static final String SET_PRODUCT_TYPE_METHOD = "setProductType";

    @NotNull
    private Object builderInstance;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueryPurchasesParamsBuilderBridge(@NotNull Object obj) {
        super(tub.h(new Pair(SET_PRODUCT_TYPE_METHOD, new Class[]{String.class}), new Pair(BUILD_METHOD, new Class[0])));
        obj.getClass();
        this.builderInstance = obj;
    }

    @NotNull
    public final QueryProductDetailsParamsBridge build() {
        return new QueryProductDetailsParamsBridge(callNonVoidMethod(BUILD_METHOD, this.builderInstance, new Object[0]));
    }

    @NotNull
    public final Object getBuilderInstance() {
        return this.builderInstance;
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    @NotNull
    public String getClassName() {
        return "com.android.billingclient.api.QueryPurchasesParams$Builder";
    }

    public final void setBuilderInstance(@NotNull Object obj) {
        obj.getClass();
        this.builderInstance = obj;
    }

    @NotNull
    public final QueryPurchasesParamsBuilderBridge setProductType(@NotNull String productType) {
        productType.getClass();
        Object callNonVoidMethod = callNonVoidMethod(SET_PRODUCT_TYPE_METHOD, this.builderInstance, productType);
        callNonVoidMethod.getClass();
        this.builderInstance = callNonVoidMethod;
        return this;
    }
}
