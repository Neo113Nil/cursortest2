package defpackage;

import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.network.api.NetworkCoroutineAPI;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class kai extends hoi implements Function1 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ pai t;
    public final /* synthetic */ int u;
    public final /* synthetic */ String v;
    public final /* synthetic */ Gender w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kai(pai paiVar, int i, String str, Gender gender, rq3 rq3Var, int i2) {
        super(1, rq3Var);
        this.r = i2;
        this.t = paiVar;
        this.u = i;
        this.v = str;
        this.w = gender;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new kai(this.t, this.u, this.v, this.w, rq3Var, 0);
            default:
                return new kai(this.t, this.u, this.v, this.w, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = (rq3) obj;
        switch (this.r) {
        }
        return ((kai) create(rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        Gender gender = this.w;
        String str = this.v;
        int i2 = this.u;
        pai paiVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i3 = this.s;
                if (i3 != 0) {
                    if (i3 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI = paiVar.a;
                String backendRequestValue = gender.getBackendRequestValue();
                this.s = 1;
                Object mmaRankingByWeightClass = networkCoroutineAPI.mmaRankingByWeightClass(i2, str, backendRequestValue, this);
                return mmaRankingByWeightClass == lu3Var ? lu3Var : mmaRankingByWeightClass;
            default:
                lu3 lu3Var2 = lu3.a;
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
                NetworkCoroutineAPI networkCoroutineAPI2 = paiVar.a;
                String backendRequestValue2 = gender.getBackendRequestValue();
                this.s = 1;
                Object hasMMARankingByWeight = networkCoroutineAPI2.hasMMARankingByWeight(i2, str, backendRequestValue2, this);
                return hasMMARankingByWeight == lu3Var2 ? lu3Var2 : hasMMARankingByWeight;
        }
    }
}
