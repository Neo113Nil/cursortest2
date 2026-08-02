package gk0;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.uikit.pool.precreation.RefillableViewPoolImpl$fillPoolByTypeAsync$1", f = "RefillableViewPool.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class z extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C6745A f64569d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ kotlin.reflect.d<? extends View> f64570e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Resources f64571f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Context f64572g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z(C6745A c6745a, kotlin.reflect.d<? extends View> dVar, Resources resources, Context context, kotlin.coroutines.d<? super z> dVar2) {
        super(2, dVar2);
        this.f64569d = c6745a;
        this.f64570e = dVar;
        this.f64571f = resources;
        this.f64572g = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new z(this.f64569d, this.f64570e, this.f64571f, this.f64572g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((z) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Map map;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        C6745A c6745a = this.f64569d;
        map = c6745a.f64496a;
        kotlin.reflect.d<? extends View> dVar = this.f64570e;
        x xVar = (x) map.get(dVar);
        int a11 = xVar != null ? xVar.a() : 0;
        while (true) {
            Resources resources = this.f64571f;
            Intrinsics.f(resources);
            if (C6745A.c(c6745a, dVar, a11, resources)) {
                return Unit.f71690a;
            }
            C6745A.d(c6745a, this.f64572g, resources, dVar);
        }
    }
}
