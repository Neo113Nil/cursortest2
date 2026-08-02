package com.vk.search.ui.impl.catalog;

import android.os.Bundle;
import com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.catalog2.feature.music.api.CatalogGetAudioSearchRequestFactory;
import com.vk.search.ui.impl.catalog.roots.MusicSearchCatalogRootVh;
import xsna.irh0;
import xsna.o5a;

/* compiled from: MusicDiscoverSearchCatalogFragment.kt */
/* loaded from: classes5.dex */
public final class MusicDiscoverSearchCatalogFragment extends GlobalSearchFeatureCatalogFragment {

    /* compiled from: MusicDiscoverSearchCatalogFragment.kt */
    public static final class a extends BaseCatalogFragment.b {
    }

    public MusicDiscoverSearchCatalogFragment() {
        super(MusicSearchCatalogRootVh.class);
    }

    @Override // com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment
    public final CatalogRootViewHolder eo(Bundle bundle) {
        return new MusicSearchCatalogRootVh(kn(), new o5a(this), af(), requireArguments(), this);
    }

    @Override // com.vk.search.ui.impl.catalog.GlobalSearchFeatureCatalogFragment
    public final irh0 go() {
        irh0 irh0Var = CatalogGetAudioSearchRequestFactory.y;
        return CatalogGetAudioSearchRequestFactory.y;
    }
}
