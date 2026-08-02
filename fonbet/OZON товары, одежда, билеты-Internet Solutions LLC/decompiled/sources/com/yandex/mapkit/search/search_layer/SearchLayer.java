package com.yandex.mapkit.search.search_layer;

import androidx.annotation.NonNull;
import com.yandex.mapkit.geometry.Geometry;
import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.mapkit.search.BusinessFilter;
import com.yandex.mapkit.search.FilterCollection;
import com.yandex.mapkit.search.SearchManager;
import com.yandex.mapkit.search.SearchMetadata;
import com.yandex.mapkit.search.SearchOptions;
import com.yandex.runtime.image.ImageProvider;
import java.util.List;

/* loaded from: classes9.dex */
public interface SearchLayer {
    void addPlacemarkListener(@NonNull PlacemarkListener placemarkListener);

    void addSearchResultListener(@NonNull SearchResultListener searchResultListener);

    void clear();

    void deselectPlacemark();

    void enableMapMoveOnSearchResponse(boolean z11);

    void enableRequestsOnMapMoves(boolean z11);

    void fetchNextPage();

    void forceUpdateIcon(@NonNull String str, @NonNull PlacemarkIconType placemarkIconType, @NonNull ImageProvider imageProvider, @NonNull IconStyle iconStyle);

    void forceUpdateMapObjects();

    @NonNull
    List<SearchResultItem> getSearchResultsList();

    boolean hasNextPage();

    boolean isValid();

    boolean isVisible();

    void obtainAdIcons(boolean z11);

    void removePlacemarkListener(@NonNull PlacemarkListener placemarkListener);

    void removeSearchResultListener(@NonNull SearchResultListener searchResultListener);

    void resetAssetsProvider();

    void resetSort();

    void resubmit();

    void searchByUri(@NonNull String str, @NonNull SearchOptions searchOptions);

    SearchMetadata searchMetadata();

    void selectPlacemark(@NonNull String str);

    String selectedPlacemarkId();

    void setAssetsProvider(@NonNull AssetsProvider assetsProvider);

    void setFilterCollection(FilterCollection filterCollection);

    @Deprecated
    void setFilters(@NonNull List<BusinessFilter> list);

    void setInsets(int i11, int i12, int i13, int i14);

    void setPolylinePosition(@NonNull PolylinePosition polylinePosition);

    void setSearchManager(@NonNull SearchManager searchManager);

    void setSortByDistance(@NonNull Geometry geometry);

    void setVisible(boolean z11);

    void submitQuery(@NonNull String str, @NonNull Geometry geometry, @NonNull SearchOptions searchOptions);

    void submitQuery(@NonNull String str, @NonNull SearchOptions searchOptions);
}
