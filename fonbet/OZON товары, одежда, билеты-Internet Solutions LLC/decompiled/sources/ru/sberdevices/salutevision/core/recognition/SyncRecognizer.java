package ru.sberdevices.salutevision.core.recognition;

import android.graphics.RectF;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.sberdevices.salutevision.core.data.SaluteVisionImage;
import ru.sberdevices.salutevision.core.data.SaluteVisionRecognition;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH&¨\u0006\t"}, d2 = {"Lru/sberdevices/salutevision/core/recognition/SyncRecognizer;", "", "process", "", "Lru/sberdevices/salutevision/core/data/SaluteVisionRecognition;", "image", "Lru/sberdevices/salutevision/core/data/SaluteVisionImage;", "rect", "Landroid/graphics/RectF;", "salutevision-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface SyncRecognizer {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ List process$default(SyncRecognizer syncRecognizer, SaluteVisionImage saluteVisionImage, RectF rectF, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: process");
            }
            if ((i11 & 2) != 0) {
                rectF = null;
            }
            return syncRecognizer.process(saluteVisionImage, rectF);
        }
    }

    @NotNull
    List<SaluteVisionRecognition> process(@NotNull SaluteVisionImage image, RectF rect);
}
