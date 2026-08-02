package v;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.annotation.NonNull;
import java.util.Collections;
import z.C10967y;

/* loaded from: classes8.dex */
final class V0 extends CameraCaptureSession.CaptureCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ U0 f101112a;

    V0(U0 u02) {
        this.f101112a = u02;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
        C10967y c10967y;
        synchronized (this.f101112a.f101084a) {
            try {
                androidx.camera.core.impl.O0 o02 = this.f101112a.f101089f;
                if (o02 == null) {
                    return;
                }
                androidx.camera.core.impl.Q k11 = o02.k();
                C.S.a("CaptureSession", "Submit FLASH_MODE_OFF request");
                U0 u02 = this.f101112a;
                c10967y = u02.f101097n;
                c10967y.getClass();
                u02.e(Collections.singletonList(C10967y.a(k11)));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
