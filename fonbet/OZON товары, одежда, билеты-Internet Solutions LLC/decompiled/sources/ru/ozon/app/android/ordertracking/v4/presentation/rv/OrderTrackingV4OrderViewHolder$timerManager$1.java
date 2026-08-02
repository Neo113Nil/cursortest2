package ru.ozon.app.android.ordertracking.v4.presentation.rv;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class OrderTrackingV4OrderViewHolder$timerManager$1 extends C7735q implements Function1<Long, Unit> {
    OrderTrackingV4OrderViewHolder$timerManager$1(Object obj) {
        super(1, obj, OrderTrackingV4OrderViewHolder.class, "onTimerTick", "onTimerTick(J)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Long l11) {
        invoke(l11.longValue());
        return Unit.f71690a;
    }

    public final void invoke(long j11) {
        ((OrderTrackingV4OrderViewHolder) this.receiver).onTimerTick(j11);
    }
}
