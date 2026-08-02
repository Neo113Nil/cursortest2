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

/* compiled from: QueryProductDetailsResultsBridge.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0014J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/QueryProductDetailsResultsBridge;", "Lcom/unity3d/services/core/reflection/GenericBridge;", "productDetailsResult", "", "(Ljava/lang/Object;)V", "getClassName", "", QueryProductDetailsResultsBridge.GET_PRODUCT_DETAILS_LIST_METHOD, "", "Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/ProductDetailsBridge;", k.M, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class QueryProductDetailsResultsBridge extends GenericBridge {
    private static final String GET_PRODUCT_DETAILS_LIST_METHOD = "getProductDetailsList";
    private final Object productDetailsResult;

    public final List<ProductDetailsBridge> getProductDetailsList() {
        List list = (List) callNonVoidMethod(GET_PRODUCT_DETAILS_LIST_METHOD, this.productDetailsResult, new Object[0]);
        if (list != null) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(new ProductDetailsBridge(it.next()));
            }
            return arrayList;
        }
        return CollectionsKt.emptyList();
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    protected String getClassName() {
        return "com.android.billingclient.api.QueryProductDetailsResult";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueryProductDetailsResultsBridge(Object productDetailsResult) {
        super(MapsKt.mapOf(TuplesKt.to(GET_PRODUCT_DETAILS_LIST_METHOD, new Class[0])));
        Intrinsics.checkNotNullParameter(productDetailsResult, "productDetailsResult");
        this.productDetailsResult = productDetailsResult;
    }
}
