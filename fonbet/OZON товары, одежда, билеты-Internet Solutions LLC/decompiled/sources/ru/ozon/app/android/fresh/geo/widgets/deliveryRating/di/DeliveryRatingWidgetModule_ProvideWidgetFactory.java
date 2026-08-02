package ru.ozon.app.android.fresh.geo.widgets.deliveryRating.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.geo.widgets.deliveryRating.data.DeliveryRatingConfig;
import ru.ozon.app.android.fresh.geo.widgets.deliveryRating.presentation.DeliveryRatingNewDesignViewMapper;
import ru.ozon.app.android.fresh.geo.widgets.deliveryRating.presentation.DeliveryRatingViewMapper;

/* loaded from: classes6.dex */
public final class DeliveryRatingWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(DeliveryRatingWidgetModule deliveryRatingWidgetModule, DeliveryRatingConfig deliveryRatingConfig, DeliveryRatingViewMapper deliveryRatingViewMapper, DeliveryRatingNewDesignViewMapper deliveryRatingNewDesignViewMapper) {
        Widget2 provideWidget = deliveryRatingWidgetModule.provideWidget(deliveryRatingConfig, deliveryRatingViewMapper, deliveryRatingNewDesignViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
