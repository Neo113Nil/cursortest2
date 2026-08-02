package defpackage;

import androidx.compose.runtime.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class xt6 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ xt6(hu6 hu6Var, boolean z, boolean z2, Function1 function1) {
        this.a = 0;
        this.d = hu6Var;
        this.b = z;
        this.c = z2;
        this.e = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        a99 a99Var = nf3.a;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                hu6 hu6Var = (hu6) obj4;
                Function1 function1 = (Function1) obj3;
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    vl7 vl7Var = hu6Var.x.a;
                    if (vl7Var == null) {
                        av8Var.d0(400411811);
                        av8Var.s(false);
                    } else {
                        av8Var.d0(400411812);
                        boolean z = this.b;
                        boolean z2 = !z && this.c && vl7Var.b.equals(yl7.a);
                        Object O = av8Var.O();
                        if (O == a99Var) {
                            O = e.f(Boolean.valueOf(z2));
                            av8Var.n0(O);
                        }
                        e1d e1dVar = (e1d) O;
                        Boolean valueOf = Boolean.valueOf(z);
                        boolean h = av8Var.h(z2) | av8Var.h(z);
                        Object O2 = av8Var.O();
                        if (h || O2 == a99Var) {
                            O2 = new cu6(z2, z, e1dVar, null);
                            av8Var.n0(O2);
                        }
                        hz8.o(av8Var, valueOf, (Function2) O2);
                        boolean booleanValue = ((Boolean) e1dVar.getValue()).booleanValue();
                        boolean z3 = hu6Var.x.b;
                        boolean g = av8Var.g(function1);
                        Object O3 = av8Var.O();
                        if (g || O3 == a99Var) {
                            O3 = new rt6(5, function1);
                            av8Var.n0(O3);
                        }
                        Function0 function0 = (Function0) O3;
                        boolean g2 = av8Var.g(function1);
                        Object O4 = av8Var.O();
                        if (g2 || O4 == a99Var) {
                            O4 = new o34(4, function1);
                            av8Var.n0(O4);
                        }
                        iz8.j(vl7Var, function0, (Function2) O4, booleanValue, z3, av8Var, 0, 0);
                        av8Var.s(false);
                    }
                } else {
                    av8Var.W();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                rd0.i((h73) obj4, this.b, this.c, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 2:
                n77 n77Var = (n77) obj4;
                Function1 function12 = (Function1) obj3;
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    String str = n77Var.a.b;
                    boolean z4 = n77Var.h;
                    boolean z5 = n77Var.g;
                    boolean g3 = av8Var2.g(function12);
                    Object O5 = av8Var2.O();
                    if (g3 || O5 == a99Var) {
                        O5 = new rt6(25, function12);
                        av8Var2.n0(O5);
                    }
                    Function0 function02 = (Function0) O5;
                    boolean g4 = av8Var2.g(function12);
                    Object O6 = av8Var2.O();
                    if (g4 || O6 == a99Var) {
                        O6 = new rt6(26, function12);
                        av8Var2.n0(O6);
                    }
                    Function0 function03 = (Function0) O6;
                    boolean g5 = av8Var2.g(function12);
                    Object O7 = av8Var2.O();
                    if (g5 || O7 == a99Var) {
                        O7 = new k46(15, function12);
                        av8Var2.n0(O7);
                    }
                    c5n.e(str, z4, this.b, z5, function02, function03, (Function1) O7, null, this.c, av8Var2, 0);
                } else {
                    av8Var2.W();
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                oea.c((String) obj4, this.b, this.c, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                o6a.i((y7l) obj4, this.b, this.c, (vy8) obj3, (of3) obj, aba.K(1));
                break;
            default:
                ((Integer) obj2).getClass();
                z1a.e((iel) obj4, this.b, this.c, (Function1) obj3, (of3) obj, aba.K(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ xt6(n77 n77Var, boolean z, Function1 function1, boolean z2) {
        this.a = 2;
        this.d = n77Var;
        this.b = z;
        this.e = function1;
        this.c = z2;
    }

    public /* synthetic */ xt6(Object obj, boolean z, boolean z2, Object obj2, int i, int i2) {
        this.a = i2;
        this.d = obj;
        this.b = z;
        this.c = z2;
        this.e = obj2;
    }
}
