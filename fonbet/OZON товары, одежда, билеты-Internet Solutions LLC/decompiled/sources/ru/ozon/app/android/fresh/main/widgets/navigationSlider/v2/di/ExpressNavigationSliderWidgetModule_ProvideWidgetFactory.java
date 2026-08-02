package ru.ozon.app.android.fresh.main.widgets.navigationSlider.v2.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.main.widgets.navigationSlider.v2.data.ExpressNavigationSliderV2Config;
import ru.ozon.app.android.fresh.main.widgets.navigationSlider.v2.presentation.header.ExpressNavigationSliderV2HeaderViewMapper;
import ru.ozon.app.android.fresh.main.widgets.navigationSlider.v2.presentation.items.ExpressNavigationSliderV2ItemsViewMapper;
import ru.ozon.app.android.fresh.main.widgets.navigationSlider.v2.presentation.separator.ExpressNavigationSliderV2SeparatorViewMapper;

/* loaded from: classes6.dex */
public final class ExpressNavigationSliderWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(ExpressNavigationSliderWidgetModule expressNavigationSliderWidgetModule, ExpressNavigationSliderV2Config expressNavigationSliderV2Config, ExpressNavigationSliderV2HeaderViewMapper expressNavigationSliderV2HeaderViewMapper, ExpressNavigationSliderV2SeparatorViewMapper expressNavigationSliderV2SeparatorViewMapper, ExpressNavigationSliderV2ItemsViewMapper expressNavigationSliderV2ItemsViewMapper) {
        Widget2 provideWidget = expressNavigationSliderWidgetModule.provideWidget(expressNavigationSliderV2Config, expressNavigationSliderV2HeaderViewMapper, expressNavigationSliderV2SeparatorViewMapper, expressNavigationSliderV2ItemsViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
