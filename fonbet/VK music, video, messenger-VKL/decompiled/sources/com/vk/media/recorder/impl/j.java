package com.vk.media.recorder.impl;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.util.Log;
import android.view.Surface;
import com.vk.media.recorder.impl.Streamer;
import xsna.ajp;

/* compiled from: VideoListenerSurface.java */
@TargetApi(18)
/* loaded from: classes3.dex */
public final class j extends i {
    public Surface q;

    public final void c() {
        this.e.b.setInteger("color-format", 2130708361);
        this.e.a.setCallback(this.i, this.n);
        b bVar = this.e;
        MediaCodec mediaCodec = bVar.a;
        if (mediaCodec != null && bVar.d == ajp.a.Uninitialized) {
            mediaCodec.configure(bVar.b, (Surface) null, (MediaCrypto) null, 1);
            bVar.d = ajp.a.Configured;
        }
        this.q = this.e.a.createInputSurface();
        b bVar2 = this.e;
        MediaCodec mediaCodec2 = bVar2.a;
        if (mediaCodec2 == null || bVar2.d != ajp.a.Configured) {
            return;
        }
        mediaCodec2.start();
        bVar2.d = ajp.a.Executing;
    }

    public final void d(b bVar) {
        if (bVar == null || bVar.a == null) {
            throw new IllegalArgumentException();
        }
        try {
            this.e = bVar;
            c();
        } catch (Exception e) {
            Log.e(com.mbridge.msdk.foundation.same.report.j.b, Log.getStackTraceString(e));
            b(e instanceof MediaCodec.CodecException ? Streamer.CAPTURE_STATE.ENCODER_FAIL : Streamer.CAPTURE_STATE.FAILED);
        }
    }
}
