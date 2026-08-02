package com.yandex.mapkit.indoor.internal;

import androidx.annotation.NonNull;
import com.yandex.mapkit.indoor.IndoorLevel;
import com.yandex.mapkit.indoor.IndoorPlan;
import com.yandex.runtime.NativeObject;
import java.util.List;

/* loaded from: classes9.dex */
public class IndoorPlanBinding implements IndoorPlan {
    private final NativeObject nativeObject;

    protected IndoorPlanBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.indoor.IndoorPlan
    @NonNull
    public native String getActiveLevelId();

    @Override // com.yandex.mapkit.indoor.IndoorPlan
    @NonNull
    public native List<IndoorLevel> getLevels();

    @Override // com.yandex.mapkit.indoor.IndoorPlan
    public native void setActiveLevelId(@NonNull String str);
}
