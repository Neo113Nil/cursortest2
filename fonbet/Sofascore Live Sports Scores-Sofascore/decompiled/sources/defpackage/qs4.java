package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qs4 {
    public static final qs4 a = new qs4();

    public final void a(iih iihVar, of3 of3Var, int i) {
        float f = iihVar.f;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(2137486921);
        int i2 = 4;
        int i3 = i | (av8Var.g(iihVar) ? 4 : 2);
        int i4 = 0;
        if (av8Var.T(i3 & 1, (i3 & 3) != 2)) {
            zkj zkjVar = iihVar.h;
            if (Float.isNaN(f) || (Float.floatToRawIntBits(f) & Integer.MAX_VALUE) >= 2139095040) {
                a70.p("The expandedHeight is expected to be specified and finite");
                return;
            }
            boolean g = av8Var.g(zkjVar) | av8Var.g(null);
            Object O = av8Var.O();
            Object obj = nf3.a;
            if (g || O == obj) {
                O = goh.b(new ps4(iihVar, i4));
                av8Var.n0(O);
            }
            cdi a2 = wih.a(((r13) ((cdi) O).getValue()).a, ufa.I(bwc.c, av8Var), null, av8Var, 0, 12);
            tc3 H = yqo.H(-1658896622, av8Var, new os4(iihVar, i4));
            av8Var.d0(690108113);
            av8Var.s(false);
            xtc xtcVar = iihVar.a;
            utc utcVar = utc.a;
            xtc z = xtcVar.z(utcVar);
            boolean g2 = av8Var.g(a2);
            Object O2 = av8Var.O();
            if (g2 || O2 == obj) {
                O2 = new cl1(a2, i2);
                av8Var.n0(O2);
            }
            xtc X = td4.X(z, (Function1) O2);
            Object O3 = av8Var.O();
            if (O3 == obj) {
                O3 = new bj4(i2);
                av8Var.n0(O3);
            }
            xtc a3 = o3h.a(X, false, (Function1) O3);
            Unit unit = Unit.a;
            Object O4 = av8Var.O();
            if (O4 == obj) {
                O4 = nw2.c;
                av8Var.n0(O4);
            }
            xtc a4 = koi.a(a3, unit, (PointerInputEventHandler) O4);
            k1c c = e12.c(uxf.c, false);
            int G = z8e.G(av8Var);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, a4);
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
            xtc B = wnn.B(td4.A0(utcVar, iihVar.g));
            ff5 ff5Var = oa0.a;
            boolean z2 = (i3 & 14) == 4;
            Object O5 = av8Var.O();
            if (z2 || O5 == obj) {
                O5 = new ms4();
                av8Var.n0(O5);
            }
            a88 a88Var = (a88) O5;
            long j = zkjVar.c;
            long j2 = zkjVar.d;
            long j3 = zkjVar.e;
            long j4 = zkjVar.f;
            dfj dfjVar = iihVar.b;
            dfj dfjVar2 = iihVar.c;
            tc3 tc3Var = iihVar.d;
            float f2 = iihVar.f;
            Object O6 = av8Var.O();
            if (O6 == obj) {
                O6 = new wc4(10);
                av8Var.n0(O6);
            }
            oa0.c(B, a88Var, j, j2, j4, j3, dfjVar, dfjVar2, (Function0) O6, tc3Var, H, f2, av8Var, 0);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ns4(this, iihVar, i, 0);
        }
    }
}
