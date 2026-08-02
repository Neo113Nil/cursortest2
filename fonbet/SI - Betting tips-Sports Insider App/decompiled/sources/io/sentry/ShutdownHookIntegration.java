package io.sentry;

import java.io.Closeable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class ShutdownHookIntegration implements q1, Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final Runtime f15422a;

    /* renamed from: b, reason: collision with root package name */
    public Thread f15423b;

    public ShutdownHookIntegration() {
        Runtime runtime = Runtime.getRuntime();
        y4.a.C(runtime, "Runtime is required");
        this.f15422a = runtime;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f15423b != null) {
            try {
                this.f15422a.removeShutdownHook(this.f15423b);
            } catch (IllegalStateException e7) {
                String message = e7.getMessage();
                if (message == null || !(message.equals("Shutdown in progress") || message.equals("VM already shutting down"))) {
                    throw e7;
                }
            }
        }
    }

    @Override // io.sentry.q1
    public final void y(b6 b6Var) {
        if (!b6Var.isEnableShutdownHook()) {
            b6Var.getLogger().h(b5.INFO, "enableShutdownHook is disabled.", new Object[0]);
            return;
        }
        this.f15423b = new Thread(new b4(b6Var, 3), "sentry-shutdownhook");
        try {
            this.f15422a.addShutdownHook(this.f15423b);
            b6Var.getLogger().h(b5.DEBUG, "ShutdownHookIntegration installed.", new Object[0]);
            rh.g.a("ShutdownHook");
        } catch (IllegalStateException e7) {
            String message = e7.getMessage();
            if (message == null || !(message.equals("Shutdown in progress") || message.equals("VM already shutting down"))) {
                throw e7;
            }
        }
    }
}
