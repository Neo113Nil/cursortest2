package ee0;

import ge0.C6723a;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import we0.s;
import we0.u;
import xe.M;
import xe0.InterfaceC10766e;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.clustercontroller.implementation.ClusterRenderer$renderPlacemarks$3", f = "ClusterRenderer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class g extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ e f62206d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C6723a<u> f62207e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C6723a<s> f62208f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ ArrayList f62209g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(e eVar, C6723a c6723a, C6723a c6723a2, ArrayList arrayList, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f62206d = eVar;
        this.f62207e = c6723a;
        this.f62208f = c6723a2;
        this.f62209g = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        C6723a<s> c6723a = this.f62208f;
        ArrayList arrayList = this.f62209g;
        return new g(this.f62206d, this.f62207e, c6723a, arrayList, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((g) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Function0 function0;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        e eVar = this.f62206d;
        InterfaceC10766e o11 = eVar.o();
        C6723a<u> c6723a = this.f62207e;
        o11.j(eVar.f62196k, c6723a.b());
        eVar.o().c(eVar.f62196k, c6723a.a());
        eVar.o().j(eVar.f62196k, this.f62208f.b());
        eVar.o().c(eVar.f62196k, this.f62209g);
        function0 = eVar.f62198m;
        if (function0 == null) {
            return null;
        }
        function0.invoke();
        return Unit.f71690a;
    }
}
