package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class t23 {
    public static final u23 a = new u23(ww9.d, uxf.o);

    public static final u23 a(pg0 pg0Var, fo foVar, of3 of3Var, int i) {
        if (pg0Var.equals(ww9.d) && Intrinsics.c(foVar, uxf.o)) {
            av8 av8Var = (av8) of3Var;
            av8Var.d0(-1446604504);
            av8Var.s(false);
            return a;
        }
        av8 av8Var2 = (av8) of3Var;
        av8Var2.d0(-1446550657);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && av8Var2.g(pg0Var)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !av8Var2.g(foVar)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object O = av8Var2.O();
        if (z3 || O == nf3.a) {
            O = new u23(pg0Var, foVar);
            av8Var2.n0(O);
        }
        u23 u23Var = (u23) O;
        av8Var2.s(false);
        return u23Var;
    }
}
