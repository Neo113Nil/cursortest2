package com.yandex.mapkit.map.internal;

import androidx.annotation.NonNull;
import com.yandex.mapkit.ConflictResolutionMode;
import com.yandex.mapkit.map.RootMapObjectCollection;
import com.yandex.runtime.NativeObject;

/* loaded from: classes9.dex */
public class RootMapObjectCollectionBinding extends MapObjectCollectionBinding implements RootMapObjectCollection {
    protected RootMapObjectCollectionBinding(NativeObject nativeObject) {
        super(nativeObject);
    }

    @Override // com.yandex.mapkit.map.RootMapObjectCollection
    @NonNull
    public native ConflictResolutionMode getConflictResolutionMode();

    @Override // com.yandex.mapkit.map.RootMapObjectCollection
    public native void setConflictResolutionMode(@NonNull ConflictResolutionMode conflictResolutionMode);
}
