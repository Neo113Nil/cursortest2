package com.google.android.gms.measurement.internal;

import N3.C3661l;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes9.dex */
final class zzjt implements Runnable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzaw zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzke zze;

    zzjt(zzke zzkeVar, boolean z11, zzq zzqVar, boolean z12, zzaw zzawVar, String str) {
        this.zze = zzkeVar;
        this.zza = zzqVar;
        this.zzb = z12;
        this.zzc = zzawVar;
        this.zzd = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzeq zzeqVar;
        zzke zzkeVar = this.zze;
        zzeqVar = zzkeVar.zzb;
        if (zzeqVar == null) {
            C3661l.b(zzkeVar.zzs, "Discarding data. Failed to send event to service");
            return;
        }
        Preconditions.checkNotNull(this.zza);
        this.zze.zzD(zzeqVar, this.zzb ? null : this.zzc, this.zza);
        this.zze.zzQ();
    }
}
