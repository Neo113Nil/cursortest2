package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class hie {
    public static final m10 a;
    public static final jle b;
    public static final p4h c;

    static {
        String property = System.getProperty("java.vm.name");
        property.getClass();
        int i = 1;
        if (property.equals("RoboVM")) {
            a = null;
            b = new jle(1);
            c = new p4h(17);
        } else if (property.equals("Dalvik")) {
            a = new m10(0);
            b = new cuf(0);
            c = new v62(17);
        } else {
            a = null;
            b = new cuf(i);
            c = new v62(17);
        }
    }
}
