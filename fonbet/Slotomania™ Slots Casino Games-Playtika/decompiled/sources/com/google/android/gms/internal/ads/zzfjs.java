package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzfjs {
    private final Clock zza;
    private final zzdyz zzb;
    private final Object zzc = new Object();
    private volatile int zze = 1;
    private volatile long zzd = 0;

    public zzfjs(Clock clock, zzdyz zzdyzVar) {
        this.zza = clock;
        this.zzb = zzdyzVar;
    }

    private final void zze() {
        long currentTimeMillis = this.zza.currentTimeMillis();
        synchronized (this.zzc) {
            if (this.zze == 3) {
                if (this.zzd + ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgU)).longValue() <= currentTimeMillis) {
                    this.zze = 1;
                }
            }
        }
    }

    private final void zzf(int i, int i2) {
        zze();
        Object obj = this.zzc;
        long currentTimeMillis = this.zza.currentTimeMillis();
        synchronized (obj) {
            if (this.zze != i) {
                return;
            }
            this.zze = i2;
            if (this.zze == 3) {
                this.zzd = currentTimeMillis;
            }
        }
    }

    public final void zza(boolean z) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzoz)).booleanValue()) {
            zzdyy zza = this.zzb.zza();
            zza.zzc("action", "mbs_state");
            zza.zzc("mbs_state", true != z ? "0" : "1");
            zza.zzd();
        }
        if (z) {
            zzf(1, 2);
        } else {
            zzf(2, 1);
        }
    }

    public final boolean zzb() {
        boolean z;
        synchronized (this.zzc) {
            zze();
            z = this.zze == 2;
        }
        return z;
    }

    public final boolean zzc() {
        boolean z;
        synchronized (this.zzc) {
            zze();
            z = this.zze == 3;
        }
        return z;
    }

    public final void zzd() {
        zzf(2, 3);
    }
}
