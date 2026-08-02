package com.yandex.mapkit.search;

import androidx.annotation.NonNull;
import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.runtime.Error;

/* loaded from: classes9.dex */
public interface SuggestSession {

    public interface SuggestListener {
        void onError(@NonNull Error error);

        void onResponse(@NonNull SuggestResponse suggestResponse);
    }

    void reset();

    void suggest(@NonNull String str, @NonNull BoundingBox boundingBox, @NonNull SuggestOptions suggestOptions, @NonNull SuggestListener suggestListener);
}
