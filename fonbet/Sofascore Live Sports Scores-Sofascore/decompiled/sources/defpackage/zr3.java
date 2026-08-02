package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class zr3 implements et8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gv9 b;

    public /* synthetic */ zr3(int i, gv9 gv9Var) {
        this.a = i;
        this.b = gv9Var;
    }

    @Override // defpackage.et8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.a;
        gv9 gv9Var = this.b;
        switch (i5) {
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
                    yr3 yr3Var = (yr3) gv9Var.get(intValue);
                    av8Var.d0(60544543);
                    s02.d(yr3Var, l98.d0(bkh.e(utc.a, 32.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), av8Var, 48);
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
                    dqf dqfVar = (dqf) gv9Var.get(intValue3);
                    av8Var2.d0(1801612556);
                    xpf.b(dqfVar, av8Var2, 0);
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
                    lxe lxeVar = (lxe) gv9Var.get(intValue5);
                    av8Var3.d0(1546349954);
                    s6a.c(lxeVar, null, av8Var3, 0);
                    av8Var3.s(false);
                } else {
                    av8Var3.W();
                }
                break;
            default:
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
                    z2e z2eVar = (z2e) gv9Var.get(intValue7);
                    av8Var4.d0(-1168791000);
                    o3a.e(z2eVar, null, av8Var4, 0, 2);
                    av8Var4.s(false);
                } else {
                    av8Var4.W();
                }
                break;
        }
        return Unit.a;
    }
}
