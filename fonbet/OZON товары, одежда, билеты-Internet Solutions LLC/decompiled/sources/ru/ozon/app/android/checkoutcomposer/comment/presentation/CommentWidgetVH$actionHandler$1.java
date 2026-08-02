package ru.ozon.app.android.checkoutcomposer.comment.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.atoms.data.deprecated.Input;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class CommentWidgetVH$actionHandler$1 extends AbstractC7737t implements Function1<AtomAction.ComposerAction, Unit> {
    final /* synthetic */ CommentWidgetVH this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommentWidgetVH$actionHandler$1(CommentWidgetVH commentWidgetVH) {
        super(1);
        this.this$0 = commentWidgetVH;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction.ComposerAction composerAction) {
        invoke2(composerAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction.ComposerAction action) {
        AtomsAdapter atomsAdapter;
        CommentViewModel commentViewModel;
        Intrinsics.checkNotNullParameter(action, "action");
        atomsAdapter = this.this$0.inputAdapter;
        String atomTextValue$default = AtomsAdapter.getAtomTextValue$default(atomsAdapter, Input.class, null, 2, null);
        if (atomTextValue$default != null) {
            commentViewModel = this.this$0.vm;
            commentViewModel.sendComment(action.getActionName(), atomTextValue$default);
        }
    }
}
