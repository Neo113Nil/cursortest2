package ru.ozon.android.messenger.framework.data.remote.websocket;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.remote.websocket.MessengerWebSocketDataSource", f = "MessengerWebSocketDataSource.kt", l = {273, 287}, m = "setAiState")
/* loaded from: classes10.dex */
final class w extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    ru.ozon.android.messenger.framework.data.requests.ai.a f88202d;

    /* renamed from: e, reason: collision with root package name */
    C9331b f88203e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f88204f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C9331b f88205g;

    /* renamed from: h, reason: collision with root package name */
    int f88206h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w(C9331b c9331b, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f88205g = c9331b;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f88204f = obj;
        this.f88206h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f88205g.x(null, this);
    }
}
