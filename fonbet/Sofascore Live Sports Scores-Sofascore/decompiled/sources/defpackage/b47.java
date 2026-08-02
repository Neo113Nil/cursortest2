package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class b47 implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j67 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ b47(j67 j67Var, Function1 function1, int i) {
        this.a = i;
        this.b = j67Var;
        this.c = function1;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        a99 a99Var = nf3.a;
        Function1 function1 = this.c;
        j67 j67Var = this.b;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
                    int i2 = j67Var.f;
                    boolean g = av8Var.g(function1);
                    Object O = av8Var.O();
                    if (g || O == a99Var) {
                        O = new rt6(13, function1);
                        av8Var.n0(O);
                    }
                    t62.j(i2, (Function0) O, null, null, av8Var, 0, 12);
                } else {
                    av8Var.W();
                }
                break;
            case 1:
                of3 of3Var2 = (of3) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                    String str = j67Var.b;
                    String str2 = j67Var.c;
                    boolean g2 = av8Var2.g(function1);
                    Object O2 = av8Var2.O();
                    if (g2 || O2 == a99Var) {
                        O2 = new k46(12, function1);
                        av8Var2.n0(O2);
                    }
                    un0.l(str, str2, (Function1) O2, null, av8Var2, 0);
                } else {
                    av8Var2.W();
                }
                break;
            default:
                of3 of3Var3 = (of3) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(intValue3 & 1, (intValue3 & 17) != 16)) {
                    int i3 = j67Var.f;
                    boolean g3 = av8Var3.g(function1);
                    Object O3 = av8Var3.O();
                    if (g3 || O3 == a99Var) {
                        O3 = new rt6(18, function1);
                        av8Var3.n0(O3);
                    }
                    Function0 function0 = (Function0) O3;
                    boolean g4 = av8Var3.g(function1);
                    Object O4 = av8Var3.O();
                    if (g4 || O4 == a99Var) {
                        O4 = new rt6(19, function1);
                        av8Var3.n0(O4);
                    }
                    t62.j(i3, function0, null, (Function0) O4, av8Var3, 0, 4);
                } else {
                    av8Var3.W();
                }
                break;
        }
        return Unit.a;
    }
}
