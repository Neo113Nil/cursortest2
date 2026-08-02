package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class gs3 implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vnb b;

    public /* synthetic */ gs3(vnb vnbVar, int i) {
        this.a = i;
        this.b = vnbVar;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        vnb vnbVar = this.b;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
                    j72.d(((is3) ((unb) vnbVar).a).d, null, av8Var, 0);
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
                    is3 is3Var = (is3) ((unb) vnbVar).a;
                    xw3.c(is3Var.a, is3Var.b, l98.d0(utc.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1), av8Var2, 384, 0);
                } else {
                    av8Var2.W();
                }
                break;
            case 2:
                of3 of3Var3 = (of3) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(intValue3 & 1, (intValue3 & 17) != 16)) {
                    i4j i4jVar = (i4j) ((unb) vnbVar).a;
                    d4j d4jVar = i4jVar.e;
                    fz8.b(x23.a, (d4jVar == d4j.NoTrophies || (d4jVar == d4j.NoMajorTrophies && i4jVar.d)) ? false : true, null, null, null, null, yqo.H(745244369, av8Var3, new gs3(vnbVar, r2)), av8Var3, 1572864, 30);
                } else {
                    av8Var3.W();
                }
                break;
            case 3:
                xpa xpaVar = (xpa) obj;
                of3 of3Var4 = (of3) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                xpaVar.getClass();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= ((av8) of3Var4).g(xpaVar) ? 4 : 2;
                }
                av8 av8Var4 = (av8) of3Var4;
                if (av8Var4.T(intValue4 & 1, (intValue4 & 19) != 18)) {
                    fz8.b(x23.a, ((i4j) ((unb) vnbVar).a).e != null, null, null, null, null, yqo.H(-1683477638, av8Var4, new e6i(5, vnbVar, xpaVar)), av8Var4, 1572864, 30);
                } else {
                    av8Var4.W();
                }
                break;
            default:
                ((Integer) obj3).getClass();
                ((r70) obj).getClass();
                y6a.l((i4j) ((unb) vnbVar).a, l98.f0(utc.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 7), (of3) obj2, 48);
                break;
        }
        return Unit.a;
    }
}
