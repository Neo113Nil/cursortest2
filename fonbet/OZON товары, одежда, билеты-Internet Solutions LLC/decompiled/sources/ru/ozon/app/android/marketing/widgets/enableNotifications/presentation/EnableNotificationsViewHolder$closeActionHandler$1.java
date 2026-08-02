package ru.ozon.app.android.marketing.widgets.enableNotifications.presentation;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l20.d;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class EnableNotificationsViewHolder$closeActionHandler$1 extends AbstractC7737t implements Function1<AtomAction.ComposerAction, Unit> {
    final /* synthetic */ EnableNotificationsViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EnableNotificationsViewHolder$closeActionHandler$1(EnableNotificationsViewHolder enableNotificationsViewHolder) {
        super(1);
        this.this$0 = enableNotificationsViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction.ComposerAction composerAction) {
        invoke2(composerAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction.ComposerAction action) {
        EnableNotificationsViewModel enableNotificationsViewModel;
        ComposerReferences composerReferences;
        d dVar;
        Intrinsics.checkNotNullParameter(action, "action");
        String actionName = action.getActionName();
        Map<String, String> params = action.getParams();
        enableNotificationsViewModel = this.this$0.viewModel;
        enableNotificationsViewModel.closeWidget(actionName, params);
        composerReferences = this.this$0.references;
        InterfaceC7851b controller = composerReferences.getController();
        dVar = this.this$0.info;
        if (dVar != null) {
            controller.p(dVar.d());
        } else {
            Intrinsics.n("info");
            throw null;
        }
    }
}
