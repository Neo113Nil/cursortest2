package ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.screens;

import WZ.l;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.data.TutorialScreenModel;
import ru.ozon.app.android.regulardraw.ui.button.MorkovskShadowButton;
import ru.ozon.app.android.regulardraw.widgets.navbar.ShadowImageButton;
import ru.ozon.app.android.regulardraw.widgets.onboardingInfo.v2.presentation.LotteryOnboardingInfoVI;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class LotteryOnboardingScreen$getOnEndAction$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ ConstraintLayout $constraintLayout;
    final /* synthetic */ View $footerView;
    final /* synthetic */ Function2<Boolean, Function0<Unit>, Unit> $onNext;
    final /* synthetic */ ShadowImageButton $overlayCloseScreenButton;
    final /* synthetic */ ViewGroup $rootView;
    final /* synthetic */ l $tokenizedAnalytics;
    final /* synthetic */ TutorialScreenModel.LotteryOnboardingTutorialScreenModel $tutorialScreenModel;
    final /* synthetic */ LotteryOnboardingScreen this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    LotteryOnboardingScreen$getOnEndAction$1(LotteryOnboardingScreen lotteryOnboardingScreen, ViewGroup viewGroup, ConstraintLayout constraintLayout, ShadowImageButton shadowImageButton, TutorialScreenModel.LotteryOnboardingTutorialScreenModel lotteryOnboardingTutorialScreenModel, l lVar, Function2<? super Boolean, ? super Function0<Unit>, Unit> function2, View view) {
        super(0);
        this.this$0 = lotteryOnboardingScreen;
        this.$rootView = viewGroup;
        this.$constraintLayout = constraintLayout;
        this.$overlayCloseScreenButton = shadowImageButton;
        this.$tutorialScreenModel = lotteryOnboardingTutorialScreenModel;
        this.$tokenizedAnalytics = lVar;
        this.$onNext = function2;
        this.$footerView = view;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.configureOverlayCloseButtonClick(this.$rootView, this.$constraintLayout, this.$overlayCloseScreenButton, this.$tutorialScreenModel, this.$tokenizedAnalytics, this.$onNext);
        if (!(this.$footerView instanceof MorkovskShadowButton) || !(this.$tutorialScreenModel.getLotteryOnboardingStep().getFooterContent() instanceof LotteryOnboardingInfoVI.OnboardingStep.FooterContent.FinishButton)) {
            this.this$0.configureMainScreenClick(this.$rootView, this.$constraintLayout, this.$overlayCloseScreenButton, this.$tutorialScreenModel.getIsLastScreen(), this.$tutorialScreenModel.getLotteryOnboardingStep().getTokenizedEvent(), this.$tokenizedAnalytics, this.$onNext);
            return;
        }
        LotteryOnboardingScreen lotteryOnboardingScreen = this.this$0;
        ViewGroup viewGroup = this.$rootView;
        ConstraintLayout constraintLayout = this.$constraintLayout;
        MorkovskShadowButton morkovskShadowButton = (MorkovskShadowButton) this.$footerView;
        ShadowImageButton shadowImageButton = this.$overlayCloseScreenButton;
        TutorialScreenModel.LotteryOnboardingTutorialScreenModel lotteryOnboardingTutorialScreenModel = this.$tutorialScreenModel;
        lotteryOnboardingScreen.configureFooterButtonClick(viewGroup, constraintLayout, morkovskShadowButton, shadowImageButton, lotteryOnboardingTutorialScreenModel, (LotteryOnboardingInfoVI.OnboardingStep.FooterContent.FinishButton) lotteryOnboardingTutorialScreenModel.getLotteryOnboardingStep().getFooterContent(), this.$tokenizedAnalytics, this.$onNext);
    }
}
