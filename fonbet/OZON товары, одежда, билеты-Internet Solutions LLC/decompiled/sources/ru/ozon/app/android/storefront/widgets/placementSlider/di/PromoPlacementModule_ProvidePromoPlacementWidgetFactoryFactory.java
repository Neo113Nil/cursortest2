package ru.ozon.app.android.storefront.widgets.placementSlider.di;

import Jb.e;
import Jb.j;
import java.util.Set;
import n20.i;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;

/* loaded from: classes7.dex */
public final class PromoPlacementModule_ProvidePromoPlacementWidgetFactoryFactory implements e<Set<i>> {
    public static Set<i> providePromoPlacementWidgetFactory(PromoPlacementModule promoPlacementModule, JsonParser jsonParser) {
        Set<i> providePromoPlacementWidgetFactory = promoPlacementModule.providePromoPlacementWidgetFactory(jsonParser);
        j.d(providePromoPlacementWidgetFactory);
        return providePromoPlacementWidgetFactory;
    }
}
