package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbqi implements zzbqh {
    public final zzedp a;

    public zzbqi(zzedp zzedpVar) {
        this.a = zzedpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqh
    public final void a(Object obj, Map map) {
        if (map == null || !map.containsKey("persistentData") || TextUtils.isEmpty((CharSequence) map.get("persistentData"))) {
            return;
        }
        zzedp zzedpVar = this.a;
        String str = (String) map.get("persistentData");
        synchronized (zzedpVar) {
            zzedpVar.x = str;
            com.google.android.gms.ads.internal.zzt.zzh().g().zzO(zzedpVar.x);
        }
    }
}
