package com.vk.search.ui.impl.catalog;

import android.os.Bundle;
import android.view.View;
import com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.search.ui.api.SearchInputMethod;
import com.vk.search.ui.impl.catalog.roots.GlobalSearchVideoRootVh;
import xsna.gzs;
import xsna.o5a;
import xsna.qwh0;
import xsna.s180;
import xsna.s3q0;
import xsna.vxh0;

/* compiled from: GlobalSearchVideosCatalogFragment.kt */
/* loaded from: classes5.dex */
public final class GlobalSearchVideosCatalogFragment extends GlobalSearchCatalogFragment implements qwh0, vxh0, s180 {
    public gzs<s3q0> V;

    /* compiled from: GlobalSearchVideosCatalogFragment.kt */
    public static final class a extends BaseCatalogFragment.b {
    }

    public GlobalSearchVideosCatalogFragment() {
        super(GlobalSearchVideoRootVh.class, true);
    }

    @Override // xsna.vxh0
    public final void E2(String str) {
        CatalogRootViewHolder catalogRootViewHolder = this.P;
        GlobalSearchVideoRootVh globalSearchVideoRootVh = catalogRootViewHolder instanceof GlobalSearchVideoRootVh ? (GlobalSearchVideoRootVh) catalogRootViewHolder : null;
        if (globalSearchVideoRootVh != null) {
            globalSearchVideoRootVh.E2(str);
        }
    }

    @Override // xsna.vxh0
    public final void O(String str, SearchInputMethod searchInputMethod) {
        CatalogRootViewHolder catalogRootViewHolder = this.P;
        GlobalSearchVideoRootVh globalSearchVideoRootVh = catalogRootViewHolder instanceof GlobalSearchVideoRootVh ? (GlobalSearchVideoRootVh) catalogRootViewHolder : null;
        if (globalSearchVideoRootVh != null) {
            globalSearchVideoRootVh.O(str, searchInputMethod);
        }
    }

    @Override // xsna.vxh0
    public final void a3(String str) {
        CatalogRootViewHolder catalogRootViewHolder = this.P;
        GlobalSearchVideoRootVh globalSearchVideoRootVh = catalogRootViewHolder instanceof GlobalSearchVideoRootVh ? (GlobalSearchVideoRootVh) catalogRootViewHolder : null;
        if (globalSearchVideoRootVh != null) {
            globalSearchVideoRootVh.a3(str);
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment
    public final CatalogRootViewHolder eo(Bundle bundle) {
        return new GlobalSearchVideoRootVh(requireArguments(), kn(), new o5a(this));
    }

    @Override // xsna.vxh0
    public final void n() {
        CatalogRootViewHolder catalogRootViewHolder = this.P;
        GlobalSearchVideoRootVh globalSearchVideoRootVh = catalogRootViewHolder instanceof GlobalSearchVideoRootVh ? (GlobalSearchVideoRootVh) catalogRootViewHolder : null;
        if (globalSearchVideoRootVh != null) {
            globalSearchVideoRootVh.n();
        }
    }

    @Override // com.vk.search.ui.impl.catalog.GlobalSearchCatalogFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        gzs<s3q0> gzsVar = this.V;
        if (gzsVar != null) {
            gzsVar.invoke();
        }
        this.V = null;
    }

    @Override // xsna.vxh0
    public final void qb() {
        CatalogRootViewHolder catalogRootViewHolder = this.P;
        GlobalSearchVideoRootVh globalSearchVideoRootVh = catalogRootViewHolder instanceof GlobalSearchVideoRootVh ? (GlobalSearchVideoRootVh) catalogRootViewHolder : null;
        if (globalSearchVideoRootVh != null) {
            globalSearchVideoRootVh.qb();
        }
    }
}
