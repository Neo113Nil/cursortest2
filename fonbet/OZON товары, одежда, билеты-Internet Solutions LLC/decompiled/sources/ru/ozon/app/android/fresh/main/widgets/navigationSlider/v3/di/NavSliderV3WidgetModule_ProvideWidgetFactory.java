package ru.ozon.app.android.fresh.main.widgets.navigationSlider.v3.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.main.widgets.navigationSlider.v3.data.NavigationSliderV3Config;
import ru.ozon.app.android.fresh.main.widgets.navigationSlider.v3.presentation.header.NavigationSliderV3HeaderViewMapper;
import ru.ozon.app.android.fresh.main.widgets.navigationSlider.v3.presentation.row.NavigationSliderV3RowViewMapper;
import ru.ozon.app.android.fresh.main.widgets.navigationSlider.v3.presentation.separator.NavigationSliderV3SeparatorViewMapper;

/* loaded from: classes6.dex */
public final class NavSliderV3WidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(NavSliderV3WidgetModule navSliderV3WidgetModule, NavigationSliderV3Config navigationSliderV3Config, NavigationSliderV3HeaderViewMapper navigationSliderV3HeaderViewMapper, NavigationSliderV3RowViewMapper navigationSliderV3RowViewMapper, NavigationSliderV3SeparatorViewMapper navigationSliderV3SeparatorViewMapper) {
        Widget2 provideWidget = navSliderV3WidgetModule.provideWidget(navigationSliderV3Config, navigationSliderV3HeaderViewMapper, navigationSliderV3RowViewMapper, navigationSliderV3SeparatorViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
