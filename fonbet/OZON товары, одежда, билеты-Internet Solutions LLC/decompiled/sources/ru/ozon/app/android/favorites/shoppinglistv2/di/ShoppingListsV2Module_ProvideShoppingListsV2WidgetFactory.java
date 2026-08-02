package ru.ozon.app.android.favorites.shoppinglistv2.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.favorites.shoppinglistv2.data.ShoppingListsV2Config;
import ru.ozon.app.android.favorites.shoppinglistv2.presentation.createlist.ShoppingListsV2CreateListViewMapper;
import ru.ozon.app.android.favorites.shoppinglistv2.presentation.item.ShoppingListsV2ItemViewMapper;
import ru.ozon.app.android.favorites.shoppinglistv2.presentation.title.ShoppingListsV2TitleViewMapper;

/* loaded from: classes6.dex */
public final class ShoppingListsV2Module_ProvideShoppingListsV2WidgetFactory implements e<Widget2> {
    public static Widget2 provideShoppingListsV2Widget(ShoppingListsV2Config shoppingListsV2Config, ShoppingListsV2CreateListViewMapper shoppingListsV2CreateListViewMapper, ShoppingListsV2ItemViewMapper shoppingListsV2ItemViewMapper, ShoppingListsV2TitleViewMapper shoppingListsV2TitleViewMapper) {
        Widget2 provideShoppingListsV2Widget = ShoppingListsV2Module.provideShoppingListsV2Widget(shoppingListsV2Config, shoppingListsV2CreateListViewMapper, shoppingListsV2ItemViewMapper, shoppingListsV2TitleViewMapper);
        j.d(provideShoppingListsV2Widget);
        return provideShoppingListsV2Widget;
    }
}
