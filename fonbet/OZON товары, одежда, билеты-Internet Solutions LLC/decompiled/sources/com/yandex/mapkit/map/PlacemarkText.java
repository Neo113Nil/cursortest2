package com.yandex.mapkit.map;

import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public interface PlacemarkText {
    @NonNull
    TextStyle getStyle();

    @NonNull
    String getText();

    boolean isValid();

    void setStyle(@NonNull TextStyle textStyle);

    void setText(@NonNull String str);
}
