package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcsr implements zzcsl {
    public final zzedp a;

    public zzcsr(zzedp zzedpVar) {
        this.a = zzedpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcsl
    public final void a(HashMap hashMap) {
        String str = (String) hashMap.get("gesture");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int hashCode = str.hashCode();
        zzedp zzedpVar = this.a;
        if (hashCode != 97520651) {
            if (hashCode == 109399814 && str.equals("shake")) {
                zzedpVar.h(zzedl.b, true);
                return;
            }
        } else if (str.equals("flick")) {
            zzedpVar.h(zzedl.c, true);
            return;
        }
        zzedpVar.h(zzedl.a, true);
    }
}
