package com.yandex.mapkit.search;

import androidx.annotation.NonNull;
import com.yandex.mapkit.geometry.Geometry;
import com.yandex.runtime.Error;
import java.util.List;

/* loaded from: classes9.dex */
public interface Session {

    public interface SearchListener {
        void onSearchError(@NonNull Error error);

        void onSearchResponse(@NonNull Response response);
    }

    void cancel();

    void fetchNextPage(@NonNull SearchListener searchListener);

    boolean hasNextPage();

    void resetSort();

    void resubmit(@NonNull SearchListener searchListener);

    void retry(@NonNull SearchListener searchListener);

    @Deprecated
    void setFilters(@NonNull List<BusinessFilter> list);

    void setSearchArea(@NonNull Geometry geometry);

    void setSearchOptions(@NonNull SearchOptions searchOptions);

    void setSortByDistance(@NonNull Geometry geometry);
}
