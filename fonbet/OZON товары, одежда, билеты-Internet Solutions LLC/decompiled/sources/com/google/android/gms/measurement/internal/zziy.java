package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* loaded from: classes9.dex */
final class zziy implements Runnable {
    final /* synthetic */ Bundle zza;
    final /* synthetic */ zziw zzb;
    final /* synthetic */ zziw zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzje zze;

    zziy(zzje zzjeVar, Bundle bundle, zziw zziwVar, zziw zziwVar2, long j11) {
        this.zze = zzjeVar;
        this.zza = bundle;
        this.zzb = zziwVar;
        this.zzc = zziwVar2;
        this.zzd = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzje.zzp(this.zze, this.zza, this.zzb, this.zzc, this.zzd);
    }
}
