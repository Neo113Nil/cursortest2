package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@21.2.2 */
/* loaded from: classes8.dex */
final class zzl implements Runnable {
    final /* synthetic */ zzo zza;
    final /* synthetic */ AppMeasurementDynamiteService zzb;

    zzl(AppMeasurementDynamiteService appMeasurementDynamiteService, zzo zzoVar) {
        this.zzb = appMeasurementDynamiteService;
        this.zza = zzoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza.zzq().zzT(this.zza);
    }
}
