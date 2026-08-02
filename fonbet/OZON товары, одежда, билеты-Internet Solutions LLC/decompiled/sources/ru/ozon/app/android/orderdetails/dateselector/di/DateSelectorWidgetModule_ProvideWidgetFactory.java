package ru.ozon.app.android.orderdetails.dateselector.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.orderdetails.dateselector.data.DateSelectorConfig;
import ru.ozon.app.android.orderdetails.dateselector.presentation.DateSelectorViewMapper;

/* loaded from: classes6.dex */
public final class DateSelectorWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(DateSelectorWidgetModule dateSelectorWidgetModule, DateSelectorConfig dateSelectorConfig, DateSelectorViewMapper dateSelectorViewMapper) {
        Widget2 provideWidget = dateSelectorWidgetModule.provideWidget(dateSelectorConfig, dateSelectorViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
