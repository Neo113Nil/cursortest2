package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes8.dex */
abstract class zzap {
    private static volatile Handler zza;
    private final zzgz zzb;
    private final Runnable zzc;
    private volatile long zzd;

    zzap(zzgz zzgzVar) {
        Preconditions.checkNotNull(zzgzVar);
        this.zzb = zzgzVar;
        this.zzc = new zzao(this, zzgzVar);
    }

    private final Handler zzf() {
        Handler handler;
        if (zza != null) {
            return zza;
        }
        synchronized (zzap.class) {
            if (zza == null) {
                zza = new com.google.android.gms.internal.measurement.zzby(this.zzb.zzaw().getMainLooper());
            }
            handler = zza;
        }
        return handler;
    }

    final void zzb() {
        this.zzd = 0L;
        zzf().removeCallbacks(this.zzc);
    }

    public abstract void zzc();

    public final void zzd(long j) {
        zzb();
        if (j >= 0) {
            this.zzd = this.zzb.zzax().currentTimeMillis();
            if (zzf().postDelayed(this.zzc, j)) {
                return;
            }
            this.zzb.zzaA().zzd().zzb("Failed to schedule delayed post. time", Long.valueOf(j));
        }
    }

    public final boolean zze() {
        return this.zzd != 0;
    }
}
