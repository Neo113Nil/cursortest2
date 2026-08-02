package ru.ozon.app.android.fresh.unsorted.widgets.flexButtons.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.unsorted.widgets.flexButtons.data.FlexButtonsConfig;
import ru.ozon.app.android.fresh.unsorted.widgets.flexButtons.presentation.FlexButtonsViewMapper;

/* loaded from: classes6.dex */
public final class FlexButtonsWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(FlexButtonsConfig flexButtonsConfig, FlexButtonsViewMapper flexButtonsViewMapper) {
        Widget2 provideWidget = FlexButtonsWidgetModule.INSTANCE.provideWidget(flexButtonsConfig, flexButtonsViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
