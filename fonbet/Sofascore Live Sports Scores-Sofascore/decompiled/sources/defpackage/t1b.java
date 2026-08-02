package defpackage;

import com.sofascore.network.api.NetworkCoroutineAPI;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class t1b extends hoi implements Function1 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ w3b t;
    public final /* synthetic */ int u;
    public final /* synthetic */ Integer v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t1b(w3b w3bVar, int i, Integer num, rq3 rq3Var, int i2) {
        super(1, rq3Var);
        this.r = i2;
        this.t = w3bVar;
        this.u = i;
        this.v = num;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new t1b(this.t, this.u, this.v, rq3Var, 0);
            default:
                return new t1b(this.t, this.u, this.v, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = (rq3) obj;
        switch (this.r) {
        }
        return ((t1b) create(rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        Integer num = this.v;
        w3b w3bVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 != 0) {
                    if (i2 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI = w3bVar.b;
                int intValue = num.intValue();
                this.s = 1;
                Object hasUniqueTournamentSeasonEvents = networkCoroutineAPI.hasUniqueTournamentSeasonEvents(this.u, intValue, "last", 0, this);
                return hasUniqueTournamentSeasonEvents == lu3Var ? lu3Var : hasUniqueTournamentSeasonEvents;
            default:
                lu3 lu3Var2 = lu3.a;
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
                NetworkCoroutineAPI networkCoroutineAPI2 = w3bVar.b;
                int intValue2 = num.intValue();
                this.s = 1;
                Object hasUniqueTournamentSeasonEvents2 = networkCoroutineAPI2.hasUniqueTournamentSeasonEvents(this.u, intValue2, "next", 0, this);
                return hasUniqueTournamentSeasonEvents2 == lu3Var2 ? lu3Var2 : hasUniqueTournamentSeasonEvents2;
        }
    }
}
