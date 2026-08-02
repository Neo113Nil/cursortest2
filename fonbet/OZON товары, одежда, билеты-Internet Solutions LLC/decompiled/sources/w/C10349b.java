package w;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import w.C10349b;
import w.C10365r;

/* renamed from: w.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10349b {

    /* renamed from: a, reason: collision with root package name */
    private final C10365r f103061a;

    /* renamed from: w.b$a */
    interface a {
        int a(@NonNull ArrayList arrayList, @NonNull Executor executor, @NonNull CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;

        int b(@NonNull CaptureRequest captureRequest, @NonNull Executor executor, @NonNull CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;
    }

    /* renamed from: w.b$b, reason: collision with other inner class name */
    static final class C2237b extends CameraCaptureSession.CaptureCallback {

        /* renamed from: a, reason: collision with root package name */
        final CameraCaptureSession.CaptureCallback f103062a;

        /* renamed from: b, reason: collision with root package name */
        private final Executor f103063b;

        C2237b(@NonNull Executor executor, @NonNull CameraCaptureSession.CaptureCallback captureCallback) {
            this.f103063b = executor;
            this.f103062a = captureCallback;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureBufferLost(@NonNull final CameraCaptureSession cameraCaptureSession, @NonNull final CaptureRequest captureRequest, @NonNull final Surface surface, final long j11) {
            this.f103063b.execute(new Runnable() { // from class: w.h
                @Override // java.lang.Runnable
                public final void run() {
                    C10349b.C2237b.this.f103062a.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j11);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureCompleted(@NonNull final CameraCaptureSession cameraCaptureSession, @NonNull final CaptureRequest captureRequest, @NonNull final TotalCaptureResult totalCaptureResult) {
            this.f103063b.execute(new Runnable() { // from class: w.d
                @Override // java.lang.Runnable
                public final void run() {
                    C10349b.C2237b.this.f103062a.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureFailed(@NonNull final CameraCaptureSession cameraCaptureSession, @NonNull final CaptureRequest captureRequest, @NonNull final CaptureFailure captureFailure) {
            this.f103063b.execute(new Runnable() { // from class: w.g
                @Override // java.lang.Runnable
                public final void run() {
                    C10349b.C2237b.this.f103062a.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureProgressed(@NonNull final CameraCaptureSession cameraCaptureSession, @NonNull final CaptureRequest captureRequest, @NonNull final CaptureResult captureResult) {
            this.f103063b.execute(new Runnable() { // from class: w.e
                @Override // java.lang.Runnable
                public final void run() {
                    C10349b.C2237b.this.f103062a.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureSequenceAborted(@NonNull final CameraCaptureSession cameraCaptureSession, final int i11) {
            this.f103063b.execute(new Runnable() { // from class: w.i
                @Override // java.lang.Runnable
                public final void run() {
                    C10349b.C2237b.this.f103062a.onCaptureSequenceAborted(cameraCaptureSession, i11);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureSequenceCompleted(@NonNull final CameraCaptureSession cameraCaptureSession, final int i11, final long j11) {
            this.f103063b.execute(new Runnable() { // from class: w.f
                @Override // java.lang.Runnable
                public final void run() {
                    C10349b.C2237b.this.f103062a.onCaptureSequenceCompleted(cameraCaptureSession, i11, j11);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureStarted(@NonNull final CameraCaptureSession cameraCaptureSession, @NonNull final CaptureRequest captureRequest, final long j11, final long j12) {
            this.f103063b.execute(new Runnable() { // from class: w.c
                @Override // java.lang.Runnable
                public final void run() {
                    C10349b.C2237b.this.f103062a.onCaptureStarted(cameraCaptureSession, captureRequest, j11, j12);
                }
            });
        }
    }

    /* renamed from: w.b$c */
    static final class c extends CameraCaptureSession.StateCallback {

        /* renamed from: a, reason: collision with root package name */
        final CameraCaptureSession.StateCallback f103064a;

        /* renamed from: b, reason: collision with root package name */
        private final Executor f103065b;

        c(@NonNull Executor executor, @NonNull CameraCaptureSession.StateCallback stateCallback) {
            this.f103065b = executor;
            this.f103064a = stateCallback;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onActive(@NonNull final CameraCaptureSession cameraCaptureSession) {
            this.f103065b.execute(new Runnable() { // from class: w.j
                @Override // java.lang.Runnable
                public final void run() {
                    C10349b.c.this.f103064a.onActive(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onCaptureQueueEmpty(@NonNull final CameraCaptureSession cameraCaptureSession) {
            this.f103065b.execute(new Runnable() { // from class: w.m
                @Override // java.lang.Runnable
                public final void run() {
                    C10349b.c.this.f103064a.onCaptureQueueEmpty(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onClosed(@NonNull final CameraCaptureSession cameraCaptureSession) {
            this.f103065b.execute(new Runnable() { // from class: w.k
                @Override // java.lang.Runnable
                public final void run() {
                    C10349b.c.this.f103064a.onClosed(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onConfigureFailed(@NonNull final CameraCaptureSession cameraCaptureSession) {
            this.f103065b.execute(new Runnable() { // from class: w.p
                @Override // java.lang.Runnable
                public final void run() {
                    C10349b.c.this.f103064a.onConfigureFailed(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onConfigured(@NonNull final CameraCaptureSession cameraCaptureSession) {
            this.f103065b.execute(new Runnable() { // from class: w.n
                @Override // java.lang.Runnable
                public final void run() {
                    C10349b.c.this.f103064a.onConfigured(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onReady(@NonNull final CameraCaptureSession cameraCaptureSession) {
            this.f103065b.execute(new Runnable() { // from class: w.o
                @Override // java.lang.Runnable
                public final void run() {
                    C10349b.c.this.f103064a.onReady(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onSurfacePrepared(@NonNull final CameraCaptureSession cameraCaptureSession, @NonNull final Surface surface) {
            this.f103065b.execute(new Runnable() { // from class: w.l
                @Override // java.lang.Runnable
                public final void run() {
                    C10349b.c.this.f103064a.onSurfacePrepared(cameraCaptureSession, surface);
                }
            });
        }
    }

    private C10349b(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull Handler handler) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f103061a = new C10364q(cameraCaptureSession, null);
        } else {
            this.f103061a = new C10365r(cameraCaptureSession, new C10365r.a(handler));
        }
    }

    @NonNull
    public static C10349b d(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull Handler handler) {
        return new C10349b(cameraCaptureSession, handler);
    }

    public final int a(@NonNull ArrayList arrayList, @NonNull Executor executor, @NonNull CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.f103061a.a(arrayList, executor, captureCallback);
    }

    public final int b(@NonNull CaptureRequest captureRequest, @NonNull Executor executor, @NonNull CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.f103061a.b(captureRequest, executor, captureCallback);
    }

    @NonNull
    public final CameraCaptureSession c() {
        return this.f103061a.f103110a;
    }
}
