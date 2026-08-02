package com.vk.search.ui.impl.catalog;

import android.os.Bundle;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.search.ui.impl.catalog.GlobalSearchCatalogFragment;
import com.vk.search.ui.impl.catalog.roots.GlobalSearchGroupsCatalogRootVhOld;
import xsna.o5a;
import xsna.w8i;

/* compiled from: GlobalSearchGroupsCatalogFragment.kt */
/* loaded from: classes5.dex */
public final class GlobalSearchGroupsCatalogFragment extends GlobalSearchCatalogFragment implements w8i {

    /* compiled from: GlobalSearchGroupsCatalogFragment.kt */
    public static final class a extends GlobalSearchCatalogFragment.a {
    }

    public GlobalSearchGroupsCatalogFragment() {
        super(GlobalSearchGroupsCatalogRootVhOld.class, true);
    }

    @Override // com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment
    public final CatalogRootViewHolder eo(Bundle bundle) {
        return new GlobalSearchGroupsCatalogRootVhOld(requireArguments(), kn(), new o5a(this));
    }
}
