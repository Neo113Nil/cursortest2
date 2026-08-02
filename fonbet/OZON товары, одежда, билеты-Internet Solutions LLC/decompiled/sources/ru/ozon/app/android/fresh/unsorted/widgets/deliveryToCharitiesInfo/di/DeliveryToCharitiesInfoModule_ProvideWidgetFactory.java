package ru.ozon.app.android.fresh.unsorted.widgets.deliveryToCharitiesInfo.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryToCharitiesInfo.data.DeliveryToCharitiesInfoConfig;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryToCharitiesInfo.presentation.DeliveryToCharitiesInfoViewMapper;

/* loaded from: classes6.dex */
public final class DeliveryToCharitiesInfoModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(DeliveryToCharitiesInfoModule deliveryToCharitiesInfoModule, DeliveryToCharitiesInfoConfig deliveryToCharitiesInfoConfig, DeliveryToCharitiesInfoViewMapper deliveryToCharitiesInfoViewMapper) {
        Widget2 provideWidget = deliveryToCharitiesInfoModule.provideWidget(deliveryToCharitiesInfoConfig, deliveryToCharitiesInfoViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
