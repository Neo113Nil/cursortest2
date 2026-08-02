package nc0;

import Sc.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.crossApp.CrossAppAutologinUseCase$autologinInitialRun$2", f = "CrossAppAutologinUseCase.kt", l = {}, m = "invokeSuspend")
/* renamed from: nc0.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C8503n extends kotlin.coroutines.jvm.internal.j implements Function2<W2.b, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f76819d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ q f76820e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C8503n(q qVar, kotlin.coroutines.d<? super C8503n> dVar) {
        super(2, dVar);
        this.f76820e = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        C8503n c8503n = new C8503n(this.f76820e, dVar);
        c8503n.f76819d = obj;
        return c8503n;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(W2.b bVar, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C8503n) create(bVar, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        ((W2.b) this.f76819d).i(q.f(this.f76820e), Boolean.TRUE);
        return Unit.f71690a;
    }
}
