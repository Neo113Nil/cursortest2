package io.sentry.android.core;

import io.sentry.A1;
import io.sentry.C7139e1;
import io.sentry.I2;
import io.sentry.ILogger;
import io.sentry.InterfaceC7097a0;
import io.sentry.InterfaceC7166l0;
import io.sentry.W2;
import java.io.Closeable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class EnvelopeFileObserverIntegration implements InterfaceC7166l0, Closeable {

    /* renamed from: a, reason: collision with root package name */
    private S f66886a;

    /* renamed from: b, reason: collision with root package name */
    private ILogger f66887b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f66888c = false;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    protected final io.sentry.util.a f66889d = new io.sentry.util.a();

    /* JADX INFO: Access modifiers changed from: private */
    static final class OutboxEnvelopeFileObserverIntegration extends EnvelopeFileObserverIntegration {
        private OutboxEnvelopeFileObserverIntegration() {
        }

        /* synthetic */ OutboxEnvelopeFileObserverIntegration(int i11) {
            this();
        }
    }

    public static /* synthetic */ void c(EnvelopeFileObserverIntegration envelopeFileObserverIntegration, A1 a12, W2 w22, String str) {
        InterfaceC7097a0 a11 = envelopeFileObserverIntegration.f66889d.a();
        try {
            if (!envelopeFileObserverIntegration.f66888c) {
                envelopeFileObserverIntegration.j(a12, w22, str);
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

    private void j(@NotNull A1 a12, @NotNull W2 w22, @NotNull String str) {
        S s11 = new S(str, new C7139e1(a12, w22.getEnvelopeReader(), w22.getSerializer(), w22.getLogger(), w22.getFlushTimeoutMillis(), w22.getMaxQueueSize()), w22.getLogger(), w22.getFlushTimeoutMillis());
        this.f66886a = s11;
        try {
            s11.startWatching();
            w22.getLogger().c(I2.DEBUG, "EnvelopeFileObserverIntegration installed.", new Object[0]);
            io.sentry.util.j.a("EnvelopeFileObserver");
        } catch (Throwable th2) {
            w22.getLogger().a(I2.ERROR, "Failed to initialize EnvelopeFileObserverIntegration.", th2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InterfaceC7097a0 a11 = this.f66889d.a();
        try {
            this.f66888c = true;
            a11.close();
            S s11 = this.f66886a;
            if (s11 != null) {
                s11.stopWatching();
                ILogger iLogger = this.f66887b;
                if (iLogger != null) {
                    iLogger.c(I2.DEBUG, "EnvelopeFileObserverIntegration removed.", new Object[0]);
                }
            }
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
    public final void d(@NotNull final A1 a12, @NotNull final W2 w22) {
        this.f66887b = w22.getLogger();
        final String outboxPath = w22.getOutboxPath();
        if (outboxPath == null) {
            this.f66887b.c(I2.WARNING, "Null given as a path to EnvelopeFileObserverIntegration. Nothing will be registered.", new Object[0]);
            return;
        }
        this.f66887b.c(I2.DEBUG, "Registering EnvelopeFileObserverIntegration for path: %s", outboxPath);
        try {
            w22.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.T
                @Override // java.lang.Runnable
                public final void run() {
                    W2 w23 = w22;
                    String str = outboxPath;
                    EnvelopeFileObserverIntegration.c(EnvelopeFileObserverIntegration.this, a12, w23, str);
                }
            });
        } catch (Throwable th2) {
            this.f66887b.a(I2.DEBUG, "Failed to start EnvelopeFileObserverIntegration on executor thread.", th2);
        }
    }
}
