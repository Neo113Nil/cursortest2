package oe0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import te0.C9867b;
import xe.d1;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.locationcontroller.locationProvider.FusedSubscribeLocationUpdates$startListening$1$1", f = "FusedSubscribeLocationUpdates.kt", l = {}, m = "invokeSuspend")
/* renamed from: oe0.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C8718i extends kotlin.coroutines.jvm.internal.j implements Function2<Throwable, kotlin.coroutines.d<? super Boolean>, Object> {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f78196d;

    C8718i() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        C8718i c8718i = new C8718i(2, dVar);
        c8718i.f78196d = obj;
        return c8718i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Throwable th2, kotlin.coroutines.d<? super Boolean> dVar) {
        return ((C8718i) create(th2, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        if (!(((Throwable) this.f78196d) instanceof d1)) {
            return Boolean.FALSE;
        }
        C9867b.g("Work timeout for receive locations, try reload subscription", null, 6);
        return Boolean.TRUE;
    }
}
