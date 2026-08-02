package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzcsh implements zzcrh {
    private final com.google.android.gms.ads.internal.util.zzg zza;

    zzcsh(com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcrh
    public final void zza(Map map) {
        int intValue;
        String str = (String) map.get("total_inflight_ad_limit");
        if (str == null || (intValue = Float.valueOf(str).intValue()) <= 0) {
            return;
        }
        this.zza.zzS(intValue);
    }
}
