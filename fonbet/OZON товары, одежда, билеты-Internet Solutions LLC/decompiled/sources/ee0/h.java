package ee0;

import Sc.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import we0.u;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.clustercontroller.implementation.ClusterRenderer$updatePlacemarkContent$2", f = "ClusterRenderer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class h extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ e f62210d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ u f62211e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(e eVar, u uVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f62210d = eVar;
        this.f62211e = uVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new h(this.f62210d, this.f62211e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((h) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        u uVar = this.f62211e;
        e eVar = this.f62210d;
        eVar.o().b(200L, uVar.e());
        eVar.o().m(uVar, 200L);
        return Unit.f71690a;
    }
}
