package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes.dex */
abstract class zzap {
    private static volatile Handler zza;
    private final zzhf zzb;
    private final Runnable zzc;
    private volatile long zzd;

    zzap(zzhf zzhfVar) {
        Preconditions.checkNotNull(zzhfVar);
        this.zzb = zzhfVar;
        this.zzc = new zzao(this, zzhfVar);
    }

    private final Handler zzf() {
        Handler handler;
        if (zza != null) {
            return zza;
        }
        synchronized (zzap.class) {
            try {
                if (zza == null) {
                    zza = new com.google.android.gms.internal.measurement.zzby(this.zzb.zzau().getMainLooper());
                }
                handler = zza;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    final void zzb() {
        this.zzd = 0L;
        zzf().removeCallbacks(this.zzc);
    }

    public abstract void zzc();

    public final void zzd(long j11) {
        zzb();
        if (j11 >= 0) {
            this.zzd = this.zzb.zzav().currentTimeMillis();
            if (zzf().postDelayed(this.zzc, j11)) {
                return;
            }
            this.zzb.zzay().zzd().zzb("Failed to schedule delayed post. time", Long.valueOf(j11));
        }
    }

    public final boolean zze() {
        return this.zzd != 0;
    }
}
