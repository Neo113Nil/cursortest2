package ru.ozon.app.android.regulardraw.onboarding;

import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.data.TutorialSteps;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lru/ozon/app/android/regulardraw/onboarding/InfoCollector;", "Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class MorkovskOnboardingManager$firstShowInfoCollector$2 extends AbstractC7737t implements Function0<InfoCollector<OnboardingModel>> {
    final /* synthetic */ MorkovskOnboardingManager this$0;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "modelMap", "", "Ljava/lang/Class;", "Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.regulardraw.onboarding.MorkovskOnboardingManager$firstShowInfoCollector$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<Map<Class<? extends OnboardingModel>, ? extends OnboardingModel>, Unit> {
        final /* synthetic */ MorkovskOnboardingManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MorkovskOnboardingManager morkovskOnboardingManager) {
            super(1);
            this.this$0 = morkovskOnboardingManager;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Map<Class<? extends OnboardingModel>, ? extends OnboardingModel> map) {
            invoke2(map);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Map<Class<? extends OnboardingModel>, ? extends OnboardingModel> modelMap) {
            Intrinsics.checkNotNullParameter(modelMap, "modelMap");
            TutorialSteps buildWelcomeTutorialStepsFromModels = TutorialSteps.INSTANCE.buildWelcomeTutorialStepsFromModels(modelMap);
            if (buildWelcomeTutorialStepsFromModels != null) {
                this.this$0.startOnboarding(buildWelcomeTutorialStepsFromModels);
                this.this$0.markWelcomeOnboardingIsShown(true);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MorkovskOnboardingManager$firstShowInfoCollector$2(MorkovskOnboardingManager morkovskOnboardingManager) {
        super(0);
        this.this$0 = morkovskOnboardingManager;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InfoCollector<OnboardingModel> invoke() {
        Set firstShowOnboardingModels;
        firstShowOnboardingModels = this.this$0.getFirstShowOnboardingModels();
        return new InfoCollector<>(firstShowOnboardingModels, new AnonymousClass1(this.this$0));
    }
}
