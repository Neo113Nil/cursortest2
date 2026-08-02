package ru.ozon.app.android.fresh.unsorted.widgets.homeButton.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.unsorted.widgets.homeButton.data.HomeButtonConfig;
import ru.ozon.app.android.fresh.unsorted.widgets.homeButton.presentation.HomeButtonViewMapper;

/* loaded from: classes6.dex */
public final class HomeButtonWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(HomeButtonWidgetModule homeButtonWidgetModule, HomeButtonConfig homeButtonConfig, HomeButtonViewMapper homeButtonViewMapper) {
        Widget2 provideWidget = homeButtonWidgetModule.provideWidget(homeButtonConfig, homeButtonViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
