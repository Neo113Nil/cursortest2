package F1;

import F1.z;
import b1.Y;
import e1.AbstractC4134a;
import e1.C4158z;
import e1.InterfaceC4143j;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public final a f3261a;

    /* renamed from: b, reason: collision with root package name */
    public final z f3262b;

    /* renamed from: k, reason: collision with root package name */
    public long f3271k;

    /* renamed from: c, reason: collision with root package name */
    public final z.a f3263c = new z.a();

    /* renamed from: d, reason: collision with root package name */
    public final e1.P f3264d = new e1.P();

    /* renamed from: e, reason: collision with root package name */
    public final e1.P f3265e = new e1.P();

    /* renamed from: f, reason: collision with root package name */
    public final C4158z f3266f = new C4158z();

    /* renamed from: g, reason: collision with root package name */
    public long f3267g = -9223372036854775807L;

    /* renamed from: j, reason: collision with root package name */
    public Y f3270j = Y.f24525e;

    /* renamed from: h, reason: collision with root package name */
    public long f3268h = -9223372036854775807L;

    /* renamed from: i, reason: collision with root package name */
    public long f3269i = -9223372036854775807L;

    public interface a {
        void a();

        void b(long j10, long j11, boolean z10);

        void c(Y y10);
    }

    public D(a aVar, z zVar) {
        this.f3261a = aVar;
        this.f3262b = zVar;
    }

    public static Object c(e1.P p10) {
        AbstractC4134a.a(p10.l() > 0);
        while (p10.l() > 1) {
            p10.i();
        }
        return AbstractC4134a.e(p10.i());
    }

    public final void a() {
        this.f3266f.f();
        this.f3261a.a();
    }

    public void b() {
        this.f3266f.b();
        this.f3267g = -9223372036854775807L;
        this.f3268h = -9223372036854775807L;
        this.f3269i = -9223372036854775807L;
        if (this.f3265e.l() > 0) {
            this.f3271k = ((Long) c(this.f3265e)).longValue();
        }
        if (this.f3264d.l() > 0) {
            this.f3264d.a(0L, (Y) c(this.f3264d));
        }
    }

    public boolean d() {
        long j10 = this.f3269i;
        return j10 != -9223372036854775807L && this.f3268h == j10;
    }

    public final boolean e(long j10) {
        Long l10 = (Long) this.f3265e.j(j10);
        if (l10 == null || l10.longValue() == this.f3271k) {
            return false;
        }
        this.f3271k = l10.longValue();
        return true;
    }

    public final boolean f(long j10) {
        Y y10 = (Y) this.f3264d.j(j10);
        if (y10 == null || y10.equals(Y.f24525e) || y10.equals(this.f3270j)) {
            return false;
        }
        this.f3270j = y10;
        return true;
    }

    public void g(long j10) {
        this.f3266f.a(j10);
        this.f3267g = j10;
        this.f3269i = -9223372036854775807L;
    }

    public void h(int i10, long j10) {
        if (this.f3266f.e()) {
            this.f3262b.j(i10);
            this.f3271k = j10;
        } else {
            e1.P p10 = this.f3265e;
            long j11 = this.f3267g;
            p10.a(j11 == -9223372036854775807L ? -4611686018427387904L : j11 + 1, Long.valueOf(j10));
        }
    }

    public void i(int i10, int i11) {
        e1.P p10 = this.f3264d;
        long j10 = this.f3267g;
        p10.a(j10 == -9223372036854775807L ? 0L : j10 + 1, new Y(i10, i11));
    }

    public void j(long j10, long j11) {
        while (!this.f3266f.e()) {
            long d10 = this.f3266f.d();
            if (e(d10)) {
                this.f3262b.j(2);
            }
            int c10 = this.f3262b.c(d10, j10, j11, this.f3271k, false, false, this.f3263c);
            if (c10 == 0 || c10 == 1) {
                this.f3268h = d10;
                k(c10 == 0);
            } else if (c10 == 2 || c10 == 3) {
                this.f3268h = d10;
                a();
            } else {
                if (c10 != 4) {
                    if (c10 != 5) {
                        throw new IllegalStateException(String.valueOf(c10));
                    }
                    return;
                }
                this.f3268h = d10;
            }
        }
    }

    public final void k(boolean z10) {
        long f10 = this.f3266f.f();
        if (f(f10)) {
            this.f3261a.c(this.f3270j);
        }
        this.f3261a.b(z10 ? InterfaceC4143j.f45530a.nanoTime() : this.f3263c.g(), f10, this.f3262b.g());
    }

    public void l() {
        if (this.f3267g == -9223372036854775807L) {
            this.f3267g = Long.MIN_VALUE;
            this.f3268h = Long.MIN_VALUE;
        }
        this.f3269i = this.f3267g;
    }
}
