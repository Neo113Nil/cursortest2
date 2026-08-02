package defpackage;

import android.app.Application;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.sofascore.model.database.VoteType;
import com.sofascore.model.firebase.AdConfig;
import com.sofascore.model.firebase.AdType;
import java.util.Calendar;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class u4g extends q8 {
    public final yzc e;
    public final yzc f;
    public final yzc g;
    public final yzc h;
    public final zzc i;
    public final zzc j;
    public final yzc k;
    public final yzc l;
    public final yzc m;
    public final boolean n;
    public final VoteType o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4g(@NotNull Application application, @NotNull fqg fqgVar) {
        super(application);
        application.getClass();
        fqgVar.getClass();
        yzc yzcVar = new yzc();
        this.e = yzcVar;
        this.f = yzcVar;
        yzc yzcVar2 = new yzc();
        this.g = yzcVar2;
        this.h = yzcVar2;
        zzc zzcVar = new zzc();
        this.i = zzcVar;
        this.j = zzcVar;
        yzc yzcVar3 = new yzc(new cg(bg.a, null));
        this.k = yzcVar3;
        this.l = yzcVar3;
        this.m = new yzc();
        Boolean bool = (Boolean) fqgVar.a("changeVote");
        this.n = bool != null ? bool.booleanValue() : false;
        VoteType voteType = (VoteType) fqgVar.a("voteType");
        this.o = voteType == null ? VoteType.WHO_WILL_WIN : voteType;
        Calendar calendar = ke0.a;
    }

    public final void k() {
        this.m.j(Long.valueOf(System.currentTimeMillis()));
        yzc yzcVar = this.k;
        cg cgVar = (cg) yzcVar.d();
        yzcVar.j(cgVar != null ? new cg(bg.a, cgVar.b) : null);
    }

    public final yzc l(AdType.RewardedInterstitial rewardedInterstitial) {
        int i = p4g.a[rewardedInterstitial.ordinal()];
        if (i == 1) {
            return this.e;
        }
        if (i == 2) {
            return this.g;
        }
        zzl.b();
        return null;
    }

    public final void m(AdType.RewardedInterstitial rewardedInterstitial, Function0 function0) {
        rewardedInterstitial.getClass();
        AdConfig f = it7.h.f(rewardedInterstitial);
        AdConfig.RewardedInterstitial rewardedInterstitial2 = f instanceof AdConfig.RewardedInterstitial ? (AdConfig.RewardedInterstitial) f : null;
        if (rewardedInterstitial2 == null) {
            function0.invoke();
            return;
        }
        if (!rewardedInterstitial2.getIncludePaidUsers()) {
            ia0 ia0Var = ia0.q;
            if (!mz1.C()) {
                return;
            }
        }
        if (z8e.O(i())) {
            xw3.L(un0.z(this), null, null, new q4g(this, rewardedInterstitial, null), 3);
        }
    }

    public final void n(ksh kshVar, AdType.RewardedInterstitial rewardedInterstitial, Function1 function1) {
        kshVar.getClass();
        rewardedInterstitial.getClass();
        t4g t4gVar = new t4g(kshVar, this, rewardedInterstitial, function1);
        g19 g19Var = (g19) kshVar;
        g19Var.f = t4gVar;
        RewardedAd rewardedAd = g19Var.a;
        rewardedAd.setFullScreenContentCallback(t4gVar);
        rewardedAd.setOnPaidEventListener(new kt4(t4gVar, 29));
    }
}
