package n9;

import android.hardware.Camera;
import android.util.Log;

/* renamed from: n9.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C8455a {
    public static int a(int i11) {
        int numberOfCameras = Camera.getNumberOfCameras();
        if (numberOfCameras == 0) {
            Log.w("n9.a", "No cameras!");
            return -1;
        }
        boolean z11 = i11 >= 0;
        if (!z11) {
            i11 = 0;
            while (i11 < numberOfCameras) {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i11, cameraInfo);
                if (cameraInfo.facing == 0) {
                    break;
                }
                i11++;
            }
        }
        return i11 < numberOfCameras ? i11 : z11 ? -1 : 0;
    }
}
