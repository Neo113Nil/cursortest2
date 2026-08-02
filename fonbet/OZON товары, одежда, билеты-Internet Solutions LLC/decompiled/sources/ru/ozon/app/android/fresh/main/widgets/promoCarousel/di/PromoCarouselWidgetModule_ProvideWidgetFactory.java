package ru.ozon.app.android.fresh.main.widgets.promoCarousel.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.main.widgets.promoCarousel.data.PromoCarouselConfig;
import ru.ozon.app.android.fresh.main.widgets.promoCarousel.presentation.PromoCarouselViewMapper;

/* loaded from: classes6.dex */
public final class PromoCarouselWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(PromoCarouselWidgetModule promoCarouselWidgetModule, PromoCarouselConfig promoCarouselConfig, PromoCarouselViewMapper promoCarouselViewMapper) {
        Widget2 provideWidget = promoCarouselWidgetModule.provideWidget(promoCarouselConfig, promoCarouselViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
