package ru.ozon.android.messenger.framework.data.remote.websocket;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.remote.websocket.MessengerWebSocketDataSource", f = "MessengerWebSocketDataSource.kt", l = {273, 287}, m = "userIsTyping")
/* loaded from: classes10.dex */
final class H extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    ru.ozon.android.messenger.framework.data.requests.k f87917d;

    /* renamed from: e, reason: collision with root package name */
    C9331b f87918e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f87919f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C9331b f87920g;

    /* renamed from: h, reason: collision with root package name */
    int f87921h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    H(C9331b c9331b, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f87920g = c9331b;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f87919f = obj;
        this.f87921h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f87920g.C(null, this);
    }
}
