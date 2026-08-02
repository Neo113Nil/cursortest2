package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class eso extends neo {
    public final Long a;
    public final Long b;
    public final Long c;
    public final Long d;
    public final Long e;
    public final Long f;
    public final Long g;
    public final Long h;
    public final Long i;
    public final Long j;
    public final Long k;

    public eso(String str) {
        HashMap b = neo.b(str);
        if (b != null) {
            this.a = (Long) b.get(0);
            this.b = (Long) b.get(1);
            this.c = (Long) b.get(2);
            this.d = (Long) b.get(3);
            this.e = (Long) b.get(4);
            this.f = (Long) b.get(5);
            this.g = (Long) b.get(6);
            this.h = (Long) b.get(7);
            this.i = (Long) b.get(8);
            this.j = (Long) b.get(9);
            this.k = (Long) b.get(10);
        }
    }

    @Override // defpackage.neo
    public final HashMap a() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.a);
        hashMap.put(1, this.b);
        hashMap.put(2, this.c);
        hashMap.put(3, this.d);
        hashMap.put(4, this.e);
        hashMap.put(5, this.f);
        hashMap.put(6, this.g);
        hashMap.put(7, this.h);
        hashMap.put(8, this.i);
        hashMap.put(9, this.j);
        hashMap.put(10, this.k);
        return hashMap;
    }

    public eso() {
    }
}
