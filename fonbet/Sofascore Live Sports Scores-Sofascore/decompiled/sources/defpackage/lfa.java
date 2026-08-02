package defpackage;

import java.util.Date;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class lfa implements hn5 {
    public static final jfa f;
    public static final jfa g;
    public final HashMap a;
    public final HashMap b;
    public final ifa c;
    public boolean d;
    public static final ifa e = new ifa(0);
    public static final kfa h = new kfa();

    /* JADX WARN: Type inference failed for: r0v1, types: [jfa] */
    /* JADX WARN: Type inference failed for: r0v2, types: [jfa] */
    static {
        final int i = 0;
        f = new hkk() { // from class: jfa
            @Override // defpackage.en5
            public final void a(Object obj, Object obj2) {
                switch (i) {
                    case 0:
                        ((ikk) obj2).b((String) obj);
                        break;
                    default:
                        ((ikk) obj2).c(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i2 = 1;
        g = new hkk() { // from class: jfa
            @Override // defpackage.en5
            public final void a(Object obj, Object obj2) {
                switch (i2) {
                    case 0:
                        ((ikk) obj2).b((String) obj);
                        break;
                    default:
                        ((ikk) obj2).c(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public lfa() {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.b = hashMap2;
        this.c = e;
        this.d = false;
        hashMap2.put(String.class, f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, g);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, h);
        hashMap.remove(Date.class);
    }

    public final hn5 a(Class cls, sjd sjdVar) {
        this.a.put(cls, sjdVar);
        this.b.remove(cls);
        return this;
    }
}
