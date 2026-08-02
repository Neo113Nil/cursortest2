package defpackage;

import java.util.ArrayList;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ge7 implements et8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ wn1 c;

    public /* synthetic */ ge7(ArrayList arrayList, wn1 wn1Var, int i) {
        this.a = i;
        this.b = arrayList;
        this.c = wn1Var;
    }

    @Override // defpackage.et8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3 = this.a;
        utc utcVar = utc.a;
        wn1 wn1Var = this.c;
        ArrayList arrayList = this.b;
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
                    ae7 ae7Var = (ae7) arrayList.get(intValue);
                    av8Var.d0(-902435242);
                    o1j.j(ae7Var, wn1Var.c(), xpa.a(xpaVar, utcVar, 3), av8Var, 0);
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
                    ae7 ae7Var2 = (ae7) arrayList.get(intValue3);
                    av8Var2.d0(-86247071);
                    o1j.j(ae7Var2, wn1Var.c(), xpa.a(xpaVar2, utcVar, 3), av8Var2, 0);
                    av8Var2.s(false);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
