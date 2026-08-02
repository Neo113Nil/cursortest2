package ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v1.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v1.data.ProductsInBotConfig;
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v1.presentation.button.BotConfirmButtonViewMapper;
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v1.presentation.items.BotItemViewMapper;

/* loaded from: classes6.dex */
public final class ProductsInBotWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(ProductsInBotWidgetModule productsInBotWidgetModule, ProductsInBotConfig productsInBotConfig, BotItemViewMapper botItemViewMapper, BotConfirmButtonViewMapper botConfirmButtonViewMapper) {
        Widget2 provideWidget = productsInBotWidgetModule.provideWidget(productsInBotConfig, botItemViewMapper, botConfirmButtonViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
