package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.safedk.android.analytics.events.base.StatsEvent;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes5.dex */
public final class zzbpm implements zzbpe {
    private final zzeac zza;

    public zzbpm(zzeac zzeacVar) {
        this.zza = zzeacVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpe
    public final void zza(Object obj, Map map) {
        if (map == null || !map.containsKey("id") || TextUtils.isEmpty((CharSequence) map.get("id")) || !map.containsKey(StatsEvent.z) || TextUtils.isEmpty((CharSequence) map.get(StatsEvent.z))) {
            com.google.android.gms.ads.internal.util.zze.zza("Ignoring onDeviceStorageEvent GMSG: missing required parameters.");
            return;
        }
        try {
            this.zza.zza(Long.parseLong((String) map.get("id")), Integer.parseInt((String) map.get(StatsEvent.z)), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        } catch (NumberFormatException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Ignoring onDeviceStorageEvent GMSG: invalid number format for ID or eventType.", e);
        }
    }
}
