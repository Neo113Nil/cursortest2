package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbrb implements zzbqh {
    public final zzbra a;

    public zzbrb(zzbra zzbraVar) {
        this.a = zzbraVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqh
    public final void a(Object obj, Map map) {
        String str = (String) map.get("action");
        boolean equals = "grant".equals(str);
        zzbra zzbraVar = this.a;
        if (!equals) {
            if ("video_start".equals(str)) {
                zzbraVar.zza();
                return;
            } else {
                if ("video_complete".equals(str)) {
                    zzbraVar.zzc();
                    return;
                }
                return;
            }
        }
        zzcct zzcctVar = null;
        try {
            int parseInt = Integer.parseInt((String) map.get("amount"));
            String str2 = (String) map.get("type");
            if (!TextUtils.isEmpty(str2)) {
                zzcctVar = new zzcct(str2, parseInt);
            }
        } catch (NumberFormatException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("Unable to parse reward amount.", e);
        }
        zzbraVar.I(zzcctVar);
    }
}
