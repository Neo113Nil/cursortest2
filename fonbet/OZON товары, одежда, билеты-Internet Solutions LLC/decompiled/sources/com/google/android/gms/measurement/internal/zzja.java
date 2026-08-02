package com.google.android.gms.measurement.internal;

/* loaded from: classes9.dex */
final class zzja implements Runnable {
    final /* synthetic */ zzje zza;

    zzja(zzje zzjeVar) {
        this.zza = zzjeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zziw zziwVar;
        zzje zzjeVar = this.zza;
        zziwVar = zzjeVar.zzh;
        zzjeVar.zza = zziwVar;
    }
}
