package jj0;

import Sc.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.tracker.debug.menu.shared.configuration.domain.usecase.impl.ResetConfigsUseCaseImpl$invoke$tasks$1$1", f = "ResetConfigsUseCaseImpl.kt", l = {19}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class h extends kotlin.coroutines.jvm.internal.j implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f70155d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ i f70156e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ fj0.d<?>[] f70157f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ int f70158g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(i iVar, fj0.d<?>[] dVarArr, int i11, kotlin.coroutines.d<? super h> dVar) {
        super(1, dVar);
        this.f70156e = iVar;
        this.f70157f = dVarArr;
        this.f70158g = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
        return new h(this.f70156e, this.f70157f, this.f70158g, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
        return ((h) create(dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f70155d;
        if (i11 == 0) {
            s.b(obj);
            fj0.d<?> dVar = this.f70157f[this.f70158g];
            this.f70155d = 1;
            if (i.b(this.f70156e, dVar, this) == aVar) {
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
