package defpackage;

import com.sofascore.results.sofaSeason.SofaSeasonActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class msh implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SofaSeasonActivity b;

    public /* synthetic */ msh(SofaSeasonActivity sofaSeasonActivity, int i) {
        this.a = i;
        this.b = sofaSeasonActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        SofaSeasonActivity sofaSeasonActivity = this.b;
        Object obj3 = nf3.a;
        int i2 = 2;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                int i3 = SofaSeasonActivity.L;
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    Unit unit = Unit.a;
                    boolean i4 = av8Var.i(sofaSeasonActivity);
                    Object O = av8Var.O();
                    if (i4 || O == obj3) {
                        O = new w9g(sofaSeasonActivity, null, 13);
                        av8Var.n0(O);
                    }
                    hz8.o(av8Var, unit, (Function2) O);
                    uni.a(bkh.c, null, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, yqo.H(1541220761, av8Var, new msh(sofaSeasonActivity, i2)), av8Var, 12582918, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                } else {
                    av8Var.W();
                }
                break;
            case 1:
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int i5 = SofaSeasonActivity.L;
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    i2a.g(yqo.H(-722231340, av8Var2, new msh(sofaSeasonActivity, r5 ? 1 : 0)), av8Var2, 6);
                } else {
                    av8Var2.W();
                }
                break;
            default:
                of3 of3Var3 = (of3) obj;
                int intValue3 = ((Integer) obj2).intValue();
                int i6 = SofaSeasonActivity.L;
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(intValue3 & 1, (intValue3 & 3) != 2)) {
                    SofaSeasonActivity sofaSeasonActivity2 = this.b;
                    kth kthVar = (kth) sofaSeasonActivity2.K.getValue();
                    boolean i7 = av8Var3.i(sofaSeasonActivity2);
                    Object O2 = av8Var3.O();
                    Object obj4 = O2;
                    if (i7 || O2 == obj3) {
                        Object e6gVar = new e6g(sofaSeasonActivity2, 25);
                        av8Var3.n0(e6gVar);
                        obj4 = e6gVar;
                    }
                    Function0 function0 = (Function0) obj4;
                    boolean i8 = av8Var3.i(sofaSeasonActivity2);
                    Object O3 = av8Var3.O();
                    Object obj5 = O3;
                    if (i8 || O3 == obj3) {
                        Object qfgVar = new qfg(sofaSeasonActivity2, 23);
                        av8Var3.n0(qfgVar);
                        obj5 = qfgVar;
                    }
                    sofaSeasonActivity2.Q(kthVar, function0, (Function1) obj5, av8Var3, 0);
                } else {
                    av8Var3.W();
                }
                break;
        }
        return Unit.a;
    }
}
