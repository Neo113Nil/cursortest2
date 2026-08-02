package ru.ozon.android.messenger.framework.data.remote.websocket;

import Ae.C2401k;
import Ae.InterfaceC2395h;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.messenger.framework.data.remote.models.SocketEventDTO;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.remote.websocket.MessengerWebSocketDataSource$getEvents$2", f = "MessengerWebSocketDataSource.kt", l = {}, m = "invokeSuspend")
/* renamed from: ru.ozon.android.messenger.framework.data.remote.websocket.k, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9340k extends kotlin.coroutines.jvm.internal.j implements Function2<List<? extends SocketEventDTO>, kotlin.coroutines.d<? super InterfaceC2395h<? extends SocketEventDTO>>, Object> {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f88073d;

    C9340k() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        C9340k c9340k = new C9340k(2, dVar);
        c9340k.f88073d = obj;
        return c9340k;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends SocketEventDTO> list, kotlin.coroutines.d<? super InterfaceC2395h<? extends SocketEventDTO>> dVar) {
        return ((C9340k) create(list, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        return new C2401k((List) this.f88073d);
    }
}
