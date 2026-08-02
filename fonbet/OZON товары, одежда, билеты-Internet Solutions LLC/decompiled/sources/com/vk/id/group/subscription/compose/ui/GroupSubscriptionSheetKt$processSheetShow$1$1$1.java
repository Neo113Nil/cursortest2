package com.vk.id.group.subscription.compose.ui;

import P0.C3787x1;
import Sc.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetKt$processSheetShow$1$1$1", f = "GroupSubscriptionSheet.kt", l = {720}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class GroupSubscriptionSheetKt$processSheetShow$1$1$1 extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {
    final /* synthetic */ GroupSubscriptionSheetState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GroupSubscriptionSheetKt$processSheetShow$1$1$1(GroupSubscriptionSheetState groupSubscriptionSheetState, kotlin.coroutines.d<? super GroupSubscriptionSheetKt$processSheetShow$1$1$1> dVar) {
        super(2, dVar);
        this.$state = groupSubscriptionSheetState;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new GroupSubscriptionSheetKt$processSheetShow$1$1$1(this.$state, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            C3787x1 materialSheetState = this.$state.getMaterialSheetState();
            this.label = 1;
            if (materialSheetState.i(this) == aVar) {
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

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((GroupSubscriptionSheetKt$processSheetShow$1$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
