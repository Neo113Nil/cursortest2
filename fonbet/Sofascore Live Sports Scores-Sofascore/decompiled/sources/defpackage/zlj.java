package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class zlj implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ylj b;

    public /* synthetic */ zlj(ylj yljVar, int i) {
        this.a = i;
        this.b = yljVar;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        xtc d;
        int i = this.a;
        ylj yljVar = this.b;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((m12) obj).getClass();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
                    n4o.r(yljVar, null, av8Var, 0);
                } else {
                    av8Var.W();
                }
                break;
            case 1:
                s22 s22Var = (s22) obj;
                of3 of3Var2 = (of3) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                s22Var.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((av8) of3Var2).g(s22Var) ? 4 : 2;
                }
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 19) != 18)) {
                    boolean z = s22Var.b() / s22Var.c() < 1.3f;
                    utc utcVar = utc.a;
                    if (z) {
                        av8Var2.d0(1966591362);
                        d = bkh.c(utcVar, 1.0f);
                        av8Var2.s(false);
                    } else {
                        av8Var2.d0(-226547389);
                        d = bkh.d(utcVar, 1.0f);
                        av8Var2.s(false);
                    }
                    xtc xtcVar = d;
                    ylj yljVar2 = this.b;
                    n4o.c(yljVar2, xtcVar, yqo.H(-124038679, av8Var2, new zlj(yljVar2, 3)), av8Var2, 384, 0);
                } else {
                    av8Var2.W();
                }
                break;
            case 2:
                of3 of3Var3 = (of3) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((m12) obj).getClass();
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(intValue3 & 1, (intValue3 & 17) != 16)) {
                    n4o.r(yljVar, null, av8Var3, 0);
                } else {
                    av8Var3.W();
                }
                break;
            case 3:
                of3 of3Var4 = (of3) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((m12) obj).getClass();
                av8 av8Var4 = (av8) of3Var4;
                if (av8Var4.T(intValue4 & 1, (intValue4 & 17) != 16)) {
                    n4o.r(yljVar, null, av8Var4, 0);
                } else {
                    av8Var4.W();
                }
                break;
            default:
                of3 of3Var5 = (of3) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((m12) obj).getClass();
                av8 av8Var5 = (av8) of3Var5;
                if (av8Var5.T(intValue5 & 1, (intValue5 & 17) != 16)) {
                    n4o.r(yljVar, null, av8Var5, 0);
                } else {
                    av8Var5.W();
                }
                break;
        }
        return Unit.a;
    }
}
