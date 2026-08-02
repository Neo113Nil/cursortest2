package ru.ozon.app.android.fresh.unsorted.widgets.iconButtons.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.unsorted.widgets.iconButtons.data.IconButtonsConfig;
import ru.ozon.app.android.fresh.unsorted.widgets.iconButtons.presentation.IconButtonsViewMapper;

/* loaded from: classes6.dex */
public final class IconButtonsWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(IconButtonsWidgetModule iconButtonsWidgetModule, IconButtonsConfig iconButtonsConfig, IconButtonsViewMapper iconButtonsViewMapper) {
        Widget2 provideWidget = iconButtonsWidgetModule.provideWidget(iconButtonsConfig, iconButtonsViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
