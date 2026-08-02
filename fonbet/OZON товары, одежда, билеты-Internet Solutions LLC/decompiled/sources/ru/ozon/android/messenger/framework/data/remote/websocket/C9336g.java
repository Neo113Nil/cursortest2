package ru.ozon.android.messenger.framework.data.remote.websocket;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.remote.websocket.MessengerWebSocketDataSource", f = "MessengerWebSocketDataSource.kt", l = {199, 203}, m = "ensureSocketConnected")
/* renamed from: ru.ozon.android.messenger.framework.data.remote.websocket.g, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9336g extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f88040d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9331b f88041e;

    /* renamed from: f, reason: collision with root package name */
    int f88042f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9336g(C9331b c9331b, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f88041e = c9331b;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f88040d = obj;
        this.f88042f |= LinearLayoutManager.INVALID_OFFSET;
        return this.f88041e.m(false, this);
    }
}
