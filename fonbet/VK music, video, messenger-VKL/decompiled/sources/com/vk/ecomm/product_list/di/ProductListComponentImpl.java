package com.vk.ecomm.product_list.di;

import com.vk.di.component.DiUnscopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.e7m;
import xsna.ewy;
import xsna.fpf0;
import xsna.kqd0;
import xsna.qcy;

/* compiled from: ProductListComponentImpl.kt */
/* loaded from: classes18.dex */
public final class ProductListComponentImpl implements ProductListComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final ewy a = new ewy(new com.vk.movika.sdk.base.model.props.a(26));

    /* compiled from: ProductListComponentImpl.kt */
    public static final class a implements b7m<ProductListComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new ProductListComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ProductListComponentImpl.class, "router", "getRouter()Lcom/vk/ecomm/product_list/router/ProductListRouter;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.ecomm.product_list.di.ProductListComponent
    public final kqd0 a() {
        qcy<Object> qcyVar = b[0];
        return (kqd0) this.a.c();
    }
}
