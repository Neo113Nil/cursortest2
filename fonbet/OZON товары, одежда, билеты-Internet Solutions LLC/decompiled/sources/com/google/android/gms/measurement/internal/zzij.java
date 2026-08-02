package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzps;

/* loaded from: classes9.dex */
final class zzij implements Runnable {
    final /* synthetic */ zzai zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ boolean zze;
    final /* synthetic */ zzai zzf;
    final /* synthetic */ zzip zzg;

    zzij(zzip zzipVar, zzai zzaiVar, long j11, int i11, long j12, boolean z11, zzai zzaiVar2) {
        this.zzg = zzipVar;
        this.zza = zzaiVar;
        this.zzb = j11;
        this.zzc = i11;
        this.zzd = j12;
        this.zze = z11;
        this.zzf = zzaiVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzg.zzX(this.zza);
        this.zzg.zzM(this.zzb, false);
        zzip.zzw(this.zzg, this.zza, this.zzc, this.zzd, true, this.zze);
        zzps.zzc();
        if (this.zzg.zzs.zzf().zzs(null, zzen.zzaI)) {
            zzip.zzv(this.zzg, this.zza, this.zzf);
        }
    }
}
