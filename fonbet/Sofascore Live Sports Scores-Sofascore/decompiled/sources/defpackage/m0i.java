package defpackage;

import java.sql.Date;
import java.sql.Timestamp;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class m0i {
    public static final boolean a;
    public static final l0i b;
    public static final l0i c;
    public static final hh0 d;
    public static final hh0 e;
    public static final hh0 f;

    static {
        boolean z;
        try {
            Class.forName("java.sql.Date");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        a = z;
        if (z) {
            b = new l0i(0, Date.class);
            c = new l0i(1, Timestamp.class);
            d = j0i.c;
            e = j0i.d;
            f = k0i.c;
            return;
        }
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
    }
}
