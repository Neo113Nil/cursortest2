package com.google.android.gms.measurement.internal;

/* loaded from: classes9.dex */
final class zzb implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzd zzc;

    zzb(zzd zzdVar, String str, long j11) {
        this.zzc = zzdVar;
        this.zza = str;
        this.zzb = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzd.zzb(this.zzc, this.zza, this.zzb);
    }
}
