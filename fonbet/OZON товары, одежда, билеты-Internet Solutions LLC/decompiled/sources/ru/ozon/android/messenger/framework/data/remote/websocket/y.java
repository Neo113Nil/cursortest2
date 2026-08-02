package ru.ozon.android.messenger.framework.data.remote.websocket;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.remote.websocket.MessengerWebSocketDataSource", f = "MessengerWebSocketDataSource.kt", l = {273, 287}, m = "setReadMessages")
/* loaded from: classes10.dex */
final class y extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    ru.ozon.android.messenger.framework.data.requests.g f88227d;

    /* renamed from: e, reason: collision with root package name */
    C9331b f88228e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f88229f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C9331b f88230g;

    /* renamed from: h, reason: collision with root package name */
    int f88231h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    y(C9331b c9331b, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f88230g = c9331b;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f88229f = obj;
        this.f88231h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f88230g.y(null, this);
    }
}
