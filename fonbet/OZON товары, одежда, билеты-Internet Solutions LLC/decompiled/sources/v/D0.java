package v;

import C.InterfaceC2694n;
import android.hardware.camera2.CameraCharacteristics;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public final class D0 implements InterfaceC2694n {
    @Override // C.InterfaceC2694n
    @NonNull
    public final androidx.lifecycle.P<C.r> c() {
        throw new UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // C.InterfaceC2694n
    public final int e() {
        CameraCharacteristics.Key key = CameraCharacteristics.LENS_FACING;
        throw null;
    }

    @Override // C.InterfaceC2694n
    public final int g(int i11) {
        CameraCharacteristics.Key key = CameraCharacteristics.SENSOR_ORIENTATION;
        throw null;
    }

    @Override // C.InterfaceC2694n
    public final int i() {
        CameraCharacteristics.Key key = CameraCharacteristics.SENSOR_ORIENTATION;
        throw null;
    }

    @Override // C.InterfaceC2694n
    public final boolean k() {
        throw new UnsupportedOperationException("Physical camera doesn't support this function");
    }
}
