package defpackage;

import androidx.compose.ui.platform.ComposeView;
import com.sofascore.results.weeklyChallenge.WeeklyChallengeViewModel;
import com.sofascore.results.weeklyChallenge.leaderboard.WeeklyLeaderboardFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class s4l implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ WeeklyLeaderboardFragment b;
    public final /* synthetic */ ComposeView c;

    public /* synthetic */ s4l(WeeklyLeaderboardFragment weeklyLeaderboardFragment, ComposeView composeView, int i) {
        this.a = i;
        this.b = weeklyLeaderboardFragment;
        this.c = composeView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        ComposeView composeView = this.c;
        WeeklyLeaderboardFragment weeklyLeaderboardFragment = this.b;
        Object[] objArr = 0;
        int i2 = 2;
        int i3 = 1;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    haa.f(yqo.H(1626576983, av8Var, new s4l(weeklyLeaderboardFragment, composeView, i3)), av8Var, 6);
                } else {
                    av8Var.W();
                }
                break;
            default:
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    sn3 C = weeklyLeaderboardFragment.C();
                    WeeklyChallengeViewModel D = weeklyLeaderboardFragment.D();
                    boolean i4 = av8Var2.i(composeView);
                    Object O = av8Var2.O();
                    a99 a99Var = nf3.a;
                    if (i4 || O == a99Var) {
                        O = new ndk(composeView, 6);
                        av8Var2.n0(O);
                    }
                    Function0 function0 = (Function0) O;
                    boolean i5 = av8Var2.i(weeklyLeaderboardFragment);
                    Object O2 = av8Var2.O();
                    if (i5 || O2 == a99Var) {
                        O2 = new q4l(weeklyLeaderboardFragment, objArr == true ? 1 : 0);
                        av8Var2.n0(O2);
                    }
                    Function0 function02 = (Function0) O2;
                    boolean i6 = av8Var2.i(weeklyLeaderboardFragment) | av8Var2.i(composeView);
                    Object O3 = av8Var2.O();
                    if (i6 || O3 == a99Var) {
                        O3 = new mwj(28, weeklyLeaderboardFragment, composeView);
                        av8Var2.n0(O3);
                    }
                    Function1 function1 = (Function1) O3;
                    boolean i7 = av8Var2.i(weeklyLeaderboardFragment);
                    Object O4 = av8Var2.O();
                    if (i7 || O4 == a99Var) {
                        O4 = new q4l(weeklyLeaderboardFragment, i3);
                        av8Var2.n0(O4);
                    }
                    Function0 function03 = (Function0) O4;
                    boolean i8 = av8Var2.i(weeklyLeaderboardFragment);
                    Object O5 = av8Var2.O();
                    if (i8 || O5 == a99Var) {
                        O5 = new q4l(weeklyLeaderboardFragment, i2);
                        av8Var2.n0(O5);
                    }
                    Function0 function04 = (Function0) O5;
                    boolean i9 = av8Var2.i(weeklyLeaderboardFragment) | av8Var2.i(composeView);
                    Object O6 = av8Var2.O();
                    if (i9 || O6 == a99Var) {
                        O6 = new r4l(weeklyLeaderboardFragment, composeView);
                        av8Var2.n0(O6);
                    }
                    Function1 function12 = (Function1) O6;
                    boolean i10 = av8Var2.i(composeView) | av8Var2.i(weeklyLeaderboardFragment);
                    Object O7 = av8Var2.O();
                    if (i10 || O7 == a99Var) {
                        O7 = new fej(19, composeView, weeklyLeaderboardFragment);
                        av8Var2.n0(O7);
                    }
                    Function0 function05 = (Function0) O7;
                    boolean i11 = av8Var2.i(weeklyLeaderboardFragment);
                    Object O8 = av8Var2.O();
                    if (i11 || O8 == a99Var) {
                        O8 = new r4l(weeklyLeaderboardFragment, 1);
                        av8Var2.n0(O8);
                    }
                    Function1 function13 = (Function1) O8;
                    boolean i12 = av8Var2.i(weeklyLeaderboardFragment);
                    Object O9 = av8Var2.O();
                    if (i12 || O9 == a99Var) {
                        O9 = new q4l(weeklyLeaderboardFragment, 3);
                        av8Var2.n0(O9);
                    }
                    ao2.k(C, D, function0, function02, function1, function03, function04, function12, function05, function13, (Function0) O9, av8Var2, 0);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
