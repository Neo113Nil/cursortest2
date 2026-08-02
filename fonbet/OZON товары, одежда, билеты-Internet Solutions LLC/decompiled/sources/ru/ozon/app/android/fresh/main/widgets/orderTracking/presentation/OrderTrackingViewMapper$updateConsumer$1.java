package ru.ozon.app.android.fresh.main.widgets.orderTracking.presentation;

import A00.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LA00/a$J$a;", "update", "Lru/ozon/app/android/fresh/main/widgets/orderTracking/presentation/OrderTrackingVO;", "oldVO", "invoke", "(LA00/a$J$a;Lru/ozon/app/android/fresh/main/widgets/orderTracking/presentation/OrderTrackingVO;)Lru/ozon/app/android/fresh/main/widgets/orderTracking/presentation/OrderTrackingVO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class OrderTrackingViewMapper$updateConsumer$1 extends AbstractC7737t implements Function2<a.J.InterfaceC0007a, OrderTrackingVO, OrderTrackingVO> {
    public static final OrderTrackingViewMapper$updateConsumer$1 INSTANCE = new OrderTrackingViewMapper$updateConsumer$1();

    OrderTrackingViewMapper$updateConsumer$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final OrderTrackingVO invoke(a.J.InterfaceC0007a update, OrderTrackingVO oldVO) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldVO, "oldVO");
        if (!(update instanceof OrderTrackingVO)) {
            return null;
        }
        OrderTrackingVO orderTrackingVO = (OrderTrackingVO) update;
        if (orderTrackingVO.getId() == oldVO.getId()) {
            return OrderTrackingVO.copy$default(oldVO, 0L, orderTrackingVO.getItems(), orderTrackingVO.getWidgetUpdatePeriod(), orderTrackingVO.getTokenizedEvent(), 1, null);
        }
        return null;
    }
}
