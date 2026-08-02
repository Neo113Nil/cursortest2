package com.google.android.gms.measurement.internal;

import N3.C3661l;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes9.dex */
final class zzju implements Runnable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzac zzc;
    final /* synthetic */ zzac zzd;
    final /* synthetic */ zzke zze;

    zzju(zzke zzkeVar, boolean z11, zzq zzqVar, boolean z12, zzac zzacVar, zzac zzacVar2) {
        this.zze = zzkeVar;
        this.zza = zzqVar;
        this.zzb = z12;
        this.zzc = zzacVar;
        this.zzd = zzacVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzeq zzeqVar;
        zzke zzkeVar = this.zze;
        zzeqVar = zzkeVar.zzb;
        if (zzeqVar == null) {
            C3661l.b(zzkeVar.zzs, "Discarding data. Failed to send conditional user property to service");
            return;
        }
        Preconditions.checkNotNull(this.zza);
        this.zze.zzD(zzeqVar, this.zzb ? null : this.zzc, this.zza);
        this.zze.zzQ();
    }
}
