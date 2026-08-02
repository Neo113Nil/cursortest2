package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzfkx {
    public static zzbpe zza(final zzeju zzejuVar, final zzfro zzfroVar, final zzcsx zzcsxVar, final zzdkm zzdkmVar) {
        return new zzbpe() { // from class: com.google.android.gms.internal.ads.zzfkw
            @Override // com.google.android.gms.internal.ads.zzbpe
            public final /* synthetic */ void zza(Object obj, Map map) {
                zzcki zzckiVar = (zzcki) obj;
                zzbpd.zzc(map, zzdkm.this);
                String str = (String) map.get("u");
                if (str == null) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("URL missing from click GMSG.");
                } else {
                    zzeju zzejuVar2 = zzejuVar;
                    zzfro zzfroVar2 = zzfroVar;
                    zzhbi.zzr(zzbpd.zza(zzckiVar, str), new zzfku(zzckiVar, zzcsxVar, zzfroVar2, zzejuVar2), zzcff.zza);
                }
            }
        };
    }

    public static zzbpe zzb(final zzeju zzejuVar, final zzfro zzfroVar) {
        return new zzbpe() { // from class: com.google.android.gms.internal.ads.zzfkv
            @Override // com.google.android.gms.internal.ads.zzbpe
            public final /* synthetic */ void zza(Object obj, Map map) {
                zzcjz zzcjzVar = (zzcjz) obj;
                String str = (String) map.get("u");
                if (str == null) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("URL missing from httpTrack GMSG.");
                    return;
                }
                zzfjt zzC = zzcjzVar.zzC();
                if (zzC != null && !zzC.zzai) {
                    zzfro.this.zzb(str, zzC.zzax, null, null);
                    return;
                }
                zzfjw zzaC = ((zzclp) zzcjzVar).zzaC();
                if (zzaC != null) {
                    zzejuVar.zze(new zzejw(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis(), zzaC.zzb, str, 2));
                } else {
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(new IllegalArgumentException("Common configuration cannot be null"), "BufferingGmsgHandlers.getBufferingHttpTrackGmsgHandler");
                }
            }
        };
    }
}
