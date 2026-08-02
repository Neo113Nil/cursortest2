package ru.ozon.app.android.session.sessionList.presentation.viewHolder;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.session.sessionList.presentation.SessionListEvent;
import ru.ozon.app.android.session.sessionList.presentation.SessionListViewModel;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SessionListLogoutButtonViewHolder$onShowOnAllLogoutDialog$2 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ SessionListEvent.ShowLogoutOnAllDialog $event;
    final /* synthetic */ SessionListLogoutButtonViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SessionListLogoutButtonViewHolder$onShowOnAllLogoutDialog$2(SessionListLogoutButtonViewHolder sessionListLogoutButtonViewHolder, SessionListEvent.ShowLogoutOnAllDialog showLogoutOnAllDialog) {
        super(0);
        this.this$0 = sessionListLogoutButtonViewHolder;
        this.$event = showLogoutOnAllDialog;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        SessionListViewModel sessionListViewModel;
        sessionListViewModel = this.this$0.viewModel;
        sessionListViewModel.onLogoutOnAllConfirmed(this.$event.getAction());
    }
}
