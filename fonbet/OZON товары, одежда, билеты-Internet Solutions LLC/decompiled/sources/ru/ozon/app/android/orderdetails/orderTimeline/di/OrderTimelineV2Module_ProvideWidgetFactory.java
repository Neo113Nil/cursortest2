package ru.ozon.app.android.orderdetails.orderTimeline.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.orderdetails.orderTimeline.data.OrderTimelineConfig;
import ru.ozon.app.android.orderdetails.orderTimeline.presentation.OrderTimelineViewMapper;

/* loaded from: classes6.dex */
public final class OrderTimelineV2Module_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(OrderTimelineV2Module orderTimelineV2Module, OrderTimelineConfig orderTimelineConfig, OrderTimelineViewMapper orderTimelineViewMapper) {
        Widget2 provideWidget = orderTimelineV2Module.provideWidget(orderTimelineConfig, orderTimelineViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
