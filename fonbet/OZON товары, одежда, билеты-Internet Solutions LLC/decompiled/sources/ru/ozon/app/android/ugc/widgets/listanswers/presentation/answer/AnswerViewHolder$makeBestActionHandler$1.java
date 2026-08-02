package ru.ozon.app.android.ugc.widgets.listanswers.presentation.answer;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.ui.configurators.ugc.common.SubmitDialog;
import ru.ozon.app.android.pdp.ui.configurators.ugc.data.ActionType;
import ru.ozon.app.android.pdp.ui.configurators.ugc.question.QuestionsDialogFragment;
import ru.ozon.app.android.ugc.widgets.listanswers.data.ListAnswersDTO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class AnswerViewHolder$makeBestActionHandler$1 extends AbstractC7737t implements Function1<AtomAction.ComposerAction, Unit> {
    final /* synthetic */ AnswerViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnswerViewHolder$makeBestActionHandler$1(AnswerViewHolder answerViewHolder) {
        super(1);
        this.this$0 = answerViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction.ComposerAction composerAction) {
        invoke2(composerAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction.ComposerAction it) {
        ListAnswersDTO.Answer.AnswerButtons.MakeBestButton makeBestButton;
        SubmitDialog submitDialog;
        ComposerReferences composerReferences;
        ComposerReferences composerReferences2;
        Intrinsics.checkNotNullParameter(it, "it");
        AnswerVO boundedData = this.this$0.getBoundedData();
        if (boundedData == null || (makeBestButton = boundedData.getMakeBestButton()) == null || (submitDialog = makeBestButton.getSubmitDialog()) == null) {
            return;
        }
        QuestionsDialogFragment newInstance = QuestionsDialogFragment.INSTANCE.newInstance(new QuestionsDialogFragment.Params(submitDialog.getTitle(), submitDialog.getText(), submitDialog.getSubmitButton().getText(), submitDialog.getCancelButton().getText(), boundedData.getId(), ActionType.REFRESH, it.getActionName(), null, null, it.getParams(), 384, null));
        composerReferences = this.this$0.refs;
        newInstance.setTargetFragment(composerReferences.getContainer().j(), 8290);
        composerReferences2 = this.this$0.refs;
        newInstance.show(composerReferences2.getContainer().k(), (String) null);
    }
}
