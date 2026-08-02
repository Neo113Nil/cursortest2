package ru.ozon.app.android.network.websockets;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/network/websockets/OzonWebSocketFactory;", "", "create", "Lru/ozon/app/android/network/websockets/OzonWebSocket;", "ozonWebSocketUrl", "Lru/ozon/app/android/network/websockets/OzonWebSocketUrl;", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface OzonWebSocketFactory {
    @NotNull
    OzonWebSocket create(@NotNull OzonWebSocketUrl ozonWebSocketUrl);
}
