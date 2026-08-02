package ru.ozon.app.android.regulardraw.widgets.onboardingInfo.v2.core;

import Sc.s;
import Wc.a;
import androidx.lifecycle.AbstractC5434v;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.regulardraw.onboarding.LotteryOnboardingModel;
import ru.ozon.app.android.regulardraw.onboarding.MorkovskOnboardingDelegate;
import ru.ozon.app.android.regulardraw.widgets.onboardingInfo.v2.di.LotteryOnboardingInfoComponent;
import ru.ozon.app.android.regulardraw.widgets.onboardingInfo.v2.presentation.LotteryOnboardingInfoVI;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import xe.M;
import xe.Y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.regulardraw.widgets.onboardingInfo.v2.core.LotteryOnboardingInfoWidgetKt$createLifecycleObserver$1$1", f = "LotteryOnboardingInfoWidget.kt", l = {127}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class LotteryOnboardingInfoWidgetKt$createLifecycleObserver$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
    final /* synthetic */ LotteryOnboardingInfoComponent $component;
    final /* synthetic */ AbstractC5434v $lifecycle;
    final /* synthetic */ LotteryOnboardingInfoVI $lotteryItem;
    final /* synthetic */ MorkovskOnboardingDelegate $onboardingDelegate;
    int label;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "atomAction", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.regulardraw.widgets.onboardingInfo.v2.core.LotteryOnboardingInfoWidgetKt$createLifecycleObserver$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<AtomAction, Unit> {
        final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Function1<? super AtomAction, Unit> function1) {
            super(1);
            this.$actionHandler = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
            invoke2(atomAction);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AtomAction atomAction) {
            Intrinsics.checkNotNullParameter(atomAction, "atomAction");
            this.$actionHandler.invoke(atomAction);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "atomActionDTO", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.regulardraw.widgets.onboardingInfo.v2.core.LotteryOnboardingInfoWidgetKt$createLifecycleObserver$1$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<AtomActionDTO, Unit> {
        final /* synthetic */ LotteryOnboardingInfoComponent $component;
        final /* synthetic */ MorkovskOnboardingDelegate.LotteryOnboarding $lotteryOnboardingDialog;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(MorkovskOnboardingDelegate.LotteryOnboarding lotteryOnboarding, LotteryOnboardingInfoComponent lotteryOnboardingInfoComponent) {
            super(1);
            this.$lotteryOnboardingDialog = lotteryOnboarding;
            this.$component = lotteryOnboardingInfoComponent;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AtomActionDTO atomActionDTO) {
            invoke2(atomActionDTO);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AtomActionDTO atomActionDTO) {
            Intrinsics.checkNotNullParameter(atomActionDTO, "atomActionDTO");
            this.$lotteryOnboardingDialog.markSecondPartAsShown();
            String link = atomActionDTO.getLink();
            if (link != null) {
                LotteryOnboardingInfoWidgetKt.sendOnboardingViewedRequest(link, this.$component.getActionV2Repository());
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    LotteryOnboardingInfoWidgetKt$createLifecycleObserver$1$1(AbstractC5434v abstractC5434v, MorkovskOnboardingDelegate morkovskOnboardingDelegate, LotteryOnboardingInfoVI lotteryOnboardingInfoVI, Function1<? super AtomAction, Unit> function1, LotteryOnboardingInfoComponent lotteryOnboardingInfoComponent, d<? super LotteryOnboardingInfoWidgetKt$createLifecycleObserver$1$1> dVar) {
        super(2, dVar);
        this.$lifecycle = abstractC5434v;
        this.$onboardingDelegate = morkovskOnboardingDelegate;
        this.$lotteryItem = lotteryOnboardingInfoVI;
        this.$actionHandler = function1;
        this.$component = lotteryOnboardingInfoComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new LotteryOnboardingInfoWidgetKt$createLifecycleObserver$1$1(this.$lifecycle, this.$onboardingDelegate, this.$lotteryItem, this.$actionHandler, this.$component, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            this.label = 1;
            if (Y.b(200L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        if (this.$lifecycle.b().a(AbstractC5434v.b.RESUMED)) {
            MorkovskOnboardingDelegate.LotteryOnboarding provideLotteryOnboarding = this.$onboardingDelegate.provideLotteryOnboarding();
            provideLotteryOnboarding.putLotteryOnboardingModel(new LotteryOnboardingModel(this.$lotteryItem, new AnonymousClass1(this.$actionHandler), new AnonymousClass2(provideLotteryOnboarding, this.$component)));
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((LotteryOnboardingInfoWidgetKt$createLifecycleObserver$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
