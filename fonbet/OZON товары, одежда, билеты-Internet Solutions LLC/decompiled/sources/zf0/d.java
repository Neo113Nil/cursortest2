package zf0;

import Sc.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qf0.EnumC9053a;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.network.domain.reachability.domain.DomainData$lastPingResultFlow$4", f = "PeriodicPingInteractor.kt", l = {258}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class d extends kotlin.coroutines.jvm.internal.j implements Function2<Function2<? super h, ? super kotlin.coroutines.d<? super EnumC9053a>, ? extends Object>, kotlin.coroutines.d<? super EnumC9053a>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f108979d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f108980e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ h f108981f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(h hVar, kotlin.coroutines.d<? super d> dVar) {
        super(2, dVar);
        this.f108981f = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        d dVar2 = new d(this.f108981f, dVar);
        dVar2.f108980e = obj;
        return dVar2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Function2<? super h, ? super kotlin.coroutines.d<? super EnumC9053a>, ? extends Object> function2, kotlin.coroutines.d<? super EnumC9053a> dVar) {
        return ((d) create(function2, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f108979d;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return obj;
        }
        s.b(obj);
        Function2 function2 = (Function2) this.f108980e;
        this.f108979d = 1;
        Object invoke = function2.invoke(this.f108981f, this);
        return invoke == aVar ? aVar : invoke;
    }
}
