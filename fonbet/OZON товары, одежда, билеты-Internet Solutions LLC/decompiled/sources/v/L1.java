package v;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.concurrent.futures.b;

/* loaded from: classes8.dex */
final class L1 extends CameraCaptureSession.StateCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ O1 f101031a;

    L1(O1 o12) {
        this.f101031a = o12;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onActive(@NonNull CameraCaptureSession cameraCaptureSession) {
        O1 o12 = this.f101031a;
        o12.q(cameraCaptureSession);
        o12.h(o12);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onCaptureQueueEmpty(@NonNull CameraCaptureSession cameraCaptureSession) {
        O1 o12 = this.f101031a;
        o12.q(cameraCaptureSession);
        o12.i(o12);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onClosed(@NonNull CameraCaptureSession cameraCaptureSession) {
        O1 o12 = this.f101031a;
        o12.q(cameraCaptureSession);
        o12.j(o12);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(@NonNull CameraCaptureSession cameraCaptureSession) {
        b.a<Void> aVar;
        try {
            this.f101031a.q(cameraCaptureSession);
            O1 o12 = this.f101031a;
            o12.k(o12);
            synchronized (this.f101031a.f100957a) {
                x2.i.e(this.f101031a.f100965i, "OpenCaptureSession completer should not null");
                O1 o13 = this.f101031a;
                aVar = o13.f100965i;
                o13.f100965i = null;
            }
            aVar.e(new IllegalStateException("onConfigureFailed"));
        } catch (Throwable th2) {
            synchronized (this.f101031a.f100957a) {
                x2.i.e(this.f101031a.f100965i, "OpenCaptureSession completer should not null");
                O1 o14 = this.f101031a;
                b.a<Void> aVar2 = o14.f100965i;
                o14.f100965i = null;
                aVar2.e(new IllegalStateException("onConfigureFailed"));
                throw th2;
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(@NonNull CameraCaptureSession cameraCaptureSession) {
        b.a<Void> aVar;
        try {
            this.f101031a.q(cameraCaptureSession);
            O1 o12 = this.f101031a;
            o12.l(o12);
            synchronized (this.f101031a.f100957a) {
                x2.i.e(this.f101031a.f100965i, "OpenCaptureSession completer should not null");
                O1 o13 = this.f101031a;
                aVar = o13.f100965i;
                o13.f100965i = null;
            }
            aVar.c(null);
        } catch (Throwable th2) {
            synchronized (this.f101031a.f100957a) {
                x2.i.e(this.f101031a.f100965i, "OpenCaptureSession completer should not null");
                O1 o14 = this.f101031a;
                b.a<Void> aVar2 = o14.f100965i;
                o14.f100965i = null;
                aVar2.c(null);
                throw th2;
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onReady(@NonNull CameraCaptureSession cameraCaptureSession) {
        O1 o12 = this.f101031a;
        o12.q(cameraCaptureSession);
        o12.m(o12);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onSurfacePrepared(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull Surface surface) {
        O1 o12 = this.f101031a;
        o12.q(cameraCaptureSession);
        o12.o(o12, surface);
    }
}
