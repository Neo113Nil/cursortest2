package defpackage;

import com.sofascore.results.onboarding.OnboardingActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class ird implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ OnboardingActivity b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ ird(OnboardingActivity onboardingActivity, boolean z, int i) {
        this.a = i;
        this.b = onboardingActivity;
        this.c = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        boolean z = this.c;
        OnboardingActivity onboardingActivity = this.b;
        int i2 = 2;
        int i3 = 1;
        of3 of3Var = (of3) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                int i4 = OnboardingActivity.L;
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    haa.f(yqo.H(-525984662, av8Var, new ird(onboardingActivity, z, i3)), av8Var, 6);
                } else {
                    av8Var.W();
                }
                break;
            default:
                int i5 = OnboardingActivity.L;
                av8 av8Var2 = (av8) of3Var;
                if (av8Var2.T(intValue & 1, (intValue & 3) != 2)) {
                    gb0 a = qgb.a.a(new uv(onboardingActivity));
                    ff5 ff5Var = uhb.a;
                    rgh rghVar = onboardingActivity.K;
                    ia0 ia0Var = ia0.q;
                    tol.c(new gb0[]{a, ff5Var.a(new sgh(rghVar, ok3.p().g()))}, yqo.H(1334260010, av8Var2, new zj7(z, i2)), av8Var2, 56);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
