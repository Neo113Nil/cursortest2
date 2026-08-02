package defpackage;

import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.UniqueTournamentTeamsResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class wwa extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ zwa t;
    public final /* synthetic */ Season u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wwa(zwa zwaVar, Season season, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = zwaVar;
        this.u = season;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Season season = this.u;
        zwa zwaVar = this.t;
        switch (i) {
            case 0:
                return new wwa(zwaVar, season, rq3Var, 0);
            case 1:
                return new wwa(zwaVar, season, rq3Var, 1);
            case 2:
                return new wwa(zwaVar, season, rq3Var, 2);
            default:
                return new wwa(zwaVar, season, rq3Var, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((wwa) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        Season season = this.u;
        zwa zwaVar = this.t;
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
                w3b w3bVar = zwaVar.e;
                int x = zwaVar.x();
                int id = season.getId();
                this.s = 1;
                Object y0 = w3bVar.y0(x, id, this);
                return y0 == lu3Var ? lu3Var : y0;
            case 1:
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
                w3b w3bVar2 = zwaVar.e;
                int x2 = zwaVar.x();
                int id2 = season.getId();
                this.s = 1;
                Object C0 = w3bVar2.C0(x2, id2, this);
                return C0 == lu3Var2 ? lu3Var2 : C0;
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    w3b w3bVar3 = zwaVar.e;
                    int x3 = zwaVar.x();
                    int id3 = season.getId();
                    this.s = 1;
                    obj = w3bVar3.J0(x3, id3, this);
                    if (obj == lu3Var3) {
                        return lu3Var3;
                    }
                } else {
                    if (i4 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                UniqueTournamentTeamsResponse uniqueTournamentTeamsResponse = (UniqueTournamentTeamsResponse) obj;
                if (uniqueTournamentTeamsResponse == null) {
                    return null;
                }
                List<Team> teams = uniqueTournamentTeamsResponse.getTeams();
                if (teams == null || !teams.isEmpty()) {
                    Iterator<T> it = teams.iterator();
                    while (it.hasNext()) {
                        if (((Team) it.next()).getDisabled()) {
                            List<Team> teams2 = uniqueTournamentTeamsResponse.getTeams();
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : teams2) {
                                if (!((Team) obj2).getDisabled()) {
                                    arrayList.add(obj2);
                                }
                            }
                            return new UniqueTournamentTeamsResponse(arrayList);
                        }
                    }
                }
                return uniqueTournamentTeamsResponse;
            default:
                lu3 lu3Var4 = lu3.a;
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
                w3b w3bVar4 = zwaVar.e;
                int x4 = zwaVar.x();
                int id4 = season.getId();
                this.s = 1;
                Object L0 = w3bVar4.L0(x4, id4, this);
                return L0 == lu3Var4 ? lu3Var4 : L0;
        }
    }
}
