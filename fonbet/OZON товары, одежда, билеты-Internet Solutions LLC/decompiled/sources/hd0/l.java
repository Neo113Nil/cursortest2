package hd0;

import Sc.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.id.nativeauth.sso2.Sso2MobileConfigResponseDTO;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.sso2.Sso2MobileConfigRepository$save$2", f = "Sso2MobileConfigRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class l extends kotlin.coroutines.jvm.internal.j implements Function2<W2.b, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f65376d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ i f65377e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Sso2MobileConfigResponseDTO f65378f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(i iVar, Sso2MobileConfigResponseDTO sso2MobileConfigResponseDTO, kotlin.coroutines.d<? super l> dVar) {
        super(2, dVar);
        this.f65377e = iVar;
        this.f65378f = sso2MobileConfigResponseDTO;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        l lVar = new l(this.f65377e, this.f65378f, dVar);
        lVar.f65376d = obj;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(W2.b bVar, kotlin.coroutines.d<? super Unit> dVar) {
        return ((l) create(bVar, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        W2.b bVar = (W2.b) this.f65376d;
        i iVar = this.f65377e;
        bVar.i(i.d(iVar), i.a(iVar).toJson(this.f65378f));
        return Unit.f71690a;
    }
}
