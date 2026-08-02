package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.ironsource.mediationsdk.metadata.a;
import com.sofascore.model.Sports;
import com.sofascore.model.cuptree.CupTree;
import com.sofascore.model.cuptree.CupTreeBlock;
import com.sofascore.model.cuptree.CupTreeParticipant;
import com.sofascore.model.cuptree.CupTreeRound;
import com.sofascore.model.cuptree.CupTreesResponse;
import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Round;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.TournamentRoundWrapper;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.mvvm.model.UniqueTournamentDetails;
import com.sofascore.model.network.response.MediaHighlightedItem;
import com.sofascore.model.newNetwork.EventBestPlayer;
import com.sofascore.model.newNetwork.EventBestPlayersSummaryResponse;
import com.sofascore.model.newNetwork.EventListResponse;
import com.sofascore.model.newNetwork.EventMediaNews;
import com.sofascore.model.newNetwork.Highlight;
import com.sofascore.model.newNetwork.KeyPlayerData;
import com.sofascore.model.newNetwork.MediaVideoResponse;
import com.sofascore.model.newNetwork.PlayerOfTheSeasonResponse;
import com.sofascore.model.newNetwork.PowerRanking;
import com.sofascore.model.newNetwork.PowerRankingResponse;
import com.sofascore.model.newNetwork.PowerRankingRound;
import com.sofascore.model.newNetwork.PowerRankingRoundsResponse;
import com.sofascore.model.newNetwork.StatisticsSeasonsResponse;
import com.sofascore.model.newNetwork.TeamOfTheWeekItem;
import com.sofascore.model.newNetwork.TeamOfTheWeekResponse;
import com.sofascore.model.newNetwork.TeamOfTheWeekRound;
import com.sofascore.model.newNetwork.TeamOfTheWeekRoundsResponse;
import com.sofascore.model.newNetwork.TeamOfTheWeekTimespan;
import com.sofascore.model.newNetwork.TopPerformerData;
import com.sofascore.model.newNetwork.UniqueTournamentDetailsResponse;
import com.sofascore.model.newNetwork.UniqueTournamentKeyPlayersResponse;
import com.sofascore.model.newNetwork.UniqueTournamentSeasons;
import com.sofascore.model.newNetwork.UniqueTournamentTopPerformersResponse;
import com.sofascore.model.newNetwork.statistics.season.player.FootballPlayerSeasonStatistics;
import com.sofascore.model.newNetwork.topperformance.TopPerformanceResponse;
import com.sofascore.model.newNetwork.topperformance.response.TopPerformanceStatistics;
import com.sofascore.model.odds.OddsCountryProvider;
import com.sofascore.results.R;
import com.sofascore.results.league.fragment.topStats.TopPlayerCategoryUiModel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lqkl;", "Lynb;", "Loil;", "Leil;", "Lpel;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class qkl extends ynb {
    public final yf4 A;
    public final yf4 B;
    public final yf4 C;
    public final jof D;
    public final jof E;
    public List F;
    public final fdi G;
    public final jof H;
    public Map I;
    public final LinkedHashMap J;
    public Integer K;
    public final aeh L;
    public g9i M;
    public g9i N;
    public g9i O;
    public boolean P;
    public UniqueTournament Q;
    public g9i R;
    public g9i S;
    public g9i T;
    public final w3b l;
    public final t9c m;
    public final pai n;
    public final j0j o;
    public final s96 p;
    public final cg4 q;
    public final aya r;
    public final umd s;
    public final wi7 t;
    public final amd u;
    public final SharedPreferences v;
    public final irk w;
    public final kgl x;
    public final OddsCountryProvider y;
    public final yf4 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qkl(Application application, w3b w3bVar, t9c t9cVar, pai paiVar, j0j j0jVar, s96 s96Var, cg4 cg4Var, aya ayaVar, umd umdVar, wi7 wi7Var, amd amdVar, SharedPreferences sharedPreferences, bt7 bt7Var, irk irkVar, kgl kglVar) {
        super(application, tnb.a);
        w3bVar.getClass();
        t9cVar.getClass();
        paiVar.getClass();
        j0jVar.getClass();
        s96Var.getClass();
        cg4Var.getClass();
        ayaVar.getClass();
        umdVar.getClass();
        wi7Var.getClass();
        amdVar.getClass();
        sharedPreferences.getClass();
        irkVar.getClass();
        kglVar.getClass();
        this.l = w3bVar;
        this.m = t9cVar;
        this.n = paiVar;
        this.o = j0jVar;
        this.p = s96Var;
        this.q = cg4Var;
        this.r = ayaVar;
        this.s = umdVar;
        this.t = wi7Var;
        this.u = amdVar;
        this.v = sharedPreferences;
        this.w = irkVar;
        this.x = kglVar;
        bga bgaVar = xld.a;
        List b = amdVar.b(16);
        this.y = xld.d(b == null ? km5.a : b);
        this.z = cg4Var.f(new e5f("WC_26_SHOW_TIMELINE_INFO"), Boolean.TRUE);
        yf4 f = cg4Var.f(new e5f("WC_26_MY_TEAM_ALPHA2"), "");
        this.A = f;
        e5f e5fVar = new e5f("WC_26_MY_TEAM_EXPANDED");
        Boolean bool = Boolean.FALSE;
        this.B = cg4Var.f(e5fVar, bool);
        this.C = cg4Var.f(new e5f("WC_26_KNOCKOUT_EXPANDED"), bool);
        this.D = un0.K(new wj0(bt7Var.b(16), 7), un0.z(this), new uci(5000L, Long.MAX_VALUE), bool);
        rq3 rq3Var = null;
        int i = 1;
        this.E = un0.K(new l2e(la8.a(new cz5(f, 2), new tl(rq3Var, this, 24)), i), un0.z(this), new uci(5000L, Long.MAX_VALUE), bool);
        this.F = km5.a;
        fdi a = gdi.a(null);
        this.G = a;
        this.H = un0.u(a);
        lm5 lm5Var = lm5.a;
        lm5Var.getClass();
        this.I = lm5Var;
        this.J = new LinkedHashMap();
        aeh b2 = beh.b(0, 0, null, 7);
        this.L = b2;
        fcp.m0(new v98(la8.a(new jbl(new z88[]{f, b2}, i), new c37(new njl(this, rq3Var, 0), rq3Var, i)), new pdk(this, rq3Var, 10), 3), un0.z(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0066, code lost:
    
        if (r10 != r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0068, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0045, code lost:
    
        if (r10 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object A(sq3 sq3Var) {
        zjl zjlVar;
        Object obj;
        int i;
        w3b w3bVar;
        PowerRankingRoundsResponse powerRankingRoundsResponse;
        List<PowerRankingRound> powerRankingRounds;
        PowerRankingRound powerRankingRound;
        List<PowerRanking> powerRankings;
        List H0;
        List<PowerRanking> L0;
        if (sq3Var instanceof zjl) {
            zjlVar = (zjl) sq3Var;
            int i2 = zjlVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zjlVar.t = i2 - Integer.MIN_VALUE;
                obj = zjlVar.r;
                lu3 lu3Var = lu3.a;
                i = zjlVar.t;
                w3bVar = this.l;
                if (i != 0) {
                    y6a.M(obj);
                    zjlVar.t = 1;
                    obj = w3bVar.c0(16, 58210, zjlVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        PowerRankingResponse powerRankingResponse = (PowerRankingResponse) obj;
                        if (powerRankingResponse != null && (powerRankings = powerRankingResponse.getPowerRankings()) != null && (H0 = CollectionsKt.H0(powerRankings, new q6i(22))) != null && (L0 = CollectionsKt.L0(H0, 4)) != null) {
                            ArrayList arrayList = new ArrayList(k13.r(L0, 10));
                            for (PowerRanking powerRanking : L0) {
                                arrayList.add(new u2f(powerRanking.getTeam().getId(), tba.p(i(), powerRanking.getTeam()), powerRanking.getRank(), powerRanking.getPoints(), false, powerRanking.getRankDiff()));
                            }
                            return l6g.W(arrayList);
                        }
                        return null;
                    }
                    y6a.M(obj);
                }
                powerRankingRoundsResponse = (PowerRankingRoundsResponse) obj;
                if (powerRankingRoundsResponse != null && (powerRankingRounds = powerRankingRoundsResponse.getPowerRankingRounds()) != null && (powerRankingRound = (PowerRankingRound) CollectionsKt.firstOrNull(powerRankingRounds)) != null) {
                    int id = powerRankingRound.getId();
                    zjlVar.t = 2;
                    obj = w3bVar.b0(16, 58210, id, zjlVar);
                }
                return null;
            }
        }
        zjlVar = new zjl(this, sq3Var);
        obj = zjlVar.r;
        lu3 lu3Var2 = lu3.a;
        i = zjlVar.t;
        w3bVar = this.l;
        if (i != 0) {
        }
        powerRankingRoundsResponse = (PowerRankingRoundsResponse) obj;
        if (powerRankingRoundsResponse != null) {
            int id2 = powerRankingRound.getId();
            zjlVar.t = 2;
            obj = w3bVar.b0(16, 58210, id2, zjlVar);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x005b, code lost:
    
        if (r0 == r7) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0116 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00af A[LOOP:1: B:42:0x00a9->B:44:0x00af, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object B(bgl bglVar, sq3 sq3Var) {
        akl aklVar;
        akl aklVar2;
        lu3 lu3Var;
        int i;
        Integer num;
        bgl bglVar2;
        Iterator it;
        fsf fsfVar;
        oil oilVar;
        xil xilVar;
        hs4 hs4Var;
        bkl bklVar;
        gv9 gv9Var;
        yil yilVar;
        Object obj;
        if (sq3Var instanceof akl) {
            aklVar = (akl) sq3Var;
            int i2 = aklVar.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aklVar.x = i2 - Integer.MIN_VALUE;
                aklVar2 = aklVar;
                Object obj2 = aklVar2.v;
                lu3Var = lu3.a;
                i = aklVar2.x;
                if (i != 0) {
                    y6a.M(obj2);
                    num = this.K;
                    if (num != null) {
                        bglVar2 = bglVar;
                        bgl bglVar3 = bglVar2;
                        boolean z = num != null;
                        kp5 kp5Var = xil.e;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : kp5Var) {
                            if (((xil) obj3) != xil.c || z) {
                                arrayList.add(obj3);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                            xil xilVar2 = (xil) it.next();
                            String string = i().getString(xilVar2.a);
                            string.getClass();
                            arrayList2.add(new vt2(xilVar2, string, false, null, null, null, null, 252));
                        }
                        gv9 W = l6g.W(arrayList2);
                        fsfVar = new fsf();
                        oilVar = (oil) l().a();
                        if (oilVar != null || (yilVar = oilVar.t) == null || (r0 = yilVar.c) == null) {
                            xil xilVar3 = xil.b;
                        }
                        xilVar = xilVar3;
                        hs4Var = z45.a;
                        bklVar = new bkl(xilVar, this, fsfVar, bglVar3, null);
                        aklVar2.r = null;
                        aklVar2.s = W;
                        aklVar2.t = fsfVar;
                        aklVar2.u = xilVar;
                        aklVar2.x = 2;
                        if (xw3.R(hs4Var, bklVar, aklVar2) != lu3Var) {
                            gv9Var = W;
                            obj = fsfVar.a;
                            if (obj != null) {
                            }
                        }
                        return lu3Var;
                    }
                    String c = dv3.c();
                    bglVar2 = bglVar;
                    aklVar2.r = bglVar2;
                    aklVar2.x = 1;
                    obj2 = this.t.L(c, aklVar2);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        xilVar = aklVar2.u;
                        fsfVar = aklVar2.t;
                        gv9Var = aklVar2.s;
                        y6a.M(obj2);
                        obj = fsfVar.a;
                        if (obj != null) {
                            return null;
                        }
                        this.J.put(xilVar, obj);
                        return new yil(gv9Var, (gv9) fsfVar.a, xil.b);
                    }
                    bglVar2 = aklVar2.r;
                    y6a.M(obj2);
                }
                Map map = (Map) obj2;
                num = map == null ? (Integer) me4.f(16, map) : null;
                this.K = num;
                bgl bglVar32 = bglVar2;
                if (num != null) {
                }
                kp5 kp5Var2 = xil.e;
                ArrayList arrayList3 = new ArrayList();
                while (r0.hasNext()) {
                }
                ArrayList arrayList22 = new ArrayList(k13.r(arrayList3, 10));
                it = arrayList3.iterator();
                while (it.hasNext()) {
                }
                gv9 W2 = l6g.W(arrayList22);
                fsfVar = new fsf();
                oilVar = (oil) l().a();
                if (oilVar != null) {
                }
                xil xilVar32 = xil.b;
                xilVar = xilVar32;
                hs4Var = z45.a;
                bklVar = new bkl(xilVar, this, fsfVar, bglVar32, null);
                aklVar2.r = null;
                aklVar2.s = W2;
                aklVar2.t = fsfVar;
                aklVar2.u = xilVar;
                aklVar2.x = 2;
                if (xw3.R(hs4Var, bklVar, aklVar2) != lu3Var) {
                }
                return lu3Var;
            }
        }
        aklVar = new akl(this, sq3Var);
        aklVar2 = aklVar;
        Object obj22 = aklVar2.v;
        lu3Var = lu3.a;
        i = aklVar2.x;
        if (i != 0) {
        }
        Map map2 = (Map) obj22;
        if (map2 == null) {
        }
        this.K = num;
        bgl bglVar322 = bglVar2;
        if (num != null) {
        }
        kp5 kp5Var22 = xil.e;
        ArrayList arrayList32 = new ArrayList();
        while (r0.hasNext()) {
        }
        ArrayList arrayList222 = new ArrayList(k13.r(arrayList32, 10));
        it = arrayList32.iterator();
        while (it.hasNext()) {
        }
        gv9 W22 = l6g.W(arrayList222);
        fsfVar = new fsf();
        oilVar = (oil) l().a();
        if (oilVar != null) {
        }
        xil xilVar322 = xil.b;
        xilVar = xilVar322;
        hs4Var = z45.a;
        bklVar = new bkl(xilVar, this, fsfVar, bglVar322, null);
        aklVar2.r = null;
        aklVar2.s = W22;
        aklVar2.t = fsfVar;
        aklVar2.u = xilVar;
        aklVar2.x = 2;
        if (xw3.R(hs4Var, bklVar, aklVar2) != lu3Var) {
        }
        return lu3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object C(sq3 sq3Var) {
        ckl cklVar;
        lu3 lu3Var;
        int i;
        rfl rflVar;
        Integer num;
        Integer num2;
        Integer num3;
        n1k n1kVar;
        String str;
        iel ielVar;
        UniqueTournamentDetailsResponse uniqueTournamentDetailsResponse;
        UniqueTournamentDetails uniqueTournament;
        List list;
        Object P;
        String str2;
        int i2;
        List<UniqueTournamentSeasons> uniqueTournamentSeasons;
        UniqueTournamentSeasons uniqueTournamentSeasons2;
        UniqueTournament uniqueTournament2;
        Object obj;
        TopPerformanceResponse topPerformanceResponse;
        TopPerformanceStatistics topPerformanceStatistics;
        if (sq3Var instanceof ckl) {
            cklVar = (ckl) sq3Var;
            int i3 = cklVar.w;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                cklVar.w = i3 - Integer.MIN_VALUE;
                Object obj2 = cklVar.u;
                lu3Var = lu3.a;
                i = cklVar.w;
                j0j j0jVar = this.o;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj2);
                    oil oilVar = (oil) l().a();
                    if (oilVar != null && (rflVar = oilVar.g) != null) {
                        agl aglVar = rflVar.e;
                        num = aglVar != null ? aglVar.a : null;
                        String str3 = aglVar != null ? aglVar.b : null;
                        gv9 gv9Var = rflVar.f;
                        xel xelVar = gv9Var != null ? (xel) CollectionsKt.firstOrNull(gv9Var) : null;
                        oil oilVar2 = (oil) l().a();
                        bgl bglVar = oilVar2 != null ? oilVar2.y : null;
                        if (num != null && str3 != null && xelVar != null) {
                            if (bglVar == bgl.a || bglVar == bgl.b || (bglVar == bgl.c && !xelVar.a.b())) {
                                if (vel.e.contains(str3)) {
                                    cklVar.r = num;
                                    cklVar.w = 1;
                                    obj2 = this.l.t0(851, cklVar);
                                    if (obj2 != lu3Var) {
                                        num3 = num;
                                        uniqueTournamentDetailsResponse = (UniqueTournamentDetailsResponse) obj2;
                                        if (uniqueTournamentDetailsResponse != null) {
                                        }
                                        String str4 = "";
                                        num = num3;
                                        n1kVar = new n1k(new Integer(851), new Integer(87155), str4);
                                    }
                                } else {
                                    int intValue = num.intValue();
                                    cklVar.r = num;
                                    cklVar.w = 2;
                                    j0jVar.getClass();
                                    obj2 = yaa.P(new azi(j0jVar, intValue, rq3Var, 14), cklVar);
                                    if (obj2 != lu3Var) {
                                        num2 = num;
                                        StatisticsSeasonsResponse statisticsSeasonsResponse = (StatisticsSeasonsResponse) yaa.x((x2g) obj2);
                                        if (statisticsSeasonsResponse == null) {
                                        }
                                        if (uniqueTournamentSeasons == null) {
                                        }
                                        if (uniqueTournamentSeasons2 != null) {
                                        }
                                        return new ajl(0, rlh.b, "");
                                    }
                                }
                                return lu3Var;
                            }
                            Integer num4 = new Integer(16);
                            Integer num5 = new Integer(58210);
                            oil oilVar3 = (oil) l().a();
                            if (oilVar3 == null || (ielVar = oilVar3.a) == null || (str = ielVar.b) == null) {
                                str = "";
                            }
                            n1kVar = new n1k(num4, num5, str);
                        }
                    }
                    return null;
                }
                if (i == 1) {
                    num3 = cklVar.r;
                    y6a.M(obj2);
                    uniqueTournamentDetailsResponse = (UniqueTournamentDetailsResponse) obj2;
                    if (uniqueTournamentDetailsResponse != null || (uniqueTournament = uniqueTournamentDetailsResponse.getUniqueTournament()) == null || (str4 = tba.y(uniqueTournament)) == null) {
                        String str42 = "";
                    }
                    num = num3;
                    n1kVar = new n1k(new Integer(851), new Integer(87155), str42);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i2 = cklVar.t;
                        str2 = cklVar.s;
                        y6a.M(obj2);
                        list = null;
                        topPerformanceResponse = (TopPerformanceResponse) yaa.x((x2g) obj2);
                        if (topPerformanceResponse != null || (topPerformanceStatistics = (TopPerformanceStatistics) topPerformanceResponse.getTopPerformanceItems()) == null) {
                            return new ajl(0, rlh.b, "");
                        }
                        gv9<TopPlayerCategoryUiModel> F = zic.F(i(), topPerformanceStatistics, null, null, false, null, hub.d, false, 184);
                        ArrayList arrayList = new ArrayList();
                        for (TopPlayerCategoryUiModel topPlayerCategoryUiModel : F) {
                            List L0 = CollectionsKt.L0(topPlayerCategoryUiModel.b, 1);
                            if (L0.isEmpty()) {
                                L0 = list;
                            }
                            Object a = L0 != null ? TopPlayerCategoryUiModel.a(topPlayerCategoryUiModel, l6g.W(L0), 29) : list;
                            if (a != null) {
                                arrayList.add(a);
                            }
                        }
                        vel velVar = vel.a;
                        return new ajl(i2, l6g.W(CollectionsKt.L0(CollectionsKt.H0(arrayList, vel.e(i())), 7)), str2);
                    }
                    num2 = cklVar.r;
                    y6a.M(obj2);
                    StatisticsSeasonsResponse statisticsSeasonsResponse2 = (StatisticsSeasonsResponse) yaa.x((x2g) obj2);
                    uniqueTournamentSeasons = statisticsSeasonsResponse2 == null ? statisticsSeasonsResponse2.getUniqueTournamentSeasons() : null;
                    if (uniqueTournamentSeasons == null) {
                        Iterator<T> it = uniqueTournamentSeasons.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            if (this.F.contains(new Integer(((UniqueTournamentSeasons) obj).getUniqueTournament().getId()))) {
                                break;
                            }
                        }
                        uniqueTournamentSeasons2 = (UniqueTournamentSeasons) obj;
                    } else {
                        uniqueTournamentSeasons2 = null;
                    }
                    if (uniqueTournamentSeasons2 != null || (uniqueTournament2 = uniqueTournamentSeasons2.getUniqueTournament()) == null) {
                        return new ajl(0, rlh.b, "");
                    }
                    Integer num6 = new Integer(uniqueTournament2.getId());
                    Season season = (Season) CollectionsKt.firstOrNull(uniqueTournamentSeasons2.getSeasons());
                    if (season == null) {
                        return new ajl(0, rlh.b, "");
                    }
                    Integer num7 = new Integer(season.getId());
                    String x = tba.x(uniqueTournamentSeasons2.getUniqueTournament());
                    if (x == null) {
                        x = "";
                    }
                    n1kVar = new n1k(num6, num7, x);
                    num = num2;
                }
                int intValue2 = ((Number) n1kVar.a).intValue();
                int intValue3 = ((Number) n1kVar.b).intValue();
                String str5 = (String) n1kVar.c;
                int intValue4 = num.intValue();
                String label = Season.SubSeasonType.OVERALL.getLabel();
                cklVar.r = null;
                cklVar.s = str5;
                cklVar.t = intValue2;
                cklVar.w = 3;
                j0jVar.getClass();
                list = null;
                P = yaa.P(new gzi(j0jVar, intValue4, intValue2, intValue3, label, null, 3), cklVar);
                if (P != lu3Var) {
                    str2 = str5;
                    obj2 = P;
                    i2 = intValue2;
                    topPerformanceResponse = (TopPerformanceResponse) yaa.x((x2g) obj2);
                    if (topPerformanceResponse != null) {
                    }
                    return new ajl(0, rlh.b, "");
                }
                return lu3Var;
            }
        }
        cklVar = new ckl(this, sq3Var);
        Object obj22 = cklVar.u;
        lu3Var = lu3.a;
        i = cklVar.w;
        j0j j0jVar2 = this.o;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        int intValue22 = ((Number) n1kVar.a).intValue();
        int intValue32 = ((Number) n1kVar.b).intValue();
        String str52 = (String) n1kVar.c;
        int intValue42 = num.intValue();
        String label2 = Season.SubSeasonType.OVERALL.getLabel();
        cklVar.r = null;
        cklVar.s = str52;
        cklVar.t = intValue22;
        cklVar.w = 3;
        j0jVar2.getClass();
        list = null;
        P = yaa.P(new gzi(j0jVar2, intValue42, intValue22, intValue32, label2, null, 3), cklVar);
        if (P != lu3Var) {
        }
        return lu3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0060 A[LOOP:0: B:15:0x005a->B:17:0x0060, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object D(sq3 sq3Var) {
        gkl gklVar;
        int i;
        List list;
        List L0;
        ArrayList arrayList;
        Iterator it;
        if (sq3Var instanceof gkl) {
            gklVar = (gkl) sq3Var;
            int i2 = gklVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gklVar.t = i2 - Integer.MIN_VALUE;
                Object obj = gklVar.r;
                lu3 lu3Var = lu3.a;
                i = gklVar.t;
                if (i != 0) {
                    y6a.M(obj);
                    gklVar.t = 1;
                    obj = this.m.k(16, gklVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                list = (List) obj;
                if (list != null && (L0 = CollectionsKt.L0(list, 5)) != null) {
                    int i3 = ecd.h;
                    arrayList = new ArrayList(k13.r(L0, 10));
                    it = L0.iterator();
                    while (it.hasNext()) {
                        arrayList.add(wca.v((EventMediaNews) it.next()));
                    }
                    if (arrayList.size() < 3) {
                        arrayList = null;
                    }
                    if (arrayList != null) {
                        return l6g.W(arrayList);
                    }
                }
                return null;
            }
        }
        gklVar = new gkl(this, sq3Var);
        Object obj2 = gklVar.r;
        lu3 lu3Var2 = lu3.a;
        i = gklVar.t;
        if (i != 0) {
        }
        list = (List) obj2;
        if (list != null) {
            int i32 = ecd.h;
            arrayList = new ArrayList(k13.r(L0, 10));
            it = L0.iterator();
            while (it.hasNext()) {
            }
            if (arrayList.size() < 3) {
            }
            if (arrayList != null) {
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object E(sq3 sq3Var) {
        hkl hklVar;
        int i;
        EventListResponse eventListResponse;
        List<Event> events;
        Iterator<T> it;
        Object obj;
        Event event;
        Team awayTeam$default;
        if (sq3Var instanceof hkl) {
            hklVar = (hkl) sq3Var;
            int i2 = hklVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hklVar.t = i2 - Integer.MIN_VALUE;
                hkl hklVar2 = hklVar;
                Object obj2 = hklVar2.r;
                lu3 lu3Var = lu3.a;
                i = hklVar2.t;
                if (i != 0) {
                    y6a.M(obj2);
                    Integer num = new Integer(58210);
                    String t6eVar = t6e.a.toString();
                    hklVar2.t = 1;
                    obj2 = this.l.v0(16, 0, hklVar2, num, t6eVar);
                    if (obj2 == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj2);
                }
                eventListResponse = (EventListResponse) obj2;
                if (eventListResponse != null && (events = eventListResponse.getEvents()) != null) {
                    it = events.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = it.next();
                            Event event2 = (Event) obj;
                            Regex regex = c7g.a;
                            Round roundInfo = event2.getRoundInfo();
                            if (Intrinsics.c(roundInfo != null ? roundInfo.getName() : null, "Final") && ok3.C(event2)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    event = (Event) obj;
                    if (event != null) {
                        Integer winnerCode$default = Event.getWinnerCode$default(event, null, 1, null);
                        if (winnerCode$default != null && winnerCode$default.intValue() == 1) {
                            awayTeam$default = Event.getHomeTeam$default(event, null, 1, null);
                        } else if (winnerCode$default != null && winnerCode$default.intValue() == 2) {
                            awayTeam$default = Event.getAwayTeam$default(event, null, 1, null);
                        }
                        int id = awayTeam$default.getId();
                        String p = tba.p(i(), awayTeam$default);
                        Country country = awayTeam$default.getCountry();
                        String alpha2 = country != null ? country.getAlpha2() : null;
                        if (alpha2 == null) {
                            alpha2 = "";
                        }
                        return new mjl(id, p, alpha2, sha.H(i(), event));
                    }
                }
                return null;
            }
        }
        hklVar = new hkl(this, sq3Var);
        hkl hklVar22 = hklVar;
        Object obj22 = hklVar22.r;
        lu3 lu3Var2 = lu3.a;
        i = hklVar22.t;
        if (i != 0) {
        }
        eventListResponse = (EventListResponse) obj22;
        if (eventListResponse != null) {
            it = events.iterator();
            while (true) {
                if (!it.hasNext()) {
                }
            }
            event = (Event) obj;
            if (event != null) {
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object F(sq3 sq3Var) {
        ikl iklVar;
        int i;
        List<MediaHighlightedItem<?>> videos;
        r5c r5cVar;
        if (sq3Var instanceof ikl) {
            iklVar = (ikl) sq3Var;
            int i2 = iklVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iklVar.t = i2 - Integer.MIN_VALUE;
                Object obj = iklVar.r;
                lu3 lu3Var = lu3.a;
                i = iklVar.t;
                if (i != 0) {
                    y6a.M(obj);
                    iklVar.t = 1;
                    obj = this.l.M0(16, iklVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                MediaVideoResponse mediaVideoResponse = (MediaVideoResponse) obj;
                videos = mediaVideoResponse == null ? mediaVideoResponse.getVideos() : null;
                if (videos != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<T> it = videos.iterator();
                    while (it.hasNext()) {
                        MediaHighlightedItem mediaHighlightedItem = (MediaHighlightedItem) it.next();
                        Integer mo689getId = mediaHighlightedItem.getItem().mo689getId();
                        if (mo689getId != null) {
                            int intValue = mo689getId.intValue();
                            String title = mediaHighlightedItem.getItem().getTitle();
                            String str = title == null ? "" : title;
                            String subtitle = mediaHighlightedItem.getItem().getSubtitle();
                            String str2 = subtitle == null ? "" : subtitle;
                            String videoUrl = mediaHighlightedItem.getItem().getVideoUrl();
                            r5cVar = new r5c(new Highlight(intValue, str, str2, mediaHighlightedItem.getItem().getThumbnailUrl(), videoUrl == null ? "" : videoUrl, 6, false, null, 0L, "", Boolean.FALSE, null, a.o, null), false, false, 0, (Integer) null, 62);
                        } else {
                            r5cVar = null;
                        }
                        if (r5cVar != null) {
                            arrayList.add(r5cVar);
                        }
                    }
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        if (hashSet.add(new Integer(((r5c) next).a.getId()))) {
                            arrayList2.add(next);
                        }
                    }
                    gv9 W = l6g.W(arrayList2);
                    if (W != null && !W.isEmpty()) {
                        return W;
                    }
                }
                return null;
            }
        }
        iklVar = new ikl(this, sq3Var);
        Object obj2 = iklVar.r;
        lu3 lu3Var2 = lu3.a;
        i = iklVar.t;
        if (i != 0) {
        }
        MediaVideoResponse mediaVideoResponse2 = (MediaVideoResponse) obj2;
        if (mediaVideoResponse2 == null) {
        }
        if (videos != null) {
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00f5, code lost:
    
        if (r2.intValue() != r13.getId()) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x010c, code lost:
    
        if (r8 != null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0050, code lost:
    
        if (r1 == r3) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object G(sq3 sq3Var) {
        jkl jklVar;
        int i;
        List list;
        Object obj;
        List list2;
        xxi xxiVar;
        TournamentRoundWrapper tournamentRoundWrapper;
        Integer num;
        TournamentRoundWrapper tournamentRoundWrapper2;
        Integer num2;
        nn6 nn6Var;
        xxi xxiVar2;
        TournamentRoundWrapper tournamentRoundWrapper3;
        if (sq3Var instanceof jkl) {
            jklVar = (jkl) sq3Var;
            int i2 = jklVar.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jklVar.x = i2 - Integer.MIN_VALUE;
                Object obj2 = jklVar.v;
                Object obj3 = lu3.a;
                i = jklVar.x;
                nn6 nn6Var2 = null;
                if (i != 0) {
                    y6a.M(obj2);
                    jklVar.x = 1;
                    obj2 = u(58210, jklVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        TournamentRoundWrapper tournamentRoundWrapper4 = jklVar.u;
                        num = jklVar.t;
                        xxiVar = jklVar.s;
                        List list3 = jklVar.r;
                        y6a.M(obj2);
                        list2 = list3;
                        tournamentRoundWrapper = tournamentRoundWrapper4;
                        TeamOfTheWeekResponse teamOfTheWeekResponse = (TeamOfTheWeekResponse) obj2;
                        oil oilVar = (oil) l().a();
                        num2 = (oilVar != null || (xxiVar2 = oilVar.w) == null || (tournamentRoundWrapper3 = xxiVar2.d) == null) ? null : new Integer(tournamentRoundWrapper3.getId());
                        if (num2 != null) {
                        }
                        if (xxiVar != null && (nn6Var = xxiVar.k) != null) {
                            int id = tournamentRoundWrapper.getId();
                            if (num != null && num.intValue() == id) {
                                nn6Var2 = nn6Var;
                            }
                        }
                        nn6Var2 = qqj.a(tournamentRoundWrapper);
                        return qha.F(i(), Sports.FOOTBALL, 16, list2, tournamentRoundWrapper, teamOfTheWeekResponse, true, false, true, nn6Var2, false, null, null);
                    }
                    y6a.M(obj2);
                }
                list = (List) obj2;
                if (!list.isEmpty()) {
                    oil oilVar2 = (oil) l().a();
                    xxi xxiVar3 = oilVar2 != null ? oilVar2.w : null;
                    Integer num3 = (xxiVar3 == null || (tournamentRoundWrapper2 = xxiVar3.d) == null) ? null : new Integer(tournamentRoundWrapper2.getId());
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        int id2 = ((TournamentRoundWrapper) obj).getId();
                        if (num3 != null && id2 == num3.intValue()) {
                            break;
                        }
                    }
                    TournamentRoundWrapper tournamentRoundWrapper5 = (TournamentRoundWrapper) obj;
                    TournamentRoundWrapper tournamentRoundWrapper6 = tournamentRoundWrapper5 == null ? (TournamentRoundWrapper) CollectionsKt.Y(list) : tournamentRoundWrapper5;
                    int id3 = tournamentRoundWrapper6.getId();
                    jklVar.r = list;
                    jklVar.s = xxiVar3;
                    jklVar.t = num3;
                    jklVar.u = tournamentRoundWrapper6;
                    jklVar.x = 2;
                    Object u = this.l.u(16, 58210, id3, jklVar);
                    if (u != obj3) {
                        list2 = list;
                        obj2 = u;
                        xxiVar = xxiVar3;
                        tournamentRoundWrapper = tournamentRoundWrapper6;
                        num = num3;
                        TeamOfTheWeekResponse teamOfTheWeekResponse2 = (TeamOfTheWeekResponse) obj2;
                        oil oilVar3 = (oil) l().a();
                        if (oilVar3 != null) {
                        }
                        if (num2 != null) {
                        }
                        if (xxiVar != null) {
                            int id4 = tournamentRoundWrapper.getId();
                            if (num != null) {
                                nn6Var2 = nn6Var;
                            }
                        }
                        nn6Var2 = qqj.a(tournamentRoundWrapper);
                        return qha.F(i(), Sports.FOOTBALL, 16, list2, tournamentRoundWrapper, teamOfTheWeekResponse2, true, false, true, nn6Var2, false, null, null);
                    }
                    return obj3;
                }
                return null;
            }
        }
        jklVar = new jkl(this, sq3Var);
        Object obj22 = jklVar.v;
        Object obj32 = lu3.a;
        i = jklVar.x;
        nn6 nn6Var22 = null;
        if (i != 0) {
        }
        list = (List) obj22;
        if (!list.isEmpty()) {
        }
        return null;
    }

    public final void H(eil eilVar) {
        xxi xxiVar;
        Object obj;
        int i = 3;
        rq3 rq3Var = null;
        if (eilVar instanceof yhl) {
            rxa rxaVar = ((yhl) eilVar).a;
            g9i g9iVar = this.M;
            if (g9iVar != null) {
                g9iVar.e(null);
            }
            this.M = xw3.L(un0.z(this), null, null, new i3l(this, rxaVar, rq3Var, 11), 3);
            return;
        }
        if (eilVar instanceof lgl) {
            sfl sflVar = ((lgl) eilVar).a;
            g9i g9iVar2 = this.N;
            if (g9iVar2 != null) {
                g9iVar2.e(null);
            }
            this.N = xw3.L(un0.z(this), null, null, new fdl(this, sflVar, rq3Var, i), 3);
            return;
        }
        if (eilVar instanceof ogl) {
            xw3.L(un0.z(this), null, null, new lkl(this, ((ogl) eilVar).a, rq3Var, 1), 3);
            return;
        }
        if (eilVar instanceof cil) {
            OddsCountryProvider oddsCountryProvider = this.y;
            if (oddsCountryProvider != null) {
                cil cilVar = (cil) eilVar;
                nv.c0(i(), cilVar.a, oddsCountryProvider, cilVar.b, cilVar.c, vmd.FEATURED_TOURNAMENT, "featured");
                return;
            }
            return;
        }
        if (eilVar instanceof bil) {
            n(null, new bcl(9, this, ((bil) eilVar).a));
            return;
        }
        if (eilVar instanceof ngl) {
            xw3.L(un0.z(this), null, null, new lkl(this, ((ngl) eilVar).a, rq3Var, 0), 3);
            return;
        }
        if (eilVar instanceof zhl) {
            xil xilVar = ((zhl) eilVar).a;
            g9i g9iVar3 = this.O;
            if (g9iVar3 != null) {
                g9iVar3.e(null);
            }
            gv9 gv9Var = (gv9) this.J.get(xilVar);
            n(null, new bcl(8, gv9Var, xilVar));
            if (gv9Var == null) {
                this.O = xw3.L(un0.z(this), null, null, new i3l(this, xilVar, rq3Var, 12), 3);
                return;
            }
            return;
        }
        if (!(eilVar instanceof ail)) {
            if (eilVar instanceof dil) {
                k(lel.a);
                return;
            }
            return;
        }
        int i2 = ((ail) eilVar).a;
        oil oilVar = (oil) l().a();
        if (oilVar == null || (xxiVar = oilVar.w) == null) {
            return;
        }
        gv9 gv9Var2 = xxiVar.c;
        ArrayList arrayList = new ArrayList(k13.r(gv9Var2, 10));
        Iterator<E> it = gv9Var2.iterator();
        while (it.hasNext()) {
            arrayList.add(((k7g) it.next()).a);
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it2.next();
                if (((TournamentRoundWrapper) obj).getId() == i2) {
                    break;
                }
            }
        }
        TournamentRoundWrapper tournamentRoundWrapper = (TournamentRoundWrapper) obj;
        if (tournamentRoundWrapper == null) {
            return;
        }
        nn6 a = qqj.a(tournamentRoundWrapper);
        g9i g9iVar4 = this.T;
        if (g9iVar4 != null) {
            g9iVar4.e(null);
        }
        this.T = xw3.L(un0.z(this), null, null, new jr5(this, arrayList, tournamentRoundWrapper, xxiVar, a, i2, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t(int i, sq3 sq3Var) {
        ojl ojlVar;
        int i2;
        EventBestPlayersSummaryResponse eventBestPlayersSummaryResponse;
        EventBestPlayer playerOfTheMatch;
        if (sq3Var instanceof ojl) {
            ojlVar = (ojl) sq3Var;
            int i3 = ojlVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ojlVar.t = i3 - Integer.MIN_VALUE;
                Object obj = ojlVar.r;
                lu3 lu3Var = lu3.a;
                i2 = ojlVar.t;
                if (i2 != 0) {
                    y6a.M(obj);
                    ojlVar.t = 1;
                    obj = this.p.h(i, ojlVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                eventBestPlayersSummaryResponse = (EventBestPlayersSummaryResponse) obj;
                if (eventBestPlayersSummaryResponse != null || (playerOfTheMatch = eventBestPlayersSummaryResponse.getPlayerOfTheMatch()) == null) {
                    return q2f.a;
                }
                Team team = playerOfTheMatch.getTeam();
                if (team == null) {
                    team = playerOfTheMatch.getPlayer().getTeam();
                }
                Team team2 = team;
                return new o2f(playerOfTheMatch.getPlayer().getId(), tba.t(playerOfTheMatch.getPlayer()), team2 != null ? new Integer(team2.getId()) : null, team2 != null ? tba.p(i(), team2) : null, b.f(playerOfTheMatch.getValue()), playerOfTheMatch.getPlayer(), team2);
            }
        }
        ojlVar = new ojl(this, sq3Var);
        Object obj2 = ojlVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = ojlVar.t;
        if (i2 != 0) {
        }
        eventBestPlayersSummaryResponse = (EventBestPlayersSummaryResponse) obj2;
        if (eventBestPlayersSummaryResponse != null) {
        }
        return q2f.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u(int i, sq3 sq3Var) {
        pjl pjlVar;
        int i2;
        List<TeamOfTheWeekItem> periods;
        if (sq3Var instanceof pjl) {
            pjlVar = (pjl) sq3Var;
            int i3 = pjlVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                pjlVar.t = i3 - Integer.MIN_VALUE;
                Object obj = pjlVar.r;
                lu3 lu3Var = lu3.a;
                i2 = pjlVar.t;
                if (i2 != 0) {
                    y6a.M(obj);
                    pjlVar.t = 1;
                    obj = this.l.h0(16, i, pjlVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                TeamOfTheWeekRoundsResponse teamOfTheWeekRoundsResponse = (TeamOfTheWeekRoundsResponse) obj;
                periods = teamOfTheWeekRoundsResponse == null ? teamOfTheWeekRoundsResponse.getPeriods() : null;
                if (periods == null) {
                    periods = km5.a;
                }
                ArrayList arrayList = new ArrayList(k13.r(periods, 10));
                for (TeamOfTheWeekItem teamOfTheWeekItem : periods) {
                    String name = teamOfTheWeekItem instanceof TeamOfTheWeekRound ? ((TeamOfTheWeekRound) teamOfTheWeekItem).getRound().getName() : teamOfTheWeekItem instanceof TeamOfTheWeekTimespan ? ((TeamOfTheWeekTimespan) teamOfTheWeekItem).getItemName() : String.valueOf(teamOfTheWeekItem.getId());
                    int id = teamOfTheWeekItem.getId();
                    String type = teamOfTheWeekItem.getType();
                    String periodName = teamOfTheWeekItem.getPeriodName();
                    Integer tournamentId = teamOfTheWeekItem.getTournamentId();
                    boolean z = teamOfTheWeekItem instanceof TeamOfTheWeekTimespan;
                    TeamOfTheWeekTimespan teamOfTheWeekTimespan = z ? (TeamOfTheWeekTimespan) teamOfTheWeekItem : null;
                    Long l = teamOfTheWeekTimespan != null ? new Long(teamOfTheWeekTimespan.getDateFrom()) : null;
                    TeamOfTheWeekTimespan teamOfTheWeekTimespan2 = z ? (TeamOfTheWeekTimespan) teamOfTheWeekItem : null;
                    Long l2 = teamOfTheWeekTimespan2 != null ? new Long(teamOfTheWeekTimespan2.getDateTo()) : null;
                    long createdAtTimestamp = teamOfTheWeekItem.getCreatedAtTimestamp();
                    Long startDateTimestamp = teamOfTheWeekItem.getStartDateTimestamp();
                    arrayList.add(new TournamentRoundWrapper(id, type, periodName, tournamentId, name, name, true, l, l2, createdAtTimestamp, startDateTimestamp != null ? startDateTimestamp.longValue() : 0L));
                }
                return CollectionsKt.H0(arrayList, new q6i(17));
            }
        }
        pjlVar = new pjl(this, sq3Var);
        Object obj2 = pjlVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = pjlVar.t;
        if (i2 != 0) {
        }
        TeamOfTheWeekRoundsResponse teamOfTheWeekRoundsResponse2 = (TeamOfTheWeekRoundsResponse) obj2;
        if (teamOfTheWeekRoundsResponse2 == null) {
        }
        if (periods == null) {
        }
        ArrayList arrayList2 = new ArrayList(k13.r(periods, 10));
        while (r0.hasNext()) {
        }
        return CollectionsKt.H0(arrayList2, new q6i(17));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
    
        if (r8 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(OddsCountryProvider oddsCountryProvider, sq3 sq3Var) {
        qjl qjlVar;
        int i;
        if (sq3Var instanceof qjl) {
            qjlVar = (qjl) sq3Var;
            int i2 = qjlVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qjlVar.u = i2 - Integer.MIN_VALUE;
                Object obj = qjlVar.s;
                lu3 lu3Var = lu3.a;
                i = qjlVar.u;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    qjlVar.r = oddsCountryProvider;
                    qjlVar.u = 1;
                    w3b w3bVar = this.l;
                    w3bVar.getClass();
                    obj = s9a.r(new va8(w3bVar, rq3Var, 9), qjlVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            y6a.M(obj);
                            return obj;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oddsCountryProvider = qjlVar.r;
                    y6a.M(obj);
                }
                hs4 hs4Var = z45.a;
                kuj kujVar = new kuj((List) obj, oddsCountryProvider, this, (rq3) null);
                qjlVar.r = null;
                qjlVar.u = 2;
                Object R = xw3.R(hs4Var, kujVar, qjlVar);
                return R != lu3Var ? lu3Var : R;
            }
        }
        qjlVar = new qjl(this, sq3Var);
        Object obj2 = qjlVar.s;
        lu3 lu3Var2 = lu3.a;
        i = qjlVar.u;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        hs4 hs4Var2 = z45.a;
        kuj kujVar2 = new kuj((List) obj2, oddsCountryProvider, this, (rq3) null);
        qjlVar.r = null;
        qjlVar.u = 2;
        Object R2 = xw3.R(hs4Var2, kujVar2, qjlVar);
        if (R2 != lu3Var2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x009c, code lost:
    
        if (r5 != null) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0086 A[LOOP:0: B:18:0x0080->B:20:0x0086, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object w(sq3 sq3Var) {
        rjl rjlVar;
        int i;
        List<KeyPlayerData> keyPlayers;
        Set set;
        String str;
        String str2;
        String name;
        List L0;
        Iterator it;
        if (sq3Var instanceof rjl) {
            rjlVar = (rjl) sq3Var;
            int i2 = rjlVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rjlVar.t = i2 - Integer.MIN_VALUE;
                Object obj = rjlVar.r;
                lu3 lu3Var = lu3.a;
                i = rjlVar.t;
                if (i != 0) {
                    y6a.M(obj);
                    rjlVar.t = 1;
                    obj = this.l.y(16, rjlVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                UniqueTournamentKeyPlayersResponse uniqueTournamentKeyPlayersResponse = (UniqueTournamentKeyPlayersResponse) obj;
                keyPlayers = uniqueTournamentKeyPlayersResponse == null ? uniqueTournamentKeyPlayersResponse.getKeyPlayers() : null;
                long w = yaa.w();
                wd5 wd5Var = xd5.b;
                long k = w / xd5.k(wkn.R(1, be5.HOURS), be5.SECONDS);
                if (keyPlayers != null && (L0 = CollectionsKt.L0(kotlin.collections.b.o(keyPlayers, d7a.h(k - 1)), 15)) != null) {
                    ArrayList arrayList = new ArrayList(k13.r(L0, 10));
                    it = L0.iterator();
                    while (it.hasNext()) {
                        w1l.A(arrayList, ((KeyPlayerData) it.next()).getPlayer().getId());
                    }
                    set = CollectionsKt.W0(arrayList);
                }
                set = rm5.a;
                if (keyPlayers != null) {
                    List o = kotlin.collections.b.o(keyPlayers, d7a.h(k));
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = ((ArrayList) o).iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        if (!set.contains(new Integer(((KeyPlayerData) next).getPlayer().getId()))) {
                            arrayList2.add(next);
                        }
                    }
                    List<KeyPlayerData> L02 = CollectionsKt.L0(arrayList2, 15);
                    if (L02 != null) {
                        ArrayList arrayList3 = new ArrayList(k13.r(L02, 10));
                        for (KeyPlayerData keyPlayerData : L02) {
                            int id = keyPlayerData.getPlayer().getId();
                            String t = tba.t(keyPlayerData.getPlayer());
                            Double f = b.f(keyPlayerData.getRating());
                            double doubleValue = f != null ? f.doubleValue() : 0.0d;
                            Country country = keyPlayerData.getPlayer().getCountry();
                            String str3 = "";
                            if (country == null || (str = country.getAlpha2()) == null) {
                                str = "";
                            }
                            Context i3 = i();
                            ArrayList arrayList4 = dv3.a;
                            Country country2 = keyPlayerData.getPlayer().getCountry();
                            if (country2 == null || (str2 = country2.getAlpha2()) == null) {
                                str2 = "";
                            }
                            com.sofascore.model.Country a = dv3.a(str2);
                            if (a != null && (name = a.getName()) != null) {
                                str3 = name;
                            }
                            arrayList3.add(new afl(id, t, doubleValue, str, tv3.c(i3, str3)));
                        }
                        return l6g.W(arrayList3);
                    }
                }
                return null;
            }
        }
        rjlVar = new rjl(this, sq3Var);
        Object obj2 = rjlVar.r;
        lu3 lu3Var2 = lu3.a;
        i = rjlVar.t;
        if (i != 0) {
        }
        UniqueTournamentKeyPlayersResponse uniqueTournamentKeyPlayersResponse2 = (UniqueTournamentKeyPlayersResponse) obj2;
        if (uniqueTournamentKeyPlayersResponse2 == null) {
        }
        long w2 = yaa.w();
        wd5 wd5Var2 = xd5.b;
        long k2 = w2 / xd5.k(wkn.R(1, be5.HOURS), be5.SECONDS);
        if (keyPlayers != null) {
            ArrayList arrayList5 = new ArrayList(k13.r(L0, 10));
            it = L0.iterator();
            while (it.hasNext()) {
            }
            set = CollectionsKt.W0(arrayList5);
        }
        set = rm5.a;
        if (keyPlayers != null) {
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x018d, code lost:
    
        if (r0 == null) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object x(sq3 sq3Var) {
        sjl sjlVar;
        int i;
        CupTreesResponse cupTreesResponse;
        CupTree cupTree;
        List<CupTreeRound> rounds;
        gv9 gv9Var;
        List<CupTreeRound> H0;
        Integer num;
        int i2;
        Integer num2;
        if (sq3Var instanceof sjl) {
            sjlVar = (sjl) sq3Var;
            int i3 = sjlVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                sjlVar.t = i3 - Integer.MIN_VALUE;
                Object obj = sjlVar.r;
                lu3 lu3Var = lu3.a;
                i = sjlVar.t;
                if (i != 0) {
                    y6a.M(obj);
                    sjlVar.t = 1;
                    obj = this.l.p0(16, 58210, sjlVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                cupTreesResponse = (CupTreesResponse) obj;
                if (cupTreesResponse == null || (cupTree = (CupTree) CollectionsKt.firstOrNull(cupTreesResponse.getCupTrees())) == null) {
                    return null;
                }
                rounds = cupTree.getRounds();
                if (rounds != null && (H0 = CollectionsKt.H0(rounds, new q6i(19))) != null) {
                    ArrayList arrayList = new ArrayList();
                    for (CupTreeRound cupTreeRound : H0) {
                        List<CupTreeBlock> H02 = CollectionsKt.H0(cupTreeRound.getBlocks(), new q6i(20));
                        ArrayList arrayList2 = new ArrayList(k13.r(H02, 10));
                        for (CupTreeBlock cupTreeBlock : H02) {
                            Context i4 = i();
                            cupTreeBlock.getClass();
                            CupTreeParticipant homeParticipant = cupTreeBlock.getHomeParticipant();
                            Team team = homeParticipant != null ? homeParticipant.getTeam() : null;
                            CupTreeParticipant awayParticipant = cupTreeBlock.getAwayParticipant();
                            Team team2 = awayParticipant != null ? awayParticipant.getTeam() : null;
                            List<Integer> events = cupTreeBlock.getEvents();
                            int intValue = (events == null || (num2 = (Integer) CollectionsKt.firstOrNull(events)) == null) ? 0 : num2.intValue();
                            int id = team != null ? team.getId() : 0;
                            int id2 = team2 != null ? team2.getId() : 0;
                            String p = tba.p(i4, team);
                            String A = tba.A(i4, team);
                            String nameCode = team != null ? team.getNameCode() : null;
                            String p2 = tba.p(i4, team2);
                            String A2 = tba.A(i4, team2);
                            String nameCode2 = team2 != null ? team2.getNameCode() : null;
                            boolean disabled = team != null ? team.getDisabled() : true;
                            boolean disabled2 = team2 != null ? team2.getDisabled() : true;
                            CupTreeParticipant homeParticipant2 = cupTreeBlock.getHomeParticipant();
                            if (homeParticipant2 == null || !homeParticipant2.getWinner()) {
                                CupTreeParticipant awayParticipant2 = cupTreeBlock.getAwayParticipant();
                                if (awayParticipant2 == null || !awayParticipant2.getWinner()) {
                                    num = null;
                                    arrayList2.add(new wn1(intValue, id, id2, p, A, nameCode, p2, A2, nameCode2, null, null, null, null, disabled, disabled2, 0L, "", "", null, null, num));
                                } else {
                                    i2 = 2;
                                }
                            } else {
                                i2 = 1;
                            }
                            num = i2;
                            arrayList2.add(new wn1(intValue, id, id2, p, A, nameCode, p2, A2, nameCode2, null, null, null, null, disabled, disabled2, 0L, "", "", null, null, num));
                        }
                        gv9 W = l6g.W(arrayList2);
                        ffl fflVar = W.isEmpty() ? null : new ffl(cupTreeRound.getType(), W);
                        if (fflVar != null) {
                            arrayList.add(fflVar);
                        }
                    }
                    gv9Var = l6g.W(arrayList);
                }
                gv9Var = rlh.b;
                return new efl(gv9Var);
            }
        }
        sjlVar = new sjl(this, sq3Var);
        Object obj2 = sjlVar.r;
        lu3 lu3Var2 = lu3.a;
        i = sjlVar.t;
        if (i != 0) {
        }
        cupTreesResponse = (CupTreesResponse) obj2;
        if (cupTreesResponse == null) {
            rounds = cupTree.getRounds();
            if (rounds != null) {
                ArrayList arrayList3 = new ArrayList();
                while (r1.hasNext()) {
                }
                gv9Var = l6g.W(arrayList3);
            }
            gv9Var = rlh.b;
            return new efl(gv9Var);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object y(sq3 sq3Var) {
        ujl ujlVar;
        int i;
        UniqueTournamentTopPerformersResponse uniqueTournamentTopPerformersResponse;
        List<TopPerformerData> topPlayers;
        if (sq3Var instanceof ujl) {
            ujlVar = (ujl) sq3Var;
            int i2 = ujlVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ujlVar.t = i2 - Integer.MIN_VALUE;
                Object obj = ujlVar.r;
                lu3 lu3Var = lu3.a;
                i = ujlVar.t;
                if (i != 0) {
                    y6a.M(obj);
                    ujlVar.t = 1;
                    obj = this.l.z(16, 58210, ujlVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                uniqueTournamentTopPerformersResponse = (UniqueTournamentTopPerformersResponse) obj;
                if (uniqueTournamentTopPerformersResponse != null || (topPlayers = uniqueTournamentTopPerformersResponse.getTopPlayers()) == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(k13.r(topPlayers, 10));
                for (TopPerformerData topPerformerData : topPlayers) {
                    int id = topPerformerData.getPlayer().getId();
                    String t = tba.t(topPerformerData.getPlayer());
                    Double rating = topPerformerData.getRating();
                    arrayList.add(new hjl(id, t, rating != null ? rating.doubleValue() : 0.0d, topPerformerData.getTeam().getId(), tba.p(i(), topPerformerData.getTeam()), topPerformerData.getEvent(), topPerformerData.getPlayer(), topPerformerData.getTeam()));
                }
                return l6g.W(arrayList);
            }
        }
        ujlVar = new ujl(this, sq3Var);
        Object obj2 = ujlVar.r;
        lu3 lu3Var2 = lu3.a;
        i = ujlVar.t;
        if (i != 0) {
        }
        uniqueTournamentTopPerformersResponse = (UniqueTournamentTopPerformersResponse) obj2;
        if (uniqueTournamentTopPerformersResponse != null) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object z(sq3 sq3Var) {
        yjl yjlVar;
        int i;
        PlayerOfTheSeasonResponse playerOfTheSeasonResponse;
        FootballPlayerSeasonStatistics statistics;
        Double rating;
        String p;
        if (sq3Var instanceof yjl) {
            yjlVar = (yjl) sq3Var;
            int i2 = yjlVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yjlVar.t = i2 - Integer.MIN_VALUE;
                Object obj = yjlVar.r;
                lu3 lu3Var = lu3.a;
                i = yjlVar.t;
                if (i != 0) {
                    y6a.M(obj);
                    yjlVar.t = 1;
                    obj = this.l.Z(16, 58210, yjlVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                playerOfTheSeasonResponse = (PlayerOfTheSeasonResponse) obj;
                if (playerOfTheSeasonResponse == null || (statistics = playerOfTheSeasonResponse.getStatistics()) == null || (rating = statistics.getRating()) == null) {
                    return null;
                }
                double doubleValue = rating.doubleValue();
                Team team = playerOfTheSeasonResponse.getTeam();
                int id = playerOfTheSeasonResponse.getPlayer().getId();
                String t = tba.t(playerOfTheSeasonResponse.getPlayer());
                int id2 = team == null ? team.getId() : 0;
                p = team == null ? tba.p(i(), team) : null;
                if (p == null) {
                    p = "";
                }
                return new cgl(id, t, id2, p, new n9k(R.string.player_of_the_tournament, team != null ? team.getGender() : null), doubleValue);
            }
        }
        yjlVar = new yjl(this, sq3Var);
        Object obj2 = yjlVar.r;
        lu3 lu3Var2 = lu3.a;
        i = yjlVar.t;
        if (i != 0) {
        }
        playerOfTheSeasonResponse = (PlayerOfTheSeasonResponse) obj2;
        if (playerOfTheSeasonResponse == null) {
            double doubleValue2 = rating.doubleValue();
            Team team2 = playerOfTheSeasonResponse.getTeam();
            int id3 = playerOfTheSeasonResponse.getPlayer().getId();
            String t2 = tba.t(playerOfTheSeasonResponse.getPlayer());
            int id22 = team2 == null ? team2.getId() : 0;
            if (team2 == null) {
            }
            if (p == null) {
            }
            return new cgl(id3, t2, id22, p, new n9k(R.string.player_of_the_tournament, team2 != null ? team2.getGender() : null), doubleValue2);
        }
        return null;
    }
}
