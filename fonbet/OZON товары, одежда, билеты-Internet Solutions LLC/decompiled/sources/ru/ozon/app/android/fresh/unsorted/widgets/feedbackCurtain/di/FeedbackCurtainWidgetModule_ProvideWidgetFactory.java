package ru.ozon.app.android.fresh.unsorted.widgets.feedbackCurtain.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.unsorted.widgets.feedbackCurtain.data.FeedbackCurtainConfig;
import ru.ozon.app.android.fresh.unsorted.widgets.feedbackCurtain.presentation.FeedbackCurtainViewMapper;

/* loaded from: classes6.dex */
public final class FeedbackCurtainWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(FeedbackCurtainWidgetModule feedbackCurtainWidgetModule, FeedbackCurtainConfig feedbackCurtainConfig, FeedbackCurtainViewMapper feedbackCurtainViewMapper) {
        Widget2 provideWidget = feedbackCurtainWidgetModule.provideWidget(feedbackCurtainConfig, feedbackCurtainViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
