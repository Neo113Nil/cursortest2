package com.yandex.mapkit.road_events_layer;

import android.graphics.PointF;
import androidx.annotation.NonNull;
import com.yandex.runtime.image.ImageProvider;
import java.util.List;

/* loaded from: classes9.dex */
public interface RoadEventStyle {
    TextStyle getCaptionStyle();

    @NonNull
    PointF getIconAnchor();

    int getZoomMin();

    @NonNull
    List<PointF> getZoomScaleFunction();

    boolean isValid();

    void setCaptionStyle(TextStyle textStyle);

    void setIconAnchor(@NonNull PointF pointF);

    void setIconImage(@NonNull ImageProvider imageProvider);

    void setZoomMin(int i11);

    void setZoomScaleFunction(@NonNull List<PointF> list);
}
