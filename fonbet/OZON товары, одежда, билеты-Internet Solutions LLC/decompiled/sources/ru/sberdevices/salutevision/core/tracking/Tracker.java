package ru.sberdevices.salutevision.core.tracking;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.sberdevices.salutevision.core.data.SaluteVisionImage;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0015\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0005H&¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/sberdevices/salutevision/core/tracking/Tracker;", "T", "", "track", "frame", "Lru/sberdevices/salutevision/core/data/SaluteVisionImage;", "(Lru/sberdevices/salutevision/core/data/SaluteVisionImage;)Ljava/lang/Object;", "salutevision-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface Tracker<T> {
    T track(@NotNull SaluteVisionImage frame);
}
