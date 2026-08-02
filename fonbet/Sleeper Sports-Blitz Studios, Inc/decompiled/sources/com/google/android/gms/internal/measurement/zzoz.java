package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.1 */
/* loaded from: classes7.dex */
public final class zzoz implements zzpa {
    private static final zzgw<Boolean> zza;
    private static final zzgw<Double> zzb;
    private static final zzgw<Long> zzc;
    private static final zzgw<Long> zzd;
    private static final zzgw<String> zze;

    @Override // com.google.android.gms.internal.measurement.zzpa
    public final double zza() {
        return zzb.zza().doubleValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpa
    public final long zzb() {
        return zzc.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpa
    public final long zzc() {
        return zzd.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpa
    public final String zzd() {
        return zze.zza();
    }

    static {
        zzhe zza2 = new zzhe(zzgx.zza("com.google.android.gms.measurement")).zzb().zza();
        zza = zza2.zza("measurement.test.boolean_flag", false);
        zzb = zza2.zza("measurement.test.double_flag", -3.0d);
        zzc = zza2.zza("measurement.test.int_flag", -2L);
        zzd = zza2.zza("measurement.test.long_flag", -1L);
        zze = zza2.zza("measurement.test.string_flag", "---");
    }

    @Override // com.google.android.gms.internal.measurement.zzpa
    public final boolean zze() {
        return zza.zza().booleanValue();
    }
}
