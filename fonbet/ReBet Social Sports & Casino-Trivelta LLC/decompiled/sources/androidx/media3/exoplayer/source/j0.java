package androidx.media3.exoplayer.source;

import androidx.media3.exoplayer.source.C;
import e1.AbstractC4134a;
import m1.O0;
import m1.o1;

/* loaded from: classes.dex */
public final class j0 implements C, C.a {

    /* renamed from: a, reason: collision with root package name */
    public final C f21820a;

    /* renamed from: b, reason: collision with root package name */
    public final long f21821b;

    /* renamed from: c, reason: collision with root package name */
    public C.a f21822c;

    public static final class a implements c0 {

        /* renamed from: a, reason: collision with root package name */
        public final c0 f21823a;

        /* renamed from: b, reason: collision with root package name */
        public final long f21824b;

        public a(c0 c0Var, long j10) {
            this.f21823a = c0Var;
            this.f21824b = j10;
        }

        @Override // androidx.media3.exoplayer.source.c0
        public void a() {
            this.f21823a.a();
        }

        public c0 b() {
            return this.f21823a;
        }

        @Override // androidx.media3.exoplayer.source.c0
        public boolean c() {
            return this.f21823a.c();
        }

        @Override // androidx.media3.exoplayer.source.c0
        public int q(long j10) {
            return this.f21823a.q(j10 - this.f21824b);
        }

        @Override // androidx.media3.exoplayer.source.c0
        public int s(O0 o02, k1.f fVar, int i10) {
            int s10 = this.f21823a.s(o02, fVar, i10);
            if (s10 == -4) {
                fVar.f54110f += this.f21824b;
            }
            return s10;
        }
    }

    public j0(C c10, long j10) {
        this.f21820a = c10;
        this.f21821b = j10;
    }

    public C a() {
        return this.f21820a;
    }

    @Override // androidx.media3.exoplayer.source.C, androidx.media3.exoplayer.source.d0
    public boolean b(androidx.media3.exoplayer.k kVar) {
        return this.f21820a.b(kVar.a().f(kVar.f21352a - this.f21821b).d());
    }

    @Override // androidx.media3.exoplayer.source.C, androidx.media3.exoplayer.source.d0
    public long d() {
        long d10 = this.f21820a.d();
        if (d10 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return d10 + this.f21821b;
    }

    @Override // androidx.media3.exoplayer.source.C, androidx.media3.exoplayer.source.d0
    public boolean e() {
        return this.f21820a.e();
    }

    @Override // androidx.media3.exoplayer.source.C
    public long f(long j10, o1 o1Var) {
        return this.f21820a.f(j10 - this.f21821b, o1Var) + this.f21821b;
    }

    @Override // androidx.media3.exoplayer.source.C, androidx.media3.exoplayer.source.d0
    public long g() {
        long g10 = this.f21820a.g();
        if (g10 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return g10 + this.f21821b;
    }

    @Override // androidx.media3.exoplayer.source.C, androidx.media3.exoplayer.source.d0
    public void h(long j10) {
        this.f21820a.h(j10 - this.f21821b);
    }

    @Override // androidx.media3.exoplayer.source.C.a
    public void i(C c10) {
        ((C.a) AbstractC4134a.e(this.f21822c)).i(this);
    }

    @Override // androidx.media3.exoplayer.source.C
    public long k(long j10) {
        return this.f21820a.k(j10 - this.f21821b) + this.f21821b;
    }

    @Override // androidx.media3.exoplayer.source.C
    public long m(androidx.media3.exoplayer.trackselection.y[] yVarArr, boolean[] zArr, c0[] c0VarArr, boolean[] zArr2, long j10) {
        c0[] c0VarArr2 = new c0[c0VarArr.length];
        int i10 = 0;
        while (true) {
            c0 c0Var = null;
            if (i10 >= c0VarArr.length) {
                break;
            }
            a aVar = (a) c0VarArr[i10];
            if (aVar != null) {
                c0Var = aVar.b();
            }
            c0VarArr2[i10] = c0Var;
            i10++;
        }
        long m10 = this.f21820a.m(yVarArr, zArr, c0VarArr2, zArr2, j10 - this.f21821b);
        for (int i11 = 0; i11 < c0VarArr.length; i11++) {
            c0 c0Var2 = c0VarArr2[i11];
            if (c0Var2 == null) {
                c0VarArr[i11] = null;
            } else {
                c0 c0Var3 = c0VarArr[i11];
                if (c0Var3 == null || ((a) c0Var3).b() != c0Var2) {
                    c0VarArr[i11] = new a(c0Var2, this.f21821b);
                }
            }
        }
        return m10 + this.f21821b;
    }

    @Override // androidx.media3.exoplayer.source.C
    public long n() {
        long n10 = this.f21820a.n();
        if (n10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return n10 + this.f21821b;
    }

    @Override // androidx.media3.exoplayer.source.d0.a
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void j(C c10) {
        ((C.a) AbstractC4134a.e(this.f21822c)).j(this);
    }

    @Override // androidx.media3.exoplayer.source.C
    public void r() {
        this.f21820a.r();
    }

    @Override // androidx.media3.exoplayer.source.C
    public void t(C.a aVar, long j10) {
        this.f21822c = aVar;
        this.f21820a.t(this, j10 - this.f21821b);
    }

    @Override // androidx.media3.exoplayer.source.C
    public m0 u() {
        return this.f21820a.u();
    }

    @Override // androidx.media3.exoplayer.source.C
    public void v(long j10, boolean z10) {
        this.f21820a.v(j10 - this.f21821b, z10);
    }
}
