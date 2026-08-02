package com.yandex.mapkit.ui;

import androidx.annotation.NonNull;
import com.yandex.mapkit.ScreenRect;
import com.yandex.runtime.image.ImageProvider;
import com.yandex.runtime.ui_view.ViewProvider;

/* loaded from: classes9.dex */
public interface Overlay {
    boolean isValid();

    void remove();

    void setImage(@NonNull ImageProvider imageProvider, @NonNull ScreenRect screenRect);

    void setView(@NonNull ViewProvider viewProvider, @NonNull ScreenRect screenRect);
}
