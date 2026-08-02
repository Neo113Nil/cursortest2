package zf0;

import Sc.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qf0.EnumC9053a;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.network.domain.reachability.domain.DomainData$notMatchingConnectionTypeTask$1", f = "PeriodicPingInteractor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class f extends kotlin.coroutines.jvm.internal.j implements Function2<h, kotlin.coroutines.d<? super EnumC9053a>, Object> {
    f() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new f(2, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(h hVar, kotlin.coroutines.d<? super EnumC9053a> dVar) {
        return ((f) create(hVar, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        return EnumC9053a.Unknown;
    }
}
