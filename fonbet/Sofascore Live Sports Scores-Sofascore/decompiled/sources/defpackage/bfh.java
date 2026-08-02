package defpackage;

import com.sofascore.results.R;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class bfh {
    public static final i4k a = s02.h0(300, 0, jg5.a, 2);

    public static final void a(tc3 tc3Var, of3 of3Var, int i) {
        tc3 tc3Var2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1033612924);
        int i2 = 1;
        if (av8Var.T(i & 1, (i & 19) != 18)) {
            String B = cga.B(R.string.m3c_bottom_sheet_drag_handle_description, av8Var);
            we9 we9Var = new we9(uxf.p);
            k1c c = e12.c(uxf.c, false);
            int G = z8e.G(av8Var);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, we9Var);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c, hf3.g);
            waa.K(av8Var, m, hf3.f);
            f50 f50Var = hf3.j;
            if (av8Var.S || !Intrinsics.c(av8Var.O(), Integer.valueOf(G))) {
                mz1.t(G, av8Var, G, f50Var);
            }
            waa.K(av8Var, C, hf3.d);
            tc3Var2 = tc3Var;
            vkj.b(rkj.a(av8Var), yqo.H(2059851063, av8Var, new fj4(B, i2)), vkj.c(av8Var), null, false, tc3Var2, av8Var, 100663344);
            av8Var.s(true);
        } else {
            tc3Var2 = tc3Var;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new b25(i, 7, tc3Var2);
        }
    }
}
