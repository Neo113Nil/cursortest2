package com.fyber.inneractive.sdk.player.exoplayer2.mediacodec;

import android.media.MediaCodec;
import com.fyber.inneractive.sdk.player.exoplayer2.o;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class b extends Exception {
    public b(o oVar, Exception exc, String str) {
        super("Decoder init failed: " + str + ", " + oVar, exc);
        String str2 = oVar.f;
        if (z.a < 21 || !(exc instanceof MediaCodec.CodecException)) {
            return;
        }
        ((MediaCodec.CodecException) exc).getDiagnosticInfo();
    }

    public b(o oVar, f fVar, int i) {
        super("Decoder init failed: [" + i + "], " + oVar, fVar);
        String str = oVar.f;
        Math.abs(i);
    }
}
