package com.google.android.gms.measurement.internal;

/* loaded from: classes9.dex */
final class zzgv implements Runnable {
    final /* synthetic */ zzaw zza;
    final /* synthetic */ zzq zzb;
    final /* synthetic */ zzhc zzc;

    zzgv(zzhc zzhcVar, zzaw zzawVar, zzq zzqVar) {
        this.zzc = zzhcVar;
        this.zza = zzawVar;
        this.zzb = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zzv(this.zzc.zzb(this.zza, this.zzb), this.zzb);
    }
}
