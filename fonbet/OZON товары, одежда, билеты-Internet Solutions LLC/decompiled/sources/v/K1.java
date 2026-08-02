package v;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.C5082a0;
import androidx.camera.core.impl.W;
import androidx.concurrent.futures.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import v.E1;
import w.C10349b;
import w.C10369v;

/* loaded from: classes8.dex */
class K1 extends E1.c implements E1, E1.a {

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    final Y0 f100958b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    final Handler f100959c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    final Executor f100960d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    private final ScheduledExecutorService f100961e;

    /* renamed from: f, reason: collision with root package name */
    E1.c f100962f;

    /* renamed from: g, reason: collision with root package name */
    C10349b f100963g;

    /* renamed from: h, reason: collision with root package name */
    com.google.common.util.concurrent.m<Void> f100964h;

    /* renamed from: i, reason: collision with root package name */
    b.a<Void> f100965i;

    /* renamed from: j, reason: collision with root package name */
    private I.d f100966j;

    /* renamed from: a, reason: collision with root package name */
    final Object f100957a = new Object();

    /* renamed from: k, reason: collision with root package name */
    private List<androidx.camera.core.impl.W> f100967k = null;

    /* renamed from: l, reason: collision with root package name */
    private boolean f100968l = false;

    /* renamed from: m, reason: collision with root package name */
    private boolean f100969m = false;

    /* renamed from: n, reason: collision with root package name */
    private boolean f100970n = false;

    final class a implements I.c<Void> {
        a() {
        }

        @Override // I.c
        public final void onFailure(@NonNull Throwable th2) {
            K1 k12 = K1.this;
            k12.g();
            k12.f100958b.d(k12);
        }

        @Override // I.c
        public final /* bridge */ /* synthetic */ void onSuccess(Void r12) {
        }
    }

    K1(@NonNull Y0 y02, @NonNull Executor executor, @NonNull ScheduledExecutorService scheduledExecutorService, @NonNull Handler handler) {
        this.f100958b = y02;
        this.f100959c = handler;
        this.f100960d = executor;
        this.f100961e = scheduledExecutorService;
    }

    public static String p(K1 k12, List list, C10369v c10369v, x.m mVar, b.a aVar) {
        String str;
        synchronized (k12.f100957a) {
            synchronized (k12.f100957a) {
                k12.u();
                C5082a0.b(list);
                k12.f100967k = list;
            }
            x2.i.f("The openCaptureSessionCompleter can only set once!", k12.f100965i == null);
            k12.f100965i = aVar;
            c10369v.a(mVar);
            str = "openCaptureSession[session=" + k12 + "]";
        }
        return str;
    }

    @Override // v.E1
    public final void a() throws CameraAccessException {
        x2.i.e(this.f100963g, "Need to call openCaptureSession before using this API.");
        this.f100963g.c().stopRepeating();
    }

    @Override // v.E1
    @NonNull
    public final E1.c b() {
        return this;
    }

    @Override // v.E1
    public final void d() throws CameraAccessException {
        x2.i.e(this.f100963g, "Need to call openCaptureSession before using this API.");
        this.f100963g.c().abortCaptures();
    }

    @Override // v.E1
    @NonNull
    public final C10349b e() {
        this.f100963g.getClass();
        return this.f100963g;
    }

    @Override // v.E1
    public void g() {
        throw null;
    }

    @Override // v.E1.c
    public final void h(@NonNull E1 e12) {
        Objects.requireNonNull(this.f100962f);
        this.f100962f.h(e12);
    }

    @Override // v.E1.c
    public final void i(@NonNull E1 e12) {
        Objects.requireNonNull(this.f100962f);
        this.f100962f.i(e12);
    }

    @Override // v.E1.c
    public void j(@NonNull final E1 e12) {
        com.google.common.util.concurrent.m<Void> mVar;
        synchronized (this.f100957a) {
            try {
                if (this.f100968l) {
                    mVar = null;
                } else {
                    this.f100968l = true;
                    x2.i.e(this.f100964h, "Need to call openCaptureSession before using this API.");
                    mVar = this.f100964h;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        g();
        if (mVar != null) {
            mVar.a(new Runnable() { // from class: v.F1
                @Override // java.lang.Runnable
                public final void run() {
                    K1 k12 = K1.this;
                    E1 e13 = e12;
                    Y0 y02 = k12.f100958b;
                    synchronized (y02.f101169b) {
                        y02.f101170c.remove(k12);
                        y02.f101171d.remove(k12);
                    }
                    k12.n(e13);
                    if (k12.f100963g != null) {
                        Objects.requireNonNull(k12.f100962f);
                        k12.f100962f.j(e13);
                    } else {
                        C.S.k("SyncCaptureSessionBase", "[" + k12 + "] Cannot call onClosed() when the CameraCaptureSession is not correctly configured.");
                    }
                }
            }, H.c.b());
        }
    }

    @Override // v.E1.c
    public final void k(@NonNull E1 e12) {
        Objects.requireNonNull(this.f100962f);
        g();
        this.f100958b.d(this);
        this.f100962f.k(e12);
    }

    @Override // v.E1.c
    public final void m(@NonNull E1 e12) {
        Objects.requireNonNull(this.f100962f);
        this.f100962f.m(e12);
    }

    @Override // v.E1.c
    final void n(@NonNull final E1 e12) {
        com.google.common.util.concurrent.m<Void> mVar;
        synchronized (this.f100957a) {
            try {
                if (this.f100970n) {
                    mVar = null;
                } else {
                    this.f100970n = true;
                    x2.i.e(this.f100964h, "Need to call openCaptureSession before using this API.");
                    mVar = this.f100964h;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (mVar != null) {
            mVar.a(new Runnable() { // from class: v.H1
                @Override // java.lang.Runnable
                public final void run() {
                    K1 k12 = K1.this;
                    Objects.requireNonNull(k12.f100962f);
                    k12.f100962f.n(e12);
                }
            }, H.c.b());
        }
    }

    @Override // v.E1.c
    public final void o(@NonNull E1 e12, @NonNull Surface surface) {
        Objects.requireNonNull(this.f100962f);
        this.f100962f.o(e12, surface);
    }

    final void q(@NonNull CameraCaptureSession cameraCaptureSession) {
        if (this.f100963g == null) {
            this.f100963g = C10349b.d(cameraCaptureSession, this.f100959c);
        }
    }

    @NonNull
    public final CameraDevice r() {
        this.f100963g.getClass();
        return this.f100963g.c().getDevice();
    }

    final boolean s() {
        boolean z11;
        synchronized (this.f100957a) {
            z11 = this.f100964h != null;
        }
        return z11;
    }

    @NonNull
    public com.google.common.util.concurrent.m<Void> t(@NonNull CameraDevice cameraDevice, @NonNull final x.m mVar, @NonNull final List<androidx.camera.core.impl.W> list) {
        synchronized (this.f100957a) {
            try {
                if (this.f100969m) {
                    return I.k.f(new CancellationException("Opener is disabled"));
                }
                Y0 y02 = this.f100958b;
                synchronized (y02.f101169b) {
                    y02.f101172e.add(this);
                }
                final C10369v b11 = C10369v.b(cameraDevice, this.f100959c);
                com.google.common.util.concurrent.m<Void> a11 = androidx.concurrent.futures.b.a(new b.c() { // from class: v.J1
                    @Override // androidx.concurrent.futures.b.c
                    public final Object c(b.a aVar) {
                        return K1.p(K1.this, list, b11, mVar, aVar);
                    }
                });
                this.f100964h = a11;
                I.k.b(a11, new a(), H.c.b());
                return I.k.i(this.f100964h);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final void u() {
        synchronized (this.f100957a) {
            try {
                List<androidx.camera.core.impl.W> list = this.f100967k;
                if (list != null) {
                    C5082a0.a(list);
                    this.f100967k = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    public com.google.common.util.concurrent.m v(@NonNull final ArrayList arrayList) {
        synchronized (this.f100957a) {
            try {
                if (this.f100969m) {
                    return I.k.f(new CancellationException("Opener is disabled"));
                }
                I.d b11 = I.d.b(C5082a0.c(arrayList, this.f100960d, this.f100961e));
                I.a aVar = new I.a() { // from class: v.G1
                    @Override // I.a, qc.o
                    public final com.google.common.util.concurrent.m apply(Object obj) {
                        List list = (List) obj;
                        K1 k12 = K1.this;
                        k12.getClass();
                        C.S.a("SyncCaptureSessionBase", "[" + k12 + "] getSurface done with results: " + list);
                        if (list.isEmpty()) {
                            return I.k.f(new IllegalArgumentException("Unable to open capture session without surfaces"));
                        }
                        if (!list.contains(null)) {
                            return I.k.h(list);
                        }
                        return I.k.f(new W.a((androidx.camera.core.impl.W) arrayList.get(list.indexOf(null)), "Surface closed"));
                    }
                };
                Executor executor = this.f100960d;
                b11.getClass();
                I.d dVar = (I.d) I.k.n(b11, aVar, executor);
                this.f100966j = dVar;
                return I.k.i(dVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean w() {
        boolean z11;
        try {
            synchronized (this.f100957a) {
                try {
                    if (!this.f100969m) {
                        I.d dVar = this.f100966j;
                        r1 = dVar != null ? dVar : null;
                        this.f100969m = true;
                    }
                    z11 = !s();
                } finally {
                }
            }
            return z11;
        } finally {
            if (r1 != null) {
                r1.cancel(true);
            }
        }
    }
}
