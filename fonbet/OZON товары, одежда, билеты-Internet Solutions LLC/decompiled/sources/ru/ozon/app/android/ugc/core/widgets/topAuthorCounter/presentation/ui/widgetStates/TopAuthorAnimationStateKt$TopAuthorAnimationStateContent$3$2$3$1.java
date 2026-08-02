package ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.presentation.ui.widgetStates;

import S0.InterfaceC3978p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.InterfaceC7825i0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ll1/i0;", "", "invoke", "(Ll1/i0;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class TopAuthorAnimationStateKt$TopAuthorAnimationStateContent$3$2$3$1 extends AbstractC7737t implements Function1<InterfaceC7825i0, Unit> {
    final /* synthetic */ InterfaceC3978p0<Boolean> $playConfetti;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TopAuthorAnimationStateKt$TopAuthorAnimationStateContent$3$2$3$1(InterfaceC3978p0<Boolean> interfaceC3978p0) {
        super(1);
        this.$playConfetti = interfaceC3978p0;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC7825i0 interfaceC7825i0) {
        invoke2(interfaceC7825i0);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC7825i0 graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setAlpha(this.$playConfetti.getValue().booleanValue() ? 1.0f : 0.0f);
    }
}
