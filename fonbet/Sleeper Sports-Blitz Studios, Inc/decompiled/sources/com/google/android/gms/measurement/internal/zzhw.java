package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.1 */
/* loaded from: classes7.dex */
final class zzhw implements Runnable {
    private final /* synthetic */ zzac zza;
    private final /* synthetic */ zzn zzb;
    private final /* synthetic */ zzhn zzc;

    zzhw(zzhn zzhnVar, zzac zzacVar, zzn zznVar) {
        this.zza = zzacVar;
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
        if (this.zza.zzc.zza() == null) {
            zzncVar3 = this.zzc.zza;
            zzncVar3.zza(this.zza, this.zzb);
        } else {
            zzncVar2 = this.zzc.zza;
            zzncVar2.zzb(this.zza, this.zzb);
        }
    }
}
