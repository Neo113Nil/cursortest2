package ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.screens;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.data.TutorialScreenModel;
import ru.ozon.app.android.regulardraw.ui.button.MorkovskShadowButton;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class StandaloneMainDrawMajorScreenScreen$show$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ MorkovskShadowButton $confirmButtonView;
    final /* synthetic */ ConstraintLayout $constraintLayout;
    final /* synthetic */ Function2<Boolean, Function0<Unit>, Unit> $onNext;
    final /* synthetic */ FrameLayout $rootView;
    final /* synthetic */ TutorialScreenModel.MainDrawMajorScreenTutorialScreenModel $tutorialScreenModel;
    final /* synthetic */ StandaloneMainDrawMajorScreenScreen this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    StandaloneMainDrawMajorScreenScreen$show$1(MorkovskShadowButton morkovskShadowButton, StandaloneMainDrawMajorScreenScreen standaloneMainDrawMajorScreenScreen, TutorialScreenModel.MainDrawMajorScreenTutorialScreenModel mainDrawMajorScreenTutorialScreenModel, ConstraintLayout constraintLayout, FrameLayout frameLayout, Function2<? super Boolean, ? super Function0<Unit>, Unit> function2) {
        super(0);
        this.$confirmButtonView = morkovskShadowButton;
        this.this$0 = standaloneMainDrawMajorScreenScreen;
        this.$tutorialScreenModel = mainDrawMajorScreenTutorialScreenModel;
        this.$constraintLayout = constraintLayout;
        this.$rootView = frameLayout;
        this.$onNext = function2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(StandaloneMainDrawMajorScreenScreen standaloneMainDrawMajorScreenScreen, TutorialScreenModel.MainDrawMajorScreenTutorialScreenModel mainDrawMajorScreenTutorialScreenModel, ConstraintLayout constraintLayout, FrameLayout frameLayout, Function2 function2, View view) {
        standaloneMainDrawMajorScreenScreen.doOnClick(new StandaloneMainDrawMajorScreenScreen$show$1$1$1(mainDrawMajorScreenTutorialScreenModel, constraintLayout, frameLayout, function2));
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MorkovskShadowButton morkovskShadowButton = this.$confirmButtonView;
        final StandaloneMainDrawMajorScreenScreen standaloneMainDrawMajorScreenScreen = this.this$0;
        final TutorialScreenModel.MainDrawMajorScreenTutorialScreenModel mainDrawMajorScreenTutorialScreenModel = this.$tutorialScreenModel;
        final ConstraintLayout constraintLayout = this.$constraintLayout;
        final FrameLayout frameLayout = this.$rootView;
        final Function2<Boolean, Function0<Unit>, Unit> function2 = this.$onNext;
        morkovskShadowButton.setOnClickListener(new View.OnClickListener() { // from class: ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.screens.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StandaloneMainDrawMajorScreenScreen$show$1.invoke$lambda$0(StandaloneMainDrawMajorScreenScreen.this, mainDrawMajorScreenTutorialScreenModel, constraintLayout, frameLayout, function2, view);
            }
        });
    }
}
