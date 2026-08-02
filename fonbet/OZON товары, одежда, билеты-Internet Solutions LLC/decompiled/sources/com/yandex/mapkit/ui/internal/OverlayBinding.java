package com.yandex.mapkit.ui.internal;

import androidx.annotation.NonNull;
import com.yandex.mapkit.ScreenRect;
import com.yandex.mapkit.ui.Overlay;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.image.ImageProvider;
import com.yandex.runtime.ui_view.ViewProvider;

/* loaded from: classes9.dex */
public class OverlayBinding implements Overlay {
    private final NativeObject nativeObject;

    protected OverlayBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.ui.Overlay
    public native boolean isValid();

    @Override // com.yandex.mapkit.ui.Overlay
    public native void remove();

    @Override // com.yandex.mapkit.ui.Overlay
    public native void setImage(@NonNull ImageProvider imageProvider, @NonNull ScreenRect screenRect);

    @Override // com.yandex.mapkit.ui.Overlay
    public native void setView(@NonNull ViewProvider viewProvider, @NonNull ScreenRect screenRect);
}
