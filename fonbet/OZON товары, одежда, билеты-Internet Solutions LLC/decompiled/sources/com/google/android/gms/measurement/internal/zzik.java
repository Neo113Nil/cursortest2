package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzps;

/* loaded from: classes9.dex */
final class zzik implements Runnable {
    final /* synthetic */ zzai zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzai zze;
    final /* synthetic */ zzip zzf;

    zzik(zzip zzipVar, zzai zzaiVar, int i11, long j11, boolean z11, zzai zzaiVar2) {
        this.zzf = zzipVar;
        this.zza = zzaiVar;
        this.zzb = i11;
        this.zzc = j11;
        this.zzd = z11;
        this.zze = zzaiVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzf.zzX(this.zza);
        zzip.zzw(this.zzf, this.zza, this.zzb, this.zzc, false, this.zzd);
        zzps.zzc();
        if (this.zzf.zzs.zzf().zzs(null, zzen.zzaI)) {
            zzip.zzv(this.zzf, this.zza, this.zze);
        }
    }
}
