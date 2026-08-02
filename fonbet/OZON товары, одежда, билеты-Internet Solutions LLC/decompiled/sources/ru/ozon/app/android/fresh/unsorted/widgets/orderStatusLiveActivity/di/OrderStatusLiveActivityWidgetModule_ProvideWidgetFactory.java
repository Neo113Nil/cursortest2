package ru.ozon.app.android.fresh.unsorted.widgets.orderStatusLiveActivity.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.unsorted.widgets.orderStatusLiveActivity.data.OrderStatusLiveActivityConfig;
import ru.ozon.app.android.fresh.unsorted.widgets.orderStatusLiveActivity.presentation.OrderStatusLiveActivityViewMapper;

/* loaded from: classes6.dex */
public final class OrderStatusLiveActivityWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(OrderStatusLiveActivityWidgetModule orderStatusLiveActivityWidgetModule, OrderStatusLiveActivityConfig orderStatusLiveActivityConfig, OrderStatusLiveActivityViewMapper orderStatusLiveActivityViewMapper) {
        Widget2 provideWidget = orderStatusLiveActivityWidgetModule.provideWidget(orderStatusLiveActivityConfig, orderStatusLiveActivityViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
