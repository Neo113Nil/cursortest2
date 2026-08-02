package defpackage;

import com.ironsource.U3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class kaj implements Function2 {
    public final /* synthetic */ e1d a;
    public final /* synthetic */ uaj b;
    public final /* synthetic */ p3e c;
    public final /* synthetic */ Function2 d;

    public kaj(e1d e1dVar, uaj uajVar, p3e p3eVar, Function2 function2) {
        this.a = e1dVar;
        this.b = uajVar;
        this.c = p3eVar;
        this.d = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        of3 of3Var = (of3) obj;
        int intValue = ((Number) obj2).intValue();
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
            xtc D = ww9.D(utc.a, "Container");
            tj4 tj4Var = new tj4(0, 23, e1d.class, this.a, U3.i.X, "getValue()Ljava/lang/Object;");
            qha.z(this.b);
            xtc Z = td4.Z(D, new vsc(5, tj4Var, this.c, uxf.o));
            k1c c = e12.c(uxf.c, true);
            int G = z8e.G(av8Var);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, Z);
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
            me4.l(0, this.d, av8Var, true);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }
}
