package ru.ozon.android.messenger.framework.data.remote.websocket;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.remote.websocket.MessengerWebSocketDataSource", f = "MessengerWebSocketDataSource.kt", l = {273, 287}, m = "chatEnter")
/* renamed from: ru.ozon.android.messenger.framework.data.remote.websocket.f, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9335f extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C9331b f88034d;

    /* renamed from: e, reason: collision with root package name */
    ru.ozon.android.messenger.framework.data.requests.a f88035e;

    /* renamed from: f, reason: collision with root package name */
    C9331b f88036f;

    /* renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f88037g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ C9331b f88038h;

    /* renamed from: i, reason: collision with root package name */
    int f88039i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9335f(C9331b c9331b, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f88038h = c9331b;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f88037g = obj;
        this.f88039i |= LinearLayoutManager.INVALID_OFFSET;
        return this.f88038h.j(null, this);
    }
}
