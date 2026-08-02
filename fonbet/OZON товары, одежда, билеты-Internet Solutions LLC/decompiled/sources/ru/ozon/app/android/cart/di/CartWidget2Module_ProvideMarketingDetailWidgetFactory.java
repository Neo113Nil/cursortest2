package ru.ozon.app.android.cart.di;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.cart.marketingdetail.presentation.MarketingDetailWidgetConfig;
import ru.ozon.app.android.cart.marketingdetail.presentation.MarketingDetailWidgetViewMapper;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

/* loaded from: classes6.dex */
public final class CartWidget2Module_ProvideMarketingDetailWidgetFactory implements e<Set<Widget2>> {
    public static Set<Widget2> provideMarketingDetailWidget(CartWidget2Module cartWidget2Module, MarketingDetailWidgetConfig marketingDetailWidgetConfig, MarketingDetailWidgetViewMapper marketingDetailWidgetViewMapper) {
        Set<Widget2> provideMarketingDetailWidget = cartWidget2Module.provideMarketingDetailWidget(marketingDetailWidgetConfig, marketingDetailWidgetViewMapper);
        j.d(provideMarketingDetailWidget);
        return provideMarketingDetailWidget;
    }
}
