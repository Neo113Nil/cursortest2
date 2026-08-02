package com.yandex.mapkit.search.search_layer;

import androidx.annotation.NonNull;
import com.yandex.runtime.Error;

/* loaded from: classes9.dex */
public interface SearchResultListener {
    void onAllResultsClear();

    void onPresentedResultsUpdate();

    void onSearchError(@NonNull Error error, @NonNull RequestType requestType);

    void onSearchStart(@NonNull RequestType requestType);

    void onSearchSuccess(@NonNull RequestType requestType);
}
