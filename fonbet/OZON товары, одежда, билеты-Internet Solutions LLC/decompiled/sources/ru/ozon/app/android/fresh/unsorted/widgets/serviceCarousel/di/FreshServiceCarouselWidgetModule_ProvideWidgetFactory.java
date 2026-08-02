package ru.ozon.app.android.fresh.unsorted.widgets.serviceCarousel.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.common.serviceCarousel.core.ServiceCarouselViewMapper;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.unsorted.widgets.serviceCarousel.data.FreshServiceCarouselConfig;

/* loaded from: classes6.dex */
public final class FreshServiceCarouselWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(FreshServiceCarouselWidgetModule freshServiceCarouselWidgetModule, FreshServiceCarouselConfig freshServiceCarouselConfig, ServiceCarouselViewMapper serviceCarouselViewMapper) {
        Widget2 provideWidget = freshServiceCarouselWidgetModule.provideWidget(freshServiceCarouselConfig, serviceCarouselViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
