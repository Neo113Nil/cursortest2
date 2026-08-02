package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.1 */
/* loaded from: classes7.dex */
final class zzic implements Runnable {
    private final /* synthetic */ zzn zza;
    private final /* synthetic */ zzhn zzb;

    zzic(zzhn zzhnVar, zzn zznVar) {
        this.zza = zznVar;
        this.zzb = zzhnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zznc zzncVar;
        zznc zzncVar2;
        zzncVar = this.zzb.zza;
        zzncVar.zzr();
        zzncVar2 = this.zzb.zza;
        zzncVar2.zzd(this.zza);
    }
}
