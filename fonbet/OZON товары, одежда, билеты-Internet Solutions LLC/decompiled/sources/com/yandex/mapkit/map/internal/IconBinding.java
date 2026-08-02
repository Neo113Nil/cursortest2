package com.yandex.mapkit.map.internal;

import androidx.annotation.NonNull;
import com.yandex.mapkit.map.Callback;
import com.yandex.mapkit.map.Icon;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.image.ImageProvider;

/* loaded from: classes9.dex */
public class IconBinding extends PlacemarkPresentationBinding implements Icon {
    protected IconBinding(NativeObject nativeObject) {
        super(nativeObject);
    }

    @Override // com.yandex.mapkit.map.Icon
    @NonNull
    public native IconStyle getStyle();

    @Override // com.yandex.mapkit.map.Icon
    public native void setImage(@NonNull ImageProvider imageProvider, @NonNull IconStyle iconStyle);

    @Override // com.yandex.mapkit.map.Icon
    public native void setImage(@NonNull ImageProvider imageProvider, @NonNull IconStyle iconStyle, @NonNull Callback callback);

    @Override // com.yandex.mapkit.map.Icon
    public native void setStyle(@NonNull IconStyle iconStyle);
}
