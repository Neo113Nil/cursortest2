package ru.ozon.android.messenger.framework.data.remote.websocket;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.data.requests.SendMessageRequest;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.remote.websocket.MessengerWebSocketDataSource", f = "MessengerWebSocketDataSource.kt", l = {273, 287}, m = "sendMessage")
/* renamed from: ru.ozon.android.messenger.framework.data.remote.websocket.u, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9349u extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    SendMessageRequest f88177d;

    /* renamed from: e, reason: collision with root package name */
    C9331b f88178e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f88179f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C9331b f88180g;

    /* renamed from: h, reason: collision with root package name */
    int f88181h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9349u(C9331b c9331b, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f88180g = c9331b;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f88179f = obj;
        this.f88181h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f88180g.w(null, this);
    }
}
