package com.yandex.mapkit.map;

import androidx.annotation.NonNull;
import com.yandex.mapkit.geometry.Point;

/* loaded from: classes9.dex */
public interface InputListener {
    void onMapLongTap(@NonNull Map map, @NonNull Point point);

    void onMapTap(@NonNull Map map, @NonNull Point point);
}
