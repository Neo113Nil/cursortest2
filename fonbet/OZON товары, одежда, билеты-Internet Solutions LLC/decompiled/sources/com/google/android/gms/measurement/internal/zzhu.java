package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* loaded from: classes9.dex */
final class zzhu implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ Bundle zzd;
    final /* synthetic */ boolean zze;
    final /* synthetic */ boolean zzf;
    final /* synthetic */ boolean zzg;
    final /* synthetic */ String zzh;
    final /* synthetic */ zzip zzi;

    zzhu(zzip zzipVar, String str, String str2, long j11, Bundle bundle, boolean z11, boolean z12, boolean z13, String str3) {
        this.zzi = zzipVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = j11;
        this.zzd = bundle;
        this.zze = z11;
        this.zzf = z12;
        this.zzg = z13;
        this.zzh = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzi.zzJ(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh);
    }
}
