package ru.ozon.app.android.fresh.chat.widgets.promptSuggestions.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.chat.widgets.promptSuggestions.presentation.PromptSuggestionsVO;
import ru.ozon.app.android.fresh.chat.widgets.promptSuggestions.presentation.PromptSuggestionsView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class PromptSuggestionsView$TagButtonViewHolder$bind$1 extends AbstractC7737t implements Function1<AtomAction, Unit> {
    final /* synthetic */ PromptSuggestionsVO.SuggestionButton $item;
    final /* synthetic */ PromptSuggestionsView.TagButtonViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PromptSuggestionsView$TagButtonViewHolder$bind$1(PromptSuggestionsVO.SuggestionButton suggestionButton, PromptSuggestionsView.TagButtonViewHolder tagButtonViewHolder) {
        super(1);
        this.$item = suggestionButton;
        this.this$0 = tagButtonViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
        invoke2(atomAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction action) {
        CommonControlSettings common;
        AtomActionDTO action2;
        AtomAction atomAction;
        Function2 function2;
        Intrinsics.checkNotNullParameter(action, "action");
        if ((action instanceof AtomAction.ViewAction) || (common = this.$item.getButton().getCommon()) == null || (action2 = common.getAction()) == null || (atomAction = AtomActionMapperKt.toAtomAction(action2, null)) == null) {
            return;
        }
        function2 = this.this$0.actionHandler;
        function2.invoke(atomAction, this.$item.getTokenizedEvent());
    }
}
