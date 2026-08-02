package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import defpackage.sw9;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcth implements zzcsl {
    public final zzflc a;

    public zzcth(zzflc zzflcVar) {
        this.a = zzflcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcsl
    public final void a(HashMap hashMap) {
        String str = (String) hashMap.get("render_in_browser");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.a.a(Boolean.parseBoolean(str));
        } catch (Exception e) {
            sw9.m("Invalid render_in_browser state", e);
        }
    }
}
