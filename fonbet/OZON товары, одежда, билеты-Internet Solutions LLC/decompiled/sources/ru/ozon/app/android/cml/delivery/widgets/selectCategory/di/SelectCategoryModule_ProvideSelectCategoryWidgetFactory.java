package ru.ozon.app.android.cml.delivery.widgets.selectCategory.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.cml.delivery.widgets.selectCategory.data.SelectCategoryConfig;
import ru.ozon.app.android.cml.delivery.widgets.selectCategory.presentation.SelectCategoryViewMapper;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

/* loaded from: classes6.dex */
public final class SelectCategoryModule_ProvideSelectCategoryWidgetFactory implements e<Widget2> {
    public static Widget2 provideSelectCategoryWidget(SelectCategoryConfig selectCategoryConfig, SelectCategoryViewMapper selectCategoryViewMapper) {
        Widget2 provideSelectCategoryWidget = SelectCategoryModule.INSTANCE.provideSelectCategoryWidget(selectCategoryConfig, selectCategoryViewMapper);
        j.d(provideSelectCategoryWidget);
        return provideSelectCategoryWidget;
    }
}
