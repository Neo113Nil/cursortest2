package ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.screens;

import WZ.l;
import WZ.m;
import WZ.t;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.data.TutorialScreenModel;
import ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.utils.AnimationsKt;
import ru.ozon.app.android.regulardraw.ui.button.MorkovskShadowButtonDTO;
import ru.ozon.app.android.regulardraw.widgets.navbar.ShadowImageButton;
import ru.ozon.app.android.regulardraw.widgets.onboardingInfo.v2.presentation.LotteryOnboardingInfoVI;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class LotteryOnboardingScreen$configureFooterButtonClick$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ ConstraintLayout $constraintLayout;
    final /* synthetic */ LotteryOnboardingInfoVI.OnboardingStep.FooterContent.FinishButton $footerContent;
    final /* synthetic */ Function2<Boolean, Function0<Unit>, Unit> $onNext;
    final /* synthetic */ ShadowImageButton $overlayCloseScreenButton;
    final /* synthetic */ ViewGroup $rootView;
    final /* synthetic */ l $tokenizedAnalytics;
    final /* synthetic */ TutorialScreenModel.LotteryOnboardingTutorialScreenModel $tutorialScreenModel;
    final /* synthetic */ LotteryOnboardingScreen this$0;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.screens.LotteryOnboardingScreen$configureFooterButtonClick$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.screens.LotteryOnboardingScreen$configureFooterButtonClick$1$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function0<Unit> {
        final /* synthetic */ LotteryOnboardingInfoVI.OnboardingStep.FooterContent.FinishButton $footerContent;
        final /* synthetic */ Function2<Boolean, Function0<Unit>, Unit> $onNext;
        final /* synthetic */ l $tokenizedAnalytics;
        final /* synthetic */ TutorialScreenModel.LotteryOnboardingTutorialScreenModel $tutorialScreenModel;
        final /* synthetic */ LotteryOnboardingScreen this$0;

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.screens.LotteryOnboardingScreen$configureFooterButtonClick$1$1$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends AbstractC7737t implements Function0<Unit> {
            final /* synthetic */ LotteryOnboardingInfoVI.OnboardingStep.FooterContent.FinishButton $footerContent;
            final /* synthetic */ l $tokenizedAnalytics;
            final /* synthetic */ TutorialScreenModel.LotteryOnboardingTutorialScreenModel $tutorialScreenModel;
            final /* synthetic */ LotteryOnboardingScreen this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(LotteryOnboardingInfoVI.OnboardingStep.FooterContent.FinishButton finishButton, TutorialScreenModel.LotteryOnboardingTutorialScreenModel lotteryOnboardingTutorialScreenModel, LotteryOnboardingScreen lotteryOnboardingScreen, l lVar) {
                super(0);
                this.$footerContent = finishButton;
                this.$tutorialScreenModel = lotteryOnboardingTutorialScreenModel;
                this.this$0 = lotteryOnboardingScreen;
                this.$tokenizedAnalytics = lVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                MorkovskShadowButtonDTO firstPresentationButton;
                AtomAction noDismissAtomAction;
                t tokenizedEvent$default;
                AtomActionDTO firstPresentationCompletedAction = this.$footerContent.getFirstPresentationCompletedAction();
                if (firstPresentationCompletedAction != null) {
                    this.$tutorialScreenModel.getSendOnboardingViewedRequest().invoke(firstPresentationCompletedAction);
                }
                if (this.$tutorialScreenModel.getIsForceShow()) {
                    firstPresentationButton = this.$footerContent.getDefaultButton();
                } else {
                    firstPresentationButton = this.$footerContent.getFirstPresentationButton();
                    if (firstPresentationButton == null) {
                        firstPresentationButton = this.$footerContent.getDefaultButton();
                    }
                }
                noDismissAtomAction = this.this$0.getNoDismissAtomAction(firstPresentationButton.getAction());
                if (noDismissAtomAction != null) {
                    this.$tutorialScreenModel.getHandleComposerAction().invoke(noDismissAtomAction);
                }
                Map<String, TokenizedTrackingInfo> trackingInfo = firstPresentationButton.getTrackingInfo();
                if (trackingInfo == null || (tokenizedEvent$default = TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(this.$tutorialScreenModel.getWidgetId()), null, 2, null)) == null) {
                    return;
                }
                m.a(this.$tokenizedAnalytics, tokenizedEvent$default, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Function2<? super Boolean, ? super Function0<Unit>, Unit> function2, LotteryOnboardingInfoVI.OnboardingStep.FooterContent.FinishButton finishButton, TutorialScreenModel.LotteryOnboardingTutorialScreenModel lotteryOnboardingTutorialScreenModel, LotteryOnboardingScreen lotteryOnboardingScreen, l lVar) {
            super(0);
            this.$onNext = function2;
            this.$footerContent = finishButton;
            this.$tutorialScreenModel = lotteryOnboardingTutorialScreenModel;
            this.this$0 = lotteryOnboardingScreen;
            this.$tokenizedAnalytics = lVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$onNext.invoke(Boolean.TRUE, new AnonymousClass1(this.$footerContent, this.$tutorialScreenModel, this.this$0, this.$tokenizedAnalytics));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    LotteryOnboardingScreen$configureFooterButtonClick$1$1(ShadowImageButton shadowImageButton, ViewGroup viewGroup, ConstraintLayout constraintLayout, Function2<? super Boolean, ? super Function0<Unit>, Unit> function2, LotteryOnboardingInfoVI.OnboardingStep.FooterContent.FinishButton finishButton, TutorialScreenModel.LotteryOnboardingTutorialScreenModel lotteryOnboardingTutorialScreenModel, LotteryOnboardingScreen lotteryOnboardingScreen, l lVar) {
        super(0);
        this.$overlayCloseScreenButton = shadowImageButton;
        this.$rootView = viewGroup;
        this.$constraintLayout = constraintLayout;
        this.$onNext = function2;
        this.$footerContent = finishButton;
        this.$tutorialScreenModel = lotteryOnboardingTutorialScreenModel;
        this.this$0 = lotteryOnboardingScreen;
        this.$tokenizedAnalytics = lVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AnimationsKt.fadeOutAndRemove$default(this.$overlayCloseScreenButton, 0L, this.$rootView, AnonymousClass1.INSTANCE, 1, null);
        AnimationsKt.fadeOutAndRemove$default(this.$constraintLayout, 0L, this.$rootView, new AnonymousClass2(this.$onNext, this.$footerContent, this.$tutorialScreenModel, this.this$0, this.$tokenizedAnalytics), 1, null);
    }
}
