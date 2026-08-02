package io.sentry.config;

import io.sentry.I2;
import io.sentry.p3;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f67840a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ClassLoader f67841b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final p3 f67842c;

    public b(@NotNull p3 p3Var) {
        ClassLoader classLoader = b.class.getClassLoader();
        this.f67840a = "sentry.properties";
        this.f67841b = io.sentry.util.b.a(classLoader);
        this.f67842c = p3Var;
    }

    public final Properties a() {
        String str = this.f67840a;
        try {
            InputStream resourceAsStream = this.f67841b.getResourceAsStream(str);
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
        } catch (IOException e11) {
            this.f67842c.b(I2.ERROR, e11, "Failed to load Sentry configuration from classpath resource: %s", str);
            return null;
        }
    }
}
