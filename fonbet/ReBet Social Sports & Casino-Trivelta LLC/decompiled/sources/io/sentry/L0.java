package io.sentry;

/* loaded from: classes3.dex */
public final class L0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final F3 f50412a;

    public L0(F3 f32) {
        this.f50412a = f32;
    }

    @Override // java.lang.Runnable
    public void run() {
        String cacheDirPath = this.f50412a.getCacheDirPath();
        if (cacheDirPath == null) {
            this.f50412a.getLogger().c(EnumC4788n3.INFO, "Cache dir is not set, not moving the previous session.", new Object[0]);
            return;
        }
        io.sentry.cache.g envelopeDiskCache = this.f50412a.getEnvelopeDiskCache();
        if (envelopeDiskCache instanceof io.sentry.cache.f) {
            io.sentry.cache.f fVar = (io.sentry.cache.f) envelopeDiskCache;
            fVar.w(io.sentry.cache.f.t(cacheDirPath), io.sentry.cache.f.v(cacheDirPath));
            fVar.s();
        }
    }
}
