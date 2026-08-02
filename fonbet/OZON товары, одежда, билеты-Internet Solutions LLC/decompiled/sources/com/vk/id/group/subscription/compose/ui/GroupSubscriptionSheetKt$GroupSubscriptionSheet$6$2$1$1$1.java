package com.vk.id.group.subscription.compose.ui;

import Sc.s;
import com.vk.id.group.subscription.compose.interactor.GroupSubscriptionInteractor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetKt$GroupSubscriptionSheet$6$2$1$1$1", f = "GroupSubscriptionSheet.kt", l = {293}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class GroupSubscriptionSheetKt$GroupSubscriptionSheet$6$2$1$1$1 extends j implements Function1<kotlin.coroutines.d<? super Unit>, Object> {
    final /* synthetic */ GroupSubscriptionInteractor $interactor;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GroupSubscriptionSheetKt$GroupSubscriptionSheet$6$2$1$1$1(GroupSubscriptionInteractor groupSubscriptionInteractor, kotlin.coroutines.d<? super GroupSubscriptionSheetKt$GroupSubscriptionSheet$6$2$1$1$1> dVar) {
        super(1, dVar);
        this.$interactor = groupSubscriptionInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
        return new GroupSubscriptionSheetKt$GroupSubscriptionSheet$6$2$1$1$1(this.$interactor, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            GroupSubscriptionInteractor groupSubscriptionInteractor = this.$interactor;
            this.label = 1;
            if (groupSubscriptionInteractor.saveDisplay$group_subscription_compose_release(this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
        return ((GroupSubscriptionSheetKt$GroupSubscriptionSheet$6$2$1$1$1) create(dVar)).invokeSuspend(Unit.f71690a);
    }
}
