package v;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk;
import androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import z.C10950h;
import z.C10951i;
import z.C10961s;
import z.C10963u;

/* loaded from: classes8.dex */
final class O1 extends K1 {

    /* renamed from: o, reason: collision with root package name */
    @NonNull
    private final ScheduledExecutorService f101044o;

    /* renamed from: p, reason: collision with root package name */
    private final Object f101045p;

    /* renamed from: q, reason: collision with root package name */
    private ArrayList f101046q;

    /* renamed from: r, reason: collision with root package name */
    com.google.common.util.concurrent.m<List<Void>> f101047r;

    /* renamed from: s, reason: collision with root package name */
    private final C10951i f101048s;

    /* renamed from: t, reason: collision with root package name */
    private final C10950h f101049t;

    /* renamed from: u, reason: collision with root package name */
    private final C10961s f101050u;

    /* renamed from: v, reason: collision with root package name */
    private final C10963u f101051v;

    /* renamed from: w, reason: collision with root package name */
    private final AtomicBoolean f101052w;

    O1(@NonNull Handler handler, @NonNull androidx.camera.core.impl.I0 i02, @NonNull androidx.camera.core.impl.I0 i03, @NonNull Executor executor, @NonNull ScheduledExecutorService scheduledExecutorService, @NonNull Y0 y02) {
        super(y02, executor, scheduledExecutorService, handler);
        this.f101045p = new Object();
        this.f101052w = new AtomicBoolean(false);
        this.f101048s = new C10951i(i02, i03);
        this.f101050u = new C10961s(i02.a(CaptureSessionStuckQuirk.class) || i02.a(IncorrectCaptureStateQuirk.class));
        this.f101049t = new C10950h(i03);
        this.f101051v = new C10963u(i03);
        this.f101044o = scheduledExecutorService;
    }

    public static com.google.common.util.concurrent.m x(O1 o12, CameraDevice cameraDevice, x.m mVar, List list) {
        if (o12.f101051v.a()) {
            Iterator it = o12.f100958b.b().iterator();
            while (it.hasNext()) {
                ((E1) it.next()).close();
            }
        }
        o12.z("start openCaptureSession");
        return super.t(cameraDevice, mVar, list);
    }

    public final int A(@NonNull CaptureRequest captureRequest, @NonNull CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        CameraCaptureSession.CaptureCallback b11 = this.f101050u.b(captureCallback);
        x2.i.e(this.f100963g, "Need to call openCaptureSession before using this API.");
        return this.f100963g.b(captureRequest, this.f100960d, b11);
    }

    @Override // v.E1
    public final void c(int i11) {
        if (i11 == 5) {
            synchronized (this.f101045p) {
                try {
                    if (s() && this.f101046q != null) {
                        z("Close DeferrableSurfaces for CameraDevice error.");
                        Iterator it = this.f101046q.iterator();
                        while (it.hasNext()) {
                            ((androidx.camera.core.impl.W) it.next()).d();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // v.E1
    public final void close() {
        if (!this.f101052w.compareAndSet(false, true)) {
            z("close() has been called. Skip this invocation.");
            return;
        }
        if (this.f101051v.a()) {
            try {
                z("Call abortCaptures() before closing session.");
                d();
            } catch (Exception e11) {
                z("Exception when calling abortCaptures()" + e11);
            }
        }
        z("Session call close()");
        this.f101050u.c().a(new Runnable() { // from class: v.M1
            @Override // java.lang.Runnable
            public final void run() {
                final O1 o12 = O1.this;
                o12.z("Session call super.close()");
                x2.i.e(o12.f100963g, "Need to call openCaptureSession before using this API.");
                Y0 y02 = o12.f100958b;
                synchronized (y02.f101169b) {
                    y02.f101171d.add(o12);
                }
                o12.f100963g.c().close();
                o12.f100960d.execute(new Runnable() { // from class: v.I1
                    @Override // java.lang.Runnable
                    public final void run() {
                        K1 k12 = K1.this;
                        k12.n(k12);
                    }
                });
            }
        }, this.f100960d);
    }

    @Override // v.E1
    @NonNull
    public final com.google.common.util.concurrent.m<Void> f() {
        return androidx.concurrent.futures.b.a(new I.h(this.f101050u.c(), this.f101044o, 1500L));
    }

    @Override // v.K1, v.E1
    public final void g() {
        u();
        this.f101050u.d();
    }

    @Override // v.K1, v.E1.c
    public final void j(@NonNull E1 e12) {
        synchronized (this.f101045p) {
            this.f101048s.a(this.f101046q);
        }
        z("onClosed()");
        super.j(e12);
    }

    @Override // v.E1.c
    public final void l(@NonNull E1 e12) {
        ArrayList arrayList;
        E1 e13;
        E1 e14;
        E1 e15;
        z("Session onConfigured()");
        Y0 y02 = this.f100958b;
        synchronized (y02.f101169b) {
            arrayList = new ArrayList(y02.f101172e);
        }
        ArrayList b11 = y02.b();
        C10950h c10950h = this.f101049t;
        if (c10950h.a()) {
            LinkedHashSet<E1> linkedHashSet = new LinkedHashSet();
            Iterator it = arrayList.iterator();
            while (it.hasNext() && (e15 = (E1) it.next()) != e12) {
                linkedHashSet.add(e15);
            }
            for (E1 e16 : linkedHashSet) {
                e16.b().k(e16);
            }
        }
        Objects.requireNonNull(this.f100962f);
        synchronized (y02.f101169b) {
            y02.f101170c.add(this);
            y02.f101172e.remove(this);
        }
        Iterator it2 = y02.c().iterator();
        while (it2.hasNext() && (e14 = (E1) it2.next()) != this) {
            e14.g();
        }
        this.f100962f.l(e12);
        if (c10950h.a()) {
            LinkedHashSet<E1> linkedHashSet2 = new LinkedHashSet();
            Iterator it3 = b11.iterator();
            while (it3.hasNext() && (e13 = (E1) it3.next()) != e12) {
                linkedHashSet2.add(e13);
            }
            for (E1 e17 : linkedHashSet2) {
                e17.b().j(e17);
            }
        }
    }

    @Override // v.K1
    @NonNull
    public final com.google.common.util.concurrent.m<Void> t(@NonNull final CameraDevice cameraDevice, @NonNull final x.m mVar, @NonNull final List<androidx.camera.core.impl.W> list) {
        com.google.common.util.concurrent.m<Void> i11;
        synchronized (this.f101045p) {
            try {
                ArrayList b11 = this.f100958b.b();
                ArrayList arrayList = new ArrayList();
                Iterator it = b11.iterator();
                while (it.hasNext()) {
                    arrayList.add(((E1) it.next()).f());
                }
                com.google.common.util.concurrent.m<List<Void>> l11 = I.k.l(arrayList);
                this.f101047r = l11;
                I.d b12 = I.d.b(l11);
                I.a aVar = new I.a() { // from class: v.N1
                    @Override // I.a, qc.o
                    public final com.google.common.util.concurrent.m apply(Object obj) {
                        return O1.x(O1.this, cameraDevice, mVar, list);
                    }
                };
                Executor executor = this.f100960d;
                b12.getClass();
                i11 = I.k.i((I.d) I.k.n(b12, aVar, executor));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i11;
    }

    @Override // v.K1
    @NonNull
    public final com.google.common.util.concurrent.m v(@NonNull ArrayList arrayList) {
        com.google.common.util.concurrent.m v11;
        synchronized (this.f101045p) {
            this.f101046q = arrayList;
            v11 = super.v(arrayList);
        }
        return v11;
    }

    @Override // v.K1
    public final boolean w() {
        boolean w11;
        synchronized (this.f101045p) {
            try {
                if (s()) {
                    this.f101048s.a(this.f101046q);
                } else {
                    com.google.common.util.concurrent.m<List<Void>> mVar = this.f101047r;
                    if (mVar != null) {
                        mVar.cancel(true);
                    }
                }
                w11 = super.w();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return w11;
    }

    public final int y(@NonNull ArrayList arrayList, @NonNull CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        CameraCaptureSession.CaptureCallback b11 = this.f101050u.b(captureCallback);
        x2.i.e(this.f100963g, "Need to call openCaptureSession before using this API.");
        return this.f100963g.a(arrayList, this.f100960d, b11);
    }

    final void z(String str) {
        C.S.a("SyncCaptureSessionImpl", "[" + this + "] " + str);
    }
}
