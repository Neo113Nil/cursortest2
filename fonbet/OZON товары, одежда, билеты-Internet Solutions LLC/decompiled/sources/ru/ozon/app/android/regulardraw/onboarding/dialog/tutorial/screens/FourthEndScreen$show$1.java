package ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.screens;

import WZ.l;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.data.TutorialScreenModel;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class FourthEndScreen$show$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ ConstraintLayout $constraintLayout;
    final /* synthetic */ ImageView $firstNavbarView;
    final /* synthetic */ Function2<Boolean, Function0<Unit>, Unit> $onNext;
    final /* synthetic */ FrameLayout $rootView;
    final /* synthetic */ ImageView $secondNavbarView;
    final /* synthetic */ AppCompatTextView $skipTextView;
    final /* synthetic */ l $tokenizedAnalytics;
    final /* synthetic */ TutorialScreenModel.FourthTutorialScreenModel $tutorialScreenModel;
    final /* synthetic */ FourthEndScreen this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FourthEndScreen$show$1(AppCompatTextView appCompatTextView, ImageView imageView, ImageView imageView2, FourthEndScreen fourthEndScreen, l lVar, TutorialScreenModel.FourthTutorialScreenModel fourthTutorialScreenModel, ConstraintLayout constraintLayout, FrameLayout frameLayout, Function2<? super Boolean, ? super Function0<Unit>, Unit> function2) {
        super(0);
        this.$skipTextView = appCompatTextView;
        this.$firstNavbarView = imageView;
        this.$secondNavbarView = imageView2;
        this.this$0 = fourthEndScreen;
        this.$tokenizedAnalytics = lVar;
        this.$tutorialScreenModel = fourthTutorialScreenModel;
        this.$constraintLayout = constraintLayout;
        this.$rootView = frameLayout;
        this.$onNext = function2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(FourthEndScreen fourthEndScreen, l lVar, TutorialScreenModel.FourthTutorialScreenModel fourthTutorialScreenModel, ConstraintLayout constraintLayout, FrameLayout frameLayout, Function2 function2, View view) {
        fourthEndScreen.doOnClick(new FourthEndScreen$show$1$1$1(fourthEndScreen, lVar, fourthTutorialScreenModel, constraintLayout, frameLayout, function2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$1(FourthEndScreen fourthEndScreen, ConstraintLayout constraintLayout, FrameLayout frameLayout, Function2 function2, TutorialScreenModel.FourthTutorialScreenModel fourthTutorialScreenModel, View view) {
        fourthEndScreen.doOnClick(new FourthEndScreen$show$1$2$1(constraintLayout, frameLayout, function2, fourthTutorialScreenModel));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$2(FourthEndScreen fourthEndScreen, ConstraintLayout constraintLayout, FrameLayout frameLayout, Function2 function2, TutorialScreenModel.FourthTutorialScreenModel fourthTutorialScreenModel, View view) {
        fourthEndScreen.doOnClick(new FourthEndScreen$show$1$3$1(constraintLayout, frameLayout, function2, fourthTutorialScreenModel));
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AppCompatTextView appCompatTextView = this.$skipTextView;
        final FourthEndScreen fourthEndScreen = this.this$0;
        final l lVar = this.$tokenizedAnalytics;
        final TutorialScreenModel.FourthTutorialScreenModel fourthTutorialScreenModel = this.$tutorialScreenModel;
        final ConstraintLayout constraintLayout = this.$constraintLayout;
        final FrameLayout frameLayout = this.$rootView;
        final Function2<Boolean, Function0<Unit>, Unit> function2 = this.$onNext;
        appCompatTextView.setOnClickListener(new View.OnClickListener() { // from class: ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.screens.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FourthEndScreen$show$1.invoke$lambda$0(FourthEndScreen.this, lVar, fourthTutorialScreenModel, constraintLayout, frameLayout, function2, view);
            }
        });
        ImageView imageView = this.$firstNavbarView;
        final FourthEndScreen fourthEndScreen2 = this.this$0;
        final ConstraintLayout constraintLayout2 = this.$constraintLayout;
        final FrameLayout frameLayout2 = this.$rootView;
        final Function2<Boolean, Function0<Unit>, Unit> function22 = this.$onNext;
        final TutorialScreenModel.FourthTutorialScreenModel fourthTutorialScreenModel2 = this.$tutorialScreenModel;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.screens.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FourthEndScreen$show$1.invoke$lambda$1(FourthEndScreen.this, constraintLayout2, frameLayout2, function22, fourthTutorialScreenModel2, view);
            }
        });
        ImageView imageView2 = this.$secondNavbarView;
        final FourthEndScreen fourthEndScreen3 = this.this$0;
        final ConstraintLayout constraintLayout3 = this.$constraintLayout;
        final FrameLayout frameLayout3 = this.$rootView;
        final Function2<Boolean, Function0<Unit>, Unit> function23 = this.$onNext;
        final TutorialScreenModel.FourthTutorialScreenModel fourthTutorialScreenModel3 = this.$tutorialScreenModel;
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.screens.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FourthEndScreen$show$1.invoke$lambda$2(FourthEndScreen.this, constraintLayout3, frameLayout3, function23, fourthTutorialScreenModel3, view);
            }
        });
    }
}
