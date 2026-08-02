package io.sentry.android.core;

/* loaded from: classes10.dex */
final class m0 {

    /* renamed from: a, reason: collision with root package name */
    private int f67285a;

    /* renamed from: b, reason: collision with root package name */
    private int f67286b;

    /* renamed from: c, reason: collision with root package name */
    private long f67287c;

    /* renamed from: d, reason: collision with root package name */
    private long f67288d;

    /* renamed from: e, reason: collision with root package name */
    private long f67289e;

    public final void a(long j11, long j12, boolean z11, boolean z12) {
        this.f67289e += j11;
        if (z12) {
            this.f67288d += j12;
            this.f67286b++;
        } else if (z11) {
            this.f67287c += j12;
            this.f67285a++;
        }
    }

    public final int b() {
        return this.f67286b;
    }

    public final long c() {
        return this.f67288d;
    }

    public final int d() {
        return this.f67285a;
    }

    public final long e() {
        return this.f67287c;
    }

    public final int f() {
        return this.f67285a + this.f67286b;
    }

    public final long g() {
        return this.f67289e;
    }
}
