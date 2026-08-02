package com.vk.ecomm.products_selection.impl.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.ecomm.products_selection.api.di.ProductsSelectionComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.buc0;
import xsna.c8m;
import xsna.ewy;
import xsna.fpf0;
import xsna.g8m;
import xsna.ntd0;
import xsna.pwj0;
import xsna.qcy;

/* compiled from: ProductsSelectionComponentImpl.kt */
/* loaded from: classes18.dex */
public final class ProductsSelectionComponentImpl implements ProductsSelectionComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final ewy a;

    /* compiled from: ProductsSelectionComponentImpl.kt */
    public static final class a implements c8m<ProductsSelectionComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new ProductsSelectionComponentImpl(0);
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ProductsSelectionComponentImpl.class, "router", "getRouter()Lcom/vk/ecomm/products_selection/api/ProductsSelectionRouter;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    public /* synthetic */ ProductsSelectionComponentImpl(int i) {
        this();
    }

    @Override // com.vk.ecomm.products_selection.api.di.ProductsSelectionComponent
    public final ntd0 a() {
        qcy<Object> qcyVar = b[0];
        return (ntd0) this.a.c();
    }

    private ProductsSelectionComponentImpl() {
        this.a = new ewy(new buc0(1));
    }
}
