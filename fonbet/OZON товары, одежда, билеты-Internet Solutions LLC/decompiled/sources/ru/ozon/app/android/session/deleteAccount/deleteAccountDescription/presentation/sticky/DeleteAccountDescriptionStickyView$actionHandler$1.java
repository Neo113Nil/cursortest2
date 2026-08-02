package ru.ozon.app.android.session.deleteAccount.deleteAccountDescription.presentation.sticky;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class DeleteAccountDescriptionStickyView$actionHandler$1 extends AbstractC7737t implements Function1<AtomAction.ComposerAction, Unit> {
    final /* synthetic */ DeleteAccountDescriptionStickyView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeleteAccountDescriptionStickyView$actionHandler$1(DeleteAccountDescriptionStickyView deleteAccountDescriptionStickyView) {
        super(1);
        this.this$0 = deleteAccountDescriptionStickyView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction.ComposerAction composerAction) {
        invoke2(composerAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction.ComposerAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        Function1<String, Unit> onComposerActionClick = this.this$0.getOnComposerActionClick();
        if (onComposerActionClick != null) {
            onComposerActionClick.invoke(action.getActionName());
        }
    }
}
