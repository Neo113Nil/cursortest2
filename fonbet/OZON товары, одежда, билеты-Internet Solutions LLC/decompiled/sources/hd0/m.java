package hd0;

import Sc.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.sso2.Sso2MobileConfigRepository$saveLastAppVersion$2", f = "Sso2MobileConfigRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class m extends kotlin.coroutines.jvm.internal.j implements Function2<W2.b, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f65379d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ i f65380e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f65381f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(i iVar, String str, kotlin.coroutines.d<? super m> dVar) {
        super(2, dVar);
        this.f65380e = iVar;
        this.f65381f = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        m mVar = new m(this.f65380e, this.f65381f, dVar);
        mVar.f65379d = obj;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(W2.b bVar, kotlin.coroutines.d<? super Unit> dVar) {
        return ((m) create(bVar, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        ((W2.b) this.f65379d).i(i.b(this.f65380e), this.f65381f);
        return Unit.f71690a;
    }
}
