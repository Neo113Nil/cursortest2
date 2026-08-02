package com.vk.id.group.subscription.compose.interactor;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "com.vk.id.group.subscription.compose.interactor.GroupSubscriptionInteractor$saveDisplay$2", f = "GroupSubscriptionInteractor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class GroupSubscriptionInteractor$saveDisplay$2 extends j implements Function2<Throwable, d<? super Unit>, Object> {
    int label;

    GroupSubscriptionInteractor$saveDisplay$2(d<? super GroupSubscriptionInteractor$saveDisplay$2> dVar) {
        super(2, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new GroupSubscriptionInteractor$saveDisplay$2(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Throwable th2, d<? super Unit> dVar) {
        return ((GroupSubscriptionInteractor$saveDisplay$2) create(th2, dVar)).invokeSuspend(Unit.f71690a);
    }
}
