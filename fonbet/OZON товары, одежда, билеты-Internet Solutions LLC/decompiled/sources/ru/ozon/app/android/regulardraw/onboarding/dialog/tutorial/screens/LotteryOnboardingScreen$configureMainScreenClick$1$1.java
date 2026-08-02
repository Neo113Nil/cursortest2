package ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.screens;

import WZ.l;
import WZ.m;
import WZ.t;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.utils.AnimationsKt;
import ru.ozon.app.android.regulardraw.widgets.navbar.ShadowImageButton;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class LotteryOnboardingScreen$configureMainScreenClick$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ ConstraintLayout $constraintLayout;
    final /* synthetic */ boolean $isLastScreen;
    final /* synthetic */ Function2<Boolean, Function0<Unit>, Unit> $onNext;
    final /* synthetic */ ShadowImageButton $overlayCloseScreenButton;
    final /* synthetic */ ViewGroup $rootView;
    final /* synthetic */ l $tokenizedAnalytics;
    final /* synthetic */ t $tokenizedEvent;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.screens.LotteryOnboardingScreen$configureMainScreenClick$1$1$1, reason: invalid class name */
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
    /* renamed from: ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.screens.LotteryOnboardingScreen$configureMainScreenClick$1$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function0<Unit> {
        final /* synthetic */ boolean $isLastScreen;
        final /* synthetic */ Function2<Boolean, Function0<Unit>, Unit> $onNext;
        final /* synthetic */ l $tokenizedAnalytics;
        final /* synthetic */ t $tokenizedEvent;

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.screens.LotteryOnboardingScreen$configureMainScreenClick$1$1$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends AbstractC7737t implements Function0<Unit> {
            final /* synthetic */ boolean $isLastScreen;
            final /* synthetic */ l $tokenizedAnalytics;
            final /* synthetic */ t $tokenizedEvent;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(boolean z11, t tVar, l lVar) {
                super(0);
                this.$isLastScreen = z11;
                this.$tokenizedEvent = tVar;
                this.$tokenizedAnalytics = lVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                t tVar;
                if (!this.$isLastScreen || (tVar = this.$tokenizedEvent) == null) {
                    return;
                }
                m.a(this.$tokenizedAnalytics, tVar, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Function2<? super Boolean, ? super Function0<Unit>, Unit> function2, boolean z11, t tVar, l lVar) {
            super(0);
            this.$onNext = function2;
            this.$isLastScreen = z11;
            this.$tokenizedEvent = tVar;
            this.$tokenizedAnalytics = lVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$onNext.invoke(Boolean.FALSE, new AnonymousClass1(this.$isLastScreen, this.$tokenizedEvent, this.$tokenizedAnalytics));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    LotteryOnboardingScreen$configureMainScreenClick$1$1(boolean z11, ShadowImageButton shadowImageButton, ViewGroup viewGroup, ConstraintLayout constraintLayout, Function2<? super Boolean, ? super Function0<Unit>, Unit> function2, t tVar, l lVar) {
        super(0);
        this.$isLastScreen = z11;
        this.$overlayCloseScreenButton = shadowImageButton;
        this.$rootView = viewGroup;
        this.$constraintLayout = constraintLayout;
        this.$onNext = function2;
        this.$tokenizedEvent = tVar;
        this.$tokenizedAnalytics = lVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.$isLastScreen) {
            AnimationsKt.fadeOutAndRemove$default(this.$overlayCloseScreenButton, 0L, this.$rootView, AnonymousClass1.INSTANCE, 1, null);
        }
        AnimationsKt.fadeOutAndRemove$default(this.$constraintLayout, 0L, this.$rootView, new AnonymousClass2(this.$onNext, this.$isLastScreen, this.$tokenizedEvent, this.$tokenizedAnalytics), 1, null);
    }
}
