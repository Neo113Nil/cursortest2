package ru.ozon.android.messenger.framework.data.remote.websocket;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.remote.websocket.MessengerWebSocketDataSource", f = "MessengerWebSocketDataSource.kt", l = {273, 287}, m = "searchChats")
/* renamed from: ru.ozon.android.messenger.framework.data.remote.websocket.s, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9347s extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C9331b f88151d;

    /* renamed from: e, reason: collision with root package name */
    ru.ozon.android.messenger.framework.data.requests.f f88152e;

    /* renamed from: f, reason: collision with root package name */
    C9331b f88153f;

    /* renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f88154g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ C9331b f88155h;

    /* renamed from: i, reason: collision with root package name */
    int f88156i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9347s(C9331b c9331b, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f88155h = c9331b;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f88154g = obj;
        this.f88156i |= LinearLayoutManager.INVALID_OFFSET;
        return this.f88155h.v(null, this);
    }
}
