package defpackage;

import com.sofascore.network.api.NetworkCoroutineAPI;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class sqc extends hoi implements Function1 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ wqc t;
    public final /* synthetic */ int u;
    public final /* synthetic */ String v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sqc(int i, int i2, rq3 rq3Var, wqc wqcVar, String str) {
        super(1, rq3Var);
        this.r = i2;
        this.t = wqcVar;
        this.u = i;
        this.v = str;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        switch (this.r) {
            case 0:
                String str = this.v;
                return new sqc(this.u, 0, rq3Var, this.t, str);
            default:
                String str2 = this.v;
                return new sqc(this.u, 1, rq3Var, this.t, str2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = (rq3) obj;
        switch (this.r) {
        }
        return ((sqc) create(rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        String str = this.v;
        int i2 = this.u;
        wqc wqcVar = this.t;
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
                NetworkCoroutineAPI networkCoroutineAPI = wqcVar.a;
                this.s = 1;
                Object uniqueTournamentMonthsWithEvents = networkCoroutineAPI.uniqueTournamentMonthsWithEvents(i2, str, this);
                return uniqueTournamentMonthsWithEvents == lu3Var ? lu3Var : uniqueTournamentMonthsWithEvents;
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
                NetworkCoroutineAPI networkCoroutineAPI2 = wqcVar.a;
                this.s = 1;
                Object uniqueTournamentScheduledMmaMainEvents = networkCoroutineAPI2.uniqueTournamentScheduledMmaMainEvents(i2, str, this);
                return uniqueTournamentScheduledMmaMainEvents == lu3Var2 ? lu3Var2 : uniqueTournamentScheduledMmaMainEvents;
        }
    }
}
