package androidx.camera.core.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.NonNull;
import xsna.fl9;
import xsna.nl9;
import xsna.s100;

/* loaded from: classes11.dex */
public final class CameraValidator {

    public static class CameraIdListIncorrectException extends Exception {
    }

    public static void a(@NonNull Context context, @NonNull fl9 fl9Var) throws CameraIdListIncorrectException {
        PackageManager packageManager = context.getPackageManager();
        String str = Build.DEVICE;
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera")) {
                nl9.c.a(fl9Var.a()).iterator().next();
            }
            if (packageManager.hasSystemFeature("android.hardware.camera.front")) {
                nl9.b.a(fl9Var.a()).iterator().next();
            }
        } catch (IllegalArgumentException e) {
            s100.a("CameraValidator", "Camera LensFacing verification failed, existing cameras: " + fl9Var.a(), null);
            throw new CameraIdListIncorrectException("Expected camera missing from device.", e);
        }
    }
}
