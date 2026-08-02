package w;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* renamed from: w.I, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
class C10341I extends C10344L {
    private static boolean f(@NonNull RuntimeException runtimeException) {
        StackTraceElement[] stackTrace;
        if (Build.VERSION.SDK_INT == 28) {
            if ((!runtimeException.getClass().equals(RuntimeException.class) || (stackTrace = runtimeException.getStackTrace()) == null || stackTrace.length < 0) ? false : "_enableShutterSound".equals(stackTrace[0].getMethodName())) {
                return true;
            }
        }
        return false;
    }

    @Override // w.C10344L, w.C10340H.b
    public final void a(@NonNull Executor executor, @NonNull CameraManager.AvailabilityCallback availabilityCallback) {
        this.f103049a.registerAvailabilityCallback(executor, availabilityCallback);
    }

    @Override // w.C10344L, w.C10340H.b
    public void b(@NonNull String str, @NonNull Executor executor, @NonNull CameraDevice.StateCallback stateCallback) throws C10348a {
        try {
            this.f103049a.openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e11) {
            throw C10348a.b(e11);
        } catch (IllegalArgumentException e12) {
        } catch (SecurityException e13) {
            throw e13;
        } catch (RuntimeException e14) {
            if (!f(e14)) {
                throw e14;
            }
            throw new C10348a(e14);
        }
    }

    @Override // w.C10344L, w.C10340H.b
    @NonNull
    public CameraCharacteristics c(@NonNull String str) throws C10348a {
        try {
            return super.c(str);
        } catch (RuntimeException e11) {
            if (f(e11)) {
                throw new C10348a(e11);
            }
            throw e11;
        }
    }

    @Override // w.C10344L, w.C10340H.b
    public final void e(@NonNull CameraManager.AvailabilityCallback availabilityCallback) {
        this.f103049a.unregisterAvailabilityCallback(availabilityCallback);
    }
}
