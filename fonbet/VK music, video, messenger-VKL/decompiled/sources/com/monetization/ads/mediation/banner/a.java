package com.monetization.ads.mediation.banner;

import com.monetization.ads.mediation.banner.MediatedBannerAdapter;
import xsna.qcy;
import yads.ep1;
import yads.eq1;
import yads.km;
import yads.mn2;
import yads.nn2;
import yads.wb;
import yads.z51;

/* loaded from: classes14.dex */
public final class a implements MediatedBannerAdapter.MediatedBannerAdapterListener {
    public static final /* synthetic */ qcy[] f = {wb.a(a.class, "loadController", "getLoadController()Lcom/monetization/ads/banner/BannerAdLoadController;", 0)};
    public final ep1 a;
    public final eq1 b;
    public final z51 c;
    public final mn2 d;

    public /* synthetic */ a(km kmVar, ep1 ep1Var, eq1 eq1Var) {
        this(kmVar, ep1Var, eq1Var, new z51(ep1Var));
    }

    public a(km kmVar, ep1 ep1Var, eq1 eq1Var, z51 z51Var) {
        this.a = ep1Var;
        this.b = eq1Var;
        this.c = z51Var;
        this.d = nn2.a(kmVar);
    }
}
