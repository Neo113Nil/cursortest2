package com.vk.catalog2.feature.music.ui.fragment.audiobook;

import android.os.Bundle;
import com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.catalog2.feature.music.ui.holder.AudioBookPersonCatalogRootVh;
import xsna.nds;
import xsna.o5a;

/* compiled from: AudioBookPersonCatalogFragment.kt */
/* loaded from: classes16.dex */
public final class AudioBookPersonCatalogFragment extends BaseCatalogFragment implements nds {
    public static final /* synthetic */ int Q = 0;

    /* compiled from: AudioBookPersonCatalogFragment.kt */
    public static final class a extends BaseCatalogFragment.b {
        public a(int i) {
            super(AudioBookPersonCatalogFragment.class, null, null);
            this.j.putInt("person_id", i);
        }

        public final void B(String str) {
            int i = AudioBookPersonCatalogFragment.Q;
            this.j.putString("launch_origin", str);
        }

        public final void C(String str) {
            int i = AudioBookPersonCatalogFragment.Q;
            this.j.putString("ref", str);
        }
    }

    public AudioBookPersonCatalogFragment() {
        super(AudioBookPersonCatalogRootVh.class, false);
    }

    @Override // xsna.nds
    public final boolean W9() {
        return false;
    }

    @Override // com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment
    public final CatalogRootViewHolder eo(Bundle bundle) {
        return new AudioBookPersonCatalogRootVh(requireArguments(), kn(), new o5a(this));
    }

    @Override // xsna.nds, xsna.xoo0
    public final int l2() {
        return 0;
    }
}
