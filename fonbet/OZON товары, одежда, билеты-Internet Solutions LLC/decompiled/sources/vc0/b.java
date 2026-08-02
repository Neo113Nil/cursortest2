package vc0;

import Sc.s;
import W2.f;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.data.AppInfoRepository$getUniqueApplicationId$2$1", f = "AppInfoRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class b extends j implements Function2<W2.b, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f102825d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ c f102826e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f102827f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(c cVar, String str, kotlin.coroutines.d<? super b> dVar) {
        super(2, dVar);
        this.f102826e = cVar;
        this.f102827f = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        b bVar = new b(this.f102826e, this.f102827f, dVar);
        bVar.f102825d = obj;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(W2.b bVar, kotlin.coroutines.d<? super Unit> dVar) {
        return ((b) create(bVar, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        f.a aVar;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        W2.b bVar = (W2.b) this.f102825d;
        aVar = this.f102826e.f102829b;
        bVar.i(aVar, this.f102827f);
        return Unit.f71690a;
    }
}
