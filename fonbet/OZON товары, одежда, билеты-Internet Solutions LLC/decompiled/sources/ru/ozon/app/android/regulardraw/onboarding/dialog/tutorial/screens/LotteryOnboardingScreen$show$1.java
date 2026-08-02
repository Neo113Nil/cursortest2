package ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.screens;

import android.view.View;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.data.TutorialScreenModel;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class LotteryOnboardingScreen$show$1 extends AbstractC7737t implements Function1<androidx.constraintlayout.widget.d, Unit> {
    final /* synthetic */ View $footerView;
    final /* synthetic */ ImageView $imageView;
    final /* synthetic */ TutorialScreenModel.LotteryOnboardingTutorialScreenModel $tutorialScreenModel;
    final /* synthetic */ LotteryOnboardingScreen this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LotteryOnboardingScreen$show$1(ImageView imageView, LotteryOnboardingScreen lotteryOnboardingScreen, View view, TutorialScreenModel.LotteryOnboardingTutorialScreenModel lotteryOnboardingTutorialScreenModel) {
        super(1);
        this.$imageView = imageView;
        this.this$0 = lotteryOnboardingScreen;
        this.$footerView = view;
        this.$tutorialScreenModel = lotteryOnboardingTutorialScreenModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(androidx.constraintlayout.widget.d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(androidx.constraintlayout.widget.d updateConstraints) {
        int closeButtonSize;
        int footerContentHorizontalMargin;
        Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
        int id2 = this.$imageView.getId();
        Dimens dimens = Dimens.INSTANCE;
        int dp_24 = dimens.getDP_24();
        closeButtonSize = this.this$0.getCloseButtonSize();
        ConstraintSetExtKt.topToTop(updateConstraints, id2, 0, dimens.getDP_6() + closeButtonSize + dp_24);
        ConstraintSetExtKt.startToStart$default(updateConstraints, this.$imageView.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.endToEnd$default(updateConstraints, this.$imageView.getId(), 0, 0, 4, null);
        View view = this.$footerView;
        if (view != null) {
            ImageView imageView = this.$imageView;
            LotteryOnboardingScreen lotteryOnboardingScreen = this.this$0;
            TutorialScreenModel.LotteryOnboardingTutorialScreenModel lotteryOnboardingTutorialScreenModel = this.$tutorialScreenModel;
            ConstraintSetExtKt.bottomToTop$default(updateConstraints, imageView.getId(), view.getId(), 0, 4, null);
            updateConstraints.f0(0.0f, imageView.getId());
            footerContentHorizontalMargin = lotteryOnboardingScreen.getFooterContentHorizontalMargin(lotteryOnboardingTutorialScreenModel.getLotteryOnboardingStep().getFooterContent());
            ConstraintSetExtKt.startToStart(updateConstraints, view.getId(), 0, footerContentHorizontalMargin);
            ConstraintSetExtKt.endToEnd(updateConstraints, view.getId(), 0, footerContentHorizontalMargin);
            ConstraintSetExtKt.bottomToBottom(updateConstraints, view.getId(), 0, dimens.getDP_24());
        }
    }
}
