package io.sentry;

import java.io.File;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class C0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final W2 f66590a;

    C0(@NotNull W2 w22) {
        this.f66590a = w22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        W2 w22 = this.f66590a;
        String cacheDirPath = w22.getCacheDirPath();
        if (cacheDirPath == null) {
            w22.getLogger().c(I2.INFO, "Cache dir is not set, not moving the previous session.", new Object[0]);
            return;
        }
        io.sentry.cache.g envelopeDiskCache = w22.getEnvelopeDiskCache();
        if (envelopeDiskCache instanceof io.sentry.cache.f) {
            int i11 = io.sentry.cache.f.f67785j;
            io.sentry.cache.f fVar = (io.sentry.cache.f) envelopeDiskCache;
            fVar.h(new File(cacheDirPath, "session.json"), new File(cacheDirPath, "previous_session.json"));
            fVar.f();
        }
    }
}
