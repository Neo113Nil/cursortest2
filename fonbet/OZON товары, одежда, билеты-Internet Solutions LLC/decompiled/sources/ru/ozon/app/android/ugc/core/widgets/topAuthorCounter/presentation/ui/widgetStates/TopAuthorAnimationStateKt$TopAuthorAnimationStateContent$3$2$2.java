package ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.presentation.ui.widgetStates;

import S0.InterfaceC3967k;
import Tg.b;
import U7.l;
import WZ.t;
import fd.InterfaceC6512o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l0.InterfaceC7772p;
import m0.C7980b;
import m0.C8008p;
import ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.presentation.TopAuthorAnimationUIState;
import ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.presentation.TopAuthorWidgetViewState;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ll0/p;", "Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/presentation/TopAuthorAnimationUIState;", "animationState", "", "invoke", "(Ll0/p;Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/presentation/TopAuthorAnimationUIState;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class TopAuthorAnimationStateKt$TopAuthorAnimationStateContent$3$2$2 extends AbstractC7737t implements InterfaceC6512o<InterfaceC7772p, TopAuthorAnimationUIState, InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ Function1<b, Unit> $actionHandler;
    final /* synthetic */ C7980b<Float, C8008p> $circleAnimationProgress;
    final /* synthetic */ C7980b<Float, C8008p> $lineAnimationProgress;
    final /* synthetic */ Function1<t, Unit> $onView;
    final /* synthetic */ TopAuthorWidgetViewState.TopAuthorWithAnimation $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TopAuthorAnimationStateKt$TopAuthorAnimationStateContent$3$2$2(TopAuthorWidgetViewState.TopAuthorWithAnimation topAuthorWithAnimation, C7980b<Float, C8008p> c7980b, C7980b<Float, C8008p> c7980b2, Function1<? super t, Unit> function1, Function1<? super b, Unit> function12) {
        super(4);
        this.$state = topAuthorWithAnimation;
        this.$lineAnimationProgress = c7980b;
        this.$circleAnimationProgress = c7980b2;
        this.$onView = function1;
        this.$actionHandler = function12;
    }

    @Override // fd.InterfaceC6512o
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC7772p interfaceC7772p, TopAuthorAnimationUIState topAuthorAnimationUIState, InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC7772p, topAuthorAnimationUIState, interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC7772p AnimatedContent, TopAuthorAnimationUIState animationState, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        Intrinsics.checkNotNullParameter(animationState, "animationState");
        if (!Intrinsics.d(animationState, TopAuthorAnimationUIState.Initial.INSTANCE) && !Intrinsics.d(animationState, TopAuthorAnimationUIState.Animating.INSTANCE)) {
            if (!Intrinsics.d(animationState, TopAuthorAnimationUIState.Final.INSTANCE)) {
                throw l.c(interfaceC3967k, 1210583682);
            }
            interfaceC3967k.o(1210601086);
            TopAuthorWidgetStateKt.TopAuthorWidgetState(this.$state.getAuthor(), this.$onView, this.$actionHandler, interfaceC3967k, 0, 0);
            interfaceC3967k.k();
            return;
        }
        interfaceC3967k.o(-1126462937);
        CounterWidgetStateKt.CounterWidgetState(this.$state.getCounter(), this.$onView, this.$actionHandler, this.$lineAnimationProgress.k().floatValue(), this.$circleAnimationProgress.k().floatValue(), interfaceC3967k, 0, 0);
        interfaceC3967k.k();
    }
}
