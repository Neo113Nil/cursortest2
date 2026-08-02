package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.1 */
/* loaded from: classes7.dex */
final class zzib implements Runnable {
    private final /* synthetic */ zzn zza;
    private final /* synthetic */ zzhn zzb;

    zzib(zzhn zzhnVar, zzn zznVar) {
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
        zzn zznVar = this.zza;
        zzncVar2.zzl().zzt();
        zzncVar2.zzs();
        Preconditions.checkNotEmpty(zznVar.zza);
        if (zzncVar2.zze().zza(zzbh.zzcl)) {
            zzncVar2.zzf(zznVar);
            zzncVar2.zze(zznVar);
            return;
        }
        zzin zza = zzin.zza(zznVar.zzt, zznVar.zzy);
        zzin zzb = zzncVar2.zzb(zznVar.zza);
        zzncVar2.zzj().zzp().zza("Setting storage consent, package, consent", zznVar.zza, zza);
        zzncVar2.zza(zznVar.zza, zza);
        if ((!com.google.android.gms.internal.measurement.zznh.zza() || !zzncVar2.zze().zza(zzbh.zzdc)) && zza.zzc(zzb)) {
            zzncVar2.zzd(zznVar);
        }
        zzax zza2 = zzax.zza(zznVar.zzz);
        if (zzax.zza.equals(zza2)) {
            return;
        }
        zzncVar2.zzj().zzp().zza("Setting DMA consent. package, consent", zznVar.zza, zza2);
        zzncVar2.zza(zznVar.zza, zza2);
    }
}
