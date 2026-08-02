package ru.ozon.android.messenger.framework.data.remote.websocket;

import Ae.C0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.data.remote.models.SocketEventDTO;
import ru.ozon.android.messenger.framework.data.remote.models.WebSocketMessageDTO;

/* renamed from: ru.ozon.android.messenger.framework.data.remote.websocket.j, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9339j implements InterfaceC2395h<List<? extends SocketEventDTO>> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C0 f88068a;

    /* renamed from: ru.ozon.android.messenger.framework.data.remote.websocket.j$a */
    public static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2397i f88069a;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.remote.websocket.MessengerWebSocketDataSource$getEvents$$inlined$map$1$2", f = "MessengerWebSocketDataSource.kt", l = {223}, m = "emit")
        /* renamed from: ru.ozon.android.messenger.framework.data.remote.websocket.j$a$a, reason: collision with other inner class name */
        public static final class C1600a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f88070d;

            /* renamed from: e, reason: collision with root package name */
            int f88071e;

            public C1600a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f88070d = obj;
                this.f88071e |= LinearLayoutManager.INVALID_OFFSET;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC2397i interfaceC2397i) {
            this.f88069a = interfaceC2397i;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // Ae.InterfaceC2397i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
            C1600a c1600a;
            int i11;
            if (dVar instanceof C1600a) {
                c1600a = (C1600a) dVar;
                int i12 = c1600a.f88071e;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c1600a.f88071e = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj2 = c1600a.f88070d;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c1600a.f88071e;
                    if (i11 != 0) {
                        Sc.s.b(obj2);
                        List<SocketEventDTO> events = ((WebSocketMessageDTO) obj).getPayload().getEvents();
                        c1600a.f88071e = 1;
                        if (this.f88069a.emit(events, c1600a) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Sc.s.b(obj2);
                    }
                    return Unit.f71690a;
                }
            }
            c1600a = new C1600a(dVar);
            Object obj22 = c1600a.f88070d;
            Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
            i11 = c1600a.f88071e;
            if (i11 != 0) {
            }
            return Unit.f71690a;
        }
    }

    public C9339j(C0 c02) {
        this.f88068a = c02;
    }

    @Override // Ae.InterfaceC2395h
    public final Object collect(@NotNull InterfaceC2397i<? super List<? extends SocketEventDTO>> interfaceC2397i, @NotNull kotlin.coroutines.d dVar) {
        Object collect = this.f88068a.collect(new a(interfaceC2397i), dVar);
        return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
    }
}
