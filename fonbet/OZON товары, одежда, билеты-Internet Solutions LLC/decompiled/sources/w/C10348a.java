package w;

import android.hardware.camera2.CameraAccessException;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: w.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10348a extends Exception {

    /* renamed from: b, reason: collision with root package name */
    static final Set<Integer> f103058b = Collections.unmodifiableSet(new HashSet(Arrays.asList(4, 5, 1, 2, 3)));

    /* renamed from: c, reason: collision with root package name */
    static final Set<Integer> f103059c = Collections.unmodifiableSet(new HashSet(Arrays.asList(10001, 10002)));

    /* renamed from: a, reason: collision with root package name */
    private final int f103060a;

    public C10348a(RuntimeException runtimeException) {
        super("Some API 28 devices cannot access the camera when the device is in \"Do Not Disturb\" mode. The camera will not be accessible until \"Do Not Disturb\" mode is disabled.", runtimeException);
        this.f103060a = 10001;
        if (f103058b.contains(10001)) {
            new CameraAccessException(10001, null, runtimeException);
        }
    }

    @NonNull
    public static C10348a b(@NonNull CameraAccessException cameraAccessException) {
        return new C10348a(cameraAccessException);
    }

    public final int a() {
        return this.f103060a;
    }

    private C10348a(@NonNull CameraAccessException cameraAccessException) {
        super(cameraAccessException.getMessage(), cameraAccessException.getCause());
        this.f103060a = cameraAccessException.getReason();
    }

    public C10348a(String str, AssertionError assertionError) {
        super(String.format("%s (%d): %s", "CAMERA_CHARACTERISTICS_CREATION_ERROR", 10002, str), assertionError);
        this.f103060a = 10002;
        if (f103058b.contains(10002)) {
            new CameraAccessException(10002, str, assertionError);
        }
    }
}
