package F1;

import java.util.Arrays;

/* renamed from: F1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1147i {

    /* renamed from: c, reason: collision with root package name */
    public boolean f3321c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3322d;

    /* renamed from: f, reason: collision with root package name */
    public int f3324f;

    /* renamed from: a, reason: collision with root package name */
    public a f3319a = new a();

    /* renamed from: b, reason: collision with root package name */
    public a f3320b = new a();

    /* renamed from: e, reason: collision with root package name */
    public long f3323e = -9223372036854775807L;

    /* renamed from: F1.i$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public long f3325a;

        /* renamed from: b, reason: collision with root package name */
        public long f3326b;

        /* renamed from: c, reason: collision with root package name */
        public long f3327c;

        /* renamed from: d, reason: collision with root package name */
        public long f3328d;

        /* renamed from: e, reason: collision with root package name */
        public long f3329e;

        /* renamed from: f, reason: collision with root package name */
        public long f3330f;

        /* renamed from: g, reason: collision with root package name */
        public int f3331g;
        private final boolean[] recentFrameOutlierFlags = new boolean[15];

        public static int c(long j10) {
            return (int) (j10 % 15);
        }

        public long a() {
            long j10 = this.f3329e;
            if (j10 == 0) {
                return 0L;
            }
            return this.f3330f / j10;
        }

        public long b() {
            return this.f3330f;
        }

        public boolean d() {
            long j10 = this.f3328d;
            if (j10 == 0) {
                return false;
            }
            return this.recentFrameOutlierFlags[c(j10 - 1)];
        }

        public boolean e() {
            return this.f3328d > 15 && this.f3331g == 0;
        }

        public void f(long j10) {
            long j11 = this.f3328d;
            if (j11 == 0) {
                this.f3325a = j10;
            } else if (j11 == 1) {
                long j12 = j10 - this.f3325a;
                this.f3326b = j12;
                this.f3330f = j12;
                this.f3329e = 1L;
            } else {
                long j13 = j10 - this.f3327c;
                int c10 = c(j11);
                if (Math.abs(j13 - this.f3326b) <= 1000000) {
                    this.f3329e++;
                    this.f3330f += j13;
                    boolean[] zArr = this.recentFrameOutlierFlags;
                    if (zArr[c10]) {
                        zArr[c10] = false;
                        this.f3331g--;
                    }
                } else {
                    boolean[] zArr2 = this.recentFrameOutlierFlags;
                    if (!zArr2[c10]) {
                        zArr2[c10] = true;
                        this.f3331g++;
                    }
                }
            }
            this.f3328d++;
            this.f3327c = j10;
        }

        public void g() {
            this.f3328d = 0L;
            this.f3329e = 0L;
            this.f3330f = 0L;
            this.f3331g = 0;
            Arrays.fill(this.recentFrameOutlierFlags, false);
        }
    }

    public long a() {
        if (e()) {
            return this.f3319a.a();
        }
        return -9223372036854775807L;
    }

    public float b() {
        if (e()) {
            return (float) (1.0E9d / this.f3319a.a());
        }
        return -1.0f;
    }

    public int c() {
        return this.f3324f;
    }

    public long d() {
        if (e()) {
            return this.f3319a.b();
        }
        return -9223372036854775807L;
    }

    public boolean e() {
        return this.f3319a.e();
    }

    public void f(long j10) {
        this.f3319a.f(j10);
        if (this.f3319a.e() && !this.f3322d) {
            this.f3321c = false;
        } else if (this.f3323e != -9223372036854775807L) {
            if (!this.f3321c || this.f3320b.d()) {
                this.f3320b.g();
                this.f3320b.f(this.f3323e);
            }
            this.f3321c = true;
            this.f3320b.f(j10);
        }
        if (this.f3321c && this.f3320b.e()) {
            a aVar = this.f3319a;
            this.f3319a = this.f3320b;
            this.f3320b = aVar;
            this.f3321c = false;
            this.f3322d = false;
        }
        this.f3323e = j10;
        this.f3324f = this.f3319a.e() ? 0 : this.f3324f + 1;
    }

    public void g() {
        this.f3319a.g();
        this.f3320b.g();
        this.f3321c = false;
        this.f3323e = -9223372036854775807L;
        this.f3324f = 0;
    }
}
