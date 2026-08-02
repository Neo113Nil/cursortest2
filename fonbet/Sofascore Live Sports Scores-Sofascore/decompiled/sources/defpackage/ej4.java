package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ej4 implements Function2 {
    public final /* synthetic */ ksa a;
    public final /* synthetic */ IntRange b;
    public final /* synthetic */ kg2 c;
    public final /* synthetic */ lg2 d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ eg2 f;
    public final /* synthetic */ Long g;
    public final /* synthetic */ gi4 h;
    public final /* synthetic */ di4 i;
    public final /* synthetic */ ci4 j;

    public ej4(ksa ksaVar, IntRange intRange, kg2 kg2Var, lg2 lg2Var, Function1 function1, eg2 eg2Var, Long l, gi4 gi4Var, di4 di4Var, ci4 ci4Var) {
        this.a = ksaVar;
        this.b = intRange;
        this.c = kg2Var;
        this.d = lg2Var;
        this.e = function1;
        this.f = eg2Var;
        this.g = l;
        this.h = gi4Var;
        this.i = di4Var;
        this.j = ci4Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        of3 of3Var = (of3) obj;
        int intValue = ((Number) obj2).intValue();
        int i = 0;
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
            Object O = av8Var.O();
            Object obj3 = nf3.a;
            if (O == obj3) {
                O = new bj4(i);
                av8Var.n0(O);
            }
            xtc a = o3h.a(utc.a, false, (Function1) O);
            IntRange intRange = fi4.a;
            ol4 C = tgj.C();
            g0i I = ufa.I(bwc.c, av8Var);
            boolean g = av8Var.g(C);
            ksa ksaVar = this.a;
            boolean g2 = g | av8Var.g(ksaVar);
            Object O2 = av8Var.O();
            if (g2 || O2 == obj3) {
                O2 = new gnh(new ei4(new gsa(ksaVar, f8h.i)), C, I);
                av8Var.n0(O2);
            }
            gnh gnhVar = (gnh) O2;
            boolean i2 = av8Var.i(this.b) | av8Var.i(this.c) | av8Var.g(this.d) | av8Var.g(this.e);
            Object obj4 = this.f;
            boolean g3 = i2 | av8Var.g(obj4) | av8Var.g(this.g) | av8Var.i(this.h) | av8Var.g(this.i);
            Object obj5 = this.j;
            boolean g4 = g3 | av8Var.g(obj5);
            Object O3 = av8Var.O();
            if (g4 || O3 == obj3) {
                O3 = new cj4(this.b, this.c, this.d, this.e, obj4, this.g, this.h, this.i, obj5, 0);
                av8Var.n0(O3);
            }
            v8a.c(a, ksaVar, null, null, null, gnhVar, false, null, (Function1) O3, av8Var, 0, 444);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }
}
