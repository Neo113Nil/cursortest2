package io.sentry.config;

import io.sentry.I2;
import io.sentry.p3;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
final class e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f67844a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final p3 f67845b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f67846c;

    public e(@NotNull String str, @NotNull p3 p3Var, boolean z11) {
        this.f67844a = str;
        this.f67845b = p3Var;
        this.f67846c = z11;
    }

    public final Properties a() {
        p3 p3Var = this.f67845b;
        String str = this.f67844a;
        try {
            File file = new File(str.trim());
            if (file.isFile() && file.canRead()) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    Properties properties = new Properties();
                    properties.load(bufferedInputStream);
                    bufferedInputStream.close();
                    return properties;
                } finally {
                }
            }
            if (file.isFile()) {
                if (!file.canRead()) {
                    p3Var.c(I2.ERROR, "Failed to load Sentry configuration since it is not readable: %s", str);
                }
            } else if (this.f67846c) {
                p3Var.c(I2.ERROR, "Failed to load Sentry configuration since it is not a file or does not exist: %s", str);
                return null;
            }
            return null;
        } catch (Throwable th2) {
            p3Var.b(I2.ERROR, th2, "Failed to load Sentry configuration from file: %s", str);
            return null;
        }
    }
}
