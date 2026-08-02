package com.google.android.gms.tagmanager;

import java.util.Map;

/* loaded from: classes9.dex */
final class zzbo extends zzcf {
    zzbo() {
    }

    @Override // com.google.android.gms.tagmanager.zzcg
    public final String zzb(String str, Map map) {
        Map map2;
        Map map3;
        CustomVariableProvider customVariableProvider;
        Object zzj;
        Map map4;
        map2 = zzbp.zzd;
        if (map2.containsKey(str)) {
            map3 = zzbp.zzd;
            customVariableProvider = (CustomVariableProvider) map3.get(str);
        } else {
            zzj = zzbp.zzj(str, CustomVariableProvider.class);
            customVariableProvider = (CustomVariableProvider) zzj;
            map4 = zzbp.zzd;
            map4.put(str, customVariableProvider);
        }
        if (customVariableProvider != null) {
            return customVariableProvider.getValue(map);
        }
        return null;
    }

    @Override // com.google.android.gms.tagmanager.zzcg
    public final void zzc(String str, Map map) {
        Map map2;
        Map map3;
        CustomTagProvider customTagProvider;
        Object zzj;
        Map map4;
        map2 = zzbp.zzc;
        if (map2.containsKey(str)) {
            map3 = zzbp.zzc;
            customTagProvider = (CustomTagProvider) map3.get(str);
        } else {
            zzj = zzbp.zzj(str, CustomTagProvider.class);
            customTagProvider = (CustomTagProvider) zzj;
            map4 = zzbp.zzc;
            map4.put(str, customTagProvider);
        }
        if (customTagProvider != null) {
            customTagProvider.execute(map);
        }
    }
}
