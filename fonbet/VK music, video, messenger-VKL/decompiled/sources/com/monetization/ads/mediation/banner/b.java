package com.monetization.ads.mediation.banner;

import android.content.Context;
import com.monetization.ads.mediation.banner.MediatedBannerAdapter;
import java.util.Map;
import yads.mp1;

/* loaded from: classes14.dex */
public final class b implements mp1 {
    @Override // yads.mp1
    public final void a(com.monetization.ads.mediation.base.a aVar) {
        ((MediatedBannerAdapter) aVar).onInvalidate();
    }

    @Override // yads.mp1
    public final void a(Context context, com.monetization.ads.mediation.base.a aVar, Object obj, Map map, Map map2) {
        ((MediatedBannerAdapter) aVar).loadBanner(context, (MediatedBannerAdapter.MediatedBannerAdapterListener) obj, map, map2);
    }
}
