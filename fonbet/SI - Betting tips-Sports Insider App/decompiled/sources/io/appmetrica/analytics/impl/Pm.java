package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Pm {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f12764a;

    public Pm() {
        HashMap hashMap = new HashMap();
        this.f12764a = hashMap;
        Jm jm = new Jm();
        Km km = new Km();
        Lm lm = new Lm();
        Mm mm = new Mm();
        hashMap.put(C0264jm.class, jm);
        hashMap.put(T1.class, km);
        hashMap.put(C0103df.class, lm);
        hashMap.put(C0470s3.class, mm);
    }

    public static Qm a(Class cls) {
        return (Qm) Om.f12714a.f12764a.get(cls);
    }
}
