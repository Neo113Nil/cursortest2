package v;

import B.j;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionShouldUseMrirQuirk;
import androidx.camera.core.impl.AbstractC5111p;
import androidx.camera.core.impl.C5082a0;
import androidx.camera.core.impl.InterfaceC5130z;
import androidx.camera.core.impl.O0;
import androidx.camera.core.impl.Q0;
import androidx.camera.core.impl.T;
import androidx.camera.core.impl.W;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p.InterfaceC8822a;
import u.C9887a;
import v.E1;

/* loaded from: classes8.dex */
final class A1 implements W0 {

    /* renamed from: n, reason: collision with root package name */
    private static ArrayList f100845n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    private static int f100846o = 0;

    /* renamed from: a, reason: collision with root package name */
    private final androidx.camera.core.impl.Q0 f100847a;

    /* renamed from: b, reason: collision with root package name */
    final Executor f100848b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f100849c;

    /* renamed from: d, reason: collision with root package name */
    private final U0 f100850d;

    /* renamed from: f, reason: collision with root package name */
    private androidx.camera.core.impl.O0 f100852f;

    /* renamed from: g, reason: collision with root package name */
    private E0 f100853g;

    /* renamed from: h, reason: collision with root package name */
    private androidx.camera.core.impl.O0 f100854h;

    /* renamed from: i, reason: collision with root package name */
    private b f100855i;

    /* renamed from: m, reason: collision with root package name */
    private int f100859m;

    /* renamed from: e, reason: collision with root package name */
    private List<androidx.camera.core.impl.W> f100851e = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    private volatile List<androidx.camera.core.impl.Q> f100856j = null;

    /* renamed from: k, reason: collision with root package name */
    private B.j f100857k = new j.a().d();

    /* renamed from: l, reason: collision with root package name */
    private B.j f100858l = new j.a().d();

    final class a implements I.c<Void> {
        a() {
        }

        @Override // I.c
        public final void onFailure(@NonNull Throwable th2) {
            C.S.d("ProcessingCaptureSession", "open session failed ", th2);
            A1 a12 = A1.this;
            a12.close();
            a12.release();
        }

        @Override // I.c
        public final /* bridge */ /* synthetic */ void onSuccess(Void r12) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static final class b {
        private static final /* synthetic */ b[] $VALUES;
        public static final b DE_INITIALIZED;
        public static final b ON_CAPTURE_SESSION_ENDED;
        public static final b ON_CAPTURE_SESSION_STARTED;
        public static final b SESSION_INITIALIZED;
        public static final b UNINITIALIZED;

        static {
            b bVar = new b("UNINITIALIZED", 0);
            UNINITIALIZED = bVar;
            b bVar2 = new b("SESSION_INITIALIZED", 1);
            SESSION_INITIALIZED = bVar2;
            b bVar3 = new b("ON_CAPTURE_SESSION_STARTED", 2);
            ON_CAPTURE_SESSION_STARTED = bVar3;
            b bVar4 = new b("ON_CAPTURE_SESSION_ENDED", 3);
            ON_CAPTURE_SESSION_ENDED = bVar4;
            b bVar5 = new b("DE_INITIALIZED", 4);
            DE_INITIALIZED = bVar5;
            $VALUES = new b[]{bVar, bVar2, bVar3, bVar4, bVar5};
        }

        private b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    private static class c implements Q0.a {
        @Override // androidx.camera.core.impl.Q0.a
        public final void a() {
        }

        @Override // androidx.camera.core.impl.Q0.a
        public final void b() {
        }

        @Override // androidx.camera.core.impl.Q0.a
        public final void c(@NonNull InterfaceC5130z interfaceC5130z) {
        }

        @Override // androidx.camera.core.impl.Q0.a
        public final void onCaptureStarted() {
        }
    }

    A1(@NonNull androidx.camera.core.impl.Q0 q02, @NonNull Q q11, @NonNull x.c cVar, @NonNull Executor executor, @NonNull ScheduledExecutorService scheduledExecutorService) {
        this.f100859m = 0;
        this.f100850d = new U0(cVar, androidx.camera.camera2.internal.compat.quirk.b.b(CaptureSessionShouldUseMrirQuirk.class) != null);
        this.f100847a = q02;
        this.f100848b = executor;
        this.f100849c = scheduledExecutorService;
        this.f100855i = b.UNINITIALIZED;
        int i11 = f100846o;
        f100846o = i11 + 1;
        this.f100859m = i11;
        C.S.a("ProcessingCaptureSession", "New ProcessingCaptureSession (id=" + i11 + ")");
    }

    public static void i(A1 a12) {
        U0 u02 = a12.f100850d;
        if (a12.f100855i != b.SESSION_INITIALIZED) {
            return;
        }
        List<androidx.camera.core.impl.W> o11 = a12.f100854h.o();
        ArrayList arrayList = new ArrayList();
        for (androidx.camera.core.impl.W w11 : o11) {
            x2.i.a("Surface must be SessionProcessorSurface", w11 instanceof androidx.camera.core.impl.R0);
            arrayList.add((androidx.camera.core.impl.R0) w11);
        }
        a12.f100853g = new E0(u02, arrayList);
        C.S.a("ProcessingCaptureSession", "== onCaptureSessinStarted (id = " + a12.f100859m + ")");
        a12.f100847a.g();
        a12.f100855i = b.ON_CAPTURE_SESSION_STARTED;
        androidx.camera.core.impl.O0 o02 = a12.f100852f;
        if (o02 != null) {
            a12.d(o02);
        }
        if (a12.f100856j != null) {
            a12.e(a12.f100856j);
            a12.f100856j = null;
        }
    }

    public static /* synthetic */ void k(A1 a12, androidx.camera.core.impl.W w11) {
        C5082a0.a(a12.f100851e);
        if (w11 != null) {
            w11.e();
        }
    }

    public static com.google.common.util.concurrent.m l(final A1 a12, androidx.camera.core.impl.O0 o02, CameraDevice cameraDevice, E1.a aVar, List list) {
        androidx.camera.core.impl.B0 b02;
        StringBuilder sb2 = new StringBuilder("-- getSurfaces done, start init (id=");
        int i11 = a12.f100859m;
        sb2.append(i11);
        sb2.append(")");
        C.S.a("ProcessingCaptureSession", sb2.toString());
        if (a12.f100855i == b.DE_INITIALIZED) {
            return I.k.f(new IllegalStateException("SessionProcessorCaptureSession is closed."));
        }
        final androidx.camera.core.impl.W w11 = null;
        if (list.contains(null)) {
            return I.k.f(new W.a(o02.o().get(list.indexOf(null)), "Surface closed"));
        }
        androidx.camera.core.impl.B0 b03 = null;
        androidx.camera.core.impl.B0 b04 = null;
        androidx.camera.core.impl.B0 b05 = null;
        for (int i12 = 0; i12 < o02.o().size(); i12++) {
            androidx.camera.core.impl.W w12 = o02.o().get(i12);
            if (Objects.equals(w12.g(), C.Y.class) || Objects.equals(w12.g(), R.c.class)) {
                b03 = androidx.camera.core.impl.B0.a(w12.j().get(), w12.h(), w12.i());
            } else if (Objects.equals(w12.g(), C.I.class)) {
                b04 = androidx.camera.core.impl.B0.a(w12.j().get(), w12.h(), w12.i());
            } else if (Objects.equals(w12.g(), androidx.camera.core.h.class)) {
                b05 = androidx.camera.core.impl.B0.a(w12.j().get(), w12.h(), w12.i());
            }
        }
        if (o02.i() != null) {
            w11 = o02.i().f();
            b02 = androidx.camera.core.impl.B0.a(w11.j().get(), w11.h(), w11.i());
        } else {
            b02 = null;
        }
        a12.f100855i = b.SESSION_INITIALIZED;
        try {
            ArrayList arrayList = new ArrayList(a12.f100851e);
            if (w11 != null) {
                arrayList.add(w11);
            }
            C5082a0.b(arrayList);
            C.S.k("ProcessingCaptureSession", "== initSession (id=" + i11 + ")");
            try {
                androidx.camera.core.impl.Q0 q02 = a12.f100847a;
                androidx.camera.core.impl.C0.a(b03, b04, b05, b02);
                androidx.camera.core.impl.O0 d11 = q02.d();
                a12.f100854h = d11;
                d11.o().get(0).k().a(new Runnable() { // from class: v.y1
                    @Override // java.lang.Runnable
                    public final void run() {
                        A1.k(A1.this, w11);
                    }
                }, H.c.b());
                Iterator<androidx.camera.core.impl.W> it = a12.f100854h.o().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    Executor executor = a12.f100848b;
                    if (!hasNext) {
                        O0.h hVar = new O0.h();
                        hVar.b(o02);
                        hVar.d();
                        hVar.b(a12.f100854h);
                        x2.i.a("Cannot transform the SessionConfig", hVar.e());
                        androidx.camera.core.impl.O0 c11 = hVar.c();
                        cameraDevice.getClass();
                        com.google.common.util.concurrent.m<Void> c12 = a12.f100850d.c(c11, cameraDevice, aVar);
                        I.k.b(c12, a12.new a(), executor);
                        return c12;
                    }
                    final androidx.camera.core.impl.W next = it.next();
                    f100845n.add(next);
                    next.k().a(new Runnable() { // from class: v.z1
                        @Override // java.lang.Runnable
                        public final void run() {
                            A1.f100845n.remove(androidx.camera.core.impl.W.this);
                        }
                    }, executor);
                }
            } catch (Throwable th2) {
                C.S.d("ProcessingCaptureSession", "initSession failed", th2);
                C5082a0.a(a12.f100851e);
                if (w11 != null) {
                    w11.e();
                }
                throw th2;
            }
        } catch (W.a e11) {
            return I.k.f(e11);
        }
    }

    public static /* synthetic */ void m(A1 a12) {
        C.S.a("ProcessingCaptureSession", "== deInitSession (id=" + a12.f100859m + ")");
        a12.f100847a.c();
    }

    private static void n(@NonNull List<androidx.camera.core.impl.Q> list) {
        for (androidx.camera.core.impl.Q q11 : list) {
            Iterator<AbstractC5111p> it = q11.b().iterator();
            while (it.hasNext()) {
                it.next().a(q11.e());
            }
        }
    }

    @Override // v.W0
    public final void a(@NonNull HashMap hashMap) {
    }

    @Override // v.W0
    public final androidx.camera.core.impl.O0 b() {
        return this.f100852f;
    }

    @Override // v.W0
    @NonNull
    public final com.google.common.util.concurrent.m<Void> c(@NonNull final androidx.camera.core.impl.O0 o02, @NonNull final CameraDevice cameraDevice, @NonNull final E1.a aVar) {
        x2.i.a("Invalid state state:" + this.f100855i, this.f100855i == b.UNINITIALIZED);
        x2.i.a("SessionConfig contains no surfaces", o02.o().isEmpty() ^ true);
        C.S.a("ProcessingCaptureSession", "open (id=" + this.f100859m + ")");
        List<androidx.camera.core.impl.W> o11 = o02.o();
        this.f100851e = o11;
        Executor executor = this.f100848b;
        I.d b11 = I.d.b(C5082a0.c(o11, executor, this.f100849c));
        I.a aVar2 = new I.a() { // from class: v.w1
            @Override // I.a, qc.o
            public final com.google.common.util.concurrent.m apply(Object obj) {
                androidx.camera.core.impl.O0 o03 = o02;
                CameraDevice cameraDevice2 = cameraDevice;
                return A1.l(A1.this, o03, cameraDevice2, aVar, (List) obj);
            }
        };
        b11.getClass();
        return (I.d) I.k.m((I.d) I.k.n(b11, aVar2, executor), new InterfaceC8822a() { // from class: v.x1
            @Override // p.InterfaceC8822a
            public final Object apply(Object obj) {
                A1.i(A1.this);
                return null;
            }
        }, executor);
    }

    @Override // v.W0
    public final void close() {
        StringBuilder sb2 = new StringBuilder("close (id=");
        int i11 = this.f100859m;
        sb2.append(i11);
        sb2.append(") state=");
        sb2.append(this.f100855i);
        C.S.a("ProcessingCaptureSession", sb2.toString());
        if (this.f100855i == b.ON_CAPTURE_SESSION_STARTED) {
            C.S.a("ProcessingCaptureSession", "== onCaptureSessionEnd (id = " + i11 + ")");
            this.f100847a.b();
            E0 e02 = this.f100853g;
            if (e02 != null) {
                e02.b();
            }
            this.f100855i = b.ON_CAPTURE_SESSION_ENDED;
        }
        this.f100850d.close();
    }

    @Override // v.W0
    public final void d(androidx.camera.core.impl.O0 o02) {
        C.S.a("ProcessingCaptureSession", "setSessionConfig (id=" + this.f100859m + ")");
        this.f100852f = o02;
        if (o02 == null) {
            return;
        }
        E0 e02 = this.f100853g;
        if (e02 != null) {
            e02.i(o02);
        }
        if (this.f100855i == b.ON_CAPTURE_SESSION_STARTED) {
            B.j d11 = j.a.e(o02.f()).d();
            this.f100857k = d11;
            B.j jVar = this.f100858l;
            C9887a.C2193a c2193a = new C9887a.C2193a();
            T.b bVar = T.b.OPTIONAL;
            c2193a.d(d11, bVar);
            c2193a.d(jVar, bVar);
            c2193a.c();
            androidx.camera.core.impl.Q0 q02 = this.f100847a;
            q02.h();
            for (androidx.camera.core.impl.W w11 : o02.k().h()) {
                if (Objects.equals(w11.g(), C.Y.class) || Objects.equals(w11.g(), R.c.class)) {
                    o02.k().getClass();
                    q02.e();
                    return;
                }
            }
            q02.a();
        }
    }

    @Override // v.W0
    public final void e(@NonNull List<androidx.camera.core.impl.Q> list) {
        if (list.isEmpty()) {
            return;
        }
        C.S.a("ProcessingCaptureSession", "issueCaptureRequests (id=" + this.f100859m + ") + state =" + this.f100855i);
        int ordinal = this.f100855i.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            if (this.f100856j == null) {
                this.f100856j = list;
                return;
            } else {
                n(list);
                C.S.a("ProcessingCaptureSession", "cancel the request because are pending un-submitted request");
                return;
            }
        }
        if (ordinal != 2) {
            if (ordinal == 3 || ordinal == 4) {
                C.S.a("ProcessingCaptureSession", "Run issueCaptureRequests in wrong state, state = " + this.f100855i);
                n(list);
                return;
            }
            return;
        }
        for (androidx.camera.core.impl.Q q11 : list) {
            int j11 = q11.j();
            if (j11 == 2 || j11 == 4) {
                j.a e11 = j.a.e(q11.f());
                androidx.camera.core.impl.T f7 = q11.f();
                T.a<Integer> aVar = androidx.camera.core.impl.Q.f38177i;
                if (((androidx.camera.core.impl.A0) f7).d(aVar)) {
                    e11.f(CaptureRequest.JPEG_ORIENTATION, (Integer) ((androidx.camera.core.impl.A0) q11.f()).a(aVar));
                }
                androidx.camera.core.impl.T f11 = q11.f();
                T.a<Integer> aVar2 = androidx.camera.core.impl.Q.f38178j;
                if (((androidx.camera.core.impl.A0) f11).d(aVar2)) {
                    e11.f(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) ((androidx.camera.core.impl.A0) q11.f()).a(aVar2)).byteValue()));
                }
                B.j d11 = e11.d();
                this.f100858l = d11;
                B.j jVar = this.f100857k;
                C9887a.C2193a c2193a = new C9887a.C2193a();
                T.b bVar = T.b.OPTIONAL;
                c2193a.d(jVar, bVar);
                c2193a.d(d11, bVar);
                c2193a.c();
                this.f100847a.h();
                q11.e();
                this.f100847a.f();
            } else {
                C.S.a("ProcessingCaptureSession", "issueTriggerRequest");
                Iterator<T.a<?>> it = j.a.e(q11.f()).d().g().iterator();
                while (it.hasNext()) {
                    CaptureRequest.Key key = (CaptureRequest.Key) it.next().d();
                    if (key.equals(CaptureRequest.CONTROL_AF_TRIGGER) || key.equals(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER)) {
                        q11.e();
                        this.f100847a.getClass();
                        break;
                    }
                }
                n(Arrays.asList(q11));
            }
        }
    }

    @Override // v.W0
    public final boolean f() {
        return this.f100850d.f();
    }

    @Override // v.W0
    public final void g() {
        C.S.a("ProcessingCaptureSession", "cancelIssuedCaptureRequests (id=" + this.f100859m + ")");
        if (this.f100856j != null) {
            for (androidx.camera.core.impl.Q q11 : this.f100856j) {
                Iterator<AbstractC5111p> it = q11.b().iterator();
                while (it.hasNext()) {
                    it.next().a(q11.e());
                }
            }
            this.f100856j = null;
        }
    }

    @Override // v.W0
    @NonNull
    public final List<androidx.camera.core.impl.Q> h() {
        return this.f100856j != null ? this.f100856j : Collections.EMPTY_LIST;
    }

    @Override // v.W0
    @NonNull
    public final com.google.common.util.concurrent.m release() {
        C.S.a("ProcessingCaptureSession", "release (id=" + this.f100859m + ") mProcessorState=" + this.f100855i);
        com.google.common.util.concurrent.m release = this.f100850d.release();
        int ordinal = this.f100855i.ordinal();
        if (ordinal == 1 || ordinal == 3) {
            release.a(new Runnable() { // from class: v.v1
                @Override // java.lang.Runnable
                public final void run() {
                    A1.m(A1.this);
                }
            }, H.c.b());
        }
        this.f100855i = b.DE_INITIALIZED;
        return release;
    }
}
