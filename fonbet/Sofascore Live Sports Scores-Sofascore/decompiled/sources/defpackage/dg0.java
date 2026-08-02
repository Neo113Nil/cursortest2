package defpackage;

import android.os.SystemClock;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class dg0 {
    public static volatile boolean a;
    public static volatile boolean b;
    public static volatile boolean c;
    public static final fdi d;
    public static final jof e;
    public static final Object f;
    public static qa3 g;
    public static bg0 h;
    public static long i;

    static {
        fdi a2 = gdi.a(cg0.a);
        d = a2;
        e = un0.u(a2);
        f = new Object();
    }

    public static void a() {
        ag0 ag0Var = ag0.a;
        synchronized (f) {
            try {
                qa3 qa3Var = g;
                if (qa3Var == null || !qa3Var.V(ag0Var)) {
                    h = ag0Var;
                    i = SystemClock.elapsedRealtime();
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
