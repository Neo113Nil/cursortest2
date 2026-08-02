package com.yandex.mapkit.search.internal;

import androidx.annotation.NonNull;
import com.yandex.mapkit.geometry.Geometry;
import com.yandex.mapkit.search.BusinessFilter;
import com.yandex.mapkit.search.SearchOptions;
import com.yandex.mapkit.search.Session;
import com.yandex.runtime.NativeObject;
import java.util.List;

/* loaded from: classes9.dex */
public class SessionBinding implements Session {
    private final NativeObject nativeObject;

    protected SessionBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.search.Session
    public native void cancel();

    @Override // com.yandex.mapkit.search.Session
    public native void fetchNextPage(@NonNull Session.SearchListener searchListener);

    @Override // com.yandex.mapkit.search.Session
    public native boolean hasNextPage();

    @Override // com.yandex.mapkit.search.Session
    public native void resetSort();

    @Override // com.yandex.mapkit.search.Session
    public native void resubmit(@NonNull Session.SearchListener searchListener);

    @Override // com.yandex.mapkit.search.Session
    public native void retry(@NonNull Session.SearchListener searchListener);

    @Override // com.yandex.mapkit.search.Session
    @Deprecated
    public native void setFilters(@NonNull List<BusinessFilter> list);

    @Override // com.yandex.mapkit.search.Session
    public native void setSearchArea(@NonNull Geometry geometry);

    @Override // com.yandex.mapkit.search.Session
    public native void setSearchOptions(@NonNull SearchOptions searchOptions);

    @Override // com.yandex.mapkit.search.Session
    public native void setSortByDistance(@NonNull Geometry geometry);
}
