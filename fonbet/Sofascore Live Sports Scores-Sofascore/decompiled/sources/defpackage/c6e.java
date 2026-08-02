package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class c6e {
    public static final b6e a;
    public static final r5e b;

    static {
        b6e b6eVar = new b6e(0);
        a = b6eVar;
        b = new r5e(km5.a, 0, 0, 0, ewd.b, 0, 0, 0, rik.h, new spa(2), s9a.c(g.a), b6eVar, cn3.b(0, 0, 0, 0, 15));
    }

    public static final long a(r5e r5eVar, int i) {
        int i2 = r5eVar.c;
        int i3 = r5eVar.b;
        long j = i * (i2 + i3);
        int i4 = -r5eVar.f;
        long j2 = ((j + i4) + r5eVar.d) - i2;
        int e = (int) (r5eVar.e == ewd.b ? r5eVar.e() >> 32 : r5eVar.e() & 4294967295L);
        long c = j2 - (e - llf.c(r5eVar.n.a(e, i3, i4, r2), 0, e));
        if (c < 0) {
            return 0L;
        }
        return c;
    }

    public static final pr4 b(int i, Function0 function0, of3 of3Var, int i2, int i3) {
        boolean z = true;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        Object[] objArr = new Object[0];
        y3g y3gVar = pr4.G;
        boolean z2 = ((((i2 & 14) ^ 6) > 4 && ((av8) of3Var).e(i)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && ((av8) of3Var).d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) || (i2 & 48) == 32);
        if ((((i2 & 896) ^ 384) <= 256 || !((av8) of3Var).g(function0)) && (i2 & 384) != 256) {
            z = false;
        }
        boolean z3 = z2 | z;
        av8 av8Var = (av8) of3Var;
        Object O = av8Var.O();
        if (z3 || O == nf3.a) {
            O = new bk7(i, function0);
            av8Var.n0(O);
        }
        pr4 pr4Var = (pr4) o3a.M(objArr, y3gVar, (Function0) O, av8Var, 0);
        ((eoh) pr4Var.F).setValue(function0);
        return pr4Var;
    }
}
