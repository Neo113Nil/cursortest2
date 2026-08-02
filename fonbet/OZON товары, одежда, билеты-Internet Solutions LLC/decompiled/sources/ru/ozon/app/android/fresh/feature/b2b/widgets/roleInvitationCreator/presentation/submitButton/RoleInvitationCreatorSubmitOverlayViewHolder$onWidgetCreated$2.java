package ru.ozon.app.android.fresh.feature.b2b.widgets.roleInvitationCreator.presentation.submitButton;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.fresh.feature.b2b.widgets.roleInvitationCreator.domain.RoleInvitationCreatorSubmitVO;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "isLoading", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.fresh.feature.b2b.widgets.roleInvitationCreator.presentation.submitButton.RoleInvitationCreatorSubmitOverlayViewHolder$onWidgetCreated$2", f = "RoleInvitationCreatorSubmitOverlayViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class RoleInvitationCreatorSubmitOverlayViewHolder$onWidgetCreated$2 extends j implements Function2<Boolean, d<? super Unit>, Object> {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ RoleInvitationCreatorSubmitOverlayViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RoleInvitationCreatorSubmitOverlayViewHolder$onWidgetCreated$2(RoleInvitationCreatorSubmitOverlayViewHolder roleInvitationCreatorSubmitOverlayViewHolder, d<? super RoleInvitationCreatorSubmitOverlayViewHolder$onWidgetCreated$2> dVar) {
        super(2, dVar);
        this.this$0 = roleInvitationCreatorSubmitOverlayViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        RoleInvitationCreatorSubmitOverlayViewHolder$onWidgetCreated$2 roleInvitationCreatorSubmitOverlayViewHolder$onWidgetCreated$2 = new RoleInvitationCreatorSubmitOverlayViewHolder$onWidgetCreated$2(this.this$0, dVar);
        roleInvitationCreatorSubmitOverlayViewHolder$onWidgetCreated$2.Z$0 = ((Boolean) obj).booleanValue();
        return roleInvitationCreatorSubmitOverlayViewHolder$onWidgetCreated$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, d<? super Unit> dVar) {
        return invoke(bool.booleanValue(), dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        RoleInvitationCreatorSubmitVO roleInvitationCreatorSubmitVO;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        boolean z11 = this.Z$0;
        roleInvitationCreatorSubmitVO = this.this$0.currentItem;
        if (roleInvitationCreatorSubmitVO != null) {
            this.this$0.bindInternal(RoleInvitationCreatorSubmitVO.copy$default(roleInvitationCreatorSubmitVO, 0L, null, null, null, null, z11, 31, null));
        }
        return Unit.f71690a;
    }

    public final Object invoke(boolean z11, d<? super Unit> dVar) {
        return ((RoleInvitationCreatorSubmitOverlayViewHolder$onWidgetCreated$2) create(Boolean.valueOf(z11), dVar)).invokeSuspend(Unit.f71690a);
    }
}
