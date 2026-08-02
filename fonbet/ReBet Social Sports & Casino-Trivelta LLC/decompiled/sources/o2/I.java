package o2;

import H1.InterfaceC1184q;
import e1.Q;
import e1.Z;

/* loaded from: classes.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    public final int f58942a;

    /* renamed from: d, reason: collision with root package name */
    public boolean f58945d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f58946e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f58947f;

    /* renamed from: b, reason: collision with root package name */
    public final Q f58943b = new Q(0);

    /* renamed from: g, reason: collision with root package name */
    public long f58948g = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    public long f58949h = -9223372036854775807L;

    /* renamed from: i, reason: collision with root package name */
    public long f58950i = -9223372036854775807L;

    /* renamed from: c, reason: collision with root package name */
    public final e1.J f58944c = new e1.J();

    public I(int i10) {
        this.f58942a = i10;
    }

    public final int a(InterfaceC1184q interfaceC1184q) {
        this.f58944c.Y(Z.EMPTY_BYTE_ARRAY);
        this.f58945d = true;
        interfaceC1184q.g();
        return 0;
    }

    public long b() {
        return this.f58950i;
    }

    public Q c() {
        return this.f58943b;
    }

    public boolean d() {
        return this.f58945d;
    }

    public int e(InterfaceC1184q interfaceC1184q, H1.I i10, int i11) {
        if (i11 <= 0) {
            return a(interfaceC1184q);
        }
        if (!this.f58947f) {
            return h(interfaceC1184q, i10, i11);
        }
        if (this.f58949h == -9223372036854775807L) {
            return a(interfaceC1184q);
        }
        if (!this.f58946e) {
            return f(interfaceC1184q, i10, i11);
        }
        long j10 = this.f58948g;
        if (j10 == -9223372036854775807L) {
            return a(interfaceC1184q);
        }
        this.f58950i = this.f58943b.c(this.f58949h) - this.f58943b.b(j10);
        return a(interfaceC1184q);
    }

    public final int f(InterfaceC1184q interfaceC1184q, H1.I i10, int i11) {
        int min = (int) Math.min(this.f58942a, interfaceC1184q.getLength());
        long j10 = 0;
        if (interfaceC1184q.getPosition() != j10) {
            i10.f4333a = j10;
            return 1;
        }
        this.f58944c.X(min);
        interfaceC1184q.g();
        interfaceC1184q.n(this.f58944c.f(), 0, min);
        this.f58948g = g(this.f58944c, i11);
        this.f58946e = true;
        return 0;
    }

    public final long g(e1.J j10, int i10) {
        int j11 = j10.j();
        for (int g10 = j10.g(); g10 < j11; g10++) {
            if (j10.f()[g10] == 71) {
                long c10 = M.c(j10, g10, i10);
                if (c10 != -9223372036854775807L) {
                    return c10;
                }
            }
        }
        return -9223372036854775807L;
    }

    public final int h(InterfaceC1184q interfaceC1184q, H1.I i10, int i11) {
        long length = interfaceC1184q.getLength();
        int min = (int) Math.min(this.f58942a, length);
        long j10 = length - min;
        if (interfaceC1184q.getPosition() != j10) {
            i10.f4333a = j10;
            return 1;
        }
        this.f58944c.X(min);
        interfaceC1184q.g();
        interfaceC1184q.n(this.f58944c.f(), 0, min);
        this.f58949h = i(this.f58944c, i11);
        this.f58947f = true;
        return 0;
    }

    public final long i(e1.J j10, int i10) {
        int g10 = j10.g();
        int j11 = j10.j();
        for (int i11 = j11 - 188; i11 >= g10; i11--) {
            if (M.b(j10.f(), g10, j11, i11)) {
                long c10 = M.c(j10, i11, i10);
                if (c10 != -9223372036854775807L) {
                    return c10;
                }
            }
        }
        return -9223372036854775807L;
    }
}
