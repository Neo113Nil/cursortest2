package defpackage;

import android.content.Context;
import com.ironsource.U3;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.PerformanceGraphData;
import com.sofascore.model.mvvm.model.StandingsTable;
import com.sofascore.model.mvvm.model.StandingsTableRow;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.PerformanceGraphDataResponse;
import com.sofascore.model.newNetwork.StandingsResponse;
import com.sofascore.results.R;
import java.text.Collator;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class hbi implements vtj {
    public final w3b a;
    public final g39 b;
    public final utj c;

    public hbi(w3b w3bVar, g39 g39Var) {
        w3bVar.getClass();
        g39Var.getClass();
        this.a = w3bVar;
        this.b = g39Var;
        this.c = new utj(5, false, true);
    }

    @Override // defpackage.vtj
    public final String a() {
        return "StandingsTrackerModal";
    }

    @Override // defpackage.vtj
    public final String b(Context context) {
        String string = context.getString(R.string.standings_tracker_title);
        string.getClass();
        return string;
    }

    @Override // defpackage.vtj
    public final String c(Context context) {
        String string = context.getString(R.string.week_number);
        string.getClass();
        return string;
    }

    @Override // defpackage.vtj
    public final String d(Context context, auj aujVar) {
        aujVar.getClass();
        return String.valueOf(aujVar.b);
    }

    @Override // defpackage.vtj
    public final Object e(int i, int i2, xtj xtjVar, rq3 rq3Var) {
        if (xtjVar == null) {
            return km5.a;
        }
        IntRange intRange = new IntRange(1, xtjVar.a.size(), 1);
        ArrayList arrayList = new ArrayList(k13.r(intRange, 10));
        v6a it = intRange.iterator();
        while (it.c) {
            int nextInt = it.nextInt();
            l7g l7gVar = (l7g) xtjVar.c.get(new Integer(nextInt));
            long j = 0;
            long j2 = l7gVar != null ? l7gVar.a : 0L;
            if (l7gVar != null) {
                j = l7gVar.b;
            }
            arrayList.add(new auj(nextInt, nextInt, null, null, j2, j, 8));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.vtj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(int i, int i2, int i3, Context context, sq3 sq3Var) {
        fbi fbiVar;
        int i4;
        Context context2;
        PerformanceGraphDataResponse performanceGraphDataResponse;
        if (sq3Var instanceof fbi) {
            fbiVar = (fbi) sq3Var;
            int i5 = fbiVar.u;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                fbiVar.u = i5 - Integer.MIN_VALUE;
                Object obj = fbiVar.s;
                lu3 lu3Var = lu3.a;
                i4 = fbiVar.u;
                if (i4 != 0) {
                    y6a.M(obj);
                    fbiVar.r = context;
                    fbiVar.u = 1;
                    g39 g39Var = this.b;
                    g39Var.getClass();
                    Object P = yaa.P(new c39(g39Var, i, i2, i3, null, 0), fbiVar);
                    if (P == lu3Var) {
                        return lu3Var;
                    }
                    obj = P;
                    context2 = context;
                } else {
                    if (i4 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    context2 = fbiVar.r;
                    y6a.M(obj);
                }
                performanceGraphDataResponse = (PerformanceGraphDataResponse) yaa.x((x2g) obj);
                if (performanceGraphDataResponse != null) {
                    return null;
                }
                List<PerformanceGraphData> graphData = performanceGraphDataResponse.getGraphData();
                ArrayList arrayList = new ArrayList(k13.r(graphData, 10));
                Iterator<T> it = graphData.iterator();
                while (it.hasNext()) {
                    w1l.A(arrayList, ((PerformanceGraphData) it.next()).getPosition());
                }
                gv9 W = l6g.W(arrayList);
                List<PerformanceGraphData> graphData2 = performanceGraphDataResponse.getGraphData();
                int c = sub.c(k13.r(graphData2, 10));
                if (c < 16) {
                    c = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(c);
                for (PerformanceGraphData performanceGraphData : graphData2) {
                    Integer num = new Integer(performanceGraphData.getWeek());
                    List<Event> events = performanceGraphData.getEvents();
                    ArrayList arrayList2 = new ArrayList(k13.r(events, 10));
                    Iterator<T> it2 = events.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(f6a.K(context2, (Event) it2.next()));
                    }
                    linkedHashMap.put(num, l6g.W(arrayList2));
                }
                tee X = l6g.X(linkedHashMap);
                List<PerformanceGraphData> graphData3 = performanceGraphDataResponse.getGraphData();
                int c2 = sub.c(k13.r(graphData3, 10));
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(c2 >= 16 ? c2 : 16);
                for (PerformanceGraphData performanceGraphData2 : graphData3) {
                    linkedHashMap2.put(new Integer(performanceGraphData2.getWeek()), new l7g(performanceGraphData2.getTimeframeStart(), performanceGraphData2.getTimeframeEnd()));
                }
                return new xtj(W, X, l6g.X(linkedHashMap2), null, 16);
            }
        }
        fbiVar = new fbi(this, sq3Var);
        Object obj2 = fbiVar.s;
        lu3 lu3Var2 = lu3.a;
        i4 = fbiVar.u;
        if (i4 != 0) {
        }
        performanceGraphDataResponse = (PerformanceGraphDataResponse) yaa.x((x2g) obj2);
        if (performanceGraphDataResponse != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vtj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(int i, int i2, Context context, sq3 sq3Var) {
        gbi gbiVar;
        int i3;
        StandingsResponse standingsResponse;
        List<StandingsTable> standings;
        if (sq3Var instanceof gbi) {
            gbiVar = (gbi) sq3Var;
            int i4 = gbiVar.u;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                gbiVar.u = i4 - Integer.MIN_VALUE;
                Object obj = gbiVar.s;
                lu3 lu3Var = lu3.a;
                i3 = gbiVar.u;
                if (i3 != 0) {
                    y6a.M(obj);
                    rv8 rv8Var = rv8.b;
                    gbiVar.r = context;
                    gbiVar.u = 1;
                    obj = this.a.w(i, i2, gbiVar, U3.i.l);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    context = gbiVar.r;
                    y6a.M(obj);
                }
                standingsResponse = (StandingsResponse) obj;
                if (standingsResponse != null && (standings = standingsResponse.getStandings()) != null) {
                    if (standings.isEmpty()) {
                        standings = null;
                    }
                    if (standings != null) {
                        Collator collator = Collator.getInstance(Locale.getDefault());
                        String w = tba.w(((StandingsTable) CollectionsKt.Y(standings)).getTournament());
                        ArrayList arrayList = new ArrayList();
                        Iterator<T> it = standings.iterator();
                        while (it.hasNext()) {
                            List<StandingsTableRow> rows = ((StandingsTable) it.next()).getRows();
                            ArrayList arrayList2 = new ArrayList(k13.r(rows, 10));
                            Iterator<T> it2 = rows.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(((StandingsTableRow) it2.next()).getTeam());
                            }
                            o13.v(arrayList2, arrayList);
                        }
                        HashSet hashSet = new HashSet();
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            Object next = it3.next();
                            if (hashSet.add(new Integer(((Team) next).getId()))) {
                                arrayList3.add(next);
                            }
                        }
                        ArrayList arrayList4 = new ArrayList(k13.r(arrayList3, 10));
                        Iterator it4 = arrayList3.iterator();
                        while (it4.hasNext()) {
                            Team team = (Team) it4.next();
                            int id = team.getId();
                            String A = tba.A(context, team);
                            if (A == null) {
                                A = tba.p(context, team);
                            }
                            arrayList4.add(new huj(id, A));
                        }
                        collator.getClass();
                        return new iuj(CollectionsKt.H0(arrayList4, new y2f(collator, 2)), w);
                    }
                }
                return new iuj(km5.a, null);
            }
        }
        gbiVar = new gbi(this, sq3Var);
        Object obj2 = gbiVar.s;
        lu3 lu3Var2 = lu3.a;
        i3 = gbiVar.u;
        if (i3 != 0) {
        }
        standingsResponse = (StandingsResponse) obj2;
        if (standingsResponse != null) {
            if (standings.isEmpty()) {
            }
            if (standings != null) {
            }
        }
        return new iuj(km5.a, null);
    }

    @Override // defpackage.vtj
    public final utj getConfig() {
        return this.c;
    }

    @Override // defpackage.vtj
    public final String h(Context context) {
        String string = context.getString(R.string.standings_tracker_general);
        string.getClass();
        return string;
    }

    @Override // defpackage.vtj
    public final b7g i(Context context, auj aujVar, String str) {
        aujVar.getClass();
        String string = context.getString(R.string.week_number);
        string.getClass();
        long j = aujVar.e;
        long j2 = aujVar.f;
        if (j > 0 && j2 > 0) {
            bi4 bi4Var = bi4.PATTERN_DMY_SHORT;
            ConcurrentHashMap concurrentHashMap = hk4.a;
            string = lnb.o(string, " ", context.getString(R.string.date_span_braces_template, fc6.i(j, hk4.a(bi4Var.d())), fc6.i(j2, hk4.a(bi4Var.d()))));
        }
        return new a7g(string, aujVar.b, false);
    }
}
