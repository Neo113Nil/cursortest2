package com.yandex.mapkit.search.search_layer.internal;

import androidx.annotation.NonNull;
import com.yandex.mapkit.geometry.Geometry;
import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.mapkit.search.BusinessFilter;
import com.yandex.mapkit.search.FilterCollection;
import com.yandex.mapkit.search.SearchManager;
import com.yandex.mapkit.search.SearchMetadata;
import com.yandex.mapkit.search.SearchOptions;
import com.yandex.mapkit.search.search_layer.AssetsProvider;
import com.yandex.mapkit.search.search_layer.PlacemarkIconType;
import com.yandex.mapkit.search.search_layer.PlacemarkListener;
import com.yandex.mapkit.search.search_layer.SearchLayer;
import com.yandex.mapkit.search.search_layer.SearchResultItem;
import com.yandex.mapkit.search.search_layer.SearchResultListener;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.image.ImageProvider;
import com.yandex.runtime.subscription.Subscription;
import java.util.List;

/* loaded from: classes9.dex */
public class SearchLayerBinding implements SearchLayer {
    private final NativeObject nativeObject;
    protected Subscription<AssetsProvider> assetsProviderSubscription = new Subscription<AssetsProvider>() { // from class: com.yandex.mapkit.search.search_layer.internal.SearchLayerBinding.1
        @Override // com.yandex.runtime.subscription.Subscription
        public NativeObject createNativeListener(AssetsProvider assetsProvider) {
            return SearchLayerBinding.createAssetsProvider(assetsProvider);
        }
    };
    protected Subscription<PlacemarkListener> placemarkListenerSubscription = new Subscription<PlacemarkListener>() { // from class: com.yandex.mapkit.search.search_layer.internal.SearchLayerBinding.2
        @Override // com.yandex.runtime.subscription.Subscription
        public NativeObject createNativeListener(PlacemarkListener placemarkListener) {
            return SearchLayerBinding.createPlacemarkListener(placemarkListener);
        }
    };
    protected Subscription<SearchResultListener> searchResultListenerSubscription = new Subscription<SearchResultListener>() { // from class: com.yandex.mapkit.search.search_layer.internal.SearchLayerBinding.3
        @Override // com.yandex.runtime.subscription.Subscription
        public NativeObject createNativeListener(SearchResultListener searchResultListener) {
            return SearchLayerBinding.createSearchResultListener(searchResultListener);
        }
    };

    protected SearchLayerBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native NativeObject createAssetsProvider(AssetsProvider assetsProvider);

    /* JADX INFO: Access modifiers changed from: private */
    public static native NativeObject createPlacemarkListener(PlacemarkListener placemarkListener);

    /* JADX INFO: Access modifiers changed from: private */
    public static native NativeObject createSearchResultListener(SearchResultListener searchResultListener);

    @Override // com.yandex.mapkit.search.search_layer.SearchLayer
    public native void addPlacemarkListener(@NonNull PlacemarkListener placemarkListener);

    @Override // com.yandex.mapkit.search.search_layer.SearchLayer
    public native void addSearchResultListener(@NonNull SearchResultListener searchResultListener);

    @Override // com.yandex.mapkit.search.search_layer.SearchLayer
    public native void clear();

    @Override // com.yandex.mapkit.search.search_layer.SearchLayer
    public native void deselectPlacemark();

    @Override // com.yandex.mapkit.search.search_layer.SearchLayer
    public native void enableMapMoveOnSearchResponse(boolean z11);

    @Override // com.yandex.mapkit.search.search_layer.SearchLayer
    public native void enableRequestsOnMapMoves(boolean z11);

    @Override // com.yandex.mapkit.search.search_layer.SearchLayer
    public native void fetchNextPage();

    @Override // com.yandex.mapkit.search.search_layer.SearchLayer
    public native void forceUpdateIcon(@NonNull String str, @NonNull PlacemarkIconType placemarkIconType, @NonNull ImageProvider imageProvider, @NonNull IconStyle iconStyle);

    @Override // com.yandex.mapkit.search.search_layer.SearchLayer
    public native void forceUpdateMapObjects();

    @Override // com.yandex.mapkit.search.search_layer.SearchLayer
    @NonNull
    public native List<SearchResultItem> getSearchResultsList();

    @Override // com.yandex.mapkit.search.search_layer.SearchLayer
    public native boolean hasNextPage();

    @Override // com.yandex.mapkit.search.search_layer.SearchLayer
    public native boolean isValid();

    @Override // com.yandex.mapkit.search.search_layer.SearchLayer
    public native boolean isVisible();

    @Override // com.yandex.mapkit.search.search_layer.SearchLayer
    public native void obtainAdIcons(boolean z11);

    @Override // com.yandex.mapkit.search.search_layer.SearchLayer
    public native void removePlacemarkListener(@NonNull PlacemarkListener placemarkListener);

    @Override // com.yandex.mapkit.search.search_layer.SearchLayer
    public native void removeSearchResultListener(@NonNull SearchResultListener searchResultListener);

    @Override // com.yandex.mapkit.search.search_layer.SearchLayer
    public native void resetAssetsProvider();

    @Override // com.yandex.mapkit.search.search_layer.SearchLayer
    public native void resetSort();

    @Override // com.yandex.mapkit.search.search_layer.SearchLayer
    public native void resubmit();

    @Override // com.yandex.mapkit.search.search_layer.SearchLayer
    public native void searchByUri(@NonNull String str, @NonNull SearchOptions searchOptions);

    @Override // com.yandex.mapkit.search.search_layer.SearchLayer
    public native SearchMetadata searchMetadata();

    @Override // com.yandex.mapkit.search.search_layer.SearchLayer
    public native void selectPlacemark(@NonNull String str);

    @Override // com.yandex.mapkit.search.search_layer.SearchLayer
    public native String selectedPlacemarkId();

    @Override // com.yandex.mapkit.search.search_layer.SearchLayer
    public native void setAssetsProvider(@NonNull AssetsProvider assetsProvider);

    @Override // com.yandex.mapkit.search.search_layer.SearchLayer
    public native void setFilterCollection(FilterCollection filterCollection);

    @Override // com.yandex.mapkit.search.search_layer.SearchLayer
    @Deprecated
    public native void setFilters(@NonNull List<BusinessFilter> list);

    @Override // com.yandex.mapkit.search.search_layer.SearchLayer
    public native void setInsets(int i11, int i12, int i13, int i14);

    @Override // com.yandex.mapkit.search.search_layer.SearchLayer
    public native void setPolylinePosition(@NonNull PolylinePosition polylinePosition);

    @Override // com.yandex.mapkit.search.search_layer.SearchLayer
    public native void setSearchManager(@NonNull SearchManager searchManager);

    @Override // com.yandex.mapkit.search.search_layer.SearchLayer
    public native void setSortByDistance(@NonNull Geometry geometry);

    @Override // com.yandex.mapkit.search.search_layer.SearchLayer
    public native void setVisible(boolean z11);

    @Override // com.yandex.mapkit.search.search_layer.SearchLayer
    public native void submitQuery(@NonNull String str, @NonNull Geometry geometry, @NonNull SearchOptions searchOptions);

    @Override // com.yandex.mapkit.search.search_layer.SearchLayer
    public native void submitQuery(@NonNull String str, @NonNull SearchOptions searchOptions);
}
