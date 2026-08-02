package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class z1e implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ osa b;

    public /* synthetic */ z1e(osa osaVar, int i) {
        this.a = i;
        this.b = osaVar;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        osa osaVar = this.b;
        int i2 = 1;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((m12) obj).getClass();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
                    wnn.d(Boolean.valueOf(osaVar.c() != 0), null, null, null, yqo.H(-1633134694, av8Var, new z1e(osaVar, i2)), av8Var, 24576, 14);
                } else {
                    av8Var.W();
                }
                break;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                of3 of3Var2 = (of3) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((av8) of3Var2).h(booleanValue) ? 4 : 2;
                }
                av8 av8Var2 = (av8) of3Var2;
                if (!av8Var2.T(intValue2 & 1, (intValue2 & 19) != 18)) {
                    av8Var2.W();
                } else if (booleanValue) {
                    av8Var2.d0(673915967);
                    td4.B(osaVar, av8Var2, 8);
                    av8Var2.s(false);
                } else {
                    av8Var2.d0(674056025);
                    gz8.j(null, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, av8Var2, 0, 31);
                    av8Var2.s(false);
                }
                break;
        }
        return Unit.a;
    }
}
