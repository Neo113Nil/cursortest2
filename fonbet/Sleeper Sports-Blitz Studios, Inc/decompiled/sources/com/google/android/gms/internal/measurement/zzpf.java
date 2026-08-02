package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.1 */
/* loaded from: classes7.dex */
public final class zzpf implements zzpg {
    private static final zzgw<Boolean> zza;
    private static final zzgw<Boolean> zzb;
    private static final zzgw<Boolean> zzc;
    private static final zzgw<Boolean> zzd;
    private static final zzgw<Boolean> zze;
    private static final zzgw<Boolean> zzf;
    private static final zzgw<Boolean> zzg;

    static {
        zzhe zza2 = new zzhe(zzgx.zza("com.google.android.gms.measurement")).zzb().zza();
        zza = zza2.zza("measurement.rb.attribution.client2", true);
        zza2.zza("measurement.rb.attribution.dma_fix", true);
        zzb = zza2.zza("measurement.rb.attribution.followup1.service", false);
        zza2.zza("measurement.rb.attribution.index_out_of_bounds_fix", true);
        zzc = zza2.zza("measurement.rb.attribution.registration_regardless_consent", false);
        zzd = zza2.zza("measurement.rb.attribution.service", true);
        zze = zza2.zza("measurement.rb.attribution.enable_trigger_redaction", true);
        zzf = zza2.zza("measurement.rb.attribution.uuid_generation", true);
        zza2.zza("measurement.id.rb.attribution.improved_retry", 0L);
        zzg = zza2.zza("measurement.rb.attribution.improved_retry", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzpg
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzpg
    public final boolean zzb() {
        return zza.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpg
    public final boolean zzc() {
        return zzb.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpg
    public final boolean zzd() {
        return zzc.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpg
    public final boolean zze() {
        return zzd.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpg
    public final boolean zzf() {
        return zze.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpg
    public final boolean zzg() {
        return zzf.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpg
    public final boolean zzh() {
        return zzg.zza().booleanValue();
    }
}
