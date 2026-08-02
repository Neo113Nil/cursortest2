package defpackage;

import com.sofascore.model.SeasonSpinnerData;
import com.sofascore.model.Sports;
import com.sofascore.model.UniqueTournamentSeasonsSpinnerData;
import com.sofascore.model.UniqueTournamentSpinnerData;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.newNetwork.StatisticsSeasonsResponse;
import com.sofascore.model.newNetwork.UniqueTournamentSeasons;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class m3j extends hoi implements Function2 {
    public int A;
    public int B;
    public /* synthetic */ Object C;
    public final /* synthetic */ rnj D;
    public final /* synthetic */ n3j E;
    public zu4 r;
    public av4 s;
    public UniqueTournamentSeasonsSpinnerData t;
    public String u;
    public gv9 v;
    public gv9 w;
    public c3j x;
    public gv9 y;
    public gv9 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3j(rnj rnjVar, n3j n3jVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.D = rnjVar;
        this.E = n3jVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        m3j m3jVar = new m3j(this.D, this.E, rq3Var);
        m3jVar.C = obj;
        return m3jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m3j) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0318 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x02eb  */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r23v4, types: [pnj] */
    /* JADX WARN: Type inference failed for: r23v5 */
    /* JADX WARN: Type inference failed for: r6v15, types: [int] */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v22 */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z;
        Object obj2;
        Object w;
        av4 av4Var;
        UniqueTournamentSeasonsSpinnerData uniqueTournamentSeasonsSpinnerData;
        zu4 zu4Var;
        List<UniqueTournamentSeasons> uniqueTournamentSeasons;
        Map<Integer, Map<Integer, List<String>>> typesMap;
        List<String> list;
        gv9 W;
        gv9 W2;
        gv9 gv9Var;
        Object T;
        String str;
        c3j c3jVar;
        UniqueTournamentSpinnerData uniqueTournament;
        ?? r6;
        SeasonSpinnerData seasonSpinnerData;
        Object T2;
        UniqueTournamentSeasonsSpinnerData uniqueTournamentSeasonsSpinnerData2;
        gv9 gv9Var2;
        c3j c3jVar2;
        gv9 gv9Var3;
        gv9 gv9Var4;
        String str2;
        Iterator it;
        Object obj3;
        ku3 ku3Var = (ku3) this.C;
        lu3 lu3Var = lu3.a;
        int i = this.B;
        int i2 = 3;
        boolean z2 = true;
        rnj rnjVar = this.D;
        n3j n3jVar = this.E;
        rq3 rq3Var = null;
        if (i == 0) {
            y6a.M(obj);
            xbb b = a.b();
            StatisticsSeasonsResponse statisticsSeasonsResponse = n3jVar.o;
            if (statisticsSeasonsResponse != null && (uniqueTournamentSeasons = statisticsSeasonsResponse.getUniqueTournamentSeasons()) != null) {
                for (UniqueTournamentSeasons uniqueTournamentSeasons2 : uniqueTournamentSeasons) {
                    StatisticsSeasonsResponse statisticsSeasonsResponse2 = n3jVar.o;
                    if (statisticsSeasonsResponse2 != null && (typesMap = statisticsSeasonsResponse2.getTypesMap()) != null && typesMap.containsKey(new Integer(uniqueTournamentSeasons2.getUniqueTournament().getId()))) {
                        Map map = (Map) me4.f(uniqueTournamentSeasons2.getUniqueTournament().getId(), typesMap);
                        xbb b2 = a.b();
                        for (Season season : uniqueTournamentSeasons2.getSeasons()) {
                            if (map != null) {
                                if (map.containsKey(new Integer(season.getId())) && (list = (List) me4.f(season.getId(), map)) != null) {
                                    season.setSubSeasonTypeList(list);
                                    b2.add(new SeasonSpinnerData(season.getId(), season.getYear()));
                                }
                            }
                        }
                        xbb a = a.a(b2);
                        if (!a.isEmpty()) {
                            UniqueTournament uniqueTournament2 = uniqueTournamentSeasons2.getUniqueTournament();
                            b.add(new UniqueTournamentSeasonsSpinnerData(new UniqueTournamentSpinnerData(uniqueTournament2.getId(), tba.x(uniqueTournament2), uniqueTournament2.getTennisPoints()), a));
                        }
                    }
                }
            }
            xbb a2 = a.a(b);
            av4 t = xw3.t(ku3Var, null, new k36(i2, a2, rq3Var), 3);
            av4 t2 = xw3.t(ku3Var, null, new m1f(n3jVar, rnjVar, rq3Var, 27), 3);
            z = false;
            ListIterator listIterator = a2.listIterator(0);
            while (true) {
                hc9 hc9Var = (hc9) listIterator;
                if (!hc9Var.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = hc9Var.next();
                if (((UniqueTournamentSeasonsSpinnerData) obj2).getUniqueTournament().getId() == rnjVar.a) {
                    break;
                }
            }
            UniqueTournamentSeasonsSpinnerData uniqueTournamentSeasonsSpinnerData3 = (UniqueTournamentSeasonsSpinnerData) obj2;
            this.C = null;
            this.r = t;
            this.s = t2;
            this.t = uniqueTournamentSeasonsSpinnerData3;
            z2 = true;
            this.B = 1;
            w = t2.w(this);
            lu3 lu3Var2 = lu3.a;
            if (w != lu3Var) {
                av4Var = t2;
                uniqueTournamentSeasonsSpinnerData = uniqueTournamentSeasonsSpinnerData3;
                zu4Var = t;
            }
            return lu3Var;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                gv9 gv9Var5 = this.z;
                gv9 gv9Var6 = this.y;
                c3j c3jVar3 = this.x;
                gv9 gv9Var7 = this.w;
                W = this.v;
                String str3 = this.u;
                UniqueTournamentSeasonsSpinnerData uniqueTournamentSeasonsSpinnerData4 = this.t;
                y6a.M(obj);
                uniqueTournamentSeasonsSpinnerData2 = uniqueTournamentSeasonsSpinnerData4;
                gv9Var2 = gv9Var5;
                gv9Var4 = gv9Var6;
                c3jVar2 = c3jVar3;
                gv9Var3 = gv9Var7;
                str2 = str3;
                seasonSpinnerData = null;
                T2 = obj;
                gv9 gv9Var8 = W;
                gv9 gv9Var9 = (gv9) T2;
                it = gv9Var3.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj3 = seasonSpinnerData;
                        break;
                    }
                    obj3 = it.next();
                    if (((SeasonSpinnerData) ((oxh) obj3).a).getId() == rnjVar.b) {
                        break;
                    }
                }
                oxh oxhVar = (oxh) obj3;
                SeasonSpinnerData seasonSpinnerData2 = oxhVar == null ? (SeasonSpinnerData) oxhVar.a : seasonSpinnerData;
                rlh rlhVar = rlh.b;
                oxh oxhVar2 = (oxh) CollectionsKt.firstOrNull(gv9Var4);
                return new g3j(gv9Var2, str2, gv9Var3, gv9Var9, seasonSpinnerData2, uniqueTournamentSeasonsSpinnerData2, gv9Var8, c3jVar2, rlhVar, gv9Var4, oxhVar2 == null ? (mnj) oxhVar2.a : seasonSpinnerData);
            }
            int i3 = this.A;
            gv9 gv9Var10 = this.y;
            c3jVar = this.x;
            gv9 gv9Var11 = this.w;
            gv9 gv9Var12 = this.v;
            String str4 = this.u;
            UniqueTournamentSeasonsSpinnerData uniqueTournamentSeasonsSpinnerData5 = this.t;
            zu4Var = this.r;
            y6a.M(obj);
            W = gv9Var12;
            str = str4;
            gv9Var = gv9Var10;
            W2 = gv9Var11;
            T = obj;
            r6 = i3;
            uniqueTournamentSeasonsSpinnerData = uniqueTournamentSeasonsSpinnerData5;
            gv9 gv9Var13 = (gv9) T;
            seasonSpinnerData = null;
            this.C = null;
            this.r = null;
            this.s = null;
            this.t = uniqueTournamentSeasonsSpinnerData;
            this.u = str;
            this.v = W;
            this.w = W2;
            this.x = c3jVar;
            this.y = gv9Var;
            this.z = gv9Var13;
            this.A = r6;
            this.B = 3;
            T2 = zu4Var.T(this);
            if (T2 != lu3Var) {
                uniqueTournamentSeasonsSpinnerData2 = uniqueTournamentSeasonsSpinnerData;
                gv9Var2 = gv9Var13;
                c3jVar2 = c3jVar;
                gv9Var3 = W2;
                gv9Var4 = gv9Var;
                str2 = str;
                gv9 gv9Var82 = W;
                gv9 gv9Var92 = (gv9) T2;
                it = gv9Var3.iterator();
                while (true) {
                    if (it.hasNext()) {
                    }
                }
                oxh oxhVar3 = (oxh) obj3;
                if (oxhVar3 == null) {
                }
                rlh rlhVar2 = rlh.b;
                oxh oxhVar22 = (oxh) CollectionsKt.firstOrNull(gv9Var4);
                return new g3j(gv9Var2, str2, gv9Var3, gv9Var92, seasonSpinnerData2, uniqueTournamentSeasonsSpinnerData2, gv9Var82, c3jVar2, rlhVar2, gv9Var4, oxhVar22 == null ? (mnj) oxhVar22.a : seasonSpinnerData);
            }
            return lu3Var;
        }
        uniqueTournamentSeasonsSpinnerData = this.t;
        av4Var = this.s;
        zu4 zu4Var2 = this.r;
        y6a.M(obj);
        zu4Var = zu4Var2;
        z = false;
        w = obj;
        s1h s1hVar = (s1h) CollectionsKt.firstOrNull((List) w);
        String str5 = s1hVar != null ? (String) s1hVar.a : null;
        if (uniqueTournamentSeasonsSpinnerData != null && (uniqueTournament = uniqueTournamentSeasonsSpinnerData.getUniqueTournament()) != null && uniqueTournament.getId() == 132 && Intrinsics.c(str5, Season.SubSeasonType.REGULAR_SEASON.getLabel())) {
            z = z2;
        }
        kp5<h3j> kp5Var = h3j.c;
        ArrayList arrayList = new ArrayList(k13.r(kp5Var, 10));
        for (h3j h3jVar : kp5Var) {
            arrayList.add(new oxh(new c3j(h3jVar, z), h3jVar.a(n3jVar.i(), z), null, null, null, false, 252));
        }
        W = l6g.W(arrayList);
        List<SeasonSpinnerData> seasons = uniqueTournamentSeasonsSpinnerData != null ? uniqueTournamentSeasonsSpinnerData.getSeasons() : null;
        if (seasons == null) {
            seasons = km5.a;
        }
        ArrayList arrayList2 = new ArrayList(k13.r(seasons, 10));
        for (SeasonSpinnerData seasonSpinnerData3 : seasons) {
            arrayList2.add(new oxh(seasonSpinnerData3, seasonSpinnerData3.getYear(), null, null, null, false, 252));
        }
        W2 = l6g.W(arrayList2);
        oxh oxhVar4 = (oxh) CollectionsKt.firstOrNull(W);
        c3j c3jVar4 = oxhVar4 != null ? (c3j) oxhVar4.a : null;
        if (Intrinsics.c(rnjVar.c, Sports.BASEBALL)) {
            kp5<wj1> kp5Var2 = wj1.f;
            ArrayList arrayList3 = new ArrayList(k13.r(kp5Var2, 10));
            for (wj1 wj1Var : kp5Var2) {
                n3j n3jVar2 = n3jVar;
                arrayList3.add(new oxh(new mnj(wj1Var), n3jVar2.i().getString(wj1Var.a), null, null, null, false, 252));
                n3jVar = n3jVar2;
            }
            gv9Var = l6g.W(arrayList3);
        } else {
            gv9Var = rlh.b;
        }
        this.C = null;
        this.r = zu4Var;
        this.s = null;
        this.t = uniqueTournamentSeasonsSpinnerData;
        this.u = str5;
        this.v = W;
        this.w = W2;
        this.x = c3jVar4;
        this.y = gv9Var;
        this.A = z ? 1 : 0;
        this.B = 2;
        T = av4Var.T(this);
        if (T != lu3Var) {
            str = str5;
            c3jVar = c3jVar4;
            r6 = z;
            gv9 gv9Var132 = (gv9) T;
            seasonSpinnerData = null;
            this.C = null;
            this.r = null;
            this.s = null;
            this.t = uniqueTournamentSeasonsSpinnerData;
            this.u = str;
            this.v = W;
            this.w = W2;
            this.x = c3jVar;
            this.y = gv9Var;
            this.z = gv9Var132;
            this.A = r6;
            this.B = 3;
            T2 = zu4Var.T(this);
            if (T2 != lu3Var) {
            }
        }
        return lu3Var;
    }
}
