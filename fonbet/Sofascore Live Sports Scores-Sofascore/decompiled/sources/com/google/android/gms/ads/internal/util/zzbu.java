package com.google.android.gms.ads.internal.util;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbu {
    public long a;
    public long b = Long.MIN_VALUE;
    public final Object c = new Object();

    public zzbu(long j) {
        this.a = j;
    }

    public final boolean zza() {
        synchronized (this.c) {
            try {
                long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
                if (this.b + this.a > elapsedRealtime) {
                    return false;
                }
                this.b = elapsedRealtime;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzb(long j) {
        synchronized (this.c) {
            this.a = j;
        }
    }
}
