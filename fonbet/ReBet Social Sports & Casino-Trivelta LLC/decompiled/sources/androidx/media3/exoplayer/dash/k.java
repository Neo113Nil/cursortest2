package androidx.media3.exoplayer.dash;

import H1.C1174g;

/* loaded from: classes.dex */
public final class k implements i {

    /* renamed from: a, reason: collision with root package name */
    public final C1174g f21052a;

    /* renamed from: b, reason: collision with root package name */
    public final long f21053b;

    public k(C1174g c1174g, long j10) {
        this.f21052a = c1174g;
        this.f21053b = j10;
    }

    @Override // androidx.media3.exoplayer.dash.i
    public long a(long j10, long j11) {
        return this.f21052a.durationsUs[(int) j10];
    }

    @Override // androidx.media3.exoplayer.dash.i
    public long b(long j10) {
        return this.f21052a.timesUs[(int) j10] - this.f21053b;
    }

    @Override // androidx.media3.exoplayer.dash.i
    public long c(long j10, long j11) {
        return 0L;
    }

    @Override // androidx.media3.exoplayer.dash.i
    public long d(long j10, long j11) {
        return -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.dash.i
    public p1.i e(long j10) {
        return new p1.i(null, this.f21052a.offsets[(int) j10], r1.sizes[r7]);
    }

    @Override // androidx.media3.exoplayer.dash.i
    public long f(long j10, long j11) {
        return this.f21052a.a(j10 + this.f21053b);
    }

    @Override // androidx.media3.exoplayer.dash.i
    public long g(long j10) {
        return this.f21052a.f4434a;
    }

    @Override // androidx.media3.exoplayer.dash.i
    public boolean h() {
        return true;
    }

    @Override // androidx.media3.exoplayer.dash.i
    public long i() {
        return 0L;
    }

    @Override // androidx.media3.exoplayer.dash.i
    public long j(long j10, long j11) {
        return this.f21052a.f4434a;
    }
}
