package com.vk.ecomm.cart.impl.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.ecomm.cart.api.di.CartComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.dw9;
import xsna.e8c;
import xsna.ep;
import xsna.ewy;
import xsna.f0p0;
import xsna.fp;
import xsna.fpf0;
import xsna.fr6;
import xsna.fy9;
import xsna.g8m;
import xsna.hpf0;
import xsna.ib3;
import xsna.mn8;
import xsna.pwj0;
import xsna.qcy;
import xsna.qo;
import xsna.sv9;
import xsna.yxl;

/* compiled from: CartComponentImpl.kt */
/* loaded from: classes.dex */
public final class CartComponentImpl implements CartComponent {
    public static final /* synthetic */ qcy<Object>[] f;
    public final ewy a = new ewy(new fr6(1));
    public final ewy b = new ewy(new qo(2));
    public final ewy c = new ewy(new dw9(0));
    public final ewy d = new ewy(new ib3(2));
    public final ewy e = new ewy(new mn8(1));

    /* compiled from: CartComponentImpl.kt */
    public static final class a implements c8m<CartComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new CartComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(CartComponentImpl.class, "cartRouter", "getCartRouter()Lcom/vk/ecomm/cart/api/router/CartRouter;", 0);
        hpf0 hpf0Var = fpf0.a;
        f = new qcy[]{propertyReference1Impl, fp.c(0, CartComponentImpl.class, "checkoutRouter", "getCheckoutRouter()Lcom/vk/ecomm/cart/api/router/CheckoutRouter;", hpf0Var), ep.a(0, CartComponentImpl.class, "deliveryPointsMapRouter", "getDeliveryPointsMapRouter()Lcom/vk/ecomm/cart/api/router/DeliveryPointsMapRouter;", hpf0Var), ep.a(0, CartComponentImpl.class, "toDeliveryPointMapper", "getToDeliveryPointMapper()Lcom/vk/ecomm/cart/api/model/map/ToDeliveryPointMapper;", hpf0Var), ep.a(0, CartComponentImpl.class, "cartAmountErrorHandler", "getCartAmountErrorHandler()Lcom/vk/ecomm/cart/api/utils/CartAmountErrorHandler;", hpf0Var)};
    }

    @Override // com.vk.ecomm.cart.api.di.CartComponent
    public final e8c I0() {
        qcy<Object> qcyVar = f[1];
        return (e8c) this.b.c();
    }

    @Override // com.vk.ecomm.cart.api.di.CartComponent
    public final yxl J0() {
        qcy<Object> qcyVar = f[2];
        return (yxl) this.c.c();
    }

    @Override // com.vk.ecomm.cart.api.di.CartComponent
    public final sv9 S3() {
        qcy<Object> qcyVar = f[4];
        return (sv9) this.e.c();
    }

    @Override // com.vk.ecomm.cart.api.di.CartComponent
    public final f0p0 e8() {
        qcy<Object> qcyVar = f[3];
        return (f0p0) this.d.c();
    }

    @Override // com.vk.ecomm.cart.api.di.CartComponent
    public final fy9 f8() {
        qcy<Object> qcyVar = f[0];
        return (fy9) this.a.c();
    }
}
