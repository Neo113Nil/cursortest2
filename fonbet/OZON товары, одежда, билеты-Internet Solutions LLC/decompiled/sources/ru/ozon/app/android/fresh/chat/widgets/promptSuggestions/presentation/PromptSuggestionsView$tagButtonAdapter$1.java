package ru.ozon.app.android.fresh.chat.widgets.promptSuggestions.presentation;

import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/uni/atoms/af/AtomAction;", "actionData", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "", "invoke", "(Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class PromptSuggestionsView$tagButtonAdapter$1 extends AbstractC7737t implements Function2<AtomAction, t, Unit> {
    final /* synthetic */ PromptSuggestionsView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PromptSuggestionsView$tagButtonAdapter$1(PromptSuggestionsView promptSuggestionsView) {
        super(2);
        this.this$0 = promptSuggestionsView;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction, t tVar) {
        invoke2(atomAction, tVar);
        return Unit.f71690a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x000e, code lost:
    
        r0 = r1.this$0.actionHandler;
     */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke2(AtomAction actionData, t tVar) {
        Function2 function2;
        Intrinsics.checkNotNullParameter(actionData, "actionData");
        if (this.this$0.getIsActionHandlingEnabled() && function2 != null) {
            function2.invoke(actionData, tVar);
        }
    }
}
