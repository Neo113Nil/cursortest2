package com.vk.ecomm.market.impl.ctabutton.di;

import com.vk.bridges.di.BridgeComponent;
import com.vk.di.component.DiScopedComponent;
import com.vk.ecomm.cart.api.di.CartComponent;
import com.vk.ecomm.market.api.ctabutton.di.ProductTileCtaButtonComponent;
import com.vk.ecomm.market.api.di.MarketComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.ewy;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.isd0;
import xsna.ksd0;
import xsna.pwj0;
import xsna.qcy;
import xsna.uv0;
import xsna.vv20;

/* compiled from: ProductTileCtaButtonComponentImpl.kt */
/* loaded from: classes18.dex */
public final class ProductTileCtaButtonComponentImpl implements ProductTileCtaButtonComponent {
    public static final /* synthetic */ qcy<Object>[] f = {new PropertyReference1Impl(ProductTileCtaButtonComponentImpl.class, "ctaButtonConfigFactory", "getCtaButtonConfigFactory()Lcom/vk/ecomm/market/api/ctabutton/ProductTileCtaButtonConfigFactory;", 0), fp.c(0, ProductTileCtaButtonComponentImpl.class, "ctaButtonDelegate", "getCtaButtonDelegate()Lcom/vk/ecomm/market/api/ctabutton/ProductTileCtaButtonDelegate;", fpf0.a)};
    public final CartComponent a;
    public final BridgeComponent b;
    public final MarketComponent c;
    public final ewy d = new ewy(new uv0(28));
    public final ewy e = new ewy(new vv20(this, 18));

    /* compiled from: ProductTileCtaButtonComponentImpl.kt */
    public static final class a implements c8m<ProductTileCtaButtonComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new ProductTileCtaButtonComponentImpl((CartComponent) g8mVar.a(fpf0.a(CartComponent.class)), (BridgeComponent) g8mVar.a(fpf0.a(BridgeComponent.class)), (MarketComponent) g8mVar.a(fpf0.a(MarketComponent.class)));
        }
    }

    public ProductTileCtaButtonComponentImpl(CartComponent cartComponent, BridgeComponent bridgeComponent, MarketComponent marketComponent) {
        this.a = cartComponent;
        this.b = bridgeComponent;
        this.c = marketComponent;
    }

    @Override // com.vk.ecomm.market.api.ctabutton.di.ProductTileCtaButtonComponent
    public final isd0 W5() {
        qcy<Object> qcyVar = f[0];
        return (isd0) this.d.c();
    }

    @Override // com.vk.ecomm.market.api.ctabutton.di.ProductTileCtaButtonComponent
    public final ksd0 v6() {
        qcy<Object> qcyVar = f[1];
        return (ksd0) this.e.c();
    }
}
