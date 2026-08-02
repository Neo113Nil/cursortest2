package com.vk.catalog2.feature.music.holders;

import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.CatalogLaunchOrigin;
import com.vk.catalog2.common.dto.api.CatalogOnboardingInfo;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.analytics.MusicAnalyticsInfo;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicPlaylist;
import com.vk.core.ui.tracking.UiTrackingScreen;
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
import xsna.epx;
import xsna.jnj;
import xsna.lqk0;
import xsna.mij;
import xsna.u2b0;
import xsna.zaf0;
import xsna.zik0;

/* compiled from: MusicMoodPlaylistVh.kt */
/* loaded from: classes16.dex */
public final class MusicMoodPlaylistVh implements CatalogViewHolder, View.OnClickListener, cho {
    public final u2b0 b;
    public final int c;
    public final b5a d;
    public final zaf0 e;
    public UIBlock f;
    public Playlist g;
    public View h;
    public VKImageView i;
    public TextView j;
    public MusicRoundPlayView k;
    public final bv40 l;

    public MusicMoodPlaylistVh(int i, b5a b5aVar, u2b0 u2b0Var, zaf0 zaf0Var) {
        this.b = u2b0Var;
        this.c = i;
        this.d = b5aVar;
        this.e = zaf0Var;
        this.l = new bv40(u2b0Var, new mij(0, this, MusicMoodPlaylistVh.class, "isSamePlaylist", "isSamePlaylist()Z", 0, 4));
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        this.l.b();
        this.e.a();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        MusicRoundPlayView musicRoundPlayView;
        if (uIBlock instanceof UIBlockMusicPlaylist) {
            this.f = uIBlock;
            UIBlockMusicPlaylist uIBlockMusicPlaylist = (UIBlockMusicPlaylist) uIBlock;
            Playlist playlist = uIBlockMusicPlaylist.z;
            boolean f = epx.f(playlist, this.g);
            bv40 bv40Var = this.l;
            if (!f && (musicRoundPlayView = this.k) != null && musicRoundPlayView.a()) {
                bv40Var.f();
            }
            this.g = playlist;
            Thumb thumb = playlist.m;
            VKImageView vKImageView = this.i;
            if (vKImageView != null) {
                Uri uri = null;
                if (thumb != null) {
                    SparseArray<Uri> sparseArray = thumb.e;
                    if (!zik0.c(sparseArray)) {
                        int i = 0;
                        int keyAt = sparseArray.keyAt(0);
                        int size = sparseArray.size();
                        for (int i2 = 1; i2 < size; i2++) {
                            int keyAt2 = sparseArray.keyAt(i2);
                            if (keyAt2 > keyAt) {
                                i = i2;
                                keyAt = keyAt2;
                            }
                        }
                        uri = Thumb.Eb(sparseArray, i);
                    }
                }
                vKImageView.s0(String.valueOf(uri));
            }
            TextView textView = this.j;
            if (textView != null) {
                textView.setText(playlist.h);
            }
            MusicRoundPlayView musicRoundPlayView2 = this.k;
            if (musicRoundPlayView2 != null) {
                bwt0.p0(musicRoundPlayView2, playlist.D);
            }
            float f2 = !playlist.B() ? 1.0f : 0.5f;
            TextView textView2 = this.j;
            if (textView2 != null) {
                textView2.setAlpha(f2);
            }
            VKImageView vKImageView2 = this.i;
            if (vKImageView2 != null) {
                vKImageView2.setAlpha(f2);
            }
            bv40Var.e();
            View view = this.h;
            if (view != null) {
                bwt0.Q(view, R.id.catalog_ui_test_playlist, uIBlockMusicPlaylist.z.Hb());
            }
        }
    }

    public final boolean a() {
        u2b0 u2b0Var = this.b;
        if (!(u2b0Var.j() instanceof StartPlayPlaylistSource)) {
            return false;
        }
        Playlist playlist = this.g;
        return epx.f(playlist != null ? playlist.Ib() : null, u2b0Var.x0().Kb());
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.e.d();
        View inflate = layoutInflater.inflate(this.c, viewGroup, false);
        this.h = inflate;
        VKImageView vKImageView = (VKImageView) inflate.findViewById(R.id.playlist_image);
        if (vKImageView != null) {
            vKImageView.W();
            vKImageView.setOnLoadCallback(new a(vKImageView));
        } else {
            vKImageView = null;
        }
        this.i = vKImageView;
        View view = this.h;
        if (view != null) {
            view.setOnClickListener(new c98(this, 1));
        }
        this.j = (TextView) inflate.findViewById(R.id.playlist_title);
        MusicRoundPlayView musicRoundPlayView = (MusicRoundPlayView) inflate.findViewById(R.id.play_view);
        this.l.a(musicRoundPlayView);
        this.k = musicRoundPlayView;
        return inflate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String a2;
        CatalogLaunchOrigin catalogLaunchOrigin;
        CatalogOnboardingInfo catalogOnboardingInfo;
        Playlist playlist = this.g;
        if (playlist == null || view == null) {
            return;
        }
        MusicAnalyticsInfo.ClickTarget clickTarget = MusicAnalyticsInfo.ClickTarget.PlayAll;
        boolean a3 = a();
        u2b0 u2b0Var = this.b;
        if (a3) {
            clickTarget = u2b0Var.h() ? MusicAnalyticsInfo.ClickTarget.Pause : MusicAnalyticsInfo.ClickTarget.Play;
            u2b0Var.w1(new PlaybackActionMeta(6, 0L, 2, null));
        } else {
            this.l.c();
            UIBlock uIBlock = this.f;
            OnboardingInfo onboardingInfo = (uIBlock == null || (catalogOnboardingInfo = uIBlock.n) == null) ? null : new OnboardingInfo(catalogOnboardingInfo.c, catalogOnboardingInfo.b);
            UIBlock uIBlock2 = this.f;
            MusicPlaybackLaunchContext Db = MusicPlaybackLaunchContext.Fb(uIBlock2 != null ? uIBlock2.f : null).Db(playlist);
            UIBlock uIBlock3 = this.f;
            if (uIBlock3 == null || (catalogLaunchOrigin = uIBlock3.p) == null || (a2 = catalogLaunchOrigin.h()) == null) {
                a2 = jnj.a(playlist.O);
            }
            MusicPlaybackLaunchContext Cb = Db.Cb(a2);
            String str = playlist.x;
            UIBlock uIBlock4 = this.f;
            String str2 = uIBlock4 != null ? uIBlock4.b : null;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = uIBlock4 != null ? uIBlock4.c : null;
            if (str3 == null) {
                str3 = "";
            }
            String str4 = playlist.h;
            lqk0 lqk0Var = new lqk0(new StartPlayPlaylistSource(new PlaySourceMeta.PlaylistPlaySourceMeta(str4 == null ? "" : str4, playlist.Eb(), playlist.c, playlist.b, playlist.O, playlist.z), str2, str3, str), (MusicTrack) null, (List) null, Cb, 0, (ShuffleMode) null, PlayRequestTrigger.FAST_PLAY_TRACK_LIST, (AdsAudioPixelsContainer) null, 0L, 886);
            if (!this.e.b(lqk0Var, onboardingInfo)) {
                u2b0Var.N0(lqk0Var);
            }
        }
        UIBlock uIBlock5 = this.f;
        if (uIBlock5 != null) {
            this.d.a(new cfp0(uIBlock5, new MusicAnalyticsInfo(clickTarget)));
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

    /* compiled from: MusicMoodPlaylistVh.kt */
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
