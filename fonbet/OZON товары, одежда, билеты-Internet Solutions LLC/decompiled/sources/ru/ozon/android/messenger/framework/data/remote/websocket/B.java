package ru.ozon.android.messenger.framework.data.remote.websocket;

import Ae.C0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.messenger.framework.data.remote.models.WebSocketMessageDTO;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.remote.websocket.MessengerWebSocketDataSource$socketDataListener$1$1", f = "MessengerWebSocketDataSource.kt", l = {101}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class B extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f87843d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9331b f87844e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ WebSocketMessageDTO f87845f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    B(C9331b c9331b, WebSocketMessageDTO webSocketMessageDTO, kotlin.coroutines.d<? super B> dVar) {
        super(2, dVar);
        this.f87844e = c9331b;
        this.f87845f = webSocketMessageDTO;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new B(this.f87844e, this.f87845f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((B) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        C0 c02;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f87843d;
        if (i11 == 0) {
            Sc.s.b(obj);
            c02 = this.f87844e.f87998k;
            this.f87843d = 1;
            if (c02.emit(this.f87845f, this) == aVar) {
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
