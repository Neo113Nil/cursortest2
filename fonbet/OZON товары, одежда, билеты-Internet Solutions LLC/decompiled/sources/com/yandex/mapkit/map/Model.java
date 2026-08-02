package com.yandex.mapkit.map;

import androidx.annotation.NonNull;
import com.yandex.runtime.DataProviderWithId;

/* loaded from: classes9.dex */
public interface Model extends PlacemarkPresentation {
    @NonNull
    ModelStyle getModelStyle();

    void setData(@NonNull DataProviderWithId dataProviderWithId, @NonNull Callback callback);

    void setModelStyle(@NonNull ModelStyle modelStyle);
}
