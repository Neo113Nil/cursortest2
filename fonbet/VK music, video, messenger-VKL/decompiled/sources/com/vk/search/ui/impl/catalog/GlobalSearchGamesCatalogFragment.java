package com.vk.search.ui.impl.catalog;

import android.os.Bundle;
import com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.search.ui.impl.catalog.roots.GlobalSearchGamesCatalogRootVh;
import xsna.o5a;
import xsna.qwh0;

/* compiled from: GlobalSearchGamesCatalogFragment.kt */
/* loaded from: classes5.dex */
public final class GlobalSearchGamesCatalogFragment extends GlobalSearchCatalogFragment implements qwh0 {

    /* compiled from: GlobalSearchGamesCatalogFragment.kt */
    public static final class a extends BaseCatalogFragment.b {
    }

    public GlobalSearchGamesCatalogFragment() {
        super(GlobalSearchGamesCatalogRootVh.class, true);
    }

    @Override // com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment
    public final CatalogRootViewHolder eo(Bundle bundle) {
        return new GlobalSearchGamesCatalogRootVh(requireArguments(), kn(), new o5a(this));
    }
}
