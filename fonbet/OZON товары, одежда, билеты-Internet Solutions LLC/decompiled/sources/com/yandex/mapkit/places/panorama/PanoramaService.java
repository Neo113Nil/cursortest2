package com.yandex.mapkit.places.panorama;

import androidx.annotation.NonNull;
import com.yandex.mapkit.geometry.Point;
import com.yandex.runtime.Error;

/* loaded from: classes9.dex */
public interface PanoramaService {

    public interface SearchListener {
        void onPanoramaSearchError(@NonNull Error error);

        void onPanoramaSearchResult(@NonNull String str);
    }

    public interface SearchSession {
        void cancel();

        void retry(@NonNull SearchListener searchListener);
    }

    @NonNull
    SearchSession findNearest(@NonNull Point point, @NonNull SearchListener searchListener);
}
