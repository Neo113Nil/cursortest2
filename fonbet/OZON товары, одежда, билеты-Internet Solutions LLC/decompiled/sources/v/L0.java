package v;

import C.C2698s;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.annotation.NonNull;
import w.C10340H;
import w.C10348a;

/* loaded from: classes8.dex */
public final class L0 {
    public static boolean a(@NonNull String str, @NonNull C10340H c10340h) throws C.P {
        if ("robolectric".equals(Build.FINGERPRINT)) {
            return true;
        }
        try {
            int[] iArr = (int[]) c10340h.b(str).a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i11 : iArr) {
                    if (i11 == 0) {
                        return true;
                    }
                }
            }
            return false;
        } catch (C10348a e11) {
            throw new C.P(new C2698s(e11));
        }
    }
}
