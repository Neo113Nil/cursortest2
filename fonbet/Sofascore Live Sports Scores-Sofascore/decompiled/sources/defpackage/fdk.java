package defpackage;

import com.sofascore.results.weeklyChallenge.WeeklyChallengeViewModel;
import com.sofascore.results.weeklyChallenge.leaderboard.UpcomingMatchesModal;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class fdk implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ UpcomingMatchesModal b;

    public /* synthetic */ fdk(UpcomingMatchesModal upcomingMatchesModal, int i) {
        this.a = i;
        this.b = upcomingMatchesModal;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        UpcomingMatchesModal upcomingMatchesModal = this.b;
        int i2 = 2;
        int i3 = 1;
        of3 of3Var = (of3) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    haa.f(yqo.H(-1986877374, av8Var, new fdk(upcomingMatchesModal, i3)), av8Var, 6);
                } else {
                    av8Var.W();
                }
                break;
            case 1:
                av8 av8Var2 = (av8) of3Var;
                if (av8Var2.T(intValue & 1, (intValue & 3) != 2)) {
                    tol.b(khb.a.a(upcomingMatchesModal), yqo.H(2125167874, av8Var2, new fdk(upcomingMatchesModal, i2)), av8Var2, 56);
                } else {
                    av8Var2.W();
                }
                break;
            default:
                av8 av8Var3 = (av8) of3Var;
                if (av8Var3.T(intValue & 1, (intValue & 3) != 2)) {
                    uaa.i((WeeklyChallengeViewModel) upcomingMatchesModal.w.getValue(), av8Var3, 0);
                } else {
                    av8Var3.W();
                }
                break;
        }
        return Unit.a;
    }
}
