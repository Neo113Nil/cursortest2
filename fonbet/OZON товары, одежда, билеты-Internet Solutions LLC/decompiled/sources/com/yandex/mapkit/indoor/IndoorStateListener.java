package com.yandex.mapkit.indoor;

import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public interface IndoorStateListener {
    void onActiveLevelChanged(@NonNull String str);

    void onActivePlanFocused(@NonNull IndoorPlan indoorPlan);

    void onActivePlanLeft();
}
