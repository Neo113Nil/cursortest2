package ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.presentation.ui.view.counter;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import n1.C8416i;
import n1.InterfaceC8412e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln1/e;", "", "invoke", "(Ln1/e;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class CirclesCounterViewKt$CirclesCounterView$2$1$1$1$1$1$1 extends AbstractC7737t implements Function1<InterfaceC8412e, Unit> {
    final /* synthetic */ float $borderSize;
    final /* synthetic */ AbstractC7799Q $iconBorderColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CirclesCounterViewKt$CirclesCounterView$2$1$1$1$1$1$1(AbstractC7799Q abstractC7799Q, float f7) {
        super(1);
        this.$iconBorderColor = abstractC7799Q;
        this.$borderSize = f7;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC8412e interfaceC8412e) {
        invoke2(interfaceC8412e);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC8412e Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        InterfaceC8412e.O0(Canvas, this.$iconBorderColor, 0.0f, 0L, new C8416i(Canvas.v1(this.$borderSize), 0.0f, 0, 0, null, 30), 110);
    }
}
