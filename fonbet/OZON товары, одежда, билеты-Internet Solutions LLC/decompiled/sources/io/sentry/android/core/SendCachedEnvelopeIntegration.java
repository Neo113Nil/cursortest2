package io.sentry.android.core;

import io.sentry.A1;
import io.sentry.D1;
import io.sentry.E1;
import io.sentry.EnumC7161k;
import io.sentry.I2;
import io.sentry.ILogger;
import io.sentry.InterfaceC7097a0;
import io.sentry.InterfaceC7166l0;
import io.sentry.J;
import io.sentry.W2;
import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class SendCachedEnvelopeIntegration implements InterfaceC7166l0, J.b, Closeable {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final E1 f66975a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.l<Boolean> f66976b;

    /* renamed from: d, reason: collision with root package name */
    private io.sentry.J f66978d;

    /* renamed from: e, reason: collision with root package name */
    private A1 f66979e;

    /* renamed from: f, reason: collision with root package name */
    private SentryAndroidOptions f66980f;

    /* renamed from: g, reason: collision with root package name */
    private D1 f66981g;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f66977c = new AtomicBoolean(false);

    /* renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f66982h = new AtomicBoolean(false);

    /* renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f66983i = new AtomicBoolean(false);

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f66984j = new io.sentry.util.a();

    public SendCachedEnvelopeIntegration(@NotNull E1 e12, @NotNull io.sentry.util.l<Boolean> lVar) {
        this.f66975a = e12;
        this.f66976b = lVar;
    }

    public static /* synthetic */ void c(SendCachedEnvelopeIntegration sendCachedEnvelopeIntegration, SentryAndroidOptions sentryAndroidOptions, A1 a12) {
        sendCachedEnvelopeIntegration.getClass();
        try {
            if (sendCachedEnvelopeIntegration.f66983i.get()) {
                sentryAndroidOptions.getLogger().c(I2.INFO, "SendCachedEnvelopeIntegration, not trying to send after closing.", new Object[0]);
                return;
            }
            if (!sendCachedEnvelopeIntegration.f66982h.getAndSet(true)) {
                io.sentry.J connectionStatusProvider = sentryAndroidOptions.getConnectionStatusProvider();
                sendCachedEnvelopeIntegration.f66978d = connectionStatusProvider;
                connectionStatusProvider.O1(sendCachedEnvelopeIntegration);
                sendCachedEnvelopeIntegration.f66981g = sendCachedEnvelopeIntegration.f66975a.b(a12, sentryAndroidOptions);
            }
            io.sentry.J j11 = sendCachedEnvelopeIntegration.f66978d;
            if (j11 != null && j11.l() == J.a.DISCONNECTED) {
                sentryAndroidOptions.getLogger().c(I2.INFO, "SendCachedEnvelopeIntegration, no connection.", new Object[0]);
                return;
            }
            io.sentry.transport.m h11 = a12.h();
            if (h11 != null && h11.m(EnumC7161k.All)) {
                sentryAndroidOptions.getLogger().c(I2.INFO, "SendCachedEnvelopeIntegration, rate limiting active.", new Object[0]);
                return;
            }
            D1 d12 = sendCachedEnvelopeIntegration.f66981g;
            if (d12 == null) {
                sentryAndroidOptions.getLogger().c(I2.ERROR, "SendCachedEnvelopeIntegration factory is null.", new Object[0]);
            } else {
                d12.a();
            }
        } catch (Throwable th2) {
            sentryAndroidOptions.getLogger().a(I2.ERROR, "Failed trying to send cached events.", th2);
        }
    }

    private void k(@NotNull final A1 a12, @NotNull final SentryAndroidOptions sentryAndroidOptions) {
        try {
            InterfaceC7097a0 a11 = this.f66984j.a();
            try {
                Future<?> submit = sentryAndroidOptions.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.i0
                    @Override // java.lang.Runnable
                    public final void run() {
                        SendCachedEnvelopeIntegration.c(SendCachedEnvelopeIntegration.this, sentryAndroidOptions, a12);
                    }
                });
                if (this.f66976b.a().booleanValue() && this.f66977c.compareAndSet(false, true)) {
                    sentryAndroidOptions.getLogger().c(I2.DEBUG, "Startup Crash marker exists, blocking flush.", new Object[0]);
                    try {
                        submit.get(sentryAndroidOptions.getStartupCrashFlushTimeoutMillis(), TimeUnit.MILLISECONDS);
                    } catch (TimeoutException unused) {
                        sentryAndroidOptions.getLogger().c(I2.DEBUG, "Synchronous send timed out, continuing in the background.", new Object[0]);
                    }
                }
                sentryAndroidOptions.getLogger().c(I2.DEBUG, "SendCachedEnvelopeIntegration installed.", new Object[0]);
                a11.close();
            } finally {
            }
        } catch (RejectedExecutionException e11) {
            sentryAndroidOptions.getLogger().a(I2.ERROR, "Failed to call the executor. Cached events will not be sent. Did you call Sentry.close()?", e11);
        } catch (Throwable th2) {
            sentryAndroidOptions.getLogger().a(I2.ERROR, "Failed to call the executor. Cached events will not be sent", th2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f66983i.set(true);
        io.sentry.J j11 = this.f66978d;
        if (j11 != null) {
            j11.I0(this);
        }
    }

    @Override // io.sentry.InterfaceC7166l0
    public final void d(@NotNull A1 a12, @NotNull W2 w22) {
        this.f66979e = a12;
        SentryAndroidOptions sentryAndroidOptions = w22 instanceof SentryAndroidOptions ? (SentryAndroidOptions) w22 : null;
        io.sentry.util.p.b(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f66980f = sentryAndroidOptions;
        String cacheDirPath = w22.getCacheDirPath();
        ILogger logger = w22.getLogger();
        this.f66975a.getClass();
        if (!E1.a(cacheDirPath, logger)) {
            w22.getLogger().c(I2.ERROR, "No cache dir path is defined in options.", new Object[0]);
        } else {
            io.sentry.util.j.a("SendCachedEnvelope");
            k(a12, this.f66980f);
        }
    }

    @Override // io.sentry.J.b
    public final void j(@NotNull J.a aVar) {
        SentryAndroidOptions sentryAndroidOptions;
        A1 a12 = this.f66979e;
        if (a12 == null || (sentryAndroidOptions = this.f66980f) == null || aVar == J.a.DISCONNECTED) {
            return;
        }
        k(a12, sentryAndroidOptions);
    }
}
