package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class yzh implements et8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ e1d e;

    public /* synthetic */ yzh(List list, boolean z, Function1 function1, e1d e1dVar, int i) {
        this.a = i;
        this.b = list;
        this.c = z;
        this.d = function1;
        this.e = e1dVar;
    }

    @Override // defpackage.et8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3 = this.a;
        Object obj5 = nf3.a;
        utc utcVar = utc.a;
        e1d e1dVar = this.e;
        List list = this.b;
        Function1 function1 = this.d;
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
                    hzh hzhVar = (hzh) list.get(intValue);
                    av8Var.d0(-194031112);
                    Integer num = (Integer) e1dVar.getValue();
                    boolean z = num != null && num.intValue() == intValue;
                    xtc a = xpa.a(xpaVar, bkh.e(utcVar, 48.0f), 7);
                    boolean g = av8Var.g(function1) | av8Var.g(hzhVar);
                    Object O = av8Var.O();
                    if (g || O == obj5) {
                        O = new xzh(function1, hzhVar, 0);
                        av8Var.n0(O);
                    }
                    hz8.u(hzhVar, this.c, z, a, (Function0) O, av8Var, 0, 0);
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
                    hzh hzhVar2 = (hzh) list.get(intValue3);
                    av8Var2.d0(557826649);
                    int i4 = intValue3 + 4;
                    Integer num2 = (Integer) e1dVar.getValue();
                    boolean z2 = num2 != null && num2.intValue() == i4;
                    xtc a2 = xpa.a(xpaVar2, bkh.e(utcVar, 48.0f), 7);
                    boolean g2 = av8Var2.g(function1) | av8Var2.g(hzhVar2);
                    Object O2 = av8Var2.O();
                    if (g2 || O2 == obj5) {
                        O2 = new xzh(function1, hzhVar2, 1);
                        av8Var2.n0(O2);
                    }
                    hz8.u(hzhVar2, this.c, z2, a2, (Function0) O2, av8Var2, 0, 0);
                    av8Var2.s(false);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
