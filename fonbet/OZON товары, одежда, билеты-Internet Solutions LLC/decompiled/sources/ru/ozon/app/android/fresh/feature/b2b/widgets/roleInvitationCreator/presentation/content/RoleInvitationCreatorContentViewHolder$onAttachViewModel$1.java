package ru.ozon.app.android.fresh.feature.b2b.widgets.roleInvitationCreator.presentation.content;

import Sc.s;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, d2 = {"<anonymous>", "", "errors", "", "", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.fresh.feature.b2b.widgets.roleInvitationCreator.presentation.content.RoleInvitationCreatorContentViewHolder$onAttachViewModel$1", f = "RoleInvitationCreatorContentViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class RoleInvitationCreatorContentViewHolder$onAttachViewModel$1 extends j implements Function2<Map<Integer, ? extends String>, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RoleInvitationCreatorContentViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RoleInvitationCreatorContentViewHolder$onAttachViewModel$1(RoleInvitationCreatorContentViewHolder roleInvitationCreatorContentViewHolder, d<? super RoleInvitationCreatorContentViewHolder$onAttachViewModel$1> dVar) {
        super(2, dVar);
        this.this$0 = roleInvitationCreatorContentViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        RoleInvitationCreatorContentViewHolder$onAttachViewModel$1 roleInvitationCreatorContentViewHolder$onAttachViewModel$1 = new RoleInvitationCreatorContentViewHolder$onAttachViewModel$1(this.this$0, dVar);
        roleInvitationCreatorContentViewHolder$onAttachViewModel$1.L$0 = obj;
        return roleInvitationCreatorContentViewHolder$onAttachViewModel$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Map<Integer, ? extends String> map, d<? super Unit> dVar) {
        return invoke2((Map<Integer, String>) map, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        RoleInvitationCreatorContentView roleInvitationCreatorContentView;
        RoleInvitationCreatorContentView roleInvitationCreatorContentView2;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        Map map = (Map) this.L$0;
        if (map.isEmpty()) {
            roleInvitationCreatorContentView2 = this.this$0.roleInvitationCreatorContentView;
            roleInvitationCreatorContentView2.clearError();
        } else {
            RoleInvitationCreatorContentViewHolder roleInvitationCreatorContentViewHolder = this.this$0;
            for (Map.Entry entry : map.entrySet()) {
                int intValue = ((Number) entry.getKey()).intValue();
                String str = (String) entry.getValue();
                roleInvitationCreatorContentView = roleInvitationCreatorContentViewHolder.roleInvitationCreatorContentView;
                roleInvitationCreatorContentView.showErrorForInput(intValue, str);
            }
        }
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Map<Integer, String> map, d<? super Unit> dVar) {
        return ((RoleInvitationCreatorContentViewHolder$onAttachViewModel$1) create(map, dVar)).invokeSuspend(Unit.f71690a);
    }
}
