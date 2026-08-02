package ru.ozon.app.android.cart.totalV3.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.cart.totalV3.core.TotalConfig;
import ru.ozon.app.android.cart.totalV3.presentation.TotalViewMapper;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

/* loaded from: classes6.dex */
public final class TotalV3WidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(TotalV3WidgetModule totalV3WidgetModule, TotalConfig totalConfig, TotalViewMapper totalViewMapper) {
        Widget2 provideWidget = totalV3WidgetModule.provideWidget(totalConfig, totalViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
