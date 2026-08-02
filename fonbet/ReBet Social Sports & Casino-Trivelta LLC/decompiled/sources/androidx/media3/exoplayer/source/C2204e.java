package androidx.media3.exoplayer.source;

import androidx.media3.exoplayer.source.C;
import androidx.media3.exoplayer.source.C2205f;
import b1.AbstractC2335D;
import e1.AbstractC4134a;
import kotlin.jvm.internal.LongCompanionObject;
import m1.O0;
import m1.o1;

/* renamed from: androidx.media3.exoplayer.source.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2204e implements C, C.a {

    /* renamed from: a, reason: collision with root package name */
    public final C f21716a;

    /* renamed from: b, reason: collision with root package name */
    public C.a f21717b;

    /* renamed from: c, reason: collision with root package name */
    public long f21718c;

    /* renamed from: d, reason: collision with root package name */
    public long f21719d;

    /* renamed from: e, reason: collision with root package name */
    public long f21720e;

    /* renamed from: f, reason: collision with root package name */
    public C2205f.d f21721f;
    private a[] sampleStreams = new a[0];

    /* renamed from: androidx.media3.exoplayer.source.e$a */
    public final class a implements c0 {

        /* renamed from: a, reason: collision with root package name */
        public final c0 f21722a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f21723b;

        public a(c0 c0Var) {
            this.f21722a = c0Var;
        }

        @Override // androidx.media3.exoplayer.source.c0
        public void a() {
            this.f21722a.a();
        }

        public void b() {
            this.f21723b = false;
        }

        @Override // androidx.media3.exoplayer.source.c0
        public boolean c() {
            return !C2204e.this.p() && this.f21722a.c();
        }

        @Override // androidx.media3.exoplayer.source.c0
        public int q(long j10) {
            if (C2204e.this.p()) {
                return -3;
            }
            return this.f21722a.q(j10);
        }

        @Override // androidx.media3.exoplayer.source.c0
        public int s(O0 o02, k1.f fVar, int i10) {
            if (C2204e.this.p()) {
                return -3;
            }
            if (this.f21723b) {
                fVar.n(4);
                return -4;
            }
            long g10 = C2204e.this.g();
            int s10 = this.f21722a.s(o02, fVar, i10);
            if (s10 == -5) {
                androidx.media3.common.a aVar = (androidx.media3.common.a) AbstractC4134a.e(o02.f56121b);
                int i11 = aVar.f20521I;
                if (i11 != 0 || aVar.f20522J != 0) {
                    C2204e c2204e = C2204e.this;
                    if (c2204e.f21719d != 0) {
                        i11 = 0;
                    }
                    o02.f56121b = aVar.b().d0(i11).e0(c2204e.f21720e == Long.MIN_VALUE ? aVar.f20522J : 0).P();
                }
                return -5;
            }
            long j10 = C2204e.this.f21720e;
            if (j10 == Long.MIN_VALUE || ((s10 != -4 || fVar.f54110f < j10) && !(s10 == -3 && g10 == Long.MIN_VALUE && !fVar.f54109e))) {
                return s10;
            }
            fVar.f();
            fVar.n(4);
            this.f21723b = true;
            return -4;
        }
    }

    public C2204e(C c10, boolean z10, long j10, long j11) {
        this.f21716a = c10;
        this.f21718c = z10 ? j10 : -9223372036854775807L;
        this.f21719d = j10;
        this.f21720e = j11;
    }

    public static long o(long j10, long j11, long j12) {
        long max = Math.max(j10, j11);
        return j12 != Long.MIN_VALUE ? Math.min(max, j12) : max;
    }

    public static boolean w(long j10, long j11, androidx.media3.exoplayer.trackselection.y[] yVarArr) {
        if (j10 < j11) {
            return true;
        }
        if (j10 != 0) {
            for (androidx.media3.exoplayer.trackselection.y yVar : yVarArr) {
                if (yVar != null) {
                    androidx.media3.common.a r10 = yVar.r();
                    if (!AbstractC2335D.a(r10.f20543o, r10.f20539k)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final o1 a(long j10, o1 o1Var) {
        long p10 = e1.Z.p(o1Var.f56301a, 0L, j10 - this.f21719d);
        long j11 = o1Var.f56302b;
        long j12 = this.f21720e;
        long p11 = e1.Z.p(j11, 0L, j12 == Long.MIN_VALUE ? LongCompanionObject.MAX_VALUE : j12 - j10);
        return (p10 == o1Var.f56301a && p11 == o1Var.f56302b) ? o1Var : new o1(p10, p11);
    }

    @Override // androidx.media3.exoplayer.source.C, androidx.media3.exoplayer.source.d0
    public boolean b(androidx.media3.exoplayer.k kVar) {
        return this.f21716a.b(kVar);
    }

    @Override // androidx.media3.exoplayer.source.C, androidx.media3.exoplayer.source.d0
    public long d() {
        long d10 = this.f21716a.d();
        if (d10 != Long.MIN_VALUE) {
            long j10 = this.f21720e;
            if (j10 == Long.MIN_VALUE || d10 < j10) {
                return d10;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.source.C, androidx.media3.exoplayer.source.d0
    public boolean e() {
        return this.f21716a.e();
    }

    @Override // androidx.media3.exoplayer.source.C
    public long f(long j10, o1 o1Var) {
        long j11 = this.f21719d;
        if (j10 == j11) {
            return j11;
        }
        return this.f21716a.f(j10, a(j10, o1Var));
    }

    @Override // androidx.media3.exoplayer.source.C, androidx.media3.exoplayer.source.d0
    public long g() {
        long g10 = this.f21716a.g();
        if (g10 != Long.MIN_VALUE) {
            long j10 = this.f21720e;
            if (j10 == Long.MIN_VALUE || g10 < j10) {
                return g10;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.source.C, androidx.media3.exoplayer.source.d0
    public void h(long j10) {
        this.f21716a.h(j10);
    }

    @Override // androidx.media3.exoplayer.source.C.a
    public void i(C c10) {
        if (this.f21721f != null) {
            return;
        }
        ((C.a) AbstractC4134a.e(this.f21717b)).i(this);
    }

    @Override // androidx.media3.exoplayer.source.C
    public long k(long j10) {
        this.f21718c = -9223372036854775807L;
        for (a aVar : this.sampleStreams) {
            if (aVar != null) {
                aVar.b();
            }
        }
        return o(this.f21716a.k(j10), this.f21719d, this.f21720e);
    }

    @Override // androidx.media3.exoplayer.source.C
    public long m(androidx.media3.exoplayer.trackselection.y[] yVarArr, boolean[] zArr, c0[] c0VarArr, boolean[] zArr2, long j10) {
        this.sampleStreams = new a[c0VarArr.length];
        c0[] c0VarArr2 = new c0[c0VarArr.length];
        int i10 = 0;
        while (true) {
            c0 c0Var = null;
            if (i10 >= c0VarArr.length) {
                break;
            }
            a[] aVarArr = this.sampleStreams;
            a aVar = (a) c0VarArr[i10];
            aVarArr[i10] = aVar;
            if (aVar != null) {
                c0Var = aVar.f21722a;
            }
            c0VarArr2[i10] = c0Var;
            i10++;
        }
        long m10 = this.f21716a.m(yVarArr, zArr, c0VarArr2, zArr2, j10);
        long o10 = o(m10, j10, this.f21720e);
        this.f21718c = (p() && w(m10, j10, yVarArr)) ? o10 : -9223372036854775807L;
        for (int i11 = 0; i11 < c0VarArr.length; i11++) {
            c0 c0Var2 = c0VarArr2[i11];
            if (c0Var2 == null) {
                this.sampleStreams[i11] = null;
            } else {
                a[] aVarArr2 = this.sampleStreams;
                a aVar2 = aVarArr2[i11];
                if (aVar2 == null || aVar2.f21722a != c0Var2) {
                    aVarArr2[i11] = new a(c0Var2);
                }
            }
            c0VarArr[i11] = this.sampleStreams[i11];
        }
        return o10;
    }

    @Override // androidx.media3.exoplayer.source.C
    public long n() {
        if (p()) {
            long j10 = this.f21718c;
            this.f21718c = -9223372036854775807L;
            long n10 = n();
            return n10 != -9223372036854775807L ? n10 : j10;
        }
        long n11 = this.f21716a.n();
        if (n11 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return o(n11, this.f21719d, this.f21720e);
    }

    public boolean p() {
        return this.f21718c != -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.source.d0.a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public void j(C c10) {
        ((C.a) AbstractC4134a.e(this.f21717b)).j(this);
    }

    @Override // androidx.media3.exoplayer.source.C
    public void r() {
        C2205f.d dVar = this.f21721f;
        if (dVar != null) {
            throw dVar;
        }
        this.f21716a.r();
    }

    public void s(C2205f.d dVar) {
        this.f21721f = dVar;
    }

    @Override // androidx.media3.exoplayer.source.C
    public void t(C.a aVar, long j10) {
        this.f21717b = aVar;
        this.f21716a.t(this, j10);
    }

    @Override // androidx.media3.exoplayer.source.C
    public m0 u() {
        return this.f21716a.u();
    }

    @Override // androidx.media3.exoplayer.source.C
    public void v(long j10, boolean z10) {
        this.f21716a.v(j10, z10);
    }

    public void x(long j10, long j11) {
        this.f21719d = j10;
        this.f21720e = j11;
    }
}
