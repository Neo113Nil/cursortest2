package defpackage;

import com.unity3d.services.UnityAdsConstants;
import java.util.Set;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class fj4 implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ fj4(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        String str = this.b;
        switch (i) {
            case 0:
                xkj xkjVar = (xkj) obj;
                of3 of3Var = (of3) obj2;
                int intValue = ((Number) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= (intValue & 8) == 0 ? ((av8) of3Var).g(xkjVar) : ((av8) of3Var).i(xkjVar) ? 4 : 2;
                }
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 19) != 18)) {
                    vkj.a(xkjVar, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0L, 0L, yqo.H(1905952188, av8Var, new tg4(str, 1)), av8Var, (intValue & 14) | 805306368);
                } else {
                    av8Var.W();
                }
                break;
            case 1:
                xkj xkjVar2 = (xkj) obj;
                of3 of3Var2 = (of3) obj2;
                int intValue2 = ((Number) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= (intValue2 & 8) == 0 ? ((av8) of3Var2).g(xkjVar2) : ((av8) of3Var2).i(xkjVar2) ? 4 : 2;
                }
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 19) != 18)) {
                    vkj.a(xkjVar2, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0L, 0L, yqo.H(-999924215, av8Var2, new tg4(str, 2)), av8Var2, (intValue2 & 14) | 805306368);
                } else {
                    av8Var2.W();
                }
                break;
            case 2:
                long j = ((r13) obj).a;
                of3 of3Var3 = (of3) obj2;
                int intValue3 = ((Number) obj3).intValue();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((av8) of3Var3).f(j) ? 4 : 2;
                }
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(intValue3 & 1, (intValue3 & 19) != 18)) {
                    Set set = wyh.a;
                    qha.i(wyh.a(str), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, j, av8Var3, (intValue3 << 6) & 896, 2);
                } else {
                    av8Var3.W();
                }
                break;
            default:
                long j2 = ((r13) obj).a;
                of3 of3Var4 = (of3) obj2;
                int intValue4 = ((Number) obj3).intValue();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= ((av8) of3Var4).f(j2) ? 4 : 2;
                }
                av8 av8Var4 = (av8) of3Var4;
                if (av8Var4.T(intValue4 & 1, (intValue4 & 19) != 18)) {
                    Set set2 = wyh.a;
                    qha.i(wyh.a(str), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, j2, av8Var4, (intValue4 << 6) & 896, 2);
                } else {
                    av8Var4.W();
                }
                break;
        }
        return Unit.a;
    }
}
