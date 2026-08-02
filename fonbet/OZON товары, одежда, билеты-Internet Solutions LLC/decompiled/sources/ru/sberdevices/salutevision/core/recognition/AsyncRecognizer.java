package ru.sberdevices.salutevision.core.recognition;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import ru.sberdevices.salutevision.core.data.SaluteVisionImage;
import ru.sberdevices.salutevision.core.data.SaluteVisionRecognition;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\"\u0010\u0006\u001a\u00020\u00032\u0018\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\u00030\bH&¨\u0006\u000b"}, d2 = {"Lru/sberdevices/salutevision/core/recognition/AsyncRecognizer;", "", "detect", "", "image", "Lru/sberdevices/salutevision/core/data/SaluteVisionImage;", "onDetect", "onDetectListener", "Lkotlin/Function1;", "", "Lru/sberdevices/salutevision/core/data/SaluteVisionRecognition;", "salutevision-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface AsyncRecognizer {
    void detect(@NotNull SaluteVisionImage image);

    void onDetect(@NotNull Function1<? super List<? extends SaluteVisionRecognition>, Unit> onDetectListener);
}
