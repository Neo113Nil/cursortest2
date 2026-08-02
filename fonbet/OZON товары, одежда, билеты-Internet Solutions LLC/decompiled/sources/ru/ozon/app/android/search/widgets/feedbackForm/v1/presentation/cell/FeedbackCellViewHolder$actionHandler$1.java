package ru.ozon.app.android.search.widgets.feedbackForm.v1.presentation.cell;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.search.widgets.feedbackForm.v1.data.OptionSelected;
import ru.ozon.app.android.search.widgets.feedbackForm.v1.data.model.InputModel;
import ru.ozon.app.android.search.widgets.feedbackForm.v1.presentation.FeedbackFormViewModel;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class FeedbackCellViewHolder$actionHandler$1 extends AbstractC7737t implements Function1<AtomAction.Click, Unit> {
    final /* synthetic */ FeedbackCellViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FeedbackCellViewHolder$actionHandler$1(FeedbackCellViewHolder feedbackCellViewHolder) {
        super(1);
        this.this$0 = feedbackCellViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction.Click click) {
        invoke2(click);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction.Click it) {
        FeedbackFormViewModel feedbackFormViewModel;
        ComposerReferences composerReferences;
        InputModel inputSettings;
        Intrinsics.checkNotNullParameter(it, "it");
        FeedbackCellVO boundData = this.this$0.getBoundData();
        if (boundData != null) {
            FeedbackCellViewHolder feedbackCellViewHolder = this.this$0;
            feedbackFormViewModel = feedbackCellViewHolder.viewModel;
            feedbackFormViewModel.selectOption(boundData.getCell(), boundData.getOptionType());
            composerReferences = feedbackCellViewHolder.refs;
            InterfaceC7851b controller = composerReferences.getController();
            boolean z11 = !boundData.getIsSelected();
            boolean z12 = !boundData.getIsSelected();
            inputSettings = feedbackCellViewHolder.getInputSettings(boundData);
            controller.update(new OptionSelected(z11, z12, inputSettings));
        }
    }
}
