package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.utils.ExifData;
import java.util.ArrayList;

/* compiled from: CameraCaptureResult.java */
/* loaded from: classes11.dex */
public interface c {

    /* compiled from: CameraCaptureResult.java */
    public static final class a implements c {
        @Override // androidx.camera.core.impl.c
        @NonNull
        public final CameraCaptureMetaData$FlashState b() {
            return CameraCaptureMetaData$FlashState.UNKNOWN;
        }

        @Override // androidx.camera.core.impl.c
        @NonNull
        public final CameraCaptureMetaData$AfState c() {
            return CameraCaptureMetaData$AfState.UNKNOWN;
        }

        @Override // androidx.camera.core.impl.c
        @NonNull
        public final CameraCaptureMetaData$AfMode d() {
            return CameraCaptureMetaData$AfMode.UNKNOWN;
        }

        @Override // androidx.camera.core.impl.c
        @NonNull
        public final CameraCaptureMetaData$AeState e() {
            return CameraCaptureMetaData$AeState.UNKNOWN;
        }
    }

    default void a(@NonNull ExifData.b bVar) {
        int i;
        ArrayList arrayList = bVar.a;
        CameraCaptureMetaData$FlashState b = b();
        if (b == CameraCaptureMetaData$FlashState.UNKNOWN) {
            return;
        }
        int i2 = ExifData.a.a[b.ordinal()];
        if (i2 == 1) {
            i = 0;
        } else if (i2 == 2) {
            i = 32;
        } else {
            if (i2 != 3) {
                b.toString();
                return;
            }
            i = 1;
        }
        if ((i & 1) == 1) {
            bVar.c("LightSource", String.valueOf(4), arrayList);
        }
        bVar.c("Flash", String.valueOf(i), arrayList);
    }

    @NonNull
    CameraCaptureMetaData$FlashState b();

    @NonNull
    CameraCaptureMetaData$AfState c();

    @NonNull
    CameraCaptureMetaData$AfMode d();

    @NonNull
    CameraCaptureMetaData$AeState e();
}
