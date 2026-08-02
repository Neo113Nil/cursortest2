package fe0;

import Sc.s;
import ce0.InterfaceC5817a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.Algorithm;
import we0.C10551g;
import we0.u;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.clustercontroller.implementation.clusterizer.BasePlacemarkClusterizer$getCurrentPosition$2", f = "BasePlacemarkClusterizer.kt", l = {}, m = "invokeSuspend")
/* renamed from: fe0.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6551e extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super C10551g>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C6547a<Algorithm<u>> f63343d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6551e(C6547a<Algorithm<u>> c6547a, kotlin.coroutines.d<? super C6551e> dVar) {
        super(2, dVar);
        this.f63343d = c6547a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C6551e(this.f63343d, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super C10551g> dVar) {
        return ((C6551e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC5817a interfaceC5817a;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        interfaceC5817a = ((C6547a) this.f63343d).f63273c;
        return interfaceC5817a.getCurrentPosition();
    }
}
