package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.1 */
/* loaded from: classes7.dex */
final class zzmn implements Runnable {
    private final /* synthetic */ long zza;
    private final /* synthetic */ zzml zzb;

    zzmn(zzml zzmlVar, long j) {
        this.zza = j;
        this.zzb = zzmlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzml.zza(this.zzb, this.zza);
    }
}
