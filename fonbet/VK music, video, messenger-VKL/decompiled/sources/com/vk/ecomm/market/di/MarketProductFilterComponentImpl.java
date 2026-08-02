package com.vk.ecomm.market.di;

import com.vk.di.component.DiUnscopedComponent;
import com.vk.ecomm.catalog.api.di.ClassifiedsComponent;
import com.vk.ecomm.market.api.filters.di.MarketProductFilterComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.de4;
import xsna.e7m;
import xsna.eb10;
import xsna.ep;
import xsna.ewy;
import xsna.fb10;
import xsna.fp;
import xsna.fpf0;
import xsna.hpf0;
import xsna.m2j;
import xsna.n1;
import xsna.nwy;
import xsna.qcy;
import xsna.vcr;

/* compiled from: MarketProductFilterComponentImpl.kt */
/* loaded from: classes18.dex */
public final class MarketProductFilterComponentImpl implements MarketProductFilterComponent {
    public static final /* synthetic */ qcy<Object>[] e;
    public final ClassifiedsComponent a;
    public final nwy b = new nwy(new n1(22));
    public final ewy c = new ewy(new m2j(this, 24));
    public final nwy d = new nwy(new de4(21));

    /* compiled from: MarketProductFilterComponentImpl.kt */
    public static final class a implements b7m<MarketProductFilterComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new MarketProductFilterComponentImpl((ClassifiedsComponent) e7mVar.a(fpf0.a(ClassifiedsComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(MarketProductFilterComponentImpl.class, "productFilters", "getProductFilters()Lcom/vk/ecomm/market/api/filters/MarketProductFilters;", 0);
        hpf0 hpf0Var = fpf0.a;
        e = new qcy[]{propertyReference1Impl, fp.c(0, MarketProductFilterComponentImpl.class, "router", "getRouter()Lcom/vk/ecomm/market/api/filters/MarketProductFiltersRouter;", hpf0Var), ep.a(0, MarketProductFilterComponentImpl.class, "marketFilterFieldsDelegateProvider", "getMarketFilterFieldsDelegateProvider()Lcom/vk/ecomm/market/api/filters/di/MarketFilterFieldsDelegateProvider;", hpf0Var)};
    }

    public MarketProductFilterComponentImpl(ClassifiedsComponent classifiedsComponent) {
        this.a = classifiedsComponent;
    }

    @Override // com.vk.ecomm.market.api.filters.di.MarketProductFilterComponent
    public final eb10<vcr<?>> T2() {
        qcy<Object> qcyVar = e[0];
        return (eb10) this.b.c();
    }

    @Override // com.vk.ecomm.market.api.filters.di.MarketProductFilterComponent
    public final fb10 a() {
        qcy<Object> qcyVar = e[1];
        return (fb10) this.c.c();
    }

    @Override // com.vk.ecomm.market.api.filters.di.MarketProductFilterComponent
    public final com.vk.ecomm.market.api.filters.di.a b4() {
        qcy<Object> qcyVar = e[2];
        return (com.vk.ecomm.market.api.filters.di.a) this.d.c();
    }
}
