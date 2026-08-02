package o1;

import H1.AbstractC1169b;
import H1.AbstractC1170c;
import H1.AbstractC1182o;
import H1.AbstractC1185s;
import ai.verisoul.sdk.Core;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.exoplayer.ExoPlayer;
import b1.AbstractC2335D;
import b1.C2340I;
import b1.C2350d;
import b1.C2354h;
import c1.p;
import com.google.common.collect.AbstractC3445z;
import com.google.common.collect.m0;
import e1.AbstractC4134a;
import e1.AbstractC4156x;
import e1.InterfaceC4143j;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.time.DurationKt;
import n1.G1;
import o1.B;
import o1.C5757i;
import o1.InterfaceC5773z;
import o1.P;
import o1.W;

/* loaded from: classes.dex */
public final class P implements InterfaceC5773z {

    /* renamed from: q0, reason: collision with root package name */
    public static boolean f58650q0 = false;

    /* renamed from: r0, reason: collision with root package name */
    public static final Object f58651r0 = new Object();

    /* renamed from: s0, reason: collision with root package name */
    public static ScheduledExecutorService f58652s0;

    /* renamed from: t0, reason: collision with root package name */
    public static int f58653t0;

    /* renamed from: A, reason: collision with root package name */
    public C5753e f58654A;

    /* renamed from: B, reason: collision with root package name */
    public C5757i f58655B;

    /* renamed from: C, reason: collision with root package name */
    public l f58656C;

    /* renamed from: D, reason: collision with root package name */
    public C2350d f58657D;

    /* renamed from: E, reason: collision with root package name */
    public k f58658E;

    /* renamed from: F, reason: collision with root package name */
    public k f58659F;

    /* renamed from: G, reason: collision with root package name */
    public C2340I f58660G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f58661H;

    /* renamed from: I, reason: collision with root package name */
    public ByteBuffer f58662I;

    /* renamed from: J, reason: collision with root package name */
    public int f58663J;

    /* renamed from: K, reason: collision with root package name */
    public long f58664K;

    /* renamed from: L, reason: collision with root package name */
    public long f58665L;

    /* renamed from: M, reason: collision with root package name */
    public long f58666M;

    /* renamed from: N, reason: collision with root package name */
    public long f58667N;

    /* renamed from: O, reason: collision with root package name */
    public int f58668O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f58669P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f58670Q;

    /* renamed from: R, reason: collision with root package name */
    public long f58671R;

    /* renamed from: S, reason: collision with root package name */
    public float f58672S;

    /* renamed from: T, reason: collision with root package name */
    public ByteBuffer f58673T;

    /* renamed from: U, reason: collision with root package name */
    public int f58674U;

    /* renamed from: V, reason: collision with root package name */
    public ByteBuffer f58675V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f58676W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f58677X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f58678Y;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f58679Z;

    /* renamed from: a, reason: collision with root package name */
    public final Context f58680a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f58681a0;

    /* renamed from: b, reason: collision with root package name */
    public final c1.q f58682b;

    /* renamed from: b0, reason: collision with root package name */
    public int f58683b0;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f58684c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f58685c0;

    /* renamed from: d, reason: collision with root package name */
    public final C f58686d;

    /* renamed from: d0, reason: collision with root package name */
    public C2354h f58687d0;

    /* renamed from: e, reason: collision with root package name */
    public final f0 f58688e;

    /* renamed from: e0, reason: collision with root package name */
    public C5758j f58689e0;

    /* renamed from: f, reason: collision with root package name */
    public final c1.z f58690f;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f58691f0;

    /* renamed from: g, reason: collision with root package name */
    public final e0 f58692g;

    /* renamed from: g0, reason: collision with root package name */
    public long f58693g0;

    /* renamed from: h, reason: collision with root package name */
    public final AbstractC3445z f58694h;

    /* renamed from: h0, reason: collision with root package name */
    public long f58695h0;

    /* renamed from: i, reason: collision with root package name */
    public final B f58696i;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f58697i0;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayDeque f58698j;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f58699j0;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f58700k;

    /* renamed from: k0, reason: collision with root package name */
    public Looper f58701k0;

    /* renamed from: l, reason: collision with root package name */
    public int f58702l;

    /* renamed from: l0, reason: collision with root package name */
    public long f58703l0;

    /* renamed from: m, reason: collision with root package name */
    public o f58704m;

    /* renamed from: m0, reason: collision with root package name */
    public long f58705m0;

    /* renamed from: n, reason: collision with root package name */
    public final m f58706n;

    /* renamed from: n0, reason: collision with root package name */
    public Handler f58707n0;

    /* renamed from: o, reason: collision with root package name */
    public final m f58708o;

    /* renamed from: o0, reason: collision with root package name */
    public Context f58709o0;

    /* renamed from: p, reason: collision with root package name */
    public final e f58710p;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f58711p0;

    /* renamed from: q, reason: collision with root package name */
    public final d f58712q;

    /* renamed from: r, reason: collision with root package name */
    public final ExoPlayer.a f58713r;

    /* renamed from: s, reason: collision with root package name */
    public final f f58714s;

    /* renamed from: t, reason: collision with root package name */
    public final int f58715t;

    /* renamed from: u, reason: collision with root package name */
    public G1 f58716u;

    /* renamed from: v, reason: collision with root package name */
    public InterfaceC5773z.d f58717v;

    /* renamed from: w, reason: collision with root package name */
    public h f58718w;

    /* renamed from: x, reason: collision with root package name */
    public h f58719x;

    /* renamed from: y, reason: collision with root package name */
    public c1.o f58720y;

    /* renamed from: z, reason: collision with root package name */
    public AudioTrack f58721z;

    public static final class b {
        public static long a(AudioTrack audioTrack, h hVar) {
            return hVar.f58737c == 0 ? hVar.d(audioTrack.getBufferSizeInFrames()) : e1.Z.s1(audioTrack.getBufferSizeInFrames(), 1000000L, P.Y(hVar.f58741g), RoundingMode.DOWN);
        }

        public static void b(AudioTrack audioTrack, C5758j c5758j) {
            audioTrack.setPreferredDevice(c5758j == null ? null : c5758j.f58844a);
        }
    }

    public static final class c {
        public static void a(AudioTrack audioTrack, G1 g12) {
            LogSessionId logSessionId;
            boolean equals;
            LogSessionId a10 = g12.a();
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            equals = a10.equals(logSessionId);
            if (equals) {
                return;
            }
            audioTrack.setLogSessionId(a10);
        }
    }

    public interface d {
        C5759k a(androidx.media3.common.a aVar, C2350d c2350d);
    }

    public interface e {

        /* renamed from: a, reason: collision with root package name */
        public static final e f58722a = new W.a().h();

        int a(int i10, int i11, int i12, int i13, int i14, int i15, double d10);
    }

    public interface f {

        /* renamed from: a, reason: collision with root package name */
        public static final f f58723a = new Z();

        default int a(int i10) {
            return e1.Z.N(i10);
        }

        AudioTrack b(InterfaceC5773z.a aVar, C2350d c2350d, int i10, Context context);
    }

    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        public final Context f58724a;

        /* renamed from: c, reason: collision with root package name */
        public c1.q f58726c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f58727d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f58728e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f58729f;

        /* renamed from: i, reason: collision with root package name */
        public d f58732i;

        /* renamed from: k, reason: collision with root package name */
        public ExoPlayer.a f58734k;

        /* renamed from: j, reason: collision with root package name */
        public boolean f58733j = true;

        /* renamed from: b, reason: collision with root package name */
        public C5753e f58725b = C5753e.f58813c;

        /* renamed from: g, reason: collision with root package name */
        public e f58730g = e.f58722a;

        /* renamed from: h, reason: collision with root package name */
        public f f58731h = f.f58723a;

        public g(Context context) {
            this.f58724a = context;
        }

        public P k() {
            AbstractC4134a.g(!this.f58729f);
            this.f58729f = true;
            if (this.f58726c == null) {
                this.f58726c = new i(new c1.p[0]);
            }
            if (this.f58732i == null) {
                this.f58732i = new E(this.f58724a);
            }
            return new P(this);
        }

        public g l(boolean z10) {
            this.f58728e = z10;
            return this;
        }

        public g m(boolean z10) {
            this.f58727d = z10;
            return this;
        }
    }

    public static final class h {

        /* renamed from: a, reason: collision with root package name */
        public final androidx.media3.common.a f58735a;

        /* renamed from: b, reason: collision with root package name */
        public final int f58736b;

        /* renamed from: c, reason: collision with root package name */
        public final int f58737c;

        /* renamed from: d, reason: collision with root package name */
        public final int f58738d;

        /* renamed from: e, reason: collision with root package name */
        public final int f58739e;

        /* renamed from: f, reason: collision with root package name */
        public final int f58740f;

        /* renamed from: g, reason: collision with root package name */
        public final int f58741g;

        /* renamed from: h, reason: collision with root package name */
        public final int f58742h;

        /* renamed from: i, reason: collision with root package name */
        public final c1.o f58743i;

        /* renamed from: j, reason: collision with root package name */
        public final boolean f58744j;

        /* renamed from: k, reason: collision with root package name */
        public final boolean f58745k;

        /* renamed from: l, reason: collision with root package name */
        public final boolean f58746l;

        public h(androidx.media3.common.a aVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16, c1.o oVar, boolean z10, boolean z11, boolean z12) {
            this.f58735a = aVar;
            this.f58736b = i10;
            this.f58737c = i11;
            this.f58738d = i12;
            this.f58739e = i13;
            this.f58740f = i14;
            this.f58741g = i15;
            this.f58742h = i16;
            this.f58743i = oVar;
            this.f58744j = z10;
            this.f58745k = z11;
            this.f58746l = z12;
        }

        public InterfaceC5773z.a a() {
            return new InterfaceC5773z.a(this.f58741g, this.f58739e, this.f58740f, this.f58746l, this.f58737c == 1, this.f58742h);
        }

        public boolean b(h hVar) {
            return hVar.f58737c == this.f58737c && hVar.f58741g == this.f58741g && hVar.f58739e == this.f58739e && hVar.f58740f == this.f58740f && hVar.f58738d == this.f58738d && hVar.f58744j == this.f58744j && hVar.f58745k == this.f58745k;
        }

        public h c(int i10) {
            return new h(this.f58735a, this.f58736b, this.f58737c, this.f58738d, this.f58739e, this.f58740f, this.f58741g, i10, this.f58743i, this.f58744j, this.f58745k, this.f58746l);
        }

        public long d(long j10) {
            return e1.Z.o1(j10, this.f58739e);
        }

        public long e(long j10) {
            return e1.Z.o1(j10, this.f58735a.f20519G);
        }

        public boolean f() {
            return this.f58737c == 1;
        }
    }

    public static class i implements c1.q {

        /* renamed from: a, reason: collision with root package name */
        public final d0 f58747a;
        private final c1.p[] audioProcessors;

        /* renamed from: b, reason: collision with root package name */
        public final c1.v f58748b;

        public i(c1.p... pVarArr) {
            this(pVarArr, new d0(), new c1.v());
        }

        @Override // c1.q
        public long a(long j10) {
            return this.f58748b.isActive() ? this.f58748b.h(j10) : j10;
        }

        @Override // c1.q
        public C2340I b(C2340I c2340i) {
            this.f58748b.l(c2340i.f24315a);
            this.f58748b.k(c2340i.f24316b);
            return c2340i;
        }

        @Override // c1.q
        public c1.p[] c() {
            return this.audioProcessors;
        }

        @Override // c1.q
        public long d() {
            return this.f58747a.u();
        }

        @Override // c1.q
        public boolean e(boolean z10) {
            this.f58747a.D(z10);
            return z10;
        }

        public i(c1.p[] pVarArr, d0 d0Var, c1.v vVar) {
            c1.p[] pVarArr2 = new c1.p[pVarArr.length + 2];
            this.audioProcessors = pVarArr2;
            System.arraycopy(pVarArr, 0, pVarArr2, 0, pVarArr.length);
            this.f58747a = d0Var;
            this.f58748b = vVar;
            pVarArr2[pVarArr.length] = d0Var;
            pVarArr2[pVarArr.length + 1] = vVar;
        }
    }

    public static final class j extends RuntimeException {
        public j(String str) {
            super(str);
        }
    }

    public static final class k {

        /* renamed from: a, reason: collision with root package name */
        public final C2340I f58749a;

        /* renamed from: b, reason: collision with root package name */
        public final long f58750b;

        /* renamed from: c, reason: collision with root package name */
        public final long f58751c;

        /* renamed from: d, reason: collision with root package name */
        public long f58752d;

        public k(C2340I c2340i, long j10, long j11) {
            this.f58749a = c2340i;
            this.f58750b = j10;
            this.f58751c = j11;
        }
    }

    public static final class l {

        /* renamed from: a, reason: collision with root package name */
        public final AudioTrack f58753a;

        /* renamed from: b, reason: collision with root package name */
        public final C5757i f58754b;

        /* renamed from: c, reason: collision with root package name */
        public AudioRouting.OnRoutingChangedListener f58755c = new AudioRouting.OnRoutingChangedListener() { // from class: o1.S
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final void onRoutingChanged(AudioRouting audioRouting) {
                P.l.this.b(audioRouting);
            }
        };

        public l(AudioTrack audioTrack, C5757i c5757i) {
            this.f58753a = audioTrack;
            this.f58754b = c5757i;
            audioTrack.addOnRoutingChangedListener(this.f58755c, new Handler(Looper.myLooper()));
        }

        public final void b(AudioRouting audioRouting) {
            AudioDeviceInfo routedDevice;
            if (this.f58755c == null || (routedDevice = audioRouting.getRoutedDevice()) == null) {
                return;
            }
            this.f58754b.j(routedDevice);
        }

        public void c() {
            this.f58753a.removeOnRoutingChangedListener((AudioRouting.OnRoutingChangedListener) AbstractC4134a.e(this.f58755c));
            this.f58755c = null;
        }
    }

    public static final class m {

        /* renamed from: a, reason: collision with root package name */
        public Exception f58756a;

        /* renamed from: b, reason: collision with root package name */
        public long f58757b = -9223372036854775807L;

        /* renamed from: c, reason: collision with root package name */
        public long f58758c = -9223372036854775807L;

        public void a() {
            this.f58756a = null;
            this.f58757b = -9223372036854775807L;
            this.f58758c = -9223372036854775807L;
        }

        public boolean b() {
            if (this.f58756a == null) {
                return false;
            }
            return P.c0() || SystemClock.elapsedRealtime() < this.f58758c;
        }

        public void c(Exception exc) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f58756a == null) {
                this.f58756a = exc;
            }
            if (this.f58757b == -9223372036854775807L && !P.c0()) {
                this.f58757b = 200 + elapsedRealtime;
            }
            long j10 = this.f58757b;
            if (j10 == -9223372036854775807L || elapsedRealtime < j10) {
                this.f58758c = elapsedRealtime + 50;
                return;
            }
            Exception exc2 = this.f58756a;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = this.f58756a;
            a();
            throw exc3;
        }
    }

    public final class n implements B.a {
        public n() {
        }

        @Override // o1.B.a
        public void a(int i10, long j10) {
            if (P.this.f58717v != null) {
                P.this.f58717v.i(i10, j10, SystemClock.elapsedRealtime() - P.this.f58695h0);
            }
        }

        @Override // o1.B.a
        public void b(long j10) {
            AbstractC4156x.i("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j10);
        }

        @Override // o1.B.a
        public void c(long j10) {
            if (P.this.f58717v != null) {
                P.this.f58717v.c(j10);
            }
        }

        @Override // o1.B.a
        public void d(long j10, long j11, long j12, long j13) {
            String str = "Spurious audio timestamp (frame position mismatch): " + j10 + ", " + j11 + ", " + j12 + ", " + j13 + ", " + P.this.Z() + ", " + P.this.a0();
            if (P.f58650q0) {
                throw new j(str);
            }
            AbstractC4156x.i("DefaultAudioSink", str);
        }

        @Override // o1.B.a
        public void e(long j10, long j11, long j12, long j13) {
            String str = "Spurious audio timestamp (system clock mismatch): " + j10 + ", " + j11 + ", " + j12 + ", " + j13 + ", " + P.this.Z() + ", " + P.this.a0();
            if (P.f58650q0) {
                throw new j(str);
            }
            AbstractC4156x.i("DefaultAudioSink", str);
        }
    }

    public final class o {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f58760a = new Handler(Looper.myLooper());

        /* renamed from: b, reason: collision with root package name */
        public final AudioTrack$StreamEventCallback f58761b;

        public class a extends AudioTrack$StreamEventCallback {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ P f58763a;

            public a(P p10) {
                this.f58763a = p10;
            }

            public void onDataRequest(AudioTrack audioTrack, int i10) {
                if (audioTrack.equals(P.this.f58721z) && P.this.f58717v != null && P.this.f58679Z) {
                    P.this.f58717v.l();
                }
            }

            public void onPresentationEnded(AudioTrack audioTrack) {
                if (audioTrack.equals(P.this.f58721z)) {
                    P.this.f58678Y = true;
                }
            }

            public void onTearDown(AudioTrack audioTrack) {
                if (audioTrack.equals(P.this.f58721z) && P.this.f58717v != null && P.this.f58679Z) {
                    P.this.f58717v.l();
                }
            }
        }

        public o() {
            this.f58761b = new a(P.this);
        }

        public void a(AudioTrack audioTrack) {
            Handler handler = this.f58760a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new V(handler), this.f58761b);
        }

        public void b(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.f58761b);
            this.f58760a.removeCallbacksAndMessages(null);
        }
    }

    public static /* synthetic */ void C(AudioTrack audioTrack, final InterfaceC5773z.d dVar, Handler handler, final InterfaceC5773z.a aVar) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (dVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: o1.O
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC5773z.d.this.f(aVar);
                    }
                });
            }
            synchronized (f58651r0) {
                try {
                    int i10 = f58653t0 - 1;
                    f58653t0 = i10;
                    if (i10 == 0) {
                        f58652s0.shutdown();
                        f58652s0 = null;
                    }
                } finally {
                }
            }
        } catch (Throwable th2) {
            if (dVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: o1.O
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC5773z.d.this.f(aVar);
                    }
                });
            }
            synchronized (f58651r0) {
                try {
                    int i11 = f58653t0 - 1;
                    f58653t0 = i11;
                    if (i11 == 0) {
                        f58652s0.shutdown();
                        f58652s0 = null;
                    }
                    throw th2;
                } finally {
                }
            }
        }
    }

    public static int U(int i10, int i11, int i12) {
        int minBufferSize = AudioTrack.getMinBufferSize(i10, i11, i12);
        AbstractC4134a.g(minBufferSize != -2);
        return minBufferSize;
    }

    public static int V(Context context) {
        int deviceId;
        deviceId = context.getDeviceId();
        if (deviceId == 0 || deviceId == -1) {
            return -1;
        }
        return deviceId;
    }

    public static int W(int i10, ByteBuffer byteBuffer) {
        if (i10 == 20) {
            return H1.H.h(byteBuffer);
        }
        if (i10 != 30) {
            switch (i10) {
                case 5:
                case 6:
                    break;
                case 7:
                case 8:
                    break;
                case 9:
                    int m10 = H1.F.m(e1.Z.R(byteBuffer, byteBuffer.position()));
                    if (m10 != -1) {
                        return m10;
                    }
                    throw new IllegalArgumentException();
                case 10:
                    return 1024;
                case 11:
                case 12:
                    return 2048;
                default:
                    switch (i10) {
                        case 14:
                            int b10 = AbstractC1169b.b(byteBuffer);
                            if (b10 == -1) {
                                return 0;
                            }
                            return AbstractC1169b.i(byteBuffer, b10) * 16;
                        case 15:
                            return 512;
                        case 16:
                            return 1024;
                        case 17:
                            return AbstractC1170c.f(byteBuffer);
                        case 18:
                            break;
                        default:
                            throw new IllegalStateException("Unexpected audio encoding: " + i10);
                    }
            }
            return AbstractC1169b.e(byteBuffer);
        }
        return AbstractC1182o.f(byteBuffer);
    }

    public static String X(Looper looper) {
        return looper == null ? "null" : looper.getThread().getName();
    }

    public static int Y(int i10) {
        int b10 = AbstractC1185s.b(i10);
        AbstractC4134a.g(b10 != -2147483647);
        return b10;
    }

    public static boolean c0() {
        boolean z10;
        synchronized (f58651r0) {
            z10 = f58653t0 > 0;
        }
        return z10;
    }

    public static boolean e0(int i10) {
        return i10 == -6 || i10 == -32;
    }

    public static boolean g0(AudioTrack audioTrack) {
        boolean isOffloadedPlayback;
        if (Build.VERSION.SDK_INT < 29) {
            return false;
        }
        isOffloadedPlayback = audioTrack.isOffloadedPlayback();
        return isOffloadedPlayback;
    }

    public static void p0(final AudioTrack audioTrack, final InterfaceC5773z.d dVar, final InterfaceC5773z.a aVar) {
        final Handler handler = new Handler(Looper.myLooper());
        synchronized (f58651r0) {
            try {
                if (f58652s0 == null) {
                    f58652s0 = e1.Z.c1("ExoPlayer:AudioTrackReleaseThread");
                }
                f58653t0++;
                f58652s0.schedule(new Runnable() { // from class: o1.L
                    @Override // java.lang.Runnable
                    public final void run() {
                        P.C(audioTrack, dVar, handler, aVar);
                    }
                }, 20L, TimeUnit.MILLISECONDS);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static int z0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10) {
        return audioTrack.write(byteBuffer, i10, 1);
    }

    public final int A0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10, long j10) {
        if (Build.VERSION.SDK_INT >= 26) {
            return audioTrack.write(byteBuffer, i10, 1, j10 * 1000);
        }
        if (this.f58662I == null) {
            ByteBuffer allocate = ByteBuffer.allocate(16);
            this.f58662I = allocate;
            allocate.order(ByteOrder.BIG_ENDIAN);
            this.f58662I.putInt(1431633921);
        }
        if (this.f58663J == 0) {
            this.f58662I.putInt(4, i10);
            this.f58662I.putLong(8, j10 * 1000);
            this.f58662I.position(0);
            this.f58663J = i10;
        }
        int remaining = this.f58662I.remaining();
        if (remaining > 0) {
            int write = audioTrack.write(this.f58662I, remaining, 1);
            if (write < 0) {
                this.f58663J = 0;
                return write;
            }
            if (write < remaining) {
                return 0;
            }
        }
        int z02 = z0(audioTrack, byteBuffer, i10);
        if (z02 < 0) {
            this.f58663J = 0;
            return z02;
        }
        this.f58663J -= z02;
        return z02;
    }

    public final void M(long j10) {
        C2340I c2340i;
        if (y0()) {
            c2340i = C2340I.f24312d;
        } else {
            c2340i = w0() ? this.f58682b.b(this.f58660G) : C2340I.f24312d;
            this.f58660G = c2340i;
        }
        C2340I c2340i2 = c2340i;
        this.f58661H = w0() ? this.f58682b.e(this.f58661H) : false;
        this.f58698j.add(new k(c2340i2, Math.max(0L, j10), this.f58719x.d(a0())));
        v0();
        InterfaceC5773z.d dVar = this.f58717v;
        if (dVar != null) {
            dVar.b(this.f58661H);
        }
    }

    public final long N(long j10) {
        while (!this.f58698j.isEmpty() && j10 >= ((k) this.f58698j.getFirst()).f58751c) {
            this.f58659F = (k) this.f58698j.remove();
        }
        k kVar = this.f58659F;
        long j11 = j10 - kVar.f58751c;
        long l02 = e1.Z.l0(j11, kVar.f58749a.f24315a);
        if (!this.f58698j.isEmpty()) {
            k kVar2 = this.f58659F;
            return kVar2.f58750b + l02 + kVar2.f58752d;
        }
        long a10 = this.f58682b.a(j11);
        k kVar3 = this.f58659F;
        long j12 = kVar3.f58750b + a10;
        kVar3.f58752d = a10 - l02;
        return j12;
    }

    public final long O(long j10) {
        long d10 = this.f58682b.d();
        long d11 = j10 + this.f58719x.d(d10);
        long j11 = this.f58703l0;
        if (d10 > j11) {
            long d12 = this.f58719x.d(d10 - j11);
            this.f58703l0 = d10;
            b0(d12);
        }
        return d11;
    }

    public final AudioTrack P(InterfaceC5773z.a aVar, C2350d c2350d, int i10, androidx.media3.common.a aVar2, Context context) {
        try {
            AudioTrack b10 = this.f58714s.b(aVar, c2350d, i10, context);
            int state = b10.getState();
            if (state == 1) {
                return b10;
            }
            try {
                b10.release();
            } catch (Exception unused) {
            }
            throw new InterfaceC5773z.c(state, aVar.f58886b, aVar.f58887c, aVar.f58885a, aVar.f58890f, aVar2, aVar.f58889e, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e10) {
            throw new InterfaceC5773z.c(0, aVar.f58886b, aVar.f58887c, aVar.f58885a, aVar.f58890f, aVar2, aVar.f58889e, e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003a A[Catch: c -> 0x0042, TRY_LEAVE, TryCatch #1 {c -> 0x0042, blocks: (B:9:0x0032, B:11:0x003a), top: B:8:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AudioTrack Q(h hVar) {
        P p10;
        InterfaceC5773z.c cVar;
        InterfaceC5773z.d dVar;
        Context context;
        int i10;
        Context createDeviceContext;
        ExoPlayer.a aVar;
        try {
            int i11 = this.f58683b0;
            int i12 = this.f58715t;
            try {
                if (i12 != -1) {
                    try {
                        Context context2 = this.f58680a;
                        if (context2 != null && Build.VERSION.SDK_INT >= 34) {
                            if (this.f58709o0 == null) {
                                createDeviceContext = context2.createDeviceContext(i12);
                                this.f58709o0 = createDeviceContext;
                            }
                            context = this.f58709o0;
                            i10 = 0;
                            p10 = this;
                            AudioTrack P10 = p10.P(hVar.a(), this.f58657D, i10, hVar.f58735a, context);
                            aVar = p10.f58713r;
                            if (aVar != null) {
                                return P10;
                            }
                            aVar.D(g0(P10));
                            return P10;
                        }
                    } catch (InterfaceC5773z.c e10) {
                        cVar = e10;
                        p10 = this;
                        dVar = p10.f58717v;
                        if (dVar != null) {
                            throw cVar;
                        }
                        dVar.d(cVar);
                        throw cVar;
                    }
                }
                AudioTrack P102 = p10.P(hVar.a(), this.f58657D, i10, hVar.f58735a, context);
                aVar = p10.f58713r;
                if (aVar != null) {
                }
            } catch (InterfaceC5773z.c e11) {
                e = e11;
                cVar = e;
                dVar = p10.f58717v;
                if (dVar != null) {
                }
            }
            i10 = i11;
            context = null;
            p10 = this;
        } catch (InterfaceC5773z.c e12) {
            e = e12;
            p10 = this;
        }
    }

    public final AudioTrack R() {
        try {
            return Q((h) AbstractC4134a.e(this.f58719x));
        } catch (InterfaceC5773z.c e10) {
            h hVar = this.f58719x;
            if (hVar.f58742h > 1000000) {
                h c10 = hVar.c(DurationKt.NANOS_IN_MILLIS);
                try {
                    AudioTrack Q10 = Q(c10);
                    this.f58719x = c10;
                    return Q10;
                } catch (InterfaceC5773z.c e11) {
                    e10.addSuppressed(e11);
                    h0();
                    throw e10;
                }
            }
            h0();
            throw e10;
        }
    }

    public final void S(long j10) {
        P p10;
        int z02;
        InterfaceC5773z.d dVar;
        if (this.f58675V == null || this.f58708o.b()) {
            return;
        }
        int remaining = this.f58675V.remaining();
        if (this.f58691f0) {
            AbstractC4134a.g(j10 != -9223372036854775807L);
            if (j10 == Long.MIN_VALUE) {
                j10 = this.f58693g0;
            } else {
                this.f58693g0 = j10;
            }
            p10 = this;
            z02 = p10.A0(this.f58721z, this.f58675V, remaining, j10);
        } else {
            p10 = this;
            z02 = z0(p10.f58721z, p10.f58675V, remaining);
        }
        p10.f58695h0 = SystemClock.elapsedRealtime();
        if (z02 < 0) {
            if (e0(z02)) {
                if (a0() <= 0) {
                    if (g0(p10.f58721z)) {
                        h0();
                    }
                }
                r7 = true;
            }
            InterfaceC5773z.f fVar = new InterfaceC5773z.f(z02, p10.f58719x.f58735a, r7);
            InterfaceC5773z.d dVar2 = p10.f58717v;
            if (dVar2 != null) {
                dVar2.d(fVar);
            }
            if (!fVar.f58898b || p10.f58680a == null) {
                p10.f58708o.c(fVar);
                return;
            }
            C5753e c5753e = C5753e.f58813c;
            p10.f58654A = c5753e;
            p10.f58655B.g(c5753e);
            throw fVar;
        }
        p10.f58708o.a();
        if (g0(p10.f58721z)) {
            if (p10.f58667N > 0) {
                p10.f58699j0 = false;
            }
            if (p10.f58679Z && (dVar = p10.f58717v) != null && z02 < remaining && !p10.f58699j0) {
                dVar.h();
            }
        }
        int i10 = p10.f58719x.f58737c;
        if (i10 == 0) {
            p10.f58666M += z02;
        }
        if (z02 == remaining) {
            if (i10 != 0) {
                AbstractC4134a.g(p10.f58675V == p10.f58673T);
                p10.f58667N += p10.f58668O * p10.f58674U;
            }
            p10.f58675V = null;
        }
    }

    public final boolean T() {
        ByteBuffer byteBuffer;
        if (!this.f58720y.g()) {
            S(Long.MIN_VALUE);
            return this.f58675V == null;
        }
        this.f58720y.i();
        n0(Long.MIN_VALUE);
        return this.f58720y.f() && ((byteBuffer = this.f58675V) == null || !byteBuffer.hasRemaining());
    }

    public final long Z() {
        return this.f58719x.f58737c == 0 ? this.f58664K / r0.f58736b : this.f58665L;
    }

    @Override // o1.InterfaceC5773z
    public boolean a(androidx.media3.common.a aVar) {
        return u(aVar) != 0;
    }

    public final long a0() {
        return this.f58719x.f58737c == 0 ? e1.Z.l(this.f58666M, r0.f58738d) : this.f58667N;
    }

    @Override // o1.InterfaceC5773z
    public boolean b() {
        if (f0()) {
            return this.f58676W && !f();
        }
        return true;
    }

    public final void b0(long j10) {
        this.f58705m0 += j10;
        if (this.f58707n0 == null) {
            this.f58707n0 = new Handler(Looper.myLooper());
        }
        this.f58707n0.removeCallbacksAndMessages(null);
        this.f58707n0.postDelayed(new Runnable() { // from class: o1.N
            @Override // java.lang.Runnable
            public final void run() {
                P.this.j0();
            }
        }, 100L);
    }

    @Override // o1.InterfaceC5773z
    public C5759k c(androidx.media3.common.a aVar) {
        return this.f58697i0 ? C5759k.f58845d : this.f58712q.a(aVar, this.f58657D);
    }

    @Override // o1.InterfaceC5773z
    public C2340I d() {
        return this.f58660G;
    }

    public final boolean d0() {
        G1 g12;
        if (this.f58706n.b()) {
            return false;
        }
        AudioTrack R10 = R();
        this.f58721z = R10;
        if (g0(R10)) {
            o0(this.f58721z);
            h hVar = this.f58719x;
            if (hVar.f58745k) {
                AudioTrack audioTrack = this.f58721z;
                androidx.media3.common.a aVar = hVar.f58735a;
                audioTrack.setOffloadDelayPadding(aVar.f20521I, aVar.f20522J);
            }
        }
        if (Build.VERSION.SDK_INT >= 31 && (g12 = this.f58716u) != null) {
            c.a(this.f58721z, g12);
        }
        B b10 = this.f58696i;
        AudioTrack audioTrack2 = this.f58721z;
        h hVar2 = this.f58719x;
        b10.u(audioTrack2, hVar2.f58737c == 2, hVar2.f58741g, hVar2.f58738d, hVar2.f58742h, this.f58711p0);
        u0();
        int i10 = this.f58687d0.f24588a;
        if (i10 != 0) {
            this.f58721z.attachAuxEffect(i10);
            this.f58721z.setAuxEffectSendLevel(this.f58687d0.f24589b);
        }
        C5758j c5758j = this.f58689e0;
        if (c5758j != null) {
            b.b(this.f58721z, c5758j);
            C5757i c5757i = this.f58655B;
            if (c5757i != null) {
                c5757i.j(this.f58689e0.f58844a);
            }
        }
        C5757i c5757i2 = this.f58655B;
        if (c5757i2 != null) {
            this.f58656C = new l(this.f58721z, c5757i2);
        }
        this.f58670Q = true;
        int audioSessionId = this.f58721z.getAudioSessionId();
        boolean z10 = audioSessionId != this.f58683b0;
        this.f58683b0 = audioSessionId;
        InterfaceC5773z.d dVar = this.f58717v;
        if (dVar != null) {
            dVar.e(this.f58719x.a());
            if (z10) {
                this.f58685c0 = true;
                this.f58717v.a(this.f58683b0);
            }
        }
        return true;
    }

    @Override // o1.InterfaceC5773z
    public void e(C2340I c2340i) {
        this.f58660G = new C2340I(e1.Z.n(c2340i.f24315a, 0.1f, 8.0f), e1.Z.n(c2340i.f24316b, 0.1f, 8.0f));
        if (y0()) {
            s0();
        } else {
            r0(c2340i);
        }
    }

    @Override // o1.InterfaceC5773z
    public boolean f() {
        boolean isOffloadedPlayback;
        if (!f0()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            isOffloadedPlayback = this.f58721z.isOffloadedPlayback();
            if (isOffloadedPlayback && this.f58678Y) {
                return false;
            }
        }
        return this.f58696i.j(a0());
    }

    public final boolean f0() {
        return this.f58721z != null;
    }

    @Override // o1.InterfaceC5773z
    public void flush() {
        if (f0()) {
            q0();
            if (this.f58696i.k()) {
                this.f58721z.pause();
            }
            if (g0(this.f58721z)) {
                ((o) AbstractC4134a.e(this.f58704m)).b(this.f58721z);
            }
            InterfaceC5773z.a a10 = this.f58719x.a();
            h hVar = this.f58718w;
            if (hVar != null) {
                this.f58719x = hVar;
                this.f58718w = null;
            }
            this.f58696i.s();
            l lVar = this.f58656C;
            if (lVar != null) {
                lVar.c();
                this.f58656C = null;
            }
            p0(this.f58721z, this.f58717v, a10);
            this.f58721z = null;
        }
        this.f58708o.a();
        this.f58706n.a();
        this.f58703l0 = 0L;
        this.f58705m0 = 0L;
        Handler handler = this.f58707n0;
        if (handler != null) {
            ((Handler) AbstractC4134a.e(handler)).removeCallbacksAndMessages(null);
        }
    }

    @Override // o1.InterfaceC5773z
    public void g(int i10) {
        if (this.f58685c0) {
            if (this.f58683b0 != i10) {
                return;
            } else {
                this.f58685c0 = false;
            }
        }
        if (this.f58683b0 != i10) {
            this.f58683b0 = i10;
            this.f58681a0 = i10 != 0;
            flush();
        }
    }

    @Override // o1.InterfaceC5773z
    public void h(float f10) {
        if (this.f58672S != f10) {
            this.f58672S = f10;
            u0();
        }
    }

    public final void h0() {
        if (this.f58719x.f()) {
            this.f58697i0 = true;
        }
    }

    @Override // o1.InterfaceC5773z
    public long i() {
        if (f0()) {
            return b.a(this.f58721z, this.f58719x);
        }
        return -9223372036854775807L;
    }

    public final ByteBuffer i0(ByteBuffer byteBuffer) {
        if (this.f58719x.f58737c == 0) {
            int E10 = (int) e1.Z.E(e1.Z.a1(20L), this.f58719x.f58739e);
            long a02 = a0();
            if (a02 < E10) {
                h hVar = this.f58719x;
                return c0.a(byteBuffer, hVar.f58741g, hVar.f58738d, (int) a02, E10);
            }
        }
        return byteBuffer;
    }

    @Override // o1.InterfaceC5773z
    public void j(int i10) {
        AbstractC4134a.g(Build.VERSION.SDK_INT >= 29);
        this.f58702l = i10;
    }

    public final void j0() {
        if (this.f58705m0 >= Core.sensorDataTimeout) {
            this.f58717v.g();
            this.f58705m0 = 0L;
        }
    }

    @Override // o1.InterfaceC5773z
    public void k() {
        if (this.f58691f0) {
            this.f58691f0 = false;
            flush();
        }
    }

    public final void k0() {
        Context context;
        Looper myLooper = Looper.myLooper();
        AbstractC4134a.h(this.f58655B == null || this.f58701k0 == myLooper, "DefaultAudioSink accessed on multiple threads: " + X(this.f58701k0) + " and " + X(myLooper));
        if (this.f58655B == null && (context = this.f58680a) != null) {
            this.f58701k0 = myLooper;
            C5757i c5757i = new C5757i(context, new C5757i.f() { // from class: o1.M
                @Override // o1.C5757i.f
                public final void a(C5753e c5753e) {
                    P.this.l0(c5753e);
                }
            }, this.f58657D, this.f58689e0);
            this.f58655B = c5757i;
            this.f58654A = c5757i.h();
        }
        AbstractC4134a.e(this.f58654A);
    }

    @Override // o1.InterfaceC5773z
    public boolean l(ByteBuffer byteBuffer, long j10, int i10) {
        ByteBuffer byteBuffer2 = this.f58673T;
        AbstractC4134a.a(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.f58718w != null) {
            if (!T()) {
                return false;
            }
            if (this.f58718w.b(this.f58719x)) {
                this.f58719x = this.f58718w;
                this.f58718w = null;
                AudioTrack audioTrack = this.f58721z;
                if (audioTrack != null && g0(audioTrack) && this.f58719x.f58745k) {
                    if (this.f58721z.getPlayState() == 3) {
                        this.f58721z.setOffloadEndOfStream();
                        this.f58696i.a();
                    }
                    AudioTrack audioTrack2 = this.f58721z;
                    androidx.media3.common.a aVar = this.f58719x.f58735a;
                    audioTrack2.setOffloadDelayPadding(aVar.f20521I, aVar.f20522J);
                    this.f58699j0 = true;
                }
            } else {
                m0();
                if (f()) {
                    return false;
                }
                flush();
            }
            M(j10);
        }
        if (!f0()) {
            try {
                if (!d0()) {
                    return false;
                }
            } catch (InterfaceC5773z.c e10) {
                if (e10.f58893b) {
                    throw e10;
                }
                this.f58706n.c(e10);
                return false;
            }
        }
        this.f58706n.a();
        if (this.f58670Q) {
            this.f58671R = Math.max(0L, j10);
            this.f58669P = false;
            this.f58670Q = false;
            if (y0()) {
                s0();
            }
            M(j10);
            if (this.f58679Z) {
                play();
            }
        }
        if (!this.f58696i.m(a0())) {
            return false;
        }
        if (this.f58673T == null) {
            AbstractC4134a.a(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            h hVar = this.f58719x;
            if (hVar.f58737c != 0 && this.f58668O == 0) {
                int W10 = W(hVar.f58741g, byteBuffer);
                this.f58668O = W10;
                if (W10 == 0) {
                    return true;
                }
            }
            if (this.f58658E != null) {
                if (!T()) {
                    return false;
                }
                M(j10);
                this.f58658E = null;
            }
            long e11 = this.f58671R + this.f58719x.e(Z() - this.f58688e.m());
            if (!this.f58669P && Math.abs(e11 - j10) > 200000) {
                InterfaceC5773z.d dVar = this.f58717v;
                if (dVar != null) {
                    dVar.d(new InterfaceC5773z.e(j10, e11));
                }
                this.f58669P = true;
            }
            if (this.f58669P) {
                if (!T()) {
                    return false;
                }
                long j11 = j10 - e11;
                this.f58671R += j11;
                this.f58669P = false;
                M(j10);
                InterfaceC5773z.d dVar2 = this.f58717v;
                if (dVar2 != null && j11 != 0) {
                    dVar2.k();
                }
            }
            if (this.f58719x.f58737c == 0) {
                this.f58664K += byteBuffer.remaining();
            } else {
                this.f58665L += this.f58668O * i10;
            }
            this.f58673T = byteBuffer;
            this.f58674U = i10;
        }
        n0(j10);
        if (!this.f58673T.hasRemaining()) {
            this.f58673T = null;
            this.f58674U = 0;
            return true;
        }
        if (!this.f58696i.l(a0())) {
            return false;
        }
        AbstractC4156x.i("DefaultAudioSink", "Resetting stalled audio track");
        flush();
        return true;
    }

    public void l0(C5753e c5753e) {
        Looper myLooper = Looper.myLooper();
        AbstractC4134a.h(this.f58701k0 == myLooper, "Current looper (" + X(myLooper) + ") is not the playback looper (" + X(this.f58701k0) + ")");
        C5753e c5753e2 = this.f58654A;
        if (c5753e2 == null || c5753e.equals(c5753e2)) {
            return;
        }
        this.f58654A = c5753e;
        InterfaceC5773z.d dVar = this.f58717v;
        if (dVar != null) {
            dVar.j();
        }
    }

    @Override // o1.InterfaceC5773z
    public void m(androidx.media3.common.a aVar, int i10, int[] iArr) {
        int i11;
        int i12;
        int i13;
        boolean z10;
        int i14;
        int i15;
        boolean z11;
        c1.o oVar;
        int i16;
        int i17;
        int a10;
        k0();
        if ("audio/raw".equals(aVar.f20543o)) {
            AbstractC4134a.a(e1.Z.O0(aVar.f20520H));
            i13 = e1.Z.q0(aVar.f20520H, aVar.f20518F);
            AbstractC3445z.a aVar2 = new AbstractC3445z.a();
            aVar2.k(this.f58694h);
            if (x0(aVar.f20520H)) {
                aVar2.a(this.f58692g);
            } else {
                aVar2.a(this.f58690f);
                aVar2.j(this.f58682b.c());
            }
            c1.o oVar2 = new c1.o(aVar2.m());
            if (oVar2.equals(this.f58720y)) {
                oVar2 = this.f58720y;
            }
            this.f58688e.o(aVar.f20521I, aVar.f20522J);
            this.f58686d.m(iArr);
            try {
                p.a a11 = oVar2.a(new p.a(aVar));
                int i18 = a11.f26782c;
                i11 = a11.f26780a;
                int a12 = this.f58714s.a(a11.f26781b);
                int q02 = e1.Z.q0(i18, a11.f26781b);
                i12 = 0;
                i14 = i18;
                i15 = a12;
                z11 = this.f58700k;
                oVar = oVar2;
                i16 = q02;
                z10 = false;
            } catch (p.b e10) {
                throw new InterfaceC5773z.b(e10, aVar);
            }
        } else {
            c1.o oVar3 = new c1.o(AbstractC3445z.t());
            i11 = aVar.f20519G;
            C5759k c10 = this.f58702l != 0 ? c(aVar) : C5759k.f58845d;
            if (this.f58702l == 0 || !c10.f58846a) {
                Pair h10 = this.f58654A.h(aVar, this.f58657D);
                if (h10 == null) {
                    throw new InterfaceC5773z.b("Unable to configure passthrough for: " + aVar, aVar);
                }
                int intValue = ((Integer) h10.first).intValue();
                int intValue2 = ((Integer) h10.second).intValue();
                i12 = 2;
                i13 = -1;
                z10 = false;
                i14 = intValue;
                i15 = intValue2;
                z11 = this.f58700k;
                oVar = oVar3;
            } else {
                int f10 = AbstractC2335D.f((String) AbstractC4134a.e(aVar.f20543o), aVar.f20539k);
                int a13 = this.f58714s.a(aVar.f20518F);
                z10 = c10.f58847b;
                i13 = -1;
                oVar = oVar3;
                i14 = f10;
                i15 = a13;
                z11 = true;
                i12 = 1;
            }
            i16 = i13;
        }
        if (i14 == 0) {
            throw new InterfaceC5773z.b("Invalid output encoding (mode=" + i12 + ") for: " + aVar, aVar);
        }
        if (i15 == 0) {
            throw new InterfaceC5773z.b("Invalid output channel config (mode=" + i12 + ") for: " + aVar, aVar);
        }
        int i19 = aVar.f20538j;
        if ("audio/vnd.dts.hd;profile=lbr".equals(aVar.f20543o) && i19 == -1) {
            i19 = 768000;
        }
        int i20 = i19;
        if (i10 != 0) {
            a10 = i10;
            i17 = i11;
        } else {
            i17 = i11;
            a10 = this.f58710p.a(U(i11, i15, i14), i14, i12, i16 != -1 ? i16 : 1, i17, i20, z11 ? 8.0d : 1.0d);
        }
        this.f58697i0 = false;
        boolean z12 = z10;
        int i21 = i12;
        h hVar = new h(aVar, i13, i21, i16, i17, i15, i14, a10, oVar, z11, z12, this.f58691f0);
        if (f0()) {
            this.f58718w = hVar;
        } else {
            this.f58719x = hVar;
        }
    }

    public final void m0() {
        if (this.f58677X) {
            return;
        }
        this.f58677X = true;
        this.f58696i.h(a0());
        if (g0(this.f58721z)) {
            this.f58678Y = false;
        }
        this.f58721z.stop();
        this.f58663J = 0;
    }

    @Override // o1.InterfaceC5773z
    public void n(C2350d c2350d) {
        if (this.f58657D.equals(c2350d)) {
            return;
        }
        this.f58657D = c2350d;
        if (this.f58691f0) {
            return;
        }
        C5757i c5757i = this.f58655B;
        if (c5757i != null) {
            c5757i.i(c2350d);
        }
        flush();
    }

    public final void n0(long j10) {
        S(j10);
        if (this.f58675V != null) {
            return;
        }
        if (!this.f58720y.g()) {
            ByteBuffer byteBuffer = this.f58673T;
            if (byteBuffer != null) {
                t0(byteBuffer);
                S(j10);
                return;
            }
            return;
        }
        while (!this.f58720y.f()) {
            do {
                ByteBuffer d10 = this.f58720y.d();
                if (d10.hasRemaining()) {
                    t0(d10);
                    S(j10);
                } else {
                    ByteBuffer byteBuffer2 = this.f58673T;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.f58720y.j(this.f58673T);
                    }
                }
            } while (this.f58675V == null);
            return;
        }
    }

    @Override // o1.InterfaceC5773z
    public void o() {
        if (!this.f58676W && f0() && T()) {
            m0();
            this.f58676W = true;
        }
    }

    public final void o0(AudioTrack audioTrack) {
        if (this.f58704m == null) {
            this.f58704m = new o();
        }
        this.f58704m.a(audioTrack);
    }

    @Override // o1.InterfaceC5773z
    public void p(int i10, int i11) {
        h hVar;
        AudioTrack audioTrack = this.f58721z;
        if (audioTrack == null || !g0(audioTrack) || (hVar = this.f58719x) == null || !hVar.f58745k) {
            return;
        }
        this.f58721z.setOffloadDelayPadding(i10, i11);
    }

    @Override // o1.InterfaceC5773z
    public void pause() {
        this.f58679Z = false;
        if (f0()) {
            this.f58696i.r();
            if (!this.f58677X || g0(this.f58721z)) {
                this.f58721z.pause();
            }
        }
    }

    @Override // o1.InterfaceC5773z
    public void play() {
        this.f58679Z = true;
        if (f0()) {
            this.f58696i.x();
            if (!this.f58677X || g0(this.f58721z)) {
                this.f58721z.play();
            }
        }
    }

    @Override // o1.InterfaceC5773z
    public long q(boolean z10) {
        if (!f0() || this.f58670Q) {
            return Long.MIN_VALUE;
        }
        return O(N(Math.min(this.f58696i.c(), this.f58719x.d(a0()))));
    }

    public final void q0() {
        this.f58664K = 0L;
        this.f58665L = 0L;
        this.f58666M = 0L;
        this.f58667N = 0L;
        this.f58699j0 = false;
        this.f58668O = 0;
        this.f58659F = new k(this.f58660G, 0L, 0L);
        this.f58671R = 0L;
        this.f58658E = null;
        this.f58698j.clear();
        this.f58673T = null;
        this.f58674U = 0;
        this.f58675V = null;
        this.f58677X = false;
        this.f58676W = false;
        this.f58678Y = false;
        this.f58662I = null;
        this.f58663J = 0;
        this.f58688e.n();
        v0();
    }

    public final void r0(C2340I c2340i) {
        k kVar = new k(c2340i, -9223372036854775807L, -9223372036854775807L);
        if (f0()) {
            this.f58658E = kVar;
        } else {
            this.f58659F = kVar;
        }
    }

    @Override // o1.InterfaceC5773z
    public void release() {
        C5757i c5757i = this.f58655B;
        if (c5757i != null) {
            c5757i.k();
        }
    }

    @Override // o1.InterfaceC5773z
    public void reset() {
        flush();
        m0 it = this.f58694h.iterator();
        while (it.hasNext()) {
            ((c1.p) it.next()).reset();
        }
        this.f58690f.reset();
        this.f58692g.reset();
        c1.o oVar = this.f58720y;
        if (oVar != null) {
            oVar.k();
        }
        this.f58679Z = false;
        this.f58697i0 = false;
    }

    @Override // o1.InterfaceC5773z
    public void s() {
        this.f58669P = true;
    }

    public final void s0() {
        if (f0()) {
            try {
                this.f58721z.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.f58660G.f24315a).setPitch(this.f58660G.f24316b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e10) {
                AbstractC4156x.j("DefaultAudioSink", "Failed to set playback params", e10);
            }
            C2340I c2340i = new C2340I(this.f58721z.getPlaybackParams().getSpeed(), this.f58721z.getPlaybackParams().getPitch());
            this.f58660G = c2340i;
            this.f58696i.v(c2340i.f24315a);
        }
    }

    @Override // o1.InterfaceC5773z
    public void setPreferredDevice(AudioDeviceInfo audioDeviceInfo) {
        this.f58689e0 = audioDeviceInfo == null ? null : new C5758j(audioDeviceInfo);
        C5757i c5757i = this.f58655B;
        if (c5757i != null) {
            c5757i.j(audioDeviceInfo);
        }
        AudioTrack audioTrack = this.f58721z;
        if (audioTrack != null) {
            b.b(audioTrack, this.f58689e0);
        }
    }

    @Override // o1.InterfaceC5773z
    public void t() {
        AbstractC4134a.g(this.f58681a0);
        if (this.f58691f0) {
            return;
        }
        this.f58691f0 = true;
        flush();
    }

    public final void t0(ByteBuffer byteBuffer) {
        AbstractC4134a.g(this.f58675V == null);
        if (byteBuffer.hasRemaining()) {
            this.f58675V = i0(byteBuffer);
        }
    }

    @Override // o1.InterfaceC5773z
    public int u(androidx.media3.common.a aVar) {
        k0();
        if (!"audio/raw".equals(aVar.f20543o)) {
            return this.f58654A.j(aVar, this.f58657D) ? 2 : 0;
        }
        if (e1.Z.O0(aVar.f20520H)) {
            int i10 = aVar.f20520H;
            return (i10 == 2 || (this.f58684c && i10 == 4)) ? 2 : 1;
        }
        AbstractC4156x.i("DefaultAudioSink", "Invalid PCM encoding: " + aVar.f20520H);
        return 0;
    }

    public final void u0() {
        if (f0()) {
            this.f58721z.setVolume(this.f58672S);
        }
    }

    @Override // o1.InterfaceC5773z
    public void v(C2354h c2354h) {
        if (this.f58687d0.equals(c2354h)) {
            return;
        }
        int i10 = c2354h.f24588a;
        float f10 = c2354h.f24589b;
        AudioTrack audioTrack = this.f58721z;
        if (audioTrack != null) {
            if (this.f58687d0.f24588a != i10) {
                audioTrack.attachAuxEffect(i10);
            }
            if (i10 != 0) {
                this.f58721z.setAuxEffectSendLevel(f10);
            }
        }
        this.f58687d0 = c2354h;
    }

    public final void v0() {
        c1.o oVar = this.f58719x.f58743i;
        this.f58720y = oVar;
        oVar.b();
    }

    @Override // o1.InterfaceC5773z
    public void w(G1 g12) {
        this.f58716u = g12;
    }

    public final boolean w0() {
        if (this.f58691f0) {
            return false;
        }
        h hVar = this.f58719x;
        return hVar.f58737c == 0 && !x0(hVar.f58735a.f20520H);
    }

    @Override // o1.InterfaceC5773z
    public void x(InterfaceC5773z.d dVar) {
        this.f58717v = dVar;
    }

    public final boolean x0(int i10) {
        return this.f58684c && e1.Z.N0(i10);
    }

    @Override // o1.InterfaceC5773z
    public void y(InterfaceC4143j interfaceC4143j) {
        this.f58696i.w(interfaceC4143j);
    }

    public final boolean y0() {
        h hVar = this.f58719x;
        return hVar != null && hVar.f58744j;
    }

    @Override // o1.InterfaceC5773z
    public void z(boolean z10) {
        this.f58661H = z10;
        r0(y0() ? C2340I.f24312d : this.f58660G);
    }

    public P(g gVar) {
        Context applicationContext = gVar.f58724a == null ? null : gVar.f58724a.getApplicationContext();
        this.f58680a = applicationContext;
        this.f58657D = C2350d.f24567h;
        this.f58654A = applicationContext != null ? null : gVar.f58725b;
        this.f58682b = gVar.f58726c;
        this.f58684c = gVar.f58727d;
        int i10 = Build.VERSION.SDK_INT;
        this.f58700k = gVar.f58728e;
        this.f58702l = 0;
        this.f58710p = gVar.f58730g;
        this.f58712q = (d) AbstractC4134a.e(gVar.f58732i);
        this.f58696i = new B(new n());
        C c10 = new C();
        this.f58686d = c10;
        f0 f0Var = new f0();
        this.f58688e = f0Var;
        this.f58690f = new c1.z();
        this.f58692g = new e0();
        this.f58694h = AbstractC3445z.v(f0Var, c10);
        this.f58672S = 1.0f;
        this.f58683b0 = 0;
        this.f58687d0 = new C2354h(0, 0.0f);
        C2340I c2340i = C2340I.f24312d;
        this.f58659F = new k(c2340i, 0L, 0L);
        this.f58660G = c2340i;
        this.f58661H = false;
        this.f58698j = new ArrayDeque();
        this.f58706n = new m();
        this.f58708o = new m();
        this.f58713r = gVar.f58734k;
        this.f58714s = gVar.f58731h;
        this.f58715t = (i10 < 34 || gVar.f58724a == null) ? -1 : V(gVar.f58724a);
        this.f58711p0 = gVar.f58733j;
    }
}
