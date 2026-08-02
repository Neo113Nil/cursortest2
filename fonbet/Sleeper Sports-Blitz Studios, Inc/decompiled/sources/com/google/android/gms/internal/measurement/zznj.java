package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.1 */
/* loaded from: classes7.dex */
public final class zznj implements zznk {
    private static final zzgw<Boolean> zza;
    private static final zzgw<Boolean> zzb;
    private static final zzgw<Boolean> zzc;

    static {
        zzhe zza2 = new zzhe(zzgx.zza("com.google.android.gms.measurement")).zzb().zza();
        zza = zza2.zza("measurement.consent.stop_reset_on_storage_denied.client", true);
        zzb = zza2.zza("measurement.consent.stop_reset_on_storage_denied.service", true);
        zza2.zza("measurement.id.consent.stop_reset_on_storage_denied.service", 0L);
        zzc = zza2.zza("measurement.consent.scrub_audience_data_analytics_consent", true);
    }

    @Override // com.google.android.gms.internal.measurement.zznk
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zznk
    public final boolean zzb() {
        return zza.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznk
    public final boolean zzc() {
        return zzb.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznk
    public final boolean zzd() {
        return zzc.zza().booleanValue();
    }
}
