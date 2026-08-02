package ru.ozon.app.android.fresh.chat.widgets.promptStatus.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class PromptStatusViewHolder$bindState$1 extends AbstractC7737t implements Function1<AtomAction, Unit> {
    final /* synthetic */ PromptStatusViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PromptStatusViewHolder$bindState$1(PromptStatusViewHolder promptStatusViewHolder) {
        super(1);
        this.this$0 = promptStatusViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
        invoke2(atomAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction it) {
        boolean z11;
        Function1 actionHandler;
        Intrinsics.checkNotNullParameter(it, "it");
        z11 = this.this$0.isActionHandlingBlocked;
        if (z11) {
            return;
        }
        this.this$0.isActionHandlingBlocked = true;
        actionHandler = this.this$0.getActionHandler();
        actionHandler.invoke(it);
    }
}
