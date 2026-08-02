package defpackage;

import com.sofascore.model.profile.ContributionStatus;
import java.util.List;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class yo implements et8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ yo(List list, int i) {
        this.a = i;
        this.b = list;
    }

    @Override // defpackage.et8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = this.a;
        List list = this.b;
        switch (i6) {
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
                    p4b p4bVar = (p4b) list.get(intValue);
                    av8Var.d0(-1985536174);
                    if (p4bVar.b) {
                        av8Var.d0(-1985520830);
                        o6a.a(p4bVar, av8Var, 0);
                        av8Var.s(false);
                    } else {
                        av8Var.d0(-1985461217);
                        o6a.d(null, p4bVar, av8Var, 0, 1);
                        av8Var.s(false);
                    }
                    av8Var.s(false);
                } else {
                    av8Var.W();
                }
                break;
            case 1:
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
                    ContributionStatus contributionStatus = (ContributionStatus) list.get(intValue3);
                    av8Var2.d0(-1626623258);
                    o02.h(contributionStatus, xpa.a(xpaVar2, utc.a, 7), av8Var2, 0);
                    av8Var2.s(false);
                } else {
                    av8Var2.W();
                }
                break;
            case 2:
                xpa xpaVar3 = (xpa) obj;
                int intValue5 = ((Number) obj2).intValue();
                of3 of3Var3 = (of3) obj3;
                int intValue6 = ((Number) obj4).intValue();
                if ((intValue6 & 6) == 0) {
                    i3 = intValue6 | (((av8) of3Var3).g(xpaVar3) ? 4 : 2);
                } else {
                    i3 = intValue6;
                }
                if ((intValue6 & 48) == 0) {
                    i3 |= ((av8) of3Var3).e(intValue5) ? 32 : 16;
                }
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(i3 & 1, (i3 & 147) != 146)) {
                    a3a a3aVar = (a3a) list.get(intValue5);
                    av8Var3.d0(2063855870);
                    qea.a(a3aVar, av8Var3, 0);
                    av8Var3.s(false);
                } else {
                    av8Var3.W();
                }
                break;
            case 3:
                xpa xpaVar4 = (xpa) obj;
                int intValue7 = ((Number) obj2).intValue();
                of3 of3Var4 = (of3) obj3;
                int intValue8 = ((Number) obj4).intValue();
                if ((intValue8 & 6) == 0) {
                    i4 = intValue8 | (((av8) of3Var4).g(xpaVar4) ? 4 : 2);
                } else {
                    i4 = intValue8;
                }
                if ((intValue8 & 48) == 0) {
                    i4 |= ((av8) of3Var4).e(intValue7) ? 32 : 16;
                }
                av8 av8Var4 = (av8) of3Var4;
                if (av8Var4.T(i4 & 1, (i4 & 147) != 146)) {
                    jrj jrjVar = (jrj) list.get(intValue7);
                    av8Var4.d0(606113379);
                    w3a.i(intValue7 + 1, jrjVar, null, av8Var4, 0);
                    av8Var4.s(false);
                } else {
                    av8Var4.W();
                }
                break;
            default:
                xpa xpaVar5 = (xpa) obj;
                int intValue9 = ((Number) obj2).intValue();
                of3 of3Var5 = (of3) obj3;
                int intValue10 = ((Number) obj4).intValue();
                if ((intValue10 & 6) == 0) {
                    i5 = intValue10 | (((av8) of3Var5).g(xpaVar5) ? 4 : 2);
                } else {
                    i5 = intValue10;
                }
                if ((intValue10 & 48) == 0) {
                    i5 |= ((av8) of3Var5).e(intValue9) ? 32 : 16;
                }
                av8 av8Var5 = (av8) of3Var5;
                if (av8Var5.T(i5 & 1, (i5 & 147) != 146)) {
                    mi5 mi5Var = (mi5) list.get(intValue9);
                    av8Var5.d0(84804690);
                    uaa.c(intValue9 + 1, mi5Var, null, av8Var5, 0);
                    av8Var5.s(false);
                } else {
                    av8Var5.W();
                }
                break;
        }
        return Unit.a;
    }
}
