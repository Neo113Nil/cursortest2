package com.vk.catalog.mvi.block.music.impl.artists.mix;

import com.vk.catalog.mvi.block.music.impl.artists.mix.ArtistMix$ArtistMixState;
import com.vk.catalog.mvi.block.music.impl.entity.PlayingState;
import com.vk.catalog.mvi.block.music.models.MusicMviAnalyticsInfo;
import com.vk.music.mixsettings.MixSettingsEntity;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.music.player.StartPlaySource;
import com.vk.music.player.StartPlayVkMixSource;
import kotlin.NoWhenBranchMatchedException;
import xsna.b2a;
import xsna.drm0;
import xsna.epx;
import xsna.f4v0;
import xsna.g4v0;
import xsna.js3;
import xsna.ln50;
import xsna.p4v0;
import xsna.q4v0;
import xsna.rn50;
import xsna.tb;
import xsna.u1a;
import xsna.u2b0;
import xsna.w1a;
import xsna.yc40;
import xsna.yxw;

/* compiled from: ArtistMixActor.kt */
/* loaded from: classes16.dex */
public final class a extends u1a<ArtistMix$ArtistMixState, js3> {
    public final q4v0 c;
    public final u2b0 d;

    public a(b2a b2aVar, q4v0 q4v0Var, u2b0 u2b0Var) {
        super(b2aVar);
        this.c = q4v0Var;
        this.d = u2b0Var;
        w1a.a(this, new rn50("TASK_INIT"), ln50.a.b, new yxw(this, null));
    }

    @Override // xsna.u1a
    public final void g(js3 js3Var) {
        MixSettingsEntity mixSettingsEntity;
        b2a b2aVar = (b2a) this.b.b;
        if (!(js3Var instanceof js3.a)) {
            throw new NoWhenBranchMatchedException();
        }
        ArtistMix$ArtistMixState.ArtistMixPlayParams artistMixPlayParams = ((ArtistMix$ArtistMixState) b2aVar.getCurrentState()).d;
        String str = ((ArtistMix$ArtistMixState) b2aVar.getCurrentState()).j;
        if (str == null) {
            str = "";
        }
        boolean w = w();
        u2b0 u2b0Var = this.d;
        v(new yc40.g(str, new MusicMviAnalyticsInfo((w && u2b0Var.h()) ? MusicMviAnalyticsInfo.ClickTarget.Pause : MusicMviAnalyticsInfo.ClickTarget.Play)));
        if (w()) {
            u2b0Var.w1(new PlaybackActionMeta(6, 0L, 2, null));
            return;
        }
        PlayingState playingState = ((ArtistMix$ArtistMixState) b2aVar.getCurrentState()).f;
        PlayingState playingState2 = PlayingState.BUFFERING;
        if (playingState != playingState2) {
            m(new tb(playingState2, 9));
            String str2 = artistMixPlayParams.b;
            String str3 = artistMixPlayParams.c;
            String str4 = artistMixPlayParams.d;
            String str5 = artistMixPlayParams.e;
            String str6 = artistMixPlayParams.f;
            String str7 = artistMixPlayParams.g;
            String str8 = artistMixPlayParams.h;
            if (str8 == null || drm0.N(str8)) {
                g4v0.a(this, str2, str3, str4, str5, str6, str7, null);
                return;
            }
            StartPlaySource j = u2b0Var.j();
            StartPlayVkMixSource startPlayVkMixSource = j instanceof StartPlayVkMixSource ? (StartPlayVkMixSource) j : null;
            if (!epx.f(startPlayVkMixSource != null ? startPlayVkMixSource.e : null, str4) || (mixSettingsEntity = startPlayVkMixSource.h) == null) {
                w1a.a(this, new rn50("TASK_HANDLE_TOGGLE_VK_MIX"), ln50.a.b, new f4v0(this, str4, str8, str2, str3, str5, str6, str7, null));
                return;
            }
            MixSettingsEntity a = MixSettingsEntity.a(mixSettingsEntity, null, 15);
            a.f();
            p4v0.a.b(a, str8);
            g4v0.a(this, str2, str3, str4, str5, str6, str7, a);
        }
    }

    public final boolean w() {
        String str = ((ArtistMix$ArtistMixState) ((b2a) this.b.b).getCurrentState()).d.f;
        StartPlaySource j = this.d.j();
        StartPlayVkMixSource startPlayVkMixSource = j instanceof StartPlayVkMixSource ? (StartPlayVkMixSource) j : null;
        return epx.f(str, startPlayVkMixSource != null ? startPlayVkMixSource.j : null);
    }
}
