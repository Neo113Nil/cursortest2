package com.fyber.inneractive.sdk.player.controller;

import android.view.Surface;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters;
import com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener;
import com.fyber.inneractive.sdk.util.IAlog;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class b0 implements VideoRendererEventListener {
    public final WeakReference a;
    public boolean b = false;

    public b0(f fVar) {
        this.a = new WeakReference(fVar);
    }

    public final void a(int i, boolean z) {
        com.fyber.inneractive.sdk.player.exoplayer2.g gVar;
        IAlog.a("%sonPlayerStateChanged called with pwr = %s state = %d", a(), Boolean.valueOf(z), Integer.valueOf(i));
        f fVar = (f) this.a.get();
        if (fVar == null || (gVar = fVar.s) == null || fVar.z) {
            return;
        }
        if (i != 3) {
            if (i == 2) {
                if (fVar.e == com.fyber.inneractive.sdk.player.enums.b.Playing) {
                    fVar.a(com.fyber.inneractive.sdk.player.enums.b.Buffering);
                    return;
                }
                return;
            } else {
                if (i == 4) {
                    fVar.a(com.fyber.inneractive.sdk.player.enums.b.Completed);
                    return;
                }
                return;
            }
        }
        if (z) {
            fVar.a(com.fyber.inneractive.sdk.player.enums.b.Playing);
            return;
        }
        if (fVar.e == com.fyber.inneractive.sdk.player.enums.b.Preparing) {
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h hVar = gVar.o;
            if (hVar != null && hVar.a > 0) {
                com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b bVar = hVar.b[0];
                com.fyber.inneractive.sdk.player.exoplayer2.o oVar = bVar == null ? null : bVar.d[bVar.a()];
                if (oVar != null) {
                    int i2 = oVar.j;
                    int i3 = oVar.k;
                    fVar.t = i2;
                    fVar.u = i3;
                }
            }
            this.b = true;
            fVar.a(com.fyber.inneractive.sdk.player.enums.b.Prepared);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener
    public final void onVideoSizeChanged(int i, int i2, int i3, float f) {
        f fVar = (f) this.a.get();
        if (fVar != null) {
            fVar.t = i;
            fVar.u = i2;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener
    public final void onRenderedFirstFrame(Surface surface) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener
    public final void onVideoDisabled(DecoderCounters decoderCounters) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener
    public final void onVideoEnabled(DecoderCounters decoderCounters) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener
    public final void onVideoInputFormatChanged(com.fyber.inneractive.sdk.player.exoplayer2.o oVar) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener
    public final void onDroppedFrames(int i, long j) {
    }

    public final String a() {
        f fVar = (f) this.a.get();
        if (fVar == null) {
            return b0.class.getName();
        }
        return IAlog.a(fVar);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener
    public final void onVideoDecoderInitialized(String str, long j, long j2) {
    }
}
