package ru.ozon.app.android.orderdetails.timeLeft.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class TimeLeftWidgetViewHolder$timerManager$1 extends C7735q implements Function1<Long, Unit> {
    TimeLeftWidgetViewHolder$timerManager$1(Object obj) {
        super(1, obj, TimeLeftWidgetViewHolder.class, "onTimerTick", "onTimerTick(J)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Long l11) {
        invoke(l11.longValue());
        return Unit.f71690a;
    }

    public final void invoke(long j11) {
        ((TimeLeftWidgetViewHolder) this.receiver).onTimerTick(j11);
    }
}
