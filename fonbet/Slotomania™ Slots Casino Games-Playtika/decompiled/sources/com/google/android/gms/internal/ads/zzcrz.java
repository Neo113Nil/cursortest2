package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzcrz implements zzcrh {
    private final com.google.android.gms.ads.internal.util.zzg zza;

    zzcrz(com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcrh
    public final void zza(Map map) {
        int intValue;
        String str = (String) map.get("default_queue_capacity");
        if (str == null || (intValue = Float.valueOf(str).intValue()) <= 0) {
            return;
        }
        this.zza.zzU(intValue);
    }
}
