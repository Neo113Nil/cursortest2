package com.yandex.mapkit.map;

import androidx.annotation.NonNull;
import com.yandex.mapkit.Animation;

/* loaded from: classes9.dex */
public interface MapObject {
    void addTapListener(@NonNull MapObjectTapListener mapObjectTapListener);

    @NonNull
    BaseMapObjectCollection getParent();

    Object getUserData();

    float getZIndex();

    boolean isDraggable();

    boolean isValid();

    boolean isVisible();

    void removeTapListener(@NonNull MapObjectTapListener mapObjectTapListener);

    void setDragListener(MapObjectDragListener mapObjectDragListener);

    void setDraggable(boolean z11);

    void setUserData(Object obj);

    void setVisible(boolean z11);

    void setVisible(boolean z11, @NonNull Animation animation, Callback callback);

    void setZIndex(float f7);
}
