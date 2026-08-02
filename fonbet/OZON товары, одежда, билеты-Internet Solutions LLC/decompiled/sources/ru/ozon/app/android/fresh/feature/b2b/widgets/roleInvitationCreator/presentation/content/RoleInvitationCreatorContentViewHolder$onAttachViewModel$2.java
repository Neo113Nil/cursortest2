package ru.ozon.app.android.fresh.feature.b2b.widgets.roleInvitationCreator.presentation.content;

import Sc.o;
import Sc.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.fresh.feature.b2b.widgets.roleInvitationCreator.presentation.RoleInvitationCreatorViewModel;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/presentation/RoleInvitationCreatorViewModel$Action;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.fresh.feature.b2b.widgets.roleInvitationCreator.presentation.content.RoleInvitationCreatorContentViewHolder$onAttachViewModel$2", f = "RoleInvitationCreatorContentViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class RoleInvitationCreatorContentViewHolder$onAttachViewModel$2 extends j implements Function2<RoleInvitationCreatorViewModel.Action, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RoleInvitationCreatorContentViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RoleInvitationCreatorContentViewHolder$onAttachViewModel$2(RoleInvitationCreatorContentViewHolder roleInvitationCreatorContentViewHolder, d<? super RoleInvitationCreatorContentViewHolder$onAttachViewModel$2> dVar) {
        super(2, dVar);
        this.this$0 = roleInvitationCreatorContentViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        RoleInvitationCreatorContentViewHolder$onAttachViewModel$2 roleInvitationCreatorContentViewHolder$onAttachViewModel$2 = new RoleInvitationCreatorContentViewHolder$onAttachViewModel$2(this.this$0, dVar);
        roleInvitationCreatorContentViewHolder$onAttachViewModel$2.L$0 = obj;
        return roleInvitationCreatorContentViewHolder$onAttachViewModel$2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        RoleInvitationCreatorContentView roleInvitationCreatorContentView;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        RoleInvitationCreatorViewModel.Action action = (RoleInvitationCreatorViewModel.Action) this.L$0;
        if (action instanceof RoleInvitationCreatorViewModel.Action.ShowError) {
            roleInvitationCreatorContentView = this.this$0.roleInvitationCreatorContentView;
            RoleInvitationCreatorViewModel.Action.ShowError showError = (RoleInvitationCreatorViewModel.Action.ShowError) action;
            roleInvitationCreatorContentView.showErrorForInput(showError.getInputIndex(), showError.getMessage());
        } else if (!(action instanceof RoleInvitationCreatorViewModel.Action.ShowNotification) && !(action instanceof RoleInvitationCreatorViewModel.Action.Redirect)) {
            throw new o();
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(RoleInvitationCreatorViewModel.Action action, d<? super Unit> dVar) {
        return ((RoleInvitationCreatorContentViewHolder$onAttachViewModel$2) create(action, dVar)).invokeSuspend(Unit.f71690a);
    }
}
