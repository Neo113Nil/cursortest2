package ru.ozon.app.android.search.widgets.feedbackForm.v2.presentation.cell;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.search.widgets.feedbackForm.v2.data.OptionSelectedV2;
import ru.ozon.app.android.search.widgets.feedbackForm.v2.data.model.InputV2Model;
import ru.ozon.app.android.search.widgets.feedbackForm.v2.presentation.FeedbackFormV2ViewModel;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke", "(Lru/ozon/uni/atoms/af/AtomAction;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class FeedbackCellV2ViewHolder$actionHandler$1 extends AbstractC7737t implements Function1<AtomAction, Boolean> {
    final /* synthetic */ FeedbackCellV2ViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FeedbackCellV2ViewHolder$actionHandler$1(FeedbackCellV2ViewHolder feedbackCellV2ViewHolder) {
        super(1);
        this.this$0 = feedbackCellV2ViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(AtomAction action) {
        FeedbackCellV2VO boundData;
        FeedbackFormV2ViewModel feedbackFormV2ViewModel;
        ComposerReferences composerReferences;
        InputV2Model inputSettings;
        Intrinsics.checkNotNullParameter(action, "action");
        if ((action instanceof AtomAction.Click) && (boundData = this.this$0.getBoundData()) != null) {
            FeedbackCellV2ViewHolder feedbackCellV2ViewHolder = this.this$0;
            feedbackFormV2ViewModel = feedbackCellV2ViewHolder.viewModel;
            feedbackFormV2ViewModel.selectOption(boundData.getCell(), boundData.getOptionType());
            composerReferences = feedbackCellV2ViewHolder.refs;
            InterfaceC7851b controller = composerReferences.getController();
            boolean z11 = !boundData.getIsSelected();
            boolean z12 = !boundData.getIsSelected();
            inputSettings = feedbackCellV2ViewHolder.getInputSettings(boundData);
            controller.update(new OptionSelectedV2(z11, z12, inputSettings));
            feedbackCellV2ViewHolder.closeSheetIfNeeded(boundData);
        }
        return Boolean.FALSE;
    }
}
