package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes5.dex */
final class zzboq implements zzbpe {
    zzboq() {
    }

    @Override // com.google.android.gms.internal.ads.zzbpe
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcki zzckiVar = (zzcki) obj;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            zzckiVar.zzdk();
        } else if ("resume".equals(str)) {
            zzckiVar.zzdl();
        }
    }
}
