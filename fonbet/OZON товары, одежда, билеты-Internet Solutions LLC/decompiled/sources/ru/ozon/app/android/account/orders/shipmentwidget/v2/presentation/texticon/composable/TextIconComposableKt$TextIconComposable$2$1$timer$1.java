package ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.texticon.composable;

import S0.InterfaceC3978p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.utils.timer.TimerTick;
import ru.ozon.app.android.utils.timer.TimerUtilsKt;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "left", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class TextIconComposableKt$TextIconComposable$2$1$timer$1 extends AbstractC7737t implements Function1<Long, Unit> {
    final /* synthetic */ InterfaceC3978p0<String> $tick$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextIconComposableKt$TextIconComposable$2$1$timer$1(InterfaceC3978p0<String> interfaceC3978p0) {
        super(1);
        this.$tick$delegate = interfaceC3978p0;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Long l11) {
        invoke(l11.longValue());
        return Unit.f71690a;
    }

    public final void invoke(long j11) {
        TimerTick timerTick = new TimerTick(j11);
        this.$tick$delegate.setValue(TimerUtilsKt.formatTimeByType(timerTick, TimerUtilsKt.getTimerType(timerTick)));
    }
}
