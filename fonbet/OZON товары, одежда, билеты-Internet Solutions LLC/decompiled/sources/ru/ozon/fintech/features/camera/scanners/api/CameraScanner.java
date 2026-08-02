package ru.ozon.fintech.features.camera.scanners.api;

import android.graphics.Bitmap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\u0003H\u0016¨\u0006\r"}, d2 = {"Lru/ozon/fintech/features/camera/scanners/api/CameraScanner;", "", "warmUp", "", "process", "Lru/ozon/fintech/features/camera/scanners/api/DetectedData;", "bitmap", "Landroid/graphics/Bitmap;", "cameraScannerSource", "Lru/ozon/fintech/features/camera/scanners/api/CameraScannerSource;", "rotationDegrees", "", "shutdown", "camera-scanners-api_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface CameraScanner {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void shutdown(@NotNull CameraScanner cameraScanner) {
        }

        public static void warmUp(@NotNull CameraScanner cameraScanner) {
        }
    }

    @NotNull
    DetectedData process(@NotNull Bitmap bitmap, @NotNull CameraScannerSource cameraScannerSource, int rotationDegrees);

    void shutdown();

    void warmUp();
}
