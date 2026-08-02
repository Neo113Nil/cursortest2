package ru.ozon.app.android.checkoutorderdone.orderdone.orderdonestatus.v1.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class OrderDonePaymentStatusViewModel$timerManager$1 extends C7735q implements Function1<Long, Unit> {
    OrderDonePaymentStatusViewModel$timerManager$1(Object obj) {
        super(1, obj, OrderDonePaymentStatusViewModel.class, "onTimerTick", "onTimerTick(J)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Long l11) {
        invoke(l11.longValue());
        return Unit.f71690a;
    }

    public final void invoke(long j11) {
        ((OrderDonePaymentStatusViewModel) this.receiver).onTimerTick(j11);
    }
}
