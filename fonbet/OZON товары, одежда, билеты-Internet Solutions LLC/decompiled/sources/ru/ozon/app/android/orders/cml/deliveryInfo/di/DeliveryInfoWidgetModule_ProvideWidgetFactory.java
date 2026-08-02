package ru.ozon.app.android.orders.cml.deliveryInfo.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.orders.cml.deliveryInfo.core.DeliveryInfoConfig;
import ru.ozon.app.android.orders.cml.deliveryInfo.presentation.viewMapper.DeliveryInfoViewMapper;

/* loaded from: classes6.dex */
public final class DeliveryInfoWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(DeliveryInfoWidgetModule deliveryInfoWidgetModule, DeliveryInfoConfig deliveryInfoConfig, DeliveryInfoViewMapper deliveryInfoViewMapper) {
        Widget2 provideWidget = deliveryInfoWidgetModule.provideWidget(deliveryInfoConfig, deliveryInfoViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
