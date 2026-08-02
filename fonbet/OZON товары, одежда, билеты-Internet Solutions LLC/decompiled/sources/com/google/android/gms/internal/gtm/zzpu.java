package com.google.android.gms.internal.gtm;

/* loaded from: classes9.dex */
final class zzpu implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ zzph zzb;
    final /* synthetic */ zzpx zzc;

    zzpu(zzpx zzpxVar, String str, zzph zzphVar) {
        this.zzc = zzpxVar;
        this.zza = str;
        this.zzb = zzphVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zzf(this.zza, this.zzb);
    }
}
