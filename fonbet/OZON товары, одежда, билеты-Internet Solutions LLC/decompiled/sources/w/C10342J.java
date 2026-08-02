package w;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* renamed from: w.J, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
class C10342J extends C10341I {
    @Override // w.C10341I, w.C10344L, w.C10340H.b
    public final void b(@NonNull String str, @NonNull Executor executor, @NonNull CameraDevice.StateCallback stateCallback) throws C10348a {
        try {
            this.f103049a.openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e11) {
            throw C10348a.b(e11);
        }
    }

    @Override // w.C10341I, w.C10344L, w.C10340H.b
    @NonNull
    public final CameraCharacteristics c(@NonNull String str) throws C10348a {
        try {
            return this.f103049a.getCameraCharacteristics(str);
        } catch (CameraAccessException e11) {
            throw C10348a.b(e11);
        }
    }
}
