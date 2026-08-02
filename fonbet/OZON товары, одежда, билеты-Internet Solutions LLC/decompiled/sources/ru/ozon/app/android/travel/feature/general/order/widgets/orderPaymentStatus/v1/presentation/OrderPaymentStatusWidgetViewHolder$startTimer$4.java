package ru.ozon.app.android.travel.feature.general.order.widgets.orderPaymentStatus.v1.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
/* synthetic */ class OrderPaymentStatusWidgetViewHolder$startTimer$4 extends C7735q implements Function1<Long, Unit> {
    OrderPaymentStatusWidgetViewHolder$startTimer$4(Object obj) {
        super(1, obj, OrderPaymentStatusWidgetViewHolder.class, "updateTimer", "updateTimer(J)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Long l11) {
        invoke(l11.longValue());
        return Unit.f71690a;
    }

    public final void invoke(long j11) {
        ((OrderPaymentStatusWidgetViewHolder) this.receiver).updateTimer(j11);
    }
}
