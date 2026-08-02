package com.vk.catalog2.common.ui.mvp.video;

import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.video.playlist.VideoPlaylistRootVh;
import com.vk.dto.common.id.UserId;
import com.vk.dto.search.SearchStatsLoggingInfo;
import kotlin.Pair;
import xsna.dcn;
import xsna.epx;
import xsna.fxc0;
import xsna.krv0;
import xsna.nds;
import xsna.o5a;
import xsna.r11;
import xsna.uds;

/* compiled from: VideoPlaylistCatalogFragment.kt */
/* loaded from: classes16.dex */
public final class VideoPlaylistCatalogFragment extends BaseCatalogFragment implements nds, uds {

    /* compiled from: VideoPlaylistCatalogFragment.kt */
    public static final class a extends BaseCatalogFragment.b {
        public a(UserId userId, int i) {
            super(VideoPlaylistCatalogFragment.class, null, null);
            this.j.putParcelable("owner_id", userId);
            this.j.putInt("album_id", i);
        }

        public final void B(String str) {
            if (str != null) {
                this.j.putString("ref", str);
            }
        }

        public final void C(SearchStatsLoggingInfo searchStatsLoggingInfo) {
            if (searchStatsLoggingInfo != null) {
                this.j.putParcelable("search_stats_logging_info", searchStatsLoggingInfo);
            }
        }

        public final void D(String str) {
            if (str != null) {
                this.j.putString("track_code", str);
            }
        }
    }

    /* compiled from: VideoPlaylistCatalogFragment.kt */
    public static final class b extends BaseCatalogFragment.a {
    }

    public VideoPlaylistCatalogFragment() {
        super(VideoPlaylistRootVh.class, false);
    }

    @Override // xsna.nds
    public final boolean W9() {
        TypedValue typedValue = krv0.a;
        return krv0.j();
    }

    @Override // com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment
    public final CatalogRootViewHolder eo(Bundle bundle) {
        Bundle arguments = getArguments();
        FragmentActivity kn = kn();
        o5a o5aVar = new o5a(this);
        Bundle arguments2 = getArguments();
        return new VideoPlaylistRootVh(arguments, kn, o5aVar, arguments2 != null ? arguments2.getBoolean("reload_on_login") : false);
    }

    @Override // xsna.nds, xsna.xoo0
    public final int l2() {
        return 0;
    }

    @Override // xsna.woo0
    public final int o7() {
        return 0;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        UserId userId;
        Bundle arguments;
        super.onViewCreated(view, bundle);
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (userId = (UserId) arguments2.getParcelable("owner_id")) == null || (arguments = getArguments()) == null) {
            return;
        }
        int i = arguments.getInt("album_id");
        Pair<String, dcn> I = fxc0.B().I();
        String d = I.d();
        dcn g = I.g();
        if (!epx.f(d, r11.b(new StringBuilder(), userId.b, '_', i)) || g == null) {
            return;
        }
        g.dismiss();
    }
}
