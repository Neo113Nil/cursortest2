package fe0;

import Sc.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.Algorithm;
import we0.u;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.clustercontroller.implementation.clusterizer.BasePlacemarkClusterizer$updatePlacemark$1", f = "BasePlacemarkClusterizer.kt", l = {210}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class g extends kotlin.coroutines.jvm.internal.j implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f63350d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C6547a<Algorithm<u>> f63351e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ u f63352f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ u f63353g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(C6547a c6547a, u uVar, u uVar2, kotlin.coroutines.d dVar) {
        super(1, dVar);
        this.f63351e = c6547a;
        this.f63352f = uVar;
        this.f63353g = uVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
        u uVar = this.f63353g;
        return new g(this.f63351e, this.f63352f, uVar, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
        return ((g) create(dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f63350d;
        if (i11 == 0) {
            s.b(obj);
            ee0.e eVar = ((C6547a) this.f63351e).f63274d;
            this.f63350d = 1;
            if (eVar.u(this.f63352f, this.f63353g, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }
}
