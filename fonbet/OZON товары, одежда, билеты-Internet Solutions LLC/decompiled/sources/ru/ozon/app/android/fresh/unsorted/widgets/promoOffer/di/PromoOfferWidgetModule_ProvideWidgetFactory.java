package ru.ozon.app.android.fresh.unsorted.widgets.promoOffer.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.unsorted.widgets.promoOffer.data.PromoOfferConfig;
import ru.ozon.app.android.fresh.unsorted.widgets.promoOffer.presentation.PromoOfferViewMapper;

/* loaded from: classes6.dex */
public final class PromoOfferWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(PromoOfferWidgetModule promoOfferWidgetModule, PromoOfferConfig promoOfferConfig, PromoOfferViewMapper promoOfferViewMapper) {
        Widget2 provideWidget = promoOfferWidgetModule.provideWidget(promoOfferConfig, promoOfferViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
