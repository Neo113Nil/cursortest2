package ie0;

import Sc.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.ozon.mapsdk.common.geoproxy.model.exceptions.GeoProxyApiException;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.geoproxy.GeoProxyClient$makeApiCall$2", f = "GeoProxyClient.kt", l = {345}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class l extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<Object>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f66353d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ kotlin.coroutines.jvm.internal.j f66354e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    l(Function1<? super kotlin.coroutines.d<Object>, ? extends Object> function1, kotlin.coroutines.d<? super l> dVar) {
        super(2, dVar);
        this.f66354e = (kotlin.coroutines.jvm.internal.j) function1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function1] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new l(this.f66354e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<Object> dVar) {
        return ((l) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function1] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f66353d;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return obj;
            }
            s.b(obj);
            ?? r42 = this.f66354e;
            this.f66353d = 1;
            Object invoke = r42.invoke(this);
            return invoke == aVar ? aVar : invoke;
        } catch (Throwable th2) {
            throw new GeoProxyApiException(th2.getMessage(), th2);
        }
    }
}
