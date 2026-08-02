package zf0;

import Sc.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.networkinfo.models.NetworkInfo;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.network.domain.reachability.domain.DomainData$lastPingResultFlow$1", f = "PeriodicPingInteractor.kt", l = {}, m = "invokeSuspend")
/* renamed from: zf0.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C11119a extends kotlin.coroutines.jvm.internal.j implements Function2<NetworkInfo, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f108972d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ h f108973e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C11119a(h hVar, kotlin.coroutines.d<? super C11119a> dVar) {
        super(2, dVar);
        this.f108973e = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        C11119a c11119a = new C11119a(this.f108973e, dVar);
        c11119a.f108972d = obj;
        return c11119a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(NetworkInfo networkInfo, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C11119a) create(networkInfo, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Af0.a aVar;
        boolean d11;
        ru.ozon.android.ozonLogger.core.h a11;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        NetworkInfo networkInfo = (NetworkInfo) this.f108972d;
        aVar = this.f108973e.f108996d;
        d11 = aVar.d();
        if (d11 && (a11 = Af0.a.a(aVar)) != null) {
            a11.b("Текущий тип подключения " + networkInfo, null, null);
        }
        return Unit.f71690a;
    }
}
