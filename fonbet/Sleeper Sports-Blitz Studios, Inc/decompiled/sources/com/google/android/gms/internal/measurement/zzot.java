package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.1 */
/* loaded from: classes7.dex */
public final class zzot implements zzou {
    private static final zzgw<Boolean> zza;
    private static final zzgw<Boolean> zzb;

    static {
        zzhe zza2 = new zzhe(zzgx.zza("com.google.android.gms.measurement")).zzb().zza();
        zza = zza2.zza("measurement.item_scoped_custom_parameters.client", true);
        zzb = zza2.zza("measurement.item_scoped_custom_parameters.service", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final boolean zzb() {
        return zza.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final boolean zzc() {
        return zzb.zza().booleanValue();
    }
}
