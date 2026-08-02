package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class g50 extends xka implements Function2 {
    public final /* synthetic */ int i;
    public final /* synthetic */ xtc j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ dt8 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g50(int i, int i2, int i3, dt8 dt8Var, xtc xtcVar, Object obj, Object obj2, Object obj3) {
        super(2);
        this.i = i3;
        this.m = obj;
        this.j = xtcVar;
        this.n = obj2;
        this.o = obj3;
        this.p = dt8Var;
        this.k = i;
        this.l = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.i;
        Object obj3 = this.m;
        int i2 = this.k;
        dt8 dt8Var = this.p;
        Object obj4 = this.o;
        Object obj5 = this.n;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                int K = aba.K(i2 | 1);
                int i3 = this.l;
                xtc xtcVar = this.j;
                td4.b((Function1) obj3, xtcVar, (Function1) obj5, (Function1) obj4, (Function1) dt8Var, (of3) obj, K, i3);
                break;
            case 1:
                ((Number) obj2).intValue();
                int K2 = aba.K(i2 | 1);
                int i4 = this.l;
                Object obj6 = this.m;
                xtc xtcVar2 = this.j;
                wnn.d(obj6, xtcVar2, (j38) obj5, (String) obj4, (tc3) dt8Var, (of3) obj, K2, i4);
                break;
            default:
                ((Number) obj2).intValue();
                int K3 = aba.K(i2 | 1);
                int i5 = this.l;
                xtc xtcVar3 = this.j;
                wnn.b((axj) obj5, xtcVar3, (j38) obj4, (Function1) obj3, (tc3) dt8Var, (of3) obj, K3, i5);
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g50(axj axjVar, xtc xtcVar, j38 j38Var, Function1 function1, tc3 tc3Var, int i, int i2) {
        super(2);
        this.i = 2;
        this.n = axjVar;
        this.j = xtcVar;
        this.o = j38Var;
        this.m = function1;
        this.p = tc3Var;
        this.k = i;
        this.l = i2;
    }
}
