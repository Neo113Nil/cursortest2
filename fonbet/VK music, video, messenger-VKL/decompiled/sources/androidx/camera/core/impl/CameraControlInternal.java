package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.c;
import java.util.ArrayList;
import xsna.r0t;
import xsna.ugz;

/* loaded from: classes11.dex */
public interface CameraControlInternal {
    public static final a a = new a();

    public static final class CameraControlException extends Exception {

        @NonNull
        private CameraCaptureFailure mCameraCaptureFailure;

        public CameraControlException(@NonNull CameraCaptureFailure cameraCaptureFailure) {
            this.mCameraCaptureFailure = cameraCaptureFailure;
        }
    }

    @NonNull
    ugz<c> a();

    void b(@NonNull ArrayList arrayList);

    void c(boolean z, boolean z2);

    @NonNull
    ugz<c> d();

    void e(int i);

    public class a implements CameraControlInternal {
        @Override // androidx.camera.core.impl.CameraControlInternal
        @NonNull
        public final ugz<c> a() {
            return r0t.d(new c.a());
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        @NonNull
        public final ugz<c> d() {
            return r0t.d(new c.a());
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public final void b(@NonNull ArrayList arrayList) {
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public final void e(int i) {
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public final void c(boolean z, boolean z2) {
        }
    }
}
