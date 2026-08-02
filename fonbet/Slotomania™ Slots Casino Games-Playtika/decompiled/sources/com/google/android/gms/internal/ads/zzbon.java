package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes5.dex */
final class zzbon implements zzbpe {
    zzbon() {
    }

    @Override // com.google.android.gms.internal.ads.zzbpe
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("string");
        String.valueOf(str);
        String valueOf = String.valueOf(str);
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("Received log message: ".concat(valueOf));
    }
}
