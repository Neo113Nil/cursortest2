package c30;

import Sc.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ta0.InterfaceC9791a;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.analytic.base.providers.providers.DeviceIdsProvider$requestDeviceIdsMap$4", f = "DeviceIdsProvider.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class g extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ b f56463d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(b bVar, kotlin.coroutines.d<? super g> dVar) {
        super(2, dVar);
        this.f56463d = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new g(this.f56463d, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((g) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        b bVar = this.f56463d;
        str = bVar.f56451e;
        if (str.length() > 0 && b.e(bVar).j()) {
            InterfaceC9791a e11 = b.e(bVar);
            str2 = bVar.f56451e;
            va0.b.a(e11, str2, new A50.b(bVar, 1), new f(0));
        }
        return Unit.f71690a;
    }
}
