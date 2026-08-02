package ru.ozon.app.android.fresh.main.widgets.orderTracking.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.main.widgets.orderTracking.data.OrderTrackingConfig;
import ru.ozon.app.android.fresh.main.widgets.orderTracking.presentation.OrderTrackingViewMapper;

/* loaded from: classes6.dex */
public final class OrderTrackingWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(OrderTrackingWidgetModule orderTrackingWidgetModule, OrderTrackingConfig orderTrackingConfig, OrderTrackingViewMapper orderTrackingViewMapper) {
        Widget2 provideWidget = orderTrackingWidgetModule.provideWidget(orderTrackingConfig, orderTrackingViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
