package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rni implements Function2 {
    public final /* synthetic */ xtc a;
    public final /* synthetic */ uah b;
    public final /* synthetic */ long c;
    public final /* synthetic */ float d;
    public final /* synthetic */ qz1 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ Function2 g;

    public rni(xtc xtcVar, uah uahVar, long j, float f, qz1 qz1Var, float f2, Function2 function2) {
        this.a = xtcVar;
        this.b = uahVar;
        this.c = j;
        this.d = f;
        this.e = qz1Var;
        this.f = f2;
        this.g = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        of3 of3Var = (of3) obj;
        int intValue = ((Number) obj2).intValue();
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
            xtc d = uni.d(this.a, this.b, uni.e(this.c, this.d, av8Var), this.e, ((kx4) av8Var.k(dh3.h)).H0(this.f));
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = new rfi(3);
                av8Var.n0(O);
            }
            xtc a = o3h.a(d, false, (Function1) O);
            Unit unit = Unit.a;
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = nw2.e;
                av8Var.n0(O2);
            }
            xtc a2 = koi.a(a, unit, (PointerInputEventHandler) O2);
            k1c c = e12.c(uxf.c, true);
            int G = z8e.G(av8Var);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, a2);
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
            me4.l(0, this.g, av8Var, true);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }
}
