package defpackage;

import android.app.Application;
import com.sofascore.model.fantasy.FantasyCompetitionFiltersResponse;
import com.sofascore.model.fantasy.FantasyFilterOptions;
import com.sofascore.model.fantasy.FantasyFixtureDifficultyResponse;
import com.sofascore.model.fantasy.FantasyFixtureFDRView;
import com.sofascore.model.fantasy.FantasyPriceFilterConfig;
import com.sofascore.model.fantasy.FantasyRound;
import com.sofascore.model.fantasy.FantasyRoundPlayer;
import com.sofascore.model.fantasy.FantasyUserRoundSquadResponse;
import com.sofascore.model.fantasy.FantasyUserSquad;
import com.sofascore.model.mvvm.model.Team;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class jd7 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ od7 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jd7(od7 od7Var, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = od7Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        od7 od7Var = this.t;
        switch (i) {
            case 0:
                return new jd7(od7Var, rq3Var, 0);
            case 1:
                return new jd7(od7Var, rq3Var, 1);
            case 2:
                return new jd7(od7Var, rq3Var, 2);
            case 3:
                return new jd7(od7Var, rq3Var, 3);
            case 4:
                return new jd7(od7Var, rq3Var, 4);
            default:
                return new jd7(od7Var, rq3Var, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((jd7) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [rq3] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        List list;
        xbb xbbVar;
        Object value;
        gv9 gv9Var;
        gv9 gv9Var2;
        gv9 gv9Var3;
        List<String> positions;
        FantasyPriceFilterConfig prices;
        List<Team> teams;
        Object value2;
        ArrayList arrayList;
        Object value3;
        lm5 lm5Var;
        Object value4;
        FantasyUserSquad squad;
        List<FantasyRoundPlayer> players;
        int i = this.r;
        od7 od7Var = this.t;
        int i2 = 1;
        ?? r5 = 0;
        r5 = 0;
        r5 = 0;
        ?? r52 = 0;
        r5 = 0;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    wi7 wi7Var = od7Var.e;
                    int x = od7Var.getX();
                    this.s = 1;
                    obj = wi7Var.h(x, this);
                    if (obj == lu3Var) {
                        break;
                    }
                } else if (i3 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                FantasyCompetitionFiltersResponse fantasyCompetitionFiltersResponse = (FantasyCompetitionFiltersResponse) obj;
                FantasyFilterOptions filters = fantasyCompetitionFiltersResponse != null ? fantasyCompetitionFiltersResponse.getFilters() : null;
                if (filters == null || (teams = filters.getTeams()) == null) {
                    list = null;
                } else {
                    ArrayList arrayList2 = new ArrayList(k13.r(teams, 10));
                    for (Team team : teams) {
                        int id = team.getId();
                        Application application = od7Var.b;
                        application.getClass();
                        String A = tba.A(application, team);
                        if (A == null) {
                            A = team.getName();
                        }
                        arrayList2.add(new ho1(id, A));
                    }
                    list = CollectionsKt.H0(arrayList2, new v66(28));
                }
                if (filters == null || (prices = filters.getPrices()) == null) {
                    xbbVar = null;
                } else {
                    float max = prices.getMax();
                    float step = prices.getStep();
                    xbb b = a.b();
                    for (float min = prices.getMin(); min <= max; min += step) {
                        b.add(Float.valueOf(min));
                    }
                    xbbVar = a.a(b);
                }
                if (filters != null && (positions = filters.getPositions()) != null) {
                    r5 = new ArrayList(k13.r(positions, 10));
                    for (String str : positions) {
                        rz6.g.getClass();
                        r5.add(f7a.g(str));
                    }
                }
                fdi fdiVar = od7Var.h;
                do {
                    value = fdiVar.getValue();
                    if (list == null || (gv9Var = l6g.W(list)) == null) {
                        gv9Var = rlh.b;
                    }
                    if (xbbVar == null || (gv9Var2 = l6g.W(xbbVar)) == null) {
                        gv9Var2 = rlh.b;
                    }
                    if (r5 == 0 || (gv9Var3 = l6g.W(r5)) == null) {
                        gv9Var3 = rlh.b;
                    }
                } while (!fdiVar.k(value, new w28(gv9Var, gv9Var2, gv9Var3)));
                break;
            case 1:
                fdi fdiVar2 = od7Var.l;
                lu3 lu3Var2 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    wi7 wi7Var2 = od7Var.e;
                    int w = od7Var.getW();
                    this.s = 1;
                    obj = wi7Var2.o(w, 3, this);
                    if (obj == lu3Var2) {
                        break;
                    }
                } else if (i4 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                FantasyFixtureDifficultyResponse fantasyFixtureDifficultyResponse = (FantasyFixtureDifficultyResponse) obj;
                if (fantasyFixtureDifficultyResponse == null) {
                    do {
                        value3 = fdiVar2.getValue();
                        lm5Var = lm5.a;
                        lm5Var.getClass();
                    } while (!fdiVar2.k(value3, lm5Var));
                } else {
                    Map<Integer, Map<Integer, List<FantasyFixtureFDRView>>> fixtureDifficulties = fantasyFixtureDifficultyResponse.getFixtureDifficulties();
                    List<FantasyRound> rounds = fantasyFixtureDifficultyResponse.getRounds();
                    do {
                        value2 = fdiVar2.getValue();
                        arrayList = new ArrayList(fixtureDifficulties.size());
                        for (Map.Entry<Integer, Map<Integer, List<FantasyFixtureFDRView>>> entry : fixtureDifficulties.entrySet()) {
                            int intValue = entry.getKey().intValue();
                            Map<Integer, List<FantasyFixtureFDRView>> value5 = entry.getValue();
                            Integer num = new Integer(intValue);
                            ArrayList arrayList3 = new ArrayList(k13.r(rounds, 10));
                            Iterator it = rounds.iterator();
                            while (it.hasNext()) {
                                Collection collection = (List) me4.f(((FantasyRound) it.next()).getSequence(), value5);
                                if (collection == null) {
                                    collection = km5.a;
                                }
                                arrayList3.add(collection);
                            }
                            arrayList.add(new Pair(num, arrayList3));
                        }
                    } while (!fdiVar2.k(value2, tub.o(arrayList)));
                }
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    wi7 wi7Var3 = od7Var.e;
                    String str2 = od7Var.f;
                    int x2 = od7Var.getX();
                    this.s = 1;
                    obj = wi7Var3.W(x2, str2, this);
                    if (obj == lu3Var3) {
                        break;
                    }
                } else if (i5 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                FantasyUserRoundSquadResponse fantasyUserRoundSquadResponse = (FantasyUserRoundSquadResponse) obj;
                if (fantasyUserRoundSquadResponse != null && (squad = fantasyUserRoundSquadResponse.getSquad()) != null && (players = squad.getPlayers()) != null) {
                    r52 = new ArrayList(k13.r(players, 10));
                    Iterator it2 = players.iterator();
                    while (it2.hasNext()) {
                        w1l.A(r52, ((FantasyRoundPlayer) it2.next()).getFantasyPlayer().getId());
                    }
                }
                km5 km5Var = r52;
                fdi fdiVar3 = od7Var.j;
                do {
                    value4 = fdiVar3.getValue();
                } while (!fdiVar3.k(value4, km5Var == null ? km5.a : km5Var));
                break;
            case 3:
                Object obj2 = lu3.a;
                int i6 = this.s;
                if (i6 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object r = s9a.r(new jd7(od7Var, r5, 0), this);
                    Object obj3 = r;
                    if (r != obj2) {
                        obj3 = Unit.a;
                    }
                    if (obj3 == obj2) {
                        break;
                    }
                } else if (i6 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 4:
                Object obj4 = lu3.a;
                int i7 = this.s;
                if (i7 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object r2 = s9a.r(new jd7(od7Var, r5, i2), this);
                    Object obj5 = r2;
                    if (r2 != obj4) {
                        obj5 = Unit.a;
                    }
                    if (obj5 == obj4) {
                        break;
                    }
                } else if (i7 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            default:
                Object obj6 = lu3.a;
                int i8 = this.s;
                if (i8 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object r3 = s9a.r(new jd7(od7Var, r5, 2), this);
                    Object obj7 = r3;
                    if (r3 != obj6) {
                        obj7 = Unit.a;
                    }
                    if (obj7 == obj6) {
                        break;
                    }
                } else if (i8 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
        }
        return Unit.a;
    }
}
