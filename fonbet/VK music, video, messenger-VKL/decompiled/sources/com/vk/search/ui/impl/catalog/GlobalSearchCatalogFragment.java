package com.vk.search.ui.impl.catalog;

import android.os.Bundle;
import android.view.View;
import com.vk.catalog2.common.ui.holders.api.CatalogVh;
import com.vk.catalog2.common.ui.holders.search.b;
import com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.search.fragment.DiscoverSearchFragment;
import com.vk.search.params.api.SearchParams;
import com.vk.search.ui.api.SearchInputMethod;
import com.vk.search.ui.impl.catalog.roots.GlobalSearchCatalogRootVh;
import com.vk.search.ui.impl.catalog.roots.GlobalSearchWithParamsCatalogRootVh;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import xsna.rda;
import xsna.swh0;
import xsna.uxh0;
import xsna.wda;
import xsna.xda;

/* compiled from: GlobalSearchCatalogFragment.kt */
/* loaded from: classes5.dex */
public abstract class GlobalSearchCatalogFragment extends BaseCatalogFragment implements swh0 {
    public SearchParams Q;
    public String R;
    public SearchInputMethod S;
    public uxh0 T;
    public DiscoverSearchFragment.d.a U;

    /* compiled from: GlobalSearchCatalogFragment.kt */
    public static class a extends BaseCatalogFragment.b {
    }

    public GlobalSearchCatalogFragment() {
        throw null;
    }

    @Override // xsna.swh0
    public final void bd() {
        CatalogRootViewHolder catalogRootViewHolder = this.P;
        GlobalSearchWithParamsCatalogRootVh globalSearchWithParamsCatalogRootVh = catalogRootViewHolder instanceof GlobalSearchWithParamsCatalogRootVh ? (GlobalSearchWithParamsCatalogRootVh) catalogRootViewHolder : null;
        if (globalSearchWithParamsCatalogRootVh != null) {
            String V = globalSearchWithParamsCatalogRootVh.j0().V();
            if (V == null) {
                V = "";
            }
            b bVar = b.a;
            b.b(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.OPEN_FILTERS, V);
        }
    }

    @Override // xsna.qwh0
    public final boolean c0() {
        CatalogVh catalogVh = this.P;
        wda wdaVar = catalogVh instanceof wda ? (wda) catalogVh : null;
        if (wdaVar != null) {
            return wdaVar.c0();
        }
        return true;
    }

    @Override // xsna.swh0, xsna.qwh0
    public final void j1(String str, SearchInputMethod searchInputMethod) {
        pe(str, null, searchInputMethod);
    }

    @Override // com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.o = false;
        CatalogRootViewHolder catalogRootViewHolder = this.P;
        boolean z = catalogRootViewHolder instanceof GlobalSearchCatalogRootVh;
        GlobalSearchCatalogRootVh globalSearchCatalogRootVh = z ? (GlobalSearchCatalogRootVh) catalogRootViewHolder : null;
        if (globalSearchCatalogRootVh != null) {
            globalSearchCatalogRootVh.r = this.T;
        }
        GlobalSearchCatalogRootVh globalSearchCatalogRootVh2 = z ? (GlobalSearchCatalogRootVh) catalogRootViewHolder : null;
        if (globalSearchCatalogRootVh2 != null) {
            globalSearchCatalogRootVh2.s = this.U;
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        String str = this.R;
        if (str != null) {
            CatalogVh catalogVh = this.P;
            if (catalogVh instanceof xda) {
                xda.D((xda) catalogVh, str, this.Q, this.S, 8);
            } else if (catalogVh instanceof wda) {
                wda.e0((wda) catalogVh, str, null, this.S, 4);
            }
        }
        this.R = null;
        this.Q = null;
        this.S = null;
    }

    @Override // xsna.swh0
    public final void pe(String str, SearchParams searchParams, SearchInputMethod searchInputMethod) {
        CatalogVh catalogVh = this.P;
        if (catalogVh == null) {
            this.R = str;
            this.Q = searchParams != null ? searchParams.copy() : null;
            this.S = searchInputMethod;
        } else if (catalogVh instanceof xda) {
            xda.D((xda) catalogVh, str, searchParams, searchInputMethod, 8);
        } else if (catalogVh instanceof wda) {
            wda.e0((wda) catalogVh, str, null, searchInputMethod, 4);
        }
    }

    @Override // xsna.unh0
    public final void s() {
        CatalogVh catalogVh = this.P;
        rda rdaVar = catalogVh instanceof rda ? (rda) catalogVh : null;
        if (rdaVar != null) {
            rdaVar.s();
        }
    }
}
