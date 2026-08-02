package com.vk.search.ui.impl.catalog;

import android.os.Bundle;
import com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.search.ui.impl.catalog.roots.GlobalSearchChannelsCatalogRootVh;
import xsna.o5a;

/* compiled from: SearchChannelsFeatureCatalogFragment.kt */
/* loaded from: classes5.dex */
public final class SearchChannelsFeatureCatalogFragment extends GlobalSearchFeatureCatalogFragment {

    /* compiled from: SearchChannelsFeatureCatalogFragment.kt */
    public static final class a extends BaseCatalogFragment.b {
    }

    public SearchChannelsFeatureCatalogFragment() {
        super(GlobalSearchChannelsCatalogRootVh.class);
    }

    @Override // com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment
    public final CatalogRootViewHolder eo(Bundle bundle) {
        return new GlobalSearchChannelsCatalogRootVh(requireArguments(), kn(), this, new o5a(this), af());
    }
}
