package com.yandex.mapkit.map;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public interface OffscreenMapWindow {
    @NonNull
    Bitmap captureScreenshot();

    @NonNull
    MapWindow getMapWindow();
}
