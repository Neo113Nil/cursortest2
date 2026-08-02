package io.sentry;

import java.io.Closeable;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class ShutdownHookIntegration implements InterfaceC7166l0, Closeable {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Runtime f66741a;

    /* renamed from: b, reason: collision with root package name */
    private Thread f66742b;

    public ShutdownHookIntegration() {
        Runtime runtime = Runtime.getRuntime();
        io.sentry.util.p.b(runtime, "Runtime is required");
        this.f66741a = runtime;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f66742b != null) {
            try {
                new YJ.e(this, 4).run();
            } catch (IllegalStateException e11) {
                String message = e11.getMessage();
                if (message == null || !(message.equals("Shutdown in progress") || message.equals("VM already shutting down"))) {
                    throw e11;
                }
            }
        }
    }

    @Override // io.sentry.InterfaceC7166l0
    public final void d(@NotNull A1 a12, @NotNull W2 w22) {
        if (!w22.isEnableShutdownHook()) {
            w22.getLogger().c(I2.INFO, "enableShutdownHook is disabled.", new Object[0]);
            return;
        }
        this.f66742b = new Thread(new L3.J(1, a12, w22), "sentry-shutdownhook");
        try {
            this.f66741a.addShutdownHook(this.f66742b);
            w22.getLogger().c(I2.DEBUG, "ShutdownHookIntegration installed.", new Object[0]);
            io.sentry.util.j.a("ShutdownHook");
        } catch (IllegalStateException e11) {
            String message = e11.getMessage();
            if (message == null || !(message.equals("Shutdown in progress") || message.equals("VM already shutting down"))) {
                throw e11;
            }
        }
    }
}
