package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcyn implements zzcyo {
    public final Map a;

    public zzcyn(Map map) {
        this.a = map;
    }

    @Override // com.google.android.gms.internal.ads.zzcyo
    public final zzemq a(int i, String str) {
        return (zzemq) this.a.get(str);
    }
}
