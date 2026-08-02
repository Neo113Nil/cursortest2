package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.1 */
/* loaded from: classes7.dex */
public final class zznd implements zzne {
    private static final zzgw<Boolean> zza;
    private static final zzgw<Boolean> zzb;

    static {
        zzhe zza2 = new zzhe(zzgx.zza("com.google.android.gms.measurement")).zzb().zza();
        zza = zza2.zza("measurement.consent_regional_defaults.client", false);
        zzb = zza2.zza("measurement.consent_regional_defaults.service", false);
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final boolean zzb() {
        return zza.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final boolean zzc() {
        return zzb.zza().booleanValue();
    }
}
