package com.monetization.ads.mediation.interstitial;

import com.monetization.ads.mediation.interstitial.MediatedInterstitialAdapter;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.fpf0;
import xsna.qcy;
import yads.ep1;
import yads.gy0;
import yads.mn2;
import yads.nn2;
import yads.wb;
import yads.z51;

/* loaded from: classes14.dex */
public final class a implements MediatedInterstitialAdapter.MediatedInterstitialAdapterListener {
    public static final /* synthetic */ qcy[] e;
    public final ep1 a;
    public final z51 b;
    public final mn2 c;
    public final mn2 d;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(a.class, "contentController", "getContentController()Lcom/monetization/ads/fullscreen/FullscreenContentController;", 0);
        fpf0.a.getClass();
        e = new qcy[]{mutablePropertyReference1Impl, wb.a(a.class, "loadController", "getLoadController()Lcom/monetization/ads/fullscreen/FullScreenLoadController;", 0)};
    }

    public /* synthetic */ a(gy0 gy0Var, ep1 ep1Var) {
        this(gy0Var, ep1Var, new z51(ep1Var));
    }

    public a(gy0 gy0Var, ep1 ep1Var, z51 z51Var) {
        this.a = ep1Var;
        this.b = z51Var;
        this.c = nn2.a(null);
        this.d = nn2.a(gy0Var);
    }
}
