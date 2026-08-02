package com.inmobi.media;

import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import defpackage.ale;
import defpackage.an0;
import defpackage.dke;
import defpackage.etj;
import defpackage.g51;
import defpackage.h6c;
import defpackage.hke;
import defpackage.hs4;
import defpackage.hv9;
import defpackage.i9a;
import defpackage.jaa;
import defpackage.ku3;
import defpackage.lnb;
import defpackage.mij;
import defpackage.nik;
import defpackage.o74;
import defpackage.osj;
import defpackage.q6c;
import defpackage.ric;
import defpackage.rob;
import defpackage.ske;
import defpackage.suj;
import defpackage.uke;
import defpackage.uuj;
import defpackage.vg6;
import defpackage.wke;
import defpackage.x05;
import defpackage.xw3;
import defpackage.yke;
import defpackage.z45;
import defpackage.zqk;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class N7 implements wke {
    public final /* synthetic */ V7 a;

    public N7(V7 v7) {
        this.a = v7;
    }

    @Override // defpackage.wke
    public final void onIsLoadingChanged(boolean z) {
        V7 v7 = this.a;
        int i = 0;
        if (z) {
            v7.o.setVisibility(0);
        } else {
            v7.o.setVisibility(8);
        }
        if (((vg6) this.a.p).getPlaybackState() == 3) {
            g51 g51Var = (g51) this.a.p;
            if (g51Var.k(16)) {
                long bufferedPosition = g51Var.getBufferedPosition();
                long duration = g51Var.getDuration();
                if (bufferedPosition != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET && duration != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                    if (duration == 0) {
                        i = 100;
                    } else {
                        long G = i9a.G(bufferedPosition, 100L);
                        i = nik.j(jaa.M((G == Long.MAX_VALUE || G == Long.MIN_VALUE) ? bufferedPosition / (duration / 100) : G / duration), 0, 100);
                    }
                }
            }
            if (i == 100) {
                this.a.a(C3387e8.a);
            }
        }
    }

    @Override // defpackage.wke
    public final void onPlaybackStateChanged(int i) {
        if (i == 4) {
            InterfaceC3880x9 interfaceC3880x9 = this.a.b;
            if (interfaceC3880x9 != null) {
                ((C3906y9) interfaceC3880x9).b("HtmlMediaPlayer", "Playback ended");
            }
            C6 c6 = this.a.x;
            if (c6.g != 2) {
                c6.g = 2;
                long duration = ((vg6) c6.a).getDuration();
                ku3 ku3Var = c6.b;
                hs4 hs4Var = z45.a;
                xw3.L(ku3Var, rob.a.f, null, new C3903y6(c6, duration, null), 2);
            }
        }
    }

    @Override // defpackage.wke
    public final void onPlayerError(dke dkeVar) {
        dkeVar.getClass();
        InterfaceC3880x9 interfaceC3880x9 = this.a.b;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).a("HtmlMediaPlayer", "Playback error: ".concat(dkeVar.d()), dkeVar);
        }
        V7 v7 = this.a;
        v7.l.set(Jg.STATE_ERROR);
        V7 v72 = this.a;
        int i = dkeVar.a;
        v72.a(new C3698q8(dkeVar.d()));
        this.a.f();
    }

    @Override // defpackage.wke
    public final void onTracksChanged(uuj uujVar) {
        Object obj;
        uujVar.getClass();
        hv9 hv9Var = uujVar.a;
        hv9Var.getClass();
        Iterator<E> it = hv9Var.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((suj) obj).b.c == 2) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        suj sujVar = (suj) obj;
        if (sujVar != null) {
            osj osjVar = sujVar.b;
            V7 v7 = this.a;
            int i = osjVar.a;
            for (int i2 = 0; i2 < i; i2++) {
                androidx.media3.common.b bVar = osjVar.d[i2];
                bVar.getClass();
                InterfaceC3880x9 interfaceC3880x9 = v7.b;
                if (interfaceC3880x9 != null) {
                    int i3 = bVar.v;
                    int i4 = bVar.w;
                    String str = bVar.o;
                    StringBuilder s = lnb.s(i3, i4, "Metadata loaded: ", "x", ", ");
                    s.append(str);
                    ((C3906y9) interfaceC3880x9).b("HtmlMediaPlayer", s.toString());
                }
                v7.a(C3672p8.a);
            }
        }
    }

    @Override // defpackage.wke
    public final void onVideoSizeChanged(zqk zqkVar) {
        zqkVar.getClass();
        InterfaceC3880x9 interfaceC3880x9 = this.a.b;
        if (interfaceC3880x9 != null) {
            int i = zqkVar.a;
            int i2 = zqkVar.b;
            float f = zqkVar.c;
            StringBuilder s = lnb.s(i, i2, "onVideoSizeChanged: width=", ", height=", ", ratio=");
            s.append(f);
            ((C3906y9) interfaceC3880x9).b("HtmlMediaPlayer", s.toString());
        }
        this.a.i = (int) (zqkVar.a * zqkVar.c);
        this.a.j = zqkVar.b;
        V7 v7 = this.a;
        K1 k1 = v7.n;
        int i3 = v7.i;
        int i4 = this.a.j;
        k1.getClass();
        if (i3 > 0 && i4 > 0) {
            k1.a = i3 / i4;
            k1.requestLayout();
        }
        this.a.z.d.a(zqkVar.a, zqkVar.b);
    }

    @Override // defpackage.wke
    public final void onVolumeChanged(float f) {
        if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f == 1.0f) {
            return;
        }
        V7 v7 = this.a;
        boolean z = v7.y.e;
        v7.a(new C3843vo());
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
