package com.yandex.mapkit.map;

import androidx.annotation.NonNull;
import com.yandex.runtime.image.ImageProvider;

/* loaded from: classes9.dex */
public interface Icon extends PlacemarkPresentation {
    @NonNull
    IconStyle getStyle();

    void setImage(@NonNull ImageProvider imageProvider, @NonNull IconStyle iconStyle);

    void setImage(@NonNull ImageProvider imageProvider, @NonNull IconStyle iconStyle, @NonNull Callback callback);

    void setStyle(@NonNull IconStyle iconStyle);
}
