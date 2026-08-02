package com.yandex.mapkit.map;

import android.graphics.PointF;
import androidx.annotation.NonNull;
import com.yandex.mapkit.geometry.Point;
import com.yandex.runtime.image.ImageProvider;
import com.yandex.runtime.ui_view.ViewProvider;
import java.util.List;

/* loaded from: classes9.dex */
public interface PlacemarkMapObject extends MapObject {
    float getDirection();

    @NonNull
    Point getGeometry();

    float getOpacity();

    @NonNull
    PlacemarkText getText();

    void setDirection(float f7);

    void setGeometry(@NonNull Point point);

    void setIcon(@NonNull ImageProvider imageProvider);

    void setIcon(@NonNull ImageProvider imageProvider, @NonNull Callback callback);

    void setIcon(@NonNull ImageProvider imageProvider, @NonNull IconStyle iconStyle);

    void setIcon(@NonNull ImageProvider imageProvider, @NonNull IconStyle iconStyle, @NonNull Callback callback);

    void setIconStyle(@NonNull IconStyle iconStyle);

    void setOpacity(float f7);

    void setScaleFunction(@NonNull List<PointF> list);

    void setText(@NonNull String str);

    void setText(@NonNull String str, @NonNull TextStyle textStyle);

    void setTextStyle(@NonNull TextStyle textStyle);

    void setView(@NonNull ViewProvider viewProvider);

    void setView(@NonNull ViewProvider viewProvider, @NonNull Callback callback);

    void setView(@NonNull ViewProvider viewProvider, @NonNull IconStyle iconStyle);

    void setView(@NonNull ViewProvider viewProvider, @NonNull IconStyle iconStyle, @NonNull Callback callback);

    @NonNull
    PlacemarkAnimation useAnimation();

    @NonNull
    CompositeIcon useCompositeIcon();

    @NonNull
    Icon useIcon();

    @NonNull
    Model useModel();

    @NonNull
    PlacemarkView useView();
}
