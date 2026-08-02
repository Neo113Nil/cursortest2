package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class vu6 implements et8 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ List b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ wu6 d;

    public vu6(List list, wu6 wu6Var, Function1 function1) {
        this.b = list;
        this.d = wu6Var;
        this.c = function1;
    }

    @Override // defpackage.et8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3 = this.a;
        wu6 wu6Var = this.d;
        List list = this.b;
        switch (i3) {
            case 0:
                xpa xpaVar = (xpa) obj;
                int intValue = ((Number) obj2).intValue();
                of3 of3Var = (of3) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    i = intValue2 | (((av8) of3Var).g(xpaVar) ? 4 : 2);
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i |= ((av8) of3Var).e(intValue) ? 32 : 16;
                }
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(i & 1, (i & 147) != 146)) {
                    do7 do7Var = (do7) list.get(intValue);
                    av8Var.d0(2138447968);
                    int i4 = do7Var.c.c;
                    int i5 = wu6Var.a;
                    n4o.i(do7Var, this.c, null, i4 == i5, i4 != i5, av8Var, 0);
                    av8Var.s(false);
                } else {
                    av8Var.W();
                }
                break;
            default:
                xpa xpaVar2 = (xpa) obj;
                int intValue3 = ((Number) obj2).intValue();
                of3 of3Var2 = (of3) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    i2 = intValue4 | (((av8) of3Var2).g(xpaVar2) ? 4 : 2);
                } else {
                    i2 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    i2 |= ((av8) of3Var2).e(intValue3) ? 32 : 16;
                }
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(i2 & 1, (i2 & 147) != 146)) {
                    ev6 ev6Var = (ev6) list.get(intValue3);
                    av8Var2.d0(273776046);
                    un0.j(ev6Var, this.c, null, ev6Var.c != wu6Var.a, av8Var2, 0);
                    av8Var2.s(false);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }

    public vu6(List list, Function1 function1, wu6 wu6Var) {
        this.b = list;
        this.c = function1;
        this.d = wu6Var;
    }
}
