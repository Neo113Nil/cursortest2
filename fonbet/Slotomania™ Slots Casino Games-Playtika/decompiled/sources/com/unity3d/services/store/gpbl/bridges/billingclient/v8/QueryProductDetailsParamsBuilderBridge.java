package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import com.unity3d.services.core.reflection.GenericBridge;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QueryProductDetailsParamsBuilderBridge.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\b\u001a\u00020\tJ\b\u0010\n\u001a\u00020\u000bH\u0014J\u0014\u0010\f\u001a\u00020\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0011"}, d2 = {"Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/QueryProductDetailsParamsBuilderBridge;", "Lcom/unity3d/services/core/reflection/GenericBridge;", "builderInstance", "", "(Ljava/lang/Object;)V", "getBuilderInstance", "()Ljava/lang/Object;", "setBuilderInstance", "build", "Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/QueryProductDetailsParamsBridge;", "getClassName", "", QueryProductDetailsParamsBuilderBridge.SET_PRODUCT_LIST_METHOD, "productList", "", "Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/ProductBridge;", k.M, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class QueryProductDetailsParamsBuilderBridge extends GenericBridge {
    private static final String BUILD_METHOD = "build";
    private static final String SET_PRODUCT_LIST_METHOD = "setProductList";
    private Object builderInstance;

    public final Object getBuilderInstance() {
        return this.builderInstance;
    }

    public final void setBuilderInstance(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<set-?>");
        this.builderInstance = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueryProductDetailsParamsBuilderBridge(Object builderInstance) {
        super(MapsKt.mapOf(TuplesKt.to(SET_PRODUCT_LIST_METHOD, new Class[]{List.class}), TuplesKt.to("build", new Class[0])));
        Intrinsics.checkNotNullParameter(builderInstance, "builderInstance");
        this.builderInstance = builderInstance;
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    protected String getClassName() {
        return "com.android.billingclient.api.QueryProductDetailsParams$Builder";
    }

    public final QueryProductDetailsParamsBridge build() {
        return new QueryProductDetailsParamsBridge(callNonVoidMethod("build", this.builderInstance, new Object[0]));
    }

    public final QueryProductDetailsParamsBuilderBridge setProductList(List<ProductBridge> productList) {
        Intrinsics.checkNotNullParameter(productList, "productList");
        List<ProductBridge> list = productList;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ProductBridge) it.next()).getProductInternalInstance());
        }
        Object callNonVoidMethod = callNonVoidMethod(SET_PRODUCT_LIST_METHOD, this.builderInstance, arrayList);
        Intrinsics.checkNotNullExpressionValue(callNonVoidMethod, "callNonVoidMethod(SET_PR…nce, productListInternal)");
        this.builderInstance = callNonVoidMethod;
        return this;
    }
}
