package defpackage;

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ok6 {
    public static volatile ok6 a;
    public static final ok6 b;

    static {
        ok6 ok6Var = new ok6();
        Map map = Collections.EMPTY_MAP;
        b = ok6Var;
    }

    public static ok6 a() {
        ok6 ok6Var;
        kff kffVar = kff.c;
        ok6 ok6Var2 = a;
        if (ok6Var2 != null) {
            return ok6Var2;
        }
        synchronized (ok6.class) {
            try {
                ok6Var = a;
                if (ok6Var == null) {
                    Class cls = kk6.a;
                    ok6 ok6Var3 = null;
                    if (cls != null) {
                        try {
                            ok6Var3 = (ok6) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    ok6Var = ok6Var3 != null ? ok6Var3 : b;
                    a = ok6Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ok6Var;
    }
}
