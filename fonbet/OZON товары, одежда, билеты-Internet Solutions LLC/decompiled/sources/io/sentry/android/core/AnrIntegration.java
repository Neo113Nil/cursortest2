package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.content.Context;
import io.sentry.A1;
import io.sentry.I2;
import io.sentry.ILogger;
import io.sentry.InterfaceC7097a0;
import io.sentry.InterfaceC7166l0;
import io.sentry.W2;
import java.io.Closeable;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class AnrIntegration implements InterfaceC7166l0, Closeable {

    /* renamed from: e, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static C7101b f66853e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    protected static final io.sentry.util.a f66854f = new io.sentry.util.a();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f66855a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f66856b = false;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f66857c = new io.sentry.util.a();

    /* renamed from: d, reason: collision with root package name */
    private W2 f66858d;

    static final class a implements io.sentry.hints.a, io.sentry.hints.p {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f66859a;

        a(boolean z11) {
            this.f66859a = z11;
        }

        @Override // io.sentry.hints.a
        public final Long a() {
            return null;
        }

        @Override // io.sentry.hints.a
        public final boolean c() {
            return true;
        }

        @Override // io.sentry.hints.a
        public final String d() {
            return this.f66859a ? "anr_background" : "anr_foreground";
        }
    }

    public AnrIntegration(@NotNull Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f66855a = applicationContext != null ? applicationContext : context;
    }

    public static /* synthetic */ void c(AnrIntegration anrIntegration, A1 a12, SentryAndroidOptions sentryAndroidOptions) {
        InterfaceC7097a0 a11 = anrIntegration.f66857c.a();
        try {
            if (!anrIntegration.f66856b) {
                anrIntegration.j(a12, sentryAndroidOptions);
            }
            a11.close();
        } catch (Throwable th2) {
            try {
                a11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private void j(@NotNull A1 a12, @NotNull SentryAndroidOptions sentryAndroidOptions) {
        InterfaceC7097a0 a11 = f66854f.a();
        try {
            if (f66853e == null) {
                ILogger logger = sentryAndroidOptions.getLogger();
                I2 i22 = I2.DEBUG;
                logger.c(i22, "ANR timeout in milliseconds: %d", Long.valueOf(sentryAndroidOptions.getAnrTimeoutIntervalMillis()));
                C7101b c7101b = new C7101b(sentryAndroidOptions.getAnrTimeoutIntervalMillis(), sentryAndroidOptions.isAnrReportInDebug(), new A(this, a12, sentryAndroidOptions), sentryAndroidOptions.getLogger(), this.f66855a);
                f66853e = c7101b;
                c7101b.start();
                sentryAndroidOptions.getLogger().c(i22, "AnrIntegration installed.", new Object[0]);
            }
            a11.close();
        } finally {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        InterfaceC7097a0 a11 = this.f66857c.a();
        try {
            this.f66856b = true;
            a11.close();
            a11 = f66854f.a();
            try {
                C7101b c7101b = f66853e;
                if (c7101b != null) {
                    c7101b.interrupt();
                    f66853e = null;
                    W2 w22 = this.f66858d;
                    if (w22 != null) {
                        w22.getLogger().c(I2.DEBUG, "AnrIntegration removed.", new Object[0]);
                    }
                }
                a11.close();
            } finally {
                try {
                    a11.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // io.sentry.InterfaceC7166l0
    public final void d(@NotNull final A1 a12, @NotNull W2 w22) {
        this.f66858d = w22;
        final SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) w22;
        sentryAndroidOptions.getLogger().c(I2.DEBUG, "AnrIntegration enabled: %s", Boolean.valueOf(sentryAndroidOptions.isAnrEnabled()));
        if (sentryAndroidOptions.isAnrEnabled()) {
            io.sentry.util.j.a("Anr");
            try {
                sentryAndroidOptions.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.z
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnrIntegration.c(AnrIntegration.this, a12, sentryAndroidOptions);
                    }
                });
            } catch (Throwable th2) {
                sentryAndroidOptions.getLogger().a(I2.DEBUG, "Failed to start AnrIntegration on executor thread.", th2);
            }
        }
    }
}
