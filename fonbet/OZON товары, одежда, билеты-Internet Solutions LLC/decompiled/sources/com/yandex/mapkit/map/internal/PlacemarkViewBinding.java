package com.yandex.mapkit.map.internal;

import androidx.annotation.NonNull;
import com.yandex.mapkit.map.Callback;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.mapkit.map.PlacemarkView;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.ui_view.ViewProvider;

/* loaded from: classes9.dex */
public class PlacemarkViewBinding extends PlacemarkPresentationBinding implements PlacemarkView {
    protected PlacemarkViewBinding(NativeObject nativeObject) {
        super(nativeObject);
    }

    @Override // com.yandex.mapkit.map.PlacemarkView
    @NonNull
    public native IconStyle getStyle();

    @Override // com.yandex.mapkit.map.PlacemarkView
    public native void setStyle(@NonNull IconStyle iconStyle);

    @Override // com.yandex.mapkit.map.PlacemarkView
    public native void setView(@NonNull ViewProvider viewProvider, @NonNull IconStyle iconStyle);

    @Override // com.yandex.mapkit.map.PlacemarkView
    public native void setView(@NonNull ViewProvider viewProvider, @NonNull IconStyle iconStyle, @NonNull Callback callback);
}
