package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes6.dex */
final class zzak implements zzaz {
    final zztk zza;
    final zztk zzb;
    final zztk zzc;
    final zztk zzd;
    final zztk zze;
    private final zzah zzf;

    zzak(zzah zzahVar, zzbs zzbsVar) {
        this.zzf = zzahVar;
        zztk zza = zztg.zza(zzca.zza(zzahVar.zza));
        this.zza = zza;
        zzth zza2 = zzti.zza(zzbsVar);
        this.zzb = zza2;
        zztf zztfVar = new zztf();
        this.zzc = zztfVar;
        zztk zztkVar = zzahVar.zza;
        zzav zzavVar = zzau.zza;
        zzax zzaxVar = zzaw.zza;
        zztk zztkVar2 = zzahVar.zzg;
        zztk zztkVar3 = zzahVar.zzj;
        zztk zztkVar4 = zzahVar.zzb;
        zzce zzc = zzce.zzc(zztkVar, zza, zzavVar, zzaxVar, zztkVar2, zztkVar3, zztfVar, zztkVar4);
        this.zzd = zzc;
        zzby zzc2 = zzby.zzc(zza, zzavVar, zzc);
        this.zze = zzc2;
        zztf.zza(zztfVar, zztg.zza(zzbf.zza(zztkVar, zzahVar.zzc, zza, zztkVar4, zza2, zzc2, zzahVar.zzl)));
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzaz
    public final zzbe zza() {
        return (zzbe) this.zzc.zzb();
    }
}
