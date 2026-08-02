package ru.ozon.app.android.fresh.unsorted.widgets.brandzoneCarousel.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.unsorted.widgets.brandzoneCarousel.data.BrandzoneCarouselConfig;
import ru.ozon.app.android.fresh.unsorted.widgets.brandzoneCarousel.presentation.BrandzoneCarouselViewMapper;

/* loaded from: classes6.dex */
public final class BrandzoneCarouselWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(BrandzoneCarouselWidgetModule brandzoneCarouselWidgetModule, BrandzoneCarouselConfig brandzoneCarouselConfig, BrandzoneCarouselViewMapper brandzoneCarouselViewMapper) {
        Widget2 provideWidget = brandzoneCarouselWidgetModule.provideWidget(brandzoneCarouselConfig, brandzoneCarouselViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
