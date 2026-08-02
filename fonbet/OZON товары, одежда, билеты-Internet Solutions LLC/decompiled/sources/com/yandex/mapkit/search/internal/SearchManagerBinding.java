package com.yandex.mapkit.search.internal;

import androidx.annotation.NonNull;
import com.yandex.mapkit.geometry.Geometry;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.search.SearchManager;
import com.yandex.mapkit.search.SearchOptions;
import com.yandex.mapkit.search.Session;
import com.yandex.mapkit.search.SuggestSession;
import com.yandex.runtime.NativeObject;

/* loaded from: classes9.dex */
public class SearchManagerBinding implements SearchManager {
    private final NativeObject nativeObject;

    protected SearchManagerBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.search.SearchManager
    @NonNull
    public native SuggestSession createSuggestSession();

    @Override // com.yandex.mapkit.search.SearchManager
    @NonNull
    public native Session resolveURI(@NonNull String str, @NonNull SearchOptions searchOptions, @NonNull Session.SearchListener searchListener);

    @Override // com.yandex.mapkit.search.SearchManager
    @NonNull
    public native Session searchByURI(@NonNull String str, @NonNull SearchOptions searchOptions, @NonNull Session.SearchListener searchListener);

    @Override // com.yandex.mapkit.search.SearchManager
    @NonNull
    public native Session submit(@NonNull Point point, Integer num, @NonNull SearchOptions searchOptions, @NonNull Session.SearchListener searchListener);

    @Override // com.yandex.mapkit.search.SearchManager
    @NonNull
    public native Session submit(@NonNull String str, @NonNull Geometry geometry, @NonNull SearchOptions searchOptions, @NonNull Session.SearchListener searchListener);

    @Override // com.yandex.mapkit.search.SearchManager
    @NonNull
    public native Session submit(@NonNull String str, @NonNull Polyline polyline, @NonNull Geometry geometry, @NonNull SearchOptions searchOptions, @NonNull Session.SearchListener searchListener);
}
