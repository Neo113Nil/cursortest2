package ru.ozon.app.android.regulardraw.widgets.onboardingInfo.v2.core;

import S0.M;
import S0.N;
import Tg.b;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.G;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.regulardraw.flags.MegaSkipFirstOnboardingEnabled;
import ru.ozon.app.android.regulardraw.onboarding.MorkovskOnboardingDelegate;
import ru.ozon.app.android.regulardraw.widgets.onboardingInfo.v2.di.LotteryOnboardingInfoComponent;
import ru.ozon.app.android.regulardraw.widgets.onboardingInfo.v2.presentation.LotteryOnboardingInfoVI;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LS0/N;", "LS0/M;", "invoke", "(LS0/N;)LS0/M;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class LotteryOnboardingInfoWidgetKt$LotteryOnboardingInfoWidget$1$3$3$1$1$1 extends AbstractC7737t implements Function1<N, M> {
    final /* synthetic */ Function1<b, Unit> $actionHandler;
    final /* synthetic */ LotteryOnboardingInfoComponent $component;
    final /* synthetic */ AbstractC5434v $lifecycle;
    final /* synthetic */ J $lifecycleOwner;
    final /* synthetic */ LotteryOnboardingInfoVI $lotteryItem;
    final /* synthetic */ MorkovskOnboardingDelegate $onboardingDelegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    LotteryOnboardingInfoWidgetKt$LotteryOnboardingInfoWidget$1$3$3$1$1$1(LotteryOnboardingInfoComponent lotteryOnboardingInfoComponent, LotteryOnboardingInfoVI lotteryOnboardingInfoVI, J j11, AbstractC5434v abstractC5434v, MorkovskOnboardingDelegate morkovskOnboardingDelegate, Function1<? super b, Unit> function1) {
        super(1);
        this.$component = lotteryOnboardingInfoComponent;
        this.$lotteryItem = lotteryOnboardingInfoVI;
        this.$lifecycleOwner = j11;
        this.$lifecycle = abstractC5434v;
        this.$onboardingDelegate = morkovskOnboardingDelegate;
        this.$actionHandler = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final M invoke(N DisposableEffect) {
        final G createLifecycleObserver;
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        if (this.$component.getFeatureChecker().isEnabled(MegaSkipFirstOnboardingEnabled.INSTANCE)) {
            LotteryOnboardingInfoWidgetKt.forceSendOnboardingViewRequest(this.$lotteryItem, this.$component);
        }
        createLifecycleObserver = LotteryOnboardingInfoWidgetKt.createLifecycleObserver(this.$lifecycleOwner, this.$lifecycle, this.$lotteryItem, this.$component, this.$onboardingDelegate, this.$actionHandler);
        this.$lifecycle.a(createLifecycleObserver);
        final AbstractC5434v abstractC5434v = this.$lifecycle;
        final MorkovskOnboardingDelegate morkovskOnboardingDelegate = this.$onboardingDelegate;
        return new M() { // from class: ru.ozon.app.android.regulardraw.widgets.onboardingInfo.v2.core.LotteryOnboardingInfoWidgetKt$LotteryOnboardingInfoWidget$1$3$3$1$1$1$invoke$$inlined$onDispose$1
            @Override // S0.M
            public void dispose() {
                AbstractC5434v.this.e(createLifecycleObserver);
                morkovskOnboardingDelegate.provideLotteryOnboarding().disposeLotteryOnboardingModel();
            }
        };
    }
}
