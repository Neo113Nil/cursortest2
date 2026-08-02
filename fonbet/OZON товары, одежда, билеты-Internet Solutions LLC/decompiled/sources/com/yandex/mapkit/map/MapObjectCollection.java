package com.yandex.mapkit.map;

import androidx.annotation.NonNull;
import com.yandex.mapkit.geometry.Circle;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polygon;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.runtime.image.AnimatedImageProvider;
import com.yandex.runtime.image.ImageProvider;
import com.yandex.runtime.ui_view.ViewProvider;
import java.util.List;

/* loaded from: classes9.dex */
public interface MapObjectCollection extends BaseMapObjectCollection {
    @NonNull
    CircleMapObject addCircle(@NonNull Circle circle);

    @NonNull
    ClusterizedPlacemarkCollection addClusterizedPlacemarkCollection(@NonNull ClusterListener clusterListener);

    @NonNull
    MapObjectCollection addCollection();

    @NonNull
    @Deprecated
    PlacemarkMapObject addEmptyPlacemark(@NonNull Point point);

    @NonNull
    @Deprecated
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
    @Deprecated
    List<PlacemarkMapObject> addPlacemarks(@NonNull List<Point> list, @NonNull ImageProvider imageProvider, @NonNull IconStyle iconStyle);

    @NonNull
    PolygonMapObject addPolygon(@NonNull Polygon polygon);

    @NonNull
    PolylineMapObject addPolyline();

    @NonNull
    PolylineMapObject addPolyline(@NonNull Polyline polyline);

    @NonNull
    PlacemarksStyler placemarksStyler();
}
