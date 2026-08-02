package ru.ozon.app.android.csma.tips.widgets.tipcourierreview.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.csma.tips.widgets.tipcourierreview.data.TipCourierReviewV2Config;
import ru.ozon.app.android.csma.tips.widgets.tipcourierreview.presentation.button.TipCourierReviewOverlayViewMapper;
import ru.ozon.app.android.csma.tips.widgets.tipcourierreview.presentation.tips.TipCourierReviewViewMapper;

/* loaded from: classes6.dex */
public final class TipCourierReviewV2WidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(TipCourierReviewV2WidgetModule tipCourierReviewV2WidgetModule, TipCourierReviewV2Config tipCourierReviewV2Config, TipCourierReviewViewMapper tipCourierReviewViewMapper, TipCourierReviewOverlayViewMapper tipCourierReviewOverlayViewMapper) {
        Widget2 provideWidget = tipCourierReviewV2WidgetModule.provideWidget(tipCourierReviewV2Config, tipCourierReviewViewMapper, tipCourierReviewOverlayViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
