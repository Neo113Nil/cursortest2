package io.sentry;

import io.sentry.android.core.SentryAndroidOptions;
import java.io.File;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class F1 implements E1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.work.impl.w f66619a;

    public F1(@NotNull androidx.work.impl.w wVar) {
        this.f66619a = wVar;
    }

    @Override // io.sentry.E1
    public final D1 b(@NotNull A1 a12, @NotNull SentryAndroidOptions sentryAndroidOptions) {
        io.sentry.util.p.b(a12, "Scopes are required");
        io.sentry.util.p.b(sentryAndroidOptions, "SentryOptions is required");
        String cacheDirPath = ((SentryAndroidOptions) this.f66619a.f45532a).getCacheDirPath();
        if (cacheDirPath == null || !E1.a(cacheDirPath, sentryAndroidOptions.getLogger())) {
            sentryAndroidOptions.getLogger().c(I2.ERROR, "No cache dir path is defined in options.", new Object[0]);
            return null;
        }
        return new D1(sentryAndroidOptions.getLogger(), cacheDirPath, new C7223y(a12, sentryAndroidOptions.getSerializer(), sentryAndroidOptions.getLogger(), sentryAndroidOptions.getFlushTimeoutMillis(), sentryAndroidOptions.getMaxQueueSize()), new File(cacheDirPath));
    }
}
