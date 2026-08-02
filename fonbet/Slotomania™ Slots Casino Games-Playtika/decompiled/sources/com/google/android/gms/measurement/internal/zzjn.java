package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes8.dex */
final class zzjn implements Runnable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzaw zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzjy zze;

    zzjn(zzjy zzjyVar, boolean z, zzq zzqVar, boolean z2, zzaw zzawVar, String str) {
        this.zze = zzjyVar;
        this.zza = zzqVar;
        this.zzb = z2;
        this.zzc = zzawVar;
        this.zzd = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzek zzekVar;
        zzjy zzjyVar = this.zze;
        zzekVar = zzjyVar.zzb;
        if (zzekVar == null) {
            zzjyVar.zzt.zzaA().zzd().zza("Discarding data. Failed to send event to service");
            return;
        }
        Preconditions.checkNotNull(this.zza);
        this.zze.zzD(zzekVar, this.zzb ? null : this.zzc, this.zza);
        this.zze.zzQ();
    }
}
