package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class sk7 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ xtc f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Enum l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    public /* synthetic */ sk7(gv9 gv9Var, ev6 ev6Var, Function1 function1, il8 il8Var, Function0 function0, boolean z, boolean z2, boolean z3, xtc xtcVar, boolean z4, gv9 gv9Var2, int i, int i2) {
        this.j = gv9Var;
        this.k = ev6Var;
        this.b = function1;
        this.l = il8Var;
        this.m = function0;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = xtcVar;
        this.g = z4;
        this.n = gv9Var2;
        this.h = i;
        this.i = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int K = aba.K(this.h | 1);
                zm2.d((qug) this.j, this.f, this.b, (mei) this.l, (nei) this.m, (ct8) this.n, this.c, (Function1) this.k, this.d, this.e, this.g, (of3) obj, K, this.i);
                break;
            default:
                ((Integer) obj2).getClass();
                int K2 = aba.K(this.h | 1);
                tol.j((gv9) this.j, (ev6) this.k, this.b, (il8) this.l, (Function0) this.m, this.c, this.d, this.e, this.f, this.g, (gv9) this.n, (of3) obj, K2, this.i);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ sk7(qug qugVar, xtc xtcVar, Function1 function1, mei meiVar, nei neiVar, ct8 ct8Var, boolean z, Function1 function12, boolean z2, boolean z3, boolean z4, int i, int i2) {
        this.j = qugVar;
        this.f = xtcVar;
        this.b = function1;
        this.l = meiVar;
        this.m = neiVar;
        this.n = ct8Var;
        this.c = z;
        this.k = function12;
        this.d = z2;
        this.e = z3;
        this.g = z4;
        this.h = i;
        this.i = i2;
    }
}
