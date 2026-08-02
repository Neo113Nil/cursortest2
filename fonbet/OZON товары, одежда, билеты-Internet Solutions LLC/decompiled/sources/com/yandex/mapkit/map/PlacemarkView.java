package com.yandex.mapkit.map;

import androidx.annotation.NonNull;
import com.yandex.runtime.ui_view.ViewProvider;

/* loaded from: classes9.dex */
public interface PlacemarkView extends PlacemarkPresentation {
    @NonNull
    IconStyle getStyle();

    void setStyle(@NonNull IconStyle iconStyle);

    void setView(@NonNull ViewProvider viewProvider, @NonNull IconStyle iconStyle);

    void setView(@NonNull ViewProvider viewProvider, @NonNull IconStyle iconStyle, @NonNull Callback callback);
}
