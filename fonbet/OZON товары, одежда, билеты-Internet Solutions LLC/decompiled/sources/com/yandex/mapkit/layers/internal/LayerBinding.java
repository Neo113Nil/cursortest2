package com.yandex.mapkit.layers.internal;

import androidx.annotation.NonNull;
import com.yandex.mapkit.layers.DataSourceLayer;
import com.yandex.mapkit.layers.Layer;
import com.yandex.runtime.NativeObject;

/* loaded from: classes9.dex */
public class LayerBinding implements Layer {
    private final NativeObject nativeObject;

    protected LayerBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.layers.Layer
    @NonNull
    public native DataSourceLayer dataSourceLayer();

    @Override // com.yandex.mapkit.layers.Layer
    public native boolean isValid();

    @Override // com.yandex.mapkit.layers.Layer
    public native void remove();
}
