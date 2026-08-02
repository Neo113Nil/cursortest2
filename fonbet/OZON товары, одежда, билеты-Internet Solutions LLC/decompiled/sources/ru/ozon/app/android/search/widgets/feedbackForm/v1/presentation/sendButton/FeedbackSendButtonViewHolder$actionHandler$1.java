package ru.ozon.app.android.search.widgets.feedbackForm.v1.presentation.sendButton;

import WZ.l;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.search.widgets.feedbackForm.common.CustomSearchAnalyticsData;
import ru.ozon.app.android.search.widgets.feedbackForm.common.FeedbackAnalyticDelegate;
import ru.ozon.app.android.search.widgets.feedbackForm.common.FeedbackSharedViewModel;
import ru.ozon.app.android.search.widgets.feedbackForm.v1.presentation.FeedbackFormViewModel;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke", "(Lru/ozon/uni/atoms/af/AtomAction;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class FeedbackSendButtonViewHolder$actionHandler$1 extends AbstractC7737t implements Function1<AtomAction, Boolean> {
    final /* synthetic */ FeedbackSendButtonViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FeedbackSendButtonViewHolder$actionHandler$1(FeedbackSendButtonViewHolder feedbackSendButtonViewHolder) {
        super(1);
        this.this$0 = feedbackSendButtonViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(AtomAction action) {
        FeedbackSendButtonVO boundData;
        FeedbackSharedViewModel feedbackSharedViewModel;
        FeedbackAnalyticDelegate feedbackAnalyticDelegate;
        l lVar;
        FeedbackFormViewModel feedbackFormViewModel;
        FeedbackFormViewModel feedbackFormViewModel2;
        CellDTO.CenterBlock centerBlock;
        CellDTO.CellText title;
        AtomActionDTO action2;
        AtomActionDTO action3;
        Intrinsics.checkNotNullParameter(action, "action");
        if (!(action instanceof AtomAction.Dismiss)) {
            return Boolean.FALSE;
        }
        if (!this.this$0.view.getDisabled() && (boundData = this.this$0.getBoundData()) != null) {
            FeedbackSendButtonViewHolder feedbackSendButtonViewHolder = this.this$0;
            feedbackSendButtonViewHolder.isSubmitSent = true;
            feedbackSendButtonViewHolder.navigator.popBackStack();
            feedbackSharedViewModel = feedbackSendButtonViewHolder.feedbackSharedViewModel;
            feedbackSharedViewModel.hideFeedbackTile();
            feedbackAnalyticDelegate = feedbackSendButtonViewHolder.feedbackAnalyticDelegate;
            lVar = feedbackSendButtonViewHolder.tokenizedAnalytics;
            AtomAction.Dismiss dismiss = (AtomAction.Dismiss) action;
            long id2 = boundData.getId();
            CommonControlSettings customAnalytics = boundData.getCustomAnalytics();
            OzonSpannableString ozonSpannableString = null;
            String link = (customAnalytics == null || (action3 = customAnalytics.getAction()) == null) ? null : action3.getLink();
            CommonControlSettings customAnalytics2 = boundData.getCustomAnalytics();
            Map<String, String> params = (customAnalytics2 == null || (action2 = customAnalytics2.getAction()) == null) ? null : action2.getParams();
            feedbackFormViewModel = feedbackSendButtonViewHolder.viewModel;
            CellDTO selectCell = feedbackFormViewModel.getSelectCell();
            if (selectCell != null && (centerBlock = selectCell.getCenterBlock()) != null && (title = centerBlock.getTitle()) != null) {
                ozonSpannableString = title.getText();
            }
            feedbackFormViewModel2 = feedbackSendButtonViewHolder.viewModel;
            feedbackAnalyticDelegate.sendSubmitAnalytics(lVar, dismiss, id2, new CustomSearchAnalyticsData(link, ozonSpannableString, feedbackFormViewModel2.getOptionText(), params));
        }
        return Boolean.TRUE;
    }
}
