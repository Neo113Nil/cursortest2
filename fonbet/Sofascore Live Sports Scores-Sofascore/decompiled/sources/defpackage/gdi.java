package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class gdi {
    public static final ih2 a;
    public static final ih2 b;

    static {
        int i = 5;
        a = new ih2("NONE", i);
        b = new ih2("PENDING", i);
    }

    public static final fdi a(Object obj) {
        if (obj == null) {
            obj = rid.a;
        }
        return new fdi(obj);
    }
}
