package com.yandex.mapkit.map;

import androidx.annotation.NonNull;
import com.yandex.mapkit.geometry.Point;
import com.yandex.runtime.image.AnimatedImageProvider;
import com.yandex.runtime.image.ImageProvider;
import com.yandex.runtime.ui_view.ViewProvider;
import java.util.List;

/* loaded from: classes9.dex */
public interface ClusterizedPlacemarkCollection extends BaseMapObjectCollection {
    @NonNull
    @Deprecated
    PlacemarkMapObject addEmptyPlacemark(@NonNull Point point);

    @NonNull
    List<PlacemarkMapObject> addEmptyPlacemarks(@NonNull List<Point> list);

    @NonNull
    PlacemarkMapObject addPlacemark();

    @NonNull
    @Deprecated
    PlacemarkMapObject addPlacemark(@NonNull Point point);

    @NonNull
    @Deprecated
    PlacemarkMapObject addPlacemark(@NonNull Point point, @NonNull AnimatedImageProvider animatedImageProvider, @NonNull IconStyle iconStyle);

    @NonNull
    @Deprecated
    PlacemarkMapObject addPlacemark(@NonNull Point point, @NonNull ImageProvider imageProvider);

    @NonNull
    @Deprecated
    PlacemarkMapObject addPlacemark(@NonNull Point point, @NonNull ImageProvider imageProvider, @NonNull IconStyle iconStyle);

    @NonNull
    @Deprecated
    PlacemarkMapObject addPlacemark(@NonNull Point point, @NonNull ViewProvider viewProvider);

    @NonNull
    @Deprecated
    PlacemarkMapObject addPlacemark(@NonNull Point point, @NonNull ViewProvider viewProvider, @NonNull IconStyle iconStyle);

    @NonNull
    PlacemarkMapObject addPlacemark(@NonNull PlacemarkCreatedCallback placemarkCreatedCallback);

    @NonNull
    List<PlacemarkMapObject> addPlacemarks(@NonNull List<Point> list, @NonNull ImageProvider imageProvider, @NonNull IconStyle iconStyle);

    void clusterPlacemarks(double d11, int i11);
}
