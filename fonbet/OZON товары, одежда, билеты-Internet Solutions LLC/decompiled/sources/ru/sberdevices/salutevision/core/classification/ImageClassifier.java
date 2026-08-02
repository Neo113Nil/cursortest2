package ru.sberdevices.salutevision.core.classification;

import android.content.Context;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.sberdevices.salutevision.core.data.ObjectClassRecognition;
import ru.sberdevices.salutevision.core.data.SaluteVisionImage;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lru/sberdevices/salutevision/core/classification/ImageClassifier;", "", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "predict", "Lru/sberdevices/salutevision/core/data/ObjectClassRecognition;", "image", "Lru/sberdevices/salutevision/core/data/SaluteVisionImage;", "salutevision-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface ImageClassifier {
    @NotNull
    Context getContext();

    @NotNull
    ObjectClassRecognition predict(@NotNull SaluteVisionImage image);
}
