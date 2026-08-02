package fe0;

import Sc.s;
import fe0.C6547a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.Algorithm;
import we0.u;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.clustercontroller.implementation.clusterizer.BasePlacemarkClusterizer$addEventToQueue$1", f = "BasePlacemarkClusterizer.kt", l = {}, m = "invokeSuspend")
/* renamed from: fe0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6548b extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C6547a<Algorithm<u>> f63327d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C6547a.b f63328e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6548b(C6547a<Algorithm<u>> c6547a, C6547a.b bVar, kotlin.coroutines.d<? super C6548b> dVar) {
        super(2, dVar);
        this.f63327d = c6547a;
        this.f63328e = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C6548b(this.f63327d, this.f63328e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C6548b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        C6547a.c cVar;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        cVar = ((C6547a) this.f63327d).f63285o;
        cVar.b(this.f63328e);
        return Unit.f71690a;
    }
}
