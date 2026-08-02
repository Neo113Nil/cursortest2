package com.yandex.mapkit.map;

import androidx.annotation.NonNull;
import com.yandex.mapkit.ConflictResolutionMode;

/* loaded from: classes9.dex */
public interface RootMapObjectCollection extends MapObjectCollection {
    @NonNull
    ConflictResolutionMode getConflictResolutionMode();

    void setConflictResolutionMode(@NonNull ConflictResolutionMode conflictResolutionMode);
}
