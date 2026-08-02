package io.sentry.internal.modules;

import io.sentry.EnumC4788n3;
import io.sentry.ILogger;
import io.sentry.util.AbstractC4844b;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes3.dex */
public final class f extends d {

    /* renamed from: e, reason: collision with root package name */
    public final ClassLoader f52129e;

    public f(ILogger iLogger) {
        this(iLogger, f.class.getClassLoader());
    }

    @Override // io.sentry.internal.modules.d
    public Map b() {
        InputStream resourceAsStream;
        TreeMap treeMap = new TreeMap();
        try {
            resourceAsStream = this.f52129e.getResourceAsStream("sentry-external-modules.txt");
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
        } catch (IOException e10) {
            this.f52125a.b(EnumC4788n3.INFO, "Access to resources failed.", e10);
        } catch (SecurityException e11) {
            this.f52125a.b(EnumC4788n3.INFO, "Access to resources denied.", e11);
        }
        if (resourceAsStream != null) {
            Map c10 = c(resourceAsStream);
            resourceAsStream.close();
            return c10;
        }
        this.f52125a.c(EnumC4788n3.INFO, "%s file was not found.", "sentry-external-modules.txt");
        if (resourceAsStream != null) {
            resourceAsStream.close();
            return treeMap;
        }
        return treeMap;
    }

    public f(ILogger iLogger, ClassLoader classLoader) {
        super(iLogger);
        this.f52129e = AbstractC4844b.a(classLoader);
    }
}
