package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzctp implements zzcsl {
    public final zzedp a;

    public zzctp(zzedp zzedpVar) {
        this.a = zzedpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcsl
    public final void a(HashMap hashMap) {
        String str = (String) hashMap.get("test_mode_enabled");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.a.b(str.equals("true"));
    }
}
