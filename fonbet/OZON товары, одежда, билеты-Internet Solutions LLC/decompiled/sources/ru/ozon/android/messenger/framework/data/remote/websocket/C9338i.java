package ru.ozon.android.messenger.framework.data.remote.websocket;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.data.requests.GetChatsRequest;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.remote.websocket.MessengerWebSocketDataSource", f = "MessengerWebSocketDataSource.kt", l = {273, 287}, m = "getChats")
/* renamed from: ru.ozon.android.messenger.framework.data.remote.websocket.i, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9338i extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    GetChatsRequest f88063d;

    /* renamed from: e, reason: collision with root package name */
    C9331b f88064e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f88065f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C9331b f88066g;

    /* renamed from: h, reason: collision with root package name */
    int f88067h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9338i(C9331b c9331b, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f88066g = c9331b;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f88065f = obj;
        this.f88067h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f88066g.n(null, this);
    }
}
