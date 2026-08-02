package com.vk.catalog2.feature.music.holders;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.CatalogOnboardingInfo;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.analytics.MusicAnalyticsInfo;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicPlaylist;
import com.vk.core.serialize.Serializer;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.Thumb;
import com.vk.dto.music.onboarding.OnboardingInfo;
import com.vk.imageloader.view.VKImageView;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.PlaySourceMeta;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.StartPlayPlaylistSource;
import com.vk.music.stats.AdsAudioPixelsContainer;
import com.vk.music.view.MusicRoundPlayView;
import com.vkontakte.android.R;
import java.util.List;
import xsna.b5a;
import xsna.b780;
import xsna.bv40;
import xsna.bwt0;
import xsna.c98;
import xsna.cfp0;
import xsna.cho;
import xsna.e3m;
import xsna.e43;
import xsna.epx;
import xsna.fl4;
import xsna.lqk0;
import xsna.lyd;
import xsna.u2b0;
import xsna.w550;
import xsna.y050;
import xsna.zaf0;

/* compiled from: MusicSmartPlaylistVh.kt */
/* loaded from: classes16.dex */
public final class MusicSmartPlaylistVh implements CatalogViewHolder, View.OnClickListener, cho {
    public final u2b0 b;
    public final zaf0 c;
    public final int d;
    public final fl4 e;
    public final b5a f;
    public UIBlock g;
    public Playlist h;
    public View i;
    public VKImageView j;
    public TextView k;
    public TextView l;
    public MusicRoundPlayView m;
    public View n;
    public final bv40 o;

    public MusicSmartPlaylistVh(u2b0 u2b0Var, zaf0 zaf0Var, b5a b5aVar) {
        fl4 g = lyd.g();
        this.b = u2b0Var;
        this.c = zaf0Var;
        this.d = R.layout.catalog_music_smart_playlist_slider;
        this.e = g;
        this.f = b5aVar;
        this.o = new bv40(u2b0Var, new w550(0, this, MusicSmartPlaylistVh.class, "isSamePlaylist", "isSamePlaylist()Z", 0, 0));
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        this.o.b();
        this.c.a();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        Context context;
        MusicRoundPlayView musicRoundPlayView;
        if (uIBlock instanceof UIBlockMusicPlaylist) {
            this.g = uIBlock;
            UIBlockMusicPlaylist uIBlockMusicPlaylist = (UIBlockMusicPlaylist) uIBlock;
            Playlist playlist = uIBlockMusicPlaylist.z;
            boolean f = epx.f(playlist, this.h);
            bv40 bv40Var = this.o;
            if (!f && (musicRoundPlayView = this.m) != null && musicRoundPlayView.a()) {
                bv40Var.f();
            }
            this.h = playlist;
            View view = this.i;
            String str = null;
            if ((view == null || (context = view.getContext()) == null) && (context = e43.a) == null) {
                context = null;
            }
            VKImageView vKImageView = this.j;
            if (vKImageView != null) {
                Thumb thumb = playlist.m;
                if (thumb != null) {
                    int a2 = e3m.a(R.dimen.music_smart_playlist_image_width, context);
                    Serializer.c<Thumb> cVar = Thumb.CREATOR;
                    str = thumb.Ab(a2, false);
                }
                vKImageView.s0(str);
            }
            TextView textView = this.k;
            if (textView != null) {
                textView.setText(playlist.h);
            }
            TextView textView2 = this.l;
            if (textView2 != null) {
                textView2.setText(playlist.i);
            }
            MusicRoundPlayView musicRoundPlayView2 = this.m;
            if (musicRoundPlayView2 != null) {
                bwt0.p0(musicRoundPlayView2, playlist.D);
            }
            float f2 = !playlist.B() ? 1.0f : 0.5f;
            TextView textView3 = this.k;
            if (textView3 != null) {
                textView3.setAlpha(f2);
            }
            TextView textView4 = this.l;
            if (textView4 != null) {
                textView4.setAlpha(f2);
            }
            VKImageView vKImageView2 = this.j;
            if (vKImageView2 != null) {
                vKImageView2.setAlpha(f2);
            }
            bv40Var.e();
            View view2 = this.i;
            if (view2 != null) {
                bwt0.Q(view2, R.id.catalog_ui_test_playlist, uIBlockMusicPlaylist.z.Hb());
            }
        }
    }

    public final boolean a() {
        u2b0 u2b0Var = this.b;
        if (!(u2b0Var.j() instanceof StartPlayPlaylistSource)) {
            return false;
        }
        Playlist playlist = this.h;
        return epx.f(playlist != null ? playlist.Ib() : null, u2b0Var.x0().Kb());
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.d();
        View inflate = layoutInflater.inflate(this.d, viewGroup, false);
        this.i = inflate;
        VKImageView vKImageView = (VKImageView) inflate.findViewById(R.id.playlist_image);
        View view = null;
        if (vKImageView != null) {
            vKImageView.W();
            vKImageView.setOnLoadCallback(new a(vKImageView));
        } else {
            vKImageView = null;
        }
        this.j = vKImageView;
        this.k = (TextView) inflate.findViewById(R.id.playlist_title);
        this.l = (TextView) inflate.findViewById(R.id.playlist_subtitle);
        MusicRoundPlayView musicRoundPlayView = (MusicRoundPlayView) inflate.findViewById(R.id.play_view);
        if (musicRoundPlayView != null) {
            this.o.a(musicRoundPlayView);
            musicRoundPlayView.setOnClickListener(new c98(this, 1));
        } else {
            musicRoundPlayView = null;
        }
        this.m = musicRoundPlayView;
        View findViewById = inflate.findViewById(R.id.playlist_menu);
        if (findViewById != null) {
            findViewById.setOnClickListener(new c98(this, 1));
            view = findViewById;
        }
        this.n = view;
        inflate.setOnClickListener(new c98(this, 1));
        return inflate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context;
        Activity h;
        Playlist playlist;
        CatalogOnboardingInfo catalogOnboardingInfo;
        MusicAnalyticsInfo.ClickTarget clickTarget;
        MusicAnalyticsInfo.ClickTarget clickTarget2;
        CatalogOnboardingInfo catalogOnboardingInfo2;
        if (view == null || (context = view.getContext()) == null || (h = e3m.h(context)) == null || (playlist = this.h) == null) {
            return;
        }
        if (view.getId() == R.id.playlist_menu) {
            UIBlock uIBlock = this.g;
            fl4.p(this.e, h, MusicPlaybackLaunchContext.Fb(uIBlock != null ? uIBlock.f : null), playlist, null, null, 24);
            return;
        }
        if (playlist.B()) {
            UIBlock uIBlock2 = this.g;
            fl4.p(this.e, h, MusicPlaybackLaunchContext.Fb(uIBlock2 != null ? uIBlock2.f : null), playlist, null, null, 24);
            return;
        }
        int id = view.getId();
        b5a b5aVar = this.f;
        zaf0 zaf0Var = this.c;
        if (id != R.id.play_view) {
            UIBlock uIBlock3 = this.g;
            if (zaf0Var.c((uIBlock3 == null || (catalogOnboardingInfo = uIBlock3.n) == null) ? null : new OnboardingInfo(catalogOnboardingInfo.c, catalogOnboardingInfo.b))) {
                return;
            }
            UIBlock uIBlock4 = this.g;
            if (uIBlock4 != null) {
                b5aVar.a(new cfp0(uIBlock4, new MusicAnalyticsInfo(MusicAnalyticsInfo.ClickTarget.Open)));
            }
            y050 U = this.e.U();
            UserId userId = playlist.c;
            int i = playlist.b;
            UIBlock uIBlock5 = this.g;
            U.a(h, new y050.b.C4065b(userId, i, null, uIBlock5 != null ? uIBlock5.f : null, uIBlock5 != null ? uIBlock5.b : null, null, 100));
            return;
        }
        MusicAnalyticsInfo.ClickTarget clickTarget3 = MusicAnalyticsInfo.ClickTarget.PlayAll;
        boolean a2 = a();
        u2b0 u2b0Var = this.b;
        if (a2) {
            clickTarget2 = u2b0Var.h() ? MusicAnalyticsInfo.ClickTarget.Pause : MusicAnalyticsInfo.ClickTarget.Play;
            u2b0Var.w1(new PlaybackActionMeta(6, 0L, 2, null));
        } else {
            MusicRoundPlayView musicRoundPlayView = this.m;
            if (musicRoundPlayView == null || musicRoundPlayView.a()) {
                clickTarget = clickTarget3;
            } else {
                this.o.c();
                UIBlock uIBlock6 = this.g;
                OnboardingInfo onboardingInfo = (uIBlock6 == null || (catalogOnboardingInfo2 = uIBlock6.n) == null) ? null : new OnboardingInfo(catalogOnboardingInfo2.c, catalogOnboardingInfo2.b);
                String str = playlist.x;
                UIBlock uIBlock7 = this.g;
                String str2 = uIBlock7 != null ? uIBlock7.b : null;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = uIBlock7 != null ? uIBlock7.c : null;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = playlist.h;
                if (str4 == null) {
                    str4 = "";
                }
                clickTarget = clickTarget3;
                StartPlayPlaylistSource startPlayPlaylistSource = new StartPlayPlaylistSource(new PlaySourceMeta.PlaylistPlaySourceMeta(str4, playlist.Eb(), playlist.c, playlist.b, playlist.O, playlist.z), str2, str3, str);
                UIBlock uIBlock8 = this.g;
                lqk0 lqk0Var = new lqk0(startPlayPlaylistSource, (MusicTrack) null, (List) null, MusicPlaybackLaunchContext.Fb(uIBlock8 != null ? uIBlock8.f : null).Db(playlist), 0, (ShuffleMode) null, PlayRequestTrigger.FAST_PLAY_TRACK_LIST, (AdsAudioPixelsContainer) null, 0L, 886);
                if (!zaf0Var.b(lqk0Var, onboardingInfo)) {
                    u2b0Var.N0(lqk0Var);
                }
            }
            clickTarget2 = clickTarget;
        }
        UIBlock uIBlock9 = this.g;
        if (uIBlock9 != null) {
            b5aVar.a(new cfp0(uIBlock9, new MusicAnalyticsInfo(clickTarget2)));
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

    /* compiled from: MusicSmartPlaylistVh.kt */
    public static final class a implements b780 {
        public final /* synthetic */ VKImageView b;

        public a(VKImageView vKImageView) {
            this.b = vKImageView;
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
