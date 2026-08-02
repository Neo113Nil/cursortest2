package ru.ozon.app.android.fresh.unsorted.widgets.infoDropDown.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.unsorted.widgets.infoDropDown.data.InfoDropDownConfig;
import ru.ozon.app.android.fresh.unsorted.widgets.infoDropDown.presentation.InfoDropDownItemViewMapper;

/* loaded from: classes6.dex */
public final class InfoDropDownWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(InfoDropDownWidgetModule infoDropDownWidgetModule, InfoDropDownConfig infoDropDownConfig, InfoDropDownItemViewMapper infoDropDownItemViewMapper) {
        Widget2 provideWidget = infoDropDownWidgetModule.provideWidget(infoDropDownConfig, infoDropDownItemViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
