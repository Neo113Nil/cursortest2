package w;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import w.C10349b;

/* renamed from: w.r, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
class C10365r implements C10349b.a {

    /* renamed from: a, reason: collision with root package name */
    final CameraCaptureSession f103110a;

    /* renamed from: b, reason: collision with root package name */
    final Object f103111b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w.r$a */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        final Handler f103112a;

        a(@NonNull Handler handler) {
            this.f103112a = handler;
        }
    }

    C10365r(@NonNull CameraCaptureSession cameraCaptureSession, Object obj) {
        cameraCaptureSession.getClass();
        this.f103110a = cameraCaptureSession;
        this.f103111b = obj;
    }

    @Override // w.C10349b.a
    public int a(@NonNull ArrayList arrayList, @NonNull Executor executor, @NonNull CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.f103110a.captureBurst(arrayList, new C10349b.C2237b(executor, captureCallback), ((a) this.f103111b).f103112a);
    }

    @Override // w.C10349b.a
    public int b(@NonNull CaptureRequest captureRequest, @NonNull Executor executor, @NonNull CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.f103110a.setRepeatingRequest(captureRequest, new C10349b.C2237b(executor, captureCallback), ((a) this.f103111b).f103112a);
    }
}
