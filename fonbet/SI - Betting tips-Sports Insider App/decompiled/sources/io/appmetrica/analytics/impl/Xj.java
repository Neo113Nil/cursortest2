package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Xj {

    /* renamed from: a, reason: collision with root package name */
    public volatile long f13194a;

    /* renamed from: b, reason: collision with root package name */
    public Ze f13195b;

    /* renamed from: c, reason: collision with root package name */
    public TimeProvider f13196c;

    public static Xj c() {
        return Wj.f13112a;
    }

    public final synchronized long a() {
        return (System.currentTimeMillis() / 1000) + this.f13194a;
    }

    public final synchronized void b() {
        this.f13195b.d(false);
        this.f13195b.b();
    }

    public final synchronized long d() {
        return this.f13194a;
    }

    public final synchronized void e() {
        a(C0353na.I.y(), new SystemTimeProvider());
    }

    public final synchronized boolean f() {
        return this.f13195b.b(true);
    }

    public final synchronized void a(long j, Long l6) {
        try {
            this.f13194a = (j - this.f13196c.currentTimeMillis()) / 1000;
            boolean z5 = true;
            if (this.f13195b.b(true)) {
                if (l6 != null) {
                    long abs = Math.abs(j - this.f13196c.currentTimeMillis());
                    Ze ze2 = this.f13195b;
                    if (abs <= TimeUnit.SECONDS.toMillis(l6.longValue())) {
                        z5 = false;
                    }
                    ze2.d(z5);
                } else {
                    this.f13195b.d(false);
                }
            }
            this.f13195b.d(this.f13194a);
            this.f13195b.b();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void a(Ze ze2, TimeProvider timeProvider) {
        this.f13195b = ze2;
        this.f13194a = ze2.a(0);
        this.f13196c = timeProvider;
    }
}
