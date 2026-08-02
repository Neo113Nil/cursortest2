package io.sentry.config;

import io.sentry.EnumC4788n3;
import io.sentry.ILogger;
import io.sentry.util.AbstractC4844b;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f51998a;

    /* renamed from: b, reason: collision with root package name */
    public final ClassLoader f51999b;

    /* renamed from: c, reason: collision with root package name */
    public final ILogger f52000c;

    public b(String str, ClassLoader classLoader, ILogger iLogger) {
        this.f51998a = str;
        this.f51999b = AbstractC4844b.a(classLoader);
        this.f52000c = iLogger;
    }

    public Properties a() {
        try {
            InputStream resourceAsStream = this.f51999b.getResourceAsStream(this.f51998a);
            if (resourceAsStream == null) {
                if (resourceAsStream != null) {
                    resourceAsStream.close();
                }
                return null;
            }
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(resourceAsStream);
                try {
                    Properties properties = new Properties();
                    properties.load(bufferedInputStream);
                    bufferedInputStream.close();
                    resourceAsStream.close();
                    return properties;
                } finally {
                }
            } finally {
            }
        } catch (IOException e10) {
            this.f52000c.a(EnumC4788n3.ERROR, e10, "Failed to load Sentry configuration from classpath resource: %s", this.f51998a);
            return null;
        }
    }

    public b(ILogger iLogger) {
        this("sentry.properties", b.class.getClassLoader(), iLogger);
    }
}
