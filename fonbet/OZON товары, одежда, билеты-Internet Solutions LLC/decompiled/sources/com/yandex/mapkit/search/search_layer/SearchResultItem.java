package com.yandex.mapkit.search.search_layer;

import androidx.annotation.NonNull;
import com.yandex.mapkit.GeoObject;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.search.SubtitleItem;
import java.util.List;

/* loaded from: classes9.dex */
public interface SearchResultItem {
    @NonNull
    List<SubtitleItem> details();

    String getCategoryClass();

    @NonNull
    GeoObject getGeoObject();

    @NonNull
    String getId();

    @NonNull
    String getName();

    @NonNull
    Point getPoint();

    boolean hasDetails();

    boolean isClosed();

    boolean isCollection();

    boolean isOffline();
}
