package com.vk.catalog2.feature.music.ui.fragment.audiobook;

import android.os.Bundle;
import com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.catalog2.feature.music.ui.holder.AudioBookPersonGenreCatalogRootVh;
import xsna.o5a;
import xsna.oz50;

/* compiled from: AudioBookPersonGenreCatalogFragment.kt */
/* loaded from: classes16.dex */
public final class AudioBookPersonGenreCatalogFragment extends BaseCatalogFragment {

    /* compiled from: AudioBookPersonGenreCatalogFragment.kt */
    public static final class a extends oz50 {
    }

    public AudioBookPersonGenreCatalogFragment() {
        super(AudioBookPersonGenreCatalogRootVh.class, false);
    }

    @Override // com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment
    public final CatalogRootViewHolder eo(Bundle bundle) {
        return new AudioBookPersonGenreCatalogRootVh(requireArguments(), kn(), new o5a(this));
    }
}
