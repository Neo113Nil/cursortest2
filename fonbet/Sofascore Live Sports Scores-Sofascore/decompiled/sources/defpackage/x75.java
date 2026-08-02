package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class x75 implements Function2 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ xtc b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ x75(int i, int i2, Integer num, gv9 gv9Var, Function1 function1, xtc xtcVar, int i3, gv9 gv9Var2, int i4) {
        this.c = i;
        this.d = i2;
        this.f = num;
        this.g = gv9Var;
        this.h = function1;
        this.b = xtcVar;
        this.e = i3;
        this.i = gv9Var2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.e;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Object obj5 = this.g;
        Object obj6 = this.f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int K = aba.K(i2 | 1);
                ww9.c((Integer) obj6, this.c, (String) obj5, this.d, (String) obj4, (String) obj3, this.b, (of3) obj, K);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int K2 = aba.K(i2 | 1);
                s02.l(this.b, (pg0) obj6, (lg0) obj5, (fo) obj4, this.c, this.d, (tc3) obj3, (of3) obj, K2);
                break;
            default:
                ((Integer) obj2).getClass();
                int K3 = aba.K(1);
                b6a.g(this.c, this.d, (Integer) obj6, (gv9) obj5, (Function1) obj4, this.b, this.e, (gv9) obj3, (of3) obj, K3);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ x75(xtc xtcVar, pg0 pg0Var, lg0 lg0Var, fo foVar, int i, int i2, tc3 tc3Var, int i3) {
        this.b = xtcVar;
        this.f = pg0Var;
        this.g = lg0Var;
        this.h = foVar;
        this.c = i;
        this.d = i2;
        this.i = tc3Var;
        this.e = i3;
    }

    public /* synthetic */ x75(Integer num, int i, String str, int i2, String str2, String str3, xtc xtcVar, int i3) {
        this.f = num;
        this.c = i;
        this.g = str;
        this.d = i2;
        this.h = str2;
        this.i = str3;
        this.b = xtcVar;
        this.e = i3;
    }
}
