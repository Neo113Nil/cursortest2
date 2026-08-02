package com.vk.search.ui.impl.catalog;

import android.os.Bundle;
import com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.search.ui.api.di.SearchUiComponent;
import com.vk.search.ui.impl.catalog.roots.GlobalSearchGroupsCatalogRootVh;
import com.vk.toggle.b;
import com.vk.toggle.features.SearchFeatures;
import xsna.bpn0;
import xsna.fpf0;
import xsna.irh0;
import xsna.k7m;
import xsna.m7m;
import xsna.o5a;
import xsna.tu80;
import xsna.uh90;
import xsna.yh90;
import xsna.yzh0;
import xsna.zqh0;

/* compiled from: SearchGroupsFeatureCatalogFragment.kt */
/* loaded from: classes5.dex */
public final class SearchGroupsFeatureCatalogFragment extends GlobalSearchFeatureCatalogFragment {
    public static final /* synthetic */ int U = 0;
    public final bpn0 S;
    public final yzh0<uh90> T;

    /* compiled from: SearchGroupsFeatureCatalogFragment.kt */
    public static final class a extends BaseCatalogFragment.b {
    }

    public SearchGroupsFeatureCatalogFragment() {
        super(GlobalSearchGroupsCatalogRootVh.class);
        this.S = new bpn0(new tu80(this, 19));
        this.T = ((SearchUiComponent) ((k7m) m7m.f(this)).a(fpf0.a(SearchUiComponent.class))).o9();
    }

    @Override // com.vk.search.ui.impl.catalog.GlobalSearchFeatureCatalogFragment, xsna.jrh0
    public final zqh0 af() {
        return (yh90) this.S.getValue();
    }

    @Override // com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment
    public final CatalogRootViewHolder eo(Bundle bundle) {
        return new GlobalSearchGroupsCatalogRootVh(requireArguments(), kn(), this, new o5a(this), (yh90) this.S.getValue(), this.T);
    }

    @Override // com.vk.search.ui.impl.catalog.GlobalSearchFeatureCatalogFragment
    public final irh0 go() {
        SearchFeatures searchFeatures = SearchFeatures.GLOBAL_SEARCH_GROUPS_SUGGESTER;
        searchFeatures.getClass();
        return new irh0(b.A.a(searchFeatures), false, 503);
    }
}
