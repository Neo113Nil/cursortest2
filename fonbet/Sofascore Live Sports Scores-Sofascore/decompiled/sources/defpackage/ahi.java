package defpackage;

import com.sofascore.model.firebase.AdType;
import com.sofascore.results.ads.iml.banner.AdBannerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ahi extends hoi implements Function2 {
    public int r;
    public final /* synthetic */ bhi s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahi(bhi bhiVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = bhiVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new ahi(this.s, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ahi) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        long bannerAdsTimeInterval;
        long R;
        AdBannerView smallAd;
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i != 0 && i != 1) {
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y6a.M(obj);
        do {
            bhi bhiVar = this.s;
            if (!bhiVar.o || ((!bhiVar.t && !bhiVar.v) || !bhiVar.u)) {
                return Unit.a;
            }
            long j = bhiVar.p + 1;
            bhiVar.p = j;
            bannerAdsTimeInterval = bhiVar.getBannerAdsTimeInterval();
            if (j == bannerAdsTimeInterval) {
                smallAd = bhiVar.getSmallAd();
                if (smallAd != null) {
                    smallAd.c(AdType.Banner.StreamVideoOverlay);
                }
                bhiVar.p = 0L;
                bhiVar.v = false;
                bhiVar.t = false;
            }
            wd5 wd5Var = xd5.b;
            R = wkn.R(1, be5.SECONDS);
            this.r = 1;
        } while (n4o.z(R, this) != lu3Var);
        return lu3Var;
    }
}
