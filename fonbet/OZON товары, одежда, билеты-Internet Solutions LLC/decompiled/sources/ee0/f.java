package ee0;

import ge0.C6723a;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import we0.s;
import we0.u;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.clustercontroller.implementation.ClusterRenderer$renderPlacemarks$2", f = "ClusterRenderer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class f extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ e f62201d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C6723a<u> f62202e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ ArrayList f62203f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C6723a<s> f62204g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ ArrayList f62205h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(e eVar, C6723a c6723a, ArrayList arrayList, C6723a c6723a2, ArrayList arrayList2, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f62201d = eVar;
        this.f62202e = c6723a;
        this.f62203f = arrayList;
        this.f62204g = c6723a2;
        this.f62205h = arrayList2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        C6723a<s> c6723a = this.f62204g;
        ArrayList arrayList = this.f62205h;
        return new f(this.f62201d, this.f62202e, this.f62203f, c6723a, arrayList, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Function0 function0;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        e eVar = this.f62201d;
        eVar.o().j(eVar.f62196k, this.f62202e.b());
        eVar.f62191f.o(eVar.f62196k, this.f62203f);
        eVar.o().j(eVar.f62196k, this.f62204g.b());
        eVar.f62191f.o(eVar.f62196k, this.f62205h);
        function0 = eVar.f62198m;
        if (function0 == null) {
            return null;
        }
        function0.invoke();
        return Unit.f71690a;
    }
}
