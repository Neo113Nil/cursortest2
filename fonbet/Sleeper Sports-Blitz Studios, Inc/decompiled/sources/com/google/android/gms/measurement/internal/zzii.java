package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.1 */
/* loaded from: classes7.dex */
final class zzii implements Runnable {
    private final /* synthetic */ zzno zza;
    private final /* synthetic */ zzn zzb;
    private final /* synthetic */ zzhn zzc;

    zzii(zzhn zzhnVar, zzno zznoVar, zzn zznVar) {
        this.zza = zznoVar;
        this.zzb = zznVar;
        this.zzc = zzhnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zznc zzncVar;
        zznc zzncVar2;
        zznc zzncVar3;
        zzncVar = this.zzc.zza;
        zzncVar.zzr();
        if (this.zza.zza() == null) {
            zzncVar3 = this.zzc.zza;
            zzncVar3.zza(this.zza.zza, this.zzb);
        } else {
            zzncVar2 = this.zzc.zza;
            zzncVar2.zza(this.zza, this.zzb);
        }
    }
}
