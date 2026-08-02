package com.vk.ecomm.market.web.di;

import com.vk.di.component.DiUnscopedComponent;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.ecomm.market.api.web.di.MarketWebComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.cnh;
import xsna.e7m;
import xsna.ewy;
import xsna.fpf0;
import xsna.m8q0;
import xsna.qcy;

/* compiled from: MarketWebComponentImpl.kt */
/* loaded from: classes18.dex */
public final class MarketWebComponentImpl implements MarketWebComponent {
    public static final /* synthetic */ qcy<Object>[] c;
    public final MarketComponent a;
    public final ewy b = new ewy(new cnh(this, 20));

    /* compiled from: MarketWebComponentImpl.kt */
    public static final class a implements b7m<MarketWebComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new MarketWebComponentImpl((MarketComponent) e7mVar.a(fpf0.a(MarketComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(MarketWebComponentImpl.class, "updateMarketItemCommandHandler", "getUpdateMarketItemCommandHandler()Lcom/vk/ecomm/market/api/web/UpdateMarketItemCommandHandler;", 0);
        fpf0.a.getClass();
        c = new qcy[]{propertyReference1Impl};
    }

    public MarketWebComponentImpl(MarketComponent marketComponent) {
        this.a = marketComponent;
    }

    @Override // com.vk.ecomm.market.api.web.di.MarketWebComponent
    public final m8q0 gc() {
        qcy<Object> qcyVar = c[0];
        return (m8q0) this.b.c();
    }
}
