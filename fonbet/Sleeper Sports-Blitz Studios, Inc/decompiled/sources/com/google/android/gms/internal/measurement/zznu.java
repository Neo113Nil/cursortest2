package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.1 */
/* loaded from: classes7.dex */
public final class zznu implements zznr {
    private static final zzgw<Boolean> zza;
    private static final zzgw<Boolean> zzb;
    private static final zzgw<Boolean> zzc;
    private static final zzgw<Boolean> zzd;

    static {
        zzhe zza2 = new zzhe(zzgx.zza("com.google.android.gms.measurement")).zzb().zza();
        zza2.zza("measurement.dma_consent.client", true);
        zza2.zza("measurement.dma_consent.client_bow_check2", true);
        zza = zza2.zza("measurement.dma_consent.separate_service_calls_fix", false);
        zza2.zza("measurement.dma_consent.service", true);
        zzb = zza2.zza("measurement.dma_consent.service_database_update_fix", true);
        zza2.zza("measurement.dma_consent.service_dcu_event", true);
        zzc = zza2.zza("measurement.dma_consent.service_dcu_event2", true);
        zza2.zza("measurement.dma_consent.service_npa_remote_default", true);
        zza2.zza("measurement.dma_consent.service_split_batch_on_consent", true);
        zzd = zza2.zza("measurement.dma_consent.set_consent_inline_on_worker", false);
        zza2.zza("measurement.id.dma_consent.separate_service_calls_fix", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zznr
    public final boolean zza() {
        return zza.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznr
    public final boolean zzb() {
        return zzb.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznr
    public final boolean zzc() {
        return zzc.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznr
    public final boolean zzd() {
        return zzd.zza().booleanValue();
    }
}
