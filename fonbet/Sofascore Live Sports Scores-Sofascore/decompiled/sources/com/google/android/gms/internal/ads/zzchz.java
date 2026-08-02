package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import defpackage.fsn;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzchz {
    public long b;
    public final long a = TimeUnit.MILLISECONDS.toNanos(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.w0)).longValue());
    public boolean c = true;

    public final void a(SurfaceTexture surfaceTexture, zzcht zzchtVar) {
        if (zzchtVar == null) {
            return;
        }
        long timestamp = surfaceTexture.getTimestamp();
        if (!this.c) {
            long j = timestamp - this.b;
            if (Math.abs(j) < this.a) {
                return;
            }
        }
        this.c = false;
        this.b = timestamp;
        com.google.android.gms.ads.internal.util.zzs.zza.post(new fsn(zzchtVar, 2));
    }
}
