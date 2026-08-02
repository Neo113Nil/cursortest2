package io.ably.lib.network;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes9.dex */
public interface WebSocketEngineFactory {
    WebSocketEngine create(WebSocketEngineConfig webSocketEngineConfig);

    EngineType getEngineType();

    static WebSocketEngineFactory getFirstAvailable() {
        WebSocketEngineFactory tryGetOkWebSocketFactory = tryGetOkWebSocketFactory();
        if (tryGetOkWebSocketFactory != null) {
            return tryGetOkWebSocketFactory;
        }
        WebSocketEngineFactory tryGetDefaultFactory = tryGetDefaultFactory();
        if (tryGetDefaultFactory != null) {
            return tryGetDefaultFactory;
        }
        throw new IllegalStateException("No engines are available");
    }

    static WebSocketEngineFactory tryGetOkWebSocketFactory() {
        try {
            return (WebSocketEngineFactory) Class.forName("io.ably.lib.network.OkHttpWebSocketEngineFactory").getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    static WebSocketEngineFactory tryGetDefaultFactory() {
        try {
            return (WebSocketEngineFactory) Class.forName("io.ably.lib.network.DefaultWebSocketEngineFactory").getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }
}
