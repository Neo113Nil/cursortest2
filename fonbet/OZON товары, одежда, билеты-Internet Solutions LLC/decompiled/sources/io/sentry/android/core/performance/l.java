package io.sentry.android.core.performance;

import android.os.SystemClock;
import io.sentry.O2;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class l implements Comparable<l> {

    /* renamed from: a, reason: collision with root package name */
    private String f67342a;

    /* renamed from: b, reason: collision with root package name */
    private long f67343b;

    /* renamed from: c, reason: collision with root package name */
    private long f67344c;

    /* renamed from: d, reason: collision with root package name */
    private long f67345d;

    public final String a() {
        return this.f67342a;
    }

    public final long b() {
        if (k()) {
            return this.f67345d - this.f67344c;
        }
        return 0L;
    }

    public final long c() {
        if (!j()) {
            return 0L;
        }
        return b() + this.f67343b;
    }

    @Override // java.lang.Comparable
    public final int compareTo(@NotNull l lVar) {
        return Long.compare(this.f67343b, lVar.f67343b);
    }

    public final O2 d() {
        if (j()) {
            return new O2(this.f67343b * 1000000);
        }
        return null;
    }

    public final long e() {
        return this.f67343b;
    }

    public final double f() {
        return this.f67343b / 1000.0d;
    }

    public final long g() {
        return this.f67344c;
    }

    public final boolean h() {
        return this.f67344c == 0;
    }

    public final boolean i() {
        return this.f67345d == 0;
    }

    public final boolean j() {
        return this.f67344c != 0;
    }

    public final boolean k() {
        return this.f67345d != 0;
    }

    public final void l() {
        this.f67342a = null;
        this.f67344c = 0L;
        this.f67345d = 0L;
        this.f67343b = 0L;
    }

    public final void m(long j11) {
        this.f67344c = j11;
        this.f67343b = System.currentTimeMillis() - (SystemClock.uptimeMillis() - this.f67344c);
    }

    public final void n(long j11, long j12, long j13, String str) {
        this.f67342a = str;
        this.f67343b = j11;
        this.f67344c = j12;
        this.f67345d = j13;
    }

    public final void o() {
        this.f67345d = SystemClock.uptimeMillis();
    }
}
