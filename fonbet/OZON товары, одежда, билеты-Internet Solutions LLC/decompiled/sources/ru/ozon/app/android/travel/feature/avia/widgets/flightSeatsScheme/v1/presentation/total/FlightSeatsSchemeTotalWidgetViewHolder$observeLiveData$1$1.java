package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.total;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import ru.ozon.app.android.travel.feature.avia.shared.orderTotal.OrderTotalVO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
/* synthetic */ class FlightSeatsSchemeTotalWidgetViewHolder$observeLiveData$1$1 extends C7735q implements Function1<OrderTotalVO, Unit> {
    FlightSeatsSchemeTotalWidgetViewHolder$observeLiveData$1$1(Object obj) {
        super(1, obj, FlightSeatsSchemeTotalWidgetViewHolder.class, "updateOrderDetails", "updateOrderDetails(Lru/ozon/app/android/travel/feature/avia/shared/orderTotal/OrderTotalVO;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OrderTotalVO orderTotalVO) {
        invoke2(orderTotalVO);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(OrderTotalVO orderTotalVO) {
        ((FlightSeatsSchemeTotalWidgetViewHolder) this.receiver).updateOrderDetails(orderTotalVO);
    }
}
