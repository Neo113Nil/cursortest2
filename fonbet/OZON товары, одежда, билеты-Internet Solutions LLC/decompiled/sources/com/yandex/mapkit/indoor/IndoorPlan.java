package com.yandex.mapkit.indoor;

import androidx.annotation.NonNull;
import java.util.List;

/* loaded from: classes9.dex */
public interface IndoorPlan {
    @NonNull
    String getActiveLevelId();

    @NonNull
    List<IndoorLevel> getLevels();

    void setActiveLevelId(@NonNull String str);
}
