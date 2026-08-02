package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class w51 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ xtc b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ w51(gv9 gv9Var, int i, int i2, kch kchVar, Function1 function1, Function1 function12, Function1 function13, tc3 tc3Var, xtc xtcVar, int i3) {
        this.e = gv9Var;
        this.c = i;
        this.d = i2;
        this.f = kchVar;
        this.g = function1;
        this.h = function12;
        this.i = function13;
        this.j = tc3Var;
        this.b = xtcVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.j;
        Object obj4 = this.i;
        Object obj5 = this.h;
        Object obj6 = this.g;
        Object obj7 = this.f;
        Object obj8 = this.e;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int K = aba.K(12582913);
                fkf.p((gv9) obj8, this.c, this.d, (kch) obj7, (Function1) obj6, (Function1) obj5, (Function1) obj4, (tc3) obj3, this.b, (of3) obj, K);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int K2 = aba.K(this.d | 1);
                iz8.k(this.b, this.c, (String) obj8, (Integer) obj7, (Integer) obj6, (Integer) obj5, (Integer) obj4, (Integer) obj3, (of3) obj, K2);
                break;
            default:
                ((Integer) obj2).getClass();
                int K3 = aba.K(this.c | 1);
                vha.a((String) obj8, this.b, (Function2) obj7, (String) obj6, (Integer) obj5, (p3e) obj4, (Function0) obj3, (of3) obj, K3, this.d);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ w51(xtc xtcVar, int i, String str, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, int i2) {
        this.b = xtcVar;
        this.c = i;
        this.e = str;
        this.f = num;
        this.g = num2;
        this.h = num3;
        this.i = num4;
        this.j = num5;
        this.d = i2;
    }

    public /* synthetic */ w51(String str, xtc xtcVar, Function2 function2, String str2, Integer num, p3e p3eVar, Function0 function0, int i, int i2) {
        this.e = str;
        this.b = xtcVar;
        this.f = function2;
        this.g = str2;
        this.h = num;
        this.i = p3eVar;
        this.j = function0;
        this.c = i;
        this.d = i2;
    }
}
