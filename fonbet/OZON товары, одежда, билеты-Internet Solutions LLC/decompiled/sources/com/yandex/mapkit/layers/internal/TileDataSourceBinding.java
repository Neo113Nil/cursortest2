package com.yandex.mapkit.layers.internal;

import androidx.annotation.NonNull;
import com.yandex.mapkit.layers.TileDataSource;
import com.yandex.runtime.NativeObject;

/* loaded from: classes9.dex */
public class TileDataSourceBinding extends BaseDataSourceBinding implements TileDataSource {
    protected TileDataSourceBinding(NativeObject nativeObject) {
        super(nativeObject);
    }

    @Override // com.yandex.mapkit.layers.TileDataSource
    public native void invalidate(@NonNull String str);
}
