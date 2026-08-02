package ru.ozon.app.android.checkoutcomposer.stickyNotification.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke", "(Lru/ozon/uni/atoms/af/AtomAction;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class StickyNotificationViewHolder$actionHandler$1 extends AbstractC7737t implements Function1<AtomAction, Boolean> {
    final /* synthetic */ StickyNotificationViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StickyNotificationViewHolder$actionHandler$1(StickyNotificationViewHolder stickyNotificationViewHolder) {
        super(1);
        this.this$0 = stickyNotificationViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(AtomAction action) {
        ComposerReferences composerReferences;
        Intrinsics.checkNotNullParameter(action, "action");
        if (!(action instanceof AtomAction.ScrollToWidgetByKey)) {
            return Boolean.FALSE;
        }
        composerReferences = this.this$0.references;
        InterfaceC7851b.a.b(composerReferences.getController(), ((AtomAction.ScrollToWidgetByKey) action).getWidgetKey(), 110, true, 8);
        return Boolean.TRUE;
    }
}
