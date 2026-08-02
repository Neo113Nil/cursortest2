package androidx.camera.core;

import androidx.annotation.Nullable;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;

/* loaded from: classes11.dex */
public class CameraUnavailableException extends Exception {
    private final int mReason;

    public CameraUnavailableException(int i, @Nullable CameraAccessExceptionCompat cameraAccessExceptionCompat) {
        super(cameraAccessExceptionCompat);
        this.mReason = i;
    }
}
