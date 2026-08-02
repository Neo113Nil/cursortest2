package v;

import android.hardware.camera2.CameraCaptureSession;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.AbstractC5111p;

/* loaded from: classes8.dex */
final class P0 extends AbstractC5111p {

    /* renamed from: a, reason: collision with root package name */
    private final CameraCaptureSession.CaptureCallback f101054a;

    private P0(CameraCaptureSession.CaptureCallback captureCallback) {
        if (captureCallback == null) {
            throw new NullPointerException("captureCallback is null");
        }
        this.f101054a = captureCallback;
    }

    static P0 e(CameraCaptureSession.CaptureCallback captureCallback) {
        return new P0(captureCallback);
    }

    @NonNull
    final CameraCaptureSession.CaptureCallback f() {
        return this.f101054a;
    }
}
