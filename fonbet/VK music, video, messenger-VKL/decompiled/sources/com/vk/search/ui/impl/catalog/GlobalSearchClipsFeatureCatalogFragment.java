package com.vk.search.ui.impl.catalog;

import android.os.Bundle;
import com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.clip.ClipGlobalSearchFeatureRootVh;
import xsna.irh0;
import xsna.o5a;

/* compiled from: GlobalSearchClipsFeatureCatalogFragment.kt */
/* loaded from: classes5.dex */
public final class GlobalSearchClipsFeatureCatalogFragment extends GlobalSearchFeatureCatalogFragment {

    /* compiled from: GlobalSearchClipsFeatureCatalogFragment.kt */
    public static final class a extends BaseCatalogFragment.b {
    }

    public GlobalSearchClipsFeatureCatalogFragment() {
        super(ClipGlobalSearchFeatureRootVh.class);
    }

    @Override // com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment
    public final CatalogRootViewHolder eo(Bundle bundle) {
        return new ClipGlobalSearchFeatureRootVh(requireArguments(), kn(), new o5a(this), af(), this);
    }

    @Override // com.vk.search.ui.impl.catalog.GlobalSearchFeatureCatalogFragment
    public final irh0 go() {
        return new irh0(true, false, 499);
    }
}
