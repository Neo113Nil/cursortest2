package com.google.android.gms.measurement.internal;

/* loaded from: classes9.dex */
final class zzht implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ zzip zzb;

    zzht(zzip zzipVar, long j11) {
        this.zzb = zzipVar;
        this.zza = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzs.zzm().zzf.zzb(this.zza);
        this.zzb.zzs.zzay().zzc().zzb("Session timeout duration set", Long.valueOf(this.zza));
    }
}
