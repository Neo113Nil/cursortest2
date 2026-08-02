package v;

import android.hardware.camera2.CaptureFailure;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.r;

/* renamed from: v.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10097g extends androidx.camera.core.impl.r {

    /* renamed from: b, reason: collision with root package name */
    private final CaptureFailure f101254b;

    public C10097g(@NonNull r.a aVar, @NonNull CaptureFailure captureFailure) {
        super(aVar);
        this.f101254b = captureFailure;
    }

    @Override // androidx.camera.core.impl.r
    @NonNull
    public final Object a() {
        return this.f101254b;
    }
}
