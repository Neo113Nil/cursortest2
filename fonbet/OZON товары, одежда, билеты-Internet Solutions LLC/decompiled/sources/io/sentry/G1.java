package io.sentry;

import io.sentry.android.core.SentryAndroidOptions;
import java.io.File;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class G1 implements E1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.work.impl.w f66622a;

    public G1(@NotNull androidx.work.impl.w wVar) {
        this.f66622a = wVar;
    }

    @Override // io.sentry.E1
    public final D1 b(@NotNull A1 a12, @NotNull SentryAndroidOptions sentryAndroidOptions) {
        io.sentry.util.p.b(a12, "Scopes are required");
        io.sentry.util.p.b(sentryAndroidOptions, "SentryOptions is required");
        String outboxPath = ((SentryAndroidOptions) this.f66622a.f45532a).getOutboxPath();
        if (outboxPath == null || !E1.a(outboxPath, sentryAndroidOptions.getLogger())) {
            sentryAndroidOptions.getLogger().c(I2.ERROR, "No outbox dir path is defined in options.", new Object[0]);
            return null;
        }
        return new D1(sentryAndroidOptions.getLogger(), outboxPath, new C7139e1(a12, sentryAndroidOptions.getEnvelopeReader(), sentryAndroidOptions.getSerializer(), sentryAndroidOptions.getLogger(), sentryAndroidOptions.getFlushTimeoutMillis(), sentryAndroidOptions.getMaxQueueSize()), new File(outboxPath));
    }
}
