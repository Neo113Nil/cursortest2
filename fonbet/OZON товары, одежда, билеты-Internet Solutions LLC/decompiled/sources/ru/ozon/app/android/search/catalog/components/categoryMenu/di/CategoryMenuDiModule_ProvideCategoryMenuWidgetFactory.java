package ru.ozon.app.android.search.catalog.components.categoryMenu.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.search.catalog.components.categoryMenu.data.CategoryMenuConfig;
import ru.ozon.app.android.search.catalog.components.categoryMenu.presentation.button.CategoryMenuButtonOverlayViewMapper;
import ru.ozon.app.android.search.catalog.components.categoryMenu.presentation.item.CategoryMenuItemViewMapper;

/* loaded from: classes7.dex */
public final class CategoryMenuDiModule_ProvideCategoryMenuWidgetFactory implements e<Widget2> {
    public static Widget2 provideCategoryMenuWidget(CategoryMenuConfig categoryMenuConfig, CategoryMenuItemViewMapper categoryMenuItemViewMapper, CategoryMenuButtonOverlayViewMapper categoryMenuButtonOverlayViewMapper) {
        Widget2 provideCategoryMenuWidget = CategoryMenuDiModule.INSTANCE.provideCategoryMenuWidget(categoryMenuConfig, categoryMenuItemViewMapper, categoryMenuButtonOverlayViewMapper);
        j.d(provideCategoryMenuWidget);
        return provideCategoryMenuWidget;
    }
}
