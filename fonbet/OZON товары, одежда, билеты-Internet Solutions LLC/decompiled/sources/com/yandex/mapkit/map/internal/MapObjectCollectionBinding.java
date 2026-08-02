package com.yandex.mapkit.map.internal;

import androidx.annotation.NonNull;
import com.yandex.mapkit.geometry.Circle;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polygon;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.map.CircleMapObject;
import com.yandex.mapkit.map.ClusterListener;
import com.yandex.mapkit.map.ClusterizedPlacemarkCollection;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.mapkit.map.MapObjectCollection;
import com.yandex.mapkit.map.PlacemarkCreatedCallback;
import com.yandex.mapkit.map.PlacemarkMapObject;
import com.yandex.mapkit.map.PlacemarksStyler;
import com.yandex.mapkit.map.PolygonMapObject;
import com.yandex.mapkit.map.PolylineMapObject;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.image.AnimatedImageProvider;
import com.yandex.runtime.image.ImageProvider;
import com.yandex.runtime.subscription.Subscription;
import com.yandex.runtime.ui_view.ViewProvider;
import java.util.List;

/* loaded from: classes9.dex */
public class MapObjectCollectionBinding extends BaseMapObjectCollectionBinding implements MapObjectCollection {
    protected Subscription<ClusterListener> clusterListenerSubscription;

    protected MapObjectCollectionBinding(NativeObject nativeObject) {
        super(nativeObject);
        this.clusterListenerSubscription = new Subscription<ClusterListener>() { // from class: com.yandex.mapkit.map.internal.MapObjectCollectionBinding.1
            @Override // com.yandex.runtime.subscription.Subscription
            public NativeObject createNativeListener(ClusterListener clusterListener) {
                return MapObjectCollectionBinding.createClusterListener(clusterListener);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native NativeObject createClusterListener(ClusterListener clusterListener);

    @Override // com.yandex.mapkit.map.MapObjectCollection
    @NonNull
    public native CircleMapObject addCircle(@NonNull Circle circle);

    @Override // com.yandex.mapkit.map.MapObjectCollection
    @NonNull
    public native ClusterizedPlacemarkCollection addClusterizedPlacemarkCollection(@NonNull ClusterListener clusterListener);

    @Override // com.yandex.mapkit.map.MapObjectCollection
    @NonNull
    public native MapObjectCollection addCollection();

    @Override // com.yandex.mapkit.map.MapObjectCollection
    @NonNull
    @Deprecated
    public native PlacemarkMapObject addEmptyPlacemark(@NonNull Point point);

    @Override // com.yandex.mapkit.map.MapObjectCollection
    @NonNull
    @Deprecated
    public native List<PlacemarkMapObject> addEmptyPlacemarks(@NonNull List<Point> list);

    @Override // com.yandex.mapkit.map.MapObjectCollection
    @NonNull
    public native PlacemarkMapObject addPlacemark();

    @Override // com.yandex.mapkit.map.MapObjectCollection
    @NonNull
    @Deprecated
    public native PlacemarkMapObject addPlacemark(@NonNull Point point);

    @Override // com.yandex.mapkit.map.MapObjectCollection
    @NonNull
    @Deprecated
    public native PlacemarkMapObject addPlacemark(@NonNull Point point, @NonNull AnimatedImageProvider animatedImageProvider, @NonNull IconStyle iconStyle);

    @Override // com.yandex.mapkit.map.MapObjectCollection
    @NonNull
    @Deprecated
    public native PlacemarkMapObject addPlacemark(@NonNull Point point, @NonNull ImageProvider imageProvider);

    @Override // com.yandex.mapkit.map.MapObjectCollection
    @NonNull
    @Deprecated
    public native PlacemarkMapObject addPlacemark(@NonNull Point point, @NonNull ImageProvider imageProvider, @NonNull IconStyle iconStyle);

    @Override // com.yandex.mapkit.map.MapObjectCollection
    @NonNull
    @Deprecated
    public native PlacemarkMapObject addPlacemark(@NonNull Point point, @NonNull ViewProvider viewProvider);

    @Override // com.yandex.mapkit.map.MapObjectCollection
    @NonNull
    @Deprecated
    public native PlacemarkMapObject addPlacemark(@NonNull Point point, @NonNull ViewProvider viewProvider, @NonNull IconStyle iconStyle);

    @Override // com.yandex.mapkit.map.MapObjectCollection
    @NonNull
    public native PlacemarkMapObject addPlacemark(@NonNull PlacemarkCreatedCallback placemarkCreatedCallback);

    @Override // com.yandex.mapkit.map.MapObjectCollection
    @NonNull
    @Deprecated
    public native List<PlacemarkMapObject> addPlacemarks(@NonNull List<Point> list, @NonNull ImageProvider imageProvider, @NonNull IconStyle iconStyle);

    @Override // com.yandex.mapkit.map.MapObjectCollection
    @NonNull
    public native PolygonMapObject addPolygon(@NonNull Polygon polygon);

    @Override // com.yandex.mapkit.map.MapObjectCollection
    @NonNull
    public native PolylineMapObject addPolyline();

    @Override // com.yandex.mapkit.map.MapObjectCollection
    @NonNull
    public native PolylineMapObject addPolyline(@NonNull Polyline polyline);

    @Override // com.yandex.mapkit.map.MapObjectCollection
    @NonNull
    public native PlacemarksStyler placemarksStyler();
}
