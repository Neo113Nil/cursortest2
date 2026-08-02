package defpackage;

import com.sofascore.model.Sports;
import com.sofascore.model.newNetwork.MonthlyUniqueTournamentItem;
import com.sofascore.model.newNetwork.MonthlyUniqueTournamentsResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class mmc extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ nmc t;
    public final /* synthetic */ String u;
    public final /* synthetic */ String v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mmc(nmc nmcVar, String str, String str2, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = nmcVar;
        this.u = str;
        this.v = str2;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new mmc(this.t, this.u, this.v, rq3Var, 0);
            default:
                return new mmc(this.t, this.u, this.v, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((mmc) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        List<MonthlyUniqueTournamentItem> dailyUniqueTournaments;
        int i = this.r;
        String str = this.v;
        String str2 = this.u;
        nmc nmcVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    vrj vrjVar = nmcVar.e;
                    str2.getClass();
                    this.s = 1;
                    obj = vrjVar.a(str2, str, Sports.MMA, this);
                    if (obj == lu3Var) {
                        break;
                    }
                } else if (i2 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                MonthlyUniqueTournamentsResponse monthlyUniqueTournamentsResponse = (MonthlyUniqueTournamentsResponse) obj;
                dailyUniqueTournaments = monthlyUniqueTournamentsResponse != null ? monthlyUniqueTournamentsResponse.getDailyUniqueTournaments() : null;
                if (dailyUniqueTournaments == null) {
                    break;
                }
                break;
            default:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    vrj vrjVar2 = nmcVar.e;
                    str2.getClass();
                    this.s = 1;
                    obj = vrjVar2.a(str2, str, Sports.MMA, this);
                    if (obj == lu3Var2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                MonthlyUniqueTournamentsResponse monthlyUniqueTournamentsResponse2 = (MonthlyUniqueTournamentsResponse) obj;
                dailyUniqueTournaments = monthlyUniqueTournamentsResponse2 != null ? monthlyUniqueTournamentsResponse2.getDailyUniqueTournaments() : null;
                if (dailyUniqueTournaments == null) {
                    break;
                }
                break;
        }
        return km5.a;
    }
}
