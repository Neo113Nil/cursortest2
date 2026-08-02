package ru.ozon.app.android.fresh.unsorted.widgets.separatorBadge.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.unsorted.widgets.separatorBadge.data.SeparatorBadgeConfig;
import ru.ozon.app.android.fresh.unsorted.widgets.separatorBadge.presentation.SeparatorBadgeViewMapper;

/* loaded from: classes6.dex */
public final class SeparatorBadgeWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(SeparatorBadgeWidgetModule separatorBadgeWidgetModule, SeparatorBadgeConfig separatorBadgeConfig, SeparatorBadgeViewMapper separatorBadgeViewMapper) {
        Widget2 provideWidget = separatorBadgeWidgetModule.provideWidget(separatorBadgeConfig, separatorBadgeViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
