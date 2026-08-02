package defpackage;

import java.time.LocalDate;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class mj4 implements Function2 {
    public final /* synthetic */ kg2 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ IntRange c;
    public final /* synthetic */ xtc d;
    public final /* synthetic */ ci4 e;
    public final /* synthetic */ Function1 f;
    public final /* synthetic */ di4 g;

    public mj4(kg2 kg2Var, long j, IntRange intRange, xtc xtcVar, ci4 ci4Var, Function1 function1, di4 di4Var) {
        this.a = kg2Var;
        this.b = j;
        this.c = intRange;
        this.d = xtcVar;
        this.e = ci4Var;
        this.f = function1;
        this.g = di4Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ng0 ng0Var;
        of3 of3Var = (of3) obj;
        int intValue = ((Number) obj2).intValue();
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
            kg2 kg2Var = this.a;
            eg2 d = kg2Var.d();
            int i = kg2Var.c(LocalDate.of(d.a, d.b, 1)).a;
            int i2 = kg2Var.b(this.b).a;
            IntRange intRange = this.c;
            qpa a = tpa.a(Math.max(0, (i2 - intRange.a) - 3), 2, av8Var);
            l39 l39Var = new l39();
            ci4 ci4Var = this.e;
            xtc q = n9e.q(this.d, ci4Var.a, oyn.e);
            kg0 kg0Var = ww9.g;
            ng0 ng0Var2 = new ng0(oj4.b, true, new a70(6));
            boolean i3 = av8Var.i(kg2Var) | av8Var.i(intRange) | av8Var.e(i2) | av8Var.e(i) | av8Var.g(this.f) | av8Var.g(this.g) | av8Var.g(ci4Var);
            Object O = av8Var.O();
            if (i3 || O == nf3.a) {
                ng0Var = ng0Var2;
                jj4 jj4Var = new jj4(this.c, this.a, i2, i, this.f, this.g, ci4Var);
                av8Var.n0(jj4Var);
                O = jj4Var;
            } else {
                ng0Var = ng0Var2;
            }
            haa.d(l39Var, q, a, null, ng0Var, kg0Var, null, false, null, (Function1) O, av8Var, 1769472, 920);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }
}
