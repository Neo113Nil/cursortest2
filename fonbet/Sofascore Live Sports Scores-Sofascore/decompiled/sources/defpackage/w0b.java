package defpackage;

import com.sofascore.model.newNetwork.SeasonDaysWithEventsResponse;
import com.sofascore.network.api.NetworkCoroutineAPI;
import java.util.Calendar;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class w0b extends hoi implements Function1 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ w3b t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w0b(w3b w3bVar, rq3 rq3Var, int i) {
        super(1, rq3Var);
        this.r = i;
        this.t = w3bVar;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new w0b(this.t, rq3Var, 0);
            default:
                return new w0b(this.t, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = (rq3) obj;
        switch (this.r) {
        }
        return ((w0b) create(rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
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
                this.s = 1;
                Object uniqueTournamentLastDance = networkCoroutineAPI.uniqueTournamentLastDance(16, this);
                return uniqueTournamentLastDance == lu3Var ? lu3Var : uniqueTournamentLastDance;
            default:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    NetworkCoroutineAPI networkCoroutineAPI2 = w3bVar.b;
                    Calendar calendar = ke0.a;
                    int c = ke0.c();
                    this.s = 1;
                    obj = networkCoroutineAPI2.seasonDaysWithEvents(58210, c, this);
                    if (obj == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return ((SeasonDaysWithEventsResponse) obj).getDailySeasonEvents();
        }
    }
}
