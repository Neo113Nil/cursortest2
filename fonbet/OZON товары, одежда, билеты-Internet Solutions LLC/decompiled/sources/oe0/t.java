package oe0;

import android.location.Location;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.locationcontroller.locationProvider.LocationProviderImp$requestCurrentLocationRaw$locationResult$1", f = "LocationProviderImp.kt", l = {90}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class t extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Sc.r<? extends Location>>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f78245d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ o f78246e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t(o oVar, kotlin.coroutines.d<? super t> dVar) {
        super(2, dVar);
        this.f78246e = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new t(this.f78246e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Sc.r<? extends Location>> dVar) {
        return ((t) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object b11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f78245d;
        if (i11 == 0) {
            Sc.s.b(obj);
            this.f78245d = 1;
            b11 = o.b(this.f78246e, this);
            if (b11 == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
            b11 = ((Sc.r) obj).getF26106a();
        }
        return Sc.r.a(b11);
    }
}
