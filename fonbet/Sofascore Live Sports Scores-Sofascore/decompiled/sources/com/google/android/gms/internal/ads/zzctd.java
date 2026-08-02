package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzctd implements zzcsl {
    public final com.google.android.gms.ads.internal.util.zzg a;

    public zzctd(com.google.android.gms.ads.internal.util.zzj zzjVar) {
        this.a = zzjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcsl
    public final void a(HashMap hashMap) {
        int intValue;
        String str = (String) hashMap.get("default_queue_capacity");
        if (str == null || (intValue = Float.valueOf(str).intValue()) <= 0) {
            return;
        }
        this.a.zzU(intValue);
    }
}
