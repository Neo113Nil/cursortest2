package ru.ozon.android.messenger.framework.data.remote.websocket;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.remote.websocket.MessengerWebSocketDataSource", f = "MessengerWebSocketDataSource.kt", l = {273, 287}, m = "initializeChat")
/* renamed from: ru.ozon.android.messenger.framework.data.remote.websocket.o, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9344o extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C9331b f88119d;

    /* renamed from: e, reason: collision with root package name */
    ru.ozon.android.messenger.framework.data.requests.c f88120e;

    /* renamed from: f, reason: collision with root package name */
    C9331b f88121f;

    /* renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f88122g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ C9331b f88123h;

    /* renamed from: i, reason: collision with root package name */
    int f88124i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9344o(C9331b c9331b, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f88123h = c9331b;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f88122g = obj;
        this.f88124i |= LinearLayoutManager.INVALID_OFFSET;
        return this.f88123h.t(null, this);
    }
}
