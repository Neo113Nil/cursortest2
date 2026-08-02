package com.vk.search.ui.impl.catalog.apps;

import android.os.Bundle;
import com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.search.ui.impl.catalog.GlobalSearchCatalogFragment;
import com.vk.search.ui.impl.catalog.roots.apps.GlobalSearchMiniappsCatalogRootVh;
import xsna.o5a;
import xsna.qwh0;

/* compiled from: GlobalSearchMiniappsCatalogFragment.kt */
/* loaded from: classes5.dex */
public final class GlobalSearchMiniappsCatalogFragment extends GlobalSearchCatalogFragment implements qwh0 {

    /* compiled from: GlobalSearchMiniappsCatalogFragment.kt */
    public static final class a extends BaseCatalogFragment.b {
    }

    public GlobalSearchMiniappsCatalogFragment() {
        super(GlobalSearchMiniappsCatalogRootVh.class, true);
    }

    @Override // com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment
    public final CatalogRootViewHolder eo(Bundle bundle) {
        return new GlobalSearchMiniappsCatalogRootVh(requireArguments(), kn(), new o5a(this));
    }
}
