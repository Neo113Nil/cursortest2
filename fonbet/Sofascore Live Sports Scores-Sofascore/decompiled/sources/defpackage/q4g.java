package defpackage;

import com.sofascore.model.firebase.AdType;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class q4g extends hoi implements Function2 {
    public final /* synthetic */ u4g r;
    public final /* synthetic */ AdType.RewardedInterstitial s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4g(u4g u4gVar, AdType.RewardedInterstitial rewardedInterstitial, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = u4gVar;
        this.s = rewardedInterstitial;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new q4g(this.r, this.s, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q4g) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        u4g u4gVar = this.r;
        yzc yzcVar = u4gVar.k;
        bg bgVar = bg.b;
        AdType.RewardedInterstitial rewardedInterstitial = this.s;
        yzcVar.j(new cg(bgVar, rewardedInterstitial));
        xw3.L(un0.z(u4gVar), null, null, new s4g(u4gVar, rewardedInterstitial, null), 3);
        return Unit.a;
    }
}
