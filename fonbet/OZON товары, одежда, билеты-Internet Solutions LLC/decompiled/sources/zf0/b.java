package zf0;

import Sc.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.network.domain.reachability.domain.DomainData$lastPingResultFlow$2", f = "PeriodicPingInteractor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class b extends kotlin.coroutines.jvm.internal.j implements Function2<Boolean, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ boolean f108974d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ h f108975e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(h hVar, kotlin.coroutines.d<? super b> dVar) {
        super(2, dVar);
        this.f108975e = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        b bVar = new b(this.f108975e, dVar);
        bVar.f108974d = ((Boolean) obj).booleanValue();
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, kotlin.coroutines.d<? super Unit> dVar) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((b) create(bool2, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Af0.a aVar;
        boolean d11;
        ru.ozon.android.ozonLogger.core.h a11;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        boolean z11 = this.f108974d;
        h hVar = this.f108975e;
        aVar = hVar.f108996d;
        d11 = aVar.d();
        if (d11 && (a11 = Af0.a.a(aVar)) != null) {
            a11.b("Текущий тип сети подходит для " + hVar.g() + ": " + z11, null, null);
        }
        return Unit.f71690a;
    }
}
