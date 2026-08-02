package ru.ozon.app.android.csma.tips.widgets.tipcourierheader.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.csma.tips.widgets.tipcourierheader.data.TipCourierHeaderConfig;
import ru.ozon.app.android.csma.tips.widgets.tipcourierheader.presentation.overlay.TipCourierHeaderOverlayViewMapper;
import ru.ozon.app.android.csma.tips.widgets.tipcourierheader.presentation.simple.TipCourierHeaderViewMapper;

/* loaded from: classes6.dex */
public final class TipCourierHeaderWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(TipCourierHeaderWidgetModule tipCourierHeaderWidgetModule, TipCourierHeaderConfig tipCourierHeaderConfig, TipCourierHeaderViewMapper tipCourierHeaderViewMapper, TipCourierHeaderOverlayViewMapper tipCourierHeaderOverlayViewMapper) {
        Widget2 provideWidget = tipCourierHeaderWidgetModule.provideWidget(tipCourierHeaderConfig, tipCourierHeaderViewMapper, tipCourierHeaderOverlayViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
