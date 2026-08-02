package com.yandex.mapkit.map;

import androidx.annotation.NonNull;
import com.yandex.mapkit.images.ImageUrlProvider;

/* loaded from: classes9.dex */
public interface BaseDataSourceBuilder {
    boolean isValid();

    void setImageUrlProvider(@NonNull ImageUrlProvider imageUrlProvider);
}
