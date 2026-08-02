package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
final class zzdnj implements zzcxk {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final zzimx zzd;
    private final zzdpr zze;

    zzdnj(Map map, Map map2, Map map3, zzimx zzimxVar, zzdpr zzdprVar) {
        this.zza = map;
        this.zzb = map2;
        this.zzc = map3;
        this.zzd = zzimxVar;
        this.zze = zzdprVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcxk
    public final zzelg zza(int i, String str) {
        zzelg zza;
        zzelg zzelgVar = (zzelg) this.zza.get(str);
        if (zzelgVar != null) {
            return zzelgVar;
        }
        if (i != 1) {
            if (i != 4) {
                return null;
            }
            zzenm zzenmVar = (zzenm) this.zzc.get(str);
            if (zzenmVar != null) {
                return zzcxp.zza(zzenmVar);
            }
            zza = (zzelg) this.zzb.get(str);
            if (zza == null) {
                return null;
            }
        } else if (this.zze.zzd() == null || (zza = ((zzcxk) this.zzd.zzb()).zza(i, str)) == null) {
            return null;
        }
        return zzcxp.zzb(zza);
    }
}
