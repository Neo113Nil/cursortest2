package H1;

import H1.J;

/* loaded from: classes.dex */
public final class M implements J {

    /* renamed from: a, reason: collision with root package name */
    public final long f4348a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4349b;

    public M(long j10) {
        this(j10, 0L);
    }

    @Override // H1.J
    public J.a e(long j10) {
        return new J.a(new K(j10, this.f4349b));
    }

    @Override // H1.J
    public boolean i() {
        return true;
    }

    @Override // H1.J
    public long m() {
        return this.f4348a;
    }

    public M(long j10, long j11) {
        this.f4348a = j10;
        this.f4349b = j11;
    }
}
