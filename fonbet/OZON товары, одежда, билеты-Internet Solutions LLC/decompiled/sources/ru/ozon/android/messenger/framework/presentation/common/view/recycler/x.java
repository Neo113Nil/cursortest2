package ru.ozon.android.messenger.framework.presentation.common.view.recycler;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.common.view.recycler.PaginationListenerKt$MessengerPaginationHandler$1$1$2$2", f = "PaginationListener.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class x extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ u f91280d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    x(u uVar, kotlin.coroutines.d<? super x> dVar) {
        super(2, dVar);
        this.f91280d = uVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new x(this.f91280d, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((x) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        this.f91280d.G();
        return Unit.f71690a;
    }
}
