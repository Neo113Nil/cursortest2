package defpackage;

import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.IRecent;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Manager;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Referee;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueStage;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.network.response.SearchEntity;
import com.sofascore.model.network.response.SearchResponse;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.network.api.NetworkCoroutineAPI;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class uwg {
    public final NetworkCoroutineAPI a;
    public final gwg b;
    public final yea c;

    public uwg(NetworkCoroutineAPI networkCoroutineAPI, gwg gwgVar, yea yeaVar) {
        networkCoroutineAPI.getClass();
        yeaVar.getClass();
        this.a = networkCoroutineAPI;
        this.b = gwgVar;
        this.c = yeaVar;
    }

    public final Object a(hoi hoiVar) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.add(5, -30);
        Object U = gz8.U(hoiVar, this.b.a, false, true, new prd(calendar.getTimeInMillis() / 1000, 3));
        lu3 lu3Var = lu3.a;
        if (U != lu3Var) {
            U = Unit.a;
        }
        return U == lu3Var ? U : Unit.a;
    }

    public final Object b(int i, String str, sq3 sq3Var) {
        Object U = gz8.U(sq3Var, this.b.a, false, true, new pu9(i, str, 1));
        lu3 lu3Var = lu3.a;
        if (U != lu3Var) {
            U = Unit.a;
        }
        return U == lu3Var ? U : Unit.a;
    }

    public final yf4 c(String str) {
        nb8 s = zm2.s(this.b.a, false, new String[]{"saved_searches_table"}, new vqg(22));
        hs4 hs4Var = z45.a;
        return new yf4(hkg.H(k53.g0(s, hq4.c)), this, str, 2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x019d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable d(Function1 function1, sq3 sq3Var) {
        swg swgVar;
        int i;
        List<String> list;
        x2g x2gVar;
        String str;
        Sport sport;
        if (sq3Var instanceof swg) {
            swgVar = (swg) sq3Var;
            int i2 = swgVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                swgVar.u = i2 - Integer.MIN_VALUE;
                Object obj = swgVar.s;
                lu3 lu3Var = lu3.a;
                i = swgVar.u;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    List<String> entries = Sports.INSTANCE.getEntries();
                    r3 r3Var = new r3(function1, rq3Var, 19);
                    swgVar.r = entries;
                    swgVar.u = 1;
                    Object P = yaa.P(r3Var, swgVar);
                    if (P == lu3Var) {
                        return lu3Var;
                    }
                    list = entries;
                    obj = P;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list = swgVar.r;
                    y6a.M(obj);
                }
                x2gVar = (x2g) obj;
                if (x2gVar instanceof v2g) {
                    return km5.a;
                }
                List<SearchEntity<?>> results = ((SearchResponse) ((v2g) x2gVar).a).getResults();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : results) {
                    SearchEntity searchEntity = (SearchEntity) obj2;
                    String type = searchEntity != null ? searchEntity.getType() : null;
                    if (type != null) {
                        switch (type.hashCode()) {
                            case -1931148883:
                                if (type.equals(SearchResponseKt.UNIQUE_STAGE_ENTITY)) {
                                    IRecent entity = searchEntity.getEntity();
                                    entity.getClass();
                                    str = ((UniqueStage) entity).getCategory().getSport().getSlug();
                                    break;
                                }
                                break;
                            case -985752863:
                                if (type.equals(SearchResponseKt.PLAYER_ENTITY)) {
                                    IRecent entity2 = searchEntity.getEntity();
                                    entity2.getClass();
                                    Team team = ((Player) entity2).getTeam();
                                    if (team != null && (sport = team.getSport()) != null) {
                                        str = sport.getSlug();
                                        break;
                                    }
                                }
                                break;
                            case 3555933:
                                if (type.equals("team")) {
                                    IRecent entity3 = searchEntity.getEntity();
                                    entity3.getClass();
                                    Sport sport2 = ((Team) entity3).getSport();
                                    if (sport2 != null) {
                                        str = sport2.getSlug();
                                        break;
                                    }
                                }
                                break;
                            case 96891546:
                                if (type.equals("event")) {
                                    IRecent entity4 = searchEntity.getEntity();
                                    entity4.getClass();
                                    str = ((Event) entity4).getTournament().getCategory().getSport().getSlug();
                                    break;
                                }
                                break;
                            case 109651828:
                                if (type.equals(SearchResponseKt.SPORT_ENTITY)) {
                                    IRecent entity5 = searchEntity.getEntity();
                                    entity5.getClass();
                                    str = ((Sport) entity5).getSlug();
                                    break;
                                }
                                break;
                            case 109757182:
                                if (type.equals("stage")) {
                                    IRecent entity6 = searchEntity.getEntity();
                                    entity6.getClass();
                                    str = ((Stage) entity6).getSportSlug();
                                    break;
                                }
                                break;
                            case 496955546:
                                if (type.equals(SearchResponseKt.LEAGUE_ENTITY)) {
                                    IRecent entity7 = searchEntity.getEntity();
                                    entity7.getClass();
                                    str = ((UniqueTournament) entity7).getCategory().getSport().getSlug();
                                    break;
                                }
                                break;
                            case 835260333:
                                if (type.equals(SearchResponseKt.MANAGER_ENTITY)) {
                                    IRecent entity8 = searchEntity.getEntity();
                                    entity8.getClass();
                                    Sport sport3 = ((Manager) entity8).getSport();
                                    if (sport3 != null) {
                                        str = sport3.getSlug();
                                        break;
                                    }
                                }
                                break;
                            case 1085069600:
                                if (type.equals(SearchResponseKt.REFEREE_ENTITY)) {
                                    IRecent entity9 = searchEntity.getEntity();
                                    entity9.getClass();
                                    Sport sport4 = ((Referee) entity9).getSport();
                                    if (sport4 != null) {
                                        str = sport4.getSlug();
                                        break;
                                    }
                                }
                                break;
                        }
                        if (!CollectionsKt.R(list, str)) {
                            arrayList.add(obj2);
                        }
                    }
                    str = null;
                    if (!CollectionsKt.R(list, str)) {
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    SearchEntity searchEntity2 = (SearchEntity) it.next();
                    IRecent entity10 = searchEntity2 != null ? searchEntity2.getEntity() : null;
                    if (entity10 != null) {
                        arrayList2.add(entity10);
                    }
                }
                return arrayList2;
            }
        }
        swgVar = new swg(this, sq3Var);
        Object obj3 = swgVar.s;
        lu3 lu3Var2 = lu3.a;
        i = swgVar.u;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        x2gVar = (x2g) obj3;
        if (x2gVar instanceof v2g) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable e(int i, String str, sq3 sq3Var) {
        twg twgVar;
        int i2;
        List<String> list;
        SearchResponse searchResponse;
        List<SearchEntity<?>> results;
        Team team;
        Sport sport;
        String slug;
        if (sq3Var instanceof twg) {
            twgVar = (twg) sq3Var;
            int i3 = twgVar.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                twgVar.u = i3 - Integer.MIN_VALUE;
                Object obj = twgVar.s;
                lu3 lu3Var = lu3.a;
                i2 = twgVar.u;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    List<String> entries = Sports.INSTANCE.getEntries();
                    c64 c64Var = new c64(this, str, i, rq3Var, 17);
                    twgVar.r = entries;
                    twgVar.u = 1;
                    Object P = yaa.P(c64Var, twgVar);
                    if (P == lu3Var) {
                        return lu3Var;
                    }
                    obj = P;
                    list = entries;
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list = twgVar.r;
                    y6a.M(obj);
                }
                searchResponse = (SearchResponse) yaa.x((x2g) obj);
                if (searchResponse != null || (results = searchResponse.getResults()) == null) {
                    return km5.a;
                }
                ArrayList W = CollectionsKt.W(results);
                ArrayList arrayList = new ArrayList();
                Iterator it = W.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    SearchEntity searchEntity = (SearchEntity) next;
                    String type = searchEntity.getType();
                    int hashCode = type.hashCode();
                    if (hashCode == -985752863) {
                        if (type.equals(SearchResponseKt.PLAYER_ENTITY)) {
                            IRecent entity = searchEntity.getEntity();
                            entity.getClass();
                            Player player = (Player) entity;
                            if (!player.getDeceased() && (team = player.getTeam()) != null && (sport = team.getSport()) != null) {
                                slug = sport.getSlug();
                            }
                        }
                        slug = null;
                    } else if (hashCode != 3555933) {
                        if (hashCode == 496955546 && type.equals(SearchResponseKt.LEAGUE_ENTITY)) {
                            IRecent entity2 = searchEntity.getEntity();
                            entity2.getClass();
                            slug = ((UniqueTournament) entity2).getSportSlug();
                        }
                        slug = null;
                    } else {
                        if (type.equals("team")) {
                            IRecent entity3 = searchEntity.getEntity();
                            entity3.getClass();
                            Sport sport2 = ((Team) entity3).getSport();
                            if (sport2 != null) {
                                slug = sport2.getSlug();
                            }
                        }
                        slug = null;
                    }
                    if (CollectionsKt.R(list, slug)) {
                        arrayList.add(next);
                    }
                }
                ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((SearchEntity) it2.next()).getEntity());
                }
                return arrayList2;
            }
        }
        twgVar = new twg(this, sq3Var);
        Object obj2 = twgVar.s;
        lu3 lu3Var2 = lu3.a;
        i2 = twgVar.u;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        searchResponse = (SearchResponse) yaa.x((x2g) obj2);
        if (searchResponse != null) {
        }
        return km5.a;
    }

    public final String f(Object obj) {
        boolean z = obj instanceof Team;
        yea yeaVar = this.c;
        return z ? yeaVar.c(sha.Q(yeaVar.b, duf.b(Team.class)), obj) : obj instanceof Player ? yeaVar.c(sha.Q(yeaVar.b, duf.b(Player.class)), obj) : obj instanceof UniqueTournament ? yeaVar.c(sha.Q(yeaVar.b, duf.b(UniqueTournament.class)), obj) : obj instanceof Manager ? yeaVar.c(sha.Q(yeaVar.b, duf.b(Manager.class)), obj) : obj instanceof Referee ? yeaVar.c(sha.Q(yeaVar.b, duf.b(Referee.class)), obj) : obj instanceof Event ? yeaVar.c(sha.Q(yeaVar.b, duf.b(Event.class)), obj) : obj instanceof Stage ? yeaVar.c(sha.Q(yeaVar.b, duf.b(Stage.class)), obj) : obj instanceof UniqueStage ? yeaVar.c(sha.Q(yeaVar.b, duf.b(UniqueStage.class)), obj) : obj instanceof Sport ? yeaVar.c(sha.Q(yeaVar.b, duf.b(Sport.class)), obj) : "";
    }
}
