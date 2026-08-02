package ru.ozon.app.android.search.widgets.feedbackForm.v2.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.search.widgets.feedbackForm.v2.data.FeedbackFormV2Config;
import ru.ozon.app.android.search.widgets.feedbackForm.v2.presentation.cell.FeedbackCellV2ViewMapper;
import ru.ozon.app.android.search.widgets.feedbackForm.v2.presentation.input.FeedbackInputV2ViewMapper;
import ru.ozon.app.android.search.widgets.feedbackForm.v2.presentation.sendButton.FeedbackSendButtonV2ViewMapper;
import ru.ozon.app.android.search.widgets.feedbackForm.v2.presentation.spacer.FeedbackSpacerV2ViewMapper;

/* loaded from: classes7.dex */
public final class FeedbackFormV2Module_ProvideFeedbackFormWidgetFactory implements e<Widget2> {
    public static Widget2 provideFeedbackFormWidget(FeedbackFormV2Config feedbackFormV2Config, FeedbackCellV2ViewMapper feedbackCellV2ViewMapper, FeedbackInputV2ViewMapper feedbackInputV2ViewMapper, FeedbackSpacerV2ViewMapper feedbackSpacerV2ViewMapper, FeedbackSendButtonV2ViewMapper feedbackSendButtonV2ViewMapper) {
        Widget2 provideFeedbackFormWidget = FeedbackFormV2Module.INSTANCE.provideFeedbackFormWidget(feedbackFormV2Config, feedbackCellV2ViewMapper, feedbackInputV2ViewMapper, feedbackSpacerV2ViewMapper, feedbackSendButtonV2ViewMapper);
        j.d(provideFeedbackFormWidget);
        return provideFeedbackFormWidget;
    }
}
