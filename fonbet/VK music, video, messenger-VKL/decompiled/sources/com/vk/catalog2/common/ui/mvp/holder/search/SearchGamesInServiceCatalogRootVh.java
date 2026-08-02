package com.vk.catalog2.common.ui.mvp.holder.search;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.vk.catalog2.common.dto.api.search.CatalogGetSearchGamesRequestFactory;
import com.vk.catalog2.common.ui.holders.search.CommonSearchResultsVh;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import xsna.cfp0;
import xsna.hyh0;
import xsna.m3a;
import xsna.o5a;
import xsna.zqh0;

/* compiled from: SearchGamesInServiceCatalogRootVh.kt */
/* loaded from: classes16.dex */
public final class SearchGamesInServiceCatalogRootVh extends SearchFeatureCatalogRootVh {
    public final SearchFeatureResultsVh u;

    public SearchGamesInServiceCatalogRootVh(Bundle bundle, FragmentActivity fragmentActivity, o5a o5aVar, zqh0 zqh0Var, hyh0.a aVar) {
        super(bundle, fragmentActivity, o5aVar, zqh0Var, aVar);
        this.u = i0(this.m, new CatalogGetSearchGamesRequestFactory(this.m.b.s.N(), CatalogGetSearchGamesRequestFactory.SearchGamesEntrypoint.SearchInService));
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void S(cfp0 cfp0Var) {
        com.vk.catalog2.common.ui.holders.search.b.a(com.vk.catalog2.common.ui.holders.search.b.a, cfp0Var.a, cfp0Var.b, false, null, 20);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final io.reactivex.rxjava3.disposables.c f0(m3a m3aVar) {
        return new io.reactivex.rxjava3.disposables.b(EmptyDisposable.INSTANCE);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.search.SearchFeatureCatalogRootVh
    public final CommonSearchResultsVh j0() {
        return this.u;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.search.SearchFeatureCatalogRootVh
    public final MobileOfficialAppsCoreNavStat$EventScreen k0() {
        return MobileOfficialAppsCoreNavStat$EventScreen.SEARCH_GAMES;
    }
}
