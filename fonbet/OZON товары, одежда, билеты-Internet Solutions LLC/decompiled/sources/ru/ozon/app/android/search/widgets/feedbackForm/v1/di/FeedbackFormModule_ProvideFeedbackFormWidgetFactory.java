package ru.ozon.app.android.search.widgets.feedbackForm.v1.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.search.widgets.feedbackForm.v1.data.FeedbackFormConfig;
import ru.ozon.app.android.search.widgets.feedbackForm.v1.presentation.cell.FeedbackCellViewMapper;
import ru.ozon.app.android.search.widgets.feedbackForm.v1.presentation.input.FeedbackInputViewMapper;
import ru.ozon.app.android.search.widgets.feedbackForm.v1.presentation.sendButton.FeedbackSendButtonViewMapper;
import ru.ozon.app.android.search.widgets.feedbackForm.v1.presentation.spacer.FeedbackSpacerViewMapper;

/* loaded from: classes7.dex */
public final class FeedbackFormModule_ProvideFeedbackFormWidgetFactory implements e<Widget2> {
    public static Widget2 provideFeedbackFormWidget(FeedbackFormConfig feedbackFormConfig, FeedbackCellViewMapper feedbackCellViewMapper, FeedbackInputViewMapper feedbackInputViewMapper, FeedbackSpacerViewMapper feedbackSpacerViewMapper, FeedbackSendButtonViewMapper feedbackSendButtonViewMapper) {
        Widget2 provideFeedbackFormWidget = FeedbackFormModule.INSTANCE.provideFeedbackFormWidget(feedbackFormConfig, feedbackCellViewMapper, feedbackInputViewMapper, feedbackSpacerViewMapper, feedbackSendButtonViewMapper);
        j.d(provideFeedbackFormWidget);
        return provideFeedbackFormWidget;
    }
}
