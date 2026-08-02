package com.yandex.mapkit.map;

import android.graphics.PointF;
import androidx.annotation.NonNull;
import java.util.List;

/* loaded from: classes9.dex */
public interface PlacemarksStyler {
    boolean isValid();

    void setScaleFunction(@NonNull List<PointF> list);
}
