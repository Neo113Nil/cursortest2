package com.vk.ecomm.cart.api.di;

import com.vk.movika.sdk.base.ui.g0;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.e8c;
import xsna.ek;
import xsna.ep;
import xsna.ewy;
import xsna.f0p0;
import xsna.fp;
import xsna.fpf0;
import xsna.fy9;
import xsna.hpf0;
import xsna.hy2;
import xsna.iy2;
import xsna.qcy;
import xsna.sv9;
import xsna.t61;
import xsna.yxl;

/* compiled from: CartComponent.kt */
/* loaded from: classes18.dex */
public final class CartComponent$Companion$STUB$1 implements CartComponent {
    public static final /* synthetic */ qcy<Object>[] f;
    public final ewy a = new ewy(new ek(3));
    public final ewy b = new ewy(new t61(7));
    public final ewy c = new ewy(new hy2(2));
    public final ewy d = new ewy(new g0(10));
    public final ewy e = new ewy(new iy2(8));

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(CartComponent$Companion$STUB$1.class, "cartRouter", "getCartRouter()Lcom/vk/ecomm/cart/api/router/CartRouter;", 0);
        hpf0 hpf0Var = fpf0.a;
        f = new qcy[]{propertyReference1Impl, fp.c(0, CartComponent$Companion$STUB$1.class, "checkoutRouter", "getCheckoutRouter()Lcom/vk/ecomm/cart/api/router/CheckoutRouter;", hpf0Var), ep.a(0, CartComponent$Companion$STUB$1.class, "deliveryPointsMapRouter", "getDeliveryPointsMapRouter()Lcom/vk/ecomm/cart/api/router/DeliveryPointsMapRouter;", hpf0Var), ep.a(0, CartComponent$Companion$STUB$1.class, "toDeliveryPointMapper", "getToDeliveryPointMapper()Lcom/vk/ecomm/cart/api/model/map/ToDeliveryPointMapper;", hpf0Var), ep.a(0, CartComponent$Companion$STUB$1.class, "cartAmountErrorHandler", "getCartAmountErrorHandler()Lcom/vk/ecomm/cart/api/utils/CartAmountErrorHandler;", hpf0Var)};
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
