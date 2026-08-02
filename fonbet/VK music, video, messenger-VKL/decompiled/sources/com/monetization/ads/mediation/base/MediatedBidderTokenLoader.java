package com.monetization.ads.mediation.base;

import android.content.Context;
import java.util.Map;

/* loaded from: classes14.dex */
public interface MediatedBidderTokenLoader {
    void loadBidderToken(Context context, Map<String, String> map, MediatedBidderTokenLoadListener mediatedBidderTokenLoadListener);
}
