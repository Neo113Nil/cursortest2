package com.yandex.mapkit.layers;

import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public interface DataSourceLayer {
    void clear();

    boolean isActive();

    boolean isValid();

    void remove();

    void resetStyles();

    void setActive(boolean z11);

    void setDataSourceListener(DataSourceListener dataSourceListener);

    void setLayerLoadedListener(LayerLoadedListener layerLoadedListener);

    boolean setStyle(int i11, @NonNull String str);
}
