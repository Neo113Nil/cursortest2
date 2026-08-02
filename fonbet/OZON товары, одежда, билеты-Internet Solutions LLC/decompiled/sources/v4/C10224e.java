package v4;

import N3.H;
import N3.I;
import java.math.RoundingMode;
import m3.N;

/* renamed from: v4.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C10224e implements H {

    /* renamed from: a, reason: collision with root package name */
    private final C10222c f102127a;

    /* renamed from: b, reason: collision with root package name */
    private final int f102128b;

    /* renamed from: c, reason: collision with root package name */
    private final long f102129c;

    /* renamed from: d, reason: collision with root package name */
    private final long f102130d;

    /* renamed from: e, reason: collision with root package name */
    private final long f102131e;

    public C10224e(C10222c c10222c, int i11, long j11, long j12) {
        this.f102127a = c10222c;
        this.f102128b = i11;
        this.f102129c = j11;
        long j13 = (j12 - j11) / c10222c.f102120d;
        this.f102130d = j13;
        this.f102131e = a(j13);
    }

    private long a(long j11) {
        long j12 = j11 * this.f102128b;
        long j13 = this.f102127a.f102119c;
        int i11 = N.f74289a;
        return N.Z(j12, 1000000L, j13, RoundingMode.DOWN);
    }

    @Override // N3.H
    public final long getDurationUs() {
        return this.f102131e;
    }

    @Override // N3.H
    public final H.a getSeekPoints(long j11) {
        C10222c c10222c = this.f102127a;
        long j12 = this.f102130d;
        long j13 = N.j((c10222c.f102119c * j11) / (this.f102128b * 1000000), 0L, j12 - 1);
        long j14 = this.f102129c;
        long a11 = a(j13);
        I i11 = new I(a11, (c10222c.f102120d * j13) + j14);
        if (a11 >= j11 || j13 == j12 - 1) {
            return new H.a(i11, i11);
        }
        long j15 = j13 + 1;
        return new H.a(i11, new I(a(j15), (c10222c.f102120d * j15) + j14));
    }

    @Override // N3.H
    public final boolean isSeekable() {
        return true;
    }
}
