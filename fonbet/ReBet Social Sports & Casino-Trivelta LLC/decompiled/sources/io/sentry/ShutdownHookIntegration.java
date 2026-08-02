package io.sentry;

import java.io.Closeable;

/* loaded from: classes3.dex */
public final class ShutdownHookIntegration implements InterfaceC4839u0, Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final Runtime f50511a;

    /* renamed from: b, reason: collision with root package name */
    public Thread f50512b;

    public ShutdownHookIntegration(Runtime runtime) {
        this.f50511a = (Runtime) io.sentry.util.w.c(runtime, "Runtime is required");
    }

    public static /* synthetic */ void d(ShutdownHookIntegration shutdownHookIntegration, F3 f32) {
        shutdownHookIntegration.f50511a.addShutdownHook(shutdownHookIntegration.f50512b);
        f32.getLogger().c(EnumC4788n3.DEBUG, "ShutdownHookIntegration installed.", new Object[0]);
        io.sentry.util.n.a("ShutdownHook");
    }

    public final void B(Runnable runnable) {
        try {
            runnable.run();
        } catch (IllegalStateException e10) {
            String message = e10.getMessage();
            if (message == null || !(message.equals("Shutdown in progress") || message.equals("VM already shutting down"))) {
                throw e10;
            }
        }
    }

    @Override // io.sentry.InterfaceC4839u0
    public void J(final InterfaceC4740e0 interfaceC4740e0, final F3 f32) {
        io.sentry.util.w.c(interfaceC4740e0, "Scopes are required");
        io.sentry.util.w.c(f32, "SentryOptions is required");
        if (!f32.isEnableShutdownHook()) {
            f32.getLogger().c(EnumC4788n3.INFO, "enableShutdownHook is disabled.", new Object[0]);
        } else {
            this.f50512b = new Thread(new Runnable() { // from class: io.sentry.X3
                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC4740e0.this.b(f32.getFlushTimeoutMillis());
                }
            }, "sentry-shutdownhook");
            B(new Runnable() { // from class: io.sentry.Y3
                @Override // java.lang.Runnable
                public final void run() {
                    ShutdownHookIntegration.d(ShutdownHookIntegration.this, f32);
                }
            });
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f50512b != null) {
            B(new Runnable() { // from class: io.sentry.W3
                @Override // java.lang.Runnable
                public final void run() {
                    r0.f50511a.removeShutdownHook(ShutdownHookIntegration.this.f50512b);
                }
            });
        }
    }

    public ShutdownHookIntegration() {
        this(Runtime.getRuntime());
    }
}
