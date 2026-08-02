package ru.ozon.app.android.ugc.widgets.listanswers.presentation.answer;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.ui.configurators.ugc.officialagent.OfficialAgentBottomSheetFragment;
import ru.ozon.app.android.ugc.widgets.singlequestion.data.SingleQuestionDTO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class AnswerViewHolder$1$1$1 extends AbstractC7737t implements Function1<View, Unit> {
    final /* synthetic */ AnswerViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnswerViewHolder$1$1$1(AnswerViewHolder answerViewHolder) {
        super(1);
        this.this$0 = answerViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(View view) {
        invoke2(view);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(View it) {
        SingleQuestionDTO.AuthorQuestion.Author.Partner partner;
        ComposerReferences composerReferences;
        Intrinsics.checkNotNullParameter(it, "it");
        AnswerVO boundData = this.this$0.getBoundData();
        if (boundData == null || (partner = boundData.getPartner()) == null) {
            return;
        }
        AnswerViewHolder answerViewHolder = this.this$0;
        OfficialAgentBottomSheetFragment companion = OfficialAgentBottomSheetFragment.INSTANCE.getInstance(partner.getTitle(), partner.getSubTitle());
        composerReferences = answerViewHolder.refs;
        companion.show(composerReferences.getContainer().j().getChildFragmentManager(), (String) null);
    }
}
