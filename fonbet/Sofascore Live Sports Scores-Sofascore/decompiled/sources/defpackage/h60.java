package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class h60 extends xka implements Function2 {
    public final /* synthetic */ int i = 1;
    public final /* synthetic */ axj j;
    public final /* synthetic */ Function1 k;
    public final /* synthetic */ xtc l;
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ ct8 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h60(axj axjVar, xtc xtcVar, Function1 function1, io ioVar, Function1 function12, tc3 tc3Var, int i) {
        super(2);
        this.j = axjVar;
        this.l = xtcVar;
        this.k = function1;
        this.o = ioVar;
        this.n = function12;
        this.p = tc3Var;
        this.m = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.i;
        int i2 = this.m;
        Object obj3 = this.o;
        Object obj4 = this.n;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                tc3 tc3Var = (tc3) this.p;
                int K = aba.K(i2 | 1);
                axj axjVar = this.j;
                xtc xtcVar = this.l;
                Function1 function1 = this.k;
                l98.a(axjVar, xtcVar, function1, (io) obj3, (Function1) obj4, tc3Var, (of3) obj, K);
                break;
            default:
                ((Number) obj2).intValue();
                int K2 = aba.K(i2 | 1);
                axj axjVar2 = this.j;
                Function1 function12 = this.k;
                xtc xtcVar2 = this.l;
                fz8.f(axjVar2, function12, xtcVar2, (zo5) obj4, (of6) obj3, this.p, (of3) obj, K2);
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h60(axj axjVar, Function1 function1, xtc xtcVar, zo5 zo5Var, of6 of6Var, ct8 ct8Var, int i) {
        super(2);
        this.j = axjVar;
        this.k = function1;
        this.l = xtcVar;
        this.n = zo5Var;
        this.o = of6Var;
        this.p = ct8Var;
        this.m = i;
    }
}
