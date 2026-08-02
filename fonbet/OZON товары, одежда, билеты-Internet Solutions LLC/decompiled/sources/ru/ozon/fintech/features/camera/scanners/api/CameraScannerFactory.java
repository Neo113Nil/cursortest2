package ru.ozon.fintech.features.camera.scanners.api;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\u00020\u0001JB\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH&¨\u0006\u0010"}, d2 = {"Lru/ozon/fintech/features/camera/scanners/api/CameraScannerFactory;", "", "provide", "Lru/ozon/fintech/features/camera/scanners/api/CameraScanner;", "cameraScannerType", "Lru/ozon/fintech/features/camera/scanners/api/CameraScannerType;", "cameraScannerMode", "Lru/ozon/fintech/features/camera/scanners/api/CameraScannerMode;", "barcodeFormats", "", "", "phoneRegex", "separateProcess", "", "processTimeout", "", "camera-scanners-api_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface CameraScannerFactory {
    CameraScanner provide(@NotNull CameraScannerType cameraScannerType, @NotNull CameraScannerMode cameraScannerMode, @NotNull List<String> barcodeFormats, String phoneRegex, boolean separateProcess, long processTimeout);
}
