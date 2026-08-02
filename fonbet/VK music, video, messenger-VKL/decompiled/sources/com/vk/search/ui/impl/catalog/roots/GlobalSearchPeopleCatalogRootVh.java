package com.vk.search.ui.impl.catalog.roots;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.vk.catalog2.common.dto.api.search.CatalogGetPeopleSearchRequestFactory;
import com.vk.catalog2.common.ui.holders.search.SearchResultsVh;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchResultsImplVh;
import com.vk.search.params.api.SearchParams;
import com.vk.search.params.api.VkPeopleSearchParams;
import com.vk.search.ui.api.SearchInputMethod;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import io.reactivex.rxjava3.disposables.b;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.subjects.f;
import xsna.bg1;
import xsna.cfp0;
import xsna.fgh;
import xsna.gn0;
import xsna.m3a;
import xsna.mru0;
import xsna.o5a;
import xsna.q3a;
import xsna.qcl;
import xsna.qyh0;
import xsna.s3q0;

/* compiled from: GlobalSearchPeopleCatalogRootVh.kt */
/* loaded from: classes5.dex */
public final class GlobalSearchPeopleCatalogRootVh extends GlobalSearchWithParamsCatalogRootVh {
    public final CatalogGetPeopleSearchRequestFactory F;
    public final SearchResultsImplVh G;
    public final b H;
    public final qyh0 I;

    public GlobalSearchPeopleCatalogRootVh() {
        throw null;
    }

    public GlobalSearchPeopleCatalogRootVh(Bundle bundle, FragmentActivity fragmentActivity, o5a o5aVar) {
        super(bundle, fragmentActivity, o5aVar, null);
        CatalogGetPeopleSearchRequestFactory catalogGetPeopleSearchRequestFactory = new CatalogGetPeopleSearchRequestFactory(this.m.b.s.N(), CatalogGetPeopleSearchRequestFactory.SearchPeopleEntrypoint.GlobalSearchTab, null, null, null, 28);
        this.F = catalogGetPeopleSearchRequestFactory;
        this.G = i0(this.m, catalogGetPeopleSearchRequestFactory, true, null);
        this.H = new b();
        this.I = new qyh0();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void S(cfp0 cfp0Var) {
        com.vk.catalog2.common.ui.holders.search.b.a(com.vk.catalog2.common.ui.holders.search.b.a, cfp0Var.a, cfp0Var.b, false, null, 28);
    }

    @Override // com.vk.search.ui.impl.catalog.roots.GlobalSearchCatalogRootVh, com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void Y() {
        this.H.e();
        super.Y();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final c f0(m3a m3aVar) {
        return ((f) m3aVar.b).subscribe(new gn0(new qcl(this, 16), 24));
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final c h0(q3a q3aVar) {
        return q3aVar.a().subscribe(new bg1(new fgh(this, 18), 27));
    }

    @Override // com.vk.search.ui.impl.catalog.roots.GlobalSearchCatalogRootVh
    public final SearchResultsVh j0() {
        return this.G;
    }

    @Override // com.vk.search.ui.impl.catalog.roots.GlobalSearchCatalogRootVh
    public final MobileOfficialAppsCoreNavStat$EventScreen k0() {
        return MobileOfficialAppsCoreNavStat$EventScreen.SEARCH_PEOPLE;
    }

    @Override // com.vk.search.ui.impl.catalog.roots.GlobalSearchCatalogRootVh
    public final void n0(SearchInputMethod searchInputMethod) {
        this.F.o(searchInputMethod);
    }

    @Override // com.vk.search.ui.impl.catalog.roots.GlobalSearchWithParamsCatalogRootVh
    public final Object o0() {
        SearchParams searchParams = this.y;
        VkPeopleSearchParams vkPeopleSearchParams = searchParams instanceof VkPeopleSearchParams ? (VkPeopleSearchParams) searchParams : null;
        if (vkPeopleSearchParams == null) {
            return s3q0.a;
        }
        VkPeopleSearchParams copy = vkPeopleSearchParams.copy();
        copy.reset();
        return new mru0(copy, true);
    }
}
