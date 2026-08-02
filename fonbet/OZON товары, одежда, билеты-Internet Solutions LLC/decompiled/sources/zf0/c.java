package zf0;

import Sc.s;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qf0.EnumC9053a;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.network.domain.reachability.domain.DomainData$lastPingResultFlow$3", f = "PeriodicPingInteractor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class c extends kotlin.coroutines.jvm.internal.j implements InterfaceC6511n<Function2<? super h, ? super kotlin.coroutines.d<? super EnumC9053a>, ? extends Object>, Boolean, kotlin.coroutines.d<? super Function2<? super h, ? super kotlin.coroutines.d<? super EnumC9053a>, ? extends Object>>, Object> {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Function2 f108976d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ boolean f108977e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ h f108978f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(h hVar, kotlin.coroutines.d<? super c> dVar) {
        super(3, dVar);
        this.f108978f = hVar;
    }

    @Override // fd.InterfaceC6511n
    public final Object invoke(Function2<? super h, ? super kotlin.coroutines.d<? super EnumC9053a>, ? extends Object> function2, Boolean bool, kotlin.coroutines.d<? super Function2<? super h, ? super kotlin.coroutines.d<? super EnumC9053a>, ? extends Object>> dVar) {
        boolean booleanValue = bool.booleanValue();
        c cVar = new c(this.f108978f, dVar);
        cVar.f108976d = function2;
        cVar.f108977e = booleanValue;
        return cVar.invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Function2 function2;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        Function2 function22 = this.f108976d;
        if (this.f108977e) {
            return function22;
        }
        function2 = this.f108978f.f108997e;
        return function2;
    }
}
