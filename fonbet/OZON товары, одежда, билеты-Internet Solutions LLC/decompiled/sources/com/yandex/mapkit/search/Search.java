package com.yandex.mapkit.search;

import androidx.annotation.NonNull;
import com.yandex.mapkit.map.MapWindow;
import com.yandex.mapkit.search.search_layer.SearchLayer;

/* loaded from: classes9.dex */
public interface Search {
    @NonNull
    SearchLayer createSearchLayer(@NonNull MapWindow mapWindow);

    @NonNull
    SearchManager createSearchManager(@NonNull SearchManagerType searchManagerType);

    boolean isValid();
}
