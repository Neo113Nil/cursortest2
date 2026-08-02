package ru.ozon.android.messenger.framework.data.remote.websocket;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.remote.websocket.MessengerWebSocketDataSource", f = "MessengerWebSocketDataSource.kt", l = {263}, m = "captureSocketConnectionResultWithTimeout")
/* renamed from: ru.ozon.android.messenger.framework.data.remote.websocket.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9332c extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f88008d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9331b f88009e;

    /* renamed from: f, reason: collision with root package name */
    int f88010f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9332c(C9331b c9331b, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f88009e = c9331b;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object i11;
        this.f88008d = obj;
        this.f88010f |= LinearLayoutManager.INVALID_OFFSET;
        i11 = this.f88009e.i(this);
        return i11;
    }
}
