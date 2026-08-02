package io.sentry.android.core;

import io.sentry.ILogger;
import io.sentry.a4;
import io.sentry.b5;
import io.sentry.b6;
import io.sentry.q1;
import io.sentry.y3;
import java.io.Closeable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
final class SendCachedEnvelopeIntegration implements q1, io.sentry.o0, Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final a4 f15496a;

    /* renamed from: b, reason: collision with root package name */
    public final io.sentry.util.f f15497b;

    /* renamed from: d, reason: collision with root package name */
    public io.sentry.p0 f15499d;

    /* renamed from: e, reason: collision with root package name */
    public y3 f15500e;

    /* renamed from: f, reason: collision with root package name */
    public SentryAndroidOptions f15501f;

    /* renamed from: g, reason: collision with root package name */
    public androidx.credentials.playservices.c f15502g;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f15498c = new AtomicBoolean(false);

    /* renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f15503h = new AtomicBoolean(false);

    /* renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f15504i = new AtomicBoolean(false);
    public final io.sentry.util.a j = new io.sentry.util.a();

    public SendCachedEnvelopeIntegration(a4 a4Var, io.sentry.util.f fVar) {
        this.f15496a = a4Var;
        this.f15497b = fVar;
    }

    public final void c(y3 y3Var, SentryAndroidOptions sentryAndroidOptions) {
        try {
            io.sentry.r a7 = this.j.a();
            try {
                Future submit = sentryAndroidOptions.getExecutorService().submit(new b1(this, sentryAndroidOptions, y3Var, 0));
                if (((Boolean) this.f15497b.a()).booleanValue() && this.f15498c.compareAndSet(false, true)) {
                    sentryAndroidOptions.getLogger().h(b5.DEBUG, "Startup Crash marker exists, blocking flush.", new Object[0]);
                    try {
                        submit.get(sentryAndroidOptions.getStartupCrashFlushTimeoutMillis(), TimeUnit.MILLISECONDS);
                    } catch (TimeoutException unused) {
                        sentryAndroidOptions.getLogger().h(b5.DEBUG, "Synchronous send timed out, continuing in the background.", new Object[0]);
                    }
                }
                sentryAndroidOptions.getLogger().h(b5.DEBUG, "SendCachedEnvelopeIntegration installed.", new Object[0]);
                a7.close();
            } finally {
            }
        } catch (RejectedExecutionException e7) {
            sentryAndroidOptions.getLogger().e(b5.ERROR, "Failed to call the executor. Cached events will not be sent. Did you call Sentry.close()?", e7);
        } catch (Throwable th2) {
            sentryAndroidOptions.getLogger().e(b5.ERROR, "Failed to call the executor. Cached events will not be sent", th2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f15504i.set(true);
        io.sentry.p0 p0Var = this.f15499d;
        if (p0Var != null) {
            p0Var.e0(this);
        }
    }

    @Override // io.sentry.o0
    public final void r(io.sentry.n0 n0Var) {
        SentryAndroidOptions sentryAndroidOptions;
        y3 y3Var = this.f15500e;
        if (y3Var == null || (sentryAndroidOptions = this.f15501f) == null || n0Var == io.sentry.n0.DISCONNECTED) {
            return;
        }
        c(y3Var, sentryAndroidOptions);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0020. Please report as an issue. */
    @Override // io.sentry.q1
    public final void y(b6 b6Var) {
        y3 y3Var = y3.f17255a;
        this.f15500e = y3Var;
        SentryAndroidOptions sentryAndroidOptions = b6Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) b6Var : null;
        y4.a.C(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f15501f = sentryAndroidOptions;
        String cacheDirPath = b6Var.getCacheDirPath();
        ILogger logger = b6Var.getLogger();
        switch (this.f15496a.f15442a) {
        }
        if (!d9.e.a(cacheDirPath, logger)) {
            b6Var.getLogger().h(b5.ERROR, "No cache dir path is defined in options.", new Object[0]);
        } else {
            rh.g.a("SendCachedEnvelope");
            c(y3Var, this.f15501f);
        }
    }
}
