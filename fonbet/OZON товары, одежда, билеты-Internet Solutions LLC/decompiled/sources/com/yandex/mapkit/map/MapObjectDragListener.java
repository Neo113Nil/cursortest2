package com.yandex.mapkit.map;

import androidx.annotation.NonNull;
import com.yandex.mapkit.geometry.Point;

/* loaded from: classes9.dex */
public interface MapObjectDragListener {
    void onMapObjectDrag(@NonNull MapObject mapObject, @NonNull Point point);

    void onMapObjectDragEnd(@NonNull MapObject mapObject);

    void onMapObjectDragStart(@NonNull MapObject mapObject);
}
