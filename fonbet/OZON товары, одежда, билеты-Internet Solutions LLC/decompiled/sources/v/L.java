package v;

import C.C2698s;
import C.r;
import N3.C3660k;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Rational;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraOutputConfigNullPointerQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraSurfaceCleanupQuirk;
import androidx.camera.core.impl.AbstractC5081a;
import androidx.camera.core.impl.C5106m0;
import androidx.camera.core.impl.C5117s0;
import androidx.camera.core.impl.E;
import androidx.camera.core.impl.I;
import androidx.camera.core.impl.InterfaceC5129y0;
import androidx.camera.core.impl.M;
import androidx.camera.core.impl.O0;
import androidx.camera.core.impl.Q;
import androidx.camera.core.impl.T;
import androidx.camera.core.impl.W;
import androidx.camera.core.impl.a1;
import androidx.camera.core.impl.c1;
import androidx.concurrent.futures.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import v.E1;
import v.L;
import w.C10340H;
import w.C10348a;
import w.C10368u;

/* loaded from: classes8.dex */
final class L implements androidx.camera.core.impl.I {

    /* renamed from: A, reason: collision with root package name */
    private final HashSet f100972A;

    /* renamed from: B, reason: collision with root package name */
    @NonNull
    private androidx.camera.core.impl.A f100973B;

    /* renamed from: C, reason: collision with root package name */
    final Object f100974C;

    /* renamed from: D, reason: collision with root package name */
    private androidx.camera.core.impl.Q0 f100975D;

    /* renamed from: E, reason: collision with root package name */
    boolean f100976E;

    /* renamed from: F, reason: collision with root package name */
    @NonNull
    private final C10081a1 f100977F;

    /* renamed from: G, reason: collision with root package name */
    @NonNull
    private final x.c f100978G;

    /* renamed from: H, reason: collision with root package name */
    @NonNull
    private final D1 f100979H;

    /* renamed from: I, reason: collision with root package name */
    private final e f100980I;

    /* renamed from: a, reason: collision with root package name */
    private final androidx.camera.core.impl.a1 f100981a;

    /* renamed from: b, reason: collision with root package name */
    private final C10340H f100982b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f100983c;

    /* renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f100984d;

    /* renamed from: e, reason: collision with root package name */
    volatile f f100985e = f.INITIALIZED;

    /* renamed from: f, reason: collision with root package name */
    private final C5117s0<I.a> f100986f;

    /* renamed from: g, reason: collision with root package name */
    private final N0 f100987g;

    /* renamed from: h, reason: collision with root package name */
    private final C10132s f100988h;

    /* renamed from: i, reason: collision with root package name */
    private final g f100989i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    final Q f100990j;

    /* renamed from: k, reason: collision with root package name */
    CameraDevice f100991k;

    /* renamed from: l, reason: collision with root package name */
    int f100992l;

    /* renamed from: m, reason: collision with root package name */
    W0 f100993m;

    /* renamed from: n, reason: collision with root package name */
    final LinkedHashMap f100994n;

    /* renamed from: o, reason: collision with root package name */
    private int f100995o;

    /* renamed from: p, reason: collision with root package name */
    @NonNull
    final b f100996p;

    /* renamed from: q, reason: collision with root package name */
    @NonNull
    final A.a f100997q;

    /* renamed from: r, reason: collision with root package name */
    @NonNull
    final androidx.camera.core.impl.M f100998r;

    /* renamed from: s, reason: collision with root package name */
    private final boolean f100999s;

    /* renamed from: t, reason: collision with root package name */
    private final boolean f101000t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f101001u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f101002v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f101003w;

    /* renamed from: x, reason: collision with root package name */
    private C10140u1 f101004x;

    /* renamed from: y, reason: collision with root package name */
    @NonNull
    private final Y0 f101005y;

    /* renamed from: z, reason: collision with root package name */
    @NonNull
    private final E1.b f101006z;

    final class a implements I.c<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ W0 f101007a;

        a(W0 w02) {
            this.f101007a = w02;
        }

        @Override // I.c
        public final void onFailure(@NonNull Throwable th2) {
            if (th2 instanceof W.a) {
                androidx.camera.core.impl.O0 O11 = L.this.O(((W.a) th2).a());
                if (O11 != null) {
                    L.this.X(O11);
                    return;
                }
                return;
            }
            if (th2 instanceof CancellationException) {
                L.this.M("Unable to configure camera cancelled");
                return;
            }
            f fVar = L.this.f100985e;
            f fVar2 = f.OPENED;
            if (fVar == fVar2) {
                L.this.b0(fVar2, r.a.b(4, th2), true);
            }
            C.S.d("Camera2CameraImpl", "Unable to configure camera " + L.this, th2);
            L l11 = L.this;
            if (l11.f100993m == this.f101007a) {
                l11.Z();
            }
        }

        @Override // I.c
        public final void onSuccess(Void r22) {
            if (L.this.f100997q.b() == 2 && L.this.f100985e == f.OPENED) {
                L.this.a0(f.CONFIGURED);
            }
        }
    }

    final class b extends CameraManager.AvailabilityCallback implements M.c {

        /* renamed from: a, reason: collision with root package name */
        private final String f101009a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f101010b = true;

        b(String str) {
            this.f101009a = str;
        }

        @Override // androidx.camera.core.impl.M.c
        public final void a() {
            if (L.this.f100985e == f.PENDING_OPEN) {
                L.this.g0(false);
            }
        }

        final boolean b() {
            return this.f101010b;
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public final void onCameraAvailable(@NonNull String str) {
            if (this.f101009a.equals(str)) {
                this.f101010b = true;
                if (L.this.f100985e == f.PENDING_OPEN) {
                    L.this.g0(false);
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public final void onCameraUnavailable(@NonNull String str) {
            if (this.f101009a.equals(str)) {
                this.f101010b = false;
            }
        }
    }

    final class c implements M.b {
        c() {
        }

        @Override // androidx.camera.core.impl.M.b
        public final void a() {
            if (L.this.f100985e == f.OPENED) {
                L.this.W();
            }
        }
    }

    final class d implements E.d {
        d() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class e {

        /* renamed from: a, reason: collision with root package name */
        private a f101014a = null;

        /* JADX INFO: Access modifiers changed from: private */
        class a {

            /* renamed from: a, reason: collision with root package name */
            private final ScheduledFuture<?> f101016a;

            /* renamed from: b, reason: collision with root package name */
            private final AtomicBoolean f101017b = new AtomicBoolean(false);

            a() {
                this.f101016a = L.this.f100984d.schedule(new Runnable() { // from class: v.M
                    @Override // java.lang.Runnable
                    public final void run() {
                        L.e.a.a(L.e.a.this);
                    }
                }, 2000L, TimeUnit.MILLISECONDS);
            }

            public static void a(final a aVar) {
                if (aVar.f101017b.getAndSet(true)) {
                    return;
                }
                L.this.f100983c.execute(new Runnable() { // from class: v.N
                    @Override // java.lang.Runnable
                    public final void run() {
                        L.g gVar;
                        L.e.a aVar2 = L.e.a.this;
                        if (L.this.f100985e != L.f.OPENING) {
                            L.this.M("Camera skip reopen at state: " + L.this.f100985e);
                            return;
                        }
                        L.this.M("Camera onError timeout, reopen it.");
                        L.this.a0(L.f.REOPENING);
                        gVar = L.this.f100989i;
                        gVar.c();
                    }
                });
            }

            public final void b() {
                this.f101017b.set(true);
                this.f101016a.cancel(true);
            }

            public final boolean c() {
                return this.f101017b.get();
            }
        }

        e() {
        }

        public final void a() {
            a aVar = this.f101014a;
            if (aVar != null) {
                aVar.b();
            }
            this.f101014a = null;
        }

        public final boolean b() {
            a aVar = this.f101014a;
            return (aVar == null || aVar.c()) ? false : true;
        }

        public final void c() {
            if (L.this.f100985e != f.OPENING) {
                L.this.M("Don't need the onError timeout handler.");
                return;
            }
            L.this.M("Camera waiting for onError.");
            a();
            this.f101014a = new a();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    static final class f {
        private static final /* synthetic */ f[] $VALUES;
        public static final f CLOSING;
        public static final f CONFIGURED;
        public static final f INITIALIZED;
        public static final f OPENED;
        public static final f OPENING;
        public static final f PENDING_OPEN;
        public static final f RELEASED;
        public static final f RELEASING;
        public static final f REOPENING;
        public static final f REOPENING_QUIRK;

        static {
            f fVar = new f("RELEASED", 0);
            RELEASED = fVar;
            f fVar2 = new f("RELEASING", 1);
            RELEASING = fVar2;
            f fVar3 = new f("INITIALIZED", 2);
            INITIALIZED = fVar3;
            f fVar4 = new f("PENDING_OPEN", 3);
            PENDING_OPEN = fVar4;
            f fVar5 = new f("CLOSING", 4);
            CLOSING = fVar5;
            f fVar6 = new f("REOPENING_QUIRK", 5);
            REOPENING_QUIRK = fVar6;
            f fVar7 = new f("REOPENING", 6);
            REOPENING = fVar7;
            f fVar8 = new f("OPENING", 7);
            OPENING = fVar8;
            f fVar9 = new f("OPENED", 8);
            OPENED = fVar9;
            f fVar10 = new f("CONFIGURED", 9);
            CONFIGURED = fVar10;
            $VALUES = new f[]{fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, fVar10};
        }

        private f() {
            throw null;
        }

        public static f valueOf(String str) {
            return (f) Enum.valueOf(f.class, str);
        }

        public static f[] values() {
            return (f[]) $VALUES.clone();
        }
    }

    final class g extends CameraDevice.StateCallback {

        /* renamed from: a, reason: collision with root package name */
        private final Executor f101019a;

        /* renamed from: b, reason: collision with root package name */
        private final ScheduledExecutorService f101020b;

        /* renamed from: c, reason: collision with root package name */
        private b f101021c;

        /* renamed from: d, reason: collision with root package name */
        ScheduledFuture<?> f101022d;

        /* renamed from: e, reason: collision with root package name */
        @NonNull
        private final a f101023e;

        class a {

            /* renamed from: a, reason: collision with root package name */
            private final long f101025a;

            /* renamed from: b, reason: collision with root package name */
            private long f101026b = -1;

            a(long j11) {
                this.f101025a = j11;
            }

            final boolean a() {
                long uptimeMillis = SystemClock.uptimeMillis();
                if (this.f101026b == -1) {
                    this.f101026b = uptimeMillis;
                }
                if (uptimeMillis - this.f101026b < c()) {
                    return true;
                }
                this.f101026b = -1L;
                return false;
            }

            final int b() {
                if (!g.this.d()) {
                    return 700;
                }
                long uptimeMillis = SystemClock.uptimeMillis();
                if (this.f101026b == -1) {
                    this.f101026b = uptimeMillis;
                }
                long j11 = uptimeMillis - this.f101026b;
                if (j11 <= 120000) {
                    return 1000;
                }
                return j11 <= 300000 ? 2000 : 4000;
            }

            final int c() {
                boolean d11 = g.this.d();
                long j11 = this.f101025a;
                if (d11) {
                    if (j11 > 0) {
                        return Math.min((int) j11, 1800000);
                    }
                    return 1800000;
                }
                if (j11 > 0) {
                    return Math.min((int) j11, 10000);
                }
                return 10000;
            }

            final void d() {
                this.f101026b = -1L;
            }
        }

        class b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            private Executor f101028a;

            /* renamed from: b, reason: collision with root package name */
            private boolean f101029b = false;

            b(@NonNull Executor executor) {
                this.f101028a = executor;
            }

            public static void a(b bVar) {
                if (bVar.f101029b) {
                    return;
                }
                x2.i.f(null, L.this.f100985e == f.REOPENING || L.this.f100985e == f.REOPENING_QUIRK);
                if (g.this.d()) {
                    L.this.f0(true);
                } else {
                    L.this.g0(true);
                }
            }

            final void b() {
                this.f101029b = true;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f101028a.execute(new Runnable() { // from class: v.O
                    @Override // java.lang.Runnable
                    public final void run() {
                        L.g.b.a(L.g.b.this);
                    }
                });
            }
        }

        g(@NonNull Executor executor, @NonNull ScheduledExecutorService scheduledExecutorService, long j11) {
            this.f101019a = executor;
            this.f101020b = scheduledExecutorService;
            this.f101023e = new a(j11);
        }

        final boolean a() {
            if (this.f101022d == null) {
                return false;
            }
            L.this.M("Cancelling scheduled re-open: " + this.f101021c);
            this.f101021c.b();
            this.f101021c = null;
            this.f101022d.cancel(false);
            this.f101022d = null;
            return true;
        }

        final void b() {
            this.f101023e.d();
        }

        final void c() {
            x2.i.f(null, this.f101021c == null);
            x2.i.f(null, this.f101022d == null);
            a aVar = this.f101023e;
            boolean a11 = aVar.a();
            L l11 = L.this;
            if (!a11) {
                C.S.c("Camera2CameraImpl", "Camera reopening attempted for " + aVar.c() + "ms without success.");
                l11.b0(f.PENDING_OPEN, null, false);
                return;
            }
            this.f101021c = new b(this.f101019a);
            l11.M("Attempting camera re-open in " + aVar.b() + "ms: " + this.f101021c + " activeResuming = " + l11.f100976E);
            this.f101022d = this.f101020b.schedule(this.f101021c, (long) aVar.b(), TimeUnit.MILLISECONDS);
        }

        final boolean d() {
            L l11 = L.this;
            if (!l11.f100976E) {
                return false;
            }
            int i11 = l11.f100992l;
            return i11 == 1 || i11 == 2;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onClosed(@NonNull CameraDevice cameraDevice) {
            L.this.M("CameraDevice.onClosed()");
            x2.i.f("Unexpected onClose callback on camera device: " + cameraDevice, L.this.f100991k == null);
            int ordinal = L.this.f100985e.ordinal();
            if (ordinal == 1 || ordinal == 4) {
                x2.i.f(null, L.this.f100994n.isEmpty());
                L.this.K();
                return;
            }
            if (ordinal != 5 && ordinal != 6) {
                throw new IllegalStateException("Camera closed while in state: " + L.this.f100985e);
            }
            L l11 = L.this;
            int i11 = l11.f100992l;
            if (i11 == 0) {
                l11.g0(false);
            } else {
                l11.M("Camera closed due to error: ".concat(L.Q(i11)));
                c();
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onDisconnected(@NonNull CameraDevice cameraDevice) {
            L.this.M("CameraDevice.onDisconnected()");
            onError(cameraDevice, 1);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onError(@NonNull CameraDevice cameraDevice, int i11) {
            L l11 = L.this;
            l11.f100991k = cameraDevice;
            l11.f100992l = i11;
            e eVar = l11.f100980I;
            L.this.M("Camera receive onErrorCallback");
            eVar.a();
            int ordinal = L.this.f100985e.ordinal();
            if (ordinal != 1) {
                switch (ordinal) {
                    case 4:
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        String id2 = cameraDevice.getId();
                        String Q11 = L.Q(i11);
                        String name = L.this.f100985e.name();
                        StringBuilder d11 = C3660k.d("CameraDevice.onError(): ", id2, " failed with ", Q11, " while in ");
                        d11.append(name);
                        d11.append(" state. Will attempt recovering from error.");
                        C.S.a("Camera2CameraImpl", d11.toString());
                        x2.i.f("Attempt to handle open error from non open state: " + L.this.f100985e, L.this.f100985e == f.OPENING || L.this.f100985e == f.OPENED || L.this.f100985e == f.CONFIGURED || L.this.f100985e == f.REOPENING || L.this.f100985e == f.REOPENING_QUIRK);
                        int i12 = 3;
                        if (i11 != 1 && i11 != 2 && i11 != 4) {
                            C.S.c("Camera2CameraImpl", "Error observed on open (or opening) camera device " + cameraDevice.getId() + ": " + L.Q(i11) + " closing camera.");
                            L.this.b0(f.CLOSING, r.a.a(i11 == 3 ? 5 : 6), true);
                            L.this.J();
                            return;
                        }
                        C.S.a("Camera2CameraImpl", V.e.a("Attempt to reopen camera[", cameraDevice.getId(), "] after error[", L.Q(i11), "]"));
                        L l12 = L.this;
                        x2.i.f("Can only reopen camera device after error if the camera device is actually in an error state.", l12.f100992l != 0);
                        if (i11 == 1) {
                            i12 = 2;
                        } else if (i11 == 2) {
                            i12 = 1;
                        }
                        l12.b0(f.REOPENING, r.a.a(i12), true);
                        l12.J();
                        return;
                    default:
                        throw new IllegalStateException("onError() should not be possible from state: " + L.this.f100985e);
                }
            }
            String id3 = cameraDevice.getId();
            String Q12 = L.Q(i11);
            String name2 = L.this.f100985e.name();
            StringBuilder d12 = C3660k.d("CameraDevice.onError(): ", id3, " failed with ", Q12, " while in ");
            d12.append(name2);
            d12.append(" state. Will finish closing camera.");
            C.S.c("Camera2CameraImpl", d12.toString());
            L.this.J();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onOpened(@NonNull CameraDevice cameraDevice) {
            L.this.M("CameraDevice.onOpened()");
            L l11 = L.this;
            l11.f100991k = cameraDevice;
            l11.f100992l = 0;
            b();
            int ordinal = L.this.f100985e.ordinal();
            if (ordinal == 1 || ordinal == 4) {
                x2.i.f(null, L.this.f100994n.isEmpty());
                L.this.f100991k.close();
                L.this.f100991k = null;
            } else {
                if (ordinal != 5 && ordinal != 6 && ordinal != 7) {
                    throw new IllegalStateException("onOpened() should not be possible from state: " + L.this.f100985e);
                }
                L.this.a0(f.OPENED);
                androidx.camera.core.impl.M m11 = L.this.f100998r;
                String id2 = cameraDevice.getId();
                L l12 = L.this;
                if (m11.i(id2, l12.f100997q.c(l12.f100991k.getId()))) {
                    L.this.W();
                }
            }
        }
    }

    static abstract class h {
        h() {
        }

        abstract List<c1.b> a();

        @NonNull
        abstract androidx.camera.core.impl.O0 b();

        abstract androidx.camera.core.impl.T0 c();

        abstract Size d();

        @NonNull
        abstract androidx.camera.core.impl.b1<?> e();

        @NonNull
        abstract String f();

        @NonNull
        abstract Class<?> g();
    }

    L(@NonNull Context context, @NonNull C10340H c10340h, @NonNull String str, @NonNull Q q11, @NonNull A.a aVar, @NonNull androidx.camera.core.impl.M m11, @NonNull Executor executor, @NonNull Handler handler, @NonNull C10081a1 c10081a1, long j11) throws C2698s {
        C5117s0<I.a> c5117s0 = new C5117s0<>();
        this.f100986f = c5117s0;
        this.f100992l = 0;
        new AtomicInteger(0);
        this.f100994n = new LinkedHashMap();
        this.f100995o = 0;
        this.f101001u = false;
        this.f101002v = false;
        this.f101003w = true;
        this.f100972A = new HashSet();
        this.f100973B = androidx.camera.core.impl.D.a();
        this.f100974C = new Object();
        this.f100976E = false;
        this.f100980I = new e();
        this.f100982b = c10340h;
        this.f100997q = aVar;
        this.f100998r = m11;
        ScheduledExecutorService f7 = H.c.f(handler);
        this.f100984d = f7;
        Executor g10 = H.c.g(executor);
        this.f100983c = g10;
        this.f100989i = new g(g10, f7, j11);
        this.f100981a = new androidx.camera.core.impl.a1(str);
        c5117s0.a(I.a.CLOSED);
        N0 n02 = new N0(m11);
        this.f100987g = n02;
        Y0 y02 = new Y0(g10);
        this.f101005y = y02;
        this.f100977F = c10081a1;
        try {
            C10368u b11 = c10340h.b(str);
            C10132s c10132s = new C10132s(b11, f7, g10, new d(), q11.l());
            this.f100988h = c10132s;
            this.f100990j = q11;
            q11.t(c10132s);
            q11.u(n02.a());
            this.f100978G = x.c.a(b11);
            this.f100993m = U();
            this.f101006z = new E1.b(handler, q11.l(), androidx.camera.camera2.internal.compat.quirk.b.c(), g10, f7, y02);
            this.f100999s = q11.l().a(LegacyCameraOutputConfigNullPointerQuirk.class);
            this.f101000t = q11.l().a(LegacyCameraSurfaceCleanupQuirk.class);
            b bVar = new b(str);
            this.f100996p = bVar;
            m11.f(this, g10, new c(), bVar);
            c10340h.f(g10, bVar);
            this.f100979H = new D1(context, str, c10340h, new C10078I());
        } catch (C10348a e11) {
            throw new C2698s(e11);
        }
    }

    public static void A(L l11, String str, androidx.camera.core.impl.O0 o02, androidx.camera.core.impl.b1 b1Var, androidx.camera.core.impl.T0 t02, List list) {
        l11.getClass();
        l11.N("Use case " + str + " RESET", null);
        l11.f100981a.m(str, o02, b1Var, t02, list);
        l11.I();
        l11.Z();
        l11.h0();
        if (l11.f100985e == f.OPENED) {
            l11.W();
        }
    }

    public static /* synthetic */ void B(L l11, ArrayList arrayList) {
        C10132s c10132s = l11.f100988h;
        try {
            l11.e0(arrayList);
        } finally {
            c10132s.u();
        }
    }

    static I.d H(L l11, CameraDevice cameraDevice) {
        final U0 u02 = new U0(l11.f100978G, false);
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(640, 480);
        Surface surface = new Surface(surfaceTexture);
        final C5106m0 c5106m0 = new C5106m0(surface);
        c5106m0.k().a(new com.yandex.mapkit.offline_cache.internal.a(2, surface, surfaceTexture), H.c.b());
        O0.b bVar = new O0.b();
        bVar.f(c5106m0, C.A.f4076d);
        bVar.v(1);
        l11.N("Start configAndClose.", null);
        I.d b11 = I.d.b(androidx.concurrent.futures.b.a(new B2.b(u02.c(bVar.k(), cameraDevice, l11.f101006z.a()))));
        I.a aVar = new I.a() { // from class: v.z
            @Override // I.a, qc.o
            public final com.google.common.util.concurrent.m apply(Object obj) {
                U0 u03 = U0.this;
                u03.close();
                c5106m0.d();
                return u03.release();
            }
        };
        Executor executor = l11.f100983c;
        b11.getClass();
        return (I.d) I.k.n(b11, aVar, executor);
    }

    private void I() {
        androidx.camera.core.impl.O0 c11 = this.f100981a.c().c();
        androidx.camera.core.impl.Q k11 = c11.k();
        int size = k11.h().size();
        int size2 = c11.o().size();
        if (c11.o().isEmpty()) {
            return;
        }
        if (!k11.h().isEmpty()) {
            if (size2 == 1 && size == 1) {
                Y();
                return;
            }
            if (size >= 2) {
                Y();
                return;
            }
            if (this.f101004x != null && !T()) {
                Y();
                return;
            }
            C.S.a("Camera2CameraImpl", "No need to remove a previous mMeteringRepeating, SessionConfig Surfaces: " + size2 + ", CaptureConfig Surfaces: " + size);
            return;
        }
        if (this.f101004x == null) {
            this.f101004x = new C10140u1(this.f100990j.s(), this.f100977F, new C10147x(this));
        }
        if (!T()) {
            C.S.c("Camera2CameraImpl", "Failed to add a repeating surface, CameraControl and ImageCapture may encounter issues due to the absence of repeating surface. Please add a UseCase (Preview or ImageAnalysis) that can provide a repeating surface for CameraControl and ImageCapture to function properly.");
            return;
        }
        C10140u1 c10140u1 = this.f101004x;
        if (c10140u1 != null) {
            String R11 = R(c10140u1);
            androidx.camera.core.impl.O0 e11 = this.f101004x.e();
            androidx.camera.core.impl.b1<?> f7 = this.f101004x.f();
            c1.b bVar = c1.b.METERING_REPEATING;
            this.f100981a.j(R11, e11, f7, null, Collections.singletonList(bVar));
            this.f100981a.i(R11, this.f101004x.e(), this.f101004x.f(), null, Collections.singletonList(bVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K() {
        x2.i.f(null, this.f100985e == f.RELEASING || this.f100985e == f.CLOSING);
        x2.i.f(null, this.f100994n.isEmpty());
        if (!this.f101001u) {
            P();
            return;
        }
        if (this.f101002v) {
            N("Ignored since configAndClose is processing", null);
            return;
        }
        if (!this.f100996p.b()) {
            this.f101001u = false;
            P();
            N("Ignore configAndClose and finish the close flow directly since camera is unavailable.", null);
        } else {
            N("Open camera to configAndClose", null);
            com.google.common.util.concurrent.m a11 = androidx.concurrent.futures.b.a(new b.c() { // from class: v.w
                @Override // androidx.concurrent.futures.b.c
                public final Object c(b.a aVar) {
                    L.r(L.this, aVar);
                    return "configAndCloseTask";
                }
            });
            this.f101002v = true;
            a11.a(new RunnableC10071B(this, 0), this.f100983c);
        }
    }

    private CameraDevice.StateCallback L() {
        ArrayList arrayList = new ArrayList(this.f100981a.c().c().c());
        arrayList.add(this.f101005y.a());
        arrayList.add(this.f100989i);
        return K0.a(arrayList);
    }

    private void N(@NonNull String str, Throwable th2) {
        C.S.b("Camera2CameraImpl", Sh.b.c("{", toString(), "} ", str), th2);
    }

    static String Q(int i11) {
        return i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? i11 != 5 ? "UNKNOWN ERROR" : "ERROR_CAMERA_SERVICE" : "ERROR_CAMERA_DEVICE" : "ERROR_CAMERA_DISABLED" : "ERROR_MAX_CAMERAS_IN_USE" : "ERROR_CAMERA_IN_USE" : "ERROR_NONE";
    }

    @NonNull
    static String R(@NonNull C10140u1 c10140u1) {
        StringBuilder sb2 = new StringBuilder("MeteringRepeating");
        c10140u1.getClass();
        sb2.append(c10140u1.hashCode());
        return sb2.toString();
    }

    @NonNull
    static String S(@NonNull androidx.camera.core.w wVar) {
        return wVar.n() + wVar.hashCode();
    }

    private boolean T() {
        int i11;
        ArrayList arrayList = new ArrayList();
        synchronized (this.f100974C) {
            try {
                i11 = this.f100997q.b() == 2 ? 1 : 0;
            } finally {
            }
        }
        for (a1.a aVar : this.f100981a.f()) {
            if (aVar.c() == null || aVar.c().get(0) != c1.b.METERING_REPEATING) {
                if (aVar.e() == null || aVar.c() == null) {
                    C.S.k("Camera2CameraImpl", "Invalid stream spec or capture types in " + aVar);
                    return false;
                }
                androidx.camera.core.impl.O0 d11 = aVar.d();
                androidx.camera.core.impl.b1<?> f7 = aVar.f();
                for (androidx.camera.core.impl.W w11 : d11.o()) {
                    D1 d12 = this.f100979H;
                    int i12 = f7.i();
                    arrayList.add(AbstractC5081a.a(androidx.camera.core.impl.V0.g(i11, i12, w11.h(), d12.i(i12)), f7.i(), w11.h(), aVar.e().b(), aVar.c(), aVar.e().d(), f7.I(null)));
                }
            }
        }
        this.f101004x.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put(this.f101004x.f(), Collections.singletonList(this.f101004x.d()));
        try {
            this.f100979H.g(i11, arrayList, hashMap, false, false);
            N("Surface combination with metering repeating supported!", null);
            return true;
        } catch (IllegalArgumentException e11) {
            N("Surface combination with metering repeating  not supported!", e11);
            return false;
        }
    }

    @NonNull
    private W0 U() {
        synchronized (this.f100974C) {
            try {
                if (this.f100975D == null) {
                    return new U0(this.f100978G, this.f100990j.l(), false);
                }
                return new A1(this.f100975D, this.f100990j, this.f100978G, this.f100983c, this.f100984d);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @SuppressLint({"MissingPermission"})
    private void V(boolean z11) {
        g gVar = this.f100989i;
        if (!z11) {
            gVar.b();
        }
        gVar.a();
        e eVar = this.f100980I;
        eVar.a();
        N("Opening camera.", null);
        a0(f.OPENING);
        try {
            this.f100982b.e(this.f100990j.b(), this.f100983c, L());
        } catch (SecurityException e11) {
            N("Unable to open camera due to " + e11.getMessage(), null);
            a0(f.REOPENING);
            gVar.c();
        } catch (C10348a e12) {
            N("Unable to open camera due to " + e12.getMessage(), null);
            if (e12.a() != 10001) {
                eVar.c();
            } else {
                b0(f.INITIALIZED, r.a.b(7, e12), true);
            }
        }
    }

    private void Y() {
        if (this.f101004x != null) {
            StringBuilder sb2 = new StringBuilder("MeteringRepeating");
            this.f101004x.getClass();
            sb2.append(this.f101004x.hashCode());
            String sb3 = sb2.toString();
            androidx.camera.core.impl.a1 a1Var = this.f100981a;
            a1Var.k(sb3);
            StringBuilder sb4 = new StringBuilder("MeteringRepeating");
            this.f101004x.getClass();
            sb4.append(this.f101004x.hashCode());
            a1Var.l(sb4.toString());
            this.f101004x.b();
            this.f101004x = null;
        }
    }

    @NonNull
    private ArrayList d0(@NonNull ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            androidx.camera.core.w wVar = (androidx.camera.core.w) it.next();
            arrayList2.add(new C10088d(S(wVar), wVar.getClass(), this.f101003w ? wVar.t() : wVar.r(), wVar.i(), wVar.e(), wVar.d(), wVar.f() == null ? null : R.c.b0(wVar)));
        }
        return arrayList2;
    }

    private void e0(@NonNull List list) {
        Size d11;
        boolean isEmpty = this.f100981a.d().isEmpty();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        Rational rational = null;
        while (it.hasNext()) {
            h hVar = (h) it.next();
            if (!this.f100981a.g(hVar.f())) {
                this.f100981a.j(hVar.f(), hVar.b(), hVar.e(), hVar.c(), hVar.a());
                arrayList.add(hVar.f());
                if (hVar.g() == C.Y.class && (d11 = hVar.d()) != null) {
                    rational = new Rational(d11.getWidth(), d11.getHeight());
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        N("Use cases [" + TextUtils.join(", ", arrayList) + "] now ATTACHED", null);
        if (isEmpty) {
            this.f100988h.N(true);
            this.f100988h.H();
        }
        I();
        i0();
        h0();
        Z();
        f fVar = this.f100985e;
        f fVar2 = f.OPENED;
        if (fVar == fVar2) {
            W();
        } else {
            int ordinal = this.f100985e.ordinal();
            if (ordinal == 2 || ordinal == 3) {
                f0(false);
            } else if (ordinal != 4) {
                N("open() ignored due to being in state: " + this.f100985e, null);
            } else {
                a0(f.REOPENING);
                if (!this.f100994n.isEmpty() && !this.f101002v && this.f100992l == 0) {
                    x2.i.f("Camera Device should be open if session close is not complete", this.f100991k != null);
                    a0(fVar2);
                    W();
                }
            }
        }
        if (rational != null) {
            this.f100988h.O(rational);
        }
    }

    private void i0() {
        Iterator<androidx.camera.core.impl.b1<?>> it = this.f100981a.e().iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            z11 |= it.next().r();
        }
        this.f100988h.f101348l.e(z11);
    }

    public static /* synthetic */ void r(L l11, b.a aVar) {
        l11.getClass();
        try {
            ArrayList arrayList = new ArrayList(l11.f100981a.c().c().c());
            arrayList.add(l11.f101005y.a());
            arrayList.add(new J(l11, aVar));
            l11.f100982b.e(l11.f100990j.b(), l11.f100983c, K0.a(arrayList));
        } catch (SecurityException | C10348a e11) {
            l11.N("Unable to open camera for configAndClose: " + e11.getMessage(), e11);
            aVar.e(e11);
        }
    }

    public static /* synthetic */ void s(final L l11, final b.a aVar) {
        l11.getClass();
        try {
            l11.f100983c.execute(new Runnable() { // from class: v.A
                @Override // java.lang.Runnable
                public final void run() {
                    L.y(L.this, aVar);
                }
            });
        } catch (RejectedExecutionException unused) {
            aVar.e(new RuntimeException("Unable to check if MeteringRepeating is attached. Camera executor shut down."));
        }
    }

    public static void t(L l11) {
        l11.f101002v = false;
        l11.f101001u = false;
        l11.N("OpenCameraConfigAndClose is done, state: " + l11.f100985e, null);
        int ordinal = l11.f100985e.ordinal();
        if (ordinal == 1 || ordinal == 4) {
            x2.i.f(null, l11.f100994n.isEmpty());
            l11.P();
            return;
        }
        if (ordinal != 6) {
            l11.N("OpenCameraConfigAndClose finished while in state: " + l11.f100985e, null);
        } else {
            int i11 = l11.f100992l;
            if (i11 == 0) {
                l11.g0(false);
            } else {
                l11.N("OpenCameraConfigAndClose in error: ".concat(Q(i11)), null);
                l11.f100989i.c();
            }
        }
    }

    public static void u(L l11, String str) {
        l11.getClass();
        l11.N("Use case " + str + " INACTIVE", null);
        l11.f100981a.l(str);
        l11.h0();
    }

    public static void v(L l11, String str, androidx.camera.core.impl.O0 o02, androidx.camera.core.impl.b1 b1Var, androidx.camera.core.impl.T0 t02, ArrayList arrayList) {
        l11.getClass();
        l11.N("Use case " + str + " UPDATED", null);
        l11.f100981a.m(str, o02, b1Var, t02, arrayList);
        l11.h0();
    }

    public static void w(L l11, ArrayList arrayList) {
        l11.getClass();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            h hVar = (h) it.next();
            if (l11.f100981a.g(hVar.f())) {
                l11.f100981a.h(hVar.f());
                arrayList2.add(hVar.f());
                if (hVar.g() == C.Y.class) {
                    z11 = true;
                }
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        l11.N("Use cases [" + TextUtils.join(", ", arrayList2) + "] now DETACHED for camera", null);
        if (z11) {
            l11.f100988h.O(null);
        }
        l11.I();
        if (l11.f100981a.e().isEmpty()) {
            l11.f100988h.f101348l.e(false);
        } else {
            l11.i0();
        }
        if (!l11.f100981a.d().isEmpty()) {
            l11.h0();
            l11.Z();
            if (l11.f100985e == f.OPENED) {
                l11.W();
                return;
            }
            return;
        }
        l11.f100988h.u();
        l11.Z();
        l11.f100988h.N(false);
        l11.f100993m = l11.U();
        l11.N("Closing camera.", null);
        switch (l11.f100985e.ordinal()) {
            case 3:
                x2.i.f(null, l11.f100991k == null);
                l11.a0(f.INITIALIZED);
                break;
            case 4:
            default:
                l11.N("close() ignored due to being in state: " + l11.f100985e, null);
                break;
            case 5:
            case 6:
            case 7:
                boolean z12 = l11.f100989i.a() || l11.f100980I.b();
                l11.f100980I.a();
                l11.a0(f.CLOSING);
                if (z12) {
                    x2.i.f(null, l11.f100994n.isEmpty());
                    l11.K();
                    break;
                }
                break;
            case 8:
            case 9:
                l11.a0(f.CLOSING);
                l11.J();
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void x(final L l11) {
        l11.getClass();
        try {
            if (((Boolean) androidx.concurrent.futures.b.a(new b.c() { // from class: v.y
                @Override // androidx.concurrent.futures.b.c
                public final Object c(b.a aVar) {
                    L.s(L.this, aVar);
                    return "isMeteringRepeatingAttached";
                }
            }).get()).booleanValue()) {
                androidx.camera.core.impl.O0 e11 = l11.f101004x.e();
                androidx.camera.core.impl.b1<?> f7 = l11.f101004x.f();
                l11.f100983c.execute(new RunnableC10077H(l11, R(l11.f101004x), e11, f7, null, Collections.singletonList(c1.b.METERING_REPEATING)));
            }
        } catch (InterruptedException | ExecutionException e12) {
            throw new RuntimeException("Unable to check if MeteringRepeating is attached.", e12);
        }
    }

    public static /* synthetic */ void y(L l11, b.a aVar) {
        C10140u1 c10140u1 = l11.f101004x;
        if (c10140u1 == null) {
            aVar.c(Boolean.FALSE);
        } else {
            aVar.c(Boolean.valueOf(l11.f100981a.g(R(c10140u1))));
        }
    }

    public static void z(L l11, String str, androidx.camera.core.impl.O0 o02, androidx.camera.core.impl.b1 b1Var, androidx.camera.core.impl.T0 t02, ArrayList arrayList) {
        l11.getClass();
        l11.N("Use case " + str + " ACTIVE", null);
        l11.f100981a.i(str, o02, b1Var, t02, arrayList);
        l11.f100981a.m(str, o02, b1Var, t02, arrayList);
        l11.h0();
    }

    final void J() {
        x2.i.f("closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: " + this.f100985e + " (error: " + Q(this.f100992l) + ")", this.f100985e == f.CLOSING || this.f100985e == f.RELEASING || (this.f100985e == f.REOPENING && this.f100992l != 0));
        Z();
        this.f100993m.g();
    }

    final void M(@NonNull String str) {
        N(str, null);
    }

    final androidx.camera.core.impl.O0 O(@NonNull androidx.camera.core.impl.W w11) {
        for (androidx.camera.core.impl.O0 o02 : this.f100981a.d()) {
            if (o02.o().contains(w11)) {
                return o02;
            }
        }
        return null;
    }

    final void P() {
        x2.i.f(null, this.f100985e == f.RELEASING || this.f100985e == f.CLOSING);
        x2.i.f(null, this.f100994n.isEmpty());
        this.f100991k = null;
        if (this.f100985e == f.CLOSING) {
            a0(f.INITIALIZED);
        } else {
            this.f100982b.g(this.f100996p);
            a0(f.RELEASED);
        }
    }

    final void W() {
        x2.i.f(null, this.f100985e == f.OPENED);
        O0.h c11 = this.f100981a.c();
        if (!c11.e()) {
            N("Unable to create capture session due to conflicting configurations", null);
            return;
        }
        if (!this.f100998r.i(this.f100991k.getId(), this.f100997q.c(this.f100991k.getId()))) {
            N("Unable to create capture session in camera operating mode = " + this.f100997q.b(), null);
            return;
        }
        HashMap hashMap = new HashMap();
        Collection<androidx.camera.core.impl.O0> d11 = this.f100981a.d();
        Collection<androidx.camera.core.impl.b1<?>> e11 = this.f100981a.e();
        T.a<Long> aVar = C1.f100872a;
        ArrayList arrayList = new ArrayList(e11);
        Iterator<androidx.camera.core.impl.O0> it = d11.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            androidx.camera.core.impl.O0 next = it.next();
            androidx.camera.core.impl.T f7 = next.f();
            T.a<Long> aVar2 = C1.f100872a;
            if (((androidx.camera.core.impl.A0) f7).d(aVar2) && next.o().size() != 1) {
                C.S.c("StreamUseCaseUtil", String.format("SessionConfig has stream use case but also contains %d surfaces, abort populateSurfaceToStreamUseCaseMapping().", Integer.valueOf(next.o().size())));
                break;
            }
            if (((androidx.camera.core.impl.A0) next.f()).d(aVar2)) {
                int i11 = 0;
                for (androidx.camera.core.impl.O0 o02 : d11) {
                    if (((androidx.camera.core.impl.b1) arrayList.get(i11)).N() == c1.b.METERING_REPEATING) {
                        x2.i.f("MeteringRepeating should contain a surface", !o02.o().isEmpty());
                        hashMap.put(o02.o().get(0), 1L);
                    } else if (((androidx.camera.core.impl.A0) o02.f()).d(aVar2) && !o02.o().isEmpty()) {
                        hashMap.put(o02.o().get(0), (Long) ((androidx.camera.core.impl.A0) o02.f()).a(aVar2));
                    }
                    i11++;
                }
            }
        }
        this.f100993m.a(hashMap);
        W0 w02 = this.f100993m;
        androidx.camera.core.impl.O0 c12 = c11.c();
        CameraDevice cameraDevice = this.f100991k;
        cameraDevice.getClass();
        I.k.b(w02.c(c12, cameraDevice, this.f101006z.a()), new a(w02), this.f100983c);
    }

    final void X(@NonNull androidx.camera.core.impl.O0 o02) {
        ScheduledExecutorService e11 = H.c.e();
        O0.d d11 = o02.d();
        if (d11 != null) {
            N("Posting surface closed", new Throwable());
            e11.execute(new IU.e(6, d11, o02));
        }
    }

    final void Z() {
        x2.i.f(null, this.f100993m != null);
        N("Resetting Capture Session", null);
        W0 w02 = this.f100993m;
        androidx.camera.core.impl.O0 b11 = w02.b();
        List<androidx.camera.core.impl.Q> h11 = w02.h();
        W0 U10 = U();
        this.f100993m = U10;
        U10.d(b11);
        this.f100993m.e(h11);
        if (this.f100985e.ordinal() != 8) {
            N("Skipping Capture Session state check due to current camera state: " + this.f100985e + " and previous session status: " + w02.f(), null);
        } else if (this.f100999s && w02.f()) {
            N("Close camera before creating new session", null);
            a0(f.REOPENING_QUIRK);
        }
        if (this.f101000t && w02.f()) {
            N("ConfigAndClose is required when close the camera.", null);
            this.f101001u = true;
        }
        w02.close();
        com.google.common.util.concurrent.m release = w02.release();
        N("Releasing session in state " + this.f100985e.name(), null);
        this.f100994n.put(w02, release);
        I.k.b(release, new K(this, w02), H.c.b());
    }

    final void a0(@NonNull f fVar) {
        b0(fVar, null, true);
    }

    final void b0(@NonNull f fVar, r.a aVar, boolean z11) {
        I.a aVar2;
        N("Transitioning camera internal state: " + this.f100985e + " --> " + fVar, null);
        if (U4.a.b()) {
            U4.a.c(fVar.ordinal(), "CX:C2State[" + this + "]");
            if (aVar != null) {
                this.f100995o++;
            }
            if (this.f100995o > 0) {
                U4.a.c(aVar != null ? aVar.d() : 0, "CX:C2StateErrorCode[" + this + "]");
            }
        }
        this.f100985e = fVar;
        switch (fVar.ordinal()) {
            case 0:
                aVar2 = I.a.RELEASED;
                break;
            case 1:
                aVar2 = I.a.RELEASING;
                break;
            case 2:
                aVar2 = I.a.CLOSED;
                break;
            case 3:
                aVar2 = I.a.PENDING_OPEN;
                break;
            case 4:
            case 5:
                aVar2 = I.a.CLOSING;
                break;
            case 6:
            case 7:
                aVar2 = I.a.OPENING;
                break;
            case 8:
                aVar2 = I.a.OPEN;
                break;
            case 9:
                aVar2 = I.a.CONFIGURED;
                break;
            default:
                throw new IllegalStateException("Unknown state: " + fVar);
        }
        this.f100998r.d(this, aVar2, z11);
        this.f100986f.a(aVar2);
        this.f100987g.b(aVar2, aVar);
    }

    @Override // androidx.camera.core.impl.I
    @NonNull
    public final InterfaceC5129y0<I.a> c() {
        return this.f100986f;
    }

    final void c0(@NonNull List<androidx.camera.core.impl.Q> list) {
        int k11;
        int g10;
        ArrayList arrayList = new ArrayList();
        for (androidx.camera.core.impl.Q q11 : list) {
            Q.a j11 = Q.a.j(q11);
            if (q11.j() == 5 && q11.c() != null) {
                j11.o(q11.c());
            }
            if (q11.h().isEmpty() && q11.l()) {
                if (((HashSet) j11.l()).isEmpty()) {
                    Iterator<androidx.camera.core.impl.O0> it = this.f100981a.b().iterator();
                    while (it.hasNext()) {
                        androidx.camera.core.impl.Q k12 = it.next().k();
                        List<androidx.camera.core.impl.W> h11 = k12.h();
                        if (!h11.isEmpty()) {
                            if (k12.g() != 0 && (g10 = k12.g()) != 0) {
                                j11.d(androidx.camera.core.impl.b1.f38265E, Integer.valueOf(g10));
                            }
                            if (k12.k() != 0 && (k11 = k12.k()) != 0) {
                                j11.d(androidx.camera.core.impl.b1.f38266F, Integer.valueOf(k11));
                            }
                            Iterator<androidx.camera.core.impl.W> it2 = h11.iterator();
                            while (it2.hasNext()) {
                                j11.f(it2.next());
                            }
                        }
                    }
                    if (((HashSet) j11.l()).isEmpty()) {
                        C.S.k("Camera2CameraImpl", "Unable to find a repeating surface to attach to CaptureConfig");
                    }
                } else {
                    C.S.k("Camera2CameraImpl", "The capture config builder already has surface inside.");
                }
            }
            arrayList.add(j11.h());
        }
        N("Issue capture request", null);
        this.f100993m.e(arrayList);
    }

    @Override // androidx.camera.core.w.b
    public final void d(@NonNull androidx.camera.core.w wVar) {
        wVar.getClass();
        final String S11 = S(wVar);
        final androidx.camera.core.impl.O0 t2 = this.f101003w ? wVar.t() : wVar.r();
        final androidx.camera.core.impl.b1<?> i11 = wVar.i();
        final androidx.camera.core.impl.T0 d11 = wVar.d();
        final ArrayList b02 = wVar.f() == null ? null : R.c.b0(wVar);
        this.f100983c.execute(new Runnable() { // from class: v.D
            @Override // java.lang.Runnable
            public final void run() {
                L.v(L.this, S11, t2, i11, d11, b02);
            }
        });
    }

    @Override // androidx.camera.core.impl.I
    @NonNull
    public final androidx.camera.core.impl.H e() {
        return this.f100990j;
    }

    final void f0(boolean z11) {
        N("Attempting to force open the camera.", null);
        if (this.f100998r.h(this)) {
            V(z11);
        } else {
            N("No cameras available. Waiting for available camera before opening camera.", null);
            a0(f.PENDING_OPEN);
        }
    }

    @Override // androidx.camera.core.impl.I
    public final void g(androidx.camera.core.impl.A a11) {
        if (a11 == null) {
            a11 = androidx.camera.core.impl.D.a();
        }
        androidx.camera.core.impl.Q0 H11 = a11.H();
        this.f100973B = a11;
        synchronized (this.f100974C) {
            this.f100975D = H11;
        }
    }

    final void g0(boolean z11) {
        N("Attempting to open the camera.", null);
        if (this.f100996p.b() && this.f100998r.h(this)) {
            V(z11);
        } else {
            N("No cameras available. Waiting for available camera before opening camera.", null);
            a0(f.PENDING_OPEN);
        }
    }

    @Override // androidx.camera.core.impl.I
    public final void h(@NonNull ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        if (arrayList2.isEmpty()) {
            return;
        }
        final ArrayList arrayList3 = new ArrayList(d0(arrayList2));
        Iterator it = new ArrayList(arrayList2).iterator();
        while (it.hasNext()) {
            androidx.camera.core.w wVar = (androidx.camera.core.w) it.next();
            String S11 = S(wVar);
            HashSet hashSet = this.f100972A;
            if (hashSet.contains(S11)) {
                wVar.K();
                hashSet.remove(S11);
            }
        }
        this.f100983c.execute(new Runnable() { // from class: v.G
            @Override // java.lang.Runnable
            public final void run() {
                L.w(L.this, arrayList3);
            }
        });
    }

    final void h0() {
        O0.h a11 = this.f100981a.a();
        boolean e11 = a11.e();
        C10132s c10132s = this.f100988h;
        if (!e11) {
            c10132s.P(1);
            this.f100993m.d(c10132s.C());
        } else {
            c10132s.P(a11.c().p());
            a11.b(c10132s.C());
            this.f100993m.d(a11.c());
        }
    }

    @Override // androidx.camera.core.impl.I
    public final void i(boolean z11) {
        this.f101003w = z11;
    }

    @Override // androidx.camera.core.w.b
    public final void j(@NonNull androidx.camera.core.w wVar) {
        final String S11 = S(wVar);
        final androidx.camera.core.impl.O0 t2 = this.f101003w ? wVar.t() : wVar.r();
        final androidx.camera.core.impl.b1<?> i11 = wVar.i();
        final androidx.camera.core.impl.T0 d11 = wVar.d();
        final ArrayList b02 = wVar.f() == null ? null : R.c.b0(wVar);
        this.f100983c.execute(new Runnable() { // from class: v.F
            @Override // java.lang.Runnable
            public final void run() {
                L.z(L.this, S11, t2, i11, d11, b02);
            }
        });
    }

    @Override // androidx.camera.core.impl.I
    @NonNull
    public final androidx.camera.core.impl.E k() {
        return this.f100988h;
    }

    @Override // androidx.camera.core.impl.I
    @NonNull
    public final androidx.camera.core.impl.A l() {
        return this.f100973B;
    }

    @Override // androidx.camera.core.w.b
    public final void m(@NonNull androidx.camera.core.w wVar) {
        wVar.getClass();
        this.f100983c.execute(new RunnableC10077H(this, S(wVar), this.f101003w ? wVar.t() : wVar.r(), wVar.i(), wVar.d(), wVar.f() == null ? null : R.c.b0(wVar)));
    }

    @Override // androidx.camera.core.impl.I
    public final void n(final boolean z11) {
        this.f100983c.execute(new Runnable() { // from class: v.v
            @Override // java.lang.Runnable
            public final void run() {
                L l11 = L.this;
                boolean z12 = z11;
                l11.f100976E = z12;
                if (z12 && l11.f100985e == L.f.PENDING_OPEN) {
                    l11.f0(false);
                }
            }
        });
    }

    @Override // androidx.camera.core.impl.I
    public final void o(@NonNull ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        if (arrayList2.isEmpty()) {
            return;
        }
        C10132s c10132s = this.f100988h;
        c10132s.H();
        Iterator it = new ArrayList(arrayList2).iterator();
        while (it.hasNext()) {
            androidx.camera.core.w wVar = (androidx.camera.core.w) it.next();
            String S11 = S(wVar);
            HashSet hashSet = this.f100972A;
            if (!hashSet.contains(S11)) {
                hashSet.add(S11);
                wVar.J();
                wVar.H();
            }
        }
        final ArrayList arrayList3 = new ArrayList(d0(arrayList2));
        try {
            this.f100983c.execute(new Runnable() { // from class: v.C
                @Override // java.lang.Runnable
                public final void run() {
                    L.B(L.this, arrayList3);
                }
            });
        } catch (RejectedExecutionException e11) {
            N("Unable to attach use cases.", e11);
            c10132s.u();
        }
    }

    @Override // androidx.camera.core.w.b
    public final void q(@NonNull androidx.camera.core.w wVar) {
        final String S11 = S(wVar);
        this.f100983c.execute(new Runnable() { // from class: v.E
            @Override // java.lang.Runnable
            public final void run() {
                L.u(L.this, S11);
            }
        });
    }

    @NonNull
    public final String toString() {
        return String.format(Locale.US, "Camera@%x[id=%s]", Integer.valueOf(hashCode()), this.f100990j.b());
    }
}
