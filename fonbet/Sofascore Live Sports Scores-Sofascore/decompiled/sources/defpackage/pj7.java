package defpackage;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.sofascore.model.Sports;
import com.sofascore.model.fantasy.FantasyPlayerPointsBreakdown;
import com.sofascore.model.fantasy.FantasyPlayerStatistic;
import com.sofascore.model.fantasy.FantasyPointsCalculatorItem;
import com.sofascore.model.mvvm.model.Description;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.StandingsBucket;
import com.sofascore.model.mvvm.model.StandingsTable;
import com.sofascore.model.mvvm.model.StandingsTableRow;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.Tournament;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.newNetwork.StandingsResponse;
import com.sofascore.model.newNetwork.TeamDetailsResponse;
import com.sofascore.results.R;
import com.sofascore.results.fantasy.ui.model.FantasyPlayerFixtureData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class pj7 extends hoi implements Function2 {
    public Object A;
    public Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ int r = 2;
    public boolean s;
    public int t;
    public Object u;
    public Object v;
    public Object w;
    public Object x;
    public Object y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pj7(Set set, tj7 tj7Var, Integer num, Integer num2, Map map, Context context, Map map2, String str, boolean z, rq3 rq3Var) {
        super(2, rq3Var);
        this.v = set;
        this.w = tj7Var;
        this.x = num;
        this.y = num2;
        this.z = map;
        this.B = context;
        this.A = map2;
        this.C = str;
        this.s = z;
    }

    private final Object e(Object obj) {
        Object u;
        ArrayList arrayList;
        int i;
        gv9 gv9Var;
        FantasyPlayerFixtureData fantasyPlayerFixtureData;
        List<FantasyPlayerStatistic> statistics;
        int intValue;
        FantasyPointsCalculatorItem fantasyPointsCalculatorItem;
        ku3 ku3Var = (ku3) this.u;
        lu3 lu3Var = lu3.a;
        int i2 = this.t;
        int i3 = 10;
        if (i2 == 0) {
            y6a.M(obj);
            Set set = (Set) this.v;
            tj7 tj7Var = (tj7) this.w;
            Integer num = (Integer) this.x;
            Integer num2 = (Integer) this.y;
            ArrayList arrayList2 = new ArrayList(k13.r(set, 10));
            Iterator it = set.iterator();
            while (it.hasNext()) {
                arrayList2.add(xw3.t(ku3Var, null, new f54(tj7Var, ((Number) it.next()).intValue(), num, num2, (rq3) null), 3));
            }
            this.u = null;
            this.t = 1;
            u = m6k.u(arrayList2, this);
            if (u == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i2 != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
            u = obj;
        }
        Iterable<Pair> iterable = (Iterable) u;
        iterable.getClass();
        xbb b = a.b();
        for (Pair pair : iterable) {
            Object obj2 = pair.a;
            if (obj2 != null) {
                b.add(new Pair(obj2, pair.b));
            }
        }
        xbb a = a.a(b);
        Map map = (Map) this.z;
        Context context = (Context) this.B;
        Map map2 = (Map) this.A;
        String str = (String) this.C;
        boolean z = this.s;
        ArrayList arrayList3 = new ArrayList(k13.r(a, 10));
        ListIterator listIterator = a.listIterator(0);
        while (true) {
            hc9 hc9Var = (hc9) listIterator;
            if (!hc9Var.hasNext()) {
                return CollectionsKt.H0(arrayList3, new se7(5));
            }
            Pair pair2 = (Pair) hc9Var.next();
            Event event = (Event) pair2.a;
            FantasyPlayerPointsBreakdown fantasyPlayerPointsBreakdown = (FantasyPlayerPointsBreakdown) pair2.b;
            if (fantasyPlayerPointsBreakdown == null || (statistics = fantasyPlayerPointsBreakdown.getStatistics()) == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(k13.r(statistics, i3));
                for (FantasyPlayerStatistic fantasyPlayerStatistic : statistics) {
                    String key = fantasyPlayerStatistic.getKey();
                    String value = fantasyPlayerStatistic.getValue();
                    if (map2 == null || (fantasyPointsCalculatorItem = (FantasyPointsCalculatorItem) map2.get(fantasyPlayerStatistic.getKey())) == null) {
                        Integer points = fantasyPlayerStatistic.getPoints();
                        intValue = points != null ? points.intValue() : 0;
                    } else {
                        intValue = fantasyPointsCalculatorItem.calculatePoints(fantasyPlayerStatistic, str);
                    }
                    arrayList.add(new ae7(key, value, intValue));
                }
            }
            if (arrayList != null) {
                Iterator it2 = arrayList.iterator();
                i = 0;
                while (it2.hasNext()) {
                    i += ((ae7) it2.next()).c;
                }
            } else {
                i = 0;
            }
            if (arrayList != null) {
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : arrayList) {
                    ae7 ae7Var = (ae7) obj3;
                    if (!z || ae7Var.c != 0 || Intrinsics.c(ae7Var.a, CampaignEx.JSON_KEY_STAR)) {
                        arrayList4.add(obj3);
                    }
                }
                gv9Var = l6g.W(arrayList4);
            } else {
                gv9Var = null;
            }
            arrayList3.add(new qx6(gz8.R(context, event, false), gv9Var, i, (map == null || (fantasyPlayerFixtureData = (FantasyPlayerFixtureData) me4.f(event.getId(), map)) == null) ? null : fantasyPlayerFixtureData.c));
            i3 = 10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x01c5, code lost:
    
        if (r0 == r4) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a5, code lost:
    
        if (r10 == r4) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0093, code lost:
    
        if (r5 == r4) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x01ce, code lost:
    
        if (((java.lang.Boolean) r0).booleanValue() != false) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0178  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object f(Object obj) {
        Object A;
        Team team;
        Object k;
        zu4 t;
        av4 av4Var;
        zu4 zu4Var;
        Team team2;
        Object T;
        zu4 zu4Var2;
        yzc yzcVar;
        Object T2;
        Team team3;
        boolean z;
        Object T3;
        rnc rncVar = (rnc) this.C;
        j0j j0jVar = rncVar.e;
        ku3 ku3Var = (ku3) this.u;
        lu3 lu3Var = lu3.a;
        boolean z2 = false;
        switch (this.t) {
            case 0:
                y6a.M(obj);
                hof hofVar = rncVar.i;
                this.u = ku3Var;
                this.t = 1;
                A = rd0.A(hofVar, this);
                break;
            case 1:
                y6a.M(obj);
                A = obj;
                team = (Team) A;
                int i = rncVar.f;
                this.u = ku3Var;
                this.v = team;
                this.t = 2;
                k = j0jVar.k(i, this);
                break;
            case 2:
                team = (Team) this.v;
                y6a.M(obj);
                k = obj;
                x2g x2gVar = (x2g) k;
                if ((x2gVar instanceof v2g) && rncVar.k && !rncVar.l) {
                    rncVar.k = false;
                    av4 t2 = xw3.t(ku3Var, null, new qnc(rncVar, null, 2), 3);
                    av4 t3 = xw3.t(ku3Var, null, new qnc(rncVar, null, 0), 3);
                    t = xw3.t(ku3Var, null, new qnc(rncVar, null, 1), 3);
                    Team team4 = ((TeamDetailsResponse) ((v2g) x2gVar).a).getTeam();
                    if (team != null && team.getUserCount() > team4.getUserCount()) {
                        team4 = Team.copy$default(team4, 0, null, null, team.getUserCount(), 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -9, 63, null);
                    }
                    this.u = null;
                    this.v = null;
                    this.w = t2;
                    this.x = t3;
                    this.y = t;
                    this.z = team4;
                    this.t = 3;
                    if (j0jVar.J(team4, this) != lu3Var) {
                        av4Var = t2;
                        zu4Var = t3;
                        team2 = team4;
                        yzc yzcVar2 = rncVar.g;
                        this.u = null;
                        this.v = null;
                        this.w = null;
                        this.x = zu4Var;
                        this.y = t;
                        this.z = null;
                        this.A = yzcVar2;
                        this.B = team2;
                        this.t = 4;
                        T = av4Var.T(this);
                        if (T != lu3Var) {
                            zu4Var2 = t;
                            yzcVar = yzcVar2;
                            boolean booleanValue = ((Boolean) T).booleanValue();
                            this.u = null;
                            this.v = null;
                            this.w = null;
                            this.x = null;
                            this.y = zu4Var2;
                            this.z = null;
                            this.A = yzcVar;
                            this.B = team2;
                            this.s = booleanValue;
                            this.t = 5;
                            T2 = zu4Var.T(this);
                            if (T2 != lu3Var) {
                                team3 = team2;
                                z = booleanValue;
                                if (!((Boolean) T2).booleanValue()) {
                                    this.u = null;
                                    this.v = null;
                                    this.w = null;
                                    this.x = null;
                                    this.y = null;
                                    this.z = null;
                                    this.A = yzcVar;
                                    this.B = team3;
                                    this.s = z;
                                    this.t = 6;
                                    T3 = zu4Var2.T(this);
                                    break;
                                }
                                z2 = true;
                                yzcVar.j(new aoc(team3, z, z2));
                                rncVar.l = true;
                                rncVar.k = true;
                            }
                        }
                    }
                    return lu3Var;
                }
                return Unit.a;
            case 3:
                team2 = (Team) this.z;
                t = (zu4) this.y;
                zu4Var = (zu4) this.x;
                av4Var = (av4) this.w;
                y6a.M(obj);
                yzc yzcVar22 = rncVar.g;
                this.u = null;
                this.v = null;
                this.w = null;
                this.x = zu4Var;
                this.y = t;
                this.z = null;
                this.A = yzcVar22;
                this.B = team2;
                this.t = 4;
                T = av4Var.T(this);
                if (T != lu3Var) {
                }
                return lu3Var;
            case 4:
                team2 = (Team) this.B;
                yzcVar = (yzc) this.A;
                zu4 zu4Var3 = (zu4) this.y;
                zu4 zu4Var4 = (zu4) this.x;
                y6a.M(obj);
                zu4Var2 = zu4Var3;
                zu4Var = zu4Var4;
                T = obj;
                boolean booleanValue2 = ((Boolean) T).booleanValue();
                this.u = null;
                this.v = null;
                this.w = null;
                this.x = null;
                this.y = zu4Var2;
                this.z = null;
                this.A = yzcVar;
                this.B = team2;
                this.s = booleanValue2;
                this.t = 5;
                T2 = zu4Var.T(this);
                if (T2 != lu3Var) {
                }
                return lu3Var;
            case 5:
                z = this.s;
                Team team5 = (Team) this.B;
                yzc yzcVar3 = (yzc) this.A;
                zu4 zu4Var5 = (zu4) this.y;
                y6a.M(obj);
                zu4Var2 = zu4Var5;
                team3 = team5;
                yzcVar = yzcVar3;
                T2 = obj;
                if (!((Boolean) T2).booleanValue()) {
                }
                z2 = true;
                yzcVar.j(new aoc(team3, z, z2));
                rncVar.l = true;
                rncVar.k = true;
                return Unit.a;
            case 6:
                z = this.s;
                Team team6 = (Team) this.B;
                yzc yzcVar4 = (yzc) this.A;
                y6a.M(obj);
                team3 = team6;
                yzcVar = yzcVar4;
                T3 = obj;
                break;
            default:
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.C;
        switch (i) {
            case 0:
                pj7 pj7Var = new pj7((Set) this.v, (tj7) this.w, (Integer) this.x, (Integer) this.y, (Map) this.z, (Context) this.B, (Map) this.A, (String) obj2, this.s, rq3Var);
                pj7Var.u = obj;
                return pj7Var;
            case 1:
                pj7 pj7Var2 = new pj7((rnc) obj2, rq3Var);
                pj7Var2.u = obj;
                return pj7Var2;
            default:
                return new pj7((StandingsResponse) this.z, (String) obj2, (rbi) this.A, (Integer) this.x, (Integer) this.y, this.s, (Integer) this.B, rq3Var);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((pj7) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x05bb, code lost:
    
        if (r6.d.invoke(kotlin.collections.CollectionsKt.a0(0, r28.getRows())) == null) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:660:0x02bf, code lost:
    
        if (r1 == false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0558, code lost:
    
        if (r5.d.invoke(kotlin.collections.CollectionsKt.a0(0, r28.getRows())) == null) goto L287;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0cfc  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0d05  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:536:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:542:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x0330 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:557:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:561:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:567:0x036f A[LOOP:17: B:565:0x0369->B:567:0x036f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:571:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:575:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:592:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:593:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:594:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:597:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:604:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:633:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:644:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:655:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:657:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:659:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:662:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:663:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:678:0x00f5  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ArrayList u;
        List<StandingsTable> standings;
        Iterator<T> it;
        boolean z;
        boolean z2;
        Integer num;
        Object obj2;
        List list;
        ArrayList arrayList;
        int i;
        boolean z3;
        Iterator it2;
        Iterator it3;
        Object r;
        List<StandingsTable> list2;
        boolean a;
        Set a0;
        StandingsTable standingsTable;
        Iterator<T> it4;
        Tournament tournament;
        UniqueTournament uniqueTournament;
        String str;
        Collection collection;
        bai baiVar;
        List list3;
        boolean z4;
        StandingsTableRow standingsTableRow;
        Description promotion;
        Integer num2;
        ArrayList arrayList2;
        int i2;
        int i3;
        rbi rbiVar;
        ArrayList arrayList3;
        bbi bbiVar;
        int i4;
        bbi bbiVar2;
        Description promotion2;
        String text;
        Integer valueOf;
        abi abiVar;
        Iterator it5;
        ArrayList arrayList4;
        List<StandingsTableRow> rows;
        Iterator it6;
        List<StandingsTableRow> rows2;
        ArrayList arrayList5;
        switch (this.r) {
            case 0:
                return e(obj);
            case 1:
                return f(obj);
            default:
                String str2 = (String) this.C;
                Integer num3 = (Integer) this.y;
                Integer num4 = (Integer) this.x;
                StandingsResponse standingsResponse = (StandingsResponse) this.z;
                rbi rbiVar2 = (rbi) this.A;
                lu3 lu3Var = lu3.a;
                int i5 = this.t;
                if (i5 != 0) {
                    if (i5 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ArrayList arrayList6 = (ArrayList) this.w;
                    List<StandingsTable> list4 = (List) this.v;
                    u = (ArrayList) this.u;
                    y6a.M(obj);
                    num = num3;
                    arrayList = arrayList6;
                    list2 = list4;
                    r = obj;
                    ArrayList arrayList7 = u;
                    Map map = (Map) r;
                    boolean z5 = this.s;
                    Integer num5 = (Integer) this.B;
                    int i6 = 0;
                    for (Object obj3 : arrayList) {
                        int i7 = i6 + 1;
                        if (i6 < 0) {
                            b.q();
                            throw null;
                        }
                        StandingsTable standingsTable2 = (StandingsTable) obj3;
                        ArrayList arrayList8 = new ArrayList();
                        ArrayList arrayList9 = new ArrayList();
                        ArrayList arrayList10 = new ArrayList();
                        List list5 = y9i.a;
                        str2.getClass();
                        t9i.f.getClass();
                        String str3 = Sports.BASKETBALL;
                        Iterable j = str2.equals(Sports.BASKETBALL) ? b.j(t9i.g, t9i.h, t9i.j, t9i.k, t9i.z, t9i.x, t9i.q, t9i.y, t9i.w) : str2.equals(Sports.ICE_HOCKEY) ? b.j(t9i.g, t9i.h, t9i.s, t9i.t, t9i.u, t9i.v, t9i.y) : t9i.B;
                        Integer num6 = num5;
                        ArrayList arrayList11 = new ArrayList();
                        for (Object obj4 : j) {
                            ArrayList arrayList12 = arrayList;
                            boolean z6 = z5;
                            t9i t9iVar = (t9i) obj4;
                            int i8 = i6;
                            if (t9iVar == t9i.k || t9iVar == t9i.l) {
                                arrayList5 = arrayList8;
                            } else {
                                Set set = y9i.b;
                                if (set.contains(str2)) {
                                    arrayList5 = arrayList8;
                                } else {
                                    arrayList5 = arrayList8;
                                    if (t9iVar != t9i.m) {
                                        if (t9iVar == t9i.n) {
                                        }
                                    }
                                }
                                if ((y9i.d.contains(str2) || t9iVar != t9i.q) && ((!y9i.e.contains(str2) || t9iVar != t9i.i) && ((y9i.f.contains(str2) || (t9iVar != t9i.o && t9iVar != t9i.p)) && ((!set.contains(str2) || str2.equals(Sports.VOLLEYBALL) || (t9iVar != t9i.p && t9iVar != t9i.n)) && ((!str2.equals(Sports.VOLLEYBALL) || (t9iVar != t9i.o && t9iVar != t9i.m)) && (str2.equals(Sports.ICE_HOCKEY) || !y9i.g.contains(t9iVar))))))) {
                                    arrayList11.add(obj4);
                                }
                            }
                            arrayList = arrayList12;
                            i6 = i8;
                            arrayList8 = arrayList5;
                            z5 = z6;
                        }
                        ArrayList arrayList13 = arrayList;
                        boolean z7 = z5;
                        int i9 = i6;
                        ArrayList arrayList14 = arrayList8;
                        ArrayList arrayList15 = new ArrayList();
                        Iterator it7 = arrayList11.iterator();
                        while (it7.hasNext()) {
                            Object next = it7.next();
                            t9i t9iVar2 = (t9i) next;
                            t9i t9iVar3 = t9i.x;
                            if (t9iVar2 != t9iVar3) {
                                it6 = it7;
                                break;
                            } else {
                                it6 = it7;
                            }
                            if (t9iVar2 == t9iVar3 && ((rows2 = standingsTable2.getRows()) == null || !rows2.isEmpty())) {
                                Iterator<T> it8 = rows2.iterator();
                                while (it8.hasNext()) {
                                    if (t9iVar2.d.invoke((StandingsTableRow) it8.next()) != null) {
                                        arrayList15.add(next);
                                    }
                                }
                            }
                            it7 = it6;
                        }
                        ArrayList a2 = y9i.a(str2);
                        ArrayList arrayList16 = new ArrayList();
                        Iterator it9 = a2.iterator();
                        while (it9.hasNext()) {
                            Object next2 = it9.next();
                            t9i t9iVar4 = (t9i) next2;
                            t9i t9iVar5 = t9i.x;
                            if (t9iVar4 != t9iVar5) {
                                it5 = it9;
                                arrayList4 = arrayList15;
                                break;
                            } else {
                                it5 = it9;
                                arrayList4 = arrayList15;
                            }
                            if (t9iVar4 == t9iVar5 && ((rows = standingsTable2.getRows()) == null || !rows.isEmpty())) {
                                Iterator<T> it10 = rows.iterator();
                                while (it10.hasNext()) {
                                    if (t9iVar4.d.invoke((StandingsTableRow) it10.next()) != null) {
                                        arrayList16.add(next2);
                                    }
                                }
                            }
                            it9 = it5;
                            arrayList15 = arrayList4;
                        }
                        ArrayList arrayList17 = arrayList15;
                        r9i r9iVar = rbiVar2.j;
                        boolean z8 = (r9iVar instanceof q9i) && ((q9i) r9iVar).a != rv8.b;
                        Iterator it11 = standingsTable2.getRows().iterator();
                        int i10 = 0;
                        boolean z9 = false;
                        while (it11.hasNext()) {
                            Object next3 = it11.next();
                            int i11 = i10 + 1;
                            if (i10 < 0) {
                                b.q();
                                throw null;
                            }
                            StandingsTableRow standingsTableRow2 = (StandingsTableRow) next3;
                            List<Description> descriptions = standingsTableRow2.getDescriptions();
                            Iterator it12 = it11;
                            ArrayList arrayList18 = arrayList16;
                            ArrayList arrayList19 = new ArrayList(k13.r(descriptions, 10));
                            Iterator it13 = descriptions.iterator();
                            while (it13.hasNext()) {
                                Description description = (Description) it13.next();
                                Iterator it14 = it13;
                                Description description2 = (Description) map.getOrDefault(new Integer(description.getId()), description);
                                arrayList19.add(tba.p(rbiVar2.i(), standingsTableRow2.getTeam()) + " - " + description2.getText());
                                it13 = it14;
                            }
                            arrayList9.addAll(arrayList19);
                            int id = standingsTableRow2.getTeam().getId();
                            if (num4 != null && id == num4.intValue()) {
                                abiVar = abi.a;
                                if (num == null) {
                                    abiVar = null;
                                }
                                if (abiVar == null) {
                                    abiVar = abi.c;
                                }
                            } else if (num != null && id == num.intValue()) {
                                abiVar = abi.b;
                                if (num4 == null) {
                                    abiVar = null;
                                }
                                if (abiVar == null) {
                                    abiVar = abi.c;
                                }
                            } else {
                                abiVar = abi.d;
                            }
                            abi abiVar2 = abiVar;
                            int id2 = standingsTable2.getId();
                            standingsTableRow2.setPosition(i11);
                            Unit unit = Unit.a;
                            String str4 = str3;
                            boolean z10 = z8;
                            ArrayList arrayList20 = arrayList10;
                            Map map2 = map;
                            ArrayList arrayList21 = arrayList9;
                            int i12 = i9;
                            ArrayList arrayList22 = arrayList14;
                            List<StandingsTable> list6 = list2;
                            Integer num7 = num4;
                            arrayList20.add(new bbi(id2, str2, standingsTableRow2, abiVar2, cai.c, arrayList17, arrayList18, z10, NotificationCompat.FLAG_LOCAL_ONLY));
                            if (standingsTableRow2.getLiveMatchWinnerCodeColumn() != null) {
                                z9 = true;
                            }
                            Description promotion3 = standingsTableRow2.getPromotion();
                            if (promotion3 != null) {
                                Description description3 = (Description) map2.getOrDefault(new Integer(promotion3.getId()), promotion3);
                                arrayList22.add(description3);
                                standingsTableRow2.setPromotion(description3);
                            }
                            arrayList14 = arrayList22;
                            map = map2;
                            z8 = z10;
                            arrayList10 = arrayList20;
                            i10 = i11;
                            it11 = it12;
                            num4 = num7;
                            list2 = list6;
                            arrayList16 = arrayList18;
                            arrayList9 = arrayList21;
                            i9 = i12;
                            str3 = str4;
                        }
                        Map map3 = map;
                        ArrayList arrayList23 = arrayList16;
                        ArrayList arrayList24 = arrayList9;
                        String str5 = str3;
                        Integer num8 = num4;
                        List<StandingsTable> list7 = list2;
                        int i13 = i9;
                        ArrayList arrayList25 = arrayList14;
                        int i14 = 1;
                        boolean z11 = z8;
                        ArrayList arrayList26 = arrayList10;
                        int id3 = standingsTable2.getTournament().getId();
                        Season season = standingsTable2.getTournament().getSeason();
                        Integer num9 = season != null ? new Integer(season.getId()) : null;
                        Object computeIfAbsent = rbiVar2.k.computeIfAbsent(id3 + "_" + num9 + "_" + standingsTable2.getName(), new ux3(new s80(arrayList25, 5), 4));
                        computeIfAbsent.getClass();
                        Map map4 = (Map) computeIfAbsent;
                        ArrayList arrayList27 = new ArrayList();
                        Iterator it15 = arrayList26.iterator();
                        while (it15.hasNext()) {
                            bbi bbiVar3 = (bbi) it15.next();
                            Description promotion4 = bbiVar3.c.getPromotion();
                            if (promotion4 != null) {
                                Integer num10 = (Integer) me4.f(promotion4.getId(), map4);
                                bbiVar3.j = num10 != null ? num10.intValue() : -1;
                                if (num10 != null) {
                                    switch (num10.intValue()) {
                                        case 1:
                                            valueOf = Integer.valueOf(R.color.prom_to_x);
                                            break;
                                        case 2:
                                            valueOf = Integer.valueOf(R.color.playoff_for_prom_to_x);
                                            break;
                                        case 3:
                                            valueOf = Integer.valueOf(R.color.prom_to_y);
                                            break;
                                        case 4:
                                            valueOf = Integer.valueOf(R.color.playoff_for_prom_to_y);
                                            break;
                                        case 5:
                                            valueOf = Integer.valueOf(R.color.other_prom_1);
                                            break;
                                        case 6:
                                            valueOf = Integer.valueOf(R.color.other_prom_2);
                                            break;
                                        case 7:
                                            valueOf = Integer.valueOf(R.color.other_prom_3);
                                            break;
                                        case 8:
                                            valueOf = Integer.valueOf(R.color.po_for_releg);
                                            break;
                                        case 9:
                                            valueOf = Integer.valueOf(R.color.releg);
                                            break;
                                        default:
                                            valueOf = null;
                                            break;
                                    }
                                    if (valueOf != null) {
                                        arrayList27.add(new fai(valueOf.intValue(), promotion4.getText()));
                                    }
                                }
                                Unit unit2 = Unit.a;
                            }
                        }
                        ArrayList arrayList28 = new ArrayList();
                        Iterator it16 = arrayList26.iterator();
                        int i15 = 0;
                        while (it16.hasNext()) {
                            Object next4 = it16.next();
                            int i16 = i15 + 1;
                            if (i15 < 0) {
                                b.q();
                                throw null;
                            }
                            bbi bbiVar4 = (bbi) next4;
                            bbi bbiVar5 = (bbi) CollectionsKt.a0(i15 - 1, arrayList26);
                            bbi bbiVar6 = (bbi) CollectionsKt.a0(i16, arrayList26);
                            if (((bbiVar5 == null || bbiVar5.j == bbiVar4.j) && (i15 != 0 || bbiVar4.c.getPromotion() == null)) || z11 || i15 == 0 || (promotion2 = bbiVar4.c.getPromotion()) == null || (text = promotion2.getText()) == null) {
                                num2 = num6;
                                arrayList2 = arrayList27;
                                i2 = i16;
                                i3 = i14;
                                rbiVar = rbiVar2;
                                arrayList3 = arrayList26;
                                bbiVar = bbiVar4;
                                i4 = i15;
                                bbiVar2 = bbiVar6;
                            } else {
                                int id4 = standingsTable2.getId();
                                String str6 = str2;
                                cai caiVar = cai.c;
                                i2 = i16;
                                km5 km5Var = km5.a;
                                i3 = i14;
                                i4 = i15;
                                rbiVar = rbiVar2;
                                arrayList3 = arrayList26;
                                bbiVar = bbiVar4;
                                bbiVar2 = bbiVar6;
                                num2 = num6;
                                arrayList2 = arrayList27;
                                wai waiVar = new wai(id4, caiVar, km5Var, km5Var, num2, text, new Integer(bbiVar4.j), z11, str6);
                                str2 = str6;
                                arrayList28.add(waiVar);
                            }
                            if ((bbiVar2 == null || bbiVar2.j == bbiVar.j) && (i4 != arrayList3.size() - 1 || bbiVar.c.getPromotion() == null)) {
                                arrayList28.add(bbiVar);
                            } else {
                                bbi a3 = bbi.a(bbiVar, !z11, 255);
                                a3.j = bbiVar.j;
                                a3.k = bbiVar.k;
                                arrayList28.add(a3);
                            }
                            arrayList27 = arrayList2;
                            num6 = num2;
                            i15 = i2;
                            i14 = i3;
                            rbiVar2 = rbiVar;
                            arrayList26 = arrayList3;
                        }
                        Integer num11 = num6;
                        ArrayList arrayList29 = arrayList27;
                        int i17 = i14;
                        rbi rbiVar3 = rbiVar2;
                        ArrayList arrayList30 = arrayList26;
                        q9k x = wba.x(standingsTable2.getTournament().getGroupName(), false);
                        if (x == null || (str = x.b(rbiVar3.i())) == null) {
                            Set set2 = f5k.a;
                            Context i18 = rbiVar3.i();
                            String name = standingsTable2.getName();
                            name.getClass();
                            switch (name.hashCode()) {
                                case -2142354173:
                                    if (name.equals("Southeast Division")) {
                                        str = i18.getString(R.string.nba_southeast_division);
                                        str.getClass();
                                        break;
                                    }
                                    str = name;
                                    break;
                                case -1999716206:
                                    if (name.equals("National League Central")) {
                                        str = i18.getString(R.string.baseball_national_league_central);
                                        str.getClass();
                                        break;
                                    }
                                    str = name;
                                    break;
                                case -1937688342:
                                    if (name.equals("Western Conference")) {
                                        str = i18.getString(R.string.any_sport_western_conference);
                                        str.getClass();
                                        break;
                                    }
                                    str = name;
                                    break;
                                case -1863633042:
                                    if (name.equals("American League East")) {
                                        str = i18.getString(R.string.baseball_am_league_east);
                                        str.getClass();
                                        break;
                                    }
                                    str = name;
                                    break;
                                case -1863092960:
                                    if (name.equals("American League West")) {
                                        str = i18.getString(R.string.baseball_am_league_west);
                                        str.getClass();
                                        break;
                                    }
                                    str = name;
                                    break;
                                case -1849140846:
                                    if (name.equals("NFC East")) {
                                        str = i18.getString(R.string.nfl_division_nfc_east);
                                        str.getClass();
                                        break;
                                    }
                                    str = name;
                                    break;
                                case -1848600764:
                                    if (name.equals("NFC West")) {
                                        str = i18.getString(R.string.nfl_division_nfc_west);
                                        str.getClass();
                                        break;
                                    }
                                    str = name;
                                    break;
                                case -1483952640:
                                    if (name.equals("National League East")) {
                                        str = i18.getString(R.string.baseball_national_league_east);
                                        str.getClass();
                                        break;
                                    }
                                    str = name;
                                    break;
                                case -1483412558:
                                    if (name.equals("National League West")) {
                                        str = i18.getString(R.string.baseball_national_league_west);
                                        str.getClass();
                                        break;
                                    }
                                    str = name;
                                    break;
                                case -1480063472:
                                    if (name.equals("NFC North")) {
                                        str = i18.getString(R.string.nfl_division_nfc_north);
                                        str.getClass();
                                        break;
                                    }
                                    str = name;
                                    break;
                                case -1475442984:
                                    if (name.equals("NFC South")) {
                                        str = i18.getString(R.string.nfl_division_nfc_south);
                                        str.getClass();
                                        break;
                                    }
                                    str = name;
                                    break;
                                case -587641763:
                                    if (name.equals("National League")) {
                                        str = i18.getString(R.string.baseball_national_league);
                                        str.getClass();
                                        break;
                                    }
                                    str = name;
                                    break;
                                case -390313127:
                                    if (name.equals("Northwest Division")) {
                                        str = i18.getString(R.string.nba_northwest_division);
                                        str.getClass();
                                        break;
                                    }
                                    str = name;
                                    break;
                                case -212032348:
                                    if (name.equals("Pacific Division")) {
                                        str = i18.getString(R.string.nba_pacific_division);
                                        str.getClass();
                                        break;
                                    }
                                    str = name;
                                    break;
                                case -114714524:
                                    if (name.equals("American League Central")) {
                                        str = i18.getString(R.string.baseball_am_league_central);
                                        str.getClass();
                                        break;
                                    }
                                    str = name;
                                    break;
                                case 64702:
                                    if (name.equals("AFC")) {
                                        str = i18.getString(R.string.nfl_conference_afc);
                                        str.getClass();
                                        break;
                                    }
                                    str = name;
                                    break;
                                case 77195:
                                    if (name.equals("NFC")) {
                                        str = i18.getString(R.string.nfl_conference_nfc);
                                        str.getClass();
                                        break;
                                    }
                                    str = name;
                                    break;
                                case 34215471:
                                    if (name.equals("American League")) {
                                        str = i18.getString(R.string.baseball_american_league);
                                        str.getClass();
                                        break;
                                    }
                                    str = name;
                                    break;
                                case 542008067:
                                    if (name.equals("AFC North")) {
                                        str = i18.getString(R.string.nfl_division_afc_north);
                                        str.getClass();
                                        break;
                                    }
                                    str = name;
                                    break;
                                case 546628555:
                                    if (name.equals("AFC South")) {
                                        str = i18.getString(R.string.nfl_division_afc_south);
                                        str.getClass();
                                        break;
                                    }
                                    str = name;
                                    break;
                                case 642654008:
                                    if (name.equals("Central Division")) {
                                        str = i18.getString(R.string.nba_central_division);
                                        str.getClass();
                                        break;
                                    }
                                    str = name;
                                    break;
                                case 1264128575:
                                    if (name.equals("AFC East")) {
                                        str = i18.getString(R.string.nfl_division_afc_east);
                                        str.getClass();
                                        break;
                                    }
                                    str = name;
                                    break;
                                case 1264668657:
                                    if (name.equals("AFC West")) {
                                        str = i18.getString(R.string.nfl_division_afc_west);
                                        str.getClass();
                                        break;
                                    }
                                    str = name;
                                    break;
                                case 1408851845:
                                    if (name.equals("Atlantic Division")) {
                                        str = i18.getString(R.string.nba_atlantic_division);
                                        str.getClass();
                                        break;
                                    }
                                    str = name;
                                    break;
                                case 1682657169:
                                    if (name.equals("Southwest Division")) {
                                        str = i18.getString(R.string.nba_southwest_division);
                                        str.getClass();
                                        break;
                                    }
                                    str = name;
                                    break;
                                case 2006440632:
                                    if (name.equals("Eastern Conference")) {
                                        str = i18.getString(R.string.any_sport_eastern_conference);
                                        str.getClass();
                                        break;
                                    }
                                    str = name;
                                    break;
                                default:
                                    str = name;
                                    break;
                            }
                        }
                        boolean z12 = z9;
                        arrayList7.add(new ebi(standingsTable2.getId(), standingsTable2.getTournament(), str, z9, list7.size() > i17, z7));
                        int id5 = standingsTable2.getId();
                        String str7 = str2;
                        cai caiVar2 = cai.c;
                        ArrayList arrayList31 = arrayList17;
                        ArrayList arrayList32 = arrayList23;
                        bbi bbiVar7 = (bbi) CollectionsKt.firstOrNull(arrayList30);
                        String text2 = (bbiVar7 == null || (standingsTableRow = bbiVar7.c) == null || (promotion = standingsTableRow.getPromotion()) == null) ? null : promotion.getText();
                        bbi bbiVar8 = (bbi) CollectionsKt.firstOrNull(arrayList30);
                        wai waiVar2 = new wai(id5, caiVar2, arrayList31, arrayList32, num11, text2, bbiVar8 != null ? new Integer(bbiVar8.j) : null, z11, str7);
                        str2 = str7;
                        arrayList7.add(waiVar2);
                        arrayList7.addAll(arrayList28);
                        List<Description> descriptions2 = standingsTable2.getDescriptions();
                        ArrayList arrayList33 = new ArrayList(k13.r(descriptions2, 10));
                        for (Description description4 : descriptions2) {
                            arrayList33.add(((Description) map3.getOrDefault(new Integer(description4.getId()), description4)).getText());
                        }
                        arrayList24.addAll(arrayList33);
                        Description tieBreakingRule = standingsTable2.getTieBreakingRule();
                        if (tieBreakingRule != null) {
                            arrayList24.add(((Description) map3.getOrDefault(new Integer(tieBreakingRule.getId()), tieBreakingRule)).getText());
                        }
                        HashSet hashSet = new HashSet();
                        ArrayList arrayList34 = arrayList24;
                        ArrayList arrayList35 = new ArrayList();
                        Iterator it17 = arrayList29.iterator();
                        while (it17.hasNext()) {
                            Object next5 = it17.next();
                            if (hashSet.add(new Integer(((fai) next5).a))) {
                                arrayList35.add(next5);
                            }
                        }
                        fai faiVar = (fai) CollectionsKt.j0(arrayList35);
                        if (faiVar != null) {
                            faiVar.c = arrayList34.isEmpty();
                            Unit unit3 = Unit.a;
                        }
                        int ordinal = d7a.z(rbiVar3.i(), str2).ordinal();
                        if (ordinal == 0) {
                            collection = arrayList32;
                        } else if (ordinal == 1) {
                            collection = arrayList31;
                        } else {
                            if (ordinal != 2) {
                                zzl.b();
                                return null;
                            }
                            collection = km5.a;
                        }
                        boolean isEmpty = collection.isEmpty();
                        Long updatedAtTimestamp = standingsTable2.getUpdatedAtTimestamp();
                        if (updatedAtTimestamp != null) {
                            bai baiVar2 = new bai(updatedAtTimestamp.longValue(), z12, arrayList34.isEmpty() && arrayList35.isEmpty() && isEmpty);
                            arrayList7.add(baiVar2);
                            baiVar = baiVar2;
                        } else {
                            baiVar = null;
                        }
                        if (arrayList34.isEmpty() && arrayList35.isEmpty() && isEmpty) {
                            z4 = true;
                        } else {
                            int id6 = standingsTable2.getId();
                            if (str2.equals(str5)) {
                                t9i t9iVar6 = t9i.w;
                                if (arrayList31.contains(t9iVar6)) {
                                    list3 = a.c(t9iVar6);
                                    z4 = true;
                                    x9i x9iVar = new x9i(id6, str2, arrayList34, arrayList35, arrayList32, arrayList31, list3, d7a.z(rbiVar3.i(), str2), i13 != arrayList13.size() + (-1));
                                    arrayList34 = arrayList34;
                                    arrayList7.add(x9iVar);
                                }
                            }
                            list3 = km5.a;
                            z4 = true;
                            x9i x9iVar2 = new x9i(id6, str2, arrayList34, arrayList35, arrayList32, arrayList31, list3, d7a.z(rbiVar3.i(), str2), i13 != arrayList13.size() + (-1));
                            arrayList34 = arrayList34;
                            arrayList7.add(x9iVar2);
                        }
                        bbi bbiVar9 = (bbi) CollectionsKt.j0(arrayList30);
                        if (bbiVar9 != null) {
                            bbiVar9.k = (baiVar == null && arrayList34.isEmpty() && arrayList35.isEmpty() && isEmpty) ? z4 : false;
                            Unit unit4 = Unit.a;
                        }
                        map = map3;
                        num5 = num11;
                        z5 = z7;
                        i6 = i7;
                        num4 = num8;
                        list2 = list7;
                        rbiVar2 = rbiVar3;
                        arrayList = arrayList13;
                    }
                    return arrayList7;
                }
                u = fc6.u(obj);
                List<StandingsTable> standings2 = standingsResponse.getStandings();
                if (standings2.size() <= 1 || (num4 == null && num3 == null)) {
                    standings2 = null;
                }
                if (standings2 != null) {
                    ArrayList arrayList36 = new ArrayList();
                    for (Object obj5 : standings2) {
                        List<StandingsTableRow> rows3 = ((StandingsTable) obj5).getRows();
                        if (rows3 == null || !rows3.isEmpty()) {
                            for (StandingsTableRow standingsTableRow3 : rows3) {
                                int id7 = standingsTableRow3.getTeam().getId();
                                if (num4 == null || id7 != num4.intValue()) {
                                    int id8 = standingsTableRow3.getTeam().getId();
                                    if (num3 != null && id8 == num3.intValue()) {
                                    }
                                }
                                arrayList36.add(obj5);
                            }
                        }
                    }
                    if (arrayList36.isEmpty()) {
                        arrayList36 = null;
                    }
                    if (arrayList36 != null) {
                        standings = arrayList36;
                        ArrayList arrayList37 = new ArrayList();
                        it = standings.iterator();
                        while (it.hasNext()) {
                            StandingsBucket bucket = ((StandingsTable) it.next()).getBucket();
                            if (bucket != null) {
                                arrayList37.add(bucket);
                            }
                        }
                        List S0 = CollectionsKt.S0(CollectionsKt.V0(arrayList37));
                        z = S0.size() <= 1;
                        if (!z && Intrinsics.c(str2, Sports.AMERICAN_FOOTBALL)) {
                            a0 = ph0.a0(new Integer[]{new Integer(9464), new Integer(9465)});
                            standingsTable = (StandingsTable) CollectionsKt.firstOrNull(standings);
                            if (CollectionsKt.R(a0, (standingsTable != null || (tournament = standingsTable.getTournament()) == null || (uniqueTournament = tournament.getUniqueTournament()) == null) ? null : new Integer(uniqueTournament.getId())) && !standings.isEmpty()) {
                                it4 = standings.iterator();
                                while (it4.hasNext()) {
                                    String lowerCase = ((StandingsTable) it4.next()).getName().toLowerCase(Locale.ROOT);
                                    lowerCase.getClass();
                                    if (new Regex("afc|nfc|american|national").a(lowerCase)) {
                                        z2 = true;
                                        if (standingsResponse.getHasHomeAwayStandings()) {
                                            List list8 = rv8.f;
                                            r9i r9iVar2 = rbiVar2.j;
                                            q9i q9iVar = r9iVar2 instanceof q9i ? (q9i) r9iVar2 : null;
                                            Object obj6 = q9iVar != null ? q9iVar.a : null;
                                            if (obj6 == null || !list8.contains(obj6)) {
                                                rv8 rv8Var = (rv8) CollectionsKt.firstOrNull(list8);
                                                if (rv8Var == null) {
                                                    rv8Var = rv8.b;
                                                }
                                                rbiVar2.j = new q9i(rv8Var);
                                            }
                                            num = num3;
                                            list = list8;
                                        } else if (z) {
                                            kp5 kp5Var = t52.h;
                                            ArrayList arrayList38 = new ArrayList();
                                            for (Object obj7 : kp5Var) {
                                                if (S0.contains(((t52) obj7).b)) {
                                                    arrayList38.add(obj7);
                                                }
                                            }
                                            r9i r9iVar3 = rbiVar2.j;
                                            p9i p9iVar = r9iVar3 instanceof p9i ? (p9i) r9iVar3 : null;
                                            Object obj8 = p9iVar != null ? p9iVar.a : null;
                                            if (obj8 == null || !arrayList38.contains(obj8)) {
                                                rbiVar2.j = new p9i((t52) CollectionsKt.Y(arrayList38));
                                            }
                                            num = num3;
                                            list = arrayList38;
                                        } else if (z2) {
                                            xbb b = a.b();
                                            if (!standings.isEmpty()) {
                                                Iterator<T> it18 = standings.iterator();
                                                while (it18.hasNext()) {
                                                    String lowerCase2 = ((StandingsTable) it18.next()).getName().toLowerCase(Locale.ROOT);
                                                    lowerCase2.getClass();
                                                    num = num3;
                                                    if (new Regex("afc|american").a(lowerCase2)) {
                                                        b.add(ip.c);
                                                        if (!standings.isEmpty()) {
                                                            Iterator<T> it19 = standings.iterator();
                                                            while (true) {
                                                                if (it19.hasNext()) {
                                                                    String lowerCase3 = ((StandingsTable) it19.next()).getName().toLowerCase(Locale.ROOT);
                                                                    lowerCase3.getClass();
                                                                    if (new Regex("nfc|national").a(lowerCase3)) {
                                                                        b.add(ip.d);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        if (!standings.isEmpty()) {
                                                            Iterator<T> it20 = standings.iterator();
                                                            while (true) {
                                                                if (it20.hasNext()) {
                                                                    String lowerCase4 = ((StandingsTable) it20.next()).getName().toLowerCase(Locale.ROOT);
                                                                    lowerCase4.getClass();
                                                                    if (!new Regex("afc|nfc|american|national").a(lowerCase4)) {
                                                                        b.add(ip.e);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        xbb a4 = a.a(b);
                                                        r9i r9iVar4 = rbiVar2.j;
                                                        o9i o9iVar = !(r9iVar4 instanceof o9i) ? (o9i) r9iVar4 : null;
                                                        obj2 = o9iVar == null ? o9iVar.a : null;
                                                        if (obj2 != null) {
                                                            boolean contains = a4.contains(obj2);
                                                            list = a4;
                                                            break;
                                                        }
                                                        rbiVar2.j = new o9i((ip) CollectionsKt.Y(a4));
                                                        list = a4;
                                                    } else {
                                                        num3 = num;
                                                    }
                                                }
                                            }
                                            num = num3;
                                            if (!standings.isEmpty()) {
                                            }
                                            if (!standings.isEmpty()) {
                                            }
                                            xbb a42 = a.a(b);
                                            r9i r9iVar42 = rbiVar2.j;
                                            if (!(r9iVar42 instanceof o9i)) {
                                            }
                                            if (o9iVar == null) {
                                            }
                                            if (obj2 != null) {
                                            }
                                            rbiVar2.j = new o9i((ip) CollectionsKt.Y(a42));
                                            list = a42;
                                        } else {
                                            num = num3;
                                            List list9 = km5.a;
                                            rbiVar2.j = new q9i(rv8.b);
                                            list = list9;
                                        }
                                        arrayList = new ArrayList();
                                        for (Object obj9 : standings) {
                                            StandingsTable standingsTable3 = (StandingsTable) obj9;
                                            r9i r9iVar5 = rbiVar2.j;
                                            StandingsResponse standingsResponse2 = standingsResponse;
                                            if (r9iVar5 instanceof p9i) {
                                                if (standingsTable3.getBucket() != ((p9i) r9iVar5).a.b) {
                                                    a = false;
                                                    if (!a) {
                                                        arrayList.add(obj9);
                                                    }
                                                    standingsResponse = standingsResponse2;
                                                }
                                                a = true;
                                                if (!a) {
                                                }
                                                standingsResponse = standingsResponse2;
                                            } else if (r9iVar5 instanceof o9i) {
                                                Regex regex = ((o9i) r9iVar5).a.b;
                                                String lowerCase5 = standingsTable3.getName().toLowerCase(Locale.ROOT);
                                                lowerCase5.getClass();
                                                a = regex.a(lowerCase5);
                                                if (!a) {
                                                }
                                                standingsResponse = standingsResponse2;
                                            } else {
                                                if (!(r9iVar5 instanceof q9i)) {
                                                    zzl.b();
                                                    return null;
                                                }
                                                a = true;
                                                if (!a) {
                                                }
                                                standingsResponse = standingsResponse2;
                                            }
                                        }
                                        boolean hasHomeAwayStandings = standingsResponse.getHasHomeAwayStandings();
                                        if (z2) {
                                            i = 1;
                                            if (list.size() > 1) {
                                                z3 = true;
                                                boolean z13 = !z && list.size() > i;
                                                ArrayList arrayList39 = new ArrayList(k13.r(list, 10));
                                                it2 = list.iterator();
                                                while (it2.hasNext()) {
                                                    arrayList39.add(((tsi) it2.next()).d());
                                                }
                                                u.add(new tai(hasHomeAwayStandings, z3, z13, arrayList39, rbiVar2.k().d(), standings.size() <= 1));
                                                LinkedHashSet linkedHashSet = new LinkedHashSet();
                                                it3 = arrayList.iterator();
                                                while (it3.hasNext()) {
                                                    StandingsTable standingsTable4 = (StandingsTable) it3.next();
                                                    linkedHashSet.addAll(standingsTable4.getDescriptions());
                                                    Description tieBreakingRule2 = standingsTable4.getTieBreakingRule();
                                                    if (tieBreakingRule2 != null) {
                                                        linkedHashSet.add(tieBreakingRule2);
                                                    }
                                                    for (StandingsTableRow standingsTableRow4 : standingsTable4.getRows()) {
                                                        linkedHashSet.addAll(standingsTableRow4.getDescriptions());
                                                        Description promotion5 = standingsTableRow4.getPromotion();
                                                        if (promotion5 != null) {
                                                            linkedHashSet.add(promotion5);
                                                        }
                                                    }
                                                }
                                                this.u = u;
                                                this.v = standings;
                                                this.w = arrayList;
                                                this.t = 1;
                                                r = s9a.r(new h4i(linkedHashSet, rbiVar2, (rq3) null, 7), this);
                                                if (r != lu3Var) {
                                                    return lu3Var;
                                                }
                                                list2 = standings;
                                                ArrayList arrayList72 = u;
                                                Map map5 = (Map) r;
                                                boolean z52 = this.s;
                                                Integer num52 = (Integer) this.B;
                                                int i62 = 0;
                                                while (r18.hasNext()) {
                                                }
                                                return arrayList72;
                                            }
                                        } else {
                                            i = 1;
                                        }
                                        z3 = false;
                                        if (z) {
                                        }
                                        ArrayList arrayList392 = new ArrayList(k13.r(list, 10));
                                        it2 = list.iterator();
                                        while (it2.hasNext()) {
                                        }
                                        u.add(new tai(hasHomeAwayStandings, z3, z13, arrayList392, rbiVar2.k().d(), standings.size() <= 1));
                                        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                                        it3 = arrayList.iterator();
                                        while (it3.hasNext()) {
                                        }
                                        this.u = u;
                                        this.v = standings;
                                        this.w = arrayList;
                                        this.t = 1;
                                        r = s9a.r(new h4i(linkedHashSet2, rbiVar2, (rq3) null, 7), this);
                                        if (r != lu3Var) {
                                        }
                                    }
                                }
                            }
                        }
                        z2 = false;
                        if (standingsResponse.getHasHomeAwayStandings()) {
                        }
                        arrayList = new ArrayList();
                        while (r7.hasNext()) {
                        }
                        boolean hasHomeAwayStandings2 = standingsResponse.getHasHomeAwayStandings();
                        if (z2) {
                        }
                        z3 = false;
                        if (z) {
                        }
                        ArrayList arrayList3922 = new ArrayList(k13.r(list, 10));
                        it2 = list.iterator();
                        while (it2.hasNext()) {
                        }
                        u.add(new tai(hasHomeAwayStandings2, z3, z13, arrayList3922, rbiVar2.k().d(), standings.size() <= 1));
                        LinkedHashSet linkedHashSet22 = new LinkedHashSet();
                        it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                        }
                        this.u = u;
                        this.v = standings;
                        this.w = arrayList;
                        this.t = 1;
                        r = s9a.r(new h4i(linkedHashSet22, rbiVar2, (rq3) null, 7), this);
                        if (r != lu3Var) {
                        }
                    }
                }
                standings = standingsResponse.getStandings();
                ArrayList arrayList372 = new ArrayList();
                it = standings.iterator();
                while (it.hasNext()) {
                }
                List S02 = CollectionsKt.S0(CollectionsKt.V0(arrayList372));
                if (S02.size() <= 1) {
                }
                if (!z) {
                    a0 = ph0.a0(new Integer[]{new Integer(9464), new Integer(9465)});
                    standingsTable = (StandingsTable) CollectionsKt.firstOrNull(standings);
                    if (CollectionsKt.R(a0, (standingsTable != null || (tournament = standingsTable.getTournament()) == null || (uniqueTournament = tournament.getUniqueTournament()) == null) ? null : new Integer(uniqueTournament.getId()))) {
                        it4 = standings.iterator();
                        while (it4.hasNext()) {
                        }
                    }
                }
                z2 = false;
                if (standingsResponse.getHasHomeAwayStandings()) {
                }
                arrayList = new ArrayList();
                while (r7.hasNext()) {
                }
                boolean hasHomeAwayStandings22 = standingsResponse.getHasHomeAwayStandings();
                if (z2) {
                }
                z3 = false;
                if (z) {
                }
                ArrayList arrayList39222 = new ArrayList(k13.r(list, 10));
                it2 = list.iterator();
                while (it2.hasNext()) {
                }
                u.add(new tai(hasHomeAwayStandings22, z3, z13, arrayList39222, rbiVar2.k().d(), standings.size() <= 1));
                LinkedHashSet linkedHashSet222 = new LinkedHashSet();
                it3 = arrayList.iterator();
                while (it3.hasNext()) {
                }
                this.u = u;
                this.v = standings;
                this.w = arrayList;
                this.t = 1;
                r = s9a.r(new h4i(linkedHashSet222, rbiVar2, (rq3) null, 7), this);
                if (r != lu3Var) {
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pj7(StandingsResponse standingsResponse, String str, rbi rbiVar, Integer num, Integer num2, boolean z, Integer num3, rq3 rq3Var) {
        super(2, rq3Var);
        this.z = standingsResponse;
        this.C = str;
        this.A = rbiVar;
        this.x = num;
        this.y = num2;
        this.s = z;
        this.B = num3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pj7(rnc rncVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.C = rncVar;
    }
}
