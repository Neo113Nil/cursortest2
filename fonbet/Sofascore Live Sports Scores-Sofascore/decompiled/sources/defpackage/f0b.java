package defpackage;

import com.sofascore.network.api.NetworkCoroutineAPI;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class f0b extends hoi implements Function1 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ w3b t;
    public final /* synthetic */ int u;
    public final /* synthetic */ String v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0b(w3b w3bVar, int i, String str, rq3 rq3Var, int i2) {
        super(1, rq3Var);
        this.r = i2;
        this.t = w3bVar;
        this.u = i;
        this.v = str;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new f0b(this.t, this.u, this.v, rq3Var, 0);
            case 1:
                return new f0b(this.t, this.u, this.v, rq3Var, 1);
            case 2:
                return new f0b(this.t, this.u, this.v, rq3Var, 2);
            default:
                return new f0b(this.t, this.u, this.v, rq3Var, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = (rq3) obj;
        switch (this.r) {
        }
        return ((f0b) create(rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        String str = this.v;
        int i2 = this.u;
        w3b w3bVar = this.t;
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
                NetworkCoroutineAPI networkCoroutineAPI = w3bVar.b;
                this.s = 1;
                Object uniqueTournamentLotteryProbability = networkCoroutineAPI.uniqueTournamentLotteryProbability(i2, str, this);
                return uniqueTournamentLotteryProbability == lu3Var ? lu3Var : uniqueTournamentLotteryProbability;
            case 1:
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
                NetworkCoroutineAPI networkCoroutineAPI2 = w3bVar.b;
                this.s = 1;
                Object uniqueTournamentRecapTopPerformances = networkCoroutineAPI2.uniqueTournamentRecapTopPerformances(i2, str, this);
                return uniqueTournamentRecapTopPerformances == lu3Var2 ? lu3Var2 : uniqueTournamentRecapTopPerformances;
            case 2:
                lu3 lu3Var3 = lu3.a;
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
                NetworkCoroutineAPI networkCoroutineAPI3 = w3bVar.b;
                this.s = 1;
                Object hasUniqueTournamentMainEvents = networkCoroutineAPI3.hasUniqueTournamentMainEvents(i2, str, 0, this);
                return hasUniqueTournamentMainEvents == lu3Var3 ? lu3Var3 : hasUniqueTournamentMainEvents;
            default:
                lu3 lu3Var4 = lu3.a;
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
                NetworkCoroutineAPI networkCoroutineAPI4 = w3bVar.b;
                this.s = 1;
                Object uniqueTournamentScheduledEvents = networkCoroutineAPI4.uniqueTournamentScheduledEvents(i2, str, this);
                return uniqueTournamentScheduledEvents == lu3Var4 ? lu3Var4 : uniqueTournamentScheduledEvents;
        }
    }
}
