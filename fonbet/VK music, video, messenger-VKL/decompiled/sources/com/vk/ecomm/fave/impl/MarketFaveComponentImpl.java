package com.vk.ecomm.fave.impl;

import com.vk.bridges.di.BridgeComponent;
import com.vk.di.component.DiUnscopedComponent;
import com.vk.ecomm.cart.api.di.CartComponent;
import com.vk.ecomm.catalog.api.di.ClassifiedsComponent;
import com.vk.ecomm.fave.api.di.MarketFaveComponent;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.e7m;
import xsna.ewy;
import xsna.fpf0;
import xsna.qcy;
import xsna.xrj;

/* compiled from: MarketFaveComponentImpl.kt */
/* loaded from: classes18.dex */
public final class MarketFaveComponentImpl implements MarketFaveComponent {
    public static final /* synthetic */ qcy<Object>[] g;
    public final CartComponent a;
    public final NewsFeedComponent b;
    public final BridgeComponent c;
    public final ClassifiedsComponent d;
    public final MarketComponent e;
    public final ewy f = new ewy(new xrj(this, 18));

    /* compiled from: MarketFaveComponentImpl.kt */
    public static final class a implements b7m<MarketFaveComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new MarketFaveComponentImpl((CartComponent) e7mVar.a(fpf0.a(CartComponent.class)), (NewsFeedComponent) e7mVar.a(fpf0.a(NewsFeedComponent.class)), (BridgeComponent) e7mVar.a(fpf0.a(BridgeComponent.class)), (ClassifiedsComponent) e7mVar.a(fpf0.a(ClassifiedsComponent.class)), (MarketComponent) e7mVar.a(fpf0.a(MarketComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(MarketFaveComponentImpl.class, "marketFaveInteractor", "getMarketFaveInteractor()Lcom/vk/ecomm/fave/api/di/MarketFaveInteractor;", 0);
        fpf0.a.getClass();
        g = new qcy[]{propertyReference1Impl};
    }

    public MarketFaveComponentImpl(CartComponent cartComponent, NewsFeedComponent newsFeedComponent, BridgeComponent bridgeComponent, ClassifiedsComponent classifiedsComponent, MarketComponent marketComponent) {
        this.a = cartComponent;
        this.b = newsFeedComponent;
        this.c = bridgeComponent;
        this.d = classifiedsComponent;
        this.e = marketComponent;
    }

    @Override // com.vk.ecomm.fave.api.di.MarketFaveComponent
    public final com.vk.ecomm.fave.api.di.a u1() {
        qcy<Object> qcyVar = g[0];
        return (com.vk.ecomm.fave.api.di.a) this.f.c();
    }
}
