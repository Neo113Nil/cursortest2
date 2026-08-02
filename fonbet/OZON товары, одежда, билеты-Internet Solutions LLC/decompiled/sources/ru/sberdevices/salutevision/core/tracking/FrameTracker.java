package ru.sberdevices.salutevision.core.tracking;

import android.graphics.PointF;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.sberdevices.salutevision.core.data.SaluteVisionImage;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0013\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH&¨\u0006\n"}, d2 = {"Lru/sberdevices/salutevision/core/tracking/FrameTracker;", "Lru/sberdevices/salutevision/core/tracking/Tracker;", "", "lock", "", "frame", "Lru/sberdevices/salutevision/core/data/SaluteVisionImage;", "region", "", "Landroid/graphics/PointF;", "salutevision-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface FrameTracker extends Tracker<double[]> {
    boolean lock(@NotNull SaluteVisionImage frame);

    boolean lock(@NotNull SaluteVisionImage frame, @NotNull List<? extends PointF> region);
}
