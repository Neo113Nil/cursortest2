package com.yandex.mapkit.search.internal;

import androidx.annotation.NonNull;
import com.yandex.mapkit.map.MapWindow;
import com.yandex.mapkit.search.Search;
import com.yandex.mapkit.search.SearchManager;
import com.yandex.mapkit.search.SearchManagerType;
import com.yandex.mapkit.search.search_layer.SearchLayer;
import com.yandex.runtime.NativeObject;

/* loaded from: classes9.dex */
public class SearchBinding implements Search {
    private final NativeObject nativeObject;

    protected SearchBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.search.Search
    @NonNull
    public native SearchLayer createSearchLayer(@NonNull MapWindow mapWindow);

    @Override // com.yandex.mapkit.search.Search
    @NonNull
    public native SearchManager createSearchManager(@NonNull SearchManagerType searchManagerType);

    @Override // com.yandex.mapkit.search.Search
    public native boolean isValid();
}
