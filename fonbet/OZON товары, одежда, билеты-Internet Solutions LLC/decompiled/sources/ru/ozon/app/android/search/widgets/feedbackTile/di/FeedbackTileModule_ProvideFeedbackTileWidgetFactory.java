package ru.ozon.app.android.search.widgets.feedbackTile.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.search.widgets.feedbackTile.data.FeedbackTileConfig;
import ru.ozon.app.android.search.widgets.feedbackTile.presentation.FeedbackTileViewMapper;

/* loaded from: classes7.dex */
public final class FeedbackTileModule_ProvideFeedbackTileWidgetFactory implements e<Widget2> {
    public static Widget2 provideFeedbackTileWidget(FeedbackTileConfig feedbackTileConfig, FeedbackTileViewMapper feedbackTileViewMapper) {
        Widget2 provideFeedbackTileWidget = FeedbackTileModule.INSTANCE.provideFeedbackTileWidget(feedbackTileConfig, feedbackTileViewMapper);
        j.d(provideFeedbackTileWidget);
        return provideFeedbackTileWidget;
    }
}
