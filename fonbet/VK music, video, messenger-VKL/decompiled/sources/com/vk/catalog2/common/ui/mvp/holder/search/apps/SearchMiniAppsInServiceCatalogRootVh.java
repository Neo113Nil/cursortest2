package com.vk.catalog2.common.ui.mvp.holder.search.apps;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.vk.catalog2.common.dto.api.search.CatalogGetSearchMiniAppsRequestFactory;
import com.vk.catalog2.common.ui.holders.search.CommonSearchResultsVh;
import com.vk.catalog2.common.ui.holders.search.b;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchFeatureCatalogRootVh;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchFeatureResultsVh;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import io.reactivex.rxjava3.disposables.c;
import xsna.a8v;
import xsna.bpn0;
import xsna.cfp0;
import xsna.cu1;
import xsna.hyh0;
import xsna.o5a;
import xsna.q3a;
import xsna.vg0;
import xsna.z6f0;
import xsna.zqh0;

/* compiled from: SearchMiniAppsInServiceCatalogRootVh.kt */
/* loaded from: classes16.dex */
public final class SearchMiniAppsInServiceCatalogRootVh extends SearchFeatureCatalogRootVh {
    public final bpn0 u;
    public final bpn0 v;
    public final SearchFeatureResultsVh w;

    public SearchMiniAppsInServiceCatalogRootVh(Bundle bundle, FragmentActivity fragmentActivity, o5a o5aVar, zqh0 zqh0Var, hyh0.c cVar) {
        super(bundle, fragmentActivity, o5aVar, zqh0Var, cVar);
        CatalogGetSearchMiniAppsRequestFactory catalogGetSearchMiniAppsRequestFactory = new CatalogGetSearchMiniAppsRequestFactory(this.m.b.s.N(), CatalogGetSearchMiniAppsRequestFactory.SearchMiniAppsEntrypoint.SearchInService);
        this.u = new bpn0(new vg0(29));
        this.v = new bpn0(new cu1(29));
        this.w = i0(this.m, catalogGetSearchMiniAppsRequestFactory);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void S(cfp0 cfp0Var) {
        b.a(b.a, cfp0Var.a, cfp0Var.b, false, null, 20);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.search.SearchFeatureCatalogRootVh, com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void Y() {
        ((io.reactivex.rxjava3.disposables.b) this.v.getValue()).e();
        super.Y();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final c h0(q3a q3aVar) {
        return q3aVar.a().subscribe(new a8v(new z6f0(this, 6), 16));
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.search.SearchFeatureCatalogRootVh
    public final CommonSearchResultsVh j0() {
        return this.w;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.search.SearchFeatureCatalogRootVh
    public final MobileOfficialAppsCoreNavStat$EventScreen k0() {
        return MobileOfficialAppsCoreNavStat$EventScreen.SEARCH_MINI_APPS;
    }
}
