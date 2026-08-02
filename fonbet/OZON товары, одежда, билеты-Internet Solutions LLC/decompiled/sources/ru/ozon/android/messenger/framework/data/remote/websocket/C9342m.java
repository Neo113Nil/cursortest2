package ru.ozon.android.messenger.framework.data.remote.websocket;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.remote.websocket.MessengerWebSocketDataSource", f = "MessengerWebSocketDataSource.kt", l = {273, 287}, m = "getMessages")
/* renamed from: ru.ozon.android.messenger.framework.data.remote.websocket.m, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9342m extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    ru.ozon.android.messenger.framework.data.requests.b f88094d;

    /* renamed from: e, reason: collision with root package name */
    C9331b f88095e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f88096f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C9331b f88097g;

    /* renamed from: h, reason: collision with root package name */
    int f88098h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9342m(C9331b c9331b, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f88097g = c9331b;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f88096f = obj;
        this.f88098h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f88097g.q(null, this);
    }
}
