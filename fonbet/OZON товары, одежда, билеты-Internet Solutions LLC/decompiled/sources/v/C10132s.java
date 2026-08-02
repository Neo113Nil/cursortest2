package v;

import B.j;
import C.I;
import C.InterfaceC2689i;
import E.InterfaceC2894j;
import E0.RunnableC2930k;
import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.util.ArrayMap;
import android.util.Rational;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.AbstractC5111p;
import androidx.camera.core.impl.E;
import androidx.camera.core.impl.InterfaceC5130z;
import androidx.camera.core.impl.O0;
import androidx.camera.core.impl.Q;
import androidx.camera.core.impl.T;
import androidx.concurrent.futures.b;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicLong;
import u.C9887a;
import v.C10132s;
import v.L;
import w.C10368u;
import z.C10943a;
import z.C10944b;

/* renamed from: v.s, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10132s implements androidx.camera.core.impl.E {

    /* renamed from: b, reason: collision with root package name */
    final b f101338b;

    /* renamed from: c, reason: collision with root package name */
    final Executor f101339c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f101340d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private final C10368u f101341e;

    /* renamed from: f, reason: collision with root package name */
    private final E.d f101342f;

    /* renamed from: g, reason: collision with root package name */
    private final O0.b f101343g;

    /* renamed from: h, reason: collision with root package name */
    private final C10131r1 f101344h;

    /* renamed from: i, reason: collision with root package name */
    private final a2 f101345i;

    /* renamed from: j, reason: collision with root package name */
    private final U1 f101346j;

    /* renamed from: k, reason: collision with root package name */
    private final C10087c1 f101347k;

    /* renamed from: l, reason: collision with root package name */
    d2 f101348l;

    /* renamed from: m, reason: collision with root package name */
    private final B.g f101349m;

    /* renamed from: n, reason: collision with root package name */
    private final X f101350n;

    /* renamed from: o, reason: collision with root package name */
    private final W1 f101351o;

    /* renamed from: p, reason: collision with root package name */
    private int f101352p;

    /* renamed from: q, reason: collision with root package name */
    private I.i f101353q;

    /* renamed from: r, reason: collision with root package name */
    private volatile boolean f101354r;

    /* renamed from: s, reason: collision with root package name */
    private volatile int f101355s;

    /* renamed from: t, reason: collision with root package name */
    private final C10943a f101356t;

    /* renamed from: u, reason: collision with root package name */
    private final C10944b f101357u;

    /* renamed from: v, reason: collision with root package name */
    private final AtomicLong f101358v;

    /* renamed from: w, reason: collision with root package name */
    @NonNull
    private volatile com.google.common.util.concurrent.m<Void> f101359w;

    /* renamed from: x, reason: collision with root package name */
    private int f101360x;

    /* renamed from: y, reason: collision with root package name */
    private long f101361y;

    /* renamed from: z, reason: collision with root package name */
    private final a f101362z;

    /* renamed from: v.s$a */
    static final class a extends AbstractC5111p {

        /* renamed from: a, reason: collision with root package name */
        HashSet f101363a;

        /* renamed from: b, reason: collision with root package name */
        ArrayMap f101364b;

        @Override // androidx.camera.core.impl.AbstractC5111p
        public final void a(int i11) {
            Iterator it = this.f101363a.iterator();
            while (it.hasNext()) {
                AbstractC5111p abstractC5111p = (AbstractC5111p) it.next();
                try {
                    ((Executor) this.f101364b.get(abstractC5111p)).execute(new RunnableC2930k(i11, 2, abstractC5111p));
                } catch (RejectedExecutionException e11) {
                    C.S.d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCancelled.", e11);
                }
            }
        }

        @Override // androidx.camera.core.impl.AbstractC5111p
        public final void b(final int i11, @NonNull final InterfaceC5130z interfaceC5130z) {
            Iterator it = this.f101363a.iterator();
            while (it.hasNext()) {
                final AbstractC5111p abstractC5111p = (AbstractC5111p) it.next();
                try {
                    ((Executor) this.f101364b.get(abstractC5111p)).execute(new Runnable() { // from class: v.r
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC5111p.this.b(i11, interfaceC5130z);
                        }
                    });
                } catch (RejectedExecutionException e11) {
                    C.S.d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCompleted.", e11);
                }
            }
        }

        @Override // androidx.camera.core.impl.AbstractC5111p
        public final void c(final int i11, @NonNull final androidx.camera.core.impl.r rVar) {
            Iterator it = this.f101363a.iterator();
            while (it.hasNext()) {
                final AbstractC5111p abstractC5111p = (AbstractC5111p) it.next();
                try {
                    ((Executor) this.f101364b.get(abstractC5111p)).execute(new Runnable() { // from class: v.q
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC5111p.this.c(i11, rVar);
                        }
                    });
                } catch (RejectedExecutionException e11) {
                    C.S.d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureFailed.", e11);
                }
            }
        }
    }

    /* renamed from: v.s$b */
    static final class b extends CameraCaptureSession.CaptureCallback {

        /* renamed from: a, reason: collision with root package name */
        final HashSet f101365a = new HashSet();

        /* renamed from: b, reason: collision with root package name */
        private final Executor f101366b;

        b(@NonNull Executor executor) {
            this.f101366b = executor;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull final TotalCaptureResult totalCaptureResult) {
            this.f101366b.execute(new Runnable() { // from class: v.t
                @Override // java.lang.Runnable
                public final void run() {
                    C10132s.b bVar = C10132s.b.this;
                    HashSet hashSet = new HashSet();
                    HashSet hashSet2 = bVar.f101365a;
                    Iterator it = hashSet2.iterator();
                    while (it.hasNext()) {
                        C10132s.c cVar = (C10132s.c) it.next();
                        if (cVar.a(totalCaptureResult)) {
                            hashSet.add(cVar);
                        }
                    }
                    if (hashSet.isEmpty()) {
                        return;
                    }
                    hashSet2.removeAll(hashSet);
                }
            });
        }
    }

    /* renamed from: v.s$c */
    public interface c {
        boolean a(@NonNull TotalCaptureResult totalCaptureResult);
    }

    C10132s(@NonNull C10368u c10368u, @NonNull ScheduledExecutorService scheduledExecutorService, @NonNull Executor executor, @NonNull E.d dVar, @NonNull androidx.camera.core.impl.I0 i02) {
        O0.b bVar = new O0.b();
        this.f101343g = bVar;
        this.f101352p = 0;
        this.f101354r = false;
        this.f101355s = 2;
        this.f101358v = new AtomicLong(0L);
        this.f101359w = I.k.h(null);
        this.f101360x = 1;
        this.f101361y = 0L;
        a aVar = new a();
        aVar.f101363a = new HashSet();
        aVar.f101364b = new ArrayMap();
        this.f101362z = aVar;
        this.f101341e = c10368u;
        this.f101342f = dVar;
        this.f101339c = executor;
        this.f101351o = new W1(executor);
        b bVar2 = new b(executor);
        this.f101338b = bVar2;
        bVar.v(this.f101360x);
        bVar.g(P0.e(bVar2));
        bVar.g(aVar);
        this.f101347k = new C10087c1(this, executor);
        this.f101344h = new C10131r1(this, scheduledExecutorService, executor, i02);
        this.f101345i = new a2(this, c10368u, executor);
        this.f101346j = new U1(this, c10368u, executor);
        this.f101348l = new d2(c10368u);
        this.f101356t = new C10943a(i02);
        this.f101357u = new C10944b(i02);
        this.f101349m = new B.g(this, executor);
        this.f101350n = new X(this, c10368u, i02, executor, scheduledExecutorService);
    }

    public static int E(@NonNull C10368u c10368u, int i11) {
        int[] iArr = (int[]) c10368u.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        return K(iArr, i11) ? i11 : K(iArr, 1) ? 1 : 0;
    }

    private boolean I() {
        int i11;
        synchronized (this.f101340d) {
            i11 = this.f101352p;
        }
        return i11 > 0;
    }

    private static boolean K(int[] iArr, int i11) {
        for (int i12 : iArr) {
            if (i11 == i12) {
                return true;
            }
        }
        return false;
    }

    static boolean L(@NonNull TotalCaptureResult totalCaptureResult, long j11) {
        Long l11;
        if (totalCaptureResult.getRequest() == null) {
            return false;
        }
        Object tag = totalCaptureResult.getRequest().getTag();
        return (tag instanceof androidx.camera.core.impl.X0) && (l11 = (Long) ((androidx.camera.core.impl.X0) tag).c("CameraControlSessionUpdateId")) != null && l11.longValue() >= j11;
    }

    public static void q(C10132s c10132s, AbstractC5111p abstractC5111p) {
        a aVar = c10132s.f101362z;
        aVar.f101363a.remove(abstractC5111p);
        aVar.f101364b.remove(abstractC5111p);
    }

    public static void r(C10132s c10132s, Executor executor, AbstractC5111p abstractC5111p) {
        a aVar = c10132s.f101362z;
        aVar.f101363a.add(abstractC5111p);
        aVar.f101364b.put(abstractC5111p, executor);
    }

    public static com.google.common.util.concurrent.m s(C10132s c10132s, List list, int i11, int i12, int i13) {
        return I.k.i(c10132s.f101350n.a(i11, i12, i13).d(i12, list));
    }

    final int A() {
        Integer num = (Integer) this.f101341e.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AWB);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public final I.i B() {
        return this.f101353q;
    }

    @NonNull
    public final androidx.camera.core.impl.O0 C() {
        this.f101343g.v(this.f101360x);
        O0.b bVar = this.f101343g;
        C9887a.C2193a c2193a = new C9887a.C2193a();
        CaptureRequest.Key key = CaptureRequest.CONTROL_MODE;
        int i11 = 1;
        T.b bVar2 = T.b.REQUIRED;
        c2193a.f(key, 1, bVar2);
        this.f101344h.e(c2193a);
        this.f101356t.a(c2193a);
        this.f101345i.f101201e.d(c2193a);
        int i12 = this.f101344h.k() ? 5 : 1;
        if (this.f101354r) {
            c2193a.f(CaptureRequest.FLASH_MODE, 2, bVar2);
        } else {
            int i13 = this.f101355s;
            if (i13 == 0) {
                i12 = this.f101357u.a();
            } else if (i13 == 1) {
                i12 = 3;
            } else if (i13 == 2) {
                i12 = 1;
            }
        }
        c2193a.f(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(E(this.f101341e, i12)), bVar2);
        CaptureRequest.Key key2 = CaptureRequest.CONTROL_AWB_MODE;
        int[] iArr = (int[]) this.f101341e.a(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
        if (iArr == null || (!K(iArr, 1) && !K(iArr, 1))) {
            i11 = 0;
        }
        c2193a.f(key2, Integer.valueOf(i11), bVar2);
        this.f101347k.b(c2193a);
        this.f101349m.e(c2193a);
        bVar.r(c2193a.c());
        this.f101343g.j(Long.valueOf(this.f101361y), "CameraControlSessionUpdateId");
        return this.f101343g.k();
    }

    final int D(int i11) {
        return E(this.f101341e, i11);
    }

    final int F(int i11) {
        int[] iArr = (int[]) this.f101341e.a(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (K(iArr, i11)) {
            return i11;
        }
        if (K(iArr, 4)) {
            return 4;
        }
        return K(iArr, 1) ? 1 : 0;
    }

    @NonNull
    public final U1 G() {
        return this.f101346j;
    }

    final void H() {
        synchronized (this.f101340d) {
            this.f101352p++;
        }
    }

    public final boolean J() {
        int d11 = this.f101351o.d();
        C.S.a("Camera2CameraControlImp", "isInVideoUsage: mVideoUsageControl value = " + d11);
        return d11 > 0;
    }

    final boolean M() {
        return this.f101354r;
    }

    final void N(boolean z11) {
        C.S.a("Camera2CameraControlImp", "setActive: isActive = " + z11);
        this.f101344h.l(z11);
        this.f101345i.e(z11);
        this.f101346j.d(z11);
        this.f101347k.a(z11);
        this.f101349m.h(z11);
        if (z11) {
            return;
        }
        this.f101353q = null;
        this.f101351o.f();
    }

    public final void O(Rational rational) {
        this.f101344h.m(rational);
    }

    final void P(int i11) {
        this.f101360x = i11;
        this.f101344h.n(i11);
        this.f101350n.d(this.f101360x);
    }

    final void Q(List<androidx.camera.core.impl.Q> list) {
        L.d dVar = (L.d) this.f101342f;
        dVar.getClass();
        list.getClass();
        L.this.c0(list);
    }

    final long R() {
        this.f101361y = this.f101358v.getAndIncrement();
        L.this.h0();
        return this.f101361y;
    }

    @Override // C.InterfaceC2689i
    @NonNull
    public final com.google.common.util.concurrent.m<Void> a(float f7) {
        return !I() ? I.k.f(new InterfaceC2689i.a("Camera is not active.")) : I.k.i(this.f101345i.f(f7));
    }

    @Override // androidx.camera.core.impl.E
    public final void b(int i11) {
        if (!I()) {
            C.S.k("Camera2CameraControlImp", "Camera is not active.");
            return;
        }
        this.f101355s = i11;
        C.S.a("Camera2CameraControlImp", "setFlashMode: mFlashMode = " + this.f101355s);
        d2 d2Var = this.f101348l;
        boolean z11 = true;
        if (this.f101355s != 1 && this.f101355s != 0) {
            z11 = false;
        }
        d2Var.d(z11);
        this.f101359w = I.k.i(androidx.concurrent.futures.b.a(new C10112l(this)));
    }

    @Override // androidx.camera.core.impl.E
    public final void c() {
        this.f101351o.c();
    }

    @Override // C.InterfaceC2689i
    @NonNull
    public final com.google.common.util.concurrent.m<Void> d(float f7) {
        return !I() ? I.k.f(new InterfaceC2689i.a("Camera is not active.")) : I.k.i(this.f101345i.g(f7));
    }

    @Override // C.InterfaceC2689i
    @NonNull
    public final com.google.common.util.concurrent.m<Void> e(boolean z11) {
        return !I() ? I.k.f(new InterfaceC2689i.a("Camera is not active.")) : I.k.i(this.f101346j.b(z11));
    }

    @Override // C.InterfaceC2689i
    @NonNull
    public final com.google.common.util.concurrent.m<C.D> f(@NonNull final C.C c11) {
        if (!I()) {
            return I.k.f(new InterfaceC2689i.a("Camera is not active."));
        }
        final C10131r1 c10131r1 = this.f101344h;
        c10131r1.getClass();
        return I.k.i(androidx.concurrent.futures.b.a(new b.c() { // from class: v.k1
            @Override // androidx.concurrent.futures.b.c
            public final Object c(final b.a aVar) {
                final C10131r1 c10131r12 = C10131r1.this;
                c10131r12.getClass();
                final C.C c12 = c11;
                c10131r12.f101318b.execute(new Runnable() { // from class: v.l1
                    @Override // java.lang.Runnable
                    public final void run() {
                        C.C c13 = c12;
                        C10131r1.d(C10131r1.this, aVar, c13);
                    }
                });
                return "startFocusAndMetering";
            }
        }));
    }

    @Override // androidx.camera.core.impl.E
    public final void g() {
        this.f101351o.e();
    }

    @Override // androidx.camera.core.impl.E
    public final void h(I.i iVar) {
        this.f101353q = iVar;
    }

    @Override // androidx.camera.core.impl.E
    public final void i(@NonNull androidx.camera.core.impl.T t2) {
        this.f101349m.d(j.a.e(t2).d()).a(new RunnableC10106j(), H.c.b());
    }

    @Override // androidx.camera.core.impl.E
    @NonNull
    public final com.google.common.util.concurrent.m j(final int i11, final int i12, @NonNull final List list) {
        if (!I()) {
            C.S.k("Camera2CameraControlImp", "Camera is not active.");
            return I.k.f(new InterfaceC2689i.a("Camera is not active."));
        }
        final int i13 = this.f101355s;
        I.d b11 = I.d.b(I.k.i(this.f101359w));
        I.a aVar = new I.a() { // from class: v.i
            @Override // I.a, qc.o
            public final com.google.common.util.concurrent.m apply(Object obj) {
                return C10132s.s(C10132s.this, list, i11, i13, i12);
            }
        };
        Executor executor = this.f101339c;
        b11.getClass();
        return (I.d) I.k.n(b11, aVar, executor);
    }

    @Override // androidx.camera.core.impl.E
    @NonNull
    public final Rect k() {
        Rect rect = (Rect) this.f101341e.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        if ("robolectric".equals(Build.FINGERPRINT) && rect == null) {
            return new Rect(0, 0, 4000, AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS);
        }
        rect.getClass();
        return rect;
    }

    @Override // androidx.camera.core.impl.E
    @NonNull
    public final androidx.camera.core.impl.T l() {
        return this.f101349m.g();
    }

    @Override // androidx.camera.core.impl.E
    public final void m(@NonNull O0.b bVar) {
        this.f101348l.a(bVar);
    }

    @Override // androidx.camera.core.impl.E
    @NonNull
    public final com.google.common.util.concurrent.m<InterfaceC2894j> n(final int i11, final int i12) {
        if (!I()) {
            C.S.k("Camera2CameraControlImp", "Camera is not active.");
            return I.k.f(new InterfaceC2689i.a("Camera is not active."));
        }
        final int i13 = this.f101355s;
        I.d b11 = I.d.b(I.k.i(this.f101359w));
        I.a aVar = new I.a() { // from class: v.k
            @Override // I.a, qc.o
            public final com.google.common.util.concurrent.m apply(Object obj) {
                com.google.common.util.concurrent.m h11;
                h11 = I.k.h(C10132s.this.f101350n.b(i11, i13, i12));
                return h11;
            }
        };
        Executor executor = this.f101339c;
        b11.getClass();
        return (I.d) I.k.n(b11, aVar, executor);
    }

    @Override // androidx.camera.core.impl.E
    public final void o() {
        this.f101349m.f().a(new RunnableC10106j(), H.c.b());
    }

    final void t(@NonNull c cVar) {
        this.f101338b.f101365a.add(cVar);
    }

    final void u() {
        synchronized (this.f101340d) {
            try {
                int i11 = this.f101352p;
                if (i11 == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                this.f101352p = i11 - 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final void v(boolean z11) {
        this.f101354r = z11;
        if (!z11) {
            Q.a aVar = new Q.a();
            aVar.s(this.f101360x);
            aVar.t();
            C9887a.C2193a c2193a = new C9887a.C2193a();
            c2193a.e(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(E(this.f101341e, 1)));
            c2193a.e(CaptureRequest.FLASH_MODE, 0);
            aVar.e(c2193a.c());
            Q(Collections.singletonList(aVar.h()));
        }
        R();
    }

    @NonNull
    final Rect w() {
        return this.f101345i.f101201e.e();
    }

    @NonNull
    public final C10131r1 x() {
        return this.f101344h;
    }

    final int y() {
        Integer num = (Integer) this.f101341e.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    final int z() {
        Integer num = (Integer) this.f101341e.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
