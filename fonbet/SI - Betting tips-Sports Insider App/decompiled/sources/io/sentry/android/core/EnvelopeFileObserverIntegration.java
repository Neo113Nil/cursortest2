package io.sentry.android.core;

import io.sentry.ILogger;
import io.sentry.b5;
import io.sentry.b6;
import io.sentry.c3;
import io.sentry.q1;
import io.sentry.y3;
import java.io.Closeable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class EnvelopeFileObserverIntegration implements q1, Closeable {

    /* renamed from: a, reason: collision with root package name */
    public s0 f15483a;

    /* renamed from: b, reason: collision with root package name */
    public ILogger f15484b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f15485c = false;

    /* renamed from: d, reason: collision with root package name */
    public final io.sentry.util.a f15486d = new io.sentry.util.a();

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public static final class OutboxEnvelopeFileObserverIntegration extends EnvelopeFileObserverIntegration {
        private OutboxEnvelopeFileObserverIntegration() {
        }

        public /* synthetic */ OutboxEnvelopeFileObserverIntegration(int i5) {
            this();
        }
    }

    public final void c(b6 b6Var, String str) {
        s0 s0Var = new s0(str, new c3(y3.f17255a, b6Var.getEnvelopeReader(), b6Var.getSerializer(), b6Var.getLogger(), b6Var.getFlushTimeoutMillis(), b6Var.getMaxQueueSize()), b6Var.getLogger(), b6Var.getFlushTimeoutMillis());
        this.f15483a = s0Var;
        try {
            s0Var.startWatching();
            b6Var.getLogger().h(b5.DEBUG, "EnvelopeFileObserverIntegration installed.", new Object[0]);
            rh.g.a("EnvelopeFileObserver");
        } catch (Throwable th2) {
            b6Var.getLogger().e(b5.ERROR, "Failed to initialize EnvelopeFileObserverIntegration.", th2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        io.sentry.r a7 = this.f15486d.a();
        try {
            this.f15485c = true;
            a7.close();
            s0 s0Var = this.f15483a;
            if (s0Var != null) {
                s0Var.stopWatching();
                ILogger iLogger = this.f15484b;
                if (iLogger != null) {
                    iLogger.h(b5.DEBUG, "EnvelopeFileObserverIntegration removed.", new Object[0]);
                }
            }
        } catch (Throwable th2) {
            try {
                a7.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // io.sentry.q1
    public final void y(b6 b6Var) {
        this.f15484b = b6Var.getLogger();
        String outboxPath = b6Var.getOutboxPath();
        if (outboxPath == null) {
            this.f15484b.h(b5.WARNING, "Null given as a path to EnvelopeFileObserverIntegration. Nothing will be registered.", new Object[0]);
            return;
        }
        this.f15484b.h(b5.DEBUG, "Registering EnvelopeFileObserverIntegration for path: %s", outboxPath);
        try {
            b6Var.getExecutorService().submit(new b1(this, b6Var, outboxPath, 3));
        } catch (Throwable th2) {
            this.f15484b.e(b5.DEBUG, "Failed to start EnvelopeFileObserverIntegration on executor thread.", th2);
        }
    }
}
