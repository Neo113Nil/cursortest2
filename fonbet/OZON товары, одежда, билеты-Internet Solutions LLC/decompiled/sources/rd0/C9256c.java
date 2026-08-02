package rd0;

import Sc.s;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import xe.M;

@e(c = "ru.ozon.id.user.GetUserUseCase$execute$postResult$2", f = "GetUserUseCase.kt", l = {}, m = "invokeSuspend")
/* renamed from: rd0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C9256c extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Function1<InterfaceC9254a, Unit> f83325d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ InterfaceC9254a f83326e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C9256c(Function1<? super InterfaceC9254a, Unit> function1, InterfaceC9254a interfaceC9254a, kotlin.coroutines.d<? super C9256c> dVar) {
        super(2, dVar);
        this.f83325d = function1;
        this.f83326e = interfaceC9254a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C9256c(this.f83325d, this.f83326e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C9256c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        this.f83325d.invoke(this.f83326e);
        return Unit.f71690a;
    }
}
