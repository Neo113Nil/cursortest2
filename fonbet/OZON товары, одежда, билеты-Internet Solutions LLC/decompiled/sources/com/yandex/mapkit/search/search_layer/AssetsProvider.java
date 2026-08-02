package com.yandex.mapkit.search.search_layer;

import androidx.annotation.NonNull;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.runtime.image.ImageProvider;

/* loaded from: classes9.dex */
public interface AssetsProvider {
    boolean canProvideLabels(@NonNull SearchResultItem searchResultItem);

    @NonNull
    IconStyle iconStyle(@NonNull SearchResultItem searchResultItem, int i11);

    @NonNull
    ImageProvider image(@NonNull SearchResultItem searchResultItem, int i11);

    @NonNull
    Size size(@NonNull SearchResultItem searchResultItem, int i11);
}
