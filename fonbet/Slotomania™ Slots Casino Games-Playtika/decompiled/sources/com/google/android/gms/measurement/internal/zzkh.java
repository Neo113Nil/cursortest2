package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes8.dex */
final class zzkh implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ zzko zzb;

    zzkh(zzko zzkoVar, long j) {
        this.zzb = zzkoVar;
        this.zza = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzko.zzj(this.zzb, this.zza);
    }
}
