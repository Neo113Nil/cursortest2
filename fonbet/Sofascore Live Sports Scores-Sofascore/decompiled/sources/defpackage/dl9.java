package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class dl9 {
    public static final bjb a = ejb.b("io.ktor.client.plugins.HttpTimeout");
    public static final sx2 b;

    static {
        cl9 cl9Var = cl9.a;
        yh9 yh9Var = new yh9(5);
        cl9Var.getClass();
        b = new sx2("HttpTimeout", (Function0) cl9Var, (Function1) yh9Var);
    }

    public static final int a(long j) {
        if (j == Long.MAX_VALUE) {
            return 0;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j;
    }
}
