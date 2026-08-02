package com.yandex.mapkit.layers.internal;

import androidx.annotation.NonNull;
import com.yandex.mapkit.layers.BaseDataSource;
import com.yandex.runtime.NativeObject;

/* loaded from: classes9.dex */
public class BaseDataSourceBinding implements BaseDataSource {
    private final NativeObject nativeObject;

    protected BaseDataSourceBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.layers.BaseDataSource
    @NonNull
    public native String getId();

    @Override // com.yandex.mapkit.layers.BaseDataSource
    public native boolean isValid();
}
