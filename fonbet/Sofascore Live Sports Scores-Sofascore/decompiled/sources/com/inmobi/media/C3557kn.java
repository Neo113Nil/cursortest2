package com.inmobi.media;

import androidx.annotation.Nullable;
import androidx.media3.exoplayer.ExoPlayer;
import defpackage.ale;
import defpackage.an0;
import defpackage.dke;
import defpackage.etj;
import defpackage.fc6;
import defpackage.g51;
import defpackage.h6c;
import defpackage.hke;
import defpackage.lj2;
import defpackage.ljg;
import defpackage.mij;
import defpackage.o74;
import defpackage.oed;
import defpackage.q6c;
import defpackage.ric;
import defpackage.ske;
import defpackage.uke;
import defpackage.uuj;
import defpackage.vg6;
import defpackage.wke;
import defpackage.x05;
import defpackage.yke;
import defpackage.zqk;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.kn, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3557kn implements wke {
    public final /* synthetic */ lj2 a;
    public final /* synthetic */ P2 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ InterfaceC3880x9 d;
    public final /* synthetic */ ExoPlayer e;

    public C3557kn(lj2 lj2Var, P2 p2, String str, InterfaceC3880x9 interfaceC3880x9, ExoPlayer exoPlayer) {
        this.a = lj2Var;
        this.b = p2;
        this.c = str;
        this.d = interfaceC3880x9;
        this.e = exoPlayer;
    }

    @Override // defpackage.wke
    public final void onPlaybackStateChanged(int i) {
        if (i == 3) {
            if (this.a.r() instanceof oed) {
                int a = this.b.a(this.c);
                InterfaceC3880x9 interfaceC3880x9 = this.d;
                if (interfaceC3880x9 != null) {
                    ((C3906y9) interfaceC3880x9).a("VideoLoaderHelper", ljg.j(a, "Media loaded successfully from URL with cache progress: "));
                }
                X4.a(this.a, new C3620n8(a, ((vg6) this.e).getDuration(), this.c));
            }
            ((vg6) this.e).z(this);
        }
    }

    @Override // defpackage.wke
    public final void onPlayerError(dke dkeVar) {
        dkeVar.getClass();
        InterfaceC3880x9 interfaceC3880x9 = this.d;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).b("VideoLoaderHelper", fc6.n("Failed to load URL (", this.c, "): ", dkeVar.getMessage()));
        }
        if (this.a.r() instanceof oed) {
            X4.a(this.a, new C3542k8(Zm.NETWORK));
        }
        ((vg6) this.e).z(this);
        ((vg6) this.e).stop();
        ((g51) this.e).t();
    }

    @Override // defpackage.wke
    @Deprecated
    public /* bridge */ /* synthetic */ void onCues(List list) {
    }

    @Override // defpackage.wke
    public /* bridge */ /* synthetic */ void onPositionDiscontinuity(yke ykeVar, yke ykeVar2, int i) {
    }

    @Override // defpackage.wke
    public /* bridge */ /* synthetic */ void onRenderedFirstFrame() {
    }

    public /* bridge */ /* synthetic */ void onAudioAttributesChanged(an0 an0Var) {
    }

    @Override // defpackage.wke
    public /* bridge */ /* synthetic */ void onAudioSessionIdChanged(int i) {
    }

    @Override // defpackage.wke
    public /* bridge */ /* synthetic */ void onAvailableCommandsChanged(ske skeVar) {
    }

    @Override // defpackage.wke
    public /* bridge */ /* synthetic */ void onCues(o74 o74Var) {
    }

    public /* bridge */ /* synthetic */ void onDeviceInfoChanged(x05 x05Var) {
    }

    @Override // defpackage.wke
    public /* bridge */ /* synthetic */ void onIsLoadingChanged(boolean z) {
    }

    @Override // defpackage.wke
    public /* bridge */ /* synthetic */ void onIsPlayingChanged(boolean z) {
    }

    @Override // defpackage.wke
    @Deprecated
    public /* bridge */ /* synthetic */ void onLoadingChanged(boolean z) {
    }

    public /* bridge */ /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j) {
    }

    @Override // defpackage.wke
    public /* bridge */ /* synthetic */ void onMediaMetadataChanged(q6c q6cVar) {
    }

    @Override // defpackage.wke
    public /* bridge */ /* synthetic */ void onMetadata(ric ricVar) {
    }

    @Override // defpackage.wke
    public /* bridge */ /* synthetic */ void onPlaybackParametersChanged(hke hkeVar) {
    }

    @Override // defpackage.wke
    public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
    }

    @Override // defpackage.wke
    public /* bridge */ /* synthetic */ void onPlayerErrorChanged(@Nullable dke dkeVar) {
    }

    public /* bridge */ /* synthetic */ void onPlaylistMetadataChanged(q6c q6cVar) {
    }

    @Override // defpackage.wke
    @Deprecated
    public /* bridge */ /* synthetic */ void onPositionDiscontinuity(int i) {
    }

    @Override // defpackage.wke
    public /* bridge */ /* synthetic */ void onRepeatModeChanged(int i) {
    }

    public /* bridge */ /* synthetic */ void onSeekBackIncrementChanged(long j) {
    }

    public /* bridge */ /* synthetic */ void onSeekForwardIncrementChanged(long j) {
    }

    @Override // defpackage.wke
    public /* bridge */ /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
    }

    @Override // defpackage.wke
    public /* bridge */ /* synthetic */ void onSkipSilenceEnabledChanged(boolean z) {
    }

    @Override // defpackage.wke
    public /* bridge */ /* synthetic */ void onTrackSelectionParametersChanged(etj etjVar) {
    }

    @Override // defpackage.wke
    public /* bridge */ /* synthetic */ void onTracksChanged(uuj uujVar) {
    }

    @Override // defpackage.wke
    public /* bridge */ /* synthetic */ void onVideoSizeChanged(zqk zqkVar) {
    }

    @Override // defpackage.wke
    public /* bridge */ /* synthetic */ void onVolumeChanged(float f) {
    }

    @Override // defpackage.wke
    public /* bridge */ /* synthetic */ void onDeviceVolumeChanged(int i, boolean z) {
    }

    @Override // defpackage.wke
    public /* bridge */ /* synthetic */ void onEvents(ale aleVar, uke ukeVar) {
    }

    @Override // defpackage.wke
    public /* bridge */ /* synthetic */ void onMediaItemTransition(@Nullable h6c h6cVar, int i) {
    }

    @Override // defpackage.wke
    public /* bridge */ /* synthetic */ void onPlayWhenReadyChanged(boolean z, int i) {
    }

    @Override // defpackage.wke
    @Deprecated
    public /* bridge */ /* synthetic */ void onPlayerStateChanged(boolean z, int i) {
    }

    @Override // defpackage.wke
    public /* bridge */ /* synthetic */ void onSurfaceSizeChanged(int i, int i2) {
    }

    @Override // defpackage.wke
    public /* bridge */ /* synthetic */ void onTimelineChanged(mij mijVar, int i) {
    }
}
