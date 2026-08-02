package c2;

import H1.AbstractC1185s;
import H1.InterfaceC1184q;
import H1.J;
import H1.K;
import e1.AbstractC4134a;
import e1.Z;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigInteger;

/* renamed from: c2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2486a implements g {

    /* renamed from: a, reason: collision with root package name */
    public final f f26847a;

    /* renamed from: b, reason: collision with root package name */
    public final long f26848b;

    /* renamed from: c, reason: collision with root package name */
    public final long f26849c;

    /* renamed from: d, reason: collision with root package name */
    public final i f26850d;

    /* renamed from: e, reason: collision with root package name */
    public int f26851e;

    /* renamed from: f, reason: collision with root package name */
    public long f26852f;

    /* renamed from: g, reason: collision with root package name */
    public long f26853g;

    /* renamed from: h, reason: collision with root package name */
    public long f26854h;

    /* renamed from: i, reason: collision with root package name */
    public long f26855i;

    /* renamed from: j, reason: collision with root package name */
    public long f26856j;

    /* renamed from: k, reason: collision with root package name */
    public long f26857k;

    /* renamed from: l, reason: collision with root package name */
    public long f26858l;

    /* renamed from: c2.a$b */
    public final class b implements J {
        public b() {
        }

        @Override // H1.J
        public J.a e(long j10) {
            return new J.a(new K(j10, Z.p((C2486a.this.f26848b + BigInteger.valueOf(C2486a.this.f26850d.c(j10)).multiply(BigInteger.valueOf(C2486a.this.f26849c - C2486a.this.f26848b)).divide(BigInteger.valueOf(C2486a.this.f26852f)).longValue()) - 30000, C2486a.this.f26848b, C2486a.this.f26849c - 1)));
        }

        @Override // H1.J
        public boolean i() {
            return true;
        }

        @Override // H1.J
        public long m() {
            return C2486a.this.f26850d.b(C2486a.this.f26852f);
        }
    }

    public C2486a(i iVar, long j10, long j11, long j12, long j13, boolean z10) {
        AbstractC4134a.a(j10 >= 0 && j11 > j10);
        this.f26850d = iVar;
        this.f26848b = j10;
        this.f26849c = j11;
        if (j12 == j11 - j10 || z10) {
            this.f26852f = j13;
            this.f26851e = 4;
        } else {
            this.f26851e = 0;
        }
        this.f26847a = new f();
    }

    @Override // c2.g
    public long a(InterfaceC1184q interfaceC1184q) {
        int i10 = this.f26851e;
        if (i10 == 0) {
            long position = interfaceC1184q.getPosition();
            this.f26853g = position;
            this.f26851e = 1;
            long j10 = this.f26849c - 65307;
            if (j10 > position) {
                return j10;
            }
        } else if (i10 != 1) {
            if (i10 == 2) {
                long i11 = i(interfaceC1184q);
                if (i11 != -1) {
                    return i11;
                }
                this.f26851e = 3;
            } else if (i10 != 3) {
                if (i10 == 4) {
                    return -1L;
                }
                throw new IllegalStateException();
            }
            k(interfaceC1184q);
            this.f26851e = 4;
            return -(this.f26857k + 2);
        }
        this.f26852f = j(interfaceC1184q);
        this.f26851e = 4;
        return this.f26853g;
    }

    @Override // c2.g
    public void c(long j10) {
        this.f26854h = Z.p(j10, 0L, this.f26852f - 1);
        this.f26851e = 2;
        this.f26855i = this.f26848b;
        this.f26856j = this.f26849c;
        this.f26857k = 0L;
        this.f26858l = this.f26852f;
    }

    @Override // c2.g
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public b b() {
        if (this.f26852f != 0) {
            return new b();
        }
        return null;
    }

    public final long i(InterfaceC1184q interfaceC1184q) {
        if (this.f26855i == this.f26856j) {
            return -1L;
        }
        long position = interfaceC1184q.getPosition();
        if (!this.f26847a.d(interfaceC1184q, this.f26856j)) {
            long j10 = this.f26855i;
            if (j10 != position) {
                return j10;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.f26847a.a(interfaceC1184q, false);
        interfaceC1184q.g();
        long j11 = this.f26854h;
        f fVar = this.f26847a;
        long j12 = fVar.f26877c;
        long j13 = j11 - j12;
        int i10 = fVar.f26882h + fVar.f26883i;
        if (0 <= j13 && j13 < 72000) {
            return -1L;
        }
        if (j13 < 0) {
            this.f26856j = position;
            this.f26858l = j12;
        } else {
            this.f26855i = interfaceC1184q.getPosition() + i10;
            this.f26857k = this.f26847a.f26877c;
        }
        long j14 = this.f26856j;
        long j15 = this.f26855i;
        if (j14 - j15 < 100000) {
            this.f26856j = j15;
            return j15;
        }
        long position2 = interfaceC1184q.getPosition() - (i10 * (j13 <= 0 ? 2L : 1L));
        long j16 = this.f26856j;
        long j17 = this.f26855i;
        return Z.p(position2 + ((j13 * (j16 - j17)) / (this.f26858l - this.f26857k)), j17, j16 - 1);
    }

    public long j(InterfaceC1184q interfaceC1184q) {
        this.f26847a.b();
        if (!this.f26847a.c(interfaceC1184q)) {
            throw new EOFException();
        }
        this.f26847a.a(interfaceC1184q, false);
        f fVar = this.f26847a;
        interfaceC1184q.l(fVar.f26882h + fVar.f26883i);
        long j10 = this.f26847a.f26877c;
        while (true) {
            f fVar2 = this.f26847a;
            if ((fVar2.f26876b & 4) == 4 || !fVar2.c(interfaceC1184q) || interfaceC1184q.getPosition() >= this.f26849c || !this.f26847a.a(interfaceC1184q, true)) {
                break;
            }
            f fVar3 = this.f26847a;
            if (!AbstractC1185s.f(interfaceC1184q, fVar3.f26882h + fVar3.f26883i)) {
                break;
            }
            j10 = this.f26847a.f26877c;
        }
        return j10;
    }

    public final void k(InterfaceC1184q interfaceC1184q) {
        while (true) {
            this.f26847a.c(interfaceC1184q);
            this.f26847a.a(interfaceC1184q, false);
            f fVar = this.f26847a;
            if (fVar.f26877c > this.f26854h) {
                interfaceC1184q.g();
                return;
            } else {
                interfaceC1184q.l(fVar.f26882h + fVar.f26883i);
                this.f26855i = interfaceC1184q.getPosition();
                this.f26857k = this.f26847a.f26877c;
            }
        }
    }
}
