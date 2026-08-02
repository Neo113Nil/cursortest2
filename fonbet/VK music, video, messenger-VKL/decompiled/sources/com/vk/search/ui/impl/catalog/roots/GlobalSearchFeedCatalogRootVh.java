package com.vk.search.ui.impl.catalog.roots;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockSearchSuggestion;
import com.vk.catalog2.common.ui.holders.search.SearchResultsVh;
import com.vk.catalog2.common.ui.holders.search.b;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchResultsImplVh;
import com.vk.dto.music.SearchSuggestion;
import com.vk.search.params.api.SearchParams;
import com.vk.search.params.api.VkFeedSearchParams;
import com.vk.search.ui.api.SearchInputMethod;
import com.vk.search.ui.impl.catalog.feed.CatalogGetSearchStatusesRequestFactory;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.bru0;
import xsna.cfp0;
import xsna.cqm0;
import xsna.l63;
import xsna.m4r;
import xsna.msy;
import xsna.o5a;
import xsna.s3q0;
import xsna.uxh0;
import xsna.wda;
import xsna.xxf0;
import xsna.yve;

/* compiled from: GlobalSearchFeedCatalogRootVh.kt */
/* loaded from: classes5.dex */
public final class GlobalSearchFeedCatalogRootVh extends GlobalSearchWithParamsCatalogRootVh {
    public static final /* synthetic */ int I = 0;
    public final CatalogGetSearchStatusesRequestFactory F;
    public final Object G;
    public final SearchResultsImplVh H;

    public GlobalSearchFeedCatalogRootVh() {
        throw null;
    }

    public GlobalSearchFeedCatalogRootVh(Bundle bundle, FragmentActivity fragmentActivity, o5a o5aVar) {
        super(bundle, fragmentActivity, o5aVar, null);
        CatalogGetSearchStatusesRequestFactory catalogGetSearchStatusesRequestFactory = new CatalogGetSearchStatusesRequestFactory(this.m.b.s.N(), CatalogGetSearchStatusesRequestFactory.SearchFeedEntrypoint.GlobalSearchTab, 4);
        this.F = catalogGetSearchStatusesRequestFactory;
        this.G = msy.a(LazyThreadSafetyMode.NONE, new l63(16));
        this.H = i0(this.m, catalogGetSearchStatusesRequestFactory, true, null);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void S(cfp0 cfp0Var) {
        b.a(b.a, cfp0Var.a, cfp0Var.b, false, null, 28);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.search.ui.impl.catalog.roots.GlobalSearchWithParamsCatalogRootVh, com.vk.search.ui.impl.catalog.roots.GlobalSearchCatalogRootVh, com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View X = super.X(layoutInflater, viewGroup, null);
        ((m4r) this.G.getValue()).getClass();
        m4r.a(this.H, this.m);
        return X;
    }

    @Override // com.vk.search.ui.impl.catalog.roots.GlobalSearchCatalogRootVh
    public final SearchResultsVh j0() {
        return this.H;
    }

    @Override // com.vk.search.ui.impl.catalog.roots.GlobalSearchCatalogRootVh
    public final MobileOfficialAppsCoreNavStat$EventScreen k0() {
        return MobileOfficialAppsCoreNavStat$EventScreen.SEARCH_NEWS;
    }

    @Override // com.vk.search.ui.impl.catalog.roots.GlobalSearchCatalogRootVh
    public final void n0(SearchInputMethod searchInputMethod) {
        this.F.o(searchInputMethod);
    }

    @Override // com.vk.search.ui.impl.catalog.roots.GlobalSearchWithParamsCatalogRootVh
    public final Object o0() {
        SearchParams searchParams = this.y;
        VkFeedSearchParams vkFeedSearchParams = searchParams instanceof VkFeedSearchParams ? (VkFeedSearchParams) searchParams : null;
        if (vkFeedSearchParams == null) {
            return s3q0.a;
        }
        VkFeedSearchParams copy = vkFeedSearchParams.copy();
        copy.reset();
        return new bru0(copy);
    }

    @Override // com.vk.search.ui.impl.catalog.roots.GlobalSearchCatalogRootVh, com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void onPause() {
        this.H.onPause();
    }

    @Override // com.vk.search.ui.impl.catalog.roots.GlobalSearchCatalogRootVh, com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void onResume() {
        this.H.onResume();
    }

    @Override // com.vk.search.ui.impl.catalog.roots.GlobalSearchCatalogRootVh, xsna.mba
    public final void z(int i, UIBlock uIBlock) {
        if (i != R.id.search_suggestion) {
            if (i == R.id.search_suggestion_close) {
                UIBlockSearchSuggestion uIBlockSearchSuggestion = uIBlock instanceof UIBlockSearchSuggestion ? (UIBlockSearchSuggestion) uIBlock : null;
                if (uIBlockSearchSuggestion != null) {
                    this.m.b.e.b(new xxf0(uIBlockSearchSuggestion.Fb()), false);
                    this.H.a(new yve(uIBlockSearchSuggestion, 25));
                    return;
                }
                return;
            }
            return;
        }
        UIBlockSearchSuggestion uIBlockSearchSuggestion2 = uIBlock instanceof UIBlockSearchSuggestion ? (UIBlockSearchSuggestion) uIBlock : null;
        if (uIBlockSearchSuggestion2 != null) {
            SearchSuggestion searchSuggestion = uIBlockSearchSuggestion2.y;
            uxh0 uxh0Var = this.r;
            if (uxh0Var != null) {
                uxh0Var.X1(searchSuggestion.c, true);
            }
            wda.e0(this, searchSuggestion.c, cqm0.a(searchSuggestion.k), null, 12);
        }
    }
}
