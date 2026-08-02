package com.yandex.mapkit.map.internal;

import androidx.annotation.NonNull;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.ClusterizedPlacemarkCollection;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.mapkit.map.PlacemarkCreatedCallback;
import com.yandex.mapkit.map.PlacemarkMapObject;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.image.AnimatedImageProvider;
import com.yandex.runtime.image.ImageProvider;
import com.yandex.runtime.ui_view.ViewProvider;
import java.util.List;

/* loaded from: classes9.dex */
public class ClusterizedPlacemarkCollectionBinding extends BaseMapObjectCollectionBinding implements ClusterizedPlacemarkCollection {
    protected ClusterizedPlacemarkCollectionBinding(NativeObject nativeObject) {
        super(nativeObject);
    }

    @Override // com.yandex.mapkit.map.ClusterizedPlacemarkCollection
    @NonNull
    @Deprecated
    public native PlacemarkMapObject addEmptyPlacemark(@NonNull Point point);

    @Override // com.yandex.mapkit.map.ClusterizedPlacemarkCollection
    @NonNull
    public native List<PlacemarkMapObject> addEmptyPlacemarks(@NonNull List<Point> list);

    @Override // com.yandex.mapkit.map.ClusterizedPlacemarkCollection
    @NonNull
    public native PlacemarkMapObject addPlacemark();

    @Override // com.yandex.mapkit.map.ClusterizedPlacemarkCollection
    @NonNull
    @Deprecated
    public native PlacemarkMapObject addPlacemark(@NonNull Point point);

    @Override // com.yandex.mapkit.map.ClusterizedPlacemarkCollection
    @NonNull
    @Deprecated
    public native PlacemarkMapObject addPlacemark(@NonNull Point point, @NonNull AnimatedImageProvider animatedImageProvider, @NonNull IconStyle iconStyle);

    @Override // com.yandex.mapkit.map.ClusterizedPlacemarkCollection
    @NonNull
    @Deprecated
    public native PlacemarkMapObject addPlacemark(@NonNull Point point, @NonNull ImageProvider imageProvider);

    @Override // com.yandex.mapkit.map.ClusterizedPlacemarkCollection
    @NonNull
    @Deprecated
    public native PlacemarkMapObject addPlacemark(@NonNull Point point, @NonNull ImageProvider imageProvider, @NonNull IconStyle iconStyle);

    @Override // com.yandex.mapkit.map.ClusterizedPlacemarkCollection
    @NonNull
    @Deprecated
    public native PlacemarkMapObject addPlacemark(@NonNull Point point, @NonNull ViewProvider viewProvider);

    @Override // com.yandex.mapkit.map.ClusterizedPlacemarkCollection
    @NonNull
    @Deprecated
    public native PlacemarkMapObject addPlacemark(@NonNull Point point, @NonNull ViewProvider viewProvider, @NonNull IconStyle iconStyle);

    @Override // com.yandex.mapkit.map.ClusterizedPlacemarkCollection
    @NonNull
    public native PlacemarkMapObject addPlacemark(@NonNull PlacemarkCreatedCallback placemarkCreatedCallback);

    @Override // com.yandex.mapkit.map.ClusterizedPlacemarkCollection
    @NonNull
    public native List<PlacemarkMapObject> addPlacemarks(@NonNull List<Point> list, @NonNull ImageProvider imageProvider, @NonNull IconStyle iconStyle);

    @Override // com.yandex.mapkit.map.ClusterizedPlacemarkCollection
    public native void clusterPlacemarks(double d11, int i11);
}
