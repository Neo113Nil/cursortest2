package defpackage;

import com.sofascore.results.referral.ReferralRedeemRewardBottomSheet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class ttf implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ ReferralRedeemRewardBottomSheet c;
    public final /* synthetic */ String d;

    public /* synthetic */ ttf(String str, ReferralRedeemRewardBottomSheet referralRedeemRewardBottomSheet, String str2, int i) {
        this.a = i;
        this.b = str;
        this.c = referralRedeemRewardBottomSheet;
        this.d = str2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        String str = this.d;
        ReferralRedeemRewardBottomSheet referralRedeemRewardBottomSheet = this.c;
        String str2 = this.b;
        int i2 = 1;
        of3 of3Var = (of3) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    haa.f(yqo.H(88195716, av8Var, new ttf(str2, referralRedeemRewardBottomSheet, str, i2)), av8Var, 6);
                } else {
                    av8Var.W();
                }
                break;
            default:
                av8 av8Var2 = (av8) of3Var;
                if (av8Var2.T(intValue & 1, (intValue & 3) != 2)) {
                    boolean c = Intrinsics.c(str2, "inviter");
                    boolean i3 = av8Var2.i(referralRedeemRewardBottomSheet) | av8Var2.g(str);
                    Object O = av8Var2.O();
                    a99 a99Var = nf3.a;
                    if (i3 || O == a99Var) {
                        O = new zbe(21, referralRedeemRewardBottomSheet, str);
                        av8Var2.n0(O);
                    }
                    Function0 function0 = (Function0) O;
                    boolean i4 = av8Var2.i(referralRedeemRewardBottomSheet);
                    Object O2 = av8Var2.O();
                    if (i4 || O2 == a99Var) {
                        O2 = new ate(referralRedeemRewardBottomSheet, 24);
                        av8Var2.n0(O2);
                    }
                    ufa.d(c, function0, (Function0) O2, null, av8Var2, 0);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
