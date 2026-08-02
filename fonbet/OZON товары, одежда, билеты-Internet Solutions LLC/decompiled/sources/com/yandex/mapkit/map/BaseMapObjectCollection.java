package com.yandex.mapkit.map;

import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public interface BaseMapObjectCollection extends MapObject {
    void addListener(@NonNull MapObjectCollectionListener mapObjectCollectionListener);

    void clear();

    void remove(@NonNull MapObject mapObject);

    void removeListener(@NonNull MapObjectCollectionListener mapObjectCollectionListener);

    void traverse(@NonNull MapObjectVisitor mapObjectVisitor);
}
