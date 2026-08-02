package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class x6n {
    public static final boolean a;
    public static final n6n b;
    public static final t6n c;
    public static final v6n d;

    static {
        boolean z;
        v6n v6nVar;
        try {
            Class.forName("java.sql.Date");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        a = z;
        if (z) {
            b = r6n.b;
            c = u6n.b;
            v6nVar = w6n.b;
        } else {
            v6nVar = null;
            b = null;
            c = null;
        }
        d = v6nVar;
    }
}
