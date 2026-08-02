package com.google.android.gms.measurement.internal;

/* loaded from: classes9.dex */
final class zzhv implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ Object zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzip zze;

    zzhv(zzip zzipVar, String str, String str2, Object obj, long j11) {
        this.zze = zzipVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = obj;
        this.zzd = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zze.zzaa(this.zza, this.zzb, this.zzc, this.zzd);
    }
}
