package io.ably.lib.network;

import java.nio.ByteBuffer;

/* loaded from: classes9.dex */
public interface WebSocketListener {
    void onClose(int i, String str);

    void onError(Throwable th);

    void onMessage(String str);

    void onMessage(ByteBuffer byteBuffer);

    void onOldJavaVersionDetected(Throwable th);

    void onOpen();

    void onWebsocketPing();
}
