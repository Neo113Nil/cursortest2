package yi;

import Sc.s;
import V.g;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.gallery.camera.data.CameraStateProviderImpl$initialize$2$provider$1", f = "CameraStateProvider.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class o extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super V.g>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ k f106742d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(k kVar, kotlin.coroutines.d<? super o> dVar) {
        super(2, dVar);
        this.f106742d = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new o(this.f106742d, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super V.g> dVar) {
        return ((o) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        int i11 = V.g.f27884i;
        return g.a.a(this.f106742d.f106697a).get();
    }
}
