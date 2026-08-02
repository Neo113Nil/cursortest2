package com.vk.ecomm.products_multipicker.impl.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.ecomm.products_multipicker.api.di.ProductsMultipickerComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.atd0;
import xsna.btd0;
import xsna.c8m;
import xsna.ewy;
import xsna.fpf0;
import xsna.g8m;
import xsna.l9;
import xsna.pwj0;
import xsna.qcy;

/* compiled from: ProductsMultipickerComponentImpl.kt */
/* loaded from: classes18.dex */
public final class ProductsMultipickerComponentImpl implements ProductsMultipickerComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final ewy a;

    /* compiled from: ProductsMultipickerComponentImpl.kt */
    public static final class a implements c8m<ProductsMultipickerComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new ProductsMultipickerComponentImpl(0);
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ProductsMultipickerComponentImpl.class, "router", "getRouter()Lcom/vk/ecomm/products_multipicker/impl/ProductsMultipickerRouterImpl;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    public /* synthetic */ ProductsMultipickerComponentImpl(int i) {
        this();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.ecomm.products_multipicker.api.di.ProductsMultipickerComponent
    public final atd0 a() {
        qcy<Object> qcyVar = b[0];
        return (btd0) this.a.c();
    }

    private ProductsMultipickerComponentImpl() {
        this.a = new ewy(new l9(25));
    }
}
