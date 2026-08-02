package ru.sberdevices.salutevision.multiscanner;

import android.graphics.RectF;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.sberdevices.salutevision.core.data.RoiDetectorType;
import ru.sberdevices.salutevision.core.data.SaluteVisionImage;
import ru.sberdevices.salutevision.core.data.SaluteVisionRecognition;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J.\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00060\u0013R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/sberdevices/salutevision/multiscanner/Scanner;", "", "wrapper", "Lru/sberdevices/salutevision/multiscanner/ScannerWrapper;", "(Lru/sberdevices/salutevision/multiscanner/ScannerWrapper;)V", "modelsDescription", "", "", "getModelsDescription", "()Ljava/util/List;", "getWrapper", "()Lru/sberdevices/salutevision/multiscanner/ScannerWrapper;", "read", "Lru/sberdevices/salutevision/core/data/SaluteVisionRecognition;", "image", "Lru/sberdevices/salutevision/core/data/SaluteVisionImage;", "rect", "Landroid/graphics/RectF;", "roiMap", "", "Lru/sberdevices/salutevision/core/data/RoiDetectorType;", "salutevision-multiscanner_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public class Scanner {

    @NotNull
    private final List<String> modelsDescription;

    @NotNull
    private final ScannerWrapper wrapper;

    public Scanner(@NotNull ScannerWrapper wrapper) {
        Intrinsics.checkNotNullParameter(wrapper, "wrapper");
        this.wrapper = wrapper;
        this.modelsDescription = wrapper.getModelsDescription();
    }

    @NotNull
    public final List<String> getModelsDescription() {
        return this.modelsDescription;
    }

    @NotNull
    public final ScannerWrapper getWrapper() {
        return this.wrapper;
    }

    @NotNull
    public final List<SaluteVisionRecognition> read(@NotNull SaluteVisionImage image, RectF rect) {
        Intrinsics.checkNotNullParameter(image, "image");
        return this.wrapper.read(image, rect);
    }

    @NotNull
    public final List<SaluteVisionRecognition> read(@NotNull SaluteVisionImage image, @NotNull Map<RoiDetectorType, ? extends List<? extends RectF>> roiMap) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(roiMap, "roiMap");
        return this.wrapper.read(image, roiMap);
    }
}
