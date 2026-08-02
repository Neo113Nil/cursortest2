package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zzwm implements zzvp {
    public final MediaCodec a;
    public final zzvl b;

    public /* synthetic */ zzwm(MediaCodec mediaCodec, zzvl zzvlVar) {
        this.a = mediaCodec;
        this.b = zzvlVar;
        if (Build.VERSION.SDK_INT < 35 || zzvlVar == null) {
            return;
        }
        zzvlVar.b(mediaCodec);
    }

    @Override // com.google.android.gms.internal.ads.zzvp
    public final void B(int i, int i2, int i3, long j) {
        this.a.queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzvp
    public final void a(ArrayList arrayList) {
        this.a.subscribeToVendorParameters(arrayList);
    }

    @Override // com.google.android.gms.internal.ads.zzvp
    public final void b(int i, zziv zzivVar, long j, int i2) {
        this.a.queueSecureInputBuffer(i, 0, zzivVar.i, j, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzvp
    public final ByteBuffer g(int i) {
        return this.a.getInputBuffer(i);
    }

    @Override // com.google.android.gms.internal.ads.zzvp
    public final void j(Bundle bundle) {
        this.a.setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzvp
    public final void k(int i) {
        this.a.releaseOutputBuffer(i, false);
    }

    @Override // com.google.android.gms.internal.ads.zzvp
    public final ByteBuffer p(int i) {
        return this.a.getOutputBuffer(i);
    }

    @Override // com.google.android.gms.internal.ads.zzvp
    public final void r(Surface surface) {
        this.a.setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzvp
    public final int u(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzvp
    public final void w(int i, long j) {
        this.a.releaseOutputBuffer(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzvp
    public final void y(int i) {
        this.a.setVideoScalingMode(i);
    }

    @Override // com.google.android.gms.internal.ads.zzvp
    public final int zze() {
        return this.a.dequeueInputBuffer(0L);
    }

    @Override // com.google.android.gms.internal.ads.zzvp
    public final MediaFormat zzg() {
        return this.a.getOutputFormat();
    }

    @Override // com.google.android.gms.internal.ads.zzvp
    public final void zzk() {
        this.a.flush();
    }

    @Override // com.google.android.gms.internal.ads.zzvp
    public final void zzl() {
        zzvl zzvlVar = this.b;
        MediaCodec mediaCodec = this.a;
        try {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30 && i < 33) {
                mediaCodec.stop();
            }
            if (i >= 35 && zzvlVar != null) {
                zzvlVar.c(mediaCodec);
            }
            mediaCodec.release();
        } catch (Throwable th) {
            if (Build.VERSION.SDK_INT >= 35 && zzvlVar != null) {
                zzvlVar.c(mediaCodec);
            }
            mediaCodec.release();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvp
    public final void zzo() {
        this.a.detachOutputSurface();
    }
}
