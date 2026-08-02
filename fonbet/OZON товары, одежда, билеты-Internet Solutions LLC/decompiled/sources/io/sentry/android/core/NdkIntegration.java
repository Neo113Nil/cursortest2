package io.sentry.android.core;

import io.sentry.A1;
import io.sentry.I2;
import io.sentry.ILogger;
import io.sentry.InterfaceC7166l0;
import io.sentry.W2;
import java.io.Closeable;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class NdkIntegration implements InterfaceC7166l0, Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final Class<?> f66928a;

    /* renamed from: b, reason: collision with root package name */
    private SentryAndroidOptions f66929b;

    public NdkIntegration(Class<?> cls) {
        this.f66928a = cls;
    }

    private static void c(@NotNull SentryAndroidOptions sentryAndroidOptions) {
        sentryAndroidOptions.setEnableNdk(false);
        sentryAndroidOptions.setEnableScopeSync(false);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        SentryAndroidOptions sentryAndroidOptions = this.f66929b;
        if (sentryAndroidOptions == null || !sentryAndroidOptions.isEnableNdk()) {
            return;
        }
        Class<?> cls = this.f66928a;
        try {
            if (cls != null) {
                try {
                    cls.getMethod("close", new Class[0]).invoke(null, new Object[0]);
                    this.f66929b.getLogger().c(I2.DEBUG, "NdkIntegration removed.", new Object[0]);
                } catch (NoSuchMethodException e11) {
                    this.f66929b.getLogger().a(I2.ERROR, "Failed to invoke the SentryNdk.close method.", e11);
                } catch (Throwable th2) {
                    this.f66929b.getLogger().a(I2.ERROR, "Failed to close SentryNdk.", th2);
                }
            }
        } finally {
            c(this.f66929b);
        }
    }

    @Override // io.sentry.InterfaceC7166l0
    public final void d(@NotNull A1 a12, @NotNull W2 w22) {
        Class<?> cls;
        SentryAndroidOptions sentryAndroidOptions = w22 instanceof SentryAndroidOptions ? (SentryAndroidOptions) w22 : null;
        io.sentry.util.p.b(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f66929b = sentryAndroidOptions;
        boolean isEnableNdk = sentryAndroidOptions.isEnableNdk();
        ILogger logger = this.f66929b.getLogger();
        I2 i22 = I2.DEBUG;
        logger.c(i22, "NdkIntegration enabled: %s", Boolean.valueOf(isEnableNdk));
        if (!isEnableNdk || (cls = this.f66928a) == null) {
            c(this.f66929b);
            return;
        }
        if (this.f66929b.getCacheDirPath() == null) {
            this.f66929b.getLogger().c(I2.ERROR, "No cache dir path is defined in options.", new Object[0]);
            c(this.f66929b);
            return;
        }
        try {
            cls.getMethod("init", SentryAndroidOptions.class).invoke(null, this.f66929b);
            this.f66929b.getLogger().c(i22, "NdkIntegration installed.", new Object[0]);
            io.sentry.util.j.a("Ndk");
        } catch (NoSuchMethodException e11) {
            c(this.f66929b);
            this.f66929b.getLogger().a(I2.ERROR, "Failed to invoke the SentryNdk.init method.", e11);
        } catch (Throwable th2) {
            c(this.f66929b);
            this.f66929b.getLogger().a(I2.ERROR, "Failed to initialize SentryNdk.", th2);
        }
    }
}
