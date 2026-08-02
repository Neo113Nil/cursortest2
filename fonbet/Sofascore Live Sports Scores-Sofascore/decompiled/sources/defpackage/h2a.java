package defpackage;

import androidx.compose.runtime.e;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class h2a {
    public final i1d a = new i1d(new f2a[16], 0);
    public final e1d b = e.f(Boolean.FALSE);
    public long c = Long.MIN_VALUE;
    public final e1d d = e.f(Boolean.TRUE);

    public final void a(int i, of3 of3Var) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-318043801);
        int i2 = (av8Var.i(this) ? 4 : 2) | i;
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            Object O = av8Var.O();
            rq3 rq3Var = null;
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = e.f(null);
                av8Var.n0(O);
            }
            e1d e1dVar = (e1d) O;
            if (((Boolean) ((eoh) this.d).getValue()).booleanValue() || ((Boolean) ((eoh) this.b).getValue()).booleanValue()) {
                av8Var.d0(-144841960);
                boolean i3 = av8Var.i(this);
                Object O2 = av8Var.O();
                if (i3 || O2 == a99Var) {
                    O2 = new va8(e1dVar, this, rq3Var, 6);
                    av8Var.n0(O2);
                }
                hz8.o(av8Var, this, (Function2) O2);
                av8Var.s(false);
            } else {
                av8Var.d0(-143455237);
                av8Var.s(false);
            }
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new hl7(this, i, 29);
        }
    }
}
