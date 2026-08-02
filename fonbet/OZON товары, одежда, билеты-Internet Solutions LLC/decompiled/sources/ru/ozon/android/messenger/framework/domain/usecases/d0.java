package ru.ozon.android.messenger.framework.domain.usecases;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.domain.usecases.StartOrGetChatUseCase$invoke$2", f = "StartOrGetChatUseCase.kt", l = {17}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class d0 extends kotlin.coroutines.jvm.internal.j implements Function1<kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends ru.ozon.android.messenger.framework.presentation.models.responses.m>>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f89066d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ e0 f89067e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.data.requests.i f89068f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d0(e0 e0Var, ru.ozon.android.messenger.framework.data.requests.i iVar, kotlin.coroutines.d<? super d0> dVar) {
        super(1, dVar);
        this.f89067e = e0Var;
        this.f89068f = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
        return new d0(this.f89067e, this.f89068f, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends ru.ozon.android.messenger.framework.presentation.models.responses.m>> dVar) {
        return ((d0) create(dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ru.ozon.android.messenger.framework.domain.repository.b bVar;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f89066d;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
            return obj;
        }
        Sc.s.b(obj);
        bVar = this.f89067e.f89070a;
        this.f89066d = 1;
        Object e11 = bVar.e(this.f89068f, this);
        return e11 == aVar ? aVar : e11;
    }
}
