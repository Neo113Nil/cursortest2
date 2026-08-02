package ru.ozon.android.messenger.framework.data.remote.websocket;

import Lm0.a;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.data.remote.websocket.L;

/* loaded from: classes10.dex */
public final class J extends We.S {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<String, Unit> f87930a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<L, Unit> f87931b;

    public static final class a {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public J(@NotNull Function1<? super String, Unit> socketDataListener, @NotNull Function1<? super L, Unit> socketTechEventsListener) {
        Intrinsics.checkNotNullParameter(socketDataListener, "socketDataListener");
        Intrinsics.checkNotNullParameter(socketTechEventsListener, "socketTechEventsListener");
        this.f87930a = socketDataListener;
        this.f87931b = socketTechEventsListener;
    }

    @Override // We.S
    public final void onClosed(@NotNull We.Q webSocket, int i11, @NotNull String reason) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Lm0.a.f17149a.i("Connection closed: code %s, reason - %s", Integer.valueOf(i11), reason);
        this.f87931b.invoke(L.a.f87933a);
    }

    @Override // We.S
    public final void onClosing(@NotNull We.Q webSocket, int i11, @NotNull String reason) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(reason, "reason");
        super.onClosing(webSocket, i11, reason);
        this.f87931b.invoke(L.b.f87934a);
    }

    @Override // We.S
    public final void onFailure(@NotNull We.Q webSocket, @NotNull Throwable t2, We.L l11) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(t2, "t");
        a.b bVar = Lm0.a.f17149a;
        bVar.i(Nk.a.b("Connection failed: reason - ", t2.getLocalizedMessage()), new Object[0]);
        this.f87931b.invoke(new L.c(t2));
        if (t2 instanceof IOException) {
            return;
        }
        bVar.w(t2);
    }

    @Override // We.S
    public final void onMessage(@NotNull We.Q webSocket, @NotNull String text) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(text, "text");
        Lm0.a.f17149a.d(Nk.a.b("onMessage: ", text), new Object[0]);
        this.f87930a.invoke(text);
    }

    @Override // We.S
    public final void onOpen(@NotNull We.Q webSocket, @NotNull We.L response) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(response, "response");
        Lm0.a.f17149a.i("Connection opened", new Object[0]);
        this.f87931b.invoke(L.d.f87936a);
    }
}
