package io.sentry.android.core;

import io.sentry.A1;
import io.sentry.I2;
import io.sentry.ILogger;
import io.sentry.InterfaceC7097a0;
import io.sentry.InterfaceC7166l0;
import io.sentry.W2;
import java.io.Closeable;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AppLifecycleIntegration implements InterfaceC7166l0, Closeable {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f66876a = new io.sentry.util.a();

    /* renamed from: b, reason: collision with root package name */
    volatile Y f66877b;

    /* renamed from: c, reason: collision with root package name */
    private SentryAndroidOptions f66878c;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        InterfaceC7097a0 a11 = this.f66876a.a();
        try {
            Y y11 = this.f66877b;
            this.f66877b = null;
            a11.close();
            if (y11 != null) {
                F.o().r(y11);
                SentryAndroidOptions sentryAndroidOptions = this.f66878c;
                if (sentryAndroidOptions != null) {
                    sentryAndroidOptions.getLogger().c(I2.DEBUG, "AppLifecycleIntegration removed.", new Object[0]);
                }
            }
            F.o().t();
        } catch (Throwable th2) {
            try {
                a11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // io.sentry.InterfaceC7166l0
    public final void d(@NotNull A1 a12, @NotNull W2 w22) {
        SentryAndroidOptions sentryAndroidOptions = w22 instanceof SentryAndroidOptions ? (SentryAndroidOptions) w22 : null;
        io.sentry.util.p.b(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f66878c = sentryAndroidOptions;
        ILogger logger = sentryAndroidOptions.getLogger();
        I2 i22 = I2.DEBUG;
        logger.c(i22, "enableSessionTracking enabled: %s", Boolean.valueOf(this.f66878c.isEnableAutoSessionTracking()));
        this.f66878c.getLogger().c(i22, "enableAppLifecycleBreadcrumbs enabled: %s", Boolean.valueOf(this.f66878c.isEnableAppLifecycleBreadcrumbs()));
        if (!this.f66878c.isEnableAutoSessionTracking() && !this.f66878c.isEnableAppLifecycleBreadcrumbs()) {
            return;
        }
        InterfaceC7097a0 a11 = this.f66876a.a();
        try {
            if (this.f66877b != null) {
                a11.close();
                return;
            }
            this.f66877b = new Y(a12, this.f66878c.getSessionTrackingIntervalMillis(), this.f66878c.isEnableAutoSessionTracking(), this.f66878c.isEnableAppLifecycleBreadcrumbs());
            F.o().j(this.f66877b);
            a11.close();
            w22.getLogger().c(i22, "AppLifecycleIntegration installed.", new Object[0]);
            io.sentry.util.j.a("AppLifecycle");
        } finally {
        }
    }
}
