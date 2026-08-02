package com.yandex.mapkit.offline_cache;

import androidx.annotation.NonNull;
import com.yandex.runtime.Error;
import java.util.List;

/* loaded from: classes9.dex */
public interface RegionsAtPointListener {
    void onError(@NonNull Error error);

    void onRegions(@NonNull List<Integer> list);
}
