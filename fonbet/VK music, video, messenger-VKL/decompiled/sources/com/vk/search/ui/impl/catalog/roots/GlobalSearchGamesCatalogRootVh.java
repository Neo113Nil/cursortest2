package com.vk.search.ui.impl.catalog.roots;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.vk.catalog2.common.dto.api.search.CatalogGetSearchGamesRequestFactory;
import com.vk.catalog2.common.ui.holders.search.SearchResultsVh;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchResultsImplVh;
import com.vk.search.ui.api.SearchInputMethod;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import io.reactivex.rxjava3.disposables.b;
import io.reactivex.rxjava3.disposables.c;
import xsna.cfp0;
import xsna.i22;
import xsna.o5a;
import xsna.ozh;
import xsna.q3a;
import xsna.yf3;

/* compiled from: GlobalSearchGamesCatalogRootVh.kt */
/* loaded from: classes5.dex */
public final class GlobalSearchGamesCatalogRootVh extends GlobalSearchCatalogRootVh {
    public final SearchResultsImplVh A;
    public final CatalogGetSearchGamesRequestFactory x;
    public final b y;
    public final yf3 z;

    public GlobalSearchGamesCatalogRootVh() {
        throw null;
    }

    public GlobalSearchGamesCatalogRootVh(Bundle bundle, FragmentActivity fragmentActivity, o5a o5aVar) {
        super(bundle, fragmentActivity, o5aVar, null);
        CatalogGetSearchGamesRequestFactory catalogGetSearchGamesRequestFactory = new CatalogGetSearchGamesRequestFactory(this.m.b.s.N(), CatalogGetSearchGamesRequestFactory.SearchGamesEntrypoint.GlobalSearchTab);
        this.x = catalogGetSearchGamesRequestFactory;
        this.y = new b();
        this.z = new yf3();
        this.A = i0(this.m, catalogGetSearchGamesRequestFactory, true, null);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void S(cfp0 cfp0Var) {
        com.vk.catalog2.common.ui.holders.search.b.a(com.vk.catalog2.common.ui.holders.search.b.a, cfp0Var.a, cfp0Var.b, false, null, 20);
    }

    @Override // com.vk.search.ui.impl.catalog.roots.GlobalSearchCatalogRootVh, com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void Y() {
        this.y.e();
        super.Y();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final c h0(q3a q3aVar) {
        return q3aVar.a().subscribe(new i22(new ozh(this, 19), 25));
    }

    @Override // com.vk.search.ui.impl.catalog.roots.GlobalSearchCatalogRootVh
    public final SearchResultsVh j0() {
        return this.A;
    }

    @Override // com.vk.search.ui.impl.catalog.roots.GlobalSearchCatalogRootVh
    public final MobileOfficialAppsCoreNavStat$EventScreen k0() {
        return MobileOfficialAppsCoreNavStat$EventScreen.SEARCH_GAMES;
    }

    @Override // com.vk.search.ui.impl.catalog.roots.GlobalSearchCatalogRootVh
    public final void n0(SearchInputMethod searchInputMethod) {
        this.x.o(searchInputMethod);
    }
}
