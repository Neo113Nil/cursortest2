package com.vk.music.fragment.impl;

import android.content.Intent;
import android.os.Bundle;
import android.util.LruCache;
import com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.catalog2.feature.music.ui.holder.MusicMyAudiosCatalogRootVh;
import com.vk.core.ui.measuring.UiMeasuringScreen;
import com.vk.dto.search.SearchStatsLoggingInfo;
import java.util.UUID;
import kotlin.Pair;
import xsna.mzp0;
import xsna.o5a;
import xsna.rzp0;
import xsna.sq40;

/* compiled from: MusicMyAudiosCatalogFragment.kt */
/* loaded from: classes3.dex */
public final class MusicMyAudiosCatalogFragment extends BaseCatalogFragment {

    /* compiled from: MusicMyAudiosCatalogFragment.kt */
    public static final class a extends BaseCatalogFragment.b {
        public a() {
            super(MusicMyAudiosCatalogFragment.class, null, null);
        }

        public final void B(SearchStatsLoggingInfo searchStatsLoggingInfo) {
            if (searchStatsLoggingInfo != null) {
                this.j.putParcelable("search_stats_logging_info", searchStatsLoggingInfo);
            }
        }

        public final void C(String str) {
            if (str == null) {
                return;
            }
            this.j.putString("key_url", str);
        }

        public final void D(String str) {
            if (str != null) {
                this.j.putString("ref", str);
            }
        }

        public final void E(String str) {
            if (str != null) {
                this.j.putString("type", str);
            }
        }

        @Override // xsna.oz50
        public final void r(Intent intent) {
            LruCache<UUID, mzp0> lruCache = rzp0.a;
            Pair c = rzp0.c(UiMeasuringScreen.MUSIC_CATALOG, null, false, 62);
            UUID uuid = (UUID) c.d();
            ((mzp0) c.g()).init();
            Bundle bundleExtra = intent.getBundleExtra("args");
            if (bundleExtra != null) {
                rzp0.f(bundleExtra, uuid);
            }
        }
    }

    /* compiled from: MusicMyAudiosCatalogFragment.kt */
    public final class b extends o5a implements sq40 {
    }

    public MusicMyAudiosCatalogFragment() {
        super(MusicMyAudiosCatalogRootVh.class, false);
    }

    @Override // com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment
    public final CatalogRootViewHolder eo(Bundle bundle) {
        return new MusicMyAudiosCatalogRootVh(requireArguments(), kn(), new b(this));
    }
}
