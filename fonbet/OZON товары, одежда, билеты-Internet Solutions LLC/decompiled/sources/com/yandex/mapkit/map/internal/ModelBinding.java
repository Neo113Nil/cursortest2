package com.yandex.mapkit.map.internal;

import androidx.annotation.NonNull;
import com.yandex.mapkit.map.Callback;
import com.yandex.mapkit.map.Model;
import com.yandex.mapkit.map.ModelStyle;
import com.yandex.runtime.DataProviderWithId;
import com.yandex.runtime.NativeObject;

/* loaded from: classes9.dex */
public class ModelBinding extends PlacemarkPresentationBinding implements Model {
    protected ModelBinding(NativeObject nativeObject) {
        super(nativeObject);
    }

    @Override // com.yandex.mapkit.map.Model
    @NonNull
    public native ModelStyle getModelStyle();

    @Override // com.yandex.mapkit.map.Model
    public native void setData(@NonNull DataProviderWithId dataProviderWithId, @NonNull Callback callback);

    @Override // com.yandex.mapkit.map.Model
    public native void setModelStyle(@NonNull ModelStyle modelStyle);
}
