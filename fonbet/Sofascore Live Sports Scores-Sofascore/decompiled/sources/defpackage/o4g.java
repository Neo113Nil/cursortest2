package defpackage;

import android.content.Context;
import com.sofascore.model.firebase.AdConfig;
import com.sofascore.model.firebase.AdType;
import com.sofascore.model.firebase.AdUnit;
import com.sofascore.model.firebase.BaseAdUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class o4g extends hoi implements Function2 {
    public int r;
    public final /* synthetic */ AdType.RewardedInterstitial s;
    public final /* synthetic */ Context t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4g(AdType.RewardedInterstitial rewardedInterstitial, Context context, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = rewardedInterstitial;
        this.t = context;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new o4g(this.s, this.t, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o4g) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        AdUnit adUnit;
        BaseAdUnit.GamAdUnit gam;
        BaseAdUnit.GamAdUnit gamAdUnit;
        AdUnit adUnit2;
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            AdConfig f = it7.h.f(this.s);
            AdConfig.RewardedInterstitial rewardedInterstitial = f instanceof AdConfig.RewardedInterstitial ? (AdConfig.RewardedInterstitial) f : null;
            f19 f19Var = new f19();
            yea yeaVar = j58.a;
            if (j58.l(true)) {
                if (rewardedInterstitial != null && (adUnit2 = rewardedInterstitial.getAdUnit()) != null) {
                    gam = adUnit2.getNimbus();
                    gamAdUnit = gam;
                }
                gamAdUnit = null;
            } else {
                if (rewardedInterstitial != null && (adUnit = rewardedInterstitial.getAdUnit()) != null) {
                    gam = adUnit.getGam();
                    gamAdUnit = gam;
                }
                gamAdUnit = null;
            }
            if (gamAdUnit == null) {
                return null;
            }
            boolean c = Intrinsics.c(rewardedInterstitial != null ? Boolean.valueOf(rewardedInterstitial.getShouldVerify()) : null, Boolean.TRUE);
            this.r = 1;
            obj = s9a.r(new e19(gamAdUnit, this.t, f19Var, this.s, c, null), this);
            if (obj == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        return (g19) obj;
    }
}
