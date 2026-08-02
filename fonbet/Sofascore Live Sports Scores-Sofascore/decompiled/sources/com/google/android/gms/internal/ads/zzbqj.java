package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import com.unity3d.services.UnityAdsConstants;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbqj implements zzbqh {
    public final zzbqk a;

    public zzbqj(zzbqk zzbqkVar) {
        this.a = zzbqkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqh
    public final void a(Object obj, Map map) {
        zzclm zzclmVar = (zzclm) obj;
        boolean equals = "1".equals(map.get("transparentBackground"));
        boolean equals2 = "1".equals(map.get("blur"));
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        try {
            if (map.get("blurRadius") != null) {
                f = Float.parseFloat((String) map.get("blurRadius"));
            }
        } catch (NumberFormatException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzg("Fail to parse float", e);
        }
        zzbqk zzbqkVar = this.a;
        synchronized (zzbqkVar) {
            zzbqkVar.a = equals;
            zzbqkVar.d.set(true);
        }
        synchronized (zzbqkVar) {
            zzbqkVar.b = equals2;
            zzbqkVar.c = f;
        }
        zzclmVar.e0((int) f, equals);
    }
}
