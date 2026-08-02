package defpackage;

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class nk6 {
    public static volatile nk6 a;
    public static final nk6 b;

    static {
        nk6 nk6Var = new nk6();
        Map map = Collections.EMPTY_MAP;
        b = nk6Var;
    }

    public static nk6 a() {
        nk6 nk6Var;
        hff hffVar = hff.c;
        nk6 nk6Var2 = a;
        if (nk6Var2 != null) {
            return nk6Var2;
        }
        synchronized (nk6.class) {
            try {
                nk6Var = a;
                if (nk6Var == null) {
                    Class cls = ik6.a;
                    nk6 nk6Var3 = null;
                    if (cls != null) {
                        try {
                            nk6Var3 = (nk6) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    nk6Var = nk6Var3 != null ? nk6Var3 : b;
                    a = nk6Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return nk6Var;
    }
}
