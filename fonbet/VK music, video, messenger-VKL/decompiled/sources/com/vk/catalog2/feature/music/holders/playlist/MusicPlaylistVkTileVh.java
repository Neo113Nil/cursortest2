package com.vk.catalog2.feature.music.holders.playlist;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicPlaylist;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.tile.VkTile;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.design.view.download.DownloadingView;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.PlaySourceMeta;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.StartPlayPlaylistSource;
import com.vk.music.stats.AdsAudioPixelsContainer;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.b5a;
import xsna.bi40;
import xsna.bwt0;
import xsna.c9b0;
import xsna.cfb0;
import xsna.cho;
import xsna.dfb0;
import xsna.di40;
import xsna.e3m;
import xsna.e43;
import xsna.epx;
import xsna.fl4;
import xsna.gko;
import xsna.gzs;
import xsna.jnj;
import xsna.k1u0;
import xsna.k840;
import xsna.lqk0;
import xsna.lyd;
import xsna.myc0;
import xsna.oq;
import xsna.q01;
import xsna.s3q0;
import xsna.s9a;
import xsna.sq40;
import xsna.t8b0;
import xsna.tlo0;
import xsna.u2b0;
import xsna.vq40;
import xsna.xx1;

/* compiled from: MusicPlaylistVkTileVh.kt */
/* loaded from: classes16.dex */
public final class MusicPlaylistVkTileVh implements CatalogViewHolder, cho {
    public final u2b0 b;
    public final b5a c;
    public final fl4 d;
    public final SearchStatInfoProvider e;
    public final sq40 f;
    public final boolean g;
    public final vq40 h;
    public VkTile i;
    public UIBlockMusicPlaylist j;
    public boolean k;
    public cfb0 l;
    public t8b0 m;

    /* compiled from: MusicPlaylistVkTileVh.kt */
    public static final class a extends VkTile.a {
        @Override // com.vk.core.view.components.tile.VkTile.a
        public final int a(VkTile vkTile) {
            return vkTile.getContext().getResources().getDimensionPixelSize(R.dimen.music_playlist_slider_layout_padding);
        }
    }

    /* compiled from: MusicPlaylistVkTileVh.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            VkTile vkTile;
            Context context;
            Activity h;
            UIBlockMusicPlaylist uIBlockMusicPlaylist;
            MusicPlaylistVkTileVh musicPlaylistVkTileVh = (MusicPlaylistVkTileVh) this.receiver;
            musicPlaylistVkTileVh.getClass();
            if (!bwt0.c(400L) && (vkTile = musicPlaylistVkTileVh.i) != null && (context = vkTile.getContext()) != null && (h = e3m.h(context)) != null && (uIBlockMusicPlaylist = musicPlaylistVkTileVh.j) != null) {
                Playlist playlist = uIBlockMusicPlaylist.z;
                if (!musicPlaylistVkTileVh.b(h) && epx.f(playlist.H, DownloadingState.NotLoaded.b)) {
                    k840.a.d().E(h, playlist);
                }
            }
            return s3q0.a;
        }
    }

    /* compiled from: MusicPlaylistVkTileVh.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            VkTile vkTile;
            Context context;
            Activity h;
            UIBlockMusicPlaylist uIBlockMusicPlaylist;
            MusicPlaylistVkTileVh musicPlaylistVkTileVh = (MusicPlaylistVkTileVh) this.receiver;
            u2b0 u2b0Var = musicPlaylistVkTileVh.b;
            if (!bwt0.c(400L) && (vkTile = musicPlaylistVkTileVh.i) != null && (context = vkTile.getContext()) != null && (h = e3m.h(context)) != null && (uIBlockMusicPlaylist = musicPlaylistVkTileVh.j) != null) {
                Playlist playlist = uIBlockMusicPlaylist.z;
                if (!musicPlaylistVkTileVh.b(h)) {
                    if (playlist.B()) {
                        fl4.p(musicPlaylistVkTileVh.d, h, MusicPlaylistVkTileVh.a(playlist.O, uIBlockMusicPlaylist), playlist, null, null, 24);
                    } else if (musicPlaylistVkTileVh.e()) {
                        u2b0Var.w1(new PlaybackActionMeta(6, 0L, 2, null));
                    } else {
                        String str = playlist.x;
                        String str2 = uIBlockMusicPlaylist.b;
                        String str3 = uIBlockMusicPlaylist.c;
                        String str4 = playlist.h;
                        if (str4 == null) {
                            str4 = "";
                        }
                        u2b0Var.N0(new lqk0(new StartPlayPlaylistSource(new PlaySourceMeta.PlaylistPlaySourceMeta(str4, playlist.Eb(), playlist.c, playlist.b, playlist.O, playlist.z), str2, str3, str), (MusicTrack) null, (List) null, MusicPlaybackLaunchContext.Fb(uIBlockMusicPlaylist.f).Db(playlist).Cb(uIBlockMusicPlaylist.p.h()), 0, (ShuffleMode) null, PlayRequestTrigger.FAST_PLAY_TRACK_LIST, (AdsAudioPixelsContainer) null, 0L, 886));
                    }
                }
            }
            return s3q0.a;
        }
    }

    public MusicPlaylistVkTileVh(u2b0 u2b0Var, b5a b5aVar, SearchStatInfoProvider searchStatInfoProvider, sq40 sq40Var, boolean z, int i) {
        fl4 g = lyd.g();
        z = (i & 256) != 0 ? false : z;
        this.b = u2b0Var;
        this.c = b5aVar;
        this.d = g;
        this.e = searchStatInfoProvider;
        this.f = sq40Var;
        this.g = z;
        this.h = new vq40();
    }

    public static MusicPlaybackLaunchContext a(int i, UIBlock uIBlock) {
        MusicPlaybackLaunchContext Fb = MusicPlaybackLaunchContext.Fb(uIBlock.f);
        String h = uIBlock.p.h();
        if (c(uIBlock.f)) {
            h = null;
        }
        if (h == null) {
            h = jnj.a(i);
        }
        return Fb.Cb(h);
    }

    public static boolean c(String str) {
        return s9a.b.contains(str) || epx.f(str, "offline_music_replacement_default");
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        VkTile vkTile = this.i;
        if (vkTile != null) {
            vkTile.setOnClickListener(null);
        }
        t8b0 t8b0Var = this.m;
        if (t8b0Var != null) {
            ((DownloadingView) t8b0Var.b.getValue()).setOnClickListener(null);
        }
        cfb0 cfb0Var = this.l;
        if (cfb0Var != null) {
            cfb0Var.d.setOnClickListener(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0085  */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N6(UIBlock uIBlock) {
        Context context;
        Context context2;
        boolean z;
        UIBlockMusicPlaylist uIBlockMusicPlaylist = uIBlock instanceof UIBlockMusicPlaylist ? (UIBlockMusicPlaylist) uIBlock : null;
        if (uIBlockMusicPlaylist == null) {
            return;
        }
        Playlist playlist = uIBlockMusicPlaylist.z;
        VkTile vkTile = this.i;
        if (vkTile == null) {
            return;
        }
        this.j = uIBlockMusicPlaylist;
        vkTile.setAlpha(!playlist.B() ? 1.0f : 0.64f);
        t8b0 t8b0Var = this.m;
        if (t8b0Var != null) {
            ?? r5 = t8b0Var.b;
            if (!c(uIBlockMusicPlaylist.f) || !this.g ? (playlist.v > 0 || !playlist.y.isEmpty()) && !epx.f(playlist.H, DownloadingState.NotLoaded.b) : playlist.v > 0 || !playlist.y.isEmpty()) {
                if (!this.k) {
                    z = true;
                    DownloadingView downloadingView = (DownloadingView) r5.getValue();
                    bi40 a2 = di40.a(playlist.H);
                    int i = DownloadingView.m;
                    downloadingView.a(a2, true);
                    ((DownloadingView) r5.getValue()).setVisibility(!z ? 0 : 8);
                }
            }
            z = false;
            DownloadingView downloadingView2 = (DownloadingView) r5.getValue();
            bi40 a22 = di40.a(playlist.H);
            int i2 = DownloadingView.m;
            downloadingView2.a(a22, true);
            ((DownloadingView) r5.getValue()).setVisibility(!z ? 0 : 8);
        }
        tlo0.a aVar = tlo0.Companion;
        String str = playlist.h;
        String str2 = playlist.i;
        String str3 = "";
        if (str == null) {
            str = "";
        }
        vkTile.setTitle(new VkTile.e(oq.d(aVar, str), 0, null, null, playlist.k ? new gko(R.drawable.vk_icon_error_circle_fill_gray_12) : null, k1u0.c.a, null, 414));
        VkTile vkTile2 = this.i;
        if ((vkTile2 == null || (context = vkTile2.getContext()) == null) && (context = e43.a) == null) {
            context = null;
        }
        String obj = (xx1.u(playlist) ? str2 == null ? "" : str2 : (xx1.x(playlist) && xx1.w(playlist)) ? c9b0.d(context, playlist) : c9b0.g(context, playlist)).toString();
        if (obj.length() <= 0) {
            obj = null;
        }
        vkTile.setSubtitle(new VkTile.d(obj != null ? new tlo0.h(obj) : null, 0, null, null, null, null, 62));
        VkTile vkTile3 = this.i;
        if ((vkTile3 == null || (context2 = vkTile3.getContext()) == null) && (context2 = e43.a) == null) {
            context2 = null;
        }
        if (playlist.Eb()) {
            int i3 = playlist.l;
            boolean z2 = i3 != 0;
            boolean f = myc0.f(str2);
            str3 = (f && z2) ? context2.getString(R.string.music_dot_delimiter, Integer.valueOf(i3), str2) : f ? str2 : z2 ? String.valueOf(i3) : "";
        } else {
            Float f2 = uIBlockMusicPlaylist.A;
            if (f2 != null) {
                str3 = context2.getString(R.string.music_recommended_playlist_percentage_for_list, Integer.valueOf((int) (f2.floatValue() * 100)), uIBlockMusicPlaylist.B);
            }
        }
        String obj2 = str3.toString();
        if (obj2.length() <= 0) {
            obj2 = null;
        }
        vkTile.setExtraSubtitle(new VkTile.b(obj2 != null ? new tlo0.h(obj2) : null));
        vkTile.setVisualContentParams(new dfb0(playlist.m, playlist.p, this.b.m0().h() && e(), playlist.D));
    }

    public final boolean b(Activity activity) {
        UIBlockMusicPlaylist uIBlockMusicPlaylist;
        String str;
        return (this.f == null || (uIBlockMusicPlaylist = this.j) == null || (str = uIBlockMusicPlaylist.b) == null || !c(str) || !this.h.a(activity)) ? false : true;
    }

    @Override // xsna.cho
    public final void d(boolean z) {
        this.k = z;
    }

    public final boolean e() {
        Playlist playlist;
        u2b0 u2b0Var = this.b;
        if (!(u2b0Var.j() instanceof StartPlayPlaylistSource)) {
            return false;
        }
        UIBlockMusicPlaylist uIBlockMusicPlaylist = this.j;
        return epx.f((uIBlockMusicPlaylist == null || (playlist = uIBlockMusicPlaylist.z) == null) ? null : playlist.Ib(), u2b0Var.x0().Kb());
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        VkTile vkTile = new VkTile(layoutInflater.getContext(), null, 6);
        vkTile.setLayoutParams(new ViewGroup.LayoutParams(vkTile.getResources().getDimensionPixelSize(R.dimen.music_playlist_slider_layout_width), -2));
        vkTile.setTextAlignment(VkTile.TextAlignment.Start);
        vkTile.setVisualContentType(VkTile.VisualContentType.Other);
        vkTile.setDecorator(new a());
        t8b0 t8b0Var = new t8b0(vkTile, new b(0, this, MusicPlaylistVkTileVh.class, "handleDownloadingClick", "handleDownloadingClick()V", 0));
        ((LinearLayout) vkTile.findViewById(R.id.titleWrapper)).addView((DownloadingView) t8b0Var.b.getValue(), 0);
        this.m = t8b0Var;
        cfb0 cfb0Var = new cfb0(vkTile.getContext(), new c(0, this, MusicPlaylistVkTileVh.class, "handlePlayButtonClick", "handlePlayButtonClick()V", 0));
        vkTile.setVisualContentController(cfb0Var);
        this.l = cfb0Var;
        vkTile.setOnClickListener(new q01(this, 8));
        this.i = vkTile;
        return vkTile;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
