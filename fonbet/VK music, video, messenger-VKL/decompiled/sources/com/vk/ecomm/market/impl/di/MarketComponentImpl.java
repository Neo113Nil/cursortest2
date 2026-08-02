package com.vk.ecomm.market.impl.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.im.chat.api.ChatComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.bky;
import xsna.c8m;
import xsna.cz00;
import xsna.dr6;
import xsna.dw9;
import xsna.ep;
import xsna.ewy;
import xsna.fp;
import xsna.fpf0;
import xsna.fr6;
import xsna.fy00;
import xsna.g8m;
import xsna.gb3;
import xsna.hpf0;
import xsna.hy6;
import xsna.ib3;
import xsna.iw00;
import xsna.kw00;
import xsna.kz00;
import xsna.lt00;
import xsna.mn8;
import xsna.n08;
import xsna.nwy;
import xsna.pwj0;
import xsna.q9h;
import xsna.qcy;
import xsna.sw1;
import xsna.sw9;
import xsna.sz00;
import xsna.y110;

/* compiled from: MarketComponentImpl.kt */
/* loaded from: classes.dex */
public final class MarketComponentImpl implements MarketComponent {
    public static final /* synthetic */ qcy<Object>[] l;
    public final ChatComponent a;
    public final nwy b = new nwy(new sw1(11));
    public final ewy c = new ewy(new dr6(5));
    public final ewy d = new ewy(new gb3(this, 8));
    public final ewy e = new ewy(new fr6(6));
    public final nwy f = new nwy(new hy6(this, 7));
    public final ewy g = new ewy(new dw9(3));
    public final ewy h = new ewy(new ib3(5));
    public final ewy i = new ewy(new mn8(3));
    public final nwy j = new nwy(new bky(this, 1));
    public final nwy k = new nwy(new iw00(this, 0));

    /* compiled from: MarketComponentImpl.kt */
    public static final class a implements c8m<MarketComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new MarketComponentImpl((ChatComponent) g8mVar.a(fpf0.a(ChatComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(MarketComponentImpl.class, "marketBus", "getMarketBus()Lcom/vk/ecomm/market/api/bus/MarketEventBus;", 0);
        hpf0 hpf0Var = fpf0.a;
        l = new qcy[]{propertyReference1Impl, fp.c(0, MarketComponentImpl.class, "marketItemLinkCreator", "getMarketItemLinkCreator()Lcom/vk/ecomm/market/api/link/MarketItemLinkCreator;", hpf0Var), ep.a(0, MarketComponentImpl.class, "marketGoodRouter", "getMarketGoodRouter()Lcom/vk/ecomm/market/api/good/router/MarketGoodRouter;", hpf0Var), ep.a(0, MarketComponentImpl.class, "marketGoodDialogsRouter", "getMarketGoodDialogsRouter()Lcom/vk/ecomm/market/api/good/router/MarketGoodDialogsRouter;", hpf0Var), ep.a(0, MarketComponentImpl.class, "marketCountersManager", "getMarketCountersManager()Lcom/vk/ecomm/market/api/counters/MarketCountersManager;", hpf0Var), ep.a(0, MarketComponentImpl.class, "marketFiltersDelegate", "getMarketFiltersDelegate()Lcom/vk/ecomm/market/api/search/filters/MarketFiltersDelegate;", hpf0Var), ep.a(0, MarketComponentImpl.class, "marketAnalytics", "getMarketAnalytics()Lcom/vk/ecomm/market/api/analytics/MarketAnalytics;", hpf0Var), ep.a(0, MarketComponentImpl.class, "communityMarketRouter", "getCommunityMarketRouter()Lcom/vk/ecomm/market/api/community/CommunityMarketRouter;", hpf0Var), ep.a(0, MarketComponentImpl.class, "bookmarksManagerFactory", "getBookmarksManagerFactory()Lcom/vk/ecomm/market/api/bookmarks/BookmarksManagerFactory;", hpf0Var), ep.a(0, MarketComponentImpl.class, "cartEventsManagerFactory", "getCartEventsManagerFactory()Lcom/vk/ecomm/market/cartevents/CartEventsManagerFactoryImpl;", hpf0Var)};
    }

    public MarketComponentImpl(ChatComponent chatComponent) {
        this.a = chatComponent;
    }

    @Override // com.vk.ecomm.market.api.di.MarketComponent
    public final q9h C3() {
        qcy<Object> qcyVar = l[7];
        return (q9h) this.i.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.ecomm.market.api.di.MarketComponent
    public final sw9 I1() {
        qcy<Object> qcyVar = l[9];
        return (sw9) this.k.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.ecomm.market.api.di.MarketComponent
    public final y110 I8() {
        qcy<Object> qcyVar = l[1];
        return (y110) this.c.c();
    }

    @Override // com.vk.ecomm.market.api.di.MarketComponent
    public final sz00 Ob() {
        qcy<Object> qcyVar = l[2];
        return (sz00) this.d.c();
    }

    @Override // com.vk.ecomm.market.api.di.MarketComponent
    public final fy00 U1() {
        qcy<Object> qcyVar = l[0];
        return (fy00) this.b.c();
    }

    @Override // com.vk.ecomm.market.api.di.MarketComponent
    public final kw00 Y4() {
        qcy<Object> qcyVar = l[4];
        return (kw00) this.f.c();
    }

    @Override // com.vk.ecomm.market.api.di.MarketComponent
    public final cz00 Z0() {
        qcy<Object> qcyVar = l[5];
        return (cz00) this.g.c();
    }

    @Override // com.vk.ecomm.market.api.di.MarketComponent
    public final lt00 l7() {
        qcy<Object> qcyVar = l[6];
        return (lt00) this.h.c();
    }

    @Override // com.vk.ecomm.market.api.di.MarketComponent
    public final n08 lc() {
        qcy<Object> qcyVar = l[8];
        return (n08) this.j.c();
    }

    @Override // com.vk.ecomm.market.api.di.MarketComponent
    public final kz00 rc() {
        qcy<Object> qcyVar = l[3];
        return (kz00) this.e.c();
    }
}
