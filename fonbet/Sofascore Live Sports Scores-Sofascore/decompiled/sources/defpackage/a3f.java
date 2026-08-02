package defpackage;

import android.content.Context;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.PowerRankingRound;
import com.sofascore.model.newNetwork.PowerRankingRoundsResponse;
import com.sofascore.model.newNetwork.PowerRankingsGraphData;
import com.sofascore.model.newNetwork.PowerRankingsGraphDataResponse;
import com.sofascore.model.newNetwork.UniqueTournamentTeamsResponse;
import com.sofascore.results.R;
import java.text.Collator;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class a3f implements vtj {
    public final w3b a;
    public final utj b;

    public a3f(w3b w3bVar) {
        w3bVar.getClass();
        this.a = w3bVar;
        this.b = new utj(10, true, false);
    }

    @Override // defpackage.vtj
    public final String a() {
        return "PowerRankingsTrackerModal";
    }

    @Override // defpackage.vtj
    public final String b(Context context) {
        String string = context.getString(R.string.sofascore_power_rankings_tracker);
        string.getClass();
        return string;
    }

    @Override // defpackage.vtj
    public final String c(Context context) {
        String string = context.getString(R.string.round);
        string.getClass();
        return string;
    }

    @Override // defpackage.vtj
    public final String d(Context context, auj aujVar) {
        String d;
        aujVar.getClass();
        Integer num = aujVar.d;
        if (num != null && (d = v02.d(context, num.intValue(), null, null)) != null) {
            return d;
        }
        String string = context.getString(R.string.bracket_round_short, Integer.valueOf(aujVar.b));
        string.getClass();
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // defpackage.vtj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(int i, int i2, xtj xtjVar, rq3 rq3Var) {
        x2f x2fVar;
        int i3;
        xtj xtjVar2;
        PowerRankingRoundsResponse powerRankingRoundsResponse;
        Map map;
        List<PowerRankingRound> powerRankingRounds;
        List B0;
        if (rq3Var instanceof x2f) {
            x2fVar = (x2f) rq3Var;
            int i4 = x2fVar.u;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                x2fVar.u = i4 - Integer.MIN_VALUE;
                Object obj = x2fVar.s;
                lu3 lu3Var = lu3.a;
                i3 = x2fVar.u;
                if (i3 != 0) {
                    y6a.M(obj);
                    x2fVar.r = xtjVar;
                    x2fVar.u = 1;
                    Object c0 = this.a.c0(i, i2, x2fVar);
                    if (c0 == lu3Var) {
                        return lu3Var;
                    }
                    obj = c0;
                    xtjVar2 = xtjVar;
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xtjVar2 = x2fVar.r;
                    y6a.M(obj);
                }
                powerRankingRoundsResponse = (PowerRankingRoundsResponse) obj;
                if (xtjVar2 == null) {
                    map = xtjVar2.d;
                } else {
                    map = lm5.a;
                    map.getClass();
                }
                if (powerRankingRoundsResponse != null || (powerRankingRounds = powerRankingRoundsResponse.getPowerRankingRounds()) == null || (B0 = CollectionsKt.B0(powerRankingRounds)) == null) {
                    return km5.a;
                }
                ArrayList arrayList = new ArrayList(k13.r(B0, 10));
                int i5 = 0;
                for (Object obj2 : B0) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        b.q();
                        throw null;
                    }
                    PowerRankingRound powerRankingRound = (PowerRankingRound) obj2;
                    arrayList.add(new auj(powerRankingRound.getId(), i6, powerRankingRound.getRound().getName(), (Integer) map.get(new Integer(i6)), 0L, 0L, 48));
                    i5 = i6;
                }
                return arrayList;
            }
        }
        x2fVar = new x2f(this, (sq3) rq3Var);
        Object obj3 = x2fVar.s;
        lu3 lu3Var2 = lu3.a;
        i3 = x2fVar.u;
        if (i3 != 0) {
        }
        powerRankingRoundsResponse = (PowerRankingRoundsResponse) obj3;
        if (xtjVar2 == null) {
        }
        if (powerRankingRoundsResponse != null) {
        }
        return km5.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vtj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(int i, int i2, int i3, Context context, sq3 sq3Var) {
        w2f w2fVar;
        int i4;
        PowerRankingsGraphDataResponse powerRankingsGraphDataResponse;
        if (sq3Var instanceof w2f) {
            w2fVar = (w2f) sq3Var;
            int i5 = w2fVar.u;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                w2fVar.u = i5 - Integer.MIN_VALUE;
                Object obj = w2fVar.s;
                lu3 lu3Var = lu3.a;
                i4 = w2fVar.u;
                if (i4 != 0) {
                    y6a.M(obj);
                    w2fVar.r = context;
                    w2fVar.u = 1;
                    obj = this.a.d0(i, i2, i3, w2fVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i4 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    context = w2fVar.r;
                    y6a.M(obj);
                }
                powerRankingsGraphDataResponse = (PowerRankingsGraphDataResponse) obj;
                if (powerRankingsGraphDataResponse != null) {
                    return null;
                }
                List<PowerRankingsGraphData> graphData = powerRankingsGraphDataResponse.getGraphData();
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : graphData) {
                    if (hashSet.add(new Integer(((PowerRankingsGraphData) obj2).getRound()))) {
                        arrayList.add(obj2);
                    }
                }
                List H0 = CollectionsKt.H0(arrayList, new wpb(22));
                ArrayList arrayList2 = new ArrayList(k13.r(H0, 10));
                Iterator it = H0.iterator();
                while (it.hasNext()) {
                    w1l.A(arrayList2, ((PowerRankingsGraphData) it.next()).getPosition());
                }
                gv9 W = l6g.W(arrayList2);
                ArrayList arrayList3 = new ArrayList(k13.r(H0, 10));
                int i6 = 0;
                int i7 = 0;
                for (Object obj3 : H0) {
                    int i8 = i7 + 1;
                    if (i7 < 0) {
                        b.q();
                        throw null;
                    }
                    arrayList3.add(new Pair(new Integer(i8), l6g.K(f6a.K(context, ((PowerRankingsGraphData) obj3).getEvent()))));
                    i7 = i8;
                }
                tee X = l6g.X(tub.o(arrayList3));
                ArrayList arrayList4 = new ArrayList(k13.r(H0, 10));
                for (Object obj4 : H0) {
                    int i9 = i6 + 1;
                    if (i6 < 0) {
                        b.q();
                        throw null;
                    }
                    arrayList4.add(new Pair(new Integer(i9), ((PowerRankingsGraphData) obj4).getRoundType()));
                    i6 = i9;
                }
                ArrayList arrayList5 = new ArrayList();
                Iterator it2 = arrayList4.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (((Pair) next).b != null) {
                        arrayList5.add(next);
                    }
                }
                int c = sub.c(k13.r(arrayList5, 10));
                if (c < 16) {
                    c = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(c);
                Iterator it3 = arrayList5.iterator();
                while (it3.hasNext()) {
                    Pair pair = (Pair) it3.next();
                    Object obj5 = pair.a;
                    Object obj6 = pair.b;
                    obj6.getClass();
                    linkedHashMap.put(obj5, obj6);
                }
                return new xtj(W, X, null, l6g.X(linkedHashMap), 8);
            }
        }
        w2fVar = new w2f(this, sq3Var);
        Object obj7 = w2fVar.s;
        lu3 lu3Var2 = lu3.a;
        i4 = w2fVar.u;
        if (i4 != 0) {
        }
        powerRankingsGraphDataResponse = (PowerRankingsGraphDataResponse) obj7;
        if (powerRankingsGraphDataResponse != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0091, code lost:
    
        if (r5 == null) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vtj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(int i, int i2, Context context, sq3 sq3Var) {
        z2f z2fVar;
        int i3;
        UniqueTournamentTeamsResponse uniqueTournamentTeamsResponse;
        Collator collator;
        List list;
        List<Team> teams;
        if (sq3Var instanceof z2f) {
            z2fVar = (z2f) sq3Var;
            int i4 = z2fVar.u;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                z2fVar.u = i4 - Integer.MIN_VALUE;
                Object obj = z2fVar.s;
                lu3 lu3Var = lu3.a;
                i3 = z2fVar.u;
                if (i3 != 0) {
                    y6a.M(obj);
                    z2fVar.r = context;
                    z2fVar.u = 1;
                    obj = this.a.J0(i, i2, z2fVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    context = z2fVar.r;
                    y6a.M(obj);
                }
                uniqueTournamentTeamsResponse = (UniqueTournamentTeamsResponse) obj;
                collator = Collator.getInstance(Locale.getDefault());
                if (uniqueTournamentTeamsResponse != null && (teams = uniqueTournamentTeamsResponse.getTeams()) != null) {
                    ArrayList arrayList = new ArrayList(k13.r(teams, 10));
                    for (Team team : teams) {
                        int id = team.getId();
                        String A = tba.A(context, team);
                        if (A == null) {
                            A = tba.p(context, team);
                        }
                        arrayList.add(new huj(id, A));
                    }
                    collator.getClass();
                    list = CollectionsKt.H0(arrayList, new y2f(collator, 0));
                }
                list = km5.a;
                return new iuj(list, null);
            }
        }
        z2fVar = new z2f(this, sq3Var);
        Object obj2 = z2fVar.s;
        lu3 lu3Var2 = lu3.a;
        i3 = z2fVar.u;
        if (i3 != 0) {
        }
        uniqueTournamentTeamsResponse = (UniqueTournamentTeamsResponse) obj2;
        collator = Collator.getInstance(Locale.getDefault());
        if (uniqueTournamentTeamsResponse != null) {
            ArrayList arrayList2 = new ArrayList(k13.r(teams, 10));
            while (r6.hasNext()) {
            }
            collator.getClass();
            list = CollectionsKt.H0(arrayList2, new y2f(collator, 0));
        }
        list = km5.a;
        return new iuj(list, null);
    }

    @Override // defpackage.vtj
    public final utj getConfig() {
        return this.b;
    }

    @Override // defpackage.vtj
    public final String h(Context context) {
        String string = context.getString(R.string.sofascore_power_rankings_tracker_about_the_chart);
        string.getClass();
        return string;
    }

    @Override // defpackage.vtj
    public final b7g i(Context context, auj aujVar, String str) {
        aujVar.getClass();
        String str2 = aujVar.c;
        if (n9e.F(str2)) {
            Regex regex = c7g.a;
            return new z6g(c7g.a(str2, str).b(context));
        }
        String string = context.getString(R.string.round);
        string.getClass();
        return new a7g(string, aujVar.b, true);
    }
}
