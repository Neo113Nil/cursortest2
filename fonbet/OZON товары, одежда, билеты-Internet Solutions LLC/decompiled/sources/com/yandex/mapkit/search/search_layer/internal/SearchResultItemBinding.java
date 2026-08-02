package com.yandex.mapkit.search.search_layer.internal;

import androidx.annotation.NonNull;
import com.yandex.mapkit.GeoObject;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.search.SubtitleItem;
import com.yandex.mapkit.search.search_layer.SearchResultItem;
import com.yandex.runtime.NativeObject;
import java.util.List;

/* loaded from: classes9.dex */
public class SearchResultItemBinding implements SearchResultItem {
    private final NativeObject nativeObject;

    protected SearchResultItemBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.search.search_layer.SearchResultItem
    @NonNull
    public native List<SubtitleItem> details();

    @Override // com.yandex.mapkit.search.search_layer.SearchResultItem
    public native String getCategoryClass();

    @Override // com.yandex.mapkit.search.search_layer.SearchResultItem
    @NonNull
    public native GeoObject getGeoObject();

    @Override // com.yandex.mapkit.search.search_layer.SearchResultItem
    @NonNull
    public native String getId();

    @Override // com.yandex.mapkit.search.search_layer.SearchResultItem
    @NonNull
    public native String getName();

    @Override // com.yandex.mapkit.search.search_layer.SearchResultItem
    @NonNull
    public native Point getPoint();

    @Override // com.yandex.mapkit.search.search_layer.SearchResultItem
    public native boolean hasDetails();

    @Override // com.yandex.mapkit.search.search_layer.SearchResultItem
    public native boolean isClosed();

    @Override // com.yandex.mapkit.search.search_layer.SearchResultItem
    public native boolean isCollection();

    @Override // com.yandex.mapkit.search.search_layer.SearchResultItem
    public native boolean isOffline();
}
