package ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v2.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v2.data.ProductsInBotV2Config;
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v2.presentation.ProductsInBotV2ViewMapper;

/* loaded from: classes6.dex */
public final class ProductsInBotV2WidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(ProductsInBotV2WidgetModule productsInBotV2WidgetModule, ProductsInBotV2Config productsInBotV2Config, ProductsInBotV2ViewMapper productsInBotV2ViewMapper) {
        Widget2 provideWidget = productsInBotV2WidgetModule.provideWidget(productsInBotV2Config, productsInBotV2ViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
