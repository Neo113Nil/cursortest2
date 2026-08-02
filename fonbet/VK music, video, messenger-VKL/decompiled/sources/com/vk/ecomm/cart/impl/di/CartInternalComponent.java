package com.vk.ecomm.cart.impl.di;

import com.vk.di.component.DiUnscopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.e6k0;
import xsna.e7m;
import xsna.ewy;
import xsna.fpf0;
import xsna.i9;
import xsna.qcy;

/* compiled from: CartInternalComponent.kt */
/* loaded from: classes18.dex */
public final class CartInternalComponent implements DiUnscopedComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final ewy a = new ewy(new i9(this, 7));

    /* compiled from: CartInternalComponent.kt */
    public static final class a implements b7m<CartInternalComponent> {
        public final e6k0 a;

        public a(e6k0 e6k0Var) {
            this.a = e6k0Var;
        }

        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new CartInternalComponent(this.a);
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(CartInternalComponent.class, "checkoutPaymentHandler", "getCheckoutPaymentHandler()Lcom/vk/ecomm/cart/impl/dependencies/CheckoutPaymentHandler;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    public CartInternalComponent(e6k0 e6k0Var) {
    }
}
