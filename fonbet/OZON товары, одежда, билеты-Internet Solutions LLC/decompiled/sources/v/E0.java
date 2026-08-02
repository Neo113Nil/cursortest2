package v;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.AbstractC5111p;
import androidx.camera.core.impl.K0;
import androidx.camera.core.impl.O0;
import androidx.camera.core.impl.Q;
import androidx.camera.core.impl.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import v.U0;

/* loaded from: classes8.dex */
public final class E0 implements androidx.camera.core.impl.K0 {

    /* renamed from: b, reason: collision with root package name */
    private U0 f100908b;

    /* renamed from: c, reason: collision with root package name */
    private List<androidx.camera.core.impl.R0> f100909c;

    /* renamed from: e, reason: collision with root package name */
    private volatile androidx.camera.core.impl.O0 f100911e;

    /* renamed from: a, reason: collision with root package name */
    private final Object f100907a = new Object();

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f100910d = false;

    private class a extends CameraCaptureSession.CaptureCallback {

        /* renamed from: a, reason: collision with root package name */
        private final K0.a f100912a;

        /* renamed from: b, reason: collision with root package name */
        private final K0.b f100913b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f100914c;

        a(@NonNull K0.b bVar, @NonNull K0.a aVar, boolean z11) {
            this.f100912a = aVar;
            this.f100913b = bVar;
            this.f100914c = z11;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureBufferLost(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull Surface surface, long j11) {
            this.f100912a.onCaptureBufferLost(this.f100913b, j11, E0.this.c(surface));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
            this.f100912a.onCaptureCompleted(this.f100913b, new C10100h(totalCaptureResult));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureFailed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureFailure captureFailure) {
            this.f100912a.onCaptureFailed(this.f100913b, new C10097g(r.a.ERROR, captureFailure));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureProgressed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureResult captureResult) {
            this.f100912a.onCaptureProgressed(this.f100913b, new C10100h(captureResult));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureSequenceAborted(@NonNull CameraCaptureSession cameraCaptureSession, int i11) {
            if (this.f100914c) {
                this.f100912a.onCaptureSequenceAborted(i11);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureSequenceCompleted(@NonNull CameraCaptureSession cameraCaptureSession, int i11, long j11) {
            if (this.f100914c) {
                this.f100912a.onCaptureSequenceCompleted(i11, j11);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureStarted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, long j11, long j12) {
            this.f100912a.onCaptureStarted(this.f100913b, j12, j11);
        }
    }

    public E0(@NonNull U0 u02, @NonNull ArrayList arrayList) {
        x2.i.a("CaptureSession state must be OPENED. Current state:" + u02.f101092i, u02.f101092i == U0.b.OPENED);
        this.f100908b = u02;
        this.f100909c = Collections.unmodifiableList(new ArrayList(arrayList));
    }

    private androidx.camera.core.impl.R0 d(int i11) {
        synchronized (this.f100907a) {
            try {
                List<androidx.camera.core.impl.R0> list = this.f100909c;
                if (list == null) {
                    return null;
                }
                for (androidx.camera.core.impl.R0 r02 : list) {
                    r02.getClass();
                    if (i11 == 0) {
                        return r02;
                    }
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private boolean e(@NonNull K0.b bVar) {
        if (bVar.getTargetOutputConfigIds().isEmpty()) {
            C.S.c("Camera2RequestProcessor", "Unable to submit the RequestProcessor.Request: empty targetOutputConfigIds");
            return false;
        }
        for (Integer num : bVar.getTargetOutputConfigIds()) {
            if (d(num.intValue()) == null) {
                C.S.c("Camera2RequestProcessor", "Unable to submit the RequestProcessor.Request: targetOutputConfigId(" + num + ") is not a valid id");
                return false;
            }
        }
        return true;
    }

    public final void a() {
        U0 u02;
        synchronized (this.f100907a) {
            try {
                if (!this.f100910d && (u02 = this.f100908b) != null) {
                    u02.k();
                }
            } finally {
            }
        }
    }

    public final void b() {
        synchronized (this.f100907a) {
            this.f100910d = true;
            this.f100908b = null;
            this.f100911e = null;
            this.f100909c = null;
        }
    }

    final int c(@NonNull Surface surface) {
        synchronized (this.f100907a) {
            try {
                List<androidx.camera.core.impl.R0> list = this.f100909c;
                if (list == null) {
                    return -1;
                }
                Iterator<androidx.camera.core.impl.R0> it = list.iterator();
                while (it.hasNext()) {
                    if (it.next().j().get() == surface) {
                        return 0;
                    }
                }
                return -1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int f(@NonNull K0.b bVar, @NonNull K0.a aVar) {
        synchronized (this.f100907a) {
            try {
                if (!this.f100910d && e(bVar) && this.f100908b != null) {
                    O0.b bVar2 = new O0.b();
                    bVar2.v(bVar.getTemplateId());
                    bVar2.r(bVar.getParameters());
                    bVar2.c(P0.e(new a(bVar, aVar, true)));
                    if (this.f100911e != null) {
                        Iterator<AbstractC5111p> it = this.f100911e.j().iterator();
                        while (it.hasNext()) {
                            bVar2.c(it.next());
                        }
                        androidx.camera.core.impl.X0 i11 = this.f100911e.k().i();
                        for (String str : i11.d()) {
                            bVar2.j(i11.c(str), str);
                        }
                    }
                    Iterator<Integer> it2 = bVar.getTargetOutputConfigIds().iterator();
                    while (it2.hasNext()) {
                        bVar2.i(d(it2.next().intValue()), C.A.f4076d, -1);
                    }
                    return this.f100908b.t(bVar2.k());
                }
                return -1;
            } finally {
            }
        }
    }

    public final void g() {
        U0 u02;
        synchronized (this.f100907a) {
            try {
                if (!this.f100910d && (u02 = this.f100908b) != null) {
                    u02.u();
                }
            } finally {
            }
        }
    }

    public final int h(@NonNull List<K0.b> list, @NonNull K0.a aVar) {
        synchronized (this.f100907a) {
            try {
                if (!this.f100910d) {
                    Iterator<K0.b> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            if (this.f100908b != null) {
                                ArrayList arrayList = new ArrayList();
                                boolean z11 = true;
                                for (K0.b bVar : list) {
                                    Q.a aVar2 = new Q.a();
                                    aVar2.s(bVar.getTemplateId());
                                    aVar2.q(bVar.getParameters());
                                    aVar2.c(P0.e(new a(bVar, aVar, z11)));
                                    Iterator<Integer> it2 = bVar.getTargetOutputConfigIds().iterator();
                                    while (it2.hasNext()) {
                                        aVar2.f(d(it2.next().intValue()));
                                    }
                                    arrayList.add(aVar2.h());
                                    z11 = false;
                                }
                                return this.f100908b.r(arrayList);
                            }
                        } else if (!e(it.next())) {
                        }
                    }
                }
                return -1;
            } finally {
            }
        }
    }

    public final void i(androidx.camera.core.impl.O0 o02) {
        synchronized (this.f100907a) {
            this.f100911e = o02;
        }
    }
}
