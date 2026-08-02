package io.sentry.util;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class b {
    @NotNull
    public static ClassLoader a(ClassLoader classLoader) {
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        return contextClassLoader != null ? contextClassLoader : ClassLoader.getSystemClassLoader();
    }
}
