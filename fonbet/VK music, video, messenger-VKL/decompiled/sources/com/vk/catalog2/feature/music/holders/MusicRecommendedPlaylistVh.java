package com.vk.catalog2.feature.music.holders;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.analytics.MusicAnalyticsInfo;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicPlaylist;
import com.vk.catalog2.feature.music.holders.MusicRecommendedPlaylistVh;
import com.vk.core.serialize.Serializer;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.PlaylistOwner;
import com.vk.dto.music.Thumb;
import com.vk.imageloader.view.VKImageView;
import com.vk.imageloader.view.VKOverlayImageView;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.PlaySourceMeta;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.StartPlayPlaylistSource;
import com.vk.music.stats.AdsAudioPixelsContainer;
import com.vk.music.view.MusicRoundPlayView;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.disposables.g;
import java.util.ArrayList;
import java.util.List;
import xsna.b5a;
import xsna.b780;
import xsna.baf0;
import xsna.bv40;
import xsna.bwt0;
import xsna.c5g;
import xsna.c98;
import xsna.c9b0;
import xsna.cfp0;
import xsna.cho;
import xsna.e3m;
import xsna.e43;
import xsna.epx;
import xsna.f4m;
import xsna.fl4;
import xsna.itx0;
import xsna.izs;
import xsna.l6u;
import xsna.lqk0;
import xsna.lyd;
import xsna.m33;
import xsna.myc0;
import xsna.n3a;
import xsna.nsp0;
import xsna.p350;
import xsna.q3a;
import xsna.r350;
import xsna.se50;
import xsna.tm;
import xsna.u2b0;
import xsna.ub50;
import xsna.y050;
import xsna.zf40;

/* compiled from: MusicRecommendedPlaylistVh.kt */
/* loaded from: classes16.dex */
public final class MusicRecommendedPlaylistVh implements CatalogViewHolder, View.OnClickListener, cho, itx0 {
    public final u2b0 b;
    public final int c;
    public final fl4 d;
    public final q3a e;
    public final b5a f;
    public UIBlockMusicPlaylist g;
    public final ArrayList h;
    public Playlist i;
    public View j;
    public View k;
    public VKOverlayImageView l;
    public TextView m;
    public TextView n;
    public TextView o;
    public TextView p;
    public VKImageView q;
    public baf0 r;
    public boolean s;
    public zf40 t;
    public MusicRoundPlayView u;
    public View v;
    public final g w;
    public final bv40 x;

    public MusicRecommendedPlaylistVh(u2b0 u2b0Var, q3a q3aVar, b5a b5aVar) {
        fl4 g = lyd.g();
        this.b = u2b0Var;
        this.c = R.layout.catalog_music_recommended_playlist_slider;
        this.d = g;
        this.e = q3aVar;
        this.f = b5aVar;
        this.h = new ArrayList();
        this.w = new g();
        this.x = new bv40(u2b0Var, new r350(0, this, MusicRecommendedPlaylistVh.class, "isSamePlaylist", "isSamePlaylist()Z", 0));
    }

    public static StartPlayPlaylistSource b(Playlist playlist, UIBlockMusicPlaylist uIBlockMusicPlaylist) {
        String str = playlist.x;
        String str2 = uIBlockMusicPlaylist != null ? uIBlockMusicPlaylist.b : null;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = uIBlockMusicPlaylist != null ? uIBlockMusicPlaylist.c : null;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = playlist.h;
        return new StartPlayPlaylistSource(new PlaySourceMeta.PlaylistPlaySourceMeta(str4 == null ? "" : str4, playlist.Eb(), playlist.c, playlist.b, playlist.O, playlist.z), str2, str3, str);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        this.w.dispose();
        this.x.b();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        Context context;
        q3a q3aVar;
        q<n3a> a2;
        c subscribe;
        Image image;
        ImageSize Cb;
        String str;
        VKImageView vKImageView;
        MusicRoundPlayView musicRoundPlayView;
        if (uIBlock instanceof UIBlockMusicPlaylist) {
            UIBlockMusicPlaylist uIBlockMusicPlaylist = (UIBlockMusicPlaylist) uIBlock;
            this.g = uIBlockMusicPlaylist;
            Playlist playlist = uIBlockMusicPlaylist.z;
            boolean f = epx.f(playlist, this.i);
            bv40 bv40Var = this.x;
            if (!f && (musicRoundPlayView = this.u) != null && musicRoundPlayView.a()) {
                bv40Var.f();
            }
            this.i = playlist;
            View view = this.j;
            if ((view == null || (context = view.getContext()) == null) && (context = e43.a) == null) {
                context = null;
            }
            String str2 = uIBlockMusicPlaylist.D;
            int i = 0;
            if (str2 == null) {
                Thumb thumb = playlist.m;
                if (thumb != null) {
                    int a3 = e3m.a(R.dimen.music_recommended_playlist_image_width, context);
                    Serializer.c<Thumb> cVar = Thumb.CREATOR;
                    str2 = thumb.Ab(a3, false);
                } else {
                    str2 = null;
                }
            }
            String str3 = uIBlockMusicPlaylist.C;
            if (str2 != null) {
                VKOverlayImageView vKOverlayImageView = this.l;
                if (vKOverlayImageView != null) {
                    vKOverlayImageView.s0(str2);
                }
                VKOverlayImageView vKOverlayImageView2 = this.l;
                if (vKOverlayImageView2 != null) {
                    vKOverlayImageView2.setOverlay(R.drawable.recommended_playlist_overlay);
                }
            } else if (myc0.f(str3)) {
                baf0 baf0Var = this.r;
                if (baf0Var == null) {
                    baf0Var = null;
                }
                baf0Var.a(Color.parseColor(str3));
                VKOverlayImageView vKOverlayImageView3 = this.l;
                if (vKOverlayImageView3 != null) {
                    baf0 baf0Var2 = this.r;
                    if (baf0Var2 == null) {
                        baf0Var2 = null;
                    }
                    vKOverlayImageView3.setImageDrawable(baf0Var2);
                }
                VKOverlayImageView vKOverlayImageView4 = this.l;
                if (vKOverlayImageView4 != null) {
                    vKOverlayImageView4.setOverlay((Drawable) null);
                }
            } else {
                VKOverlayImageView vKOverlayImageView5 = this.l;
                if (vKOverlayImageView5 != null) {
                    vKOverlayImageView5.W();
                }
                VKOverlayImageView vKOverlayImageView6 = this.l;
                if (vKOverlayImageView6 != null) {
                    vKOverlayImageView6.setOverlay((Drawable) null);
                }
            }
            TextView textView = this.m;
            if (textView != null) {
                textView.setText(playlist.h);
            }
            TextView textView2 = this.n;
            if (textView2 != null) {
                Float f2 = uIBlockMusicPlaylist.A;
                textView2.setText(f2 == null ? "" : context.getString(R.string.music_recommended_playlist_percentage, Integer.valueOf((int) (f2.floatValue() * 100))));
            }
            TextView textView3 = this.o;
            if (textView3 != null) {
                textView3.setText(context.getString(R.string.music_recommended_playlist_percentage_title, uIBlockMusicPlaylist.B));
            }
            if (uIBlockMusicPlaylist.E) {
                String g = c9b0.g(context, playlist);
                TextView textView4 = this.p;
                if (textView4 != null) {
                    if (playlist.J) {
                        g = context.getString(R.string.music_recommended_playlist_curator, g);
                    }
                    textView4.setText(g);
                }
                PlaylistOwner playlistOwner = playlist.q;
                if (playlistOwner != null && (image = playlistOwner.h) != null && (Cb = image.Cb(e3m.a(R.dimen.music_recommended_playlist_owner_size, context), true, false)) != null && (str = Cb.d.d) != null && (vKImageView = this.q) != null) {
                    vKImageView.s0(str);
                }
                TextView textView5 = this.p;
                if (textView5 != null) {
                    bwt0.p0(textView5, true);
                }
                VKImageView vKImageView2 = this.q;
                if (vKImageView2 != null) {
                    bwt0.p0(vKImageView2, true);
                }
                TextView textView6 = this.m;
                if (textView6 != null) {
                    f4m.q(e3m.a(R.dimen.recommended_playlist_title_with_subtitle_offset, context), textView6);
                }
            } else {
                TextView textView7 = this.p;
                if (textView7 != null) {
                    bwt0.p0(textView7, false);
                }
                VKImageView vKImageView3 = this.q;
                if (vKImageView3 != null) {
                    bwt0.p0(vKImageView3, false);
                }
                TextView textView8 = this.m;
                if (textView8 != null) {
                    f4m.q(e3m.a(R.dimen.recommended_playlist_title_no_subtitle_offset, context), textView8);
                }
            }
            MusicRoundPlayView musicRoundPlayView2 = this.u;
            if (musicRoundPlayView2 != null) {
                bwt0.p0(musicRoundPlayView2, true);
            }
            float f3 = !playlist.B() ? 1.0f : 0.5f;
            TextView textView9 = this.m;
            if (textView9 != null) {
                textView9.setAlpha(f3);
            }
            VKOverlayImageView vKOverlayImageView7 = this.l;
            if (vKOverlayImageView7 != null) {
                vKOverlayImageView7.setAlpha(f3);
            }
            bv40Var.e();
            View view2 = this.j;
            if (view2 != null) {
                bwt0.Q(view2, R.id.catalog_ui_test_playlist, uIBlockMusicPlaylist.z.Hb());
            }
            for (int i2 = 0; i2 < 3; i2++) {
                int size = playlist.y.size();
                ArrayList arrayList = this.h;
                if (size > i2) {
                    ((se50) arrayList.get(i2)).itemView.setVisibility(0);
                    ((se50) arrayList.get(i2)).V5("", false, i2, playlist.y.get(i2));
                } else {
                    ((se50) arrayList.get(i2)).itemView.setVisibility(4);
                }
            }
            if (uIBlock.u != 1 || !this.s || (q3aVar = this.e) == null || (a2 = q3aVar.a()) == null || (subscribe = a2.b0(nsp0.class).t0(1L).subscribe(new p350(new l6u(this, 20), i))) == null) {
                return;
            }
            this.w.b(subscribe);
        }
    }

    @Override // xsna.itx0
    public final void a(boolean z) {
        this.s = z;
    }

    @Override // xsna.itx0
    public final void c(zf40 zf40Var) {
        this.t = zf40Var;
    }

    public final boolean e() {
        u2b0 u2b0Var = this.b;
        if (!(u2b0Var.j() instanceof StartPlayPlaylistSource)) {
            return false;
        }
        Playlist playlist = this.i;
        return epx.f(playlist != null ? playlist.Ib() : null, u2b0Var.x0().Kb());
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        se50 b;
        View inflate = layoutInflater.inflate(this.c, viewGroup, false);
        this.j = inflate;
        VKOverlayImageView vKOverlayImageView = (VKOverlayImageView) inflate.findViewById(R.id.playlist_image);
        vKOverlayImageView.setOnClickListener(new c98(this, 1));
        vKOverlayImageView.W();
        vKOverlayImageView.setOnLoadCallback(new a(vKOverlayImageView));
        this.l = vKOverlayImageView;
        this.k = inflate.findViewById(R.id.playlist_track_1);
        this.m = (TextView) inflate.findViewById(R.id.playlist_title);
        this.n = (TextView) inflate.findViewById(R.id.match_percent);
        this.o = (TextView) inflate.findViewById(R.id.match_label);
        this.p = (TextView) inflate.findViewById(R.id.playlist_owner);
        this.q = (VKImageView) inflate.findViewById(R.id.playlist_owner_picture);
        MusicRoundPlayView musicRoundPlayView = (MusicRoundPlayView) inflate.findViewById(R.id.play_view);
        if (musicRoundPlayView != null) {
            this.x.a(musicRoundPlayView);
            musicRoundPlayView.setOnClickListener(new c98(this, 1));
        } else {
            musicRoundPlayView = null;
        }
        this.u = musicRoundPlayView;
        View findViewById = inflate.findViewById(R.id.playlist_menu);
        if (findViewById != null) {
            findViewById.setOnClickListener(new c98(this, 1));
        } else {
            findViewById = null;
        }
        this.v = findViewById;
        inflate.setOnClickListener(new c98(this, 1));
        List l = e43.l(Integer.valueOf(R.id.playlist_track_1), Integer.valueOf(R.id.playlist_track_2), Integer.valueOf(R.id.playlist_track_3));
        ArrayList arrayList = new ArrayList(c5g.u(l, 10));
        final int i = 0;
        for (Object obj : l) {
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            final View findViewById2 = inflate.findViewById(((Number) obj).intValue());
            ub50 ub50Var = new ub50(null);
            ub50Var.h = findViewById2;
            ub50Var.m = this.b;
            b = ub50Var.b(null, null, (r19 & 4) != 0 ? null : new tm(this, i, 1), (r19 & 8) != 0 ? null : new izs() { // from class: xsna.q350
                @Override // xsna.izs
                public final Object invoke(Object obj2) {
                    boolean z;
                    int i3;
                    Context context = findViewById2.getContext();
                    Activity h = context != null ? e3m.h(context) : null;
                    MusicRecommendedPlaylistVh musicRecommendedPlaylistVh = MusicRecommendedPlaylistVh.this;
                    Playlist playlist = musicRecommendedPlaylistVh.i;
                    UIBlockMusicPlaylist uIBlockMusicPlaylist = musicRecommendedPlaylistVh.g;
                    String str = uIBlockMusicPlaylist != null ? uIBlockMusicPlaylist.f : null;
                    if (h == null || playlist == null || str == null || (i3 = i) < 0 || i3 >= playlist.y.size()) {
                        z = false;
                    } else {
                        fl4 fl4Var = musicRecommendedPlaylistVh.d;
                        MusicTrack musicTrack = playlist.y.get(i3);
                        MusicPlaybackLaunchContext Db = MusicPlaybackLaunchContext.Fb(str).Db(playlist);
                        UIBlockMusicPlaylist uIBlockMusicPlaylist2 = musicRecommendedPlaylistVh.g;
                        String str2 = uIBlockMusicPlaylist2 != null ? uIBlockMusicPlaylist2.c : null;
                        if (str2 == null) {
                            str2 = "";
                        }
                        fl4Var.k(h, musicTrack, Db, str2);
                        z = true;
                    }
                    return Boolean.valueOf(z);
                }
            }, null, null, (r19 & 64) != 0 ? null : null, null, null, false, false);
            arrayList.add(b);
            i = i2;
        }
        this.h.addAll(arrayList);
        this.r = new baf0(m33.a(R.drawable.playlist_cover_placeholder, layoutInflater.getContext()), 0);
        return inflate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context;
        Activity h;
        Playlist playlist;
        if (view == null || (context = view.getContext()) == null || (h = e3m.h(context)) == null || (playlist = this.i) == null) {
            return;
        }
        if (playlist.B()) {
            UIBlockMusicPlaylist uIBlockMusicPlaylist = this.g;
            fl4.p(this.d, h, MusicPlaybackLaunchContext.Fb(uIBlockMusicPlaylist != null ? uIBlockMusicPlaylist.f : null), playlist, null, null, 24);
            return;
        }
        int id = view.getId();
        b5a b5aVar = this.f;
        if (id != R.id.play_view) {
            if (view.getId() == R.id.playlist_image) {
                UIBlockMusicPlaylist uIBlockMusicPlaylist2 = this.g;
                if (uIBlockMusicPlaylist2 != null) {
                    b5aVar.a(new cfp0(uIBlockMusicPlaylist2, new MusicAnalyticsInfo(MusicAnalyticsInfo.ClickTarget.Open)));
                }
                y050 U = this.d.U();
                UIBlockMusicPlaylist uIBlockMusicPlaylist3 = this.g;
                U.a(h, new y050.b.a(playlist, uIBlockMusicPlaylist3 != null ? uIBlockMusicPlaylist3.f : null, uIBlockMusicPlaylist3 != null ? uIBlockMusicPlaylist3.b : null, null, null, 24));
                return;
            }
            return;
        }
        MusicAnalyticsInfo.ClickTarget clickTarget = MusicAnalyticsInfo.ClickTarget.PlayAll;
        boolean e = e();
        u2b0 u2b0Var = this.b;
        if (e) {
            clickTarget = u2b0Var.h() ? MusicAnalyticsInfo.ClickTarget.Pause : MusicAnalyticsInfo.ClickTarget.Play;
            u2b0Var.w1(new PlaybackActionMeta(6, 0L, 2, null));
        } else {
            MusicRoundPlayView musicRoundPlayView = this.u;
            if (musicRoundPlayView != null && !musicRoundPlayView.a()) {
                this.x.c();
                StartPlayPlaylistSource b = b(playlist, this.g);
                List<MusicTrack> list = playlist.y;
                UIBlockMusicPlaylist uIBlockMusicPlaylist4 = this.g;
                u2b0Var.N0(new lqk0(b, (MusicTrack) null, list, MusicPlaybackLaunchContext.Fb(uIBlockMusicPlaylist4 != null ? uIBlockMusicPlaylist4.f : null).Db(playlist), 0, (ShuffleMode) null, PlayRequestTrigger.FAST_PLAY_TRACK_LIST, (AdsAudioPixelsContainer) null, 0L, 882));
            }
        }
        UIBlockMusicPlaylist uIBlockMusicPlaylist5 = this.g;
        if (uIBlockMusicPlaylist5 != null) {
            b5aVar.a(new cfp0(uIBlockMusicPlaylist5, new MusicAnalyticsInfo(clickTarget)));
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

    /* compiled from: MusicRecommendedPlaylistVh.kt */
    public static final class a implements b780 {
        public final /* synthetic */ VKOverlayImageView b;

        public a(VKOverlayImageView vKOverlayImageView) {
            this.b = vKOverlayImageView;
        }

        @Override // xsna.b780
        public final void b(String str, Throwable th) {
            this.b.W();
        }

        @Override // xsna.b780
        public final void g(String str) {
        }

        @Override // xsna.b780
        public final void onCancel(String str) {
        }

        @Override // xsna.b780
        public final void t(int i, int i2, String str) {
        }
    }

    @Override // xsna.cho
    public final void d(boolean z) {
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
