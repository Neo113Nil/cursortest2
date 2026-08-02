package defpackage;

import com.sofascore.network.api.NetworkCoroutineAPI;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class fmd extends hoi implements Function1 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ umd t;
    public final /* synthetic */ int u;
    public final /* synthetic */ int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fmd(umd umdVar, int i, int i2, rq3 rq3Var, int i3) {
        super(1, rq3Var);
        this.r = i3;
        this.t = umdVar;
        this.u = i;
        this.v = i2;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new fmd(this.t, this.u, this.v, rq3Var, 0);
            case 1:
                return new fmd(this.t, this.u, this.v, rq3Var, 1);
            case 2:
                return new fmd(this.t, this.u, this.v, rq3Var, 2);
            case 3:
                return new fmd(this.t, this.u, this.v, rq3Var, 3);
            case 4:
                return new fmd(this.t, this.u, this.v, rq3Var, 4);
            case 5:
                return new fmd(this.t, this.u, this.v, rq3Var, 5);
            default:
                return new fmd(this.t, this.u, this.v, rq3Var, 6);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = (rq3) obj;
        switch (this.r) {
        }
        return ((fmd) create(rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        int i2 = this.v;
        int i3 = this.u;
        umd umdVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i4 = this.s;
                if (i4 != 0) {
                    if (i4 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI = umdVar.a;
                this.s = 1;
                Object allOdds = networkCoroutineAPI.allOdds(i3, i2, this);
                return allOdds == lu3Var ? lu3Var : allOdds;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i5 = this.s;
                if (i5 != 0) {
                    if (i5 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI2 = umdVar.a;
                this.s = 1;
                Object evenBetBoost = networkCoroutineAPI2.getEvenBetBoost(i3, i2, this);
                return evenBetBoost == lu3Var2 ? lu3Var2 : evenBetBoost;
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i6 = this.s;
                if (i6 != 0) {
                    if (i6 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI3 = umdVar.a;
                this.s = 1;
                Object recommendedPrematchOdds = networkCoroutineAPI3.recommendedPrematchOdds(i3, i2, this);
                return recommendedPrematchOdds == lu3Var3 ? lu3Var3 : recommendedPrematchOdds;
            case 3:
                lu3 lu3Var4 = lu3.a;
                int i7 = this.s;
                if (i7 != 0) {
                    if (i7 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI4 = umdVar.a;
                this.s = 1;
                Object stageAllOdds = networkCoroutineAPI4.stageAllOdds(i3, i2, this);
                return stageAllOdds == lu3Var4 ? lu3Var4 : stageAllOdds;
            case 4:
                lu3 lu3Var5 = lu3.a;
                int i8 = this.s;
                if (i8 != 0) {
                    if (i8 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI5 = umdVar.a;
                this.s = 1;
                Object stageTeamOdds = networkCoroutineAPI5.stageTeamOdds(i3, i2, this);
                return stageTeamOdds == lu3Var5 ? lu3Var5 : stageTeamOdds;
            case 5:
                lu3 lu3Var6 = lu3.a;
                int i9 = this.s;
                if (i9 != 0) {
                    if (i9 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI6 = umdVar.a;
                this.s = 1;
                Object hasBetBoost = networkCoroutineAPI6.hasBetBoost(i3, i2, this);
                return hasBetBoost == lu3Var6 ? lu3Var6 : hasBetBoost;
            default:
                lu3 lu3Var7 = lu3.a;
                int i10 = this.s;
                if (i10 != 0) {
                    if (i10 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI7 = umdVar.a;
                this.s = 1;
                Object hasRecommendedPrematchOdds = networkCoroutineAPI7.hasRecommendedPrematchOdds(i3, i2, this);
                return hasRecommendedPrematchOdds == lu3Var7 ? lu3Var7 : hasRecommendedPrematchOdds;
        }
    }
}
