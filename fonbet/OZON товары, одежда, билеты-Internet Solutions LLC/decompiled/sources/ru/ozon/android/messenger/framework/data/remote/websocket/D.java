package ru.ozon.android.messenger.framework.data.remote.websocket;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.remote.websocket.MessengerWebSocketDataSource", f = "MessengerWebSocketDataSource.kt", l = {273, 287}, m = "startOrGetChat")
/* loaded from: classes10.dex */
final class D extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C9331b f87866d;

    /* renamed from: e, reason: collision with root package name */
    ru.ozon.android.messenger.framework.data.requests.i f87867e;

    /* renamed from: f, reason: collision with root package name */
    C9331b f87868f;

    /* renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f87869g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ C9331b f87870h;

    /* renamed from: i, reason: collision with root package name */
    int f87871i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    D(C9331b c9331b, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f87870h = c9331b;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f87869g = obj;
        this.f87871i |= LinearLayoutManager.INVALID_OFFSET;
        return this.f87870h.A(null, this);
    }
}
