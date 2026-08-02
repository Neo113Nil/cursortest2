package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzboy implements zzbqh {
    public final zzboz a;

    public zzboy(zzboz zzbozVar) {
        this.a = zzbozVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqh
    public final void a(Object obj, Map map) {
        String str = (String) map.get("name");
        if (str == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzi("App event with no name parameter.");
        } else {
            this.a.l0(str, (String) map.get("info"));
        }
    }
}
