package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class wr1 implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zr1 b;

    public /* synthetic */ wr1(zr1 zr1Var, int i) {
        this.a = i;
        this.b = zr1Var;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        zr1 zr1Var = this.b;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((m12) obj).getClass();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
                    String str = zr1Var.l;
                    bx7 bx7Var = zr1Var.k;
                    l98.r(str, bx7Var.c, bx7Var.b, bx7Var.d, av8Var, 0);
                } else {
                    av8Var.W();
                }
                break;
            case 1:
                of3 of3Var2 = (of3) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((v23) obj).getClass();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                    Double d = zr1Var.q;
                    bx7 bx7Var2 = zr1Var.k;
                    ux7 ux7Var = zr1Var.m;
                    int i2 = ux7Var.a;
                    String str2 = ux7Var.b;
                    String str3 = str2 == null ? "" : str2;
                    fy7 fy7Var = zr1Var.n;
                    int i3 = fy7Var.a;
                    String str4 = fy7Var.b;
                    String str5 = str4 == null ? "" : str4;
                    fy7 fy7Var2 = bx7Var2.g;
                    Integer valueOf = fy7Var2 != null ? Integer.valueOf(fy7Var2.a) : null;
                    fy7 fy7Var3 = bx7Var2.h;
                    Integer valueOf2 = fy7Var3 != null ? Integer.valueOf(fy7Var3.a) : null;
                    Integer num = bx7Var2.m;
                    Integer num2 = bx7Var2.n;
                    Integer num3 = bx7Var2.q;
                    l98.p(i2, str3, Integer.valueOf(i3), valueOf, valueOf2, num, num2, num3 != null ? num3.intValue() : 0, str5, d, false, av8Var2, 0, 0, 1024);
                } else {
                    av8Var2.W();
                }
                break;
            default:
                of3 of3Var3 = (of3) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((m12) obj).getClass();
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(intValue3 & 1, (intValue3 & 17) != 16)) {
                    boolean i4 = av8Var3.i(zr1Var);
                    Object O = av8Var3.O();
                    if (i4 || O == nf3.a) {
                        O = new u2(zr1Var, 23);
                        av8Var3.n0(O);
                    }
                    td4.a((Function1) O, null, null, av8Var3, 0, 6);
                } else {
                    av8Var3.W();
                }
                break;
        }
        return Unit.a;
    }
}
