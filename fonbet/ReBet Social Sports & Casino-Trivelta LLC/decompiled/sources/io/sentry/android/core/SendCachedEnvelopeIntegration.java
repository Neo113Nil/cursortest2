package io.sentry.android.core;

import io.sentry.EnumC4774l;
import io.sentry.EnumC4788n3;
import io.sentry.F3;
import io.sentry.InterfaceC4664a2;
import io.sentry.InterfaceC4737d2;
import io.sentry.InterfaceC4740e0;
import io.sentry.InterfaceC4765j0;
import io.sentry.InterfaceC4839u0;
import io.sentry.P;
import io.sentry.util.C4843a;
import java.io.Closeable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
final class SendCachedEnvelopeIntegration implements InterfaceC4839u0, P.b, Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4737d2 f50791a;

    /* renamed from: b, reason: collision with root package name */
    public final io.sentry.util.p f50792b;

    /* renamed from: d, reason: collision with root package name */
    public io.sentry.P f50794d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC4740e0 f50795e;

    /* renamed from: f, reason: collision with root package name */
    public SentryAndroidOptions f50796f;

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC4664a2 f50797g;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f50793c = new AtomicBoolean(false);

    /* renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f50798h = new AtomicBoolean(false);

    /* renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f50799i = new AtomicBoolean(false);

    /* renamed from: j, reason: collision with root package name */
    public final C4843a f50800j = new C4843a();

    public SendCachedEnvelopeIntegration(InterfaceC4737d2 interfaceC4737d2, io.sentry.util.p pVar) {
        this.f50791a = (InterfaceC4737d2) io.sentry.util.w.c(interfaceC4737d2, "SendFireAndForgetFactory is required");
        this.f50792b = pVar;
    }

    public static /* synthetic */ void d(SendCachedEnvelopeIntegration sendCachedEnvelopeIntegration, SentryAndroidOptions sentryAndroidOptions, InterfaceC4740e0 interfaceC4740e0) {
        sendCachedEnvelopeIntegration.getClass();
        try {
            if (sendCachedEnvelopeIntegration.f50799i.get()) {
                sentryAndroidOptions.getLogger().c(EnumC4788n3.INFO, "SendCachedEnvelopeIntegration, not trying to send after closing.", new Object[0]);
                return;
            }
            if (!sendCachedEnvelopeIntegration.f50798h.getAndSet(true)) {
                io.sentry.P connectionStatusProvider = sentryAndroidOptions.getConnectionStatusProvider();
                sendCachedEnvelopeIntegration.f50794d = connectionStatusProvider;
                connectionStatusProvider.x1(sendCachedEnvelopeIntegration);
                sendCachedEnvelopeIntegration.f50797g = sendCachedEnvelopeIntegration.f50791a.c(interfaceC4740e0, sentryAndroidOptions);
            }
            io.sentry.P p10 = sendCachedEnvelopeIntegration.f50794d;
            if (p10 != null && p10.s0() == P.a.DISCONNECTED) {
                sentryAndroidOptions.getLogger().c(EnumC4788n3.INFO, "SendCachedEnvelopeIntegration, no connection.", new Object[0]);
                return;
            }
            io.sentry.transport.z e10 = interfaceC4740e0.e();
            if (e10 != null && e10.A0(EnumC4774l.All)) {
                sentryAndroidOptions.getLogger().c(EnumC4788n3.INFO, "SendCachedEnvelopeIntegration, rate limiting active.", new Object[0]);
                return;
            }
            InterfaceC4664a2 interfaceC4664a2 = sendCachedEnvelopeIntegration.f50797g;
            if (interfaceC4664a2 == null) {
                sentryAndroidOptions.getLogger().c(EnumC4788n3.ERROR, "SendCachedEnvelopeIntegration factory is null.", new Object[0]);
            } else {
                interfaceC4664a2.a();
            }
        } catch (Throwable th2) {
            sentryAndroidOptions.getLogger().b(EnumC4788n3.ERROR, "Failed trying to send cached events.", th2);
        }
    }

    @Override // io.sentry.P.b
    public void B(P.a aVar) {
        SentryAndroidOptions sentryAndroidOptions;
        InterfaceC4740e0 interfaceC4740e0 = this.f50795e;
        if (interfaceC4740e0 == null || (sentryAndroidOptions = this.f50796f) == null || aVar == P.a.DISCONNECTED) {
            return;
        }
        k(interfaceC4740e0, sentryAndroidOptions);
    }

    @Override // io.sentry.InterfaceC4839u0
    public void J(InterfaceC4740e0 interfaceC4740e0, F3 f32) {
        this.f50795e = (InterfaceC4740e0) io.sentry.util.w.c(interfaceC4740e0, "Scopes are required");
        this.f50796f = (SentryAndroidOptions) io.sentry.util.w.c(f32 instanceof SentryAndroidOptions ? (SentryAndroidOptions) f32 : null, "SentryAndroidOptions is required");
        if (!this.f50791a.d(f32.getCacheDirPath(), f32.getLogger())) {
            f32.getLogger().c(EnumC4788n3.ERROR, "No cache dir path is defined in options.", new Object[0]);
        } else {
            io.sentry.util.n.a("SendCachedEnvelope");
            k(interfaceC4740e0, this.f50796f);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f50799i.set(true);
        io.sentry.P p10 = this.f50794d;
        if (p10 != null) {
            p10.J1(this);
        }
    }

    public final void k(final InterfaceC4740e0 interfaceC4740e0, final SentryAndroidOptions sentryAndroidOptions) {
        try {
            InterfaceC4765j0 d10 = this.f50800j.d();
            try {
                Future submit = sentryAndroidOptions.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.W0
                    @Override // java.lang.Runnable
                    public final void run() {
                        SendCachedEnvelopeIntegration.d(SendCachedEnvelopeIntegration.this, sentryAndroidOptions, interfaceC4740e0);
                    }
                });
                if (((Boolean) this.f50792b.a()).booleanValue() && this.f50793c.compareAndSet(false, true)) {
                    sentryAndroidOptions.getLogger().c(EnumC4788n3.DEBUG, "Startup Crash marker exists, blocking flush.", new Object[0]);
                    try {
                        submit.get(sentryAndroidOptions.getStartupCrashFlushTimeoutMillis(), TimeUnit.MILLISECONDS);
                    } catch (TimeoutException unused) {
                        sentryAndroidOptions.getLogger().c(EnumC4788n3.DEBUG, "Synchronous send timed out, continuing in the background.", new Object[0]);
                    }
                }
                sentryAndroidOptions.getLogger().c(EnumC4788n3.DEBUG, "SendCachedEnvelopeIntegration installed.", new Object[0]);
                if (d10 != null) {
                    d10.close();
                }
            } finally {
            }
        } catch (RejectedExecutionException e10) {
            sentryAndroidOptions.getLogger().b(EnumC4788n3.ERROR, "Failed to call the executor. Cached events will not be sent. Did you call Sentry.close()?", e10);
        } catch (Throwable th2) {
            sentryAndroidOptions.getLogger().b(EnumC4788n3.ERROR, "Failed to call the executor. Cached events will not be sent", th2);
        }
    }
}
