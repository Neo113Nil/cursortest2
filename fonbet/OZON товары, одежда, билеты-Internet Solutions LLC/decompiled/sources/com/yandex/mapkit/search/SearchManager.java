package com.yandex.mapkit.search;

import androidx.annotation.NonNull;
import com.yandex.mapkit.geometry.Geometry;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.search.Session;

/* loaded from: classes9.dex */
public interface SearchManager {
    @NonNull
    SuggestSession createSuggestSession();

    @NonNull
    Session resolveURI(@NonNull String str, @NonNull SearchOptions searchOptions, @NonNull Session.SearchListener searchListener);

    @NonNull
    Session searchByURI(@NonNull String str, @NonNull SearchOptions searchOptions, @NonNull Session.SearchListener searchListener);

    @NonNull
    Session submit(@NonNull Point point, Integer num, @NonNull SearchOptions searchOptions, @NonNull Session.SearchListener searchListener);

    @NonNull
    Session submit(@NonNull String str, @NonNull Geometry geometry, @NonNull SearchOptions searchOptions, @NonNull Session.SearchListener searchListener);

    @NonNull
    Session submit(@NonNull String str, @NonNull Polyline polyline, @NonNull Geometry geometry, @NonNull SearchOptions searchOptions, @NonNull Session.SearchListener searchListener);
}
