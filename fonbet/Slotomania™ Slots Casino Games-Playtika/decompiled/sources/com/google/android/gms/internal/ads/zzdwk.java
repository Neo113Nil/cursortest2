package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzdwk {
    private final zzdyz zza;

    zzdwk(zzdyz zzdyzVar) {
        this.zza = zzdyzVar;
    }

    public final boolean zza(zzgad zzgadVar) {
        if (zzgadVar.zzj()) {
            zzdyy zza = this.zza.zza();
            zza.zzc("action", "aq_ad_closed");
            zza.zzc("gqi", zzgadVar.zza());
            zza.zzc("aq_ad_duration", String.valueOf(zzgadVar.zzb()));
            zza.zzc("aq_ad_bounce_cnt", String.valueOf(zzgadVar.zzc()));
            zza.zzc("aq_time_away", String.valueOf(zzgadVar.zzg()));
            return Boolean.valueOf(zza.zze().equals(com.google.android.gms.ads.internal.util.client.zzt.SUCCESS)).booleanValue();
        }
        zzdyy zza2 = this.zza.zza();
        zza2.zzc("action", "aq_ad_kill");
        zza2.zzc("gqi", zzgadVar.zza());
        zza2.zzc("aq_ad_duration", String.valueOf(zzgadVar.zzb()));
        zza2.zzc("aq_ad_bounce_cnt", String.valueOf(zzgadVar.zzc()));
        zza2.zzc("aq_time_away", String.valueOf(zzgadVar.zzg()));
        zza2.zzc("aq_is_os_kill", String.valueOf(zzgadVar.zze()));
        return Boolean.valueOf(zza2.zze().equals(com.google.android.gms.ads.internal.util.client.zzt.SUCCESS)).booleanValue();
    }
}
