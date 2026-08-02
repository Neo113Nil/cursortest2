package o1;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import o1.B;

/* renamed from: o1.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5748A {

    /* renamed from: a, reason: collision with root package name */
    public final a f58590a;

    /* renamed from: b, reason: collision with root package name */
    public final int f58591b;

    /* renamed from: c, reason: collision with root package name */
    public final B.a f58592c;

    /* renamed from: d, reason: collision with root package name */
    public int f58593d;

    /* renamed from: e, reason: collision with root package name */
    public long f58594e;

    /* renamed from: f, reason: collision with root package name */
    public long f58595f;

    /* renamed from: g, reason: collision with root package name */
    public long f58596g;

    /* renamed from: h, reason: collision with root package name */
    public long f58597h;

    /* renamed from: i, reason: collision with root package name */
    public long f58598i;

    /* renamed from: o1.A$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final AudioTrack f58599a;

        /* renamed from: b, reason: collision with root package name */
        public final AudioTimestamp f58600b = new AudioTimestamp();

        /* renamed from: c, reason: collision with root package name */
        public long f58601c;

        /* renamed from: d, reason: collision with root package name */
        public long f58602d;

        /* renamed from: e, reason: collision with root package name */
        public long f58603e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f58604f;

        /* renamed from: g, reason: collision with root package name */
        public long f58605g;

        public a(AudioTrack audioTrack) {
            this.f58599a = audioTrack;
        }

        public void a() {
            this.f58604f = true;
        }

        public long b() {
            return this.f58603e;
        }

        public long c() {
            return this.f58600b.nanoTime / 1000;
        }

        public boolean d() {
            boolean timestamp = this.f58599a.getTimestamp(this.f58600b);
            if (timestamp) {
                long j10 = this.f58600b.framePosition;
                long j11 = this.f58602d;
                if (j11 > j10) {
                    if (this.f58604f) {
                        this.f58605g += j11;
                        this.f58604f = false;
                    } else {
                        this.f58601c++;
                    }
                }
                this.f58602d = j10;
                this.f58603e = j10 + this.f58605g + (this.f58601c << 32);
            }
            return timestamp;
        }
    }

    public C5748A(AudioTrack audioTrack, B.a aVar) {
        this.f58590a = new a(audioTrack);
        this.f58591b = audioTrack.getSampleRate();
        this.f58592c = aVar;
        j();
    }

    public final void a(long j10, float f10, long j11) {
        long c10 = this.f58590a.c();
        long b10 = b(j10, f10);
        if (Math.abs(c10 - j10) > 5000000) {
            this.f58592c.e(this.f58590a.b(), c10, j10, j11);
            k(4);
        } else if (Math.abs(b10 - j11) > 5000000) {
            this.f58592c.d(this.f58590a.b(), c10, j10, j11);
            k(4);
        } else if (this.f58593d == 4) {
            j();
        }
    }

    public final long b(long j10, float f10) {
        return c(this.f58590a.b(), this.f58590a.c(), j10, f10);
    }

    public final long c(long j10, long j11, long j12, float f10) {
        return e1.Z.o1(j10, this.f58591b) + e1.Z.l0(j12 - j11, f10);
    }

    public void d() {
        this.f58590a.a();
    }

    public long e(long j10, float f10) {
        return b(j10, f10);
    }

    public boolean f() {
        return this.f58593d == 2;
    }

    public final boolean g(long j10, float f10) {
        long b10 = this.f58590a.b();
        long j11 = this.f58597h;
        if (b10 <= j11) {
            return false;
        }
        return Math.abs(b(j10, f10) - c(j11, this.f58598i, j10, f10)) < 1000;
    }

    public boolean h() {
        int i10 = this.f58593d;
        return i10 == 0 || i10 == 1;
    }

    public void i(long j10, float f10, long j11) {
        if (j10 - this.f58596g < this.f58595f) {
            return;
        }
        this.f58596g = j10;
        boolean d10 = this.f58590a.d();
        if (d10) {
            a(j10, f10, j11);
        }
        int i10 = this.f58593d;
        if (i10 == 0) {
            if (!d10) {
                if (j10 - this.f58594e > 500000) {
                    k(3);
                    return;
                }
                return;
            } else {
                if (this.f58590a.c() >= this.f58594e) {
                    this.f58597h = this.f58590a.b();
                    this.f58598i = this.f58590a.c();
                    k(1);
                    return;
                }
                return;
            }
        }
        if (i10 == 1) {
            if (!d10) {
                j();
                return;
            }
            if (g(j10, f10)) {
                k(2);
                return;
            } else if (j10 - this.f58594e > 2000000) {
                k(3);
                return;
            } else {
                this.f58597h = this.f58590a.b();
                this.f58598i = this.f58590a.c();
                return;
            }
        }
        if (i10 == 2) {
            if (d10) {
                return;
            }
            j();
        } else if (i10 != 3) {
            if (i10 != 4) {
                throw new IllegalStateException();
            }
        } else if (d10) {
            j();
        }
    }

    public void j() {
        k(0);
    }

    public final void k(int i10) {
        this.f58593d = i10;
        if (i10 == 0) {
            this.f58596g = 0L;
            this.f58597h = -1L;
            this.f58598i = -9223372036854775807L;
            this.f58594e = System.nanoTime() / 1000;
            this.f58595f = 10000L;
            return;
        }
        if (i10 == 1) {
            this.f58595f = 10000L;
            return;
        }
        if (i10 == 2 || i10 == 3) {
            this.f58595f = 10000000L;
        } else {
            if (i10 != 4) {
                throw new IllegalStateException();
            }
            this.f58595f = 500000L;
        }
    }
}
