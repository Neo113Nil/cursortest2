package com.vk.catalog2.feature.music.ui.fragment.audiobook;

import android.os.Bundle;
import com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.catalog2.feature.music.ui.holder.AudioBookGenreCatalogRootVh;
import com.vk.dto.common.id.UserId;
import xsna.o25;
import xsna.o5a;
import xsna.oz50;

/* compiled from: AudioBookGenreCatalogFragment.kt */
/* loaded from: classes16.dex */
public final class AudioBookGenreCatalogFragment extends BaseCatalogFragment {

    /* compiled from: AudioBookGenreCatalogFragment.kt */
    public static final class a extends oz50 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(AudioBookGenreCatalogFragment.class, null, null);
            UserId c = o25.a().c();
            this.j.putParcelable("owner_id", c);
            this.j.putString("genre_id", str);
        }

        public final void y(String str) {
            if (str.length() > 0) {
                this.j.putString("ref", str);
            }
        }
    }

    public AudioBookGenreCatalogFragment() {
        super(AudioBookGenreCatalogRootVh.class, false);
    }

    @Override // com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment
    public final CatalogRootViewHolder eo(Bundle bundle) {
        return new AudioBookGenreCatalogRootVh(requireArguments(), kn(), new o5a(this));
    }
}
