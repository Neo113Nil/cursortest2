package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.1 */
/* loaded from: classes7.dex */
final class zzgj implements Runnable {
    private final /* synthetic */ boolean zza;
    private final /* synthetic */ zzgg zzb;

    zzgj(zzgg zzggVar, boolean z) {
        this.zza = z;
        this.zzb = zzggVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zznc zzncVar;
        zzncVar = this.zzb.zza;
        zzncVar.zza(this.zza);
    }
}
