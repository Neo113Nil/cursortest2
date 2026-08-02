package jj0;

import Sc.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.tracker.debug.menu.shared.configuration.domain.usecase.impl.ResetConfigsUseCaseImpl$invoke$2", f = "ResetConfigsUseCaseImpl.kt", l = {23}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class g extends kotlin.coroutines.jvm.internal.j implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f70152d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ i f70153e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ fj0.d<?> f70154f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(i iVar, fj0.d<?> dVar, kotlin.coroutines.d<? super g> dVar2) {
        super(1, dVar2);
        this.f70153e = iVar;
        this.f70154f = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
        return new g(this.f70153e, this.f70154f, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
        return ((g) create(dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f70152d;
        if (i11 == 0) {
            s.b(obj);
            this.f70152d = 1;
            if (i.b(this.f70153e, this.f70154f, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }
}
