package ru.ozon.app.android.orderdetails.orderactions.v1.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.orderdetails.orderactions.v1.data.OrderActionsConfig;
import ru.ozon.app.android.orderdetails.orderactions.v1.presentation.OrderActionsViewMapper;

/* loaded from: classes6.dex */
public final class OrderActionsModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(OrderActionsModule orderActionsModule, OrderActionsConfig orderActionsConfig, OrderActionsViewMapper orderActionsViewMapper) {
        Widget2 provideWidget = orderActionsModule.provideWidget(orderActionsConfig, orderActionsViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
