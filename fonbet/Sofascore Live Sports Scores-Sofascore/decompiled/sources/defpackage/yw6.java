package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class yw6 implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tc3 b;
    public final /* synthetic */ int c;

    public /* synthetic */ yw6(int i, int i2, tc3 tc3Var) {
        this.a = i2;
        this.b = tc3Var;
        this.c = i;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        int i2 = this.c;
        tc3 tc3Var = this.b;
        switch (i) {
            case 0:
                ((Integer) obj3).getClass();
                ((r70) obj).getClass();
                tc3Var.invoke(x23.a, (of3) obj2, Integer.valueOf(i2 & 8));
                break;
            default:
                xpa xpaVar = (xpa) obj;
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= ((av8) of3Var).g(xpaVar) ? 4 : 2;
                }
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 19) != 18)) {
                    tc3Var.invoke(xpaVar, Integer.valueOf(i2), av8Var, Integer.valueOf(intValue & 14));
                } else {
                    av8Var.W();
                }
                break;
        }
        return Unit.a;
    }
}
