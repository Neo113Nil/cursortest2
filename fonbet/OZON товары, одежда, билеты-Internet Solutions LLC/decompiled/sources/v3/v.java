package v3;

import E0.C2942q;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import v3.C10201C;
import v3.w;

/* loaded from: classes.dex */
final class v {

    /* renamed from: a, reason: collision with root package name */
    private final a f101944a;

    /* renamed from: b, reason: collision with root package name */
    private final int f101945b;

    /* renamed from: c, reason: collision with root package name */
    private final w.a f101946c;

    /* renamed from: d, reason: collision with root package name */
    private int f101947d;

    /* renamed from: e, reason: collision with root package name */
    private long f101948e;

    /* renamed from: f, reason: collision with root package name */
    private long f101949f;

    /* renamed from: g, reason: collision with root package name */
    private long f101950g;

    /* renamed from: h, reason: collision with root package name */
    private long f101951h;

    /* renamed from: i, reason: collision with root package name */
    private long f101952i;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final AudioTrack f101953a;

        /* renamed from: b, reason: collision with root package name */
        private final AudioTimestamp f101954b = new AudioTimestamp();

        /* renamed from: c, reason: collision with root package name */
        private long f101955c;

        /* renamed from: d, reason: collision with root package name */
        private long f101956d;

        /* renamed from: e, reason: collision with root package name */
        private long f101957e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f101958f;

        /* renamed from: g, reason: collision with root package name */
        private long f101959g;

        public a(AudioTrack audioTrack) {
            this.f101953a = audioTrack;
        }

        public final void a() {
            this.f101958f = true;
        }

        public final long b() {
            return this.f101957e;
        }

        public final long c() {
            return this.f101954b.nanoTime / 1000;
        }

        public final boolean d() {
            AudioTrack audioTrack = this.f101953a;
            AudioTimestamp audioTimestamp = this.f101954b;
            boolean timestamp = audioTrack.getTimestamp(audioTimestamp);
            if (timestamp) {
                long j11 = audioTimestamp.framePosition;
                long j12 = this.f101956d;
                if (j12 > j11) {
                    if (this.f101958f) {
                        this.f101959g += j12;
                        this.f101958f = false;
                    } else {
                        this.f101955c++;
                    }
                }
                this.f101956d = j11;
                this.f101957e = j11 + this.f101959g + (this.f101955c << 32);
            }
            return timestamp;
        }
    }

    public v(AudioTrack audioTrack, w.a aVar) {
        this.f101944a = new a(audioTrack);
        this.f101945b = audioTrack.getSampleRate();
        this.f101946c = aVar;
        g(0);
    }

    private void g(int i11) {
        this.f101947d = i11;
        if (i11 == 0) {
            this.f101950g = 0L;
            this.f101951h = -1L;
            this.f101952i = -9223372036854775807L;
            this.f101948e = System.nanoTime() / 1000;
            this.f101949f = 10000L;
            return;
        }
        if (i11 == 1) {
            this.f101949f = 10000L;
            return;
        }
        if (i11 == 2 || i11 == 3) {
            this.f101949f = 10000000L;
        } else {
            if (i11 != 4) {
                throw new IllegalStateException();
            }
            this.f101949f = 500000L;
        }
    }

    public final void a() {
        this.f101944a.a();
    }

    public final long b(float f7, long j11) {
        a aVar = this.f101944a;
        long b11 = aVar.b();
        long c11 = aVar.c();
        return m3.N.B(f7, j11 - c11) + m3.N.X(this.f101945b, b11);
    }

    public final boolean c() {
        return this.f101947d == 2;
    }

    public final boolean d() {
        int i11 = this.f101947d;
        return i11 == 0 || i11 == 1;
    }

    public final void e(long j11, long j12, float f7) {
        a aVar;
        boolean z11;
        long y11;
        long y12;
        if (j11 - this.f101950g < this.f101949f) {
            return;
        }
        this.f101950g = j11;
        a aVar2 = this.f101944a;
        boolean d11 = aVar2.d();
        int i11 = this.f101945b;
        if (d11) {
            long c11 = aVar2.c();
            long b11 = aVar2.b();
            long c12 = aVar2.c();
            long B11 = m3.N.B(f7, j11 - c12) + m3.N.X(i11, b11);
            long abs = Math.abs(c11 - j11);
            aVar = aVar2;
            w.a aVar3 = this.f101946c;
            if (abs > 5000000) {
                long b12 = aVar.b();
                C10201C.j jVar = (C10201C.j) aVar3;
                jVar.getClass();
                z11 = d11;
                StringBuilder sb2 = new StringBuilder("Spurious audio timestamp (system clock mismatch): ");
                sb2.append(b12);
                sb2.append(", ");
                sb2.append(c11);
                C2942q.f(sb2, ", ", j11, ", ");
                sb2.append(j12);
                sb2.append(", ");
                C10201C c10201c = C10201C.this;
                sb2.append(C10201C.g(c10201c));
                sb2.append(", ");
                y12 = c10201c.y();
                sb2.append(y12);
                m3.s.f("DefaultAudioSink", sb2.toString());
                g(4);
            } else {
                z11 = d11;
                if (Math.abs(B11 - j12) > 5000000) {
                    long b13 = aVar.b();
                    C10201C.j jVar2 = (C10201C.j) aVar3;
                    jVar2.getClass();
                    StringBuilder sb3 = new StringBuilder("Spurious audio timestamp (frame position mismatch): ");
                    sb3.append(b13);
                    sb3.append(", ");
                    sb3.append(c11);
                    C2942q.f(sb3, ", ", j11, ", ");
                    sb3.append(j12);
                    sb3.append(", ");
                    C10201C c10201c2 = C10201C.this;
                    sb3.append(C10201C.g(c10201c2));
                    sb3.append(", ");
                    y11 = c10201c2.y();
                    sb3.append(y11);
                    m3.s.f("DefaultAudioSink", sb3.toString());
                    g(4);
                } else if (this.f101947d == 4) {
                    g(0);
                }
            }
        } else {
            aVar = aVar2;
            z11 = d11;
        }
        int i12 = this.f101947d;
        if (i12 == 0) {
            if (!z11) {
                if (j11 - this.f101948e > 500000) {
                    g(3);
                    return;
                }
                return;
            } else {
                if (aVar.c() >= this.f101948e) {
                    this.f101951h = aVar.b();
                    this.f101952i = aVar.c();
                    g(1);
                    return;
                }
                return;
            }
        }
        if (i12 != 1) {
            if (i12 == 2) {
                if (z11) {
                    return;
                }
                g(0);
                return;
            } else if (i12 != 3) {
                if (i12 != 4) {
                    throw new IllegalStateException();
                }
                return;
            } else {
                if (z11) {
                    g(0);
                    return;
                }
                return;
            }
        }
        if (!z11) {
            g(0);
            return;
        }
        long b14 = aVar.b();
        long j13 = this.f101951h;
        if (b14 > j13) {
            long j14 = this.f101952i;
            long B12 = m3.N.B(f7, j11 - j14) + m3.N.X(i11, j13);
            long b15 = aVar.b();
            long c13 = aVar.c();
            if (Math.abs((m3.N.B(f7, j11 - c13) + m3.N.X(i11, b15)) - B12) < 1000) {
                g(2);
                return;
            }
        }
        if (j11 - this.f101948e > 2000000) {
            g(3);
        } else {
            this.f101951h = aVar.b();
            this.f101952i = aVar.c();
        }
    }

    public final void f() {
        g(0);
    }
}
