package com.vk.search.ui.impl.catalog.roots.apps;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.vk.catalog2.common.dto.api.search.CatalogGetSearchMiniAppsRequestFactory;
import com.vk.catalog2.common.ui.holders.search.SearchResultsVh;
import com.vk.catalog2.common.ui.holders.search.b;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchResultsImplVh;
import com.vk.search.ui.api.SearchInputMethod;
import com.vk.search.ui.impl.catalog.roots.GlobalSearchCatalogRootVh;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import io.reactivex.rxjava3.disposables.c;
import xsna.bpn0;
import xsna.cfp0;
import xsna.ho1;
import xsna.jb;
import xsna.o5a;
import xsna.pr6;
import xsna.q3a;
import xsna.r9k;

/* compiled from: GlobalSearchMiniappsCatalogRootVh.kt */
/* loaded from: classes5.dex */
public final class GlobalSearchMiniappsCatalogRootVh extends GlobalSearchCatalogRootVh {
    public static final /* synthetic */ int B = 0;
    public final SearchResultsImplVh A;
    public final CatalogGetSearchMiniAppsRequestFactory x;
    public final bpn0 y;
    public final bpn0 z;

    public GlobalSearchMiniappsCatalogRootVh() {
        throw null;
    }

    public GlobalSearchMiniappsCatalogRootVh(Bundle bundle, FragmentActivity fragmentActivity, o5a o5aVar) {
        super(bundle, fragmentActivity, o5aVar, null);
        CatalogGetSearchMiniAppsRequestFactory catalogGetSearchMiniAppsRequestFactory = new CatalogGetSearchMiniAppsRequestFactory(this.m.b.s.N(), CatalogGetSearchMiniAppsRequestFactory.SearchMiniAppsEntrypoint.GlobalSearchTab);
        this.x = catalogGetSearchMiniAppsRequestFactory;
        this.y = new bpn0(new jb(16));
        this.z = new bpn0(new pr6(14));
        this.A = i0(this.m, catalogGetSearchMiniAppsRequestFactory, true, null);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void S(cfp0 cfp0Var) {
        b.a(b.a, cfp0Var.a, cfp0Var.b, false, null, 20);
    }

    @Override // com.vk.search.ui.impl.catalog.roots.GlobalSearchCatalogRootVh, com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void Y() {
        ((io.reactivex.rxjava3.disposables.b) this.z.getValue()).e();
        super.Y();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final c h0(q3a q3aVar) {
        return q3aVar.a().subscribe(new ho1(new r9k(this, 15), 25));
    }

    @Override // com.vk.search.ui.impl.catalog.roots.GlobalSearchCatalogRootVh
    public final SearchResultsVh j0() {
        return this.A;
    }

    @Override // com.vk.search.ui.impl.catalog.roots.GlobalSearchCatalogRootVh
    public final MobileOfficialAppsCoreNavStat$EventScreen k0() {
        return MobileOfficialAppsCoreNavStat$EventScreen.SEARCH_MINI_APPS;
    }

    @Override // com.vk.search.ui.impl.catalog.roots.GlobalSearchCatalogRootVh
    public final void n0(SearchInputMethod searchInputMethod) {
        this.x.o(searchInputMethod);
    }
}
