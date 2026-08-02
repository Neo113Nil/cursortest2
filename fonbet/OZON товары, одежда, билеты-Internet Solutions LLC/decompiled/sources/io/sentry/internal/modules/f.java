package io.sentry.internal.modules;

import io.sentry.I2;
import io.sentry.ILogger;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.TreeMap;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class f extends d {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ClassLoader f68014e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(@NotNull ILogger iLogger) {
        super(iLogger);
        ClassLoader classLoader = f.class.getClassLoader();
        this.f68014e = io.sentry.util.b.a(classLoader);
    }

    @Override // io.sentry.internal.modules.d
    protected final Map<String, String> b() {
        InputStream resourceAsStream;
        ILogger iLogger = this.f68010a;
        TreeMap treeMap = new TreeMap();
        try {
            resourceAsStream = this.f68014e.getResourceAsStream("sentry-external-modules.txt");
            try {
            } catch (Throwable th2) {
                if (resourceAsStream != null) {
                    try {
                        resourceAsStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (IOException e11) {
            iLogger.a(I2.INFO, "Access to resources failed.", e11);
        } catch (SecurityException e12) {
            iLogger.a(I2.INFO, "Access to resources denied.", e12);
        }
        if (resourceAsStream != null) {
            TreeMap c11 = c(resourceAsStream);
            resourceAsStream.close();
            return c11;
        }
        iLogger.c(I2.INFO, "%s file was not found.", "sentry-external-modules.txt");
        if (resourceAsStream != null) {
            resourceAsStream.close();
            return treeMap;
        }
        return treeMap;
    }
}
