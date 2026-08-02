package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class vy6 implements Function2 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Function1 f;
    public final /* synthetic */ xtc g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ vy6(gv9 gv9Var, il8 il8Var, boolean z, Function1 function1, boolean z2, xtc xtcVar, boolean z3, int i) {
        this.h = gv9Var;
        this.i = il8Var;
        this.b = z;
        this.f = function1;
        this.c = z2;
        this.g = xtcVar;
        this.e = z3;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.d;
        Object obj3 = this.i;
        Object obj4 = this.h;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int K = aba.K(i2 | 1);
                s02.p((gv9) obj4, (il8) obj3, this.b, this.f, this.c, this.g, this.e, (of3) obj, K);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int K2 = aba.K(1);
                wnn.j(this.b, this.c, this.d, this.e, this.f, (Function0) obj4, this.g, (qug) obj3, (of3) obj, K2);
                break;
            default:
                ((Integer) obj2).getClass();
                int K3 = aba.K(i2 | 1);
                i2a.h((epi) obj4, this.g, this.b, this.c, this.e, this.f, (tc3) obj3, (of3) obj, K3);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ vy6(epi epiVar, xtc xtcVar, boolean z, boolean z2, boolean z3, Function1 function1, tc3 tc3Var, int i) {
        this.h = epiVar;
        this.g = xtcVar;
        this.b = z;
        this.c = z2;
        this.e = z3;
        this.f = function1;
        this.i = tc3Var;
        this.d = i;
    }

    public /* synthetic */ vy6(boolean z, boolean z2, int i, boolean z3, Function1 function1, Function0 function0, xtc xtcVar, qug qugVar, int i2) {
        this.b = z;
        this.c = z2;
        this.d = i;
        this.e = z3;
        this.f = function1;
        this.h = function0;
        this.g = xtcVar;
        this.i = qugVar;
    }
}
