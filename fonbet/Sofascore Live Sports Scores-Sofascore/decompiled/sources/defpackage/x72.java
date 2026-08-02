package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class x72 implements Function2 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ xtc b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ x72(gv9 gv9Var, Function2 function2, xtc xtcVar, boolean z, Integer num, String str, Function0 function0, int i, int i2) {
        this.g = gv9Var;
        this.h = function2;
        this.b = xtcVar;
        this.c = z;
        this.i = num;
        this.j = str;
        this.f = function0;
        this.d = i;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.d;
        Object obj3 = this.f;
        Object obj4 = this.j;
        Object obj5 = this.i;
        Object obj6 = this.h;
        Object obj7 = this.g;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int K = aba.K(i2 | 1);
                iz8.o((Function0) obj3, this.b, this.c, (uah) obj7, (p72) obj6, (p3e) obj5, (tc3) obj4, (of3) obj, K, this.e);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int K2 = aba.K(i2 | 1);
                q5a.c((sxa) obj3, (Function1) obj7, this.b, (lrh) obj6, this.c, (String) obj5, (String) obj4, (of3) obj, K2, this.e);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int K3 = aba.K(i2 | 1);
                jca.m((gv9) obj7, (Function2) obj6, this.b, this.c, (Integer) obj5, (String) obj4, (Function0) obj3, (of3) obj, K3, this.e);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int K4 = aba.K(i2 | 1);
                nld.f((old) obj3, (vmd) obj7, (String) obj6, (String) obj5, (Integer) obj4, this.b, this.c, (of3) obj, K4, this.e);
                break;
            default:
                ((Integer) obj2).getClass();
                int K5 = aba.K(i2 | 1);
                oml.a((n5c) obj7, this.b, (String) obj6, (ia9) obj5, this.c, (Function1) obj4, (Function0) obj3, (of3) obj, K5, this.e);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ x72(sxa sxaVar, Function1 function1, xtc xtcVar, lrh lrhVar, boolean z, String str, String str2, int i, int i2) {
        this.f = sxaVar;
        this.g = function1;
        this.b = xtcVar;
        this.h = lrhVar;
        this.c = z;
        this.i = str;
        this.j = str2;
        this.d = i;
        this.e = i2;
    }

    public /* synthetic */ x72(n5c n5cVar, xtc xtcVar, String str, ia9 ia9Var, boolean z, Function1 function1, Function0 function0, int i, int i2) {
        this.g = n5cVar;
        this.b = xtcVar;
        this.h = str;
        this.i = ia9Var;
        this.c = z;
        this.j = function1;
        this.f = function0;
        this.d = i;
        this.e = i2;
    }

    public /* synthetic */ x72(old oldVar, vmd vmdVar, String str, String str2, Integer num, xtc xtcVar, boolean z, int i, int i2) {
        this.f = oldVar;
        this.g = vmdVar;
        this.h = str;
        this.i = str2;
        this.j = num;
        this.b = xtcVar;
        this.c = z;
        this.d = i;
        this.e = i2;
    }

    public /* synthetic */ x72(Function0 function0, xtc xtcVar, boolean z, uah uahVar, p72 p72Var, p3e p3eVar, tc3 tc3Var, int i, int i2) {
        this.f = function0;
        this.b = xtcVar;
        this.c = z;
        this.g = uahVar;
        this.h = p72Var;
        this.i = p3eVar;
        this.j = tc3Var;
        this.d = i;
        this.e = i2;
    }
}
