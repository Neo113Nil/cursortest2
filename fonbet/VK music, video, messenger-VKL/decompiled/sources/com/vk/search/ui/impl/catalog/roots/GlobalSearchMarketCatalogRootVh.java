package com.vk.search.ui.impl.catalog.roots;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.vk.catalog2.common.dto.api.search.CatalogGetMarketSearchRequestFactory;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.market.UIBlockMarketItem;
import com.vk.catalog2.common.ui.holders.search.SearchResultsVh;
import com.vk.catalog2.common.ui.holders.search.b;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchResultsImplVh;
import com.vk.dto.fave.MarketFavable;
import com.vk.ecomm.api.analytics.MarketAnalyticsParams;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.ecomm.storefront.api.di.StorefrontComponent;
import com.vk.search.params.api.SearchParams;
import com.vk.search.params.api.VkMarketSearchParams;
import com.vk.search.ui.api.SearchInputMethod;
import com.vk.search.ui.impl.catalog.GlobalSearchMarketCatalogFragment;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import io.reactivex.rxjava3.internal.operators.observable.j1;
import io.reactivex.rxjava3.subjects.f;
import kotlin.Lazy;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.b5a;
import xsna.cfp0;
import xsna.cq6;
import xsna.d2u;
import xsna.drg;
import xsna.e2u;
import xsna.f5z;
import xsna.ff3;
import xsna.fpf0;
import xsna.gmq;
import xsna.h60;
import xsna.hg1;
import xsna.hwg0;
import xsna.izs;
import xsna.jru0;
import xsna.k7m;
import xsna.ksd0;
import xsna.kwg0;
import xsna.l3a;
import xsna.m3a;
import xsna.m7m;
import xsna.o5a;
import xsna.omf;
import xsna.orp;
import xsna.pgc;
import xsna.q3a;
import xsna.q530;
import xsna.s3q0;
import xsna.u0a;
import xsna.u4a;
import xsna.up2;
import xsna.wqf;
import xsna.y710;
import xsna.zfc;

/* compiled from: GlobalSearchMarketCatalogRootVh.kt */
/* loaded from: classes5.dex */
public final class GlobalSearchMarketCatalogRootVh extends GlobalSearchWithParamsCatalogRootVh {
    public final CatalogGetMarketSearchRequestFactory F;
    public final SearchResultsImplVh G;
    public final d2u H;
    public final zfc I;

    /* compiled from: GlobalSearchMarketCatalogRootVh.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<l3a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(l3a l3aVar) {
            ((zfc) this.receiver).a(l3aVar);
            return s3q0.a;
        }
    }

    public GlobalSearchMarketCatalogRootVh() {
        throw null;
    }

    public GlobalSearchMarketCatalogRootVh(Bundle bundle, FragmentActivity fragmentActivity, o5a o5aVar, GlobalSearchMarketCatalogFragment globalSearchMarketCatalogFragment) {
        super(bundle, fragmentActivity, o5aVar, globalSearchMarketCatalogFragment);
        CatalogGetMarketSearchRequestFactory catalogGetMarketSearchRequestFactory = new CatalogGetMarketSearchRequestFactory(this.m.b.s.N(), CatalogGetMarketSearchRequestFactory.SearchMarketEntrypoint.GlobalSearchTab, 4);
        this.F = catalogGetMarketSearchRequestFactory;
        this.G = i0(this.m, catalogGetMarketSearchRequestFactory, true, null);
        this.H = new d2u(((MarketComponent) ((k7m) m7m.f(this)).a(fpf0.a(MarketComponent.class))).l7());
        u4a.a aVar = this.m.b;
        b5a b5aVar = aVar.f;
        q3a q3aVar = aVar.e;
        Lazy<ksd0> lazy = aVar.N;
        this.I = new zfc(b5aVar, q3aVar, lazy != null ? lazy.getValue() : null, fragmentActivity, (MarketAnalyticsParams) null, ((MarketComponent) ((k7m) m7m.f(this)).a(fpf0.a(MarketComponent.class))).Ob(), new e2u(catalogGetMarketSearchRequestFactory, new cq6(0, this, GlobalSearchMarketCatalogRootVh.class, "getStatEventScreen", "getStatEventScreen()Lcom/vk/stat/scheme/MobileOfficialAppsCoreNavStat$EventScreen;", 0, 3)), new wqf(this, 24), ((MarketComponent) ((k7m) m7m.f(this)).a(fpf0.a(MarketComponent.class))).C3(), ((StorefrontComponent) ((k7m) m7m.f(this)).a(fpf0.a(StorefrontComponent.class))).a());
    }

    @Override // com.vk.search.ui.impl.catalog.roots.GlobalSearchCatalogRootVh, com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final orp Q() {
        f5z f5zVar = this.d;
        if (f5zVar == null) {
            return null;
        }
        y710 y710Var = new y710(new drg(this, 19));
        q530 e = up2.e(y710Var, this.b, f5zVar, false);
        e.d(y710Var);
        return new pgc(e);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void S(cfp0 cfp0Var) {
        d2u d2uVar = this.H;
        b.a(d2uVar.a, cfp0Var.a, cfp0Var.b, false, null, 28);
        Object obj = cfp0Var.b;
        if (obj instanceof UIBlockMarketItem.b) {
            UIBlock uIBlock = cfp0Var.a;
            UIBlockMarketItem uIBlockMarketItem = uIBlock instanceof UIBlockMarketItem ? (UIBlockMarketItem) uIBlock : null;
            if (uIBlockMarketItem == null) {
                return;
            }
            UIBlockMarketItem.b bVar = (UIBlockMarketItem.b) obj;
            gmq gmqVar = bVar.a;
            MarketFavable marketFavable = gmqVar instanceof MarketFavable ? (MarketFavable) gmqVar : null;
            if (marketFavable == null) {
                return;
            }
            d2uVar.b.d(marketFavable, CommonMarketStat$TypeRefSource.SEARCH_GOODS, bVar.b, uIBlockMarketItem.y.d0);
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final c f0(m3a m3aVar) {
        f fVar = (f) m3aVar.b;
        h60 h60Var = new h60(new a(1, this.I, zfc.class, "handleCatalogClickEvent", "handleCatalogClickEvent(Lcom/vk/catalog2/common/ui/core/events/click/CatalogClickEvent;)V", 0), 26);
        int i = kwg0.a;
        return fVar.subscribe(h60Var, new hwg0());
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final c g0(b5a b5aVar) {
        f<u0a> fVar = b5aVar.a;
        hg1.q1 q1Var = new hg1.q1();
        fVar.getClass();
        j1 U = new i0(fVar, q1Var).U(new hg1.p1());
        ff3 ff3Var = new ff3(new omf(this, 21), 16);
        int i = kwg0.a;
        return U.subscribe(ff3Var, new hwg0());
    }

    @Override // com.vk.search.ui.impl.catalog.roots.GlobalSearchCatalogRootVh
    public final SearchResultsVh j0() {
        return this.G;
    }

    @Override // com.vk.search.ui.impl.catalog.roots.GlobalSearchCatalogRootVh
    public final MobileOfficialAppsCoreNavStat$EventScreen k0() {
        return MobileOfficialAppsCoreNavStat$EventScreen.SEARCH_MARKET;
    }

    @Override // com.vk.search.ui.impl.catalog.roots.GlobalSearchCatalogRootVh
    public final void n0(SearchInputMethod searchInputMethod) {
        this.F.o(searchInputMethod);
    }

    @Override // com.vk.search.ui.impl.catalog.roots.GlobalSearchWithParamsCatalogRootVh
    public final Object o0() {
        SearchParams searchParams = this.y;
        VkMarketSearchParams vkMarketSearchParams = searchParams instanceof VkMarketSearchParams ? (VkMarketSearchParams) searchParams : null;
        if (vkMarketSearchParams == null) {
            return s3q0.a;
        }
        VkMarketSearchParams vkMarketSearchParams2 = new VkMarketSearchParams();
        vkMarketSearchParams2.h5(vkMarketSearchParams);
        vkMarketSearchParams2.reset();
        return new jru0(vkMarketSearchParams2);
    }
}
