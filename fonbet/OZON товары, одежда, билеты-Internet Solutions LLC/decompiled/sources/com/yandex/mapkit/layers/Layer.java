package com.yandex.mapkit.layers;

import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public interface Layer {
    @NonNull
    DataSourceLayer dataSourceLayer();

    boolean isValid();

    void remove();
}
