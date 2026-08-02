package com.vk.id.group.subscription.compose.ui;

import S0.InterfaceC3978p0;
import Sc.s;
import com.vk.id.group.subscription.compose.interactor.GroupSubscriptionInteractor;
import com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetStatus;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetKt$subscribeToGroup$1", f = "GroupSubscriptionSheet.kt", l = {354}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class GroupSubscriptionSheetKt$subscribeToGroup$1 extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {
    final /* synthetic */ GroupSubscriptionSheetStatusData $data;
    final /* synthetic */ GroupSubscriptionInteractor $interactor;
    final /* synthetic */ Function0<Unit> $onSuccess;
    final /* synthetic */ GroupSubscriptionSheetState $state;
    final /* synthetic */ InterfaceC3978p0<GroupSubscriptionSheetStatus> $status;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GroupSubscriptionSheetKt$subscribeToGroup$1(GroupSubscriptionInteractor groupSubscriptionInteractor, Function0<Unit> function0, GroupSubscriptionSheetState groupSubscriptionSheetState, InterfaceC3978p0<GroupSubscriptionSheetStatus> interfaceC3978p0, GroupSubscriptionSheetStatusData groupSubscriptionSheetStatusData, kotlin.coroutines.d<? super GroupSubscriptionSheetKt$subscribeToGroup$1> dVar) {
        super(2, dVar);
        this.$interactor = groupSubscriptionInteractor;
        this.$onSuccess = function0;
        this.$state = groupSubscriptionSheetState;
        this.$status = interfaceC3978p0;
        this.$data = groupSubscriptionSheetStatusData;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new GroupSubscriptionSheetKt$subscribeToGroup$1(this.$interactor, this.$onSuccess, this.$state, this.$status, this.$data, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                s.b(obj);
                GroupSubscriptionInteractor groupSubscriptionInteractor = this.$interactor;
                this.label = 1;
                if (groupSubscriptionInteractor.subscribeToGroup$group_subscription_compose_release(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            this.$onSuccess.invoke();
            this.$state.hide();
        } catch (Throwable unused) {
            this.$status.setValue(new GroupSubscriptionSheetStatus.Failure(this.$data));
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((GroupSubscriptionSheetKt$subscribeToGroup$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
