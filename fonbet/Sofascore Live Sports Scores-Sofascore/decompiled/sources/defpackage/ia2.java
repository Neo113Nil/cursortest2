package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class ia2 {
    public static final ThreadLocal a = new ThreadLocal();
    public static final Class b;
    public static final long c;

    static {
        Class<?> cls;
        long objectFieldOffset;
        try {
            cls = Class.forName("java.io.FileOutputStream");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        b = cls;
        if (cls != null) {
            if (uck.e) {
                objectFieldOffset = uck.c.b.objectFieldOffset(cls.getDeclaredField("channel"));
                c = objectFieldOffset;
            }
        }
        objectFieldOffset = -1;
        c = objectFieldOffset;
    }
}
