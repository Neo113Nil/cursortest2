package ru.ozon.app.android.fresh.feature.b2b.widgets.roleInvitationCreator.presentation;

import Ae.x0;
import Sc.s;
import Wc.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import retrofit2.Response;
import ru.ozon.app.android.fresh.feature.b2b.widgets.roleInvitationCreator.domain.api.RoleInvitationCreatorRepository;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.feature.b2b.widgets.roleInvitationCreator.presentation.RoleInvitationCreatorViewModel$sendInvitations$1", f = "RoleInvitationCreatorViewModel.kt", l = {132, 136, 138}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class RoleInvitationCreatorViewModel$sendInvitations$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ List<String> $emails;
    int label;
    final /* synthetic */ RoleInvitationCreatorViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RoleInvitationCreatorViewModel$sendInvitations$1(RoleInvitationCreatorViewModel roleInvitationCreatorViewModel, List<String> list, d<? super RoleInvitationCreatorViewModel$sendInvitations$1> dVar) {
        super(2, dVar);
        this.this$0 = roleInvitationCreatorViewModel;
        this.$emails = list;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new RoleInvitationCreatorViewModel$sendInvitations$1(this.this$0, this.$emails, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        if (r7 == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006b, code lost:
    
        if (r7 != r0) goto L28;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object emitDefaultErrorNotification;
        x0 x0Var;
        x0 x0Var2;
        x0 x0Var3;
        RoleInvitationCreatorRepository roleInvitationCreatorRepository;
        String str;
        Object handleApiResponse;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            try {
            } catch (Exception unused) {
                RoleInvitationCreatorViewModel roleInvitationCreatorViewModel = this.this$0;
                this.label = 3;
                emitDefaultErrorNotification = roleInvitationCreatorViewModel.emitDefaultErrorNotification(this);
            }
            if (i11 == 0) {
                s.b(obj);
                x0Var3 = this.this$0._isLoading;
                x0Var3.setValue(Boolean.TRUE);
                roleInvitationCreatorRepository = this.this$0.repository;
                str = this.this$0.roleName;
                List<String> list = this.$emails;
                this.label = 1;
                obj = roleInvitationCreatorRepository.createRoleInvitations(str, list, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    if (i11 == 2) {
                        s.b(obj);
                        x0Var2 = this.this$0._isLoading;
                        x0Var2.setValue(Boolean.FALSE);
                        return Unit.f71690a;
                    }
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    x0Var2 = this.this$0._isLoading;
                    x0Var2.setValue(Boolean.FALSE);
                    return Unit.f71690a;
                }
                s.b(obj);
            }
            RoleInvitationCreatorViewModel roleInvitationCreatorViewModel2 = this.this$0;
            this.label = 2;
            handleApiResponse = roleInvitationCreatorViewModel2.handleApiResponse((Response) obj, this);
        } catch (Throwable th2) {
            x0Var = this.this$0._isLoading;
            x0Var.setValue(Boolean.FALSE);
            throw th2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((RoleInvitationCreatorViewModel$sendInvitations$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
