package ru.ozon.app.android.search.catalog.components.categorylogos.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.search.catalog.components.categorylogos.core.CategoryLogosViewMapper;
import ru.ozon.app.android.search.catalog.components.categorylogos.core.CategoryLogosWidgetConfig;

/* loaded from: classes7.dex */
public final class CategoryLogosDiModule_ProvideCategoryLogosWidgetFactory implements e<Widget2> {
    public static Widget2 provideCategoryLogosWidget(CategoryLogosWidgetConfig categoryLogosWidgetConfig, CategoryLogosViewMapper categoryLogosViewMapper) {
        Widget2 provideCategoryLogosWidget = CategoryLogosDiModule.INSTANCE.provideCategoryLogosWidget(categoryLogosWidgetConfig, categoryLogosViewMapper);
        j.d(provideCategoryLogosWidget);
        return provideCategoryLogosWidget;
    }
}
