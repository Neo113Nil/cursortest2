package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
final class zzcoz implements zzeak {
    private final Long zza;
    private final String zzb;
    private final zzcol zzc;
    private final zzcpb zzd;

    zzcoz(zzcol zzcolVar, zzcpb zzcpbVar, Long l, String str) {
        this.zzc = zzcolVar;
        this.zzd = zzcpbVar;
        this.zza = l;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzeak
    public final zzeat zza() {
        long longValue = this.zza.longValue();
        zzcpb zzcpbVar = this.zzd;
        return zzeau.zza(longValue, zzcpbVar.zzd(), zzcpbVar.zza(), this.zzc, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzeak
    public final zzeax zzb() {
        long longValue = this.zza.longValue();
        zzcpb zzcpbVar = this.zzd;
        return zzeay.zza(longValue, zzcpbVar.zzd(), zzcpbVar.zza(), this.zzc, this.zzb);
    }
}
