package gk0;

import android.content.Context;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.uikit.pool.precreation.RefillableViewPoolImpl$fill$1", f = "RefillableViewPool.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class y extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Tc.j f64566d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C6745A f64567e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Context f64568f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    y(Tc.j jVar, C6745A c6745a, Context context, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f64566d = jVar;
        this.f64567e = c6745a;
        this.f64568f = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new y(this.f64566d, this.f64567e, this.f64568f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((y) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Map map;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        Context context = this.f64568f;
        C6745A c6745a = this.f64567e;
        Tc.j jVar = this.f64566d;
        if (jVar != null) {
            Iterator<E> it = jVar.iterator();
            while (it.hasNext()) {
                C6745A.a(c6745a, context, (kotlin.reflect.d) it.next());
            }
        } else {
            map = c6745a.f64496a;
            Intrinsics.checkNotNullExpressionValue(map, "access$getViewInfo$p(...)");
            Iterator it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                kotlin.reflect.d dVar = (kotlin.reflect.d) ((Map.Entry) it2.next()).getKey();
                Intrinsics.f(dVar);
                C6745A.a(c6745a, context, dVar);
            }
        }
        return Unit.f71690a;
    }
}
