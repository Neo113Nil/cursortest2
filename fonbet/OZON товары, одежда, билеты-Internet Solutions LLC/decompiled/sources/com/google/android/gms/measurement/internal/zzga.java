package com.google.android.gms.measurement.internal;

import java.util.Map;

/* loaded from: classes9.dex */
final class zzga implements com.google.android.gms.internal.measurement.zzo {
    final /* synthetic */ String zza;
    final /* synthetic */ zzgb zzb;

    zzga(zzgb zzgbVar, String str) {
        this.zzb = zzgbVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.measurement.zzo
    public final String zza(String str) {
        Map map;
        map = this.zzb.zzg;
        Map map2 = (Map) map.get(this.zza);
        if (map2 == null || !map2.containsKey(str)) {
            return null;
        }
        return (String) map2.get(str);
    }
}
