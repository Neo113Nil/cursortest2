package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.1 */
/* loaded from: classes7.dex */
public final class zzni implements zznf {
    private static final zzgw<Long> zza;

    @Override // com.google.android.gms.internal.measurement.zznf
    public final long zza() {
        return zza.zza().longValue();
    }

    static {
        zzhe zza2 = new zzhe(zzgx.zza("com.google.android.gms.measurement")).zzb().zza();
        zza2.zza("measurement.client.consent_state_v1", true);
        zza2.zza("measurement.client.3p_consent_state_v1", true);
        zza2.zza("measurement.service.consent_state_v1_W36", true);
        zza = zza2.zza("measurement.service.storage_consent_support_version", 203600L);
    }
}
