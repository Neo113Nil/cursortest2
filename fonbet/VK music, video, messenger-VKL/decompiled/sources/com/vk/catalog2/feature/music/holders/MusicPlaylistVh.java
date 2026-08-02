package com.vk.catalog2.feature.music.holders;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.CatalogLaunchOrigin;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.analytics.MusicAnalyticsInfo;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicPlaylist;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.Thumb;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.design.view.download.DownloadingView;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.PlaySourceMeta;
import com.vk.music.player.PlayState;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.StartPlayPlaylistSource;
import com.vk.music.stats.AdsAudioPixelsContainer;
import com.vk.music.view.ThumbsImageView;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vkontakte.android.R;
import java.util.List;
import xsna.awt0;
import xsna.b5a;
import xsna.bi40;
import xsna.bwt0;
import xsna.c98;
import xsna.c9b0;
import xsna.cfp0;
import xsna.cho;
import xsna.di40;
import xsna.e3m;
import xsna.e43;
import xsna.epx;
import xsna.ey2;
import xsna.fl4;
import xsna.jnj;
import xsna.k840;
import xsna.lqk0;
import xsna.lyd;
import xsna.m33;
import xsna.myc0;
import xsna.p9a;
import xsna.s9a;
import xsna.sq40;
import xsna.u2b0;
import xsna.vq40;
import xsna.xx1;
import xsna.y050;

/* compiled from: MusicPlaylistVh.kt */
/* loaded from: classes16.dex */
public final class MusicPlaylistVh implements CatalogViewHolder, View.OnClickListener, cho {
    public final CatalogViewType b;
    public final int c;
    public final u2b0 d;
    public final b5a e;
    public final fl4 f;
    public final SearchStatInfoProvider g;
    public final sq40 h;
    public UIBlock i;
    public Playlist j;
    public View k;
    public ThumbsImageView l;
    public ImageView m;
    public TextView n;
    public DownloadingView o;
    public TextView p;
    public TextView q;
    public final vq40 r;
    public final int s;
    public final int t;
    public ImageView u;
    public View v;

    public MusicPlaylistVh(CatalogViewType catalogViewType, int i, u2b0 u2b0Var, b5a b5aVar, SearchStatInfoProvider searchStatInfoProvider, sq40 sq40Var) {
        fl4 g = lyd.g();
        this.b = catalogViewType;
        this.c = i;
        this.d = u2b0Var;
        this.e = b5aVar;
        this.f = g;
        this.g = searchStatInfoProvider;
        this.h = sq40Var;
        this.r = new vq40();
        this.s = R.drawable.vk_icon_play_24;
        this.t = R.drawable.vk_icon_pause_24;
    }

    public static MusicPlaybackLaunchContext a(int i, UIBlock uIBlock) {
        MusicPlaybackLaunchContext Fb = MusicPlaybackLaunchContext.Fb(uIBlock.f);
        String h = uIBlock.p.h();
        if (b(uIBlock.f)) {
            h = null;
        }
        if (h == null) {
            h = jnj.a(i);
        }
        return Fb.Cb(h);
    }

    public static boolean b(String str) {
        return s9a.b.contains(str) || epx.f(str, "offline_music_replacement_default");
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        if (uIBlock instanceof UIBlockMusicPlaylist) {
            this.i = uIBlock;
            UIBlockMusicPlaylist uIBlockMusicPlaylist = (UIBlockMusicPlaylist) uIBlock;
            Playlist playlist = uIBlockMusicPlaylist.z;
            this.j = playlist;
            Thumb thumb = playlist.m;
            String str = playlist.i;
            if (thumb != null) {
                ThumbsImageView thumbsImageView = this.l;
                if (thumbsImageView != null) {
                    thumbsImageView.setThumb(thumb);
                }
            } else {
                ThumbsImageView thumbsImageView2 = this.l;
                if (thumbsImageView2 != null) {
                    thumbsImageView2.setThumbs(playlist.p);
                }
            }
            DownloadingView downloadingView = this.o;
            if (downloadingView != null) {
                bi40 a = di40.a(playlist.H);
                int i = DownloadingView.m;
                downloadingView.a(a, true);
            }
            b(uIBlockMusicPlaylist.f);
            DownloadingView downloadingView2 = this.o;
            boolean z = (downloadingView2 != null ? downloadingView2.getShowNotLoaded() : false) && (playlist.v > 0 || !playlist.y.isEmpty());
            DownloadingView downloadingView3 = this.o;
            if (downloadingView3 != null) {
                awt0.v(downloadingView3, z);
            }
            TextView textView = this.n;
            if (textView != null) {
                textView.setText(playlist.h);
            }
            ImageView imageView = this.m;
            if (imageView != null) {
                imageView.setVisibility(playlist.k ? 0 : 8);
            }
            TextView textView2 = this.p;
            if (textView2 != null) {
                textView2.setMaxLines(xx1.x(playlist) ? 2 : 1);
            }
            TextView textView3 = this.p;
            String str2 = "";
            if (textView3 != null) {
                View view = this.k;
                if (view == null) {
                    view = null;
                }
                Context context = view.getContext();
                if (context == null && (context = e43.a) == null) {
                    context = null;
                }
                ey2.i(textView3, xx1.u(playlist) ? str == null ? "" : str : (xx1.x(playlist) && xx1.w(playlist)) ? c9b0.d(context, playlist) : c9b0.g(context, playlist));
            }
            TextView textView4 = this.q;
            if (textView4 != null) {
                View view2 = this.k;
                if (view2 == null) {
                    view2 = null;
                }
                Context context2 = view2.getContext();
                if (context2 == null && (context2 = e43.a) == null) {
                    context2 = null;
                }
                if (playlist.Eb()) {
                    int i2 = playlist.l;
                    boolean z2 = i2 != 0;
                    boolean f = myc0.f(str);
                    if (f && z2) {
                        str = context2.getString(R.string.music_dot_delimiter, Integer.valueOf(i2), str);
                    } else if (!f) {
                        str = z2 ? String.valueOf(i2) : "";
                    }
                    str2 = str;
                } else {
                    Float f2 = uIBlockMusicPlaylist.A;
                    if (f2 != null) {
                        str2 = context2.getString(R.string.music_recommended_playlist_percentage_for_list, Integer.valueOf((int) (f2.floatValue() * 100)), uIBlockMusicPlaylist.B);
                    }
                }
                ey2.i(textView4, str2);
            }
            ImageView imageView2 = this.u;
            if (imageView2 != null) {
                bwt0.p0(imageView2, playlist.D);
            }
            float f3 = !playlist.B() ? 1.0f : 0.5f;
            TextView textView5 = this.n;
            if (textView5 != null) {
                textView5.setAlpha(f3);
            }
            TextView textView6 = this.p;
            if (textView6 != null) {
                textView6.setAlpha(f3);
            }
            TextView textView7 = this.q;
            if (textView7 != null) {
                textView7.setAlpha(f3);
            }
            ThumbsImageView thumbsImageView3 = this.l;
            if (thumbsImageView3 != null) {
                thumbsImageView3.setAlpha(f3);
            }
            ImageView imageView3 = this.u;
            if (imageView3 != null) {
                u2b0 u2b0Var = this.d;
                PlayState m0 = (u2b0Var.m0().h() && c()) ? u2b0Var.m0() : PlayState.STOPPED;
                imageView3.setImageResource(m0.h() ? this.t : this.s);
                int i3 = m0.h() ? R.string.music_talkback_pause : R.string.music_talkback_play;
                View view3 = this.k;
                if (view3 == null) {
                    view3 = null;
                }
                Context context3 = view3.getContext();
                imageView3.setContentDescription(context3 != null ? context3.getString(i3) : null);
            }
            View view4 = this.k;
            bwt0.Q(view4 != null ? view4 : null, R.id.catalog_ui_test_playlist, uIBlockMusicPlaylist.z.Hb());
        }
    }

    public final boolean c() {
        u2b0 u2b0Var = this.d;
        if (!(u2b0Var.j() instanceof StartPlayPlaylistSource)) {
            return false;
        }
        Playlist playlist = this.j;
        return epx.f(playlist != null ? playlist.Ib() : null, u2b0Var.x0().Kb());
    }

    @Override // xsna.cho
    public final void d(boolean z) {
        DownloadingView downloadingView;
        View view = this.v;
        if (view != null) {
            bwt0.p0(view, !z);
        }
        Playlist playlist = this.j;
        if (playlist == null || (downloadingView = this.o) == null) {
            return;
        }
        bwt0.p0(downloadingView, !z && (playlist.v > 0 || !playlist.y.isEmpty()));
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context;
        int i = 0;
        View inflate = layoutInflater.inflate(this.c, viewGroup, false);
        this.k = inflate;
        this.l = (ThumbsImageView) inflate.findViewById(R.id.playlist_image);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.playlist_explicit);
        Context context2 = imageView.getContext();
        e3m.a aVar = e3m.a;
        imageView.setImageDrawable(m33.a(R.drawable.vk_icon_error_circle_fill_gray_12, context2));
        this.m = imageView;
        this.n = (TextView) inflate.findViewById(R.id.playlist_title);
        DownloadingView downloadingView = (DownloadingView) bwt0.q(inflate, R.id.downloading_container, null, 6);
        if (downloadingView != null) {
            downloadingView.setOnClickListener(new c98(this, 1));
        } else {
            downloadingView = null;
        }
        this.o = downloadingView;
        this.p = (TextView) inflate.findViewById(R.id.playlist_snippet1);
        this.q = (TextView) inflate.findViewById(R.id.playlist_snippet2);
        ImageView imageView2 = (ImageView) inflate.findViewById(R.id.playlist_play_button_on_cover);
        if (imageView2 != null) {
            imageView2.setOnClickListener(new c98(this, 1));
        } else {
            imageView2 = null;
        }
        this.u = imageView2;
        View findViewById = inflate.findViewById(R.id.playlist_menu);
        if (findViewById != null) {
            findViewById.setOnClickListener(new c98(this, 1));
        } else {
            findViewById = null;
        }
        this.v = findViewById;
        inflate.setOnClickListener(new c98(this, 1));
        CatalogViewType catalogViewType = this.b;
        if (catalogViewType.j()) {
            View view = this.k;
            if (view == null) {
                view = null;
            }
            if ((view == null || (context = view.getContext()) == null) && (context = e43.a) == null) {
                context = null;
            }
            if (catalogViewType.n()) {
                i = e3m.a(R.dimen.music_playlist_image, context);
            } else if (catalogViewType.j()) {
                i = e3m.a(R.dimen.music_playlist_slider_image_size, context);
            }
            View view2 = this.k;
            View view3 = view2 != null ? view2 : null;
            if (view3 != null) {
                bwt0.r0((e3m.a(R.dimen.music_playlist_slider_layout_padding, context) * 2) + i, view3);
            }
            ThumbsImageView thumbsImageView = this.l;
            if (thumbsImageView != null) {
                bwt0.m0(i, i, thumbsImageView);
            }
        }
        return inflate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context;
        Activity h;
        Playlist playlist;
        UIBlock uIBlock;
        SearchStatsLoggingInfo searchStatsLoggingInfo;
        UIBlock uIBlock2;
        String str;
        if (view == null || (context = view.getContext()) == null || (h = e3m.h(context)) == null || (playlist = this.j) == null || (uIBlock = this.i) == null) {
            return;
        }
        CatalogLaunchOrigin catalogLaunchOrigin = uIBlock.p;
        String str2 = uIBlock.f;
        SearchStatInfoProvider searchStatInfoProvider = this.g;
        if (searchStatInfoProvider != null) {
            searchStatsLoggingInfo = searchStatInfoProvider.b(playlist.Eb() ? SchemeStat$EventItem.Type.ALBUM : SchemeStat$EventItem.Type.PLAYLIST, playlist.F, false);
        } else {
            searchStatsLoggingInfo = null;
        }
        b5a b5aVar = this.e;
        p9a p9aVar = new p9a(b5aVar, uIBlock, searchStatsLoggingInfo);
        if (this.h == null || (uIBlock2 = this.i) == null || (str = uIBlock2.b) == null || !b(str) || !this.r.a(h)) {
            if (view.getId() == R.id.playlist_menu) {
                fl4.p(this.f, h, a(playlist.O, uIBlock), playlist, null, p9aVar, 8);
                return;
            }
            if (view.getId() == R.id.downloading_container) {
                if (epx.f(playlist.H, DownloadingState.NotLoaded.b)) {
                    k840.a.d().E(view.getContext(), playlist);
                    return;
                }
                return;
            }
            if (playlist.B()) {
                fl4.p(this.f, h, a(playlist.O, uIBlock), playlist, null, null, 24);
                return;
            }
            if (view.getId() != R.id.playlist_play_button_on_cover) {
                b5aVar.a(new cfp0(uIBlock, new MusicAnalyticsInfo(MusicAnalyticsInfo.ClickTarget.Open)));
                y050 U = this.f.U();
                String str3 = uIBlock.f;
                String str4 = uIBlock.b;
                String h2 = catalogLaunchOrigin.h();
                if (b(str2)) {
                    h2 = null;
                }
                if (h2 == null) {
                    h2 = jnj.a(playlist.O);
                }
                U.a(h, new y050.b.a(playlist, str3, str4, searchStatsLoggingInfo, h2));
                return;
            }
            boolean c = c();
            u2b0 u2b0Var = this.d;
            if (c) {
                u2b0Var.w1(new PlaybackActionMeta(6, 0L, 2, null));
                return;
            }
            String str5 = playlist.x;
            String str6 = uIBlock.b;
            String str7 = uIBlock.c;
            String str8 = playlist.h;
            if (str8 == null) {
                str8 = "";
            }
            u2b0Var.N0(new lqk0(new StartPlayPlaylistSource(new PlaySourceMeta.PlaylistPlaySourceMeta(str8, playlist.Eb(), playlist.c, playlist.b, playlist.O, playlist.z), str6, str7, str5), (MusicTrack) null, (List) null, MusicPlaybackLaunchContext.Fb(str2).Db(playlist).Cb(catalogLaunchOrigin.h()), 0, (ShuffleMode) null, PlayRequestTrigger.FAST_PLAY_TRACK_LIST, (AdsAudioPixelsContainer) null, 0L, 886));
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
