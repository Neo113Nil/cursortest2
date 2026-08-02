package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

import com.unity3d.services.core.reflection.GenericBridge;
import kotlin.Pair;
import xsna.pn00;
import xsna.zcl;

/* compiled from: ProductBuilderBridge.kt */
/* loaded from: classes14.dex */
public final class ProductBuilderBridge extends GenericBridge {
    private static final String BUILD_METHOD = "build";
    public static final Companion Companion = new Companion(null);
    private static final String SET_PRODUCT_ID_METHOD = "setProductId";
    private static final String SET_PRODUCT_TYPE_METHOD = "setProductType";
    private Object builderInstance;

    /* compiled from: ProductBuilderBridge.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public ProductBuilderBridge(Object obj) {
        super(pn00.k(new Pair(SET_PRODUCT_ID_METHOD, new Class[]{String.class}), new Pair(SET_PRODUCT_TYPE_METHOD, new Class[]{String.class}), new Pair(BUILD_METHOD, new Class[0])));
        this.builderInstance = obj;
    }

    public final ProductBridge build() {
        return new ProductBridge(callNonVoidMethod(BUILD_METHOD, this.builderInstance, new Object[0]));
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    public String getClassName() {
        return "com.android.billingclient.api.QueryProductDetailsParams$Product$Builder";
    }

    public final ProductBuilderBridge setProductId(String str) {
        this.builderInstance = callNonVoidMethod(SET_PRODUCT_ID_METHOD, this.builderInstance, str);
        return this;
    }

    public final ProductBuilderBridge setProductType(String str) {
        this.builderInstance = callNonVoidMethod(SET_PRODUCT_TYPE_METHOD, this.builderInstance, str);
        return this;
    }
}
