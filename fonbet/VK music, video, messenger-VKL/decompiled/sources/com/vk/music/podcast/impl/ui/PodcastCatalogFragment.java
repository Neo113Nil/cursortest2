package com.vk.music.podcast.impl.ui;

import android.os.Bundle;
import com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.catalog2.feature.music.ui.holder.PodcastCatalogRootVh;
import com.vk.dto.common.id.UserId;
import xsna.o25;
import xsna.o5a;
import xsna.oz50;

/* compiled from: PodcastCatalogFragment.kt */
/* loaded from: classes3.dex */
public final class PodcastCatalogFragment extends BaseCatalogFragment {

    /* compiled from: PodcastCatalogFragment.kt */
    public static final class a extends oz50 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i) {
            super(PodcastCatalogFragment.class, null, null);
            UserId c = o25.a().c();
            this.j.putParcelable("owner_id", c);
        }

        public final void y(String str) {
            if (str.length() > 0) {
                this.j.putString("ref", str);
            }
        }
    }

    public PodcastCatalogFragment() {
        super(PodcastCatalogRootVh.class, false);
    }

    @Override // com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment
    public final CatalogRootViewHolder eo(Bundle bundle) {
        return new PodcastCatalogRootVh(requireArguments(), kn(), new o5a(this));
    }
}
