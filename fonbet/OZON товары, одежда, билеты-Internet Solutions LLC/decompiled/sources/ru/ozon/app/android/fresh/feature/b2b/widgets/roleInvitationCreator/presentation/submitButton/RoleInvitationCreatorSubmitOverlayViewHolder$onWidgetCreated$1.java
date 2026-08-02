package ru.ozon.app.android.fresh.feature.b2b.widgets.roleInvitationCreator.presentation.submitButton;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.fresh.feature.b2b.widgets.roleInvitationCreator.presentation.RoleInvitationCreatorViewModel;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/presentation/RoleInvitationCreatorViewModel$Action;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.fresh.feature.b2b.widgets.roleInvitationCreator.presentation.submitButton.RoleInvitationCreatorSubmitOverlayViewHolder$onWidgetCreated$1", f = "RoleInvitationCreatorSubmitOverlayViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class RoleInvitationCreatorSubmitOverlayViewHolder$onWidgetCreated$1 extends j implements Function2<RoleInvitationCreatorViewModel.Action, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RoleInvitationCreatorSubmitOverlayViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RoleInvitationCreatorSubmitOverlayViewHolder$onWidgetCreated$1(RoleInvitationCreatorSubmitOverlayViewHolder roleInvitationCreatorSubmitOverlayViewHolder, d<? super RoleInvitationCreatorSubmitOverlayViewHolder$onWidgetCreated$1> dVar) {
        super(2, dVar);
        this.this$0 = roleInvitationCreatorSubmitOverlayViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        RoleInvitationCreatorSubmitOverlayViewHolder$onWidgetCreated$1 roleInvitationCreatorSubmitOverlayViewHolder$onWidgetCreated$1 = new RoleInvitationCreatorSubmitOverlayViewHolder$onWidgetCreated$1(this.this$0, dVar);
        roleInvitationCreatorSubmitOverlayViewHolder$onWidgetCreated$1.L$0 = obj;
        return roleInvitationCreatorSubmitOverlayViewHolder$onWidgetCreated$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Function1 actionHandler;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        RoleInvitationCreatorViewModel.Action action = (RoleInvitationCreatorViewModel.Action) this.L$0;
        if (action instanceof RoleInvitationCreatorViewModel.Action.ShowNotification) {
            this.this$0.showNotificationBar(((RoleInvitationCreatorViewModel.Action.ShowNotification) action).getNotification());
        } else if (action instanceof RoleInvitationCreatorViewModel.Action.Redirect) {
            str = this.this$0.currentRedirectUrl;
            if (str == null) {
                str = "ozon://home";
            }
            String str2 = str;
            actionHandler = this.this$0.getActionHandler();
            actionHandler.invoke(new AtomAction.Move(str2, null, null, null, 10, null));
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(RoleInvitationCreatorViewModel.Action action, d<? super Unit> dVar) {
        return ((RoleInvitationCreatorSubmitOverlayViewHolder$onWidgetCreated$1) create(action, dVar)).invokeSuspend(Unit.f71690a);
    }
}
