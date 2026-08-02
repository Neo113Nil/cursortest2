package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.UseCaseConfigFactory;

/* compiled from: CameraConfigs.java */
/* loaded from: classes11.dex */
public final class d {
    public static final a a = new a();

    /* compiled from: CameraConfigs.java */
    public static final class a implements q {
        public final C0003a s = new C0003a();

        /* compiled from: CameraConfigs.java */
        /* renamed from: androidx.camera.core.impl.d$a$a, reason: collision with other inner class name */
        public class C0003a implements UseCaseConfigFactory {
            @Override // androidx.camera.core.impl.UseCaseConfigFactory
            @Nullable
            public final Config a(@NonNull UseCaseConfigFactory.CaptureType captureType) {
                return null;
            }
        }

        @Override // androidx.camera.core.impl.q
        @NonNull
        public final Config getConfig() {
            return o.u;
        }
    }
}
