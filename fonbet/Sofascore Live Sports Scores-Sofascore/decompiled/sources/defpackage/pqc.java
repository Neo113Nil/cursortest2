package defpackage;

import com.sofascore.model.newNetwork.MmaEventListResponse;
import com.sofascore.network.api.NetworkCoroutineAPI;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class pqc extends hoi implements Function1 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ wqc t;
    public final /* synthetic */ int u;
    public final /* synthetic */ String v;
    public final /* synthetic */ int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pqc(int i, int i2, rq3 rq3Var, wqc wqcVar, String str) {
        super(1, rq3Var);
        this.r = 1;
        this.t = wqcVar;
        this.u = i;
        this.v = str;
        this.w = i2;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new pqc(this.t, this.u, this.w, this.v, rq3Var, 0);
            case 1:
                String str = this.v;
                return new pqc(this.u, this.w, rq3Var, this.t, str);
            default:
                return new pqc(this.t, this.u, this.w, this.v, rq3Var, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = (rq3) obj;
        switch (this.r) {
        }
        return ((pqc) create(rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        String str = this.v;
        int i2 = this.w;
        int i3 = this.u;
        wqc wqcVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    NetworkCoroutineAPI networkCoroutineAPI = wqcVar.a;
                    this.s = 1;
                    obj = networkCoroutineAPI.mmaFightNightEvents(i3, i2, str, this);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i4 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return ((MmaEventListResponse) obj).getEvents();
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
                NetworkCoroutineAPI networkCoroutineAPI2 = wqcVar.a;
                this.s = 1;
                Object uniqueTournamentMainEvents = networkCoroutineAPI2.uniqueTournamentMainEvents(i3, str, i2, this);
                return uniqueTournamentMainEvents == lu3Var2 ? lu3Var2 : uniqueTournamentMainEvents;
            default:
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
                NetworkCoroutineAPI networkCoroutineAPI3 = wqcVar.a;
                this.s = 1;
                Object hasMmaFightNightEvents = networkCoroutineAPI3.hasMmaFightNightEvents(i3, i2, str, this);
                return hasMmaFightNightEvents == lu3Var3 ? lu3Var3 : hasMmaFightNightEvents;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pqc(wqc wqcVar, int i, int i2, String str, rq3 rq3Var, int i3) {
        super(1, rq3Var);
        this.r = i3;
        this.t = wqcVar;
        this.u = i;
        this.w = i2;
        this.v = str;
    }
}
