package defpackage;

import com.sofascore.model.firebase.AdType;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class s4g extends hoi implements Function2 {
    public long r;
    public int s;
    public final /* synthetic */ u4g t;
    public final /* synthetic */ AdType.RewardedInterstitial u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s4g(u4g u4gVar, AdType.RewardedInterstitial rewardedInterstitial, rq3 rq3Var) {
        super(2, rq3Var);
        this.t = u4gVar;
        this.u = rewardedInterstitial;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new s4g(this.t, this.u, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((s4g) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        long j;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        AdType.RewardedInterstitial rewardedInterstitial = this.u;
        u4g u4gVar = this.t;
        if (i == 0) {
            y6a.M(obj);
            long currentTimeMillis = System.currentTimeMillis();
            r4g r4gVar = new r4g(u4gVar, rewardedInterstitial, null);
            this.r = currentTimeMillis;
            this.s = 1;
            obj = yaa.P(r4gVar, this);
            if (obj == lu3Var) {
                return lu3Var;
            }
            j = currentTimeMillis;
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.r;
            y6a.M(obj);
        }
        x2g x2gVar = (x2g) obj;
        yzc yzcVar = u4gVar.k;
        cg cgVar = (cg) yzcVar.d();
        yzcVar.j(cgVar != null ? new cg(bg.a, cgVar.b) : null);
        yzc l = u4gVar.l(rewardedInterstitial);
        Long l2 = (Long) u4gVar.m.d();
        if ((l2 != null ? l2.longValue() : 0L) < j) {
            l.j(x2gVar);
        }
        return Unit.a;
    }
}
