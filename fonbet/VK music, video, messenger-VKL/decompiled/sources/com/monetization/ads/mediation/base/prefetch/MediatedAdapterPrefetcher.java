package com.monetization.ads.mediation.base.prefetch;

import android.content.Context;
import java.util.Map;

/* loaded from: classes14.dex */
public interface MediatedAdapterPrefetcher {
    void onInvalidate();

    void prefetchAd(Context context, Map<String, String> map, MediatedAdapterPrefetchListener mediatedAdapterPrefetchListener);
}
