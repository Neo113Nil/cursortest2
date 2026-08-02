package defpackage;

import com.sofascore.results.weeklyChallenge.ui.components.bottomSheet.WeeklyChallengeNotificationsBottomSheet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class r2l implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ WeeklyChallengeNotificationsBottomSheet b;

    public /* synthetic */ r2l(WeeklyChallengeNotificationsBottomSheet weeklyChallengeNotificationsBottomSheet, int i) {
        this.a = i;
        this.b = weeklyChallengeNotificationsBottomSheet;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        WeeklyChallengeNotificationsBottomSheet weeklyChallengeNotificationsBottomSheet = this.b;
        int i2 = 1;
        of3 of3Var = (of3) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    haa.f(yqo.H(-1758357435, av8Var, new r2l(weeklyChallengeNotificationsBottomSheet, i2)), av8Var, 6);
                } else {
                    av8Var.W();
                }
                break;
            default:
                av8 av8Var2 = (av8) of3Var;
                if (av8Var2.T(intValue & 1, (intValue & 3) != 2)) {
                    boolean i3 = av8Var2.i(weeklyChallengeNotificationsBottomSheet);
                    Object O = av8Var2.O();
                    if (i3 || O == nf3.a) {
                        O = new ndk(weeklyChallengeNotificationsBottomSheet, 5);
                        av8Var2.n0(O);
                    }
                    r4a.o(0, av8Var2, null, (Function0) O);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
