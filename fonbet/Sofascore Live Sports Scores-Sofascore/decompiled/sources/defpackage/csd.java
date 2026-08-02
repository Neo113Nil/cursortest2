package defpackage;

import com.sofascore.results.onboarding.OnboardingViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class csd extends ot8 implements Function0 {
    public final /* synthetic */ OnboardingViewModel b;
    public final /* synthetic */ c6d c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csd(OnboardingViewModel onboardingViewModel, c6d c6dVar) {
        super(0, s9a.class, "onBack", "OnboardingNavigationRoot$onBack(Lcom/sofascore/results/onboarding/OnboardingViewModel;Landroidx/navigation3/runtime/NavBackStack;)V", 0);
        this.b = onboardingViewModel;
        this.c = c6dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.b.x(crd.a);
        o13.E(this.c);
        return Unit.a;
    }
}
