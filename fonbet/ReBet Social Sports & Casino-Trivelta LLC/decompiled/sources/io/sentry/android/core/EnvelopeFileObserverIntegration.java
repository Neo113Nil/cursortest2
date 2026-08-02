package io.sentry.android.core;

import io.sentry.C4855v1;
import io.sentry.EnumC4788n3;
import io.sentry.F3;
import io.sentry.ILogger;
import io.sentry.InterfaceC4740e0;
import io.sentry.InterfaceC4765j0;
import io.sentry.InterfaceC4839u0;
import io.sentry.util.C4843a;
import java.io.Closeable;

/* loaded from: classes3.dex */
public abstract class EnvelopeFileObserverIntegration implements InterfaceC4839u0, Closeable {

    /* renamed from: a, reason: collision with root package name */
    public FileObserverC4717x0 f50681a;

    /* renamed from: b, reason: collision with root package name */
    public ILogger f50682b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f50683c = false;

    /* renamed from: d, reason: collision with root package name */
    public final C4843a f50684d = new C4843a();

    public static final class OutboxEnvelopeFileObserverIntegration extends EnvelopeFileObserverIntegration {
        private OutboxEnvelopeFileObserverIntegration() {
        }

        @Override // io.sentry.android.core.EnvelopeFileObserverIntegration
        public String r(F3 f32) {
            return f32.getOutboxPath();
        }
    }

    public static /* synthetic */ void d(EnvelopeFileObserverIntegration envelopeFileObserverIntegration, InterfaceC4740e0 interfaceC4740e0, F3 f32, String str) {
        InterfaceC4765j0 d10 = envelopeFileObserverIntegration.f50684d.d();
        try {
            if (!envelopeFileObserverIntegration.f50683c) {
                envelopeFileObserverIntegration.B(interfaceC4740e0, f32, str);
            }
            if (d10 != null) {
                d10.close();
            }
        } catch (Throwable th2) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public static EnvelopeFileObserverIntegration k() {
        return new OutboxEnvelopeFileObserverIntegration();
    }

    public final void B(InterfaceC4740e0 interfaceC4740e0, F3 f32, String str) {
        FileObserverC4717x0 fileObserverC4717x0 = new FileObserverC4717x0(str, new C4855v1(interfaceC4740e0, f32.getEnvelopeReader(), f32.getSerializer(), f32.getLogger(), f32.getFlushTimeoutMillis(), f32.getMaxQueueSize()), f32.getLogger(), f32.getFlushTimeoutMillis());
        this.f50681a = fileObserverC4717x0;
        try {
            fileObserverC4717x0.startWatching();
            f32.getLogger().c(EnumC4788n3.DEBUG, "EnvelopeFileObserverIntegration installed.", new Object[0]);
            io.sentry.util.n.a("EnvelopeFileObserver");
        } catch (Throwable th2) {
            f32.getLogger().b(EnumC4788n3.ERROR, "Failed to initialize EnvelopeFileObserverIntegration.", th2);
        }
    }

    @Override // io.sentry.InterfaceC4839u0
    public final void J(final InterfaceC4740e0 interfaceC4740e0, final F3 f32) {
        io.sentry.util.w.c(interfaceC4740e0, "Scopes are required");
        io.sentry.util.w.c(f32, "SentryOptions is required");
        this.f50682b = f32.getLogger();
        final String r10 = r(f32);
        if (r10 == null) {
            this.f50682b.c(EnumC4788n3.WARNING, "Null given as a path to EnvelopeFileObserverIntegration. Nothing will be registered.", new Object[0]);
            return;
        }
        this.f50682b.c(EnumC4788n3.DEBUG, "Registering EnvelopeFileObserverIntegration for path: %s", r10);
        try {
            f32.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.y0
                @Override // java.lang.Runnable
                public final void run() {
                    EnvelopeFileObserverIntegration.d(EnvelopeFileObserverIntegration.this, interfaceC4740e0, f32, r10);
                }
            });
        } catch (Throwable th2) {
            this.f50682b.b(EnumC4788n3.DEBUG, "Failed to start EnvelopeFileObserverIntegration on executor thread.", th2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        InterfaceC4765j0 d10 = this.f50684d.d();
        try {
            this.f50683c = true;
            if (d10 != null) {
                d10.close();
            }
            FileObserverC4717x0 fileObserverC4717x0 = this.f50681a;
            if (fileObserverC4717x0 != null) {
                fileObserverC4717x0.stopWatching();
                ILogger iLogger = this.f50682b;
                if (iLogger != null) {
                    iLogger.c(EnumC4788n3.DEBUG, "EnvelopeFileObserverIntegration removed.", new Object[0]);
                }
            }
        } catch (Throwable th2) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public abstract String r(F3 f32);
}
