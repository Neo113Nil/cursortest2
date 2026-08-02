package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class k8g {
    public static final l8g a = new l8g(ww9.b, uxf.l);

    public static final l8g a(lg0 lg0Var, lv1 lv1Var, of3 of3Var, int i) {
        if (Intrinsics.c(lg0Var, ww9.b) && Intrinsics.c(lv1Var, uxf.l)) {
            av8 av8Var = (av8) of3Var;
            av8Var.d0(-1073830487);
            av8Var.s(false);
            return a;
        }
        av8 av8Var2 = (av8) of3Var;
        av8Var2.d0(-1073779616);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && av8Var2.g(lg0Var)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !av8Var2.g(lv1Var)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object O = av8Var2.O();
        if (z3 || O == nf3.a) {
            O = new l8g(lg0Var, lv1Var);
            av8Var2.n0(O);
        }
        l8g l8gVar = (l8g) O;
        av8Var2.s(false);
        return l8gVar;
    }
}
