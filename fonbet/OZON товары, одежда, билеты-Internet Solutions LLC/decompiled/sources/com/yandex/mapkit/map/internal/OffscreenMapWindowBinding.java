package com.yandex.mapkit.map.internal;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.yandex.mapkit.map.MapWindow;
import com.yandex.mapkit.map.OffscreenMapWindow;
import com.yandex.runtime.NativeObject;

/* loaded from: classes9.dex */
public class OffscreenMapWindowBinding implements OffscreenMapWindow {
    private final NativeObject nativeObject;

    protected OffscreenMapWindowBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.map.OffscreenMapWindow
    @NonNull
    public native Bitmap captureScreenshot();

    @Override // com.yandex.mapkit.map.OffscreenMapWindow
    @NonNull
    public native MapWindow getMapWindow();
}
