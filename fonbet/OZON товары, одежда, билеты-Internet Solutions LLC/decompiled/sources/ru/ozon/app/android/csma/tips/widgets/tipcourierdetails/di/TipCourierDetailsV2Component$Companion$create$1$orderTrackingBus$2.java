package ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.payment.domain.createorder.busevents.OrderTrackingBus;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/payment/domain/createorder/busevents/OrderTrackingBus;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class TipCourierDetailsV2Component$Companion$create$1$orderTrackingBus$2 extends AbstractC7737t implements Function0<OrderTrackingBus> {
    public static final TipCourierDetailsV2Component$Companion$create$1$orderTrackingBus$2 INSTANCE = new TipCourierDetailsV2Component$Companion$create$1$orderTrackingBus$2();

    TipCourierDetailsV2Component$Companion$create$1$orderTrackingBus$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final OrderTrackingBus invoke() {
        return new OrderTrackingBus();
    }
}
