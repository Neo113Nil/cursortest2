package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

import com.unity3d.services.core.reflection.GenericBridge;
import kotlin.Pair;
import xsna.pn00;
import xsna.zcl;

/* compiled from: QueryPurchasesParamsBuilderBridge.kt */
/* loaded from: classes14.dex */
public final class QueryPurchasesParamsBuilderBridge extends GenericBridge {
    private static final String BUILD_METHOD = "build";
    public static final Companion Companion = new Companion(null);
    private static final String SET_PRODUCT_TYPE_METHOD = "setProductType";
    private Object builderInstance;

    /* compiled from: QueryPurchasesParamsBuilderBridge.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public QueryPurchasesParamsBuilderBridge(Object obj) {
        super(pn00.k(new Pair(SET_PRODUCT_TYPE_METHOD, new Class[]{String.class}), new Pair(BUILD_METHOD, new Class[0])));
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
        return "com.android.billingclient.api.QueryPurchasesParams$Builder";
    }

    public final void setBuilderInstance(Object obj) {
        this.builderInstance = obj;
    }

    public final QueryPurchasesParamsBuilderBridge setProductType(String str) {
        this.builderInstance = callNonVoidMethod(SET_PRODUCT_TYPE_METHOD, this.builderInstance, str);
        return this;
    }
}
