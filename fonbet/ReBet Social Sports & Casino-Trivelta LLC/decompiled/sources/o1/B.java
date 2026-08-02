package o1;

import android.media.AudioTrack;
import android.os.Build;
import e1.AbstractC4134a;
import e1.InterfaceC4143j;
import java.lang.reflect.Method;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: A, reason: collision with root package name */
    public long f58606A;

    /* renamed from: B, reason: collision with root package name */
    public long f58607B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f58608C;

    /* renamed from: D, reason: collision with root package name */
    public long f58609D;

    /* renamed from: E, reason: collision with root package name */
    public long f58610E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f58611F;

    /* renamed from: G, reason: collision with root package name */
    public long f58612G;

    /* renamed from: H, reason: collision with root package name */
    public InterfaceC4143j f58613H;

    /* renamed from: a, reason: collision with root package name */
    public final a f58614a;

    /* renamed from: b, reason: collision with root package name */
    public AudioTrack f58615b;

    /* renamed from: c, reason: collision with root package name */
    public int f58616c;

    /* renamed from: d, reason: collision with root package name */
    public C5748A f58617d;

    /* renamed from: e, reason: collision with root package name */
    public int f58618e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f58619f;

    /* renamed from: g, reason: collision with root package name */
    public long f58620g;

    /* renamed from: h, reason: collision with root package name */
    public float f58621h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f58622i;

    /* renamed from: j, reason: collision with root package name */
    public long f58623j;

    /* renamed from: k, reason: collision with root package name */
    public int f58624k;

    /* renamed from: l, reason: collision with root package name */
    public long f58625l;

    /* renamed from: m, reason: collision with root package name */
    public long f58626m;

    /* renamed from: n, reason: collision with root package name */
    public Method f58627n;

    /* renamed from: o, reason: collision with root package name */
    public long f58628o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f58629p;
    private final long[] playheadOffsets;

    /* renamed from: q, reason: collision with root package name */
    public boolean f58630q;

    /* renamed from: r, reason: collision with root package name */
    public long f58631r;

    /* renamed from: s, reason: collision with root package name */
    public long f58632s;

    /* renamed from: t, reason: collision with root package name */
    public long f58633t;

    /* renamed from: u, reason: collision with root package name */
    public long f58634u;

    /* renamed from: v, reason: collision with root package name */
    public long f58635v;

    /* renamed from: w, reason: collision with root package name */
    public int f58636w;

    /* renamed from: x, reason: collision with root package name */
    public int f58637x;

    /* renamed from: y, reason: collision with root package name */
    public long f58638y;

    /* renamed from: z, reason: collision with root package name */
    public long f58639z;

    public interface a {
        void a(int i10, long j10);

        void b(long j10);

        void c(long j10);

        void d(long j10, long j11, long j12, long j13);

        void e(long j10, long j11, long j12, long j13);
    }

    public B(a aVar) {
        this.f58614a = (a) AbstractC4134a.e(aVar);
        try {
            this.f58627n = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.playheadOffsets = new long[10];
        this.f58610E = -9223372036854775807L;
        this.f58609D = -9223372036854775807L;
        this.f58613H = InterfaceC4143j.f45530a;
    }

    public static boolean q(int i10) {
        return false;
    }

    public void a() {
        this.f58611F = true;
        C5748A c5748a = this.f58617d;
        if (c5748a != null) {
            c5748a.d();
        }
    }

    public final boolean b() {
        return this.f58619f && ((AudioTrack) AbstractC4134a.e(this.f58615b)).getPlayState() == 2 && d() == 0;
    }

    public long c() {
        AudioTrack audioTrack = (AudioTrack) AbstractC4134a.e(this.f58615b);
        if (audioTrack.getPlayState() == 3) {
            n();
        }
        long nanoTime = this.f58613H.nanoTime() / 1000;
        C5748A c5748a = (C5748A) AbstractC4134a.e(this.f58617d);
        boolean f10 = c5748a.f();
        long e10 = f10 ? c5748a.e(nanoTime, this.f58621h) : e(nanoTime);
        int playState = audioTrack.getPlayState();
        if (playState != 3) {
            if (playState == 1) {
                o(e10);
            }
            return e10;
        }
        if (f10 || !c5748a.h()) {
            o(e10);
        }
        long j10 = this.f58610E;
        if (j10 != -9223372036854775807L) {
            long j11 = e10 - this.f58609D;
            long l02 = e1.Z.l0(nanoTime - j10, this.f58621h);
            long j12 = this.f58609D + l02;
            long abs = Math.abs(j12 - e10);
            if (j11 != 0 && abs < 1000000) {
                long j13 = (l02 * 10) / 100;
                e10 = e1.Z.p(e10, j12 - j13, j12 + j13);
            }
        }
        if (!this.f58608C && !this.f58622i) {
            long j14 = this.f58609D;
            if (j14 != -9223372036854775807L && e10 > j14) {
                this.f58622i = true;
                this.f58614a.c(this.f58613H.a() - e1.Z.J1(e1.Z.r0(e1.Z.J1(e10 - j14), this.f58621h)));
            }
        }
        this.f58610E = nanoTime;
        this.f58609D = e10;
        return e10;
    }

    public final long d() {
        if (this.f58638y != -9223372036854775807L) {
            return Math.min(this.f58607B, g());
        }
        long b10 = this.f58613H.b();
        if (b10 - this.f58632s >= 5) {
            y(b10);
            this.f58632s = b10;
        }
        return this.f58633t + this.f58612G + (this.f58634u << 32);
    }

    public final long e(long j10) {
        long max = Math.max(0L, (this.f58637x == 0 ? this.f58638y != -9223372036854775807L ? e1.Z.o1(g(), this.f58618e) : f() : e1.Z.l0(j10 + this.f58625l, this.f58621h)) - this.f58628o);
        return this.f58638y != -9223372036854775807L ? Math.min(e1.Z.o1(this.f58607B, this.f58618e), max) : max;
    }

    public final long f() {
        return e1.Z.o1(d(), this.f58618e);
    }

    public final long g() {
        if (((AudioTrack) AbstractC4134a.e(this.f58615b)).getPlayState() == 2) {
            return this.f58606A;
        }
        return this.f58606A + e1.Z.E(e1.Z.l0(e1.Z.a1(this.f58613H.b()) - this.f58638y, this.f58621h), this.f58618e);
    }

    public void h(long j10) {
        this.f58606A = d();
        this.f58638y = e1.Z.a1(this.f58613H.b());
        this.f58607B = j10;
    }

    public final boolean i() {
        int underrunCount = ((AudioTrack) AbstractC4134a.e(this.f58615b)).getUnderrunCount();
        boolean z10 = underrunCount > this.f58624k;
        this.f58624k = underrunCount;
        return z10;
    }

    public boolean j(long j10) {
        return j10 > e1.Z.E(c(), this.f58618e) || b();
    }

    public boolean k() {
        return ((AudioTrack) AbstractC4134a.e(this.f58615b)).getPlayState() == 3;
    }

    public boolean l(long j10) {
        return this.f58639z != -9223372036854775807L && j10 > 0 && this.f58613H.b() - this.f58639z >= 200;
    }

    public boolean m(long j10) {
        int playState = ((AudioTrack) AbstractC4134a.e(this.f58615b)).getPlayState();
        if (this.f58619f) {
            if (playState == 2) {
                this.f58629p = false;
                return false;
            }
            if (playState == 1 && d() == 0) {
                return false;
            }
        }
        if (i()) {
            this.f58614a.a(this.f58616c, e1.Z.J1(this.f58620g));
        }
        return true;
    }

    public final void n() {
        long nanoTime = this.f58613H.nanoTime() / 1000;
        if (nanoTime - this.f58626m >= 30000) {
            long f10 = f();
            if (f10 != 0) {
                this.playheadOffsets[this.f58636w] = e1.Z.r0(f10, this.f58621h) - nanoTime;
                this.f58636w = (this.f58636w + 1) % 10;
                int i10 = this.f58637x;
                if (i10 < 10) {
                    this.f58637x = i10 + 1;
                }
                this.f58626m = nanoTime;
                this.f58625l = 0L;
                int i11 = 0;
                while (true) {
                    int i12 = this.f58637x;
                    if (i11 >= i12) {
                        break;
                    }
                    this.f58625l += this.playheadOffsets[i11] / i12;
                    i11++;
                }
            } else {
                return;
            }
        }
        if (this.f58619f) {
            return;
        }
        p(nanoTime);
        ((C5748A) AbstractC4134a.e(this.f58617d)).i(nanoTime, this.f58621h, e(nanoTime));
    }

    public final void o(long j10) {
        if (this.f58608C) {
            long j11 = this.f58623j;
            if (j11 == -9223372036854775807L || j10 < j11) {
                return;
            }
            long a10 = this.f58613H.a() - e1.Z.J1(e1.Z.r0(j10 - j11, this.f58621h));
            this.f58623j = -9223372036854775807L;
            this.f58614a.c(a10);
        }
    }

    public final void p(long j10) {
        Method method;
        if (!this.f58630q || (method = this.f58627n) == null || j10 - this.f58631r < 500000) {
            return;
        }
        try {
            long intValue = (((Integer) e1.Z.i((Integer) method.invoke(AbstractC4134a.e(this.f58615b), null))).intValue() * 1000) - this.f58620g;
            this.f58628o = intValue;
            long max = Math.max(intValue, 0L);
            this.f58628o = max;
            if (max > 5000000) {
                this.f58614a.b(max);
                this.f58628o = 0L;
            }
        } catch (Exception unused) {
            this.f58627n = null;
        }
        this.f58631r = j10;
    }

    public void r() {
        t();
        if (this.f58638y == -9223372036854775807L) {
            ((C5748A) AbstractC4134a.e(this.f58617d)).j();
        }
        this.f58606A = d();
    }

    public void s() {
        t();
        this.f58615b = null;
        this.f58617d = null;
    }

    public final void t() {
        this.f58625l = 0L;
        this.f58637x = 0;
        this.f58636w = 0;
        this.f58626m = 0L;
        this.f58609D = -9223372036854775807L;
        this.f58610E = -9223372036854775807L;
        this.f58622i = false;
    }

    public void u(AudioTrack audioTrack, boolean z10, int i10, int i11, int i12, boolean z11) {
        this.f58615b = audioTrack;
        this.f58616c = i12;
        this.f58617d = new C5748A(audioTrack, this.f58614a);
        this.f58618e = audioTrack.getSampleRate();
        this.f58619f = z10 && q(i10);
        boolean O02 = e1.Z.O0(i10);
        this.f58630q = O02;
        this.f58620g = O02 ? e1.Z.o1(i12 / i11, this.f58618e) : -9223372036854775807L;
        this.f58633t = 0L;
        this.f58634u = 0L;
        this.f58611F = false;
        this.f58612G = 0L;
        this.f58635v = 0L;
        this.f58629p = false;
        this.f58638y = -9223372036854775807L;
        this.f58639z = -9223372036854775807L;
        this.f58631r = 0L;
        this.f58628o = 0L;
        this.f58621h = 1.0f;
        this.f58624k = 0;
        this.f58623j = -9223372036854775807L;
        this.f58608C = z11;
    }

    public void v(float f10) {
        this.f58621h = f10;
        C5748A c5748a = this.f58617d;
        if (c5748a != null) {
            c5748a.j();
        }
        t();
    }

    public void w(InterfaceC4143j interfaceC4143j) {
        this.f58613H = interfaceC4143j;
    }

    public void x() {
        if (this.f58638y != -9223372036854775807L) {
            this.f58638y = e1.Z.a1(this.f58613H.b());
        }
        this.f58623j = f();
        ((C5748A) AbstractC4134a.e(this.f58617d)).j();
    }

    public final void y(long j10) {
        int playState = ((AudioTrack) AbstractC4134a.e(this.f58615b)).getPlayState();
        if (playState == 1) {
            return;
        }
        long playbackHeadPosition = r0.getPlaybackHeadPosition() & BodyPartID.bodyIdMax;
        if (this.f58619f) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f58635v = this.f58633t;
            }
            playbackHeadPosition += this.f58635v;
        }
        if (Build.VERSION.SDK_INT <= 29) {
            if (playbackHeadPosition == 0 && this.f58633t > 0 && playState == 3) {
                if (this.f58639z == -9223372036854775807L) {
                    this.f58639z = j10;
                    return;
                }
                return;
            }
            this.f58639z = -9223372036854775807L;
        }
        long j11 = this.f58633t;
        if (j11 > playbackHeadPosition) {
            if (this.f58611F) {
                this.f58612G += j11;
                this.f58611F = false;
            } else {
                this.f58634u++;
            }
        }
        this.f58633t = playbackHeadPosition;
    }
}
