package defpackage;

import java.util.List;
import kotlin.Pair;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class t80 {
    public static final Pair a;

    static {
        km5 km5Var = km5.a;
        a = new Pair(km5Var, km5Var);
    }

    public static final void a(q80 q80Var, List list, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1794596951);
        int i2 = (i & 6) == 0 ? (av8Var.g(q80Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= av8Var.i(list) ? 32 : 16;
        }
        int i3 = 1;
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                p80 p80Var = (p80) list.get(i4);
                ct8 ct8Var = (ct8) p80Var.a;
                int i5 = p80Var.b;
                int i6 = p80Var.c;
                Object O = av8Var.O();
                if (O == nf3.a) {
                    O = g00.d;
                    av8Var.n0(O);
                }
                k1c k1cVar = (k1c) O;
                int hashCode = Long.hashCode(av8Var.T);
                aee m = av8Var.m();
                xtc C = fqj.C(av8Var, utc.a);
                if3.k7.getClass();
                zg3 zg3Var = hf3.b;
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, k1cVar, hf3.g);
                waa.K(av8Var, m, hf3.f);
                waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                waa.J(av8Var, hf3.k);
                waa.K(av8Var, C, hf3.d);
                ct8Var.invoke(q80Var.subSequence(i5, i6).b, av8Var, 0);
                av8Var.s(true);
            }
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new lj(q80Var, list, i, i3);
        }
    }
}
