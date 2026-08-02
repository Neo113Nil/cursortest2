package com.yandex.mapkit.offline_cache;

import androidx.annotation.NonNull;
import com.yandex.runtime.Error;

/* loaded from: classes9.dex */
public interface DataMoveListener {
    void onDataMoveCompleted();

    void onDataMoveError(@NonNull Error error);

    void onDataMoveProgress(int i11);
}
