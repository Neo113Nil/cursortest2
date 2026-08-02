package v3;

import B3.C2571o;
import B90.RunnableC2599a;
import C.C2702w;
import N3.C3651b;
import N3.C3652c;
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
import androidx.media3.exoplayer.j0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.common.collect.AbstractC5880y;
import com.google.common.collect.g0;
import j3.C7263e;
import j3.C7264f;
import j3.C7272n;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import k3.e;
import m3.C8049B;
import m3.InterfaceC8064f;
import u3.P;
import v3.C10201C;
import v3.o;
import v3.w;

/* renamed from: v3.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10201C {

    /* renamed from: n0, reason: collision with root package name */
    private static final Object f101724n0 = new Object();

    /* renamed from: o0, reason: collision with root package name */
    private static ScheduledExecutorService f101725o0;

    /* renamed from: p0, reason: collision with root package name */
    private static int f101726p0;

    /* renamed from: A, reason: collision with root package name */
    private C10207c f101727A;

    /* renamed from: B, reason: collision with root package name */
    private h f101728B;

    /* renamed from: C, reason: collision with root package name */
    private C7263e f101729C;

    /* renamed from: D, reason: collision with root package name */
    private g f101730D;

    /* renamed from: E, reason: collision with root package name */
    private g f101731E;

    /* renamed from: F, reason: collision with root package name */
    private j3.x f101732F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f101733G;

    /* renamed from: H, reason: collision with root package name */
    private long f101734H;

    /* renamed from: I, reason: collision with root package name */
    private long f101735I;

    /* renamed from: J, reason: collision with root package name */
    private long f101736J;

    /* renamed from: K, reason: collision with root package name */
    private long f101737K;

    /* renamed from: L, reason: collision with root package name */
    private int f101738L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f101739M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f101740N;

    /* renamed from: O, reason: collision with root package name */
    private long f101741O;

    /* renamed from: P, reason: collision with root package name */
    private float f101742P;

    /* renamed from: Q, reason: collision with root package name */
    private ByteBuffer f101743Q;

    /* renamed from: R, reason: collision with root package name */
    private int f101744R;

    /* renamed from: S, reason: collision with root package name */
    private ByteBuffer f101745S;

    /* renamed from: T, reason: collision with root package name */
    private boolean f101746T;

    /* renamed from: U, reason: collision with root package name */
    private boolean f101747U;

    /* renamed from: V, reason: collision with root package name */
    private boolean f101748V;

    /* renamed from: W, reason: collision with root package name */
    private boolean f101749W;

    /* renamed from: X, reason: collision with root package name */
    private boolean f101750X;

    /* renamed from: Y, reason: collision with root package name */
    private int f101751Y;

    /* renamed from: Z, reason: collision with root package name */
    private boolean f101752Z;

    /* renamed from: a, reason: collision with root package name */
    private final Context f101753a;

    /* renamed from: a0, reason: collision with root package name */
    private C7264f f101754a0;

    /* renamed from: b, reason: collision with root package name */
    private final k3.f f101755b;

    /* renamed from: b0, reason: collision with root package name */
    private C10208d f101756b0;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f101757c;

    /* renamed from: c0, reason: collision with root package name */
    private boolean f101758c0;

    /* renamed from: d, reason: collision with root package name */
    private final x f101759d;

    /* renamed from: d0, reason: collision with root package name */
    private long f101760d0;

    /* renamed from: e, reason: collision with root package name */
    private final N f101761e;

    /* renamed from: e0, reason: collision with root package name */
    private long f101762e0;

    /* renamed from: f, reason: collision with root package name */
    private final k3.j f101763f;

    /* renamed from: f0, reason: collision with root package name */
    private boolean f101764f0;

    /* renamed from: g, reason: collision with root package name */
    private final M f101765g;

    /* renamed from: g0, reason: collision with root package name */
    private boolean f101766g0;

    /* renamed from: h, reason: collision with root package name */
    private final AbstractC5880y<k3.e> f101767h;

    /* renamed from: h0, reason: collision with root package name */
    private Looper f101768h0;

    /* renamed from: i, reason: collision with root package name */
    private final w f101769i;

    /* renamed from: i0, reason: collision with root package name */
    private long f101770i0;

    /* renamed from: j, reason: collision with root package name */
    private final ArrayDeque<g> f101771j;

    /* renamed from: j0, reason: collision with root package name */
    private long f101772j0;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f101773k;

    /* renamed from: k0, reason: collision with root package name */
    private Handler f101774k0;

    /* renamed from: l, reason: collision with root package name */
    private int f101775l;

    /* renamed from: l0, reason: collision with root package name */
    private Context f101776l0;

    /* renamed from: m, reason: collision with root package name */
    private k f101777m;

    /* renamed from: m0, reason: collision with root package name */
    private boolean f101778m0;

    /* renamed from: n, reason: collision with root package name */
    private final i<r> f101779n;

    /* renamed from: o, reason: collision with root package name */
    private final i<u> f101780o;

    /* renamed from: p, reason: collision with root package name */
    private final G f101781p;

    /* renamed from: q, reason: collision with root package name */
    private final a f101782q;

    /* renamed from: r, reason: collision with root package name */
    private final I f101783r;

    /* renamed from: s, reason: collision with root package name */
    private final int f101784s;

    /* renamed from: t, reason: collision with root package name */
    private P f101785t;

    /* renamed from: u, reason: collision with root package name */
    private s f101786u;

    /* renamed from: v, reason: collision with root package name */
    private e f101787v;

    /* renamed from: w, reason: collision with root package name */
    private e f101788w;

    /* renamed from: x, reason: collision with root package name */
    private k3.d f101789x;

    /* renamed from: y, reason: collision with root package name */
    private AudioTrack f101790y;

    /* renamed from: z, reason: collision with root package name */
    private C10205a f101791z;

    /* renamed from: v3.C$a */
    public interface a {
        C10209e a(C7263e c7263e, C7272n c7272n);
    }

    /* renamed from: v3.C$b */
    public interface b {

        /* renamed from: a, reason: collision with root package name */
        public static final G f101792a = new G();
    }

    /* renamed from: v3.C$c */
    public interface c {

        /* renamed from: a, reason: collision with root package name */
        public static final I f101793a = new I();
    }

    /* renamed from: v3.C$d */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final Context f101794a;

        /* renamed from: c, reason: collision with root package name */
        private f f101796c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f101797d;

        /* renamed from: g, reason: collision with root package name */
        private y f101800g;

        /* renamed from: b, reason: collision with root package name */
        private C10205a f101795b = C10205a.f101875c;

        /* renamed from: e, reason: collision with root package name */
        private G f101798e = b.f101792a;

        /* renamed from: f, reason: collision with root package name */
        private I f101799f = c.f101793a;

        public d(Context context) {
            this.f101794a = context;
        }

        public final C10201C g() {
            G10.a.h(!this.f101797d);
            this.f101797d = true;
            if (this.f101796c == null) {
                this.f101796c = new f(new k3.e[0]);
            }
            if (this.f101800g == null) {
                this.f101800g = new y(this.f101794a);
            }
            return new C10201C(this);
        }
    }

    /* renamed from: v3.C$e */
    private static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final C7272n f101801a;

        /* renamed from: b, reason: collision with root package name */
        public final int f101802b;

        /* renamed from: c, reason: collision with root package name */
        public final int f101803c;

        /* renamed from: d, reason: collision with root package name */
        public final int f101804d;

        /* renamed from: e, reason: collision with root package name */
        public final int f101805e;

        /* renamed from: f, reason: collision with root package name */
        public final int f101806f;

        /* renamed from: g, reason: collision with root package name */
        public final int f101807g;

        /* renamed from: h, reason: collision with root package name */
        public final int f101808h;

        /* renamed from: i, reason: collision with root package name */
        public final k3.d f101809i;

        /* renamed from: j, reason: collision with root package name */
        public final boolean f101810j;

        /* renamed from: k, reason: collision with root package name */
        public final boolean f101811k;

        /* renamed from: l, reason: collision with root package name */
        public final boolean f101812l;

        public e(C7272n c7272n, int i11, int i12, int i13, int i14, int i15, int i16, int i17, k3.d dVar, boolean z11, boolean z12, boolean z13) {
            this.f101801a = c7272n;
            this.f101802b = i11;
            this.f101803c = i12;
            this.f101804d = i13;
            this.f101805e = i14;
            this.f101806f = i15;
            this.f101807g = i16;
            this.f101808h = i17;
            this.f101809i = dVar;
            this.f101810j = z11;
            this.f101811k = z12;
            this.f101812l = z13;
        }

        public final p a() {
            return new p(this.f101807g, this.f101805e, this.f101806f, this.f101808h, this.f101812l, this.f101803c == 1);
        }
    }

    /* renamed from: v3.C$f */
    public static class f implements k3.f {

        /* renamed from: a, reason: collision with root package name */
        private final k3.e[] f101813a;

        /* renamed from: b, reason: collision with root package name */
        private final L f101814b;

        /* renamed from: c, reason: collision with root package name */
        private final k3.i f101815c;

        public f(k3.e... eVarArr) {
            L l11 = new L();
            k3.i iVar = new k3.i();
            k3.e[] eVarArr2 = new k3.e[eVarArr.length + 2];
            this.f101813a = eVarArr2;
            System.arraycopy(eVarArr, 0, eVarArr2, 0, eVarArr.length);
            this.f101814b = l11;
            this.f101815c = iVar;
            eVarArr2[eVarArr.length] = l11;
            eVarArr2[eVarArr.length + 1] = iVar;
        }

        public final j3.x a(j3.x xVar) {
            float f7 = xVar.f69345a;
            k3.i iVar = this.f101815c;
            iVar.h(f7);
            iVar.g(xVar.f69346b);
            return xVar;
        }

        public final boolean b(boolean z11) {
            this.f101814b.p(z11);
            return z11;
        }

        public final k3.e[] c() {
            return this.f101813a;
        }

        public final long d(long j11) {
            k3.i iVar = this.f101815c;
            return iVar.isActive() ? iVar.f(j11) : j11;
        }

        public final long e() {
            return this.f101814b.m();
        }
    }

    /* renamed from: v3.C$g */
    private static final class g {

        /* renamed from: a, reason: collision with root package name */
        public final j3.x f101816a;

        /* renamed from: b, reason: collision with root package name */
        public final long f101817b;

        /* renamed from: c, reason: collision with root package name */
        public final long f101818c;

        /* renamed from: d, reason: collision with root package name */
        public long f101819d;

        g(j3.x xVar, long j11, long j12) {
            this.f101816a = xVar;
            this.f101817b = j11;
            this.f101818c = j12;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v3.C$h */
    static final class h {

        /* renamed from: a, reason: collision with root package name */
        private final AudioTrack f101820a;

        /* renamed from: b, reason: collision with root package name */
        private final C10207c f101821b;

        /* renamed from: c, reason: collision with root package name */
        private C10202D f101822c = new AudioRouting.OnRoutingChangedListener() { // from class: v3.D
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final void onRoutingChanged(AudioRouting audioRouting) {
                C10201C.h.a(C10201C.h.this, audioRouting);
            }
        };

        /* JADX WARN: Type inference failed for: r3v1, types: [v3.D] */
        public h(AudioTrack audioTrack, C10207c c10207c) {
            this.f101820a = audioTrack;
            this.f101821b = c10207c;
            audioTrack.addOnRoutingChangedListener(this.f101822c, new Handler(Looper.myLooper()));
        }

        public static void a(h hVar, AudioRouting audioRouting) {
            AudioDeviceInfo routedDevice;
            if (hVar.f101822c == null || (routedDevice = audioRouting.getRoutedDevice()) == null) {
                return;
            }
            hVar.f101821b.j(routedDevice);
        }

        public final void b() {
            C10202D c10202d = this.f101822c;
            c10202d.getClass();
            this.f101820a.removeOnRoutingChangedListener(c10202d);
            this.f101822c = null;
        }
    }

    /* renamed from: v3.C$i */
    private static final class i<T extends Exception> {

        /* renamed from: a, reason: collision with root package name */
        private T f101823a;

        /* renamed from: b, reason: collision with root package name */
        private long f101824b = -9223372036854775807L;

        /* renamed from: c, reason: collision with root package name */
        private long f101825c = -9223372036854775807L;

        public final void a() {
            this.f101823a = null;
            this.f101824b = -9223372036854775807L;
            this.f101825c = -9223372036854775807L;
        }

        public final boolean b() {
            if (this.f101823a == null) {
                return false;
            }
            return C10201C.j() || SystemClock.elapsedRealtime() < this.f101825c;
        }

        public final void c(T t2) throws Exception {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f101823a == null) {
                this.f101823a = t2;
            }
            if (this.f101824b == -9223372036854775807L && !C10201C.j()) {
                this.f101824b = 200 + elapsedRealtime;
            }
            long j11 = this.f101824b;
            if (j11 == -9223372036854775807L || elapsedRealtime < j11) {
                this.f101825c = elapsedRealtime + 50;
                return;
            }
            T t11 = this.f101823a;
            if (t11 != t2) {
                t11.addSuppressed(t2);
            }
            T t12 = this.f101823a;
            a();
            throw t12;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v3.C$j */
    final class j implements w.a {
        j() {
        }

        public final void a(long j11) {
            o.a aVar;
            C10201C c10201c = C10201C.this;
            if (c10201c.f101786u != null) {
                aVar = J.this.f101833a1;
                aVar.x(j11);
            }
        }
    }

    /* renamed from: v3.C$k */
    private final class k {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f101827a = new Handler(Looper.myLooper());

        /* renamed from: b, reason: collision with root package name */
        private final AudioTrack$StreamEventCallback f101828b = new a();

        /* renamed from: v3.C$k$a */
        /* loaded from: classes8.dex */
        final class a extends AudioTrack$StreamEventCallback {
            a() {
            }

            /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
            
                r1 = v3.J.this.z0();
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void onDataRequest(AudioTrack audioTrack, int i11) {
                j0.a z02;
                if (audioTrack.equals(C10201C.this.f101790y) && C10201C.this.f101786u != null && C10201C.this.f101749W && z02 != null) {
                    z02.b();
                }
            }

            public final void onPresentationEnded(AudioTrack audioTrack) {
                if (audioTrack.equals(C10201C.this.f101790y)) {
                    C10201C.this.f101748V = true;
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
            
                r2 = v3.J.this.z0();
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void onTearDown(AudioTrack audioTrack) {
                j0.a z02;
                if (audioTrack.equals(C10201C.this.f101790y) && C10201C.this.f101786u != null && C10201C.this.f101749W && z02 != null) {
                    z02.b();
                }
            }
        }

        public k() {
        }

        public final void a(AudioTrack audioTrack) {
            Handler handler = this.f101827a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new ExecutorC10204F(handler), this.f101828b);
        }

        public final void b(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.f101828b);
            this.f101827a.removeCallbacksAndMessages(null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00b4, code lost:
    
        r10 = r10.f101794a.getDeviceId();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    C10201C(d dVar) {
        int deviceId;
        Context applicationContext = dVar.f101794a == null ? null : dVar.f101794a.getApplicationContext();
        this.f101753a = applicationContext;
        this.f101729C = C7263e.f69057b;
        this.f101791z = applicationContext == null ? dVar.f101795b : null;
        this.f101755b = dVar.f101796c;
        this.f101757c = false;
        int i11 = Build.VERSION.SDK_INT;
        this.f101773k = false;
        this.f101775l = 0;
        this.f101781p = dVar.f101798e;
        a aVar = dVar.f101800g;
        aVar.getClass();
        this.f101782q = aVar;
        this.f101769i = new w(new j());
        x xVar = new x();
        this.f101759d = xVar;
        N n11 = new N();
        this.f101761e = n11;
        this.f101763f = new k3.j();
        this.f101765g = new M();
        this.f101767h = AbstractC5880y.C(n11, xVar);
        this.f101742P = 1.0f;
        this.f101751Y = 0;
        this.f101754a0 = new C7264f();
        j3.x xVar2 = j3.x.f69344d;
        this.f101731E = new g(xVar2, 0L, 0L);
        this.f101732F = xVar2;
        this.f101733G = false;
        this.f101771j = new ArrayDeque<>();
        this.f101779n = new i<>();
        this.f101780o = new i<>();
        this.f101783r = dVar.f101799f;
        int i12 = -1;
        if (i11 >= 34 && dVar.f101794a != null && deviceId != 0 && deviceId != -1) {
            i12 = deviceId;
        }
        this.f101784s = i12;
        this.f101778m0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean C() throws r {
        AudioTrack m11;
        o.a aVar;
        o.a aVar2;
        C2571o c2571o;
        C2571o c2571o2;
        P p11;
        boolean equals;
        LogSessionId unused;
        if (this.f101779n.b()) {
            return false;
        }
        try {
            e eVar = this.f101788w;
            eVar.getClass();
            m11 = m(eVar);
        } catch (r e11) {
            e eVar2 = this.f101788w;
            if (eVar2.f101808h > 1000000) {
                e eVar3 = new e(eVar2.f101801a, eVar2.f101802b, eVar2.f101803c, eVar2.f101804d, eVar2.f101805e, eVar2.f101806f, eVar2.f101807g, 1000000, eVar2.f101809i, eVar2.f101810j, eVar2.f101811k, eVar2.f101812l);
                try {
                    m11 = m(eVar3);
                    this.f101788w = eVar3;
                } catch (r e12) {
                    e11.addSuppressed(e12);
                    if (this.f101788w.f101803c == 1) {
                        throw e11;
                    }
                    this.f101764f0 = true;
                    throw e11;
                }
            }
            if (this.f101788w.f101803c == 1) {
            }
        }
        this.f101790y = m11;
        if (F(m11)) {
            AudioTrack audioTrack = this.f101790y;
            if (this.f101777m == null) {
                this.f101777m = new k();
            }
            this.f101777m.a(audioTrack);
            e eVar4 = this.f101788w;
            if (eVar4.f101811k) {
                AudioTrack audioTrack2 = this.f101790y;
                C7272n c7272n = eVar4.f101801a;
                audioTrack2.setOffloadDelayPadding(c7272n.f69105J, c7272n.f69106K);
            }
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31 && (p11 = this.f101785t) != null) {
            AudioTrack audioTrack3 = this.f101790y;
            LogSessionId a11 = p11.a();
            unused = LogSessionId.LOG_SESSION_ID_NONE;
            equals = a11.equals(LogSessionId.LOG_SESSION_ID_NONE);
            if (!equals) {
                audioTrack3.setLogSessionId(a11);
            }
        }
        AudioTrack audioTrack4 = this.f101790y;
        e eVar5 = this.f101788w;
        int i12 = eVar5.f101803c;
        this.f101769i.o(audioTrack4, eVar5.f101807g, eVar5.f101804d, eVar5.f101808h, this.f101778m0);
        if (D()) {
            this.f101790y.setVolume(this.f101742P);
        }
        this.f101754a0.getClass();
        C10208d c10208d = this.f101756b0;
        if (c10208d != null) {
            this.f101790y.setPreferredDevice(c10208d.f101899a);
            C10207c c10207c = this.f101727A;
            if (c10207c != null) {
                c10207c.j(this.f101756b0.f101899a);
            }
        }
        C10207c c10207c2 = this.f101727A;
        if (c10207c2 != null) {
            this.f101728B = new h(this.f101790y, c10207c2);
        }
        this.f101740N = true;
        int audioSessionId = this.f101790y.getAudioSessionId();
        boolean z11 = audioSessionId != this.f101751Y;
        this.f101751Y = audioSessionId;
        s sVar = this.f101786u;
        if (sVar != null) {
            p a12 = this.f101788w.a();
            aVar = J.this.f101833a1;
            aVar.q(a12);
            if (z11) {
                this.f101752Z = true;
                s sVar2 = this.f101786u;
                int i13 = this.f101751Y;
                J j11 = J.this;
                if (i11 >= 35) {
                    c2571o = j11.f101835c1;
                    if (c2571o != null) {
                        c2571o2 = j11.f101835c1;
                        c2571o2.e(i13);
                    }
                }
                aVar2 = j11.f101833a1;
                aVar2.o(i13);
            }
        }
        return true;
    }

    private boolean D() {
        return this.f101790y != null;
    }

    private static boolean F(AudioTrack audioTrack) {
        boolean isOffloadedPlayback;
        if (Build.VERSION.SDK_INT < 29) {
            return false;
        }
        isOffloadedPlayback = audioTrack.isOffloadedPlayback();
        return isOffloadedPlayback;
    }

    private void G() {
        Context context;
        Looper myLooper = Looper.myLooper();
        boolean z11 = this.f101727A == null || this.f101768h0 == myLooper;
        StringBuilder sb2 = new StringBuilder("DefaultAudioSink accessed on multiple threads: ");
        Looper looper = this.f101768h0;
        sb2.append(looper == null ? "null" : looper.getThread().getName());
        sb2.append(" and ");
        sb2.append(myLooper != null ? myLooper.getThread().getName() : "null");
        G10.a.g(sb2.toString(), z11);
        if (this.f101727A == null && (context = this.f101753a) != null) {
            this.f101768h0 = myLooper;
            C10207c c10207c = new C10207c(context, new com.appsflyer.internal.c(this), this.f101729C, this.f101756b0);
            this.f101727A = c10207c;
            this.f101791z = c10207c.h();
        }
        this.f101791z.getClass();
    }

    private void K() {
        if (this.f101747U) {
            return;
        }
        this.f101747U = true;
        this.f101769i.f(y());
        if (F(this.f101790y)) {
            this.f101748V = false;
        }
        this.f101790y.stop();
    }

    private void M(long j11) throws u {
        p(j11);
        if (this.f101745S != null) {
            return;
        }
        if (!this.f101789x.f()) {
            ByteBuffer byteBuffer = this.f101743Q;
            if (byteBuffer != null) {
                X(byteBuffer);
                p(j11);
                return;
            }
            return;
        }
        while (!this.f101789x.e()) {
            do {
                ByteBuffer d11 = this.f101789x.d();
                if (d11.hasRemaining()) {
                    X(d11);
                    p(j11);
                } else {
                    ByteBuffer byteBuffer2 = this.f101743Q;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.f101789x.i(this.f101743Q);
                    }
                }
            } while (this.f101745S == null);
            return;
        }
    }

    private void R() {
        if (D()) {
            try {
                this.f101790y.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.f101732F.f69345a).setPitch(this.f101732F.f69346b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e11) {
                m3.s.g("DefaultAudioSink", "Failed to set playback params", e11);
            }
            j3.x xVar = new j3.x(this.f101790y.getPlaybackParams().getSpeed(), this.f101790y.getPlaybackParams().getPitch());
            this.f101732F = xVar;
            this.f101769i.p(xVar.f69345a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01ec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0055 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void X(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        int i11;
        byte b11;
        int i12;
        int i13;
        G10.a.h(this.f101745S == null);
        if (byteBuffer.hasRemaining()) {
            if (this.f101788w.f101803c == 0) {
                int Z11 = (int) m3.N.Z(m3.N.Q(20L), this.f101788w.f101805e, 1000000L, RoundingMode.UP);
                long y11 = y();
                long j11 = Z11;
                if (y11 < j11) {
                    e eVar = this.f101788w;
                    int i14 = eVar.f101807g;
                    int i15 = (int) y11;
                    byteBuffer2 = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
                    int position = byteBuffer.position();
                    while (byteBuffer.hasRemaining() && i15 < Z11) {
                        if (i14 != 2) {
                            if (i14 == 3) {
                                i13 = (byteBuffer.get() & 255) << 24;
                            } else if (i14 == 4) {
                                float h11 = m3.N.h(byteBuffer.getFloat(), -1.0f, 1.0f);
                                i13 = (int) (h11 < 0.0f ? (-h11) * (-2.1474836E9f) : h11 * 2.1474836E9f);
                            } else if (i14 == 21) {
                                i11 = ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
                                b11 = byteBuffer.get();
                            } else if (i14 != 22) {
                                if (i14 == 268435456) {
                                    i11 = (byteBuffer.get() & 255) << 24;
                                    i12 = (byteBuffer.get() & 255) << 16;
                                } else if (i14 == 1342177280) {
                                    i11 = ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16);
                                    i12 = (byteBuffer.get() & 255) << 8;
                                } else {
                                    if (i14 != 1610612736) {
                                        throw new IllegalStateException();
                                    }
                                    i11 = ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) << 8);
                                    i12 = byteBuffer.get() & 255;
                                }
                                i13 = i11 | i12;
                            } else {
                                i11 = (byteBuffer.get() & 255) | ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
                                b11 = byteBuffer.get();
                            }
                            int i16 = (int) ((i13 * i15) / j11);
                            if (i14 != 2) {
                                byteBuffer2.put((byte) (i16 >> 16));
                                byteBuffer2.put((byte) (i16 >> 24));
                            } else if (i14 == 3) {
                                byteBuffer2.put((byte) (i16 >> 24));
                            } else if (i14 != 4) {
                                if (i14 == 21) {
                                    byteBuffer2.put((byte) (i16 >> 8));
                                    byteBuffer2.put((byte) (i16 >> 16));
                                    byteBuffer2.put((byte) (i16 >> 24));
                                } else if (i14 == 22) {
                                    byteBuffer2.put((byte) i16);
                                    byteBuffer2.put((byte) (i16 >> 8));
                                    byteBuffer2.put((byte) (i16 >> 16));
                                    byteBuffer2.put((byte) (i16 >> 24));
                                } else if (i14 == 268435456) {
                                    byteBuffer2.put((byte) (i16 >> 24));
                                    byteBuffer2.put((byte) (i16 >> 16));
                                } else if (i14 == 1342177280) {
                                    byteBuffer2.put((byte) (i16 >> 24));
                                    byteBuffer2.put((byte) (i16 >> 16));
                                    byteBuffer2.put((byte) (i16 >> 8));
                                } else {
                                    if (i14 != 1610612736) {
                                        throw new IllegalStateException();
                                    }
                                    byteBuffer2.put((byte) (i16 >> 24));
                                    byteBuffer2.put((byte) (i16 >> 16));
                                    byteBuffer2.put((byte) (i16 >> 8));
                                    byteBuffer2.put((byte) i16);
                                }
                            } else if (i16 < 0) {
                                byteBuffer2.putFloat((-i16) / (-2.1474836E9f));
                            } else {
                                byteBuffer2.putFloat(i16 / 2.1474836E9f);
                            }
                            if (byteBuffer.position() != eVar.f101804d + position) {
                                i15++;
                                position = byteBuffer.position();
                            }
                        } else {
                            i11 = (byteBuffer.get() & 255) << 16;
                            b11 = byteBuffer.get();
                        }
                        i12 = (b11 & 255) << 24;
                        i13 = i11 | i12;
                        int i162 = (int) ((i13 * i15) / j11);
                        if (i14 != 2) {
                        }
                        if (byteBuffer.position() != eVar.f101804d + position) {
                        }
                    }
                    byteBuffer2.put(byteBuffer);
                    byteBuffer2.flip();
                    this.f101745S = byteBuffer2;
                }
            }
            byteBuffer2 = byteBuffer;
            this.f101745S = byteBuffer2;
        }
    }

    public static void a(C10201C c10201c) {
        if (c10201c.f101772j0 >= 300000) {
            J.this.f101843k1 = true;
            c10201c.f101772j0 = 0L;
        }
    }

    public static /* synthetic */ void b(AudioTrack audioTrack, final s sVar, Handler handler, final p pVar) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (sVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: v3.B
                    @Override // java.lang.Runnable
                    public final void run() {
                        o.a aVar;
                        s sVar2 = s.this;
                        p pVar2 = pVar;
                        aVar = J.this.f101833a1;
                        aVar.r(pVar2);
                    }
                });
            }
            synchronized (f101724n0) {
                try {
                    int i11 = f101726p0 - 1;
                    f101726p0 = i11;
                    if (i11 == 0) {
                        f101725o0.shutdown();
                        f101725o0 = null;
                    }
                } finally {
                }
            }
        } catch (Throwable th2) {
            if (sVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: v3.B
                    @Override // java.lang.Runnable
                    public final void run() {
                        o.a aVar;
                        s sVar2 = s.this;
                        p pVar2 = pVar;
                        aVar = J.this.f101833a1;
                        aVar.r(pVar2);
                    }
                });
            }
            synchronized (f101724n0) {
                try {
                    int i12 = f101726p0 - 1;
                    f101726p0 = i12;
                    if (i12 == 0) {
                        f101725o0.shutdown();
                        f101725o0 = null;
                    }
                    throw th2;
                } finally {
                }
            }
        }
    }

    static long g(C10201C c10201c) {
        return c10201c.f101788w.f101803c == 0 ? c10201c.f101734H / r0.f101802b : c10201c.f101735I;
    }

    static boolean j() {
        boolean z11;
        synchronized (f101724n0) {
            z11 = f101726p0 > 0;
        }
        return z11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        if (r1 != 4) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0064, code lost:
    
        if (r1 != 4) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void k(long j11) {
        j3.x xVar;
        o.a aVar;
        e eVar = this.f101788w;
        boolean z11 = false;
        boolean z12 = eVar != null && eVar.f101810j;
        boolean z13 = this.f101757c;
        k3.f fVar = this.f101755b;
        if (z12) {
            xVar = j3.x.f69344d;
        } else {
            if (!this.f101758c0 && eVar.f101803c == 0) {
                int i11 = eVar.f101801a.f69104I;
                if (z13) {
                    int i12 = m3.N.f74289a;
                    if (i11 != 21) {
                        if (i11 != 1342177280) {
                            if (i11 != 22) {
                                if (i11 != 1610612736) {
                                }
                            }
                        }
                    }
                }
                xVar = this.f101732F;
                ((f) fVar).a(xVar);
                this.f101732F = xVar;
            }
            xVar = j3.x.f69344d;
            this.f101732F = xVar;
        }
        j3.x xVar2 = xVar;
        if (!this.f101758c0) {
            e eVar2 = this.f101788w;
            if (eVar2.f101803c == 0) {
                int i13 = eVar2.f101801a.f69104I;
                if (z13) {
                    int i14 = m3.N.f74289a;
                    if (i13 != 21) {
                        if (i13 != 1342177280) {
                            if (i13 != 22) {
                                if (i13 != 1610612736) {
                                }
                            }
                        }
                    }
                }
                z11 = this.f101733G;
                ((f) fVar).b(z11);
            }
        }
        this.f101733G = z11;
        this.f101771j.add(new g(xVar2, Math.max(0L, j11), m3.N.X(this.f101788w.f101805e, y())));
        k3.d dVar = this.f101788w.f101809i;
        this.f101789x = dVar;
        dVar.b();
        s sVar = this.f101786u;
        if (sVar != null) {
            boolean z14 = this.f101733G;
            aVar = J.this.f101833a1;
            aVar.y(z14);
        }
    }

    private AudioTrack l(p pVar, C7263e c7263e, int i11, C7272n c7272n, Context context) throws r {
        try {
            try {
                AudioTrack a11 = this.f101783r.a(pVar, c7263e, i11, context);
                int state = a11.getState();
                if (state == 1) {
                    return a11;
                }
                try {
                    a11.release();
                } catch (Exception unused) {
                }
                throw new r(state, pVar.f101933b, pVar.f101934c, pVar.f101932a, pVar.f101937f, c7272n, pVar.f101936e, null);
            } catch (IllegalArgumentException e11) {
                e = e11;
                RuntimeException runtimeException = e;
                throw new r(0, pVar.f101933b, pVar.f101934c, pVar.f101932a, pVar.f101937f, c7272n, pVar.f101936e, runtimeException);
            } catch (UnsupportedOperationException e12) {
                e = e12;
                RuntimeException runtimeException2 = e;
                throw new r(0, pVar.f101933b, pVar.f101934c, pVar.f101932a, pVar.f101937f, c7272n, pVar.f101936e, runtimeException2);
            }
        } catch (IllegalArgumentException e13) {
            e = e13;
        } catch (UnsupportedOperationException e14) {
            e = e14;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private AudioTrack m(e eVar) throws r {
        C10201C c10201c;
        r rVar;
        s sVar;
        o.a aVar;
        int i11;
        int i12;
        Context context;
        int i13;
        Context createDeviceContext;
        try {
            i11 = this.f101751Y;
            i12 = this.f101784s;
        } catch (r e11) {
            e = e11;
            c10201c = this;
        }
        try {
            if (i12 != -1) {
                try {
                    Context context2 = this.f101753a;
                    if (context2 != null && Build.VERSION.SDK_INT >= 34) {
                        if (this.f101776l0 == null) {
                            createDeviceContext = context2.createDeviceContext(i12);
                            this.f101776l0 = createDeviceContext;
                        }
                        context = this.f101776l0;
                        i13 = 0;
                        c10201c = this;
                        return c10201c.l(eVar.a(), this.f101729C, i13, eVar.f101801a, context);
                    }
                } catch (r e12) {
                    rVar = e12;
                    c10201c = this;
                    sVar = c10201c.f101786u;
                    if (sVar != null) {
                        throw rVar;
                    }
                    m3.s.d("MediaCodecAudioRenderer", "Audio sink error", rVar);
                    aVar = J.this.f101833a1;
                    aVar.p(rVar);
                    throw rVar;
                }
            }
            return c10201c.l(eVar.a(), this.f101729C, i13, eVar.f101801a, context);
        } catch (r e13) {
            e = e13;
            rVar = e;
            sVar = c10201c.f101786u;
            if (sVar != null) {
            }
        }
        i13 = i11;
        context = null;
        c10201c = this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00cf, code lost:
    
        r12 = v3.J.this.z0();
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void p(long j11) throws u {
        int write;
        j0.a z02;
        u uVar;
        s sVar;
        o.a aVar;
        if (this.f101745S == null) {
            return;
        }
        i<u> iVar = this.f101780o;
        if (iVar.b()) {
            return;
        }
        int remaining = this.f101745S.remaining();
        if (this.f101758c0) {
            G10.a.h(j11 != -9223372036854775807L);
            if (j11 == Long.MIN_VALUE) {
                j11 = this.f101760d0;
            } else {
                this.f101760d0 = j11;
            }
            write = this.f101790y.write(this.f101745S, remaining, 1, j11 * 1000);
        } else {
            write = this.f101790y.write(this.f101745S, remaining, 1);
        }
        this.f101762e0 = SystemClock.elapsedRealtime();
        if (write >= 0) {
            iVar.a();
            if (F(this.f101790y)) {
                if (this.f101737K > 0) {
                    this.f101766g0 = false;
                }
                if (this.f101749W && (r12 = this.f101786u) != null && write < remaining && !this.f101766g0 && z02 != null) {
                    z02.a();
                }
            }
            int i11 = this.f101788w.f101803c;
            if (i11 == 0) {
                this.f101736J += write;
            }
            if (write == remaining) {
                if (i11 != 0) {
                    G10.a.h(this.f101745S == this.f101743Q);
                    this.f101737K = (this.f101738L * this.f101744R) + this.f101737K;
                }
                this.f101745S = null;
                return;
            }
            return;
        }
        if (write == -6 || write == -32) {
            if (y() <= 0) {
                if (F(this.f101790y)) {
                    if (this.f101788w.f101803c == 1) {
                        this.f101764f0 = true;
                    }
                }
            }
            uVar = new u(write, this.f101788w.f101801a, r8);
            sVar = this.f101786u;
            if (sVar != null) {
                m3.s.d("MediaCodecAudioRenderer", "Audio sink error", uVar);
                aVar = J.this.f101833a1;
                aVar.p(uVar);
            }
            if (uVar.f101942b || this.f101753a == null) {
                iVar.c(uVar);
            }
            C10205a c10205a = C10205a.f101875c;
            this.f101791z = c10205a;
            this.f101727A.g(c10205a);
            throw uVar;
        }
        r8 = false;
        uVar = new u(write, this.f101788w.f101801a, r8);
        sVar = this.f101786u;
        if (sVar != null) {
        }
        if (uVar.f101942b) {
        }
        iVar.c(uVar);
    }

    private boolean q() throws u {
        if (!this.f101789x.f()) {
            p(Long.MIN_VALUE);
            return this.f101745S == null;
        }
        this.f101789x.h();
        M(Long.MIN_VALUE);
        if (!this.f101789x.e()) {
            return false;
        }
        ByteBuffer byteBuffer = this.f101745S;
        return byteBuffer == null || !byteBuffer.hasRemaining();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long y() {
        e eVar = this.f101788w;
        if (eVar.f101803c != 0) {
            return this.f101737K;
        }
        long j11 = this.f101736J;
        long j12 = eVar.f101804d;
        int i11 = m3.N.f74289a;
        return ((j11 + j12) - 1) / j12;
    }

    public final void A() {
        this.f101739M = true;
    }

    public final boolean B() {
        boolean isOffloadedPlayback;
        if (!D()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            isOffloadedPlayback = this.f101790y.isOffloadedPlayback();
            if (isOffloadedPlayback && this.f101748V) {
                return false;
            }
        }
        return this.f101769i.g(y());
    }

    public final boolean E() {
        if (D()) {
            return this.f101746T && !B();
        }
        return true;
    }

    public final void H(C10205a c10205a) {
        Looper myLooper = Looper.myLooper();
        boolean z11 = this.f101768h0 == myLooper;
        StringBuilder sb2 = new StringBuilder("Current looper (");
        sb2.append(myLooper == null ? "null" : myLooper.getThread().getName());
        sb2.append(") is not the playback looper (");
        Looper looper = this.f101768h0;
        sb2.append(looper != null ? looper.getThread().getName() : "null");
        sb2.append(")");
        G10.a.g(sb2.toString(), z11);
        C10205a c10205a2 = this.f101791z;
        if (c10205a2 == null || c10205a.equals(c10205a2)) {
            return;
        }
        this.f101791z = c10205a;
        s sVar = this.f101786u;
        if (sVar != null) {
            J.this.S();
        }
    }

    public final void I() {
        this.f101749W = false;
        if (D()) {
            this.f101769i.l();
            if (!this.f101747U || F(this.f101790y)) {
                this.f101790y.pause();
            }
        }
    }

    public final void J() {
        this.f101749W = true;
        if (D()) {
            this.f101769i.r();
            if (!this.f101747U || F(this.f101790y)) {
                this.f101790y.play();
            }
        }
    }

    public final void L() throws u {
        if (!this.f101746T && D() && q()) {
            K();
            this.f101746T = true;
        }
    }

    public final void N() {
        C10207c c10207c = this.f101727A;
        if (c10207c != null) {
            c10207c.k();
        }
    }

    public final void O() {
        s();
        g0<k3.e> listIterator = this.f101767h.listIterator(0);
        while (listIterator.hasNext()) {
            listIterator.next().reset();
        }
        this.f101763f.reset();
        this.f101765g.reset();
        k3.d dVar = this.f101789x;
        if (dVar != null) {
            dVar.j();
        }
        this.f101749W = false;
        this.f101764f0 = false;
    }

    public final void P(C7263e c7263e) {
        if (this.f101729C.equals(c7263e)) {
            return;
        }
        this.f101729C = c7263e;
        if (this.f101758c0) {
            return;
        }
        C10207c c10207c = this.f101727A;
        if (c10207c != null) {
            c10207c.i(c7263e);
        }
        s();
    }

    public final void Q(int i11) {
        if (this.f101752Z) {
            if (this.f101751Y != i11) {
                return;
            } else {
                this.f101752Z = false;
            }
        }
        if (this.f101751Y != i11) {
            this.f101751Y = i11;
            this.f101750X = i11 != 0;
            s();
        }
    }

    public final void S(C7264f c7264f) {
        if (this.f101754a0.equals(c7264f)) {
            return;
        }
        c7264f.getClass();
        if (this.f101790y != null) {
            this.f101754a0.getClass();
        }
        this.f101754a0 = c7264f;
    }

    public final void T(InterfaceC8064f interfaceC8064f) {
        this.f101769i.q(interfaceC8064f);
    }

    public final void U(s sVar) {
        this.f101786u = sVar;
    }

    public final void V(int i11, int i12) {
        e eVar;
        AudioTrack audioTrack = this.f101790y;
        if (audioTrack == null || !F(audioTrack) || (eVar = this.f101788w) == null || !eVar.f101811k) {
            return;
        }
        this.f101790y.setOffloadDelayPadding(i11, i12);
    }

    public final void W(int i11) {
        G10.a.h(Build.VERSION.SDK_INT >= 29);
        this.f101775l = i11;
    }

    public final void Y(j3.x xVar) {
        this.f101732F = new j3.x(m3.N.h(xVar.f69345a, 0.1f, 8.0f), m3.N.h(xVar.f69346b, 0.1f, 8.0f));
        e eVar = this.f101788w;
        if (eVar != null && eVar.f101810j) {
            R();
            return;
        }
        g gVar = new g(xVar, -9223372036854775807L, -9223372036854775807L);
        if (D()) {
            this.f101730D = gVar;
        } else {
            this.f101731E = gVar;
        }
    }

    public final void Z(P p11) {
        this.f101785t = p11;
    }

    public final void a0(AudioDeviceInfo audioDeviceInfo) {
        this.f101756b0 = audioDeviceInfo == null ? null : new C10208d(audioDeviceInfo);
        C10207c c10207c = this.f101727A;
        if (c10207c != null) {
            c10207c.j(audioDeviceInfo);
        }
        AudioTrack audioTrack = this.f101790y;
        if (audioTrack != null) {
            C10208d c10208d = this.f101756b0;
            audioTrack.setPreferredDevice(c10208d != null ? c10208d.f101899a : null);
        }
    }

    public final void b0(boolean z11) {
        this.f101733G = z11;
        e eVar = this.f101788w;
        g gVar = new g((eVar == null || !eVar.f101810j) ? this.f101732F : j3.x.f69344d, -9223372036854775807L, -9223372036854775807L);
        if (D()) {
            this.f101730D = gVar;
        } else {
            this.f101731E = gVar;
        }
    }

    public final void c0(float f7) {
        if (this.f101742P != f7) {
            this.f101742P = f7;
            if (D()) {
                this.f101790y.setVolume(this.f101742P);
            }
        }
    }

    public final boolean d0(C7272n c7272n) {
        return w(c7272n) != 0;
    }

    public final void n(C7272n c7272n, int[] iArr) throws q {
        k3.d dVar;
        int intValue;
        boolean z11;
        int i11;
        int i12;
        int i13;
        boolean z12;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int b11;
        G();
        boolean equals = "audio/raw".equals(c7272n.f69127o);
        boolean z13 = this.f101773k;
        I i19 = this.f101783r;
        String str = c7272n.f69127o;
        int i21 = c7272n.f69103H;
        int i22 = c7272n.f69102G;
        if (equals) {
            int i23 = c7272n.f69104I;
            G10.a.c(m3.N.M(i23));
            int u11 = m3.N.u(i23) * i22;
            AbstractC5880y.a aVar = new AbstractC5880y.a();
            aVar.h(this.f101767h);
            if (this.f101757c && (i23 == 21 || i23 == 1342177280 || i23 == 22 || i23 == 1610612736 || i23 == 4)) {
                aVar.e(this.f101765g);
            } else {
                aVar.e(this.f101763f);
                aVar.f(((f) this.f101755b).c());
            }
            dVar = new k3.d(aVar.j());
            if (dVar.equals(this.f101789x)) {
                dVar = this.f101789x;
            }
            this.f101761e.n(c7272n.f69105J, c7272n.f69106K);
            this.f101759d.l(iArr);
            try {
                e.a a11 = dVar.a(new e.a(i21, i22, i23));
                i19.getClass();
                int i24 = a11.f70385b;
                intValue = m3.N.t(i24);
                i14 = a11.f70386c;
                i12 = m3.N.u(i14) * i24;
                i13 = a11.f70384a;
                z11 = z13;
                i11 = u11;
                i15 = 0;
                z12 = false;
            } catch (e.b e11) {
                throw new q(e11, c7272n);
            }
        } else {
            dVar = new k3.d(AbstractC5880y.v());
            C10209e v11 = this.f101775l != 0 ? v(c7272n) : C10209e.f101900d;
            if (this.f101775l == 0 || !v11.f101901a) {
                Pair d11 = this.f101791z.d(this.f101729C, c7272n);
                if (d11 == null) {
                    throw new q("Unable to configure passthrough for: " + c7272n, c7272n);
                }
                int intValue2 = ((Integer) d11.first).intValue();
                intValue = ((Integer) d11.second).intValue();
                z11 = z13;
                i11 = -1;
                i12 = -1;
                i13 = i21;
                z12 = false;
                i14 = intValue2;
                i15 = 2;
            } else {
                str.getClass();
                int c11 = j3.u.c(str, c7272n.f69123k);
                i19.getClass();
                intValue = m3.N.t(i22);
                z12 = v11.f101902b;
                i15 = 1;
                z11 = true;
                i12 = -1;
                i13 = i21;
                i14 = c11;
                i11 = -1;
            }
        }
        if (i14 == 0) {
            throw new q("Invalid output encoding (mode=" + i15 + ") for: " + c7272n, c7272n);
        }
        if (intValue == 0) {
            throw new q("Invalid output channel config (mode=" + i15 + ") for: " + c7272n, c7272n);
        }
        boolean equals2 = "audio/vnd.dts.hd;profile=lbr".equals(str);
        int i25 = c7272n.f69122j;
        if (equals2 && i25 == -1) {
            i25 = 768000;
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i13, intValue, i14);
        G10.a.h(minBufferSize != -2);
        int i26 = i12 != -1 ? i12 : 1;
        double d12 = z11 ? 8.0d : 1.0d;
        this.f101781p.getClass();
        if (i15 != 0) {
            if (i15 == 1) {
                i16 = i11;
                int b12 = N3.s.b(i14);
                G10.a.h(b12 != -2147483647);
                i18 = com.google.common.primitives.b.c((50000000 * b12) / 1000000);
            } else {
                if (i15 != 2) {
                    throw new IllegalArgumentException();
                }
                int i27 = i14 == 5 ? 500000 : i14 == 8 ? 1000000 : 250000;
                if (i25 != -1) {
                    RoundingMode roundingMode = RoundingMode.CEILING;
                    b11 = Q7.c.b(i25);
                } else {
                    b11 = N3.s.b(i14);
                    G10.a.h(b11 != -2147483647);
                }
                i16 = i11;
                i18 = com.google.common.primitives.b.c((i27 * b11) / 1000000);
            }
            i17 = i15;
        } else {
            i16 = i11;
            i17 = i15;
            long j11 = i13;
            long j12 = 250000 * j11;
            long j13 = i26;
            i18 = m3.N.i(minBufferSize * 4, com.google.common.primitives.b.c((j12 * j13) / 1000000), com.google.common.primitives.b.c(((750000 * j11) * j13) / 1000000));
        }
        this.f101764f0 = false;
        e eVar = new e(c7272n, i16, i17, i12, i13, intValue, i14, (((Math.max(minBufferSize, (int) (i18 * d12)) + i26) - 1) / i26) * i26, dVar, z11, z12, this.f101758c0);
        if (D()) {
            this.f101787v = eVar;
        } else {
            this.f101788w = eVar;
        }
    }

    public final void o() {
        if (this.f101758c0) {
            this.f101758c0 = false;
            s();
        }
    }

    public final void r() {
        G10.a.h(this.f101750X);
        if (this.f101758c0) {
            return;
        }
        this.f101758c0 = true;
        s();
    }

    public final void s() {
        if (D()) {
            this.f101734H = 0L;
            this.f101735I = 0L;
            this.f101736J = 0L;
            this.f101737K = 0L;
            this.f101766g0 = false;
            this.f101738L = 0;
            this.f101731E = new g(this.f101732F, 0L, 0L);
            this.f101741O = 0L;
            this.f101730D = null;
            this.f101771j.clear();
            this.f101743Q = null;
            this.f101744R = 0;
            this.f101745S = null;
            this.f101747U = false;
            this.f101746T = false;
            this.f101748V = false;
            this.f101761e.m();
            k3.d dVar = this.f101788w.f101809i;
            this.f101789x = dVar;
            dVar.b();
            if (this.f101769i.h()) {
                this.f101790y.pause();
            }
            if (F(this.f101790y)) {
                k kVar = this.f101777m;
                kVar.getClass();
                kVar.b(this.f101790y);
            }
            final p a11 = this.f101788w.a();
            e eVar = this.f101787v;
            if (eVar != null) {
                this.f101788w = eVar;
                this.f101787v = null;
            }
            this.f101769i.m();
            h hVar = this.f101728B;
            if (hVar != null) {
                hVar.b();
                this.f101728B = null;
            }
            final AudioTrack audioTrack = this.f101790y;
            final s sVar = this.f101786u;
            final Handler handler = new Handler(Looper.myLooper());
            synchronized (f101724n0) {
                try {
                    if (f101725o0 == null) {
                        int i11 = m3.N.f74289a;
                        f101725o0 = Executors.newSingleThreadScheduledExecutor(new m3.M());
                    }
                    f101726p0++;
                    f101725o0.schedule(new Runnable() { // from class: v3.A
                        @Override // java.lang.Runnable
                        public final void run() {
                            Handler handler2 = handler;
                            p pVar = a11;
                            C10201C.b(audioTrack, sVar, handler2, pVar);
                        }
                    }, 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f101790y = null;
        }
        this.f101780o.a();
        this.f101779n.a();
        this.f101770i0 = 0L;
        this.f101772j0 = 0L;
        Handler handler2 = this.f101774k0;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    public final long t() {
        if (!D()) {
            return -9223372036854775807L;
        }
        AudioTrack audioTrack = this.f101790y;
        e eVar = this.f101788w;
        if (eVar.f101803c == 0) {
            return m3.N.X(eVar.f101805e, audioTrack.getBufferSizeInFrames());
        }
        long bufferSizeInFrames = audioTrack.getBufferSizeInFrames();
        int b11 = N3.s.b(eVar.f101807g);
        G10.a.h(b11 != -2147483647);
        return m3.N.Z(bufferSizeInFrames, 1000000L, b11, RoundingMode.DOWN);
    }

    public final long u() {
        ArrayDeque<g> arrayDeque;
        long j11;
        if (!D() || this.f101740N) {
            return Long.MIN_VALUE;
        }
        long min = Math.min(this.f101769i.b(), m3.N.X(this.f101788w.f101805e, y()));
        while (true) {
            arrayDeque = this.f101771j;
            if (arrayDeque.isEmpty() || min < arrayDeque.getFirst().f101818c) {
                break;
            }
            this.f101731E = arrayDeque.remove();
        }
        g gVar = this.f101731E;
        long j12 = min - gVar.f101818c;
        long B11 = m3.N.B(gVar.f101816a.f69345a, j12);
        boolean isEmpty = arrayDeque.isEmpty();
        k3.f fVar = this.f101755b;
        if (isEmpty) {
            long d11 = ((f) fVar).d(j12);
            g gVar2 = this.f101731E;
            j11 = gVar2.f101817b + d11;
            gVar2.f101819d = d11 - B11;
        } else {
            g gVar3 = this.f101731E;
            j11 = gVar3.f101817b + B11 + gVar3.f101819d;
        }
        long e11 = ((f) fVar).e();
        long X9 = m3.N.X(this.f101788w.f101805e, e11) + j11;
        long j13 = this.f101770i0;
        if (e11 > j13) {
            long X11 = m3.N.X(this.f101788w.f101805e, e11 - j13);
            this.f101770i0 = e11;
            this.f101772j0 += X11;
            if (this.f101774k0 == null) {
                this.f101774k0 = new Handler(Looper.myLooper());
            }
            this.f101774k0.removeCallbacksAndMessages(null);
            this.f101774k0.postDelayed(new RunnableC2599a(this, 8), 100L);
        }
        return X9;
    }

    public final C10209e v(C7272n c7272n) {
        return this.f101764f0 ? C10209e.f101900d : this.f101782q.a(this.f101729C, c7272n);
    }

    public final int w(C7272n c7272n) {
        G();
        if (!"audio/raw".equals(c7272n.f69127o)) {
            return this.f101791z.d(this.f101729C, c7272n) != null ? 2 : 0;
        }
        int i11 = c7272n.f69104I;
        if (m3.N.M(i11)) {
            return (i11 == 2 || (this.f101757c && i11 == 4)) ? 2 : 1;
        }
        m3.s.f("DefaultAudioSink", "Invalid PCM encoding: " + i11);
        return 0;
    }

    public final j3.x x() {
        return this.f101732F;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02a1, code lost:
    
        if (r12 == 0) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x00ab, code lost:
    
        if (C() == false) goto L210;
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0217  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean z(ByteBuffer byteBuffer, long j11, int i11) throws r, u {
        long j12;
        o.a aVar;
        int g10;
        int i12;
        byte b11;
        int i13;
        byte b12;
        int i14;
        int i15;
        int i16;
        int i17;
        ByteBuffer byteBuffer2 = this.f101743Q;
        G10.a.c(byteBuffer2 == null || byteBuffer == byteBuffer2);
        e eVar = this.f101787v;
        w wVar = this.f101769i;
        if (eVar != null) {
            if (q()) {
                e eVar2 = this.f101787v;
                e eVar3 = this.f101788w;
                eVar2.getClass();
                if (eVar3.f101803c == eVar2.f101803c && eVar3.f101807g == eVar2.f101807g && eVar3.f101805e == eVar2.f101805e && eVar3.f101806f == eVar2.f101806f && eVar3.f101804d == eVar2.f101804d && eVar3.f101810j == eVar2.f101810j && eVar3.f101811k == eVar2.f101811k) {
                    this.f101788w = this.f101787v;
                    this.f101787v = null;
                    AudioTrack audioTrack = this.f101790y;
                    if (audioTrack != null && F(audioTrack) && this.f101788w.f101811k) {
                        if (this.f101790y.getPlayState() == 3) {
                            this.f101790y.setOffloadEndOfStream();
                            wVar.a();
                        }
                        AudioTrack audioTrack2 = this.f101790y;
                        C7272n c7272n = this.f101788w.f101801a;
                        audioTrack2.setOffloadDelayPadding(c7272n.f69105J, c7272n.f69106K);
                        this.f101766g0 = true;
                    }
                } else {
                    K();
                    if (!B()) {
                        s();
                    }
                }
                k(j11);
            }
            return false;
        }
        boolean D11 = D();
        i<r> iVar = this.f101779n;
        if (!D11) {
            try {
            } catch (r e11) {
                if (e11.f101940b) {
                    throw e11;
                }
                iVar.c(e11);
                return false;
            }
        }
        iVar.a();
        if (this.f101740N) {
            this.f101741O = Math.max(0L, j11);
            this.f101739M = false;
            this.f101740N = false;
            e eVar4 = this.f101788w;
            if (eVar4 != null && eVar4.f101810j) {
                R();
            }
            k(j11);
            if (this.f101749W) {
                J();
            }
        }
        y();
        wVar.j();
        if (this.f101743Q == null) {
            G10.a.c(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (byteBuffer.hasRemaining()) {
                e eVar5 = this.f101788w;
                if (eVar5.f101803c == 0 || this.f101738L != 0) {
                    j12 = 0;
                } else {
                    int i18 = eVar5.f101807g;
                    if (i18 != 20) {
                        j12 = 0;
                        g10 = UserVerificationMethods.USER_VERIFY_ALL;
                        if (i18 != 30) {
                            switch (i18) {
                                case 5:
                                case 6:
                                    g10 = C3651b.c(byteBuffer);
                                    break;
                                case 7:
                                case 8:
                                    break;
                                case 9:
                                    int position = byteBuffer.position();
                                    int i19 = m3.N.f74289a;
                                    int i21 = byteBuffer.getInt(position);
                                    if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                        i21 = Integer.reverseBytes(i21);
                                    }
                                    if ((i21 & (-2097152)) == -2097152 && (i14 = (i21 >>> 19) & 3) != 1 && (i15 = (i21 >>> 17) & 3) != 0) {
                                        int i22 = (i21 >>> 12) & 15;
                                        int i23 = (i21 >>> 10) & 3;
                                        if (i22 != 0 && i22 != 15 && i23 != 3) {
                                            if (i15 != 1) {
                                                if (i15 != 2) {
                                                    if (i15 != 3) {
                                                        throw new IllegalArgumentException();
                                                    }
                                                    i16 = 384;
                                                    g10 = i16;
                                                    if (g10 == -1) {
                                                        throw new IllegalArgumentException();
                                                    }
                                                }
                                                i16 = 1152;
                                                g10 = i16;
                                                if (g10 == -1) {
                                                }
                                            } else {
                                                if (i14 != 3) {
                                                    i16 = 576;
                                                    g10 = i16;
                                                    if (g10 == -1) {
                                                    }
                                                }
                                                i16 = 1152;
                                                g10 = i16;
                                                if (g10 == -1) {
                                                }
                                            }
                                        }
                                    }
                                    g10 = -1;
                                    if (g10 == -1) {
                                    }
                                    break;
                                case 10:
                                    break;
                                case 11:
                                case 12:
                                    g10 = 2048;
                                    break;
                                default:
                                    char c11 = 16;
                                    switch (i18) {
                                        case 14:
                                            int position2 = byteBuffer.position();
                                            int limit = byteBuffer.limit() - 10;
                                            int i24 = position2;
                                            while (true) {
                                                if (i24 <= limit) {
                                                    int i25 = m3.N.f74289a;
                                                    int i26 = byteBuffer.getInt(i24 + 4);
                                                    char c12 = c11;
                                                    if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                                        i26 = Integer.reverseBytes(i26);
                                                    }
                                                    if ((i26 & (-2)) == -126718022) {
                                                        i17 = i24 - position2;
                                                    } else {
                                                        i24++;
                                                        c11 = c12;
                                                    }
                                                } else {
                                                    i17 = -1;
                                                }
                                            }
                                            if (i17 != -1) {
                                                g10 = (40 << ((byteBuffer.get((byteBuffer.position() + i17) + ((byteBuffer.get((byteBuffer.position() + i17) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7)) * 16;
                                                break;
                                            } else {
                                                g10 = 0;
                                                break;
                                            }
                                        case 15:
                                            g10 = UserVerificationMethods.USER_VERIFY_NONE;
                                            break;
                                        case 16:
                                            break;
                                        case 17:
                                            byte[] bArr = new byte[16];
                                            int position3 = byteBuffer.position();
                                            byteBuffer.get(bArr);
                                            byteBuffer.position(position3);
                                            g10 = C3652c.c(new C8049B(16, bArr)).f18567c;
                                            break;
                                        case 18:
                                            break;
                                        default:
                                            throw new IllegalStateException(Ej.b.a(i18, "Unexpected audio encoding: "));
                                    }
                            }
                        }
                        if (byteBuffer.getInt(0) != -233094848 && byteBuffer.getInt(0) != -398277519) {
                            if (byteBuffer.getInt(0) == 622876772) {
                                g10 = 4096;
                            } else {
                                int position4 = byteBuffer.position();
                                byte b13 = byteBuffer.get(position4);
                                if (b13 != -2) {
                                    if (b13 == -1) {
                                        i12 = (byteBuffer.get(position4 + 4) & 7) << 4;
                                        b12 = byteBuffer.get(position4 + 7);
                                    } else if (b13 != 31) {
                                        i12 = (byteBuffer.get(position4 + 4) & 1) << 6;
                                        b11 = byteBuffer.get(position4 + 5);
                                    } else {
                                        i12 = (byteBuffer.get(position4 + 5) & 7) << 4;
                                        b12 = byteBuffer.get(position4 + 6);
                                    }
                                    i13 = b12 & 60;
                                    g10 = (((i13 >> 2) | i12) + 1) * 32;
                                } else {
                                    i12 = (byteBuffer.get(position4 + 5) & 1) << 6;
                                    b11 = byteBuffer.get(position4 + 4);
                                }
                                i13 = b11 & 252;
                                g10 = (((i13 >> 2) | i12) + 1) * 32;
                            }
                        }
                    } else {
                        j12 = 0;
                        g10 = Jb.b.g(byteBuffer);
                    }
                    this.f101738L = g10;
                }
                if (this.f101730D != null) {
                    if (q()) {
                        k(j11);
                        this.f101730D = null;
                    }
                    return false;
                }
                long j13 = this.f101741O;
                e eVar6 = this.f101788w;
                long X9 = m3.N.X(eVar6.f101801a.f69103H, (eVar6.f101803c == 0 ? this.f101734H / eVar6.f101802b : this.f101735I) - this.f101761e.l()) + j13;
                if (!this.f101739M && Math.abs(X9 - j11) > 200000) {
                    s sVar = this.f101786u;
                    if (sVar != null) {
                        StringBuilder d11 = C2702w.d(X9, "Unexpected audio track timestamp discontinuity: expected ", ", got ");
                        d11.append(j11);
                        t tVar = new t(d11.toString());
                        m3.s.d("MediaCodecAudioRenderer", "Audio sink error", tVar);
                        aVar = J.this.f101833a1;
                        aVar.p(tVar);
                    }
                    this.f101739M = true;
                }
                if (this.f101739M) {
                    if (q()) {
                        long j14 = j11 - X9;
                        this.f101741O += j14;
                        this.f101739M = false;
                        k(j11);
                        s sVar2 = this.f101786u;
                        if (sVar2 != null && j14 != j12) {
                            J.this.u1();
                        }
                    }
                    return false;
                }
                if (this.f101788w.f101803c == 0) {
                    this.f101734H += byteBuffer.remaining();
                } else {
                    this.f101735I = (this.f101738L * i11) + this.f101735I;
                }
                this.f101743Q = byteBuffer;
                this.f101744R = i11;
            }
            return true;
        }
        M(j11);
        if (!this.f101743Q.hasRemaining()) {
            this.f101743Q = null;
            this.f101744R = 0;
            return true;
        }
        if (wVar.i(y())) {
            m3.s.f("DefaultAudioSink", "Resetting stalled audio track");
            s();
            return true;
        }
        return false;
    }
}
