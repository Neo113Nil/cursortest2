package ru.ozon.app.android.orders.cml.deliveryOrderList.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.orders.cml.deliveryOrderList.core.DeliveryOrderListConfig;
import ru.ozon.app.android.orders.cml.deliveryOrderList.presentation.viewMapper.DeliveryOrderViewMapper;

/* loaded from: classes6.dex */
public final class DeliveryOrderListWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(DeliveryOrderListWidgetModule deliveryOrderListWidgetModule, DeliveryOrderListConfig deliveryOrderListConfig, DeliveryOrderViewMapper deliveryOrderViewMapper) {
        Widget2 provideWidget = deliveryOrderListWidgetModule.provideWidget(deliveryOrderListConfig, deliveryOrderViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
