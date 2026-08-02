package zf0;

import N3.C3660k;
import Sc.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qf0.EnumC9053a;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.network.domain.reachability.domain.DomainData$lastPingResultFlow$5", f = "PeriodicPingInteractor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class e extends kotlin.coroutines.jvm.internal.j implements Function2<EnumC9053a, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f108982d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ h f108983e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(h hVar, kotlin.coroutines.d<? super e> dVar) {
        super(2, dVar);
        this.f108983e = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        e eVar = new e(this.f108983e, dVar);
        eVar.f108982d = obj;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(EnumC9053a enumC9053a, kotlin.coroutines.d<? super Unit> dVar) {
        return ((e) create(enumC9053a, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Af0.a aVar;
        Af0.a aVar2;
        boolean d11;
        ru.ozon.android.ozonLogger.core.h a11;
        Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        EnumC9053a enumC9053a = (EnumC9053a) this.f108982d;
        long currentTimeMillis = System.currentTimeMillis();
        h hVar = this.f108983e;
        hVar.f109001i = currentTimeMillis;
        aVar = hVar.f108996d;
        aVar.e(hVar.g(), enumC9053a);
        if (hVar.f() != enumC9053a) {
            aVar2 = hVar.f108996d;
            d11 = aVar2.d();
            if (d11 && (a11 = Af0.a.a(aVar2)) != null) {
                String g10 = hVar.g();
                String b11 = Rf0.a.b(hVar.f());
                String b12 = Rf0.a.b(enumC9053a);
                StringBuilder d12 = C3660k.d("Статус ", g10, " обновился: ", b11, " -> ");
                d12.append(b12);
                a11.b(d12.toString(), null, null);
            }
        }
        hVar.f109000h = enumC9053a;
        return Unit.f71690a;
    }
}
