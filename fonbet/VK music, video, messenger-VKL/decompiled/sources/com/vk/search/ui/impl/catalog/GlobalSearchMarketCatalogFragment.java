package com.vk.search.ui.impl.catalog;

import android.os.Bundle;
import com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.search.ui.impl.catalog.roots.GlobalSearchMarketCatalogRootVh;
import xsna.o5a;
import xsna.qwh0;

/* compiled from: GlobalSearchMarketCatalogFragment.kt */
/* loaded from: classes5.dex */
public final class GlobalSearchMarketCatalogFragment extends GlobalSearchCatalogFragment implements qwh0 {

    /* compiled from: GlobalSearchMarketCatalogFragment.kt */
    public static final class a extends BaseCatalogFragment.b {
    }

    public GlobalSearchMarketCatalogFragment() {
        super(GlobalSearchMarketCatalogRootVh.class, true);
    }

    @Override // com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment
    public final CatalogRootViewHolder eo(Bundle bundle) {
        return new GlobalSearchMarketCatalogRootVh(requireArguments(), kn(), new o5a(this), this);
    }
}
