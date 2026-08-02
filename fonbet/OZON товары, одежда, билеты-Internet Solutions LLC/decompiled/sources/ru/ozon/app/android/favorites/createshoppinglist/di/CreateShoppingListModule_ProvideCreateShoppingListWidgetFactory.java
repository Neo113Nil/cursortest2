package ru.ozon.app.android.favorites.createshoppinglist.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.favorites.createshoppinglist.data.CreateShoppingListConfig;
import ru.ozon.app.android.favorites.createshoppinglist.presentation.CreateShoppingListSaveButtonViewMapper;
import ru.ozon.app.android.favorites.createshoppinglist.presentation.CreateShoppingListSuggestItemViewMapper;
import ru.ozon.app.android.favorites.createshoppinglist.presentation.CreateShoppingListSuggestTitleViewMapper;
import ru.ozon.app.android.favorites.createshoppinglist.presentation.CreateShoppingListTitleViewMapper;
import ru.ozon.app.android.favorites.createshoppinglist.presentation.spacer.CreateShoppingListSpacerViewMapper;

/* loaded from: classes6.dex */
public final class CreateShoppingListModule_ProvideCreateShoppingListWidgetFactory implements e<Widget2> {
    public static Widget2 provideCreateShoppingListWidget(CreateShoppingListConfig createShoppingListConfig, CreateShoppingListTitleViewMapper createShoppingListTitleViewMapper, CreateShoppingListSuggestTitleViewMapper createShoppingListSuggestTitleViewMapper, CreateShoppingListSuggestItemViewMapper createShoppingListSuggestItemViewMapper, CreateShoppingListSpacerViewMapper createShoppingListSpacerViewMapper, CreateShoppingListSaveButtonViewMapper createShoppingListSaveButtonViewMapper) {
        Widget2 provideCreateShoppingListWidget = CreateShoppingListModule.provideCreateShoppingListWidget(createShoppingListConfig, createShoppingListTitleViewMapper, createShoppingListSuggestTitleViewMapper, createShoppingListSuggestItemViewMapper, createShoppingListSpacerViewMapper, createShoppingListSaveButtonViewMapper);
        j.d(provideCreateShoppingListWidget);
        return provideCreateShoppingListWidget;
    }
}
