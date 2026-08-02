package ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.presentation.ui.widgetStates;

import B0.C2454a;
import B1.V;
import D1.InterfaceC2801g;
import Nk.a;
import S0.A0;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.Q;
import Tg.b;
import WZ.t;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5187j;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import e1.InterfaceC6250b;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l0.C7770n;
import m0.C7980b;
import m0.C8008p;
import m3.C8060b;
import ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.presentation.TopAuthorAnimationStateViewModel;
import ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.presentation.TopAuthorAnimationUIState;
import ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.presentation.TopAuthorWidgetViewState;
import ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.presentation.ui.view.animation.ConfettiLottieKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import u0.InterfaceC9894c;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lu0/c;", "", "invoke", "(Lu0/c;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class TopAuthorAnimationStateKt$TopAuthorAnimationStateContent$3 extends AbstractC7737t implements InterfaceC6511n<InterfaceC9894c, InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ Function1<b, Unit> $actionHandler;
    final /* synthetic */ C7980b<Float, C8008p> $circleAnimationProgress;
    final /* synthetic */ boolean $isResumed;
    final /* synthetic */ C7980b<Float, C8008p> $lineAnimationProgress;
    final /* synthetic */ Function0<Unit> $onConfettiFinished;
    final /* synthetic */ Function1<t, Unit> $onView;
    final /* synthetic */ InterfaceC3978p0<Boolean> $playConfetti;
    final /* synthetic */ TopAuthorWidgetViewState.TopAuthorWithAnimation $state;
    final /* synthetic */ TopAuthorAnimationStateViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TopAuthorAnimationStateKt$TopAuthorAnimationStateContent$3(boolean z11, TopAuthorAnimationStateViewModel topAuthorAnimationStateViewModel, C7980b<Float, C8008p> c7980b, C7980b<Float, C8008p> c7980b2, InterfaceC3978p0<Boolean> interfaceC3978p0, Function0<Unit> function0, TopAuthorWidgetViewState.TopAuthorWithAnimation topAuthorWithAnimation, Function1<? super t, Unit> function1, Function1<? super b, Unit> function12) {
        super(3);
        this.$isResumed = z11;
        this.$viewModel = topAuthorAnimationStateViewModel;
        this.$lineAnimationProgress = c7980b;
        this.$circleAnimationProgress = c7980b2;
        this.$playConfetti = interfaceC3978p0;
        this.$onConfettiFinished = function0;
        this.$state = topAuthorWithAnimation;
        this.$onView = function1;
        this.$actionHandler = function12;
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC9894c interfaceC9894c, InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC9894c, interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC9894c BoxWithConstraints, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i11 & 6) == 0) {
            i12 = i11 | (interfaceC3967k.n(BoxWithConstraints) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if ((i12 & 19) == 18 && interfaceC3967k.b()) {
            interfaceC3967k.j();
            return;
        }
        int px = UiExtKt.toPx(Z1.b.k(BoxWithConstraints.c()));
        Boolean valueOf = Boolean.valueOf(this.$isResumed);
        interfaceC3967k.o(-1427365402);
        boolean p11 = interfaceC3967k.p(this.$isResumed) | interfaceC3967k.n(this.$viewModel) | interfaceC3967k.F(this.$lineAnimationProgress) | interfaceC3967k.F(this.$circleAnimationProgress);
        boolean z11 = this.$isResumed;
        TopAuthorAnimationStateViewModel topAuthorAnimationStateViewModel = this.$viewModel;
        C7980b<Float, C8008p> c7980b = this.$lineAnimationProgress;
        C7980b<Float, C8008p> c7980b2 = this.$circleAnimationProgress;
        InterfaceC3978p0<Boolean> interfaceC3978p0 = this.$playConfetti;
        Object C11 = interfaceC3967k.C();
        if (p11 || C11 == InterfaceC3967k.a.a()) {
            Object topAuthorAnimationStateKt$TopAuthorAnimationStateContent$3$1$1 = new TopAuthorAnimationStateKt$TopAuthorAnimationStateContent$3$1$1(z11, topAuthorAnimationStateViewModel, c7980b, c7980b2, interfaceC3978p0, null);
            interfaceC3967k.x(topAuthorAnimationStateKt$TopAuthorAnimationStateContent$3$1$1);
            C11 = topAuthorAnimationStateKt$TopAuthorAnimationStateContent$3$1$1;
        }
        interfaceC3967k.k();
        Q.e(interfaceC3967k, valueOf, (Function2) C11);
        TopAuthorAnimationStateViewModel topAuthorAnimationStateViewModel2 = this.$viewModel;
        InterfaceC3978p0<Boolean> interfaceC3978p02 = this.$playConfetti;
        Function0<Unit> function0 = this.$onConfettiFinished;
        TopAuthorWidgetViewState.TopAuthorWithAnimation topAuthorWithAnimation = this.$state;
        C7980b<Float, C8008p> c7980b3 = this.$lineAnimationProgress;
        C7980b<Float, C8008p> c7980b4 = this.$circleAnimationProgress;
        Function1<t, Unit> function1 = this.$onView;
        Function1<b, Unit> function12 = this.$actionHandler;
        e.a aVar = e.f40358c0;
        V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
        int I11 = interfaceC3967k.I();
        A0 d11 = interfaceC3967k.d();
        e f11 = c.f(interfaceC3967k, aVar);
        InterfaceC2801g.f5440U.getClass();
        Function0 a11 = InterfaceC2801g.a.a();
        if (interfaceC3967k.v() == null) {
            C8060b.c();
            throw null;
        }
        interfaceC3967k.i();
        if (interfaceC3967k.t()) {
            interfaceC3967k.H(a11);
        } else {
            interfaceC3967k.e();
        }
        Function2 d12 = C2454a.d(interfaceC3967k, f7, interfaceC3967k, d11);
        if (interfaceC3967k.t() || !Intrinsics.d(interfaceC3967k.C(), Integer.valueOf(I11))) {
            a.d(d12, I11, interfaceC3967k, I11);
        }
        F1.b(interfaceC3967k, f11, InterfaceC2801g.a.f());
        C5187j c5187j = C5187j.f39515a;
        TopAuthorAnimationUIState animationState = topAuthorAnimationStateViewModel2.getAnimationState();
        interfaceC3967k.o(1622767204);
        Object C12 = interfaceC3967k.C();
        if (C12 == InterfaceC3967k.a.a()) {
            C12 = TopAuthorAnimationStateKt$TopAuthorAnimationStateContent$3$2$1$1.INSTANCE;
            interfaceC3967k.x(C12);
        }
        interfaceC3967k.k();
        C7770n.a(animationState, null, (Function1) C12, null, null, null, a1.c.c(341392962, new TopAuthorAnimationStateKt$TopAuthorAnimationStateContent$3$2$2(topAuthorWithAnimation, c7980b3, c7980b4, function1, function12), interfaceC3967k), interfaceC3967k, 1573248, 58);
        e a12 = c5187j.a(a0.f(a0.r(aVar, px), 100), InterfaceC6250b.a.b());
        interfaceC3967k.o(1622818048);
        Object C13 = interfaceC3967k.C();
        if (C13 == InterfaceC3967k.a.a()) {
            C13 = new TopAuthorAnimationStateKt$TopAuthorAnimationStateContent$3$2$3$1(interfaceC3978p02);
            interfaceC3967k.x(C13);
        }
        interfaceC3967k.k();
        e a13 = androidx.compose.ui.graphics.a.a(a12, (Function1) C13);
        boolean booleanValue = interfaceC3978p02.getValue().booleanValue();
        interfaceC3967k.o(1622823529);
        boolean n11 = interfaceC3967k.n(function0);
        Object C14 = interfaceC3967k.C();
        if (n11 || C14 == InterfaceC3967k.a.a()) {
            C14 = new TopAuthorAnimationStateKt$TopAuthorAnimationStateContent$3$2$4$1(function0);
            interfaceC3967k.x(C14);
        }
        interfaceC3967k.k();
        ConfettiLottieKt.LottieConfetti(a13, booleanValue, (Function0) C14, interfaceC3967k, 0, 0);
        interfaceC3967k.f();
    }
}
