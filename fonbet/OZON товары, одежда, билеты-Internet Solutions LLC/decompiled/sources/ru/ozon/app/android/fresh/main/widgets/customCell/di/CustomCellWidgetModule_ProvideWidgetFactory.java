package ru.ozon.app.android.fresh.main.widgets.customCell.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.main.widgets.customCell.data.CustomCellConfig;
import ru.ozon.app.android.fresh.main.widgets.customCell.presentation.CustomCellViewMapper;

/* loaded from: classes6.dex */
public final class CustomCellWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(CustomCellWidgetModule customCellWidgetModule, CustomCellConfig customCellConfig, CustomCellViewMapper customCellViewMapper) {
        Widget2 provideWidget = customCellWidgetModule.provideWidget(customCellConfig, customCellViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
