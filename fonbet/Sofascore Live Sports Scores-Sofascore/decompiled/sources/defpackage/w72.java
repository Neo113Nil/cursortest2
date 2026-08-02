package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class w72 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ xtc b;
    public final /* synthetic */ p3e c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ dt8 m;

    public /* synthetic */ w72(l39 l39Var, xtc xtcVar, qpa qpaVar, p3e p3eVar, pg0 pg0Var, lg0 lg0Var, p78 p78Var, boolean z, myd mydVar, Function1 function1, int i, int i2) {
        this.g = l39Var;
        this.b = xtcVar;
        this.h = qpaVar;
        this.c = p3eVar;
        this.i = pg0Var;
        this.j = lg0Var;
        this.k = p78Var;
        this.d = z;
        this.l = mydVar;
        this.m = function1;
        this.e = i;
        this.f = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.e;
        dt8 dt8Var = this.m;
        Object obj3 = this.l;
        Object obj4 = this.k;
        Object obj5 = this.j;
        Object obj6 = this.i;
        Object obj7 = this.h;
        Object obj8 = this.g;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int K = aba.K(i2 | 1);
                iz8.e((Function0) obj8, this.b, this.d, (uah) obj7, (p72) obj6, (v72) obj5, (qz1) obj4, this.c, (wzc) obj3, (tc3) dt8Var, (of3) obj, K, this.f);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int K2 = aba.K(i2 | 1);
                haa.d((l39) obj8, this.b, (qpa) obj7, this.c, (pg0) obj6, (lg0) obj5, (p78) obj4, this.d, (myd) obj3, (Function1) dt8Var, (of3) obj, K2, this.f);
                break;
            default:
                ((Integer) obj2).getClass();
                int K3 = aba.K(i2 | 1);
                int K4 = aba.K(this.f);
                jaa.b(this.b, (qpa) obj8, (s39) obj7, this.c, (p78) obj6, this.d, (myd) obj5, (pg0) obj4, (lg0) obj3, (Function1) dt8Var, (of3) obj, K3, K4);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ w72(xtc xtcVar, qpa qpaVar, s39 s39Var, p3e p3eVar, p78 p78Var, boolean z, myd mydVar, pg0 pg0Var, lg0 lg0Var, Function1 function1, int i, int i2) {
        this.b = xtcVar;
        this.g = qpaVar;
        this.h = s39Var;
        this.c = p3eVar;
        this.i = p78Var;
        this.d = z;
        this.j = mydVar;
        this.k = pg0Var;
        this.l = lg0Var;
        this.m = function1;
        this.e = i;
        this.f = i2;
    }

    public /* synthetic */ w72(Function0 function0, xtc xtcVar, boolean z, uah uahVar, p72 p72Var, v72 v72Var, qz1 qz1Var, p3e p3eVar, wzc wzcVar, tc3 tc3Var, int i, int i2) {
        this.g = function0;
        this.b = xtcVar;
        this.d = z;
        this.h = uahVar;
        this.i = p72Var;
        this.j = v72Var;
        this.k = qz1Var;
        this.c = p3eVar;
        this.l = wzcVar;
        this.m = tc3Var;
        this.e = i;
        this.f = i2;
    }
}
