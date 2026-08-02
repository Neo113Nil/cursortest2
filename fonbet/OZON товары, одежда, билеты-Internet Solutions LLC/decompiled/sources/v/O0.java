package v;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.AbstractC5111p;
import androidx.camera.core.impl.r;

/* loaded from: classes8.dex */
final class O0 extends CameraCaptureSession.CaptureCallback {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC5111p f101043a;

    O0(AbstractC5111p abstractC5111p) {
        if (abstractC5111p == null) {
            throw new NullPointerException("cameraCaptureCallback is null");
        }
        this.f101043a = abstractC5111p;
    }

    private static int a(CaptureRequest captureRequest) {
        Integer num;
        if ((captureRequest.getTag() instanceof androidx.camera.core.impl.X0) && (num = (Integer) ((androidx.camera.core.impl.X0) captureRequest.getTag()).c("CAPTURE_CONFIG_ID_KEY")) != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
        androidx.camera.core.impl.X0 b11;
        super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        Object tag = captureRequest.getTag();
        if (tag != null) {
            x2.i.a("The tagBundle object from the CaptureResult is not a TagBundle object.", tag instanceof androidx.camera.core.impl.X0);
            b11 = (androidx.camera.core.impl.X0) tag;
        } else {
            b11 = androidx.camera.core.impl.X0.b();
        }
        this.f101043a.b(a(captureRequest), new C10100h(b11, totalCaptureResult));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureFailed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureFailure captureFailure) {
        super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        this.f101043a.c(a(captureRequest), new androidx.camera.core.impl.r(r.a.ERROR));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureStarted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, long j11, long j12) {
        super.onCaptureStarted(cameraCaptureSession, captureRequest, j11, j12);
        this.f101043a.d(a(captureRequest));
    }
}
