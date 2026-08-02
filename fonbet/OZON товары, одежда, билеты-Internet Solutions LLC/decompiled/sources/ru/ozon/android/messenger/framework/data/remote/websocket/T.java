package ru.ozon.android.messenger.framework.data.remote.websocket;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.remote.websocket.WebSocketResolver$closeWebSocket$2", f = "WebSocketResolver.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class T extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ U f87964d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    T(U u11, kotlin.coroutines.d<? super T> dVar) {
        super(2, dVar);
        this.f87964d = u11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new T(this.f87964d, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((T) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        We.E e11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        U u11 = this.f87964d;
        e11 = u11.f87971g;
        e11.k().a();
        We.Q g10 = u11.g();
        if (g10 != null) {
            g10.a(1000, null);
        }
        u11.f87970f = null;
        return Unit.f71690a;
    }
}
