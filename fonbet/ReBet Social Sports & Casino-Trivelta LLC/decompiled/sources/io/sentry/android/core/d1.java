package io.sentry.android.core;

/* loaded from: classes3.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public int f50950a;

    /* renamed from: b, reason: collision with root package name */
    public int f50951b;

    /* renamed from: c, reason: collision with root package name */
    public long f50952c;

    /* renamed from: d, reason: collision with root package name */
    public long f50953d;

    /* renamed from: e, reason: collision with root package name */
    public long f50954e;

    public void a(long j10, long j11, boolean z10, boolean z11) {
        this.f50954e += j10;
        if (z11) {
            this.f50953d += j11;
            this.f50951b++;
        } else if (z10) {
            this.f50952c += j11;
            this.f50950a++;
        }
    }

    public int b() {
        return this.f50951b;
    }

    public long c() {
        return this.f50953d;
    }

    public int d() {
        return this.f50950a;
    }

    public long e() {
        return this.f50952c;
    }

    public int f() {
        return this.f50950a + this.f50951b;
    }

    public long g() {
        return this.f50954e;
    }
}
