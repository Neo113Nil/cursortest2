package defpackage;

import androidx.compose.runtime.e;
import com.unity3d.services.UnityAdsConstants;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class a60 {
    public static final g0i a = s02.e0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 7);

    static {
        Map map = hwk.a;
        s02.e0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new p75(0.4f), 3);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
    }

    public static final cdi a(float f, j38 j38Var, String str, Function1 function1, of3 of3Var, int i, int i2) {
        if ((i2 & 4) != 0) {
            str = "DpAnimation";
        }
        String str2 = str;
        if ((i2 & 8) != 0) {
            function1 = null;
        }
        int i3 = i << 6;
        return c(new p75(f), lz.h, j38Var, null, str2, function1, of3Var, ((i << 3) & 896) | (57344 & i3) | (i3 & 458752), 8);
    }

    public static final cdi b(float f, c80 c80Var, String str, of3 of3Var, int i, int i2) {
        c80 c80Var2;
        int i3 = i2 & 2;
        g0i g0iVar = a;
        if (i3 != 0) {
            c80Var = g0iVar;
        }
        if ((i2 & 8) != 0) {
            str = "FloatAnimation";
        }
        String str2 = str;
        if (c80Var == g0iVar) {
            av8 av8Var = (av8) of3Var;
            av8Var.d0(1144115775);
            boolean d = av8Var.d(0.01f);
            Object O = av8Var.O();
            if (d || O == nf3.a) {
                O = s02.e0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.valueOf(0.01f), 3);
                av8Var.n0(O);
            }
            av8Var.s(false);
            c80Var2 = (g0i) O;
        } else {
            av8 av8Var2 = (av8) of3Var;
            av8Var2.d0(1144225701);
            av8Var2.s(false);
            c80Var2 = c80Var;
        }
        return c(Float.valueOf(f), lz.f, c80Var2, null, str2, null, of3Var, (i << 3) & 57344, 0);
    }

    public static final cdi c(Object obj, q4k q4kVar, c80 c80Var, Float f, String str, Function1 function1, of3 of3Var, int i, int i2) {
        if ((i2 & 8) != 0) {
            f = null;
        }
        av8 av8Var = (av8) of3Var;
        Object O = av8Var.O();
        Object obj2 = nf3.a;
        if (O == obj2) {
            O = e.f(null);
            av8Var.n0(O);
        }
        e1d e1dVar = (e1d) O;
        Object O2 = av8Var.O();
        if (O2 == obj2) {
            O2 = new q50(obj, q4kVar, f);
            av8Var.n0(O2);
        }
        q50 q50Var = (q50) O2;
        Object g = e.g(function1, av8Var);
        if (f != null && (c80Var instanceof g0i)) {
            g0i g0iVar = (g0i) c80Var;
            if (!Intrinsics.c(g0iVar.c, f)) {
                c80Var = new g0i(g0iVar.a, g0iVar.b, f);
            }
        }
        Object g2 = e.g(c80Var, av8Var);
        Object O3 = av8Var.O();
        if (O3 == obj2) {
            O3 = ml4.g(-1, 6, null);
            av8Var.n0(O3);
        }
        Object obj3 = (ln2) O3;
        boolean i3 = av8Var.i(obj3) | av8Var.i(obj);
        Object O4 = av8Var.O();
        if (i3 || O4 == obj2) {
            O4 = new j4(7, obj3, obj);
            av8Var.n0(O4);
        }
        hz8.t((Function0) O4, av8Var);
        boolean i4 = av8Var.i(obj3) | av8Var.i(q50Var) | av8Var.g(g2) | av8Var.g(g);
        Object O5 = av8Var.O();
        if (i4 || O5 == obj2) {
            Object jkVar = new jk(obj3, q50Var, g2, g, null, 1);
            av8Var.n0(jkVar);
            O5 = jkVar;
        }
        hz8.o(av8Var, obj3, (Function2) O5);
        cdi cdiVar = (cdi) e1dVar.getValue();
        return cdiVar == null ? q50Var.c : cdiVar;
    }
}
