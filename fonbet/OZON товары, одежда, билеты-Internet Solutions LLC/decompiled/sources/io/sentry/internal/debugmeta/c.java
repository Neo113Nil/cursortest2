package io.sentry.internal.debugmeta;

import io.sentry.I2;
import io.sentry.ILogger;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ILogger f67997a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ClassLoader f67998b;

    public c(@NotNull ILogger iLogger) {
        ClassLoader classLoader = c.class.getClassLoader();
        this.f67997a = iLogger;
        this.f67998b = io.sentry.util.b.a(classLoader);
    }

    @Override // io.sentry.internal.debugmeta.a
    public final List<Properties> a() {
        InputStream openStream;
        ILogger iLogger = this.f67997a;
        ArrayList arrayList = new ArrayList();
        try {
            Enumeration<URL> resources = this.f67998b.getResources("sentry-debug-meta.properties");
            while (resources.hasMoreElements()) {
                URL nextElement = resources.nextElement();
                try {
                    openStream = nextElement.openStream();
                } catch (RuntimeException e11) {
                    iLogger.b(I2.ERROR, e11, "%s file is malformed.", nextElement);
                }
                try {
                    Properties properties = new Properties();
                    properties.load(openStream);
                    arrayList.add(properties);
                    iLogger.c(I2.INFO, "Debug Meta Data Properties loaded from %s", nextElement);
                    if (openStream != null) {
                        openStream.close();
                    }
                } catch (Throwable th2) {
                    if (openStream != null) {
                        try {
                            openStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            }
        } catch (IOException e12) {
            iLogger.b(I2.ERROR, e12, "Failed to load %s", "sentry-debug-meta.properties");
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        iLogger.c(I2.INFO, "No %s file was found.", "sentry-debug-meta.properties");
        return null;
    }
}
