package com.google.android.gms.measurement.internal;

import N3.C3661l;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes9.dex */
final class zzjg implements Runnable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzlo zzc;
    final /* synthetic */ zzke zzd;

    zzjg(zzke zzkeVar, zzq zzqVar, boolean z11, zzlo zzloVar) {
        this.zzd = zzkeVar;
        this.zza = zzqVar;
        this.zzb = z11;
        this.zzc = zzloVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzeq zzeqVar;
        zzke zzkeVar = this.zzd;
        zzeqVar = zzkeVar.zzb;
        if (zzeqVar == null) {
            C3661l.b(zzkeVar.zzs, "Discarding data. Failed to set user property");
            return;
        }
        Preconditions.checkNotNull(this.zza);
        this.zzd.zzD(zzeqVar, this.zzb ? null : this.zzc, this.zza);
        this.zzd.zzQ();
    }
}
