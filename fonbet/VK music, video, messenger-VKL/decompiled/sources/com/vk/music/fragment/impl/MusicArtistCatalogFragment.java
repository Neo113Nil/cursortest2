package com.vk.music.fragment.impl;

import android.os.Bundle;
import com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.catalog2.feature.music.ui.holder.MusicArtistCatalogRootVh;
import com.vk.dto.search.SearchStatsLoggingInfo;
import kotlin.LazyThreadSafetyMode;
import xsna.bfm;
import xsna.msy;
import xsna.nds;
import xsna.nr4;
import xsna.o5a;

/* compiled from: MusicArtistCatalogFragment.kt */
/* loaded from: classes.dex */
public final class MusicArtistCatalogFragment extends BaseCatalogFragment implements nds {
    public static final /* synthetic */ int R = 0;
    public final Object Q;

    /* compiled from: MusicArtistCatalogFragment.kt */
    /* loaded from: classes3.dex */
    public static final class a extends BaseCatalogFragment.b {
        public a(String str) {
            super(MusicArtistCatalogFragment.class, null, null);
            this.j.putString("artist_id", str);
        }

        public final void B(String str) {
            this.j.putString("launch_origin", str);
        }

        public final void C(String str) {
            if (str != null) {
                this.j.putString("ref", str);
            }
        }

        public final void D(SearchStatsLoggingInfo searchStatsLoggingInfo) {
            if (searchStatsLoggingInfo != null) {
                this.j.putParcelable("search_stats_logging_info", searchStatsLoggingInfo);
            }
        }
    }

    public MusicArtistCatalogFragment() {
        super(MusicArtistCatalogRootVh.class, false);
        this.Q = msy.a(LazyThreadSafetyMode.NONE, new bfm(this, 21));
    }

    @Override // xsna.nds
    public final boolean W9() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment
    public final CatalogRootViewHolder eo(Bundle bundle) {
        Bundle requireArguments = requireArguments();
        requireArguments.putBoolean("music_kids_mode_enabled", ((Boolean) this.Q.getValue()).booleanValue());
        return new MusicArtistCatalogRootVh(requireArguments, kn(), new o5a(this), nr4.b());
    }

    @Override // xsna.nds, xsna.xoo0
    public final int l2() {
        return 0;
    }
}
