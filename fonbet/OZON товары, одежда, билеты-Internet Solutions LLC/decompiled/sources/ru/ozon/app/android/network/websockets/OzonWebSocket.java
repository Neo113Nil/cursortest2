package ru.ozon.app.android.network.websockets;

import io.reactivex.h;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/network/websockets/OzonWebSocket;", "", "Lio/reactivex/h;", "Lru/ozon/app/android/network/websockets/SocketEvent;", "getSocketEvents", "()Lio/reactivex/h;", "", "bytes", "", "send", "([B)V", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface OzonWebSocket {
    @NotNull
    h<SocketEvent> getSocketEvents();

    void send(@NotNull byte[] bytes);
}
