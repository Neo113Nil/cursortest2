package ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.data.DeliveryWidgetV2Config;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.presentation.DeliveryWidgetV2OverlayViewMapper;

/* loaded from: classes6.dex */
public final class DeliveryWidgetV2Module_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(DeliveryWidgetV2Module deliveryWidgetV2Module, DeliveryWidgetV2Config deliveryWidgetV2Config, DeliveryWidgetV2OverlayViewMapper deliveryWidgetV2OverlayViewMapper) {
        Widget2 provideWidget = deliveryWidgetV2Module.provideWidget(deliveryWidgetV2Config, deliveryWidgetV2OverlayViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
