package ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.data.TipCourierDetailsConfig;
import ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.presentation.button.TipCourierDetailButtonViewMapper;
import ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.presentation.tips.TipCourierDetailsTipsViewMapper;

/* loaded from: classes6.dex */
public final class TipCourierDetailsV2Module_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(TipCourierDetailsV2Module tipCourierDetailsV2Module, TipCourierDetailsConfig tipCourierDetailsConfig, TipCourierDetailButtonViewMapper tipCourierDetailButtonViewMapper, TipCourierDetailsTipsViewMapper tipCourierDetailsTipsViewMapper) {
        Widget2 provideWidget = tipCourierDetailsV2Module.provideWidget(tipCourierDetailsConfig, tipCourierDetailButtonViewMapper, tipCourierDetailsTipsViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
