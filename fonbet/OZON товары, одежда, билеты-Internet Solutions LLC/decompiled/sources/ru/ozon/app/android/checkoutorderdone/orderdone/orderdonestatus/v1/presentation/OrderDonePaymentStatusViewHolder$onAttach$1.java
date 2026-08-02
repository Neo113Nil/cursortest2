package ru.ozon.app.android.checkoutorderdone.orderdone.orderdonestatus.v1.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class OrderDonePaymentStatusViewHolder$onAttach$1 extends C7735q implements Function1<TimerState, Unit> {
    OrderDonePaymentStatusViewHolder$onAttach$1(Object obj) {
        super(1, obj, OrderDonePaymentStatusViewHolder.class, "handleTimerState", "handleTimerState(Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonestatus/v1/presentation/TimerState;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TimerState timerState) {
        invoke2(timerState);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(TimerState p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((OrderDonePaymentStatusViewHolder) this.receiver).handleTimerState(p02);
    }
}
