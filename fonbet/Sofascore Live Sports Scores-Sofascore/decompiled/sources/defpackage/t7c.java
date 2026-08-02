package defpackage;

import android.content.Context;
import com.sofascore.model.Sports;
import com.sofascore.model.database.MediaReactionType;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Incident;
import com.sofascore.model.mvvm.model.Lineups;
import com.sofascore.model.mvvm.model.PlayerData;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.network.response.EventStatisticsGroup;
import com.sofascore.model.network.response.EventStatisticsItem;
import com.sofascore.model.network.response.EventStatisticsPeriod;
import com.sofascore.model.network.response.EventStatisticsResponse;
import com.sofascore.model.network.response.FootballPlayerEventStatistics;
import com.sofascore.model.network.response.LineupsResponse;
import com.sofascore.model.newNetwork.EventGraphData;
import com.sofascore.model.newNetwork.EventGraphResponse;
import com.sofascore.model.newNetwork.EventIncidentsResponse;
import com.sofascore.model.newNetwork.mediaposts.MediaPost;
import com.sofascore.results.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class t7c extends hoi implements Function2 {
    public String A;
    public String B;
    public bx7 C;
    public iy7 D;
    public gv9 E;
    public int F;
    public long G;
    public int H;
    public /* synthetic */ Object I;
    public final /* synthetic */ MediaPost J;
    public final /* synthetic */ ku3 K;
    public final /* synthetic */ u8c L;
    public String r;
    public zu4 s;
    public zu4 t;
    public zu4 u;
    public EventGraphResponse v;
    public List w;
    public String x;
    public String y;
    public List z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7c(rq3 rq3Var, ku3 ku3Var, u8c u8cVar, MediaPost mediaPost) {
        super(2, rq3Var);
        this.J = mediaPost;
        this.K = ku3Var;
        this.L = u8cVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        t7c t7cVar = new t7c(rq3Var, this.K, this.L, this.J);
        t7cVar.I = obj;
        return t7cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((t7c) create((Event) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0708  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x071b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x071e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x088a  */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0730  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0814  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0875  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0705  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x07f0  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:228:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x07f6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x062e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x06e9  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0703  */
    /* JADX WARN: Type inference failed for: r11v61, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11, types: [gv9] */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.util.List] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String slug;
        MediaPost mediaPost;
        Object obj2;
        zu4 p;
        Object w;
        zu4 zu4Var;
        zu4 zu4Var2;
        String str;
        Object T;
        zu4 zu4Var3;
        EventGraphResponse eventGraphResponse;
        EventIncidentsResponse eventIncidentsResponse;
        List<Incident> list;
        List<String> tags;
        zu4 zu4Var4;
        lu3 lu3Var;
        Object obj3;
        Pair pair;
        String str2;
        Object T2;
        lu3 lu3Var2;
        zu4 zu4Var5;
        String str3;
        String str4;
        EventStatisticsResponse eventStatisticsResponse;
        Context context;
        Object obj4;
        Object obj5;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str5;
        LineupsResponse lineupsResponse;
        String str6;
        zu4 zu4Var6;
        String str7;
        List<Incident> list2;
        Object T3;
        EventGraphResponse eventGraphResponse2;
        ArrayList arrayList3;
        List<EventStatisticsPeriod> statistics;
        EventStatisticsPeriod eventStatisticsPeriod;
        List<EventStatisticsGroup> groups;
        double d;
        Double d2;
        Double d3;
        EventGraphResponse eventGraphResponse3;
        List<Incident> list3;
        String str8;
        String str9;
        String str10;
        iy7 iy7Var;
        Context context2;
        String str11;
        gv9 gv9Var;
        long j;
        String str12;
        EventGraphResponse eventGraphResponse4;
        int i;
        gv9 gv9Var2;
        bx7 F;
        Object T4;
        gv9 gv9Var3;
        long j2;
        iy7 iy7Var2;
        ArrayList arrayList4;
        List<EventGraphData> graphPoints;
        gv9 W;
        gv9 gv9Var4;
        iy7 iy7Var3;
        String str13;
        String str14;
        int i2;
        gv9 gv9Var5;
        bx7 bx7Var;
        long j3;
        ?? r13;
        long j4;
        Lineups awayLineups$default;
        List<PlayerData> players;
        Iterator it;
        Iterator it2;
        ArrayList arrayList5;
        Lineups homeLineups$default;
        List<PlayerData> players2;
        EventIncidentsResponse eventIncidentsResponse2;
        List<Incident> incidents;
        EventGraphResponse b;
        List<EventGraphData> graphPoints2;
        u8c u8cVar = this.L;
        Context context3 = u8cVar.a;
        Event event = (Event) this.I;
        lu3 lu3Var3 = lu3.a;
        int i3 = this.H;
        MediaPost mediaPost2 = this.J;
        zu4 zu4Var7 = null;
        if (i3 == 0) {
            y6a.M(obj);
            Sport sport = mediaPost2.getSport();
            if (sport == null || (slug = sport.getSlug()) == null) {
                return null;
            }
            r7c r7cVar = new r7c(u8cVar, event, slug, (rq3) null);
            ku3 ku3Var = this.K;
            av4 t = xw3.t(ku3Var, null, r7cVar, 3);
            av4 t2 = xw3.t(ku3Var, null, new r7c(slug, u8cVar, event, (rq3) null), 3);
            mediaPost = mediaPost2;
            av4 t3 = xw3.t(ku3Var, null, new s7c(u8cVar, event, null, 1), 3);
            boolean equals = slug.equals(Sports.FOOTBALL);
            obj2 = Sports.AMERICAN_FOOTBALL;
            p = yaa.p(ku3Var, equals, new s7c(u8cVar, event, null, 0));
            this.I = event;
            this.r = slug;
            this.s = t;
            this.t = t3;
            this.u = p;
            this.H = 1;
            w = t2.w(this);
            if (w != lu3Var3) {
                zu4Var = t;
                zu4Var2 = t3;
                str = slug;
            }
            return lu3Var3;
        }
        if (i3 == 1) {
            p = this.u;
            zu4 zu4Var8 = this.t;
            zu4 zu4Var9 = this.s;
            String str15 = this.r;
            y6a.M(obj);
            obj2 = Sports.AMERICAN_FOOTBALL;
            str = str15;
            mediaPost = mediaPost2;
            w = obj;
            zu4Var = zu4Var9;
            zu4Var2 = zu4Var8;
        } else if (i3 == 2) {
            eventGraphResponse = this.v;
            zu4Var3 = this.u;
            zu4Var2 = this.t;
            zu4Var = this.s;
            str = this.r;
            y6a.M(obj);
            obj2 = Sports.AMERICAN_FOOTBALL;
            mediaPost = mediaPost2;
            T = obj;
            eventIncidentsResponse = (EventIncidentsResponse) T;
            if (eventIncidentsResponse != null || (list = eventIncidentsResponse.getIncidents()) == null) {
                list = null;
            } else {
                for (Incident incident : list) {
                    incident.setSport(str);
                    incident.setShouldReverseTeams(event.shouldReverseTeams());
                }
            }
            tags = mediaPost.getTags();
            tags.getClass();
            if (tags.contains("exceptional")) {
                pair = new Pair(null, null);
                zu4Var4 = zu4Var2;
                lu3Var = lu3Var3;
            } else {
                if (str != null) {
                    int hashCode = str.hashCode();
                    lu3Var = lu3Var3;
                    zu4Var4 = zu4Var2;
                    if (hashCode == -83759494) {
                        obj3 = obj2;
                        if (str.equals(obj3)) {
                            if (tags.contains("final")) {
                                pair = new Pair(context3.getString(R.string.american_football_finals_title), context3.getString(R.string.american_football_finals_body));
                            } else if (tags.contains("fieldGoals")) {
                                pair = new Pair(context3.getString(R.string.american_football_only_field_goals_title), context3.getString(R.string.american_football_only_field_goals_body));
                            } else if (tags.contains("comeback")) {
                                pair = new Pair(context3.getString(R.string.american_football_comeback_win_title), context3.getString(R.string.american_football_comeback_win_body));
                            } else if (tags.contains("overtime")) {
                                pair = new Pair(context3.getString(R.string.american_football_overtime_game_title), context3.getString(R.string.american_football_overtime_game_body));
                            } else if (tags.contains("touchdownWin")) {
                                pair = new Pair(context3.getString(R.string.american_football_endgame_touchdown_title), context3.getString(R.string.american_football_endgame_touchdown_body));
                            } else if (tags.contains("fieldGoalWin")) {
                                pair = new Pair(context3.getString(R.string.american_football_endgame_field_goal_title), context3.getString(R.string.american_football_endgame_field_goal_body));
                            } else if (tags.contains("leadChanges")) {
                                pair = new Pair(context3.getString(R.string.american_football_lead_changes_title), context3.getString(R.string.american_football_lead_changes_body));
                            } else if (tags.contains("points")) {
                                pair = new Pair(context3.getString(R.string.american_football_both_high_scoring_title), context3.getString(R.string.american_football_both_high_scoring_body));
                            } else if (tags.contains("pointsOne")) {
                                pair = new Pair(context3.getString(R.string.american_football_one_high_scoring_title), context3.getString(R.string.american_football_one_high_scoring_body));
                            } else if (tags.contains("pointsTight")) {
                                pair = new Pair(context3.getString(R.string.american_football_tight_win_title), context3.getString(R.string.american_football_tight_win_body));
                            } else if (tags.contains("pointsZero")) {
                                pair = new Pair(context3.getString(R.string.american_football_goose_egg_title), context3.getString(R.string.american_football_goose_egg_body));
                            } else if (tags.contains("passTouchdownOne")) {
                                pair = new Pair(context3.getString(R.string.american_football_one_passing_touchdowns_title), context3.getString(R.string.american_football_one_passing_touchdowns_body));
                            } else if (tags.contains("passTouchdown")) {
                                pair = new Pair(context3.getString(R.string.american_football_both_passing_touchdowns_title), context3.getString(R.string.american_football_both_passing_touchdowns_body));
                            } else if (tags.contains("rushTouchdownOne")) {
                                pair = new Pair(context3.getString(R.string.american_football_one_rushing_touchdowns_title), context3.getString(R.string.american_football_one_rushing_touchdowns_body));
                            } else if (tags.contains("rushTouchdown")) {
                                pair = new Pair(context3.getString(R.string.american_football_both_rushing_touchdowns_title), context3.getString(R.string.american_football_both_rushing_touchdowns_body));
                            } else if (tags.contains("noTouchdownOne")) {
                                pair = new Pair(context3.getString(R.string.american_football_one_no_touchdowns_title), context3.getString(R.string.american_football_one_no_touchdowns_body));
                            } else if (tags.contains("noTouchdown")) {
                                pair = new Pair(context3.getString(R.string.american_football_both_no_touchdowns_title), context3.getString(R.string.american_football_both_no_touchdowns_body));
                            } else {
                                zu4Var7 = null;
                                pair = new Pair(null, null);
                                str2 = (String) pair.a;
                                String str16 = (String) pair.b;
                                this.I = event;
                                this.r = str;
                                this.s = zu4Var;
                                this.t = zu4Var7;
                                this.u = zu4Var3;
                                this.v = eventGraphResponse;
                                this.w = list;
                                this.x = str2;
                                this.y = str16;
                                this.H = 3;
                                T2 = zu4Var4.T(this);
                                lu3Var2 = lu3Var;
                                if (T2 == lu3Var2) {
                                }
                            }
                            zu4Var7 = null;
                            str2 = (String) pair.a;
                            String str162 = (String) pair.b;
                            this.I = event;
                            this.r = str;
                            this.s = zu4Var;
                            this.t = zu4Var7;
                            this.u = zu4Var3;
                            this.v = eventGraphResponse;
                            this.w = list;
                            this.x = str2;
                            this.y = str162;
                            this.H = 3;
                            T2 = zu4Var4.T(this);
                            lu3Var2 = lu3Var;
                            if (T2 == lu3Var2) {
                            }
                        }
                        zu4Var7 = null;
                    } else if (hashCode != 394668909) {
                        if (hashCode == 727149765 && str.equals(Sports.BASKETBALL)) {
                            if (tags.contains("final")) {
                                pair = new Pair(context3.getString(R.string.basketball_finals_title), context3.getString(R.string.basketball_finals_body));
                            } else if (tags.contains("winLastMinute")) {
                                pair = new Pair(context3.getString(R.string.basketball_last_minute_win_title), context3.getString(R.string.basketball_last_minute_win_body));
                            } else if (tags.contains("comeback")) {
                                pair = new Pair(context3.getString(R.string.basketball_comeback_title), context3.getString(R.string.basketball_comeback_body));
                            } else if (tags.contains("leadLost")) {
                                pair = new Pair(context3.getString(R.string.basketball_led_and_lost_title), context3.getString(R.string.basketball_led_and_lost_body));
                            } else if (tags.contains("lead")) {
                                pair = new Pair(context3.getString(R.string.basketball_dominated_title), context3.getString(R.string.basketball_dominated_body));
                            } else if (tags.contains("points")) {
                                pair = new Pair(context3.getString(R.string.basketball_solid_win_title), context3.getString(R.string.basketball_solid_win_body));
                            } else {
                                zu4Var7 = null;
                                pair = new Pair(null, null);
                            }
                            obj3 = obj2;
                            zu4Var7 = null;
                            str2 = (String) pair.a;
                            String str1622 = (String) pair.b;
                            this.I = event;
                            this.r = str;
                            this.s = zu4Var;
                            this.t = zu4Var7;
                            this.u = zu4Var3;
                            this.v = eventGraphResponse;
                            this.w = list;
                            this.x = str2;
                            this.y = str1622;
                            this.H = 3;
                            T2 = zu4Var4.T(this);
                            lu3Var2 = lu3Var;
                            if (T2 == lu3Var2) {
                                return lu3Var2;
                            }
                            String str17 = str;
                            zu4Var5 = zu4Var3;
                            str3 = str1622;
                            str4 = str17;
                            eventStatisticsResponse = (EventStatisticsResponse) T2;
                            if (eventStatisticsResponse != null) {
                            }
                            context = context3;
                            obj4 = Sports.FOOTBALL;
                            obj5 = obj3;
                            arrayList = null;
                            if (zu4Var5 == null) {
                            }
                        }
                        obj3 = obj2;
                        zu4Var7 = null;
                    } else {
                        if (str.equals(Sports.FOOTBALL)) {
                            if (tags.contains("final")) {
                                pair = new Pair(context3.getString(R.string.football_final_announcement), context3.getString(R.string.football_teams_in_finals));
                            } else if (tags.contains("winStopTime")) {
                                pair = new Pair(context3.getString(R.string.football_winning_stoppage_title), context3.getString(R.string.football_winning_stoppage_body));
                            } else if (tags.contains("dominationNoGoal")) {
                                pair = new Pair(context3.getString(R.string.football_dominated_no_goal_title), context3.getString(R.string.football_dominated_no_goal_body));
                            } else if (tags.contains("dominationLost")) {
                                pair = new Pair(context3.getString(R.string.football_dominated_lost_title), context3.getString(R.string.football_dominated_lost_body));
                            } else if (tags.contains("domination")) {
                                pair = new Pair(context3.getString(R.string.football_dominated_title), context3.getString(R.string.football_dominated_body));
                            } else if (tags.contains("incident")) {
                                pair = new Pair(context3.getString(R.string.football_incidents_title), context3.getString(R.string.football_incidents_body));
                            } else {
                                zu4Var7 = null;
                                pair = new Pair(null, null);
                            }
                            obj3 = obj2;
                            zu4Var7 = null;
                            str2 = (String) pair.a;
                            String str16222 = (String) pair.b;
                            this.I = event;
                            this.r = str;
                            this.s = zu4Var;
                            this.t = zu4Var7;
                            this.u = zu4Var3;
                            this.v = eventGraphResponse;
                            this.w = list;
                            this.x = str2;
                            this.y = str16222;
                            this.H = 3;
                            T2 = zu4Var4.T(this);
                            lu3Var2 = lu3Var;
                            if (T2 == lu3Var2) {
                            }
                        }
                        obj3 = obj2;
                        zu4Var7 = null;
                    }
                } else {
                    zu4Var4 = zu4Var2;
                    lu3Var = lu3Var3;
                    obj3 = obj2;
                }
                pair = new Pair(zu4Var7, zu4Var7);
                str2 = (String) pair.a;
                String str162222 = (String) pair.b;
                this.I = event;
                this.r = str;
                this.s = zu4Var;
                this.t = zu4Var7;
                this.u = zu4Var3;
                this.v = eventGraphResponse;
                this.w = list;
                this.x = str2;
                this.y = str162222;
                this.H = 3;
                T2 = zu4Var4.T(this);
                lu3Var2 = lu3Var;
                if (T2 == lu3Var2) {
                }
            }
            obj3 = obj2;
            str2 = (String) pair.a;
            String str1622222 = (String) pair.b;
            this.I = event;
            this.r = str;
            this.s = zu4Var;
            this.t = zu4Var7;
            this.u = zu4Var3;
            this.v = eventGraphResponse;
            this.w = list;
            this.x = str2;
            this.y = str1622222;
            this.H = 3;
            T2 = zu4Var4.T(this);
            lu3Var2 = lu3Var;
            if (T2 == lu3Var2) {
            }
        } else if (i3 == 3) {
            String str18 = this.y;
            String str19 = this.x;
            List<Incident> list4 = this.w;
            EventGraphResponse eventGraphResponse5 = this.v;
            zu4Var5 = this.u;
            zu4 zu4Var10 = this.s;
            String str20 = this.r;
            y6a.M(obj);
            str3 = str18;
            eventGraphResponse = eventGraphResponse5;
            lu3Var2 = lu3Var3;
            str4 = str20;
            str2 = str19;
            obj3 = Sports.AMERICAN_FOOTBALL;
            list = list4;
            zu4Var = zu4Var10;
            T2 = obj;
            mediaPost = mediaPost2;
            eventStatisticsResponse = (EventStatisticsResponse) T2;
            if (eventStatisticsResponse != null || (statistics = eventStatisticsResponse.getStatistics()) == null || (eventStatisticsPeriod = statistics.get(0)) == null || (groups = eventStatisticsPeriod.getGroups()) == null) {
                context = context3;
                obj4 = Sports.FOOTBALL;
                obj5 = obj3;
            } else {
                context = context3;
                ArrayList arrayList6 = new ArrayList(k13.r(groups, 10));
                Iterator it3 = groups.iterator();
                while (it3.hasNext()) {
                    EventStatisticsGroup eventStatisticsGroup = (EventStatisticsGroup) it3.next();
                    Iterator it4 = eventStatisticsGroup.getStatisticsItems().iterator();
                    while (it4.hasNext()) {
                        ((EventStatisticsItem) it4.next()).setShouldReverseTeams(event.shouldReverseTeams());
                        it3 = it3;
                        obj3 = obj3;
                    }
                    arrayList6.add(eventStatisticsGroup);
                }
                obj5 = obj3;
                Set set = t4c.a;
                Sport sport2 = mediaPost.getSport();
                String slug2 = sport2 != null ? sport2.getSlug() : null;
                boolean c0 = hkg.c0(context);
                obj4 = Sports.FOOTBALL;
                List a = t4c.a(16, slug2, arrayList6, c0, false);
                if (a != null) {
                    arrayList = new ArrayList();
                    Iterator it5 = a.iterator();
                    while (it5.hasNext()) {
                        Object next = it5.next();
                        s4c s4cVar = (s4c) next;
                        Iterator it6 = it5;
                        if (Intrinsics.c(s4cVar.a, "Ball possession") || Intrinsics.c(s4cVar.a, "Big chances")) {
                            arrayList.add(next);
                        }
                        it5 = it6;
                    }
                    if (zu4Var5 == null) {
                        arrayList2 = arrayList;
                        str5 = str4;
                        lineupsResponse = null;
                        str6 = str2;
                        zu4Var6 = zu4Var;
                        str7 = str3;
                        list2 = list;
                        if (lineupsResponse == null) {
                        }
                        d = 0.0d;
                        d2 = null;
                        if (lineupsResponse != null) {
                        }
                        d3 = null;
                        switch (str5.hashCode()) {
                            case -83759494:
                                break;
                            case 1767150:
                                break;
                            case 394668909:
                                break;
                            case 727149765:
                                break;
                        }
                    } else {
                        this.I = event;
                        this.r = str4;
                        this.s = zu4Var;
                        this.t = null;
                        this.u = null;
                        this.v = eventGraphResponse;
                        this.w = list;
                        this.x = str2;
                        this.y = str3;
                        this.z = arrayList;
                        this.H = 4;
                        T3 = zu4Var5.T(this);
                        if (T3 == lu3Var2) {
                            return lu3Var2;
                        }
                        eventGraphResponse2 = eventGraphResponse;
                        arrayList3 = arrayList;
                        str5 = str4;
                        arrayList2 = arrayList3;
                        lineupsResponse = (LineupsResponse) T3;
                        eventGraphResponse = eventGraphResponse2;
                        list2 = list;
                        str6 = str2;
                        zu4Var6 = zu4Var;
                        str7 = str3;
                        if (lineupsResponse == null) {
                        }
                        d = 0.0d;
                        d2 = null;
                        if (lineupsResponse != null) {
                        }
                        d3 = null;
                        switch (str5.hashCode()) {
                            case -83759494:
                                break;
                            case 1767150:
                                break;
                            case 394668909:
                                break;
                            case 727149765:
                                break;
                        }
                    }
                }
            }
            arrayList = null;
            if (zu4Var5 == null) {
            }
        } else {
            if (i3 != 4) {
                if (i3 != 5) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j2 = this.G;
                i = this.F;
                gv9Var3 = this.E;
                iy7Var2 = this.D;
                F = this.C;
                String str21 = this.B;
                String str22 = this.A;
                ?? r11 = this.z;
                String str23 = this.r;
                y6a.M(obj);
                str5 = str23;
                str6 = str22;
                T4 = obj;
                str7 = str21;
                gv9Var2 = null;
                arrayList4 = r11;
                eventIncidentsResponse2 = (EventIncidentsResponse) T4;
                if (eventIncidentsResponse2 != null || (incidents = eventIncidentsResponse2.getIncidents()) == null || (b = qz9.b(str5, incidents)) == null || (graphPoints2 = b.getGraphPoints()) == null) {
                    String str24 = str6;
                    gv9Var5 = gv9Var3;
                    str14 = str24;
                    i2 = i;
                    iy7Var3 = iy7Var2;
                    gv9Var4 = gv9Var2;
                    str13 = str7;
                    arrayList2 = arrayList4;
                } else {
                    gv9 W2 = l6g.W(graphPoints2);
                    String str25 = str6;
                    gv9Var5 = gv9Var3;
                    str14 = str25;
                    gv9Var4 = W2;
                    iy7Var3 = iy7Var2;
                    str13 = str7;
                    arrayList2 = arrayList4;
                    i2 = i;
                }
                bx7Var = F;
                j3 = j2;
                return new dh8(i2, str14, str13, j3, bx7Var, Sports.FOOTBALL, iy7Var3, gv9Var5, gv9Var4, arrayList2 != null ? l6g.W(arrayList2) : gv9Var2, event, new x43((MediaReactionType) null, 0, 0, (Boolean) null, 31));
            }
            ?? r1 = this.z;
            str3 = this.y;
            str2 = this.x;
            List<Incident> list5 = this.w;
            eventGraphResponse2 = this.v;
            zu4Var = this.s;
            str5 = this.r;
            y6a.M(obj);
            context = context3;
            obj5 = Sports.AMERICAN_FOOTBALL;
            list = list5;
            obj4 = Sports.FOOTBALL;
            mediaPost = mediaPost2;
            T3 = obj;
            lu3Var2 = lu3Var3;
            arrayList3 = r1;
            arrayList2 = arrayList3;
            lineupsResponse = (LineupsResponse) T3;
            eventGraphResponse = eventGraphResponse2;
            list2 = list;
            str6 = str2;
            zu4Var6 = zu4Var;
            str7 = str3;
            if (lineupsResponse == null && (homeLineups$default = LineupsResponse.getHomeLineups$default(lineupsResponse, null, 1, null)) != null && (players2 = homeLineups$default.getPlayers()) != null) {
                ArrayList arrayList7 = new ArrayList();
                Iterator it7 = players2.iterator();
                while (it7.hasNext()) {
                    FootballPlayerEventStatistics footballStatistics = ((PlayerData) it7.next()).getFootballStatistics();
                    Double rating = footballStatistics != null ? footballStatistics.getRating() : null;
                    if (rating != null) {
                        arrayList7.add(rating);
                    }
                }
                d = 0.0d;
                ArrayList arrayList8 = new ArrayList();
                Iterator it8 = arrayList7.iterator();
                while (it8.hasNext()) {
                    Object next2 = it8.next();
                    if (((Number) next2).doubleValue() > 0.0d) {
                        arrayList8.add(next2);
                    }
                }
                if (arrayList8.isEmpty()) {
                    arrayList8 = null;
                }
                if (arrayList8 != null) {
                    d2 = new Double(CollectionsKt.O(arrayList8));
                    if (lineupsResponse != null && (awayLineups$default = LineupsResponse.getAwayLineups$default(lineupsResponse, null, 1, null)) != null && (players = awayLineups$default.getPlayers()) != null) {
                        ArrayList arrayList9 = new ArrayList();
                        it = players.iterator();
                        while (it.hasNext()) {
                            FootballPlayerEventStatistics footballStatistics2 = ((PlayerData) it.next()).getFootballStatistics();
                            Double rating2 = footballStatistics2 != null ? footballStatistics2.getRating() : null;
                            if (rating2 != null) {
                                arrayList9.add(rating2);
                            }
                        }
                        ArrayList arrayList10 = new ArrayList();
                        it2 = arrayList9.iterator();
                        while (it2.hasNext()) {
                            Object next3 = it2.next();
                            if (((Number) next3).doubleValue() > d) {
                                arrayList10.add(next3);
                            }
                        }
                        arrayList5 = arrayList10.isEmpty() ? arrayList10 : null;
                        if (arrayList5 != null) {
                            d3 = new Double(CollectionsKt.O(arrayList5));
                            switch (str5.hashCode()) {
                                case -83759494:
                                    eventGraphResponse3 = eventGraphResponse;
                                    list3 = list2;
                                    str8 = str7;
                                    str9 = str6;
                                    str10 = str5;
                                    iy7Var = null;
                                    context2 = context;
                                    if (!str10.equals(obj5)) {
                                        return null;
                                    }
                                    if (eventGraphResponse3 != null) {
                                        return iy7Var;
                                    }
                                    int id = mediaPost.getId();
                                    long createdAtTimestamp = mediaPost.getCreatedAtTimestamp();
                                    bx7 F2 = uxf.F(event, context2, true, false, null, null, 60);
                                    UniqueTournament uniqueTournament = event.getTournament().getUniqueTournament();
                                    iy7 K = uniqueTournament != null ? uxf.K(uniqueTournament) : iy7Var;
                                    if (list3 != null) {
                                        j4 = createdAtTimestamp;
                                        r13 = l6g.W(list3);
                                    } else {
                                        r13 = iy7Var;
                                        j4 = createdAtTimestamp;
                                    }
                                    return new otg(id, str9, str8, j4, F2, str10, K, r13, eventGraphResponse3, event);
                                case 1767150:
                                    EventGraphResponse eventGraphResponse6 = eventGraphResponse;
                                    List<Incident> list6 = list2;
                                    Context context4 = context;
                                    if (!str5.equals(Sports.HANDBALL)) {
                                        return null;
                                    }
                                    int id2 = mediaPost.getId();
                                    long createdAtTimestamp2 = mediaPost.getCreatedAtTimestamp();
                                    bx7 F3 = uxf.F(event, context4, true, false, null, null, 60);
                                    UniqueTournament uniqueTournament2 = event.getTournament().getUniqueTournament();
                                    iy7 K2 = uniqueTournament2 != null ? uxf.K(uniqueTournament2) : null;
                                    if (list6 != null) {
                                        str11 = str6;
                                        gv9Var = l6g.W(list6);
                                    } else {
                                        str11 = str6;
                                        gv9Var = null;
                                    }
                                    if (eventGraphResponse6 == null) {
                                        EventGraphResponse b2 = list6 != null ? qz9.b(str5, list6) : null;
                                        if (b2 == null) {
                                            return null;
                                        }
                                        j = createdAtTimestamp2;
                                        str12 = str5;
                                        eventGraphResponse4 = b2;
                                    } else {
                                        j = createdAtTimestamp2;
                                        str12 = str5;
                                        eventGraphResponse4 = eventGraphResponse6;
                                    }
                                    return new otg(id2, str11, str7, j, F3, str12, K2, gv9Var, eventGraphResponse4, event);
                                case 394668909:
                                    if (str5.equals(obj4)) {
                                        int id3 = mediaPost.getId();
                                        long createdAtTimestamp3 = mediaPost.getCreatedAtTimestamp();
                                        EventGraphResponse eventGraphResponse7 = eventGraphResponse;
                                        i = id3;
                                        List<Incident> list7 = list2;
                                        gv9Var2 = null;
                                        F = uxf.F(event, context, true, false, d2, d3, 12);
                                        UniqueTournament uniqueTournament3 = event.getTournament().getUniqueTournament();
                                        iy7 K3 = uniqueTournament3 != null ? uxf.K(uniqueTournament3) : null;
                                        gv9 W3 = list7 != null ? l6g.W(list7) : null;
                                        if (eventGraphResponse7 != null && (graphPoints = eventGraphResponse7.getGraphPoints()) != null && (W = l6g.W(graphPoints)) != null) {
                                            gv9Var4 = W;
                                            iy7Var3 = K3;
                                            str13 = str7;
                                            str14 = str6;
                                            i2 = i;
                                            gv9Var5 = W3;
                                            bx7Var = F;
                                            j3 = createdAtTimestamp3;
                                            return new dh8(i2, str14, str13, j3, bx7Var, Sports.FOOTBALL, iy7Var3, gv9Var5, gv9Var4, arrayList2 != null ? l6g.W(arrayList2) : gv9Var2, event, new x43((MediaReactionType) null, 0, 0, (Boolean) null, 31));
                                        }
                                        this.I = event;
                                        this.r = str5;
                                        this.s = null;
                                        this.t = null;
                                        this.u = null;
                                        this.v = null;
                                        this.w = null;
                                        this.x = null;
                                        this.y = null;
                                        this.z = arrayList2;
                                        this.A = str6;
                                        this.B = str7;
                                        this.C = F;
                                        this.D = K3;
                                        this.E = W3;
                                        this.F = i;
                                        this.G = createdAtTimestamp3;
                                        this.H = 5;
                                        T4 = zu4Var6.T(this);
                                        if (T4 == lu3Var2) {
                                            return lu3Var2;
                                        }
                                        gv9Var3 = W3;
                                        j2 = createdAtTimestamp3;
                                        iy7Var2 = K3;
                                        arrayList4 = arrayList2;
                                        eventIncidentsResponse2 = (EventIncidentsResponse) T4;
                                        if (eventIncidentsResponse2 != null) {
                                            break;
                                        }
                                        String str242 = str6;
                                        gv9Var5 = gv9Var3;
                                        str14 = str242;
                                        i2 = i;
                                        iy7Var3 = iy7Var2;
                                        gv9Var4 = gv9Var2;
                                        str13 = str7;
                                        arrayList2 = arrayList4;
                                        bx7Var = F;
                                        j3 = j2;
                                        return new dh8(i2, str14, str13, j3, bx7Var, Sports.FOOTBALL, iy7Var3, gv9Var5, gv9Var4, arrayList2 != null ? l6g.W(arrayList2) : gv9Var2, event, new x43((MediaReactionType) null, 0, 0, (Boolean) null, 31));
                                    }
                                    return null;
                                case 727149765:
                                    if (str5.equals(Sports.BASKETBALL)) {
                                        eventGraphResponse3 = eventGraphResponse;
                                        list3 = list2;
                                        str8 = str7;
                                        str9 = str6;
                                        str10 = str5;
                                        iy7Var = null;
                                        context2 = context;
                                        if (eventGraphResponse3 != null) {
                                        }
                                    }
                                    return null;
                                default:
                                    return null;
                            }
                        }
                    }
                    d3 = null;
                    switch (str5.hashCode()) {
                        case -83759494:
                            break;
                        case 1767150:
                            break;
                        case 394668909:
                            break;
                        case 727149765:
                            break;
                    }
                }
            } else {
                d = 0.0d;
            }
            d2 = null;
            if (lineupsResponse != null) {
                ArrayList arrayList92 = new ArrayList();
                it = players.iterator();
                while (it.hasNext()) {
                }
                ArrayList arrayList102 = new ArrayList();
                it2 = arrayList92.iterator();
                while (it2.hasNext()) {
                }
                if (arrayList102.isEmpty()) {
                }
                if (arrayList5 != null) {
                }
            }
            d3 = null;
            switch (str5.hashCode()) {
                case -83759494:
                    break;
                case 1767150:
                    break;
                case 394668909:
                    break;
                case 727149765:
                    break;
            }
        }
        EventGraphResponse eventGraphResponse8 = (EventGraphResponse) w;
        this.I = event;
        this.r = str;
        this.s = zu4Var;
        this.t = zu4Var2;
        this.u = p;
        this.v = eventGraphResponse8;
        this.H = 2;
        T = zu4Var.T(this);
        if (T != lu3Var3) {
            zu4Var3 = p;
            eventGraphResponse = eventGraphResponse8;
            eventIncidentsResponse = (EventIncidentsResponse) T;
            if (eventIncidentsResponse != null) {
            }
            list = null;
            tags = mediaPost.getTags();
            tags.getClass();
            if (tags.contains("exceptional")) {
            }
            obj3 = obj2;
            str2 = (String) pair.a;
            String str16222222 = (String) pair.b;
            this.I = event;
            this.r = str;
            this.s = zu4Var;
            this.t = zu4Var7;
            this.u = zu4Var3;
            this.v = eventGraphResponse;
            this.w = list;
            this.x = str2;
            this.y = str16222222;
            this.H = 3;
            T2 = zu4Var4.T(this);
            lu3Var2 = lu3Var;
            if (T2 == lu3Var2) {
            }
        }
        return lu3Var3;
    }
}
