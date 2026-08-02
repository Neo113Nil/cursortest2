package androidx.media3.exoplayer;

import android.os.SystemClock;
import b1.z;
import e1.Z;
import m1.P0;

/* loaded from: classes.dex */
public final class d implements P0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f20925a;

    /* renamed from: b, reason: collision with root package name */
    public final float f20926b;

    /* renamed from: c, reason: collision with root package name */
    public final long f20927c;

    /* renamed from: d, reason: collision with root package name */
    public final float f20928d;

    /* renamed from: e, reason: collision with root package name */
    public final long f20929e;

    /* renamed from: f, reason: collision with root package name */
    public final long f20930f;

    /* renamed from: g, reason: collision with root package name */
    public final float f20931g;

    /* renamed from: h, reason: collision with root package name */
    public long f20932h;

    /* renamed from: i, reason: collision with root package name */
    public long f20933i;

    /* renamed from: j, reason: collision with root package name */
    public long f20934j;

    /* renamed from: k, reason: collision with root package name */
    public long f20935k;

    /* renamed from: l, reason: collision with root package name */
    public long f20936l;

    /* renamed from: m, reason: collision with root package name */
    public long f20937m;

    /* renamed from: n, reason: collision with root package name */
    public float f20938n;

    /* renamed from: o, reason: collision with root package name */
    public float f20939o;

    /* renamed from: p, reason: collision with root package name */
    public float f20940p;

    /* renamed from: q, reason: collision with root package name */
    public long f20941q;

    /* renamed from: r, reason: collision with root package name */
    public long f20942r;

    /* renamed from: s, reason: collision with root package name */
    public long f20943s;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public float f20944a = 0.97f;

        /* renamed from: b, reason: collision with root package name */
        public float f20945b = 1.03f;

        /* renamed from: c, reason: collision with root package name */
        public long f20946c = 1000;

        /* renamed from: d, reason: collision with root package name */
        public float f20947d = 1.0E-7f;

        /* renamed from: e, reason: collision with root package name */
        public long f20948e = Z.a1(20);

        /* renamed from: f, reason: collision with root package name */
        public long f20949f = Z.a1(500);

        /* renamed from: g, reason: collision with root package name */
        public float f20950g = 0.999f;

        public d a() {
            return new d(this.f20944a, this.f20945b, this.f20946c, this.f20947d, this.f20948e, this.f20949f, this.f20950g);
        }
    }

    public static long h(long j10, long j11, float f10) {
        return (long) ((j10 * f10) + ((1.0f - f10) * j11));
    }

    @Override // m1.P0
    public float a(long j10, long j11) {
        if (this.f20932h == -9223372036854775807L) {
            return 1.0f;
        }
        i(j10, j11);
        if (this.f20941q != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f20941q < this.f20927c) {
            return this.f20940p;
        }
        this.f20941q = SystemClock.elapsedRealtime();
        f(j10);
        long j12 = j10 - this.f20937m;
        if (Math.abs(j12) < this.f20929e) {
            this.f20940p = 1.0f;
        } else {
            this.f20940p = Z.n((this.f20928d * j12) + 1.0f, this.f20939o, this.f20938n);
        }
        return this.f20940p;
    }

    @Override // m1.P0
    public long b() {
        return this.f20937m;
    }

    @Override // m1.P0
    public void c() {
        long j10 = this.f20937m;
        if (j10 == -9223372036854775807L) {
            return;
        }
        long j11 = j10 + this.f20930f;
        this.f20937m = j11;
        long j12 = this.f20936l;
        if (j12 != -9223372036854775807L && j11 > j12) {
            this.f20937m = j12;
        }
        this.f20941q = -9223372036854775807L;
    }

    @Override // m1.P0
    public void d(z.g gVar) {
        this.f20932h = Z.a1(gVar.f24731a);
        this.f20935k = Z.a1(gVar.f24732b);
        this.f20936l = Z.a1(gVar.f24733c);
        float f10 = gVar.f24734d;
        if (f10 == -3.4028235E38f) {
            f10 = this.f20925a;
        }
        this.f20939o = f10;
        float f11 = gVar.f24735e;
        if (f11 == -3.4028235E38f) {
            f11 = this.f20926b;
        }
        this.f20938n = f11;
        if (f10 == 1.0f && f11 == 1.0f) {
            this.f20932h = -9223372036854775807L;
        }
        g();
    }

    @Override // m1.P0
    public void e(long j10) {
        this.f20933i = j10;
        g();
    }

    public final void f(long j10) {
        long j11 = this.f20942r + (this.f20943s * 3);
        if (this.f20937m > j11) {
            float a12 = Z.a1(this.f20927c);
            this.f20937m = com.google.common.primitives.h.d(j11, this.f20934j, this.f20937m - (((long) ((this.f20940p - 1.0f) * a12)) + ((long) ((this.f20938n - 1.0f) * a12))));
            return;
        }
        long p10 = Z.p(j10 - ((long) (Math.max(0.0f, this.f20940p - 1.0f) / this.f20928d)), this.f20937m, j11);
        this.f20937m = p10;
        long j12 = this.f20936l;
        if (j12 == -9223372036854775807L || p10 <= j12) {
            return;
        }
        this.f20937m = j12;
    }

    public final void g() {
        long j10;
        long j11 = this.f20932h;
        if (j11 != -9223372036854775807L) {
            j10 = this.f20933i;
            if (j10 == -9223372036854775807L) {
                long j12 = this.f20935k;
                if (j12 != -9223372036854775807L && j11 < j12) {
                    j11 = j12;
                }
                j10 = this.f20936l;
                if (j10 == -9223372036854775807L || j11 <= j10) {
                    j10 = j11;
                }
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.f20934j == j10) {
            return;
        }
        this.f20934j = j10;
        this.f20937m = j10;
        this.f20942r = -9223372036854775807L;
        this.f20943s = -9223372036854775807L;
        this.f20941q = -9223372036854775807L;
    }

    public final void i(long j10, long j11) {
        long j12 = j10 - j11;
        long j13 = this.f20942r;
        if (j13 == -9223372036854775807L) {
            this.f20942r = j12;
            this.f20943s = 0L;
        } else {
            long max = Math.max(j12, h(j13, j12, this.f20931g));
            this.f20942r = max;
            this.f20943s = h(this.f20943s, Math.abs(j12 - max), this.f20931g);
        }
    }

    public d(float f10, float f11, long j10, float f12, long j11, long j12, float f13) {
        this.f20925a = f10;
        this.f20926b = f11;
        this.f20927c = j10;
        this.f20928d = f12;
        this.f20929e = j11;
        this.f20930f = j12;
        this.f20931g = f13;
        this.f20932h = -9223372036854775807L;
        this.f20933i = -9223372036854775807L;
        this.f20935k = -9223372036854775807L;
        this.f20936l = -9223372036854775807L;
        this.f20939o = f10;
        this.f20938n = f11;
        this.f20940p = 1.0f;
        this.f20941q = -9223372036854775807L;
        this.f20934j = -9223372036854775807L;
        this.f20937m = -9223372036854775807L;
        this.f20942r = -9223372036854775807L;
        this.f20943s = -9223372036854775807L;
    }
}
