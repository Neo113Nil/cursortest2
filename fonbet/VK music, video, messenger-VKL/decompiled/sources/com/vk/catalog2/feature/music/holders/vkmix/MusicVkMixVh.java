package com.vk.catalog2.feature.music.holders.vkmix;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.dto.api.CatalogOnboardingInfo;
import com.vk.catalog2.common.dto.api.music.AudioStreamMixTitles;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.feature.music.dto.ui.UiBlockMusicVkMix;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.onboarding.OnboardingInfo;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.mixsettings.MixOptionEntity;
import com.vk.music.mixsettings.MixSettingsEntity;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.PlayState;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.StartPlaySource;
import com.vk.music.player.StartPlayVkMixSource;
import com.vk.music.player.e;
import com.vk.music.player.f;
import com.vk.music.stats.AdsAudioPixelsContainer;
import com.vk.music.view.MusicRoundPlayView;
import java.util.HashSet;
import java.util.List;
import xsna.epx;
import xsna.fnj;
import xsna.g380;
import xsna.gzs;
import xsna.iah0;
import xsna.iy2;
import xsna.lqk0;
import xsna.u2b0;
import xsna.x4v0;
import xsna.zaf0;

/* compiled from: MusicVkMixVh.kt */
/* loaded from: classes16.dex */
public abstract class MusicVkMixVh<T extends UiBlockMusicVkMix> implements CatalogViewHolder, View.OnClickListener, g380, x4v0 {
    public final u2b0 b;
    public final zaf0 c;
    public final int d;
    public ViewGroup e;
    public LayoutInflater f;
    public final c g = new c(this);
    public final b h = new b(this);

    /* compiled from: MusicVkMixVh.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PlayState.values().length];
            try {
                iArr[PlayState.PAUSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PlayState.STOPPED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PlayState.PLAYING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: MusicVkMixVh.kt */
    public static final class b implements View.OnAttachStateChangeListener {
        public final /* synthetic */ MusicVkMixVh<T> b;

        public b(MusicVkMixVh<T> musicVkMixVh) {
            this.b = musicVkMixVh;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            MusicVkMixVh<T> musicVkMixVh = this.b;
            musicVkMixVh.b.P0(musicVkMixVh.g, false);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            MusicVkMixVh<T> musicVkMixVh = this.b;
            musicVkMixVh.b.n0(musicVkMixVh.g);
        }
    }

    /* compiled from: MusicVkMixVh.kt */
    public static final class c extends e.a {
        public final /* synthetic */ MusicVkMixVh<T> b;

        public c(MusicVkMixVh<T> musicVkMixVh) {
            this.b = musicVkMixVh;
        }

        @Override // com.vk.music.player.e.a, com.vk.music.player.e
        public final void N3(PlayState playState, f fVar) {
            this.b.j(playState);
        }
    }

    public MusicVkMixVh(u2b0 u2b0Var, zaf0 zaf0Var, int i) {
        this.b = u2b0Var;
        this.c = zaf0Var;
        this.d = i;
    }

    public static void h(MusicVkMixVh musicVkMixVh, boolean z, MixSettingsEntity mixSettingsEntity, gzs gzsVar, int i) {
        CatalogOnboardingInfo catalogOnboardingInfo;
        OnboardingInfo onboardingInfo = null;
        if ((i & 2) != 0) {
            mixSettingsEntity = null;
        }
        if ((i & 4) != 0) {
            gzsVar = new iy2(29);
        }
        u2b0 u2b0Var = musicVkMixVh.b;
        if (musicVkMixVh.e() && musicVkMixVh.g()) {
            UiBlockMusicVkMix b2 = musicVkMixVh.b();
            if (b2 != null && (catalogOnboardingInfo = b2.n) != null) {
                onboardingInfo = new OnboardingInfo(catalogOnboardingInfo.c, catalogOnboardingInfo.b);
            }
            if (!u2b0Var.h() && !musicVkMixVh.c.c(onboardingInfo)) {
                gzsVar.invoke();
            }
            u2b0Var.w1(new PlaybackActionMeta(6, 0L, 2, null));
            return;
        }
        if (z) {
            u2b0Var.stop(26);
            musicVkMixVh.a(MusicRoundPlayView.State.PAUSE);
            return;
        }
        if (musicVkMixVh.b() != null) {
            if (musicVkMixVh.e() && musicVkMixVh.g()) {
                u2b0Var.w1(new PlaybackActionMeta(6, 0L, 2, null));
            } else {
                l(musicVkMixVh, mixSettingsEntity, null, 2);
            }
        }
        musicVkMixVh.a(MusicRoundPlayView.State.BUFFERING);
        gzsVar.invoke();
    }

    public static void l(MusicVkMixVh musicVkMixVh, MixSettingsEntity mixSettingsEntity, Long l, int i) {
        AudioStreamMixTitles audioStreamMixTitles;
        String str;
        MixOptionEntity e;
        MixSettingsEntity mixSettingsEntity2 = (i & 1) != 0 ? null : mixSettingsEntity;
        Long l2 = (i & 2) != 0 ? null : l;
        UiBlockMusicVkMix b2 = musicVkMixVh.b();
        if (b2 != null) {
            CatalogOnboardingInfo catalogOnboardingInfo = b2.n;
            OnboardingInfo onboardingInfo = catalogOnboardingInfo != null ? new OnboardingInfo(catalogOnboardingInfo.c, catalogOnboardingInfo.b) : null;
            UiBlockMusicVkMix b3 = musicVkMixVh.b();
            boolean z = b3 != null ? b3.B : false;
            if (z) {
                if (mixSettingsEntity2 != null && (e = mixSettingsEntity2.e()) != null) {
                    str = e.c;
                }
                str = null;
            } else {
                UiBlockMusicVkMix b4 = musicVkMixVh.b();
                if (b4 != null && (audioStreamMixTitles = b4.z) != null) {
                    str = audioStreamMixTitles.b;
                }
                str = null;
            }
            OnboardingInfo onboardingInfo2 = onboardingInfo;
            String str2 = b2.b;
            String str3 = b2.c;
            String str4 = b2.y;
            MixSettingsEntity mixSettingsEntity3 = z ? mixSettingsEntity2 : null;
            if (str == null) {
                str = "";
            }
            lqk0 lqk0Var = new lqk0(new StartPlayVkMixSource(str2, str3, str4, z, str, mixSettingsEntity3, null, null, null, l2, 448, null), (MusicTrack) null, (List) null, MusicPlaybackLaunchContext.M.Bb(b2.b), 0, ShuffleMode.SHUFFLE_OFF, PlayRequestTrigger.FAST_PLAY_TRACK_LIST, (AdsAudioPixelsContainer) null, 0L, 822);
            if (musicVkMixVh.c.b(lqk0Var, onboardingInfo2)) {
                return;
            }
            musicVkMixVh.b.N0(lqk0Var);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public void L() {
        this.c.a();
        ViewGroup viewGroup = this.e;
        if (viewGroup != null) {
            viewGroup.removeOnAttachStateChangeListener(this.h);
        }
    }

    public abstract T b();

    public String c() {
        AudioStreamMixTitles audioStreamMixTitles;
        AudioStreamMixTitles audioStreamMixTitles2;
        AudioStreamMixTitles audioStreamMixTitles3;
        if (g() && this.b.m0().h()) {
            T b2 = b();
            String str = (b2 == null || (audioStreamMixTitles3 = b2.z) == null) ? null : audioStreamMixTitles3.c;
            if (str != null && str.length() != 0) {
                T b3 = b();
                if (b3 == null || (audioStreamMixTitles2 = b3.z) == null) {
                    return null;
                }
                return audioStreamMixTitles2.c;
            }
        }
        T b4 = b();
        if (b4 == null || (audioStreamMixTitles = b4.z) == null) {
            return null;
        }
        return audioStreamMixTitles.b;
    }

    public abstract void d();

    public final boolean e() {
        u2b0 u2b0Var = this.b;
        return !u2b0Var.m0().i() && (u2b0Var.j() instanceof StartPlayVkMixSource);
    }

    public final boolean g() {
        StartPlaySource j = this.b.j();
        StartPlayVkMixSource startPlayVkMixSource = j instanceof StartPlayVkMixSource ? (StartPlayVkMixSource) j : null;
        String str = startPlayVkMixSource != null ? startPlayVkMixSource.e : null;
        T b2 = b();
        String str2 = b2 != null ? b2.y : null;
        if (str2 == null) {
            str2 = "";
        }
        return epx.f(str, str2);
    }

    public void j(PlayState playState) {
        k(c());
        if (!e() || !g()) {
            if (this.b.m0() != PlayState.IDLE) {
                a(MusicRoundPlayView.State.PAUSE);
                return;
            }
            return;
        }
        int i = playState == null ? -1 : a.$EnumSwitchMapping$0[playState.ordinal()];
        if (i == 1 || i == 2) {
            a(MusicRoundPlayView.State.PAUSE);
        } else {
            if (i != 3) {
                return;
            }
            a(MusicRoundPlayView.State.PLAY);
        }
    }

    public abstract void k(String str);

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.d, viewGroup, false);
        this.e = inflate instanceof ViewGroup ? (ViewGroup) inflate : null;
        this.f = layoutInflater;
        d();
        ViewGroup viewGroup2 = this.e;
        if (viewGroup2 != null) {
            viewGroup2.addOnAttachStateChangeListener(this.h);
        }
        return inflate;
    }

    @Override // xsna.g380
    public void onConfigurationChanged(Configuration configuration) {
        Context context;
        ViewGroup viewGroup = this.e;
        if (viewGroup == null || (context = viewGroup.getContext()) == null) {
            return;
        }
        HashSet hashSet = iah0.a;
        if (fnj.d(context)) {
            return;
        }
        d();
        T b2 = b();
        if (b2 != null) {
            N6(b2);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public void yh(int i, UIBlock uIBlock) {
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
