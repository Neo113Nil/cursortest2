package defpackage;

import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.SeasonKt;
import com.sofascore.model.newNetwork.PlayerDetailsResponse;
import com.sofascore.model.newNetwork.StatisticsSeasonsResponse;
import com.sofascore.model.newNetwork.UniqueTournamentSeasons;
import com.sofascore.results.player.statistics.compare.model.ComparisonSeasonInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class sme extends hoi implements Function2 {
    public av4 r;
    public Player s;
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ xme v;
    public final /* synthetic */ int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sme(xme xmeVar, int i, rq3 rq3Var) {
        super(2, rq3Var);
        this.v = xmeVar;
        this.w = i;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        sme smeVar = new sme(this.v, this.w, rq3Var);
        smeVar.u = obj;
        return smeVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((sme) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x006a, code lost:
    
        if (r0 == r2) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x006c, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x004f, code lost:
    
        if (r3 == r2) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [rq3] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r8v3, types: [km5] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v5 */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        av4 t;
        Object w;
        Player player;
        Object T;
        Map map;
        List<UniqueTournamentSeasons> uniqueTournamentSeasons;
        String label;
        Map<Integer, Map<Integer, List<String>>> typesMap;
        Collection<Map<Integer, List<String>>> values;
        ku3 ku3Var = (ku3) this.u;
        lu3 lu3Var = lu3.a;
        int i = this.t;
        int i2 = 0;
        int i3 = 1;
        xme xmeVar = this.v;
        ?? r8 = 0;
        r8 = 0;
        if (i == 0) {
            y6a.M(obj);
            int i4 = this.w;
            av4 t2 = xw3.t(ku3Var, null, new rme(xmeVar, i4, r8, i2), 3);
            t = xw3.t(ku3Var, null, new rme(xmeVar, i4, r8, i3), 3);
            this.u = null;
            this.r = t;
            this.t = 1;
            w = t2.w(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Player player2 = this.s;
                y6a.M(obj);
                player = player2;
                T = obj;
                StatisticsSeasonsResponse statisticsSeasonsResponse = (StatisticsSeasonsResponse) T;
                int i5 = 10;
                if (statisticsSeasonsResponse == null || (typesMap = statisticsSeasonsResponse.getTypesMap()) == null || (values = typesMap.values()) == null) {
                    map = null;
                } else {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = values.iterator();
                    while (it.hasNext()) {
                        Set<Map.Entry> entrySet = ((Map) it.next()).entrySet();
                        ArrayList arrayList2 = new ArrayList(k13.r(entrySet, 10));
                        for (Map.Entry entry : entrySet) {
                            arrayList2.add(new Pair(entry.getKey(), SeasonKt.mapToSubSeasonType((List) entry.getValue())));
                        }
                        o13.v(arrayList2, arrayList);
                    }
                    map = tub.o(arrayList);
                }
                if (map == null) {
                    map = lm5.a;
                    map.getClass();
                }
                if (statisticsSeasonsResponse != null && (uniqueTournamentSeasons = statisticsSeasonsResponse.getUniqueTournamentSeasons()) != null) {
                    r8 = new ArrayList(k13.r(uniqueTournamentSeasons, 10));
                    Iterator it2 = uniqueTournamentSeasons.iterator();
                    while (it2.hasNext()) {
                        wak W = w3a.W((UniqueTournamentSeasons) it2.next());
                        int i6 = W.a;
                        Integer num = new Integer(i6);
                        String str = W.b;
                        List<Season> list = W.c;
                        ArrayList arrayList3 = new ArrayList(k13.r(list, i5));
                        for (Season season : list) {
                            gv9 a = z83.a(season, map);
                            int id = season.getId();
                            Season.SubSeasonType subSeasonType = (Season.SubSeasonType) CollectionsKt.firstOrNull(a);
                            if (subSeasonType == null || (label = subSeasonType.getLabel()) == null) {
                                label = Season.SubSeasonType.OVERALL.getLabel();
                            }
                            arrayList3.add(new y83(season, a, new ComparisonSeasonInfo.UniqueTournamentSeasonInfo(i6, id, label), w3a.C(season, xmeVar.a)));
                        }
                        r8.add(new m93(num, str, l6g.W(arrayList3), false));
                        i5 = 10;
                    }
                }
                if (r8 == 0) {
                    r8 = km5.a;
                }
                return new x63(new a73(player.getId(), tba.t(player), player), l6g.W(r8));
            }
            t = this.r;
            y6a.M(obj);
            w = obj;
        }
        PlayerDetailsResponse playerDetailsResponse = (PlayerDetailsResponse) w;
        if (playerDetailsResponse == null || (player = playerDetailsResponse.getPlayer()) == null) {
            return null;
        }
        this.u = null;
        this.r = null;
        this.s = player;
        this.t = 2;
        T = t.T(this);
    }
}
