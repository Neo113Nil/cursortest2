package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbbx extends zzazv {
    public final Long a;
    public final Boolean b;
    public final Boolean c;

    public zzbbx(String str) {
        HashMap b = zzazv.b(str);
        if (b != null) {
            this.a = (Long) b.get(0);
            this.b = (Boolean) b.get(1);
            this.c = (Boolean) b.get(2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzazv
    public final HashMap a() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.a);
        hashMap.put(1, this.b);
        hashMap.put(2, this.c);
        return hashMap;
    }

    public zzbbx() {
    }
}
