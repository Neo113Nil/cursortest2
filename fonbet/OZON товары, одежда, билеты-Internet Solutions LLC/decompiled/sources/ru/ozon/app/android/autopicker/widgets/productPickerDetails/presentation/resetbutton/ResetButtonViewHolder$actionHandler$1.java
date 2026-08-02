package ru.ozon.app.android.autopicker.widgets.productPickerDetails.presentation.resetbutton;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke", "(Lru/ozon/uni/atoms/af/AtomAction;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class ResetButtonViewHolder$actionHandler$1 extends AbstractC7737t implements Function1<AtomAction, Boolean> {
    final /* synthetic */ ComposerReferences $refs;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ResetButtonViewHolder$actionHandler$1(ComposerReferences composerReferences) {
        super(1);
        this.$refs = composerReferences;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(AtomAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof AtomAction.Click) {
            InterfaceC7851b.a.a(this.$refs.getController(), ((AtomAction.Click) action).getLink(), null, null, null, 14);
        }
        return Boolean.TRUE;
    }
}
