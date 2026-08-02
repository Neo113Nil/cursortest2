package ru.ozon.app.android.fresh.unsorted.widgets.islandSeparator.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.unsorted.widgets.islandSeparator.data.IslandSeparatorConfig;
import ru.ozon.app.android.fresh.unsorted.widgets.islandSeparator.presentation.IslandSeparatorViewMapper;

/* loaded from: classes6.dex */
public final class IslandSeparatorWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(IslandSeparatorWidgetModule islandSeparatorWidgetModule, IslandSeparatorConfig islandSeparatorConfig, IslandSeparatorViewMapper islandSeparatorViewMapper) {
        Widget2 provideWidget = islandSeparatorWidgetModule.provideWidget(islandSeparatorConfig, islandSeparatorViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
