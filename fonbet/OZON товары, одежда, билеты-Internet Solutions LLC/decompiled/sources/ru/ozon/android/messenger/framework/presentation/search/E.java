package ru.ozon.android.messenger.framework.presentation.search;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.search.ChatSearchViewModel$restartSearch$4", f = "ChatSearchViewModel.kt", l = {422}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class E extends kotlin.coroutines.jvm.internal.j implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f91581d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9527g f91582e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f91583f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    E(C9527g c9527g, String str, kotlin.coroutines.d<? super E> dVar) {
        super(1, dVar);
        this.f91582e = c9527g;
        this.f91583f = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
        return new E(this.f91582e, this.f91583f, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
        return ((E) create(dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object Q02;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f91581d;
        if (i11 == 0) {
            Sc.s.b(obj);
            this.f91581d = 1;
            Q02 = this.f91582e.Q0(this.f91583f, this);
            if (Q02 == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        return Unit.f71690a;
    }
}
