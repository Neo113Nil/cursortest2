package c30;

import Sc.s;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.analytic.base.providers.providers.DeviceIdsProvider$requestDeviceIdsMap$3", f = "DeviceIdsProvider.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class e extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ b f56461d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(b bVar, kotlin.coroutines.d<? super e> dVar) {
        super(2, dVar);
        this.f56461d = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new e(this.f56461d, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        b bVar = this.f56461d;
        String f7 = b.f(bVar);
        if (f7 != null && f7.length() != 0) {
            bVar.f56453g.tryEmit(new Pair("a_sec_id", f7));
        }
        return Unit.f71690a;
    }
}
