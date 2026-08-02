package com.monetization.ads.mediation.interstitial;

import android.content.Context;
import com.monetization.ads.mediation.interstitial.MediatedInterstitialAdapter;
import java.util.Map;
import yads.mp1;

/* loaded from: classes14.dex */
public final class b implements mp1 {
    public MediatedInterstitialAdapter a;

    @Override // yads.mp1
    public final void a(com.monetization.ads.mediation.base.a aVar) {
        ((MediatedInterstitialAdapter) aVar).onInvalidate();
    }

    @Override // yads.mp1
    public final void a(Context context, com.monetization.ads.mediation.base.a aVar, Object obj, Map map, Map map2) {
        MediatedInterstitialAdapter mediatedInterstitialAdapter = (MediatedInterstitialAdapter) aVar;
        this.a = mediatedInterstitialAdapter;
        mediatedInterstitialAdapter.loadInterstitial(context, (MediatedInterstitialAdapter.MediatedInterstitialAdapterListener) obj, map, map2);
    }
}
