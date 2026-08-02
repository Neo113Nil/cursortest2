package w;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* renamed from: w.q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C10364q extends C10365r {
    @Override // w.C10365r, w.C10349b.a
    public final int a(@NonNull ArrayList arrayList, @NonNull Executor executor, @NonNull CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.f103110a.captureBurstRequests(arrayList, executor, captureCallback);
    }

    @Override // w.C10365r, w.C10349b.a
    public final int b(@NonNull CaptureRequest captureRequest, @NonNull Executor executor, @NonNull CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.f103110a.setSingleRepeatingRequest(captureRequest, executor, captureCallback);
    }
}
