package io.ably.lib.network;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes9.dex */
public interface HttpEngineFactory {
    HttpEngine create(HttpEngineConfig httpEngineConfig);

    EngineType getEngineType();

    static HttpEngineFactory getFirstAvailable() {
        HttpEngineFactory tryGetOkHttpFactory = tryGetOkHttpFactory();
        if (tryGetOkHttpFactory != null) {
            return tryGetOkHttpFactory;
        }
        HttpEngineFactory tryGetDefaultFactory = tryGetDefaultFactory();
        if (tryGetDefaultFactory != null) {
            return tryGetDefaultFactory;
        }
        throw new IllegalStateException("No engines are available");
    }

    static HttpEngineFactory tryGetOkHttpFactory() {
        try {
            return (HttpEngineFactory) Class.forName("io.ably.lib.network.OkHttpEngineFactory").getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    static HttpEngineFactory tryGetDefaultFactory() {
        try {
            return (HttpEngineFactory) Class.forName("io.ably.lib.network.DefaultHttpEngineFactory").getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }
}
