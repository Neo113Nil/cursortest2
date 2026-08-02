package defpackage;

import android.content.Context;
import com.sofascore.model.Sports;
import com.sofascore.model.TeamSelection;
import com.sofascore.model.database.MediaReactionType;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Lineups;
import com.sofascore.model.mvvm.model.PlayerData;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.network.response.EventStatisticsGroup;
import com.sofascore.model.network.response.EventStatisticsItem;
import com.sofascore.model.network.response.EventStatisticsPeriod;
import com.sofascore.model.network.response.EventStatisticsResponse;
import com.sofascore.model.network.response.FootballPlayerEventStatistics;
import com.sofascore.model.network.response.LineupsResponse;
import com.sofascore.model.network.response.SeasonShotActionAreaResponse;
import com.sofascore.model.network.response.TeamEventShotmapResponse;
import com.sofascore.model.newNetwork.BaseHockeyShotmapItem;
import com.sofascore.model.newNetwork.FootballShotmapItem;
import com.sofascore.model.newNetwork.FootballShotmapResponse;
import com.sofascore.model.newNetwork.HockeyEventShotmapItem;
import com.sofascore.model.newNetwork.SeasonShotAction;
import com.sofascore.model.newNetwork.ShotActionArea;
import com.sofascore.model.newNetwork.mediaposts.MediaPost;
import com.sofascore.results.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class k8c extends hoi implements ct8 {
    public int A;
    public int B;
    public int C;
    public /* synthetic */ Event D;
    public /* synthetic */ Team E;
    public final /* synthetic */ u8c F;
    public final /* synthetic */ MediaPost G;
    public final /* synthetic */ ku3 H;
    public String r;
    public String s;
    public av4 t;
    public zu4 u;
    public List v;
    public EventStatisticsItem w;
    public EventStatisticsItem x;
    public EventStatisticsItem y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k8c(rq3 rq3Var, ku3 ku3Var, u8c u8cVar, MediaPost mediaPost) {
        super(3, rq3Var);
        this.F = u8cVar;
        this.G = mediaPost;
        this.H = ku3Var;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        k8c k8cVar = new k8c((rq3) obj3, this.H, this.F, this.G);
        k8cVar.D = (Event) obj;
        k8cVar.E = (Team) obj2;
        return k8cVar.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:297:0x0431, code lost:
    
        if (r1 == r8) goto L276;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0728  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x065e  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x068c  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x06a1  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x06bd  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x04ca A[LOOP:12: B:224:0x04c4->B:226:0x04ca, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0560  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x053a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0518 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x04f6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x079f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x07d8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x07f7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x07fc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03a6 A[LOOP:4: B:77:0x03a0->B:79:0x03a6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x056e  */
    /* JADX WARN: Type inference failed for: r2v60, types: [zu4] */
    /* JADX WARN: Type inference failed for: r6v22, types: [zu4] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        Event event;
        String str;
        Pair pair;
        Pair pair2;
        String str2;
        Team team;
        Context context;
        MediaPost mediaPost;
        Object w;
        String str3;
        String str4;
        int i2;
        Team team2;
        Context context2;
        MediaPost mediaPost2;
        String str5;
        av4 av4Var;
        av4 t;
        av4 t2;
        Object w2;
        UniqueTournament uniqueTournament;
        String str6;
        Event event2;
        int i3;
        Team team3;
        int i4;
        Context context3;
        MediaPost mediaPost3;
        av4 av4Var2;
        Object w3;
        String str7;
        int i5;
        List<FootballShotmapItem> shotmap;
        Object T;
        List<FootballShotmapItem> list;
        int i6;
        String str8;
        EventStatisticsResponse eventStatisticsResponse;
        List<EventStatisticsPeriod> statistics;
        EventStatisticsPeriod eventStatisticsPeriod;
        List<EventStatisticsGroup> groups;
        Iterator it;
        Iterator it2;
        Object obj2;
        Iterator it3;
        Object obj3;
        Iterator it4;
        Object obj4;
        EventStatisticsItem eventStatisticsItem;
        Object T2;
        EventStatisticsItem eventStatisticsItem2;
        EventStatisticsItem eventStatisticsItem3;
        String str9;
        String str10;
        Lineups awayLineups$default;
        List<PlayerData> players;
        Double d;
        String away$default;
        String str11;
        String away$default2;
        String str12;
        String str13;
        String away$default3;
        Lineups homeLineups$default;
        List<PlayerData> players2;
        SeasonShotActionAreaResponse seasonShotActionAreaResponse;
        List<ShotActionArea> shotActionAreas;
        Object T3;
        String str14;
        String str15;
        TeamEventShotmapResponse teamEventShotmapResponse;
        List<SeasonShotAction> shotmap2;
        Iterator<SeasonShotAction> it5;
        List<HockeyEventShotmapItem> list2;
        ArrayList arrayList;
        u8c u8cVar = this.F;
        Context context4 = u8cVar.a;
        Event event3 = this.D;
        Team team4 = this.E;
        lu3 lu3Var = lu3.a;
        int i7 = this.C;
        MediaPost mediaPost4 = this.G;
        switch (i7) {
            case 0:
                y6a.M(obj);
                i = Event.getHomeTeam$default(event3, null, 1, null).getId() == team4.getId() ? 1 : 0;
                List<String> tags = mediaPost4.getTags();
                Sport sport = mediaPost4.getSport();
                String slug = sport != null ? sport.getSlug() : null;
                tags.getClass();
                if (tags.contains("exceptional")) {
                    if (slug != null) {
                        int hashCode = slug.hashCode();
                        event = event3;
                        if (hashCode != -2002238939) {
                            if (hashCode != 394668909) {
                                if (hashCode == 727149765 && slug.equals(Sports.BASKETBALL)) {
                                    if (tags.contains("side")) {
                                        pair2 = new Pair(context4.getString(R.string.basketball_side_title), context4.getString(R.string.basketball_side_body));
                                    } else if (tags.contains("twoPoint")) {
                                        pair2 = new Pair(context4.getString(R.string.basketball_midrange_title), context4.getString(R.string.basketball_midrange_body));
                                    } else if (tags.contains("paint")) {
                                        pair2 = new Pair(context4.getString(R.string.basketball_paint_title), context4.getString(R.string.basketball_paint_body));
                                    } else if (tags.contains("threePoint")) {
                                        pair2 = new Pair(context4.getString(R.string.basketball_3_pointers_title), context4.getString(R.string.basketball_3_pointers_body));
                                    } else {
                                        str = null;
                                        pair = new Pair(null, null);
                                    }
                                    pair = pair2;
                                    str = null;
                                }
                            } else if (slug.equals(Sports.FOOTBALL)) {
                                if (tags.contains("goal")) {
                                    pair2 = new Pair(context4.getString(R.string.football_many_goals_title), context4.getString(R.string.football_many_goals_body));
                                } else if (tags.contains("shotOnTarget")) {
                                    pair2 = new Pair(context4.getString(R.string.football_many_shots_title), context4.getString(R.string.football_many_shots_body));
                                } else if (tags.contains("shot")) {
                                    pair2 = new Pair(context4.getString(R.string.football_rapid_fire_title), context4.getString(R.string.football_rapid_fire_body_2));
                                } else {
                                    str = null;
                                    pair = new Pair(null, null);
                                }
                                pair = pair2;
                                str = null;
                            }
                        } else if (slug.equals(Sports.ICE_HOCKEY)) {
                            if (tags.contains("final")) {
                                pair2 = new Pair(context4.getString(R.string.hockey_finals_title), context4.getString(R.string.hockey_finals_body));
                            } else if (tags.contains("goal")) {
                                pair2 = new Pair(context4.getString(R.string.hockey_many_goals_title), context4.getString(R.string.hockey_many_goals_body));
                            } else if (tags.contains("shot")) {
                                pair2 = new Pair(context4.getString(R.string.hockey_rapid_fire_title), context4.getString(R.string.hockey_rapid_fire_body));
                            } else if (tags.contains("shotMiss")) {
                                pair2 = new Pair(context4.getString(R.string.off_target_title), context4.getString(R.string.off_target_2_body));
                            } else if (tags.contains("shotPercentage")) {
                                pair2 = new Pair(context4.getString(R.string.hockey_on_fire_title), context4.getString(R.string.hockey_on_fire_body));
                            } else {
                                str = null;
                                pair = new Pair(null, null);
                            }
                            pair = pair2;
                            str = null;
                        }
                    } else {
                        event = event3;
                    }
                    str = null;
                    pair = new Pair(null, null);
                } else {
                    str = null;
                    pair = new Pair(null, null);
                    event = event3;
                }
                str2 = (String) pair.a;
                String str16 = (String) pair.b;
                Sport sport2 = mediaPost4.getSport();
                String slug2 = sport2 != null ? sport2.getSlug() : str;
                if (slug2 == null) {
                    return str;
                }
                int hashCode2 = slug2.hashCode();
                ku3 ku3Var = this.H;
                if (hashCode2 == -2002238939) {
                    team = team4;
                    context = context4;
                    mediaPost = mediaPost4;
                    event3 = event;
                    if (slug2.equals(Sports.ICE_HOCKEY)) {
                        av4 t3 = xw3.t(ku3Var, null, new s7c(u8cVar, event3, null, 9), 3);
                        this.D = event3;
                        this.E = team;
                        this.r = str2;
                        this.s = str16;
                        this.z = i;
                        this.C = 6;
                        w = t3.w(this);
                        if (w != lu3Var) {
                            str3 = str16;
                            str4 = str2;
                            i2 = i;
                            list2 = (List) yaa.x((x2g) w);
                            if (list2 != null) {
                                List<String> tags2 = mediaPost.getTags();
                                tags2.getClass();
                                if (!tags2.contains("goal")) {
                                    if (tags2.contains("shotMiss")) {
                                        arrayList = new ArrayList();
                                        for (Object obj5 : list2) {
                                            HockeyEventShotmapItem hockeyEventShotmapItem = (HockeyEventShotmapItem) obj5;
                                            if (hockeyEventShotmapItem.getType() == BaseHockeyShotmapItem.ShotmapItemType.MISSED_SHOT.getId() || hockeyEventShotmapItem.getType() == BaseHockeyShotmapItem.ShotmapItemType.BLOCKED_SHOT.getId()) {
                                                arrayList.add(obj5);
                                            }
                                        }
                                    }
                                    for (HockeyEventShotmapItem hockeyEventShotmapItem2 : list2) {
                                        if (event3.shouldReverseTeams()) {
                                            hockeyEventShotmapItem2.mirror();
                                        }
                                    }
                                    int id = mediaPost.getId();
                                    long createdAtTimestamp = mediaPost.getCreatedAtTimestamp();
                                    bx7 F = uxf.F(event3, context, true, false, null, null, 60);
                                    Team team5 = team;
                                    fy7 J = uxf.J(team5, context, null, false, null, 30);
                                    ArrayList arrayList2 = new ArrayList();
                                    for (Object obj6 : list2) {
                                        if (((HockeyEventShotmapItem) obj6).getTeam().getId() == team5.getId()) {
                                            arrayList2.add(obj6);
                                        }
                                    }
                                    return new fq9(id, str4, str3, createdAtTimestamp, F, Sports.ICE_HOCKEY, J, l6g.W(arrayList2), i2 == 0 ? TeamSelection.First : TeamSelection.Second, new x43((MediaReactionType) null, 0, 0, (Boolean) null, 31));
                                }
                                arrayList = new ArrayList();
                                for (Object obj7 : list2) {
                                    if (((HockeyEventShotmapItem) obj7).getType() == BaseHockeyShotmapItem.ShotmapItemType.GOAL.getId()) {
                                        arrayList.add(obj7);
                                    }
                                }
                                list2 = arrayList;
                                while (r5.hasNext()) {
                                }
                                int id2 = mediaPost.getId();
                                long createdAtTimestamp2 = mediaPost.getCreatedAtTimestamp();
                                bx7 F2 = uxf.F(event3, context, true, false, null, null, 60);
                                Team team52 = team;
                                fy7 J2 = uxf.J(team52, context, null, false, null, 30);
                                ArrayList arrayList22 = new ArrayList();
                                while (r0.hasNext()) {
                                }
                                return new fq9(id2, str4, str3, createdAtTimestamp2, F2, Sports.ICE_HOCKEY, J2, l6g.W(arrayList22), i2 == 0 ? TeamSelection.First : TeamSelection.Second, new x43((MediaReactionType) null, 0, 0, (Boolean) null, 31));
                            }
                        }
                        return lu3Var;
                    }
                    return null;
                }
                if (hashCode2 == 394668909) {
                    team2 = team4;
                    context2 = context4;
                    mediaPost2 = mediaPost4;
                    event3 = event;
                    str5 = str16;
                    av4Var = null;
                    if (slug2.equals(Sports.FOOTBALL)) {
                        av4 t4 = xw3.t(ku3Var, null, new s7c(u8cVar, event3, null, 8), 3);
                        t = xw3.t(ku3Var, null, new s7c(u8cVar, event3, null, 10), 3);
                        t2 = xw3.t(ku3Var, null, new s7c(u8cVar, event3, null, 7), 3);
                        this.D = event3;
                        this.E = team2;
                        this.r = str2;
                        this.s = str5;
                        this.t = t;
                        this.u = t2;
                        this.z = i;
                        this.C = 1;
                        w2 = t4.w(this);
                        break;
                    }
                    return av4Var;
                }
                if (hashCode2 == 727149765 && slug2.equals(Sports.BASKETBALL) && (uniqueTournament = event.getTournament().getUniqueTournament()) != null) {
                    int id3 = uniqueTournament.getId();
                    Season season = event.getSeason();
                    if (season != null) {
                        int id4 = season.getId();
                        czg[] czgVarArr = czg.b;
                        Event event4 = event;
                        str6 = str16;
                        av4 t5 = xw3.t(ku3Var, null, new j8c(u8cVar, event4, team4, (rq3) null, 0), 3);
                        event2 = event4;
                        i3 = id3;
                        team3 = team4;
                        i4 = id4;
                        context3 = context4;
                        mediaPost3 = mediaPost4;
                        av4Var2 = t5;
                        y7c y7cVar = new y7c(u8cVar, i3, i4, null, 2);
                        av4Var = null;
                        av4 t6 = xw3.t(ku3Var, null, y7cVar, 3);
                        this.D = event2;
                        this.E = team3;
                        this.r = str2;
                        this.s = str6;
                        this.t = av4Var2;
                        this.u = null;
                        this.z = i;
                        this.A = i3;
                        this.B = i4;
                        this.C = 4;
                        w3 = t6.w(this);
                        if (w3 != lu3Var) {
                            str7 = str2;
                            i5 = i;
                            seasonShotActionAreaResponse = (SeasonShotActionAreaResponse) yaa.x((x2g) w3);
                            if (seasonShotActionAreaResponse != null && (shotActionAreas = seasonShotActionAreaResponse.getShotActionAreas()) != null) {
                                this.D = event2;
                                this.E = team3;
                                this.r = str7;
                                this.s = str6;
                                this.t = av4Var;
                                this.u = av4Var;
                                this.v = shotActionAreas;
                                this.z = i5;
                                this.A = i3;
                                this.B = i4;
                                this.C = 5;
                                T3 = av4Var2.T(this);
                                if (T3 != lu3Var) {
                                    str14 = str7;
                                    str15 = str6;
                                    teamEventShotmapResponse = (TeamEventShotmapResponse) yaa.x((x2g) T3);
                                    if (teamEventShotmapResponse != null && (shotmap2 = teamEventShotmapResponse.getShotmap()) != null) {
                                        zve zveVar = new zve();
                                        it5 = shotmap2.iterator();
                                        while (it5.hasNext()) {
                                            zveVar.a(it5.next());
                                        }
                                        Context context5 = context3;
                                        return new ss1(mediaPost3.getId(), str14, str15, mediaPost3.getCreatedAtTimestamp(), uxf.F(event2, context5, true, false, null, null, 60), Sports.BASKETBALL, uxf.J(team3, context5, null, false, null, 30), zveVar, new se5(shotActionAreas), new x43((MediaReactionType) null, 0, 0, (Boolean) null, 31));
                                    }
                                }
                            }
                            return av4Var;
                        }
                    }
                }
                return null;
                return lu3Var;
            case 1:
                int i8 = this.z;
                ?? r2 = this.u;
                t = this.t;
                String str17 = this.s;
                String str18 = this.r;
                y6a.M(obj);
                t2 = r2;
                av4Var = null;
                str5 = str17;
                mediaPost2 = mediaPost4;
                str2 = str18;
                i = i8;
                team2 = team4;
                context2 = context4;
                w2 = obj;
                FootballShotmapResponse footballShotmapResponse = (FootballShotmapResponse) yaa.x((x2g) w2);
                if (footballShotmapResponse != null && (shotmap = footballShotmapResponse.getShotmap()) != null) {
                    this.D = event3;
                    this.E = team2;
                    this.r = str2;
                    this.s = str5;
                    this.t = av4Var;
                    this.u = t2;
                    this.v = shotmap;
                    this.z = i;
                    this.C = 2;
                    T = t.T(this);
                    if (T != lu3Var) {
                        list = shotmap;
                        i6 = i;
                        str8 = str2;
                        eventStatisticsResponse = (EventStatisticsResponse) T;
                        if (eventStatisticsResponse != null && (statistics = eventStatisticsResponse.getStatistics()) != null && (eventStatisticsPeriod = statistics.get(0)) != null && (groups = eventStatisticsPeriod.getGroups()) != null) {
                            ArrayList arrayList3 = new ArrayList(k13.r(groups, 10));
                            for (EventStatisticsGroup eventStatisticsGroup : groups) {
                                Iterator it6 = eventStatisticsGroup.getStatisticsItems().iterator();
                                while (it6.hasNext()) {
                                    ((EventStatisticsItem) it6.next()).setShouldReverseTeams(event3.shouldReverseTeams());
                                }
                                arrayList3.add(eventStatisticsGroup);
                            }
                            ArrayList arrayList4 = new ArrayList();
                            it = arrayList3.iterator();
                            while (it.hasNext()) {
                                o13.v(((EventStatisticsGroup) it.next()).getStatisticsItems(), arrayList4);
                            }
                            it2 = arrayList4.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    obj2 = null;
                                } else {
                                    obj2 = it2.next();
                                    if (Intrinsics.c(((EventStatisticsItem) obj2).getName(), "Shots on target")) {
                                    }
                                }
                            }
                            EventStatisticsItem eventStatisticsItem4 = (EventStatisticsItem) obj2;
                            it3 = arrayList4.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    obj3 = null;
                                } else {
                                    obj3 = it3.next();
                                    if (Intrinsics.c(((EventStatisticsItem) obj3).getName(), "Shots off target")) {
                                    }
                                }
                            }
                            EventStatisticsItem eventStatisticsItem5 = (EventStatisticsItem) obj3;
                            it4 = arrayList4.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    obj4 = null;
                                } else {
                                    obj4 = it4.next();
                                    if (Intrinsics.c(((EventStatisticsItem) obj4).getName(), "Blocked shots")) {
                                    }
                                }
                            }
                            eventStatisticsItem = (EventStatisticsItem) obj4;
                            this.D = event3;
                            this.E = team2;
                            this.r = str8;
                            this.s = str5;
                            this.t = null;
                            this.u = null;
                            this.v = list;
                            this.w = eventStatisticsItem4;
                            this.x = eventStatisticsItem5;
                            this.y = eventStatisticsItem;
                            this.z = i6;
                            this.C = 3;
                            T2 = t2.T(this);
                            if (T2 != lu3Var) {
                                eventStatisticsItem2 = eventStatisticsItem4;
                                eventStatisticsItem3 = eventStatisticsItem5;
                                str9 = str5;
                                str10 = str8;
                                List<FootballShotmapItem> list3 = list;
                                LineupsResponse lineupsResponse = (LineupsResponse) T2;
                                if (i6 == 0) {
                                    if (lineupsResponse != null && (homeLineups$default = LineupsResponse.getHomeLineups$default(lineupsResponse, null, 1, null)) != null && (players2 = homeLineups$default.getPlayers()) != null) {
                                        ArrayList arrayList5 = new ArrayList();
                                        Iterator it7 = players2.iterator();
                                        while (it7.hasNext()) {
                                            FootballPlayerEventStatistics footballStatistics = ((PlayerData) it7.next()).getFootballStatistics();
                                            Double rating = footballStatistics != null ? footballStatistics.getRating() : null;
                                            if (rating != null) {
                                                arrayList5.add(rating);
                                            }
                                        }
                                        ArrayList arrayList6 = new ArrayList();
                                        Iterator it8 = arrayList5.iterator();
                                        while (it8.hasNext()) {
                                            Object next = it8.next();
                                            if (((Number) next).doubleValue() > 0.0d) {
                                                arrayList6.add(next);
                                            }
                                        }
                                        d = new Double(CollectionsKt.O(arrayList6));
                                    }
                                    d = null;
                                } else {
                                    if (lineupsResponse != null && (awayLineups$default = LineupsResponse.getAwayLineups$default(lineupsResponse, null, 1, null)) != null && (players = awayLineups$default.getPlayers()) != null) {
                                        ArrayList arrayList7 = new ArrayList();
                                        Iterator it9 = players.iterator();
                                        while (it9.hasNext()) {
                                            FootballPlayerEventStatistics footballStatistics2 = ((PlayerData) it9.next()).getFootballStatistics();
                                            Double rating2 = footballStatistics2 != null ? footballStatistics2.getRating() : null;
                                            if (rating2 != null) {
                                                arrayList7.add(rating2);
                                            }
                                        }
                                        ArrayList arrayList8 = new ArrayList();
                                        Iterator it10 = arrayList7.iterator();
                                        while (it10.hasNext()) {
                                            Object next2 = it10.next();
                                            if (((Number) next2).doubleValue() > 0.0d) {
                                                arrayList8.add(next2);
                                            }
                                        }
                                        d = new Double(CollectionsKt.O(arrayList8));
                                    }
                                    d = null;
                                }
                                int id5 = mediaPost2.getId();
                                long createdAtTimestamp3 = mediaPost2.getCreatedAtTimestamp();
                                bx7 F3 = uxf.F(event3, context2, true, false, null, null, 60);
                                fy7 J3 = uxf.J(team2, context2, null, false, null, 30);
                                ArrayList arrayList9 = new ArrayList();
                                for (Object obj8 : list3) {
                                    if (((FootballShotmapItem) obj8).isHome() == i6) {
                                        arrayList9.add(obj8);
                                    }
                                }
                                gv9 W = l6g.W(arrayList9);
                                if (i6 == 0) {
                                    if (eventStatisticsItem2 != null) {
                                        away$default = EventStatisticsItem.getHome$default(eventStatisticsItem2, null, 1, null);
                                        str11 = away$default;
                                    }
                                    str11 = null;
                                } else {
                                    if (eventStatisticsItem2 != null) {
                                        away$default = EventStatisticsItem.getAway$default(eventStatisticsItem2, null, 1, null);
                                        str11 = away$default;
                                    }
                                    str11 = null;
                                }
                                if (i6 == 0) {
                                    if (eventStatisticsItem3 != null) {
                                        away$default2 = EventStatisticsItem.getHome$default(eventStatisticsItem3, null, 1, null);
                                        str12 = away$default2;
                                    }
                                    str12 = null;
                                } else {
                                    if (eventStatisticsItem3 != null) {
                                        away$default2 = EventStatisticsItem.getAway$default(eventStatisticsItem3, null, 1, null);
                                        str12 = away$default2;
                                    }
                                    str12 = null;
                                }
                                if (i6 == 0) {
                                    if (eventStatisticsItem == null) {
                                        str13 = null;
                                        return new tl8(id5, str10, str9, createdAtTimestamp3, F3, Sports.FOOTBALL, J3, W, str11, str12, str13, i6 == 0 ? vk8.a : vk8.b, (d == null && Double.isNaN(d.doubleValue())) ? null : d, new x43((MediaReactionType) null, 0, 0, (Boolean) null, 31));
                                    }
                                    away$default3 = EventStatisticsItem.getHome$default(eventStatisticsItem, null, 1, null);
                                    str13 = away$default3;
                                    return new tl8(id5, str10, str9, createdAtTimestamp3, F3, Sports.FOOTBALL, J3, W, str11, str12, str13, i6 == 0 ? vk8.a : vk8.b, (d == null && Double.isNaN(d.doubleValue())) ? null : d, new x43((MediaReactionType) null, 0, 0, (Boolean) null, 31));
                                }
                                if (eventStatisticsItem == null) {
                                    str13 = null;
                                    return new tl8(id5, str10, str9, createdAtTimestamp3, F3, Sports.FOOTBALL, J3, W, str11, str12, str13, i6 == 0 ? vk8.a : vk8.b, (d == null && Double.isNaN(d.doubleValue())) ? null : d, new x43((MediaReactionType) null, 0, 0, (Boolean) null, 31));
                                }
                                away$default3 = EventStatisticsItem.getAway$default(eventStatisticsItem, null, 1, null);
                                str13 = away$default3;
                                return new tl8(id5, str10, str9, createdAtTimestamp3, F3, Sports.FOOTBALL, J3, W, str11, str12, str13, i6 == 0 ? vk8.a : vk8.b, (d == null && Double.isNaN(d.doubleValue())) ? null : d, new x43((MediaReactionType) null, 0, 0, (Boolean) null, 31));
                            }
                        }
                    }
                    return lu3Var;
                }
                return av4Var;
            case 2:
                i6 = this.z;
                List<FootballShotmapItem> list4 = this.v;
                ?? r6 = this.u;
                String str19 = this.s;
                str8 = this.r;
                y6a.M(obj);
                list = list4;
                av4Var = null;
                t2 = r6;
                str5 = str19;
                mediaPost2 = mediaPost4;
                T = obj;
                team2 = team4;
                context2 = context4;
                eventStatisticsResponse = (EventStatisticsResponse) T;
                if (eventStatisticsResponse != null) {
                    ArrayList arrayList32 = new ArrayList(k13.r(groups, 10));
                    while (r6.hasNext()) {
                    }
                    ArrayList arrayList42 = new ArrayList();
                    it = arrayList32.iterator();
                    while (it.hasNext()) {
                    }
                    it2 = arrayList42.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                        }
                    }
                    EventStatisticsItem eventStatisticsItem42 = (EventStatisticsItem) obj2;
                    it3 = arrayList42.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                        }
                    }
                    EventStatisticsItem eventStatisticsItem52 = (EventStatisticsItem) obj3;
                    it4 = arrayList42.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                        }
                    }
                    eventStatisticsItem = (EventStatisticsItem) obj4;
                    this.D = event3;
                    this.E = team2;
                    this.r = str8;
                    this.s = str5;
                    this.t = null;
                    this.u = null;
                    this.v = list;
                    this.w = eventStatisticsItem42;
                    this.x = eventStatisticsItem52;
                    this.y = eventStatisticsItem;
                    this.z = i6;
                    this.C = 3;
                    T2 = t2.T(this);
                    if (T2 != lu3Var) {
                    }
                    return lu3Var;
                }
                return av4Var;
            case 3:
                i6 = this.z;
                eventStatisticsItem = this.y;
                EventStatisticsItem eventStatisticsItem6 = this.x;
                EventStatisticsItem eventStatisticsItem7 = this.w;
                list = this.v;
                String str20 = this.s;
                String str21 = this.r;
                y6a.M(obj);
                str10 = str21;
                eventStatisticsItem3 = eventStatisticsItem6;
                str9 = str20;
                mediaPost2 = mediaPost4;
                T2 = obj;
                team2 = team4;
                context2 = context4;
                eventStatisticsItem2 = eventStatisticsItem7;
                List<FootballShotmapItem> list32 = list;
                LineupsResponse lineupsResponse2 = (LineupsResponse) T2;
                if (i6 == 0) {
                }
                int id52 = mediaPost2.getId();
                long createdAtTimestamp32 = mediaPost2.getCreatedAtTimestamp();
                bx7 F32 = uxf.F(event3, context2, true, false, null, null, 60);
                fy7 J32 = uxf.J(team2, context2, null, false, null, 30);
                ArrayList arrayList92 = new ArrayList();
                while (r4.hasNext()) {
                }
                gv9 W2 = l6g.W(arrayList92);
                if (i6 == 0) {
                }
                if (i6 == 0) {
                }
                if (i6 == 0) {
                }
                break;
            case 4:
                int i9 = this.B;
                int i10 = this.A;
                i5 = this.z;
                av4 av4Var3 = this.t;
                String str22 = this.s;
                str7 = this.r;
                y6a.M(obj);
                context3 = context4;
                av4Var2 = av4Var3;
                str6 = str22;
                mediaPost3 = mediaPost4;
                event2 = event3;
                team3 = team4;
                i4 = i9;
                i3 = i10;
                av4Var = null;
                w3 = obj;
                seasonShotActionAreaResponse = (SeasonShotActionAreaResponse) yaa.x((x2g) w3);
                if (seasonShotActionAreaResponse != null) {
                    this.D = event2;
                    this.E = team3;
                    this.r = str7;
                    this.s = str6;
                    this.t = av4Var;
                    this.u = av4Var;
                    this.v = shotActionAreas;
                    this.z = i5;
                    this.A = i3;
                    this.B = i4;
                    this.C = 5;
                    T3 = av4Var2.T(this);
                    if (T3 != lu3Var) {
                    }
                    return lu3Var;
                }
                return av4Var;
            case 5:
                shotActionAreas = this.v;
                String str23 = this.s;
                String str24 = this.r;
                y6a.M(obj);
                str14 = str24;
                str15 = str23;
                event2 = event3;
                team3 = team4;
                av4Var = null;
                context3 = context4;
                mediaPost3 = mediaPost4;
                T3 = obj;
                teamEventShotmapResponse = (TeamEventShotmapResponse) yaa.x((x2g) T3);
                if (teamEventShotmapResponse != null) {
                    zve zveVar2 = new zve();
                    it5 = shotmap2.iterator();
                    while (it5.hasNext()) {
                    }
                    Context context52 = context3;
                    return new ss1(mediaPost3.getId(), str14, str15, mediaPost3.getCreatedAtTimestamp(), uxf.F(event2, context52, true, false, null, null, 60), Sports.BASKETBALL, uxf.J(team3, context52, null, false, null, 30), zveVar2, new se5(shotActionAreas), new x43((MediaReactionType) null, 0, 0, (Boolean) null, 31));
                }
                return av4Var;
            case 6:
                i2 = this.z;
                String str25 = this.s;
                String str26 = this.r;
                y6a.M(obj);
                str4 = str26;
                str3 = str25;
                team = team4;
                context = context4;
                mediaPost = mediaPost4;
                w = obj;
                list2 = (List) yaa.x((x2g) w);
                if (list2 != null) {
                }
                return null;
            default:
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
