package ru.ozon.app.android.orderdetails.orderTotal.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.orderdetails.orderTotal.core.OrderTotalConfig;
import ru.ozon.app.android.orderdetails.orderTotal.core.OrderTotalStickyViewMapper;
import ru.ozon.app.android.orderdetails.orderTotal.core.OrderTotalSummaryViewMapper;

/* loaded from: classes6.dex */
public final class OrderTotalModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(OrderTotalModule orderTotalModule, OrderTotalConfig orderTotalConfig, OrderTotalSummaryViewMapper orderTotalSummaryViewMapper, OrderTotalStickyViewMapper orderTotalStickyViewMapper) {
        Widget2 provideWidget = orderTotalModule.provideWidget(orderTotalConfig, orderTotalSummaryViewMapper, orderTotalStickyViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
