package com.vk.music.fragment.impl;

import android.os.Bundle;
import com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.catalog2.feature.music.ui.holder.MusicCuratorCatalogRootVh;
import com.vk.dto.search.SearchStatsLoggingInfo;
import xsna.nds;
import xsna.nr4;
import xsna.o5a;

/* compiled from: MusicCuratorCatalogFragment.kt */
/* loaded from: classes3.dex */
public final class MusicCuratorCatalogFragment extends BaseCatalogFragment implements nds {

    /* compiled from: MusicCuratorCatalogFragment.kt */
    public static final class a extends BaseCatalogFragment.b {
        public a(String str) {
            super(MusicCuratorCatalogFragment.class, null, null);
            this.j.putString("curator_id", str);
        }

        public final void B(SearchStatsLoggingInfo searchStatsLoggingInfo) {
            if (searchStatsLoggingInfo != null) {
                this.j.putParcelable("search_stats_logging_info", searchStatsLoggingInfo);
            }
        }

        public final void C(String str) {
            if (str != null) {
                this.j.putString("ref", str);
            }
        }
    }

    public MusicCuratorCatalogFragment() {
        super(MusicCuratorCatalogRootVh.class, false);
    }

    @Override // xsna.nds
    public final boolean W9() {
        return false;
    }

    @Override // com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment
    public final CatalogRootViewHolder eo(Bundle bundle) {
        return new MusicCuratorCatalogRootVh(requireArguments(), kn(), new o5a(this), nr4.b());
    }

    @Override // xsna.nds, xsna.xoo0
    public final int l2() {
        return 0;
    }
}
