package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

import com.unity3d.services.core.reflection.GenericBridge;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import xsna.c5g;
import xsna.pn00;
import xsna.zcl;

/* compiled from: QueryProductDetailsParamsBuilderBridge.kt */
/* loaded from: classes14.dex */
public final class QueryProductDetailsParamsBuilderBridge extends GenericBridge {
    private static final String BUILD_METHOD = "build";
    public static final Companion Companion = new Companion(null);
    private static final String SET_PRODUCT_LIST_METHOD = "setProductList";
    private Object builderInstance;

    /* compiled from: QueryProductDetailsParamsBuilderBridge.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public QueryProductDetailsParamsBuilderBridge(Object obj) {
        super(pn00.k(new Pair(SET_PRODUCT_LIST_METHOD, new Class[]{List.class}), new Pair(BUILD_METHOD, new Class[0])));
        this.builderInstance = obj;
    }

    public final QueryProductDetailsParamsBridge build() {
        return new QueryProductDetailsParamsBridge(callNonVoidMethod(BUILD_METHOD, this.builderInstance, new Object[0]));
    }

    public final Object getBuilderInstance() {
        return this.builderInstance;
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    public String getClassName() {
        return "com.android.billingclient.api.QueryProductDetailsParams$Builder";
    }

    public final void setBuilderInstance(Object obj) {
        this.builderInstance = obj;
    }

    public final QueryProductDetailsParamsBuilderBridge setProductList(List<ProductBridge> list) {
        List<ProductBridge> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((ProductBridge) it.next()).getInternalClass());
        }
        this.builderInstance = callNonVoidMethod(SET_PRODUCT_LIST_METHOD, this.builderInstance, arrayList);
        return this;
    }
}
