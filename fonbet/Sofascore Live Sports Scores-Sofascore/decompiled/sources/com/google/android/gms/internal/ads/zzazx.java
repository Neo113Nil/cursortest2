package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzazx extends zzazv {
    public String a;
    public final long b;
    public final String c;
    public final String d;
    public final String e;

    public zzazx(String str) {
        this.a = "E";
        this.b = -1L;
        this.c = "E";
        this.d = "E";
        this.e = "E";
        HashMap b = zzazv.b(str);
        if (b != null) {
            this.a = b.get(0) == null ? "E" : (String) b.get(0);
            this.b = b.get(1) != null ? ((Long) b.get(1)).longValue() : -1L;
            this.c = b.get(2) == null ? "E" : (String) b.get(2);
            this.d = b.get(3) == null ? "E" : (String) b.get(3);
            this.e = b.get(4) != null ? (String) b.get(4) : "E";
        }
    }

    @Override // com.google.android.gms.internal.ads.zzazv
    public final HashMap a() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.a);
        hashMap.put(4, this.e);
        hashMap.put(3, this.d);
        hashMap.put(2, this.c);
        hashMap.put(1, Long.valueOf(this.b));
        return hashMap;
    }

    public zzazx() {
        this.a = "E";
        this.b = -1L;
        this.c = "E";
        this.d = "E";
        this.e = "E";
    }
}
