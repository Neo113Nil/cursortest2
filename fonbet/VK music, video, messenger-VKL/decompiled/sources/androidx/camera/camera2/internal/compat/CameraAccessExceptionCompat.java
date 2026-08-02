package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraAccessException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes11.dex */
public class CameraAccessExceptionCompat extends Exception {
    public static final Set<Integer> b = Collections.unmodifiableSet(new HashSet(Arrays.asList(4, 5, 1, 2, 3)));
    public static final Set<Integer> c = Collections.unmodifiableSet(new HashSet(Arrays.asList(10001, 10002)));
    private final CameraAccessException mCameraAccessException;
    private final int mReason;

    public CameraAccessExceptionCompat(@NonNull CameraAccessException cameraAccessException) {
        super(cameraAccessException.getMessage(), cameraAccessException.getCause());
        this.mReason = cameraAccessException.getReason();
        this.mCameraAccessException = cameraAccessException;
    }

    public final int d() {
        return this.mReason;
    }

    public CameraAccessExceptionCompat(@Nullable RuntimeException runtimeException) {
        super("Some API 28 devices cannot access the camera when the device is in \"Do Not Disturb\" mode. The camera will not be accessible until \"Do Not Disturb\" mode is disabled.", runtimeException);
        this.mReason = 10001;
        this.mCameraAccessException = b.contains(10001) ? new CameraAccessException(10001, null, runtimeException) : null;
    }
}
