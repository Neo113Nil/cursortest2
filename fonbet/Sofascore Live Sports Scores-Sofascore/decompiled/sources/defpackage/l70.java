package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class l70 extends xka implements Function2 {
    public final /* synthetic */ axj i;
    public final /* synthetic */ Function1 j;
    public final /* synthetic */ xtc k;
    public final /* synthetic */ zo5 l;
    public final /* synthetic */ of6 m;
    public final /* synthetic */ Function2 n;
    public final /* synthetic */ ct8 o;
    public final /* synthetic */ int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l70(axj axjVar, Function1 function1, xtc xtcVar, zo5 zo5Var, of6 of6Var, Function2 function2, ct8 ct8Var, int i) {
        super(2);
        this.i = axjVar;
        this.j = function1;
        this.k = xtcVar;
        this.l = zo5Var;
        this.m = of6Var;
        this.n = function2;
        this.o = ct8Var;
        this.p = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        fz8.a(this.i, this.j, this.k, this.l, this.m, this.n, this.o, (of3) obj, aba.K(this.p | 1));
        return Unit.a;
    }
}
