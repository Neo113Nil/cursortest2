package ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.screens;

import WZ.l;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.data.TutorialScreenModel;
import ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.utils.AnimationsKt;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class FourthEndScreen$show$1$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ ConstraintLayout $constraintLayout;
    final /* synthetic */ Function2<Boolean, Function0<Unit>, Unit> $onNext;
    final /* synthetic */ FrameLayout $rootView;
    final /* synthetic */ l $tokenizedAnalytics;
    final /* synthetic */ TutorialScreenModel.FourthTutorialScreenModel $tutorialScreenModel;
    final /* synthetic */ FourthEndScreen this$0;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.screens.FourthEndScreen$show$1$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<Unit> {
        final /* synthetic */ Function2<Boolean, Function0<Unit>, Unit> $onNext;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Function2<? super Boolean, ? super Function0<Unit>, Unit> function2) {
            super(0);
            this.$onNext = function2;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$onNext.invoke(Boolean.FALSE, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FourthEndScreen$show$1$1$1(FourthEndScreen fourthEndScreen, l lVar, TutorialScreenModel.FourthTutorialScreenModel fourthTutorialScreenModel, ConstraintLayout constraintLayout, FrameLayout frameLayout, Function2<? super Boolean, ? super Function0<Unit>, Unit> function2) {
        super(0);
        this.this$0 = fourthEndScreen;
        this.$tokenizedAnalytics = lVar;
        this.$tutorialScreenModel = fourthTutorialScreenModel;
        this.$constraintLayout = constraintLayout;
        this.$rootView = frameLayout;
        this.$onNext = function2;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.onScreenClosed(this.$tokenizedAnalytics, this.$tutorialScreenModel);
        AnimationsKt.fadeOutAndRemove$default(this.$constraintLayout, 0L, this.$rootView, new AnonymousClass1(this.$onNext), 1, null);
    }
}
