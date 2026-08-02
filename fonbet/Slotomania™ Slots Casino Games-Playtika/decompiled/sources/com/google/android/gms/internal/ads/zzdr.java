package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes5.dex */
public final class zzdr {
    private boolean zza;

    public zzdr() {
        throw null;
    }

    public zzdr(zzdo zzdoVar) {
    }

    public final synchronized boolean zza() {
        if (this.zza) {
            return false;
        }
        this.zza = true;
        notifyAll();
        return true;
    }

    public final synchronized boolean zzb() {
        boolean z;
        z = this.zza;
        this.zza = false;
        return z;
    }

    public final synchronized void zzc() throws InterruptedException {
        while (!this.zza) {
            wait();
        }
    }

    public final synchronized void zzd() {
        boolean z = false;
        while (!this.zza) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean zze(long j) {
        if (j > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = j + elapsedRealtime;
            if (j2 < elapsedRealtime) {
                zzd();
            } else {
                boolean z = false;
                while (!this.zza && elapsedRealtime < j2) {
                    try {
                        wait(j2 - elapsedRealtime);
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                    elapsedRealtime = SystemClock.elapsedRealtime();
                }
                if (z) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        return this.zza;
    }

    public final synchronized boolean zzf() {
        return this.zza;
    }
}
