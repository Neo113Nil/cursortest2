package od0;

import Sc.s;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import xe.M;

@e(c = "ru.ozon.id.switchUser.SwitchUserUseCase$execute$postResult$2", f = "SwitchUserUseCase.kt", l = {}, m = "invokeSuspend")
/* renamed from: od0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C8698d extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Function1<InterfaceC8695a, Unit> f78092d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ InterfaceC8695a f78093e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C8698d(Function1<? super InterfaceC8695a, Unit> function1, InterfaceC8695a interfaceC8695a, kotlin.coroutines.d<? super C8698d> dVar) {
        super(2, dVar);
        this.f78092d = function1;
        this.f78093e = interfaceC8695a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C8698d(this.f78092d, this.f78093e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C8698d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        this.f78092d.invoke(this.f78093e);
        return Unit.f71690a;
    }
}
