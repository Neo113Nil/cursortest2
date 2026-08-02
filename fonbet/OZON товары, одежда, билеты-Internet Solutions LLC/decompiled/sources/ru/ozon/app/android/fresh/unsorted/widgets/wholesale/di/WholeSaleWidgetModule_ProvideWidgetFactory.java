package ru.ozon.app.android.fresh.unsorted.widgets.wholesale.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.unsorted.widgets.wholesale.data.WholeSaleConfig;
import ru.ozon.app.android.fresh.unsorted.widgets.wholesale.presentation.WholeSaleViewMapper;

/* loaded from: classes6.dex */
public final class WholeSaleWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(WholeSaleWidgetModule wholeSaleWidgetModule, WholeSaleConfig wholeSaleConfig, WholeSaleViewMapper wholeSaleViewMapper) {
        Widget2 provideWidget = wholeSaleWidgetModule.provideWidget(wholeSaleConfig, wholeSaleViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
