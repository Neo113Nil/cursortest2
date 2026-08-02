package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

import com.unity3d.services.core.reflection.GenericBridge;
import defpackage.tub;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0014J\u0006\u0010\b\u001a\u00020\u0000J\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/PendingPurchasesParamsBuilderBridge;", "Lcom/unity3d/services/core/reflection/GenericBridge;", "builderInstance", "", "<init>", "(Ljava/lang/Object;)V", "getClassName", "", PendingPurchasesParamsBuilderBridge.ENABLE_ONE_TIME_PRODUCT_METHOD, PendingPurchasesParamsBuilderBridge.BUILD_METHOD, "Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/PendingPurchasesParamsBridge;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PendingPurchasesParamsBuilderBridge extends GenericBridge {

    @NotNull
    private static final String BUILD_METHOD = "build";

    @NotNull
    private static final String ENABLE_ONE_TIME_PRODUCT_METHOD = "enableOneTimeProducts";

    @NotNull
    private final Object builderInstance;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PendingPurchasesParamsBuilderBridge(@NotNull Object obj) {
        super(tub.f(new Pair(ENABLE_ONE_TIME_PRODUCT_METHOD, new Class[0]), new Pair(BUILD_METHOD, new Class[0])));
        obj.getClass();
        this.builderInstance = obj;
    }

    @NotNull
    public final PendingPurchasesParamsBridge build() {
        return new PendingPurchasesParamsBridge(callNonVoidMethod(BUILD_METHOD, this.builderInstance, new Object[0]));
    }

    @NotNull
    public final PendingPurchasesParamsBuilderBridge enableOneTimeProducts() {
        callVoidMethod(ENABLE_ONE_TIME_PRODUCT_METHOD, this.builderInstance, new Object[0]);
        return this;
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    @NotNull
    public String getClassName() {
        return "com.android.billingclient.api.PendingPurchasesParams$Builder";
    }
}
