package com.yandex.mapkit.layers.internal;

import androidx.annotation.NonNull;
import com.yandex.mapkit.layers.DataSource;
import com.yandex.runtime.NativeObject;

/* loaded from: classes9.dex */
public class DataSourceBinding extends BaseDataSourceBinding implements DataSource {
    protected DataSourceBinding(NativeObject nativeObject) {
        super(nativeObject);
    }

    @Override // com.yandex.mapkit.layers.DataSource
    public native void setData(@NonNull byte[] bArr);
}
