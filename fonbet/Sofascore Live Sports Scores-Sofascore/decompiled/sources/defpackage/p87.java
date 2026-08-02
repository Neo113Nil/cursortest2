package defpackage;

import com.sofascore.results.fantasy.onboarding.FantasyOnboardingActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class p87 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FantasyOnboardingActivity b;

    public /* synthetic */ p87(FantasyOnboardingActivity fantasyOnboardingActivity, int i) {
        this.a = i;
        this.b = fantasyOnboardingActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        FantasyOnboardingActivity fantasyOnboardingActivity = this.b;
        int i2 = 1;
        of3 of3Var = (of3) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                int i3 = FantasyOnboardingActivity.M;
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    haa.f(yqo.H(-640182788, av8Var, new p87(fantasyOnboardingActivity, i2)), av8Var, 6);
                } else {
                    av8Var.W();
                }
                return Unit.a;
            default:
                int i4 = FantasyOnboardingActivity.M;
                av8 av8Var2 = (av8) of3Var;
                if (av8Var2.T(intValue & 1, (intValue & 3) != 2)) {
                    gb0 a = qgb.a.a(new uv(fantasyOnboardingActivity));
                    ff5 ff5Var = uhb.a;
                    rgh rghVar = fantasyOnboardingActivity.L;
                    bfk bfkVar = fantasyOnboardingActivity.K;
                    if (bfkVar == null) {
                        Intrinsics.i("userAccountManager");
                        throw null;
                    }
                    tol.c(new gb0[]{a, ff5Var.a(new sgh(rghVar, bfkVar))}, ww9.j, av8Var2, 56);
                } else {
                    av8Var2.W();
                }
                return Unit.a;
        }
    }
}
