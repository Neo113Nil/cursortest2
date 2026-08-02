package v3;

import android.media.AudioTrack;
import android.os.Build;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.math.RoundingMode;
import m3.InterfaceC8064f;
import v3.C10201C;
import v3.o;

/* loaded from: classes.dex */
final class w {

    /* renamed from: A, reason: collision with root package name */
    boolean f101960A;

    /* renamed from: B, reason: collision with root package name */
    private long f101961B;

    /* renamed from: C, reason: collision with root package name */
    private long f101962C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f101963D;

    /* renamed from: E, reason: collision with root package name */
    private long f101964E;

    /* renamed from: F, reason: collision with root package name */
    private InterfaceC8064f f101965F;

    /* renamed from: a, reason: collision with root package name */
    private final a f101966a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f101967b;

    /* renamed from: c, reason: collision with root package name */
    private AudioTrack f101968c;

    /* renamed from: d, reason: collision with root package name */
    private int f101969d;

    /* renamed from: e, reason: collision with root package name */
    private v f101970e;

    /* renamed from: f, reason: collision with root package name */
    private int f101971f;

    /* renamed from: g, reason: collision with root package name */
    private long f101972g;

    /* renamed from: h, reason: collision with root package name */
    private float f101973h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f101974i;

    /* renamed from: j, reason: collision with root package name */
    private long f101975j;

    /* renamed from: k, reason: collision with root package name */
    private int f101976k;

    /* renamed from: l, reason: collision with root package name */
    private long f101977l;

    /* renamed from: m, reason: collision with root package name */
    private long f101978m;

    /* renamed from: n, reason: collision with root package name */
    private Method f101979n;

    /* renamed from: o, reason: collision with root package name */
    private long f101980o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f101981p;

    /* renamed from: q, reason: collision with root package name */
    private long f101982q;

    /* renamed from: r, reason: collision with root package name */
    private long f101983r;

    /* renamed from: s, reason: collision with root package name */
    private long f101984s;

    /* renamed from: t, reason: collision with root package name */
    private long f101985t;

    /* renamed from: u, reason: collision with root package name */
    private int f101986u;

    /* renamed from: v, reason: collision with root package name */
    private int f101987v;

    /* renamed from: w, reason: collision with root package name */
    private long f101988w;

    /* renamed from: x, reason: collision with root package name */
    private long f101989x;

    /* renamed from: y, reason: collision with root package name */
    private long f101990y;

    /* renamed from: z, reason: collision with root package name */
    private long f101991z;

    public interface a {
    }

    public w(a aVar) {
        this.f101966a = aVar;
        try {
            this.f101979n = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f101967b = new long[10];
        this.f101962C = -9223372036854775807L;
        this.f101961B = -9223372036854775807L;
        this.f101965F = InterfaceC8064f.f74315a;
    }

    private long c() {
        if (this.f101988w != -9223372036854775807L) {
            return Math.min(this.f101991z, e());
        }
        long elapsedRealtime = this.f101965F.elapsedRealtime();
        if (elapsedRealtime - this.f101983r >= 5) {
            AudioTrack audioTrack = this.f101968c;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
                if (Build.VERSION.SDK_INT <= 29) {
                    if (playbackHeadPosition != 0 || this.f101984s <= 0 || playState != 3) {
                        this.f101989x = -9223372036854775807L;
                    } else if (this.f101989x == -9223372036854775807L) {
                        this.f101989x = elapsedRealtime;
                    }
                }
                long j11 = this.f101984s;
                if (j11 > playbackHeadPosition) {
                    if (this.f101963D) {
                        this.f101964E += j11;
                        this.f101963D = false;
                    } else {
                        this.f101985t++;
                    }
                }
                this.f101984s = playbackHeadPosition;
            }
            this.f101983r = elapsedRealtime;
        }
        return this.f101984s + this.f101964E + (this.f101985t << 32);
    }

    private long d(long j11) {
        long B11;
        if (this.f101987v != 0) {
            B11 = m3.N.B(this.f101973h, j11 + this.f101977l);
        } else if (this.f101988w != -9223372036854775807L) {
            B11 = m3.N.X(this.f101971f, e());
        } else {
            B11 = m3.N.X(this.f101971f, c());
        }
        long max = Math.max(0L, B11 - this.f101980o);
        if (this.f101988w == -9223372036854775807L) {
            return max;
        }
        return Math.min(m3.N.X(this.f101971f, this.f101991z), max);
    }

    private long e() {
        AudioTrack audioTrack = this.f101968c;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 2) {
            return this.f101990y;
        }
        return this.f101990y + m3.N.Z(m3.N.B(this.f101973h, m3.N.Q(this.f101965F.elapsedRealtime()) - this.f101988w), this.f101971f, 1000000L, RoundingMode.UP);
    }

    private void k(long j11) {
        if (this.f101960A) {
            long j12 = this.f101975j;
            if (j12 == -9223372036854775807L || j11 < j12) {
                return;
            }
            long currentTimeMillis = this.f101965F.currentTimeMillis() - m3.N.g0(m3.N.D(this.f101973h, j11 - j12));
            this.f101975j = -9223372036854775807L;
            ((C10201C.j) this.f101966a).a(currentTimeMillis);
        }
    }

    private void n() {
        this.f101977l = 0L;
        this.f101987v = 0;
        this.f101986u = 0;
        this.f101978m = 0L;
        this.f101961B = -9223372036854775807L;
        this.f101962C = -9223372036854775807L;
        this.f101974i = false;
    }

    public final void a() {
        this.f101963D = true;
        v vVar = this.f101970e;
        if (vVar != null) {
            vVar.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long b() {
        long j11;
        int playState;
        Method method;
        AudioTrack audioTrack = this.f101968c;
        audioTrack.getClass();
        int playState2 = audioTrack.getPlayState();
        a aVar = this.f101966a;
        long j12 = 1000;
        if (playState2 == 3) {
            long nanoTime = this.f101965F.nanoTime() / 1000;
            if (nanoTime - this.f101978m >= 30000) {
                long X9 = m3.N.X(this.f101971f, c());
                if (X9 != 0) {
                    int i11 = this.f101986u;
                    long D11 = m3.N.D(this.f101973h, X9) - nanoTime;
                    long[] jArr = this.f101967b;
                    jArr[i11] = D11;
                    this.f101986u = (this.f101986u + 1) % 10;
                    int i12 = this.f101987v;
                    if (i12 < 10) {
                        this.f101987v = i12 + 1;
                    }
                    this.f101978m = nanoTime;
                    this.f101977l = 0L;
                    int i13 = 0;
                    while (true) {
                        int i14 = this.f101987v;
                        if (i13 >= i14) {
                            break;
                        }
                        this.f101977l = (jArr[i13] / i14) + this.f101977l;
                        i13++;
                        j12 = j12;
                    }
                }
            }
            j11 = j12;
            if (this.f101981p && (method = this.f101979n) != null && nanoTime - this.f101982q >= 500000) {
                try {
                    AudioTrack audioTrack2 = this.f101968c;
                    audioTrack2.getClass();
                    Integer num = (Integer) method.invoke(audioTrack2, new Object[0]);
                    int i15 = m3.N.f74289a;
                    long intValue = (num.intValue() * j11) - this.f101972g;
                    this.f101980o = intValue;
                    long max = Math.max(intValue, 0L);
                    this.f101980o = max;
                    if (max > 5000000) {
                        m3.s.f("DefaultAudioSink", "Ignoring impossibly large audio latency: " + max);
                        this.f101980o = 0L;
                    }
                } catch (Exception unused) {
                    this.f101979n = null;
                }
                this.f101982q = nanoTime;
            }
            v vVar = this.f101970e;
            vVar.getClass();
            vVar.e(nanoTime, d(nanoTime), this.f101973h);
            long nanoTime2 = this.f101965F.nanoTime() / j11;
            v vVar2 = this.f101970e;
            vVar2.getClass();
            boolean c11 = vVar2.c();
            long b11 = !c11 ? vVar2.b(this.f101973h, nanoTime2) : d(nanoTime2);
            playState = audioTrack.getPlayState();
            if (playState != 3) {
                if (c11 || !vVar2.d()) {
                    k(b11);
                }
                long j13 = this.f101962C;
                if (j13 != -9223372036854775807L) {
                    long j14 = b11 - this.f101961B;
                    long B11 = m3.N.B(this.f101973h, nanoTime2 - j13);
                    long j15 = this.f101961B + B11;
                    long abs = Math.abs(j15 - b11);
                    if (j14 != 0 && abs < 1000000) {
                        long j16 = (B11 * 10) / 100;
                        b11 = m3.N.j(b11, j15 - j16, j15 + j16);
                    }
                }
                if (!this.f101960A && !this.f101974i) {
                    long j17 = this.f101961B;
                    if (j17 != -9223372036854775807L && b11 > j17) {
                        this.f101974i = true;
                        ((C10201C.j) aVar).a(this.f101965F.currentTimeMillis() - m3.N.g0(m3.N.D(this.f101973h, m3.N.g0(b11 - j17))));
                    }
                }
                this.f101962C = nanoTime2;
                this.f101961B = b11;
            } else if (playState == 1) {
                k(b11);
            }
            return b11;
        }
        j11 = 1000;
        long nanoTime22 = this.f101965F.nanoTime() / j11;
        v vVar22 = this.f101970e;
        vVar22.getClass();
        boolean c112 = vVar22.c();
        long b112 = !c112 ? vVar22.b(this.f101973h, nanoTime22) : d(nanoTime22);
        playState = audioTrack.getPlayState();
        if (playState != 3) {
        }
        return b112;
    }

    public final void f(long j11) {
        this.f101990y = c();
        this.f101988w = m3.N.Q(this.f101965F.elapsedRealtime());
        this.f101991z = j11;
    }

    public final boolean g(long j11) {
        long b11 = b();
        int i11 = this.f101971f;
        int i12 = m3.N.f74289a;
        return j11 > m3.N.Z(b11, (long) i11, 1000000L, RoundingMode.UP);
    }

    public final boolean h() {
        AudioTrack audioTrack = this.f101968c;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 3;
    }

    public final boolean i(long j11) {
        return this.f101989x != -9223372036854775807L && j11 > 0 && this.f101965F.elapsedRealtime() - this.f101989x >= 200;
    }

    public final void j() {
        long j11;
        o.a aVar;
        AudioTrack audioTrack = this.f101968c;
        audioTrack.getClass();
        audioTrack.getPlayState();
        AudioTrack audioTrack2 = this.f101968c;
        audioTrack2.getClass();
        int underrunCount = audioTrack2.getUnderrunCount();
        boolean z11 = underrunCount > this.f101976k;
        this.f101976k = underrunCount;
        if (z11) {
            int i11 = this.f101969d;
            long g02 = m3.N.g0(this.f101972g);
            C10201C c10201c = C10201C.this;
            if (c10201c.f101786u != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                j11 = c10201c.f101762e0;
                aVar = J.this.f101833a1;
                aVar.z(i11, g02, elapsedRealtime - j11);
            }
        }
    }

    public final void l() {
        n();
        if (this.f101988w == -9223372036854775807L) {
            v vVar = this.f101970e;
            vVar.getClass();
            vVar.f();
        }
        this.f101990y = c();
    }

    public final void m() {
        n();
        this.f101968c = null;
        this.f101970e = null;
    }

    public final void o(AudioTrack audioTrack, int i11, int i12, int i13, boolean z11) {
        long j11;
        this.f101968c = audioTrack;
        this.f101969d = i13;
        this.f101970e = new v(audioTrack, this.f101966a);
        this.f101971f = audioTrack.getSampleRate();
        boolean M11 = m3.N.M(i11);
        this.f101981p = M11;
        if (M11) {
            j11 = m3.N.X(this.f101971f, i13 / i12);
        } else {
            j11 = -9223372036854775807L;
        }
        this.f101972g = j11;
        this.f101984s = 0L;
        this.f101985t = 0L;
        this.f101963D = false;
        this.f101964E = 0L;
        this.f101988w = -9223372036854775807L;
        this.f101989x = -9223372036854775807L;
        this.f101982q = 0L;
        this.f101980o = 0L;
        this.f101973h = 1.0f;
        this.f101976k = 0;
        this.f101975j = -9223372036854775807L;
        this.f101960A = z11;
    }

    public final void p(float f7) {
        this.f101973h = f7;
        v vVar = this.f101970e;
        if (vVar != null) {
            vVar.f();
        }
        n();
    }

    public final void q(InterfaceC8064f interfaceC8064f) {
        this.f101965F = interfaceC8064f;
    }

    public final void r() {
        if (this.f101988w != -9223372036854775807L) {
            this.f101988w = m3.N.Q(this.f101965F.elapsedRealtime());
        }
        this.f101975j = m3.N.X(this.f101971f, c());
        v vVar = this.f101970e;
        vVar.getClass();
        vVar.f();
    }
}
