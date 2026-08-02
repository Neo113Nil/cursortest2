package defpackage;

import android.content.Context;
import com.sofascore.model.Money;
import com.sofascore.model.fantasy.FantasyLeagueConfig;
import com.sofascore.model.fantasy.FantasyPlayerEventStatistics;
import com.sofascore.model.fantasy.FantasyPlayerStatistic;
import com.sofascore.model.fantasy.FantasyPointsCalculatorItem;
import com.sofascore.model.fantasy.FantasyPointsForEventResponse;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Incident;
import com.sofascore.model.mvvm.model.Lineups;
import com.sofascore.model.mvvm.model.Manager;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.PlayerData;
import com.sofascore.model.mvvm.model.PlayerDataInfo;
import com.sofascore.model.mvvm.model.SeasonRatingBreakdown;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.network.response.AveragePositionsResponse;
import com.sofascore.model.network.response.EventManagersResponse;
import com.sofascore.model.network.response.EventStatisticsResponse;
import com.sofascore.model.network.response.FootballPlayerEventStatistics;
import com.sofascore.model.network.response.LineupsResponse;
import com.sofascore.model.network.response.PlayerEventStatistics;
import com.sofascore.model.network.response.TeamAverageRatingVersion;
import com.sofascore.model.newNetwork.EventBestPlayer;
import com.sofascore.model.newNetwork.EventBestPlayersSummaryResponse;
import com.sofascore.model.newNetwork.EventIncidentsResponse;
import com.sofascore.model.newNetwork.statistics.season.team.FootballTeamSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.team.TeamSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.team.TeamSeasonStatisticsResponse;
import com.sofascore.results.R;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class o06 extends hoi implements Function2 {
    public EventIncidentsResponse A;
    public FootballTeamSeasonStatistics B;
    public FootballTeamSeasonStatistics C;
    public Double D;
    public Double E;
    public TeamAverageRatingVersion F;
    public EventStatisticsResponse G;
    public AveragePositionsResponse H;
    public EventBestPlayersSummaryResponse I;
    public FantasyPointsForEventResponse J;
    public int K;
    public int L;
    public /* synthetic */ Object M;
    public final /* synthetic */ Event N;
    public final /* synthetic */ p06 O;
    public zu4 r;
    public av4 s;
    public zu4 t;
    public zu4 u;
    public zu4 v;
    public zu4 w;
    public zu4 x;
    public zu4 y;
    public EventManagersResponse z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o06(rq3 rq3Var, p06 p06Var, Event event) {
        super(2, rq3Var);
        this.N = event;
        this.O = p06Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        o06 o06Var = new o06(rq3Var, this.O, this.N);
        o06Var.M = obj;
        return o06Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o06) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:401:0x043f, code lost:
    
        if (r12 == r9) goto L114;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:166:0x09c8  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0b8a  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0d97  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0da2  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0dce  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0ddf  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0e1d  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0da7  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0d9e  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0d75  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0a9c  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0ec4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0493  */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v73 */
    /* JADX WARN: Type inference failed for: r2v74 */
    /* JADX WARN: Type inference failed for: r2v75, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v80, types: [km5] */
    /* JADX WARN: Type inference failed for: r2v81, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r7v8, types: [zu4] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        av4 t;
        zu4 p;
        av4 p2;
        Object w;
        lu3 lu3Var;
        zu4 zu4Var;
        int i;
        zu4 zu4Var2;
        zu4 zu4Var3;
        zu4 zu4Var4;
        zu4 zu4Var5;
        Object T;
        zu4 zu4Var6;
        zu4 zu4Var7;
        zu4 zu4Var8;
        EventManagersResponse eventManagersResponse;
        zu4 zu4Var9;
        EventIncidentsResponse eventIncidentsResponse;
        Object T2;
        zu4 zu4Var10;
        EventManagersResponse eventManagersResponse2;
        EventIncidentsResponse eventIncidentsResponse2;
        zu4 zu4Var11;
        EventManagersResponse eventManagersResponse3;
        Object obj2;
        FootballTeamSeasonStatistics footballTeamSeasonStatistics;
        Object T3;
        zu4 zu4Var12;
        TeamSeasonStatisticsResponse teamSeasonStatisticsResponse;
        TeamSeasonStatistics teamSeasonStatistics;
        zu4 zu4Var13;
        zu4 zu4Var14;
        zu4 zu4Var15;
        FootballTeamSeasonStatistics footballTeamSeasonStatistics2;
        EventIncidentsResponse eventIncidentsResponse3;
        FootballTeamSeasonStatistics footballTeamSeasonStatistics3;
        p06 p06Var;
        TeamAverageRatingVersion teamAverageRatingVersion;
        TeamAverageRatingVersion avgRatingVersion;
        Event event;
        FootballTeamSeasonStatistics footballTeamSeasonStatistics4;
        EventIncidentsResponse eventIncidentsResponse4;
        FootballTeamSeasonStatistics footballTeamSeasonStatistics5;
        EventManagersResponse eventManagersResponse4;
        Double d;
        Double d2;
        TeamAverageRatingVersion teamAverageRatingVersion2;
        EventStatisticsResponse eventStatisticsResponse;
        Object T4;
        zu4 zu4Var16;
        EventManagersResponse eventManagersResponse5;
        Double d3;
        Double d4;
        FootballTeamSeasonStatistics footballTeamSeasonStatistics6;
        TeamAverageRatingVersion teamAverageRatingVersion3;
        zu4 zu4Var17;
        zu4 zu4Var18;
        TeamSeasonStatisticsResponse teamSeasonStatisticsResponse2;
        EventIncidentsResponse eventIncidentsResponse5;
        EventManagersResponse eventManagersResponse6;
        FootballTeamSeasonStatistics footballTeamSeasonStatistics7;
        FootballTeamSeasonStatistics footballTeamSeasonStatistics8;
        Double d5;
        Double d6;
        TeamAverageRatingVersion teamAverageRatingVersion4;
        EventStatisticsResponse eventStatisticsResponse2;
        AveragePositionsResponse averagePositionsResponse;
        Object T5;
        EventStatisticsResponse eventStatisticsResponse3;
        zu4 zu4Var19;
        zu4 zu4Var20;
        EventManagersResponse eventManagersResponse7;
        FootballTeamSeasonStatistics footballTeamSeasonStatistics9;
        Double d7;
        EventIncidentsResponse eventIncidentsResponse6;
        FootballTeamSeasonStatistics footballTeamSeasonStatistics10;
        Double d8;
        TeamAverageRatingVersion teamAverageRatingVersion5;
        EventStatisticsResponse eventStatisticsResponse4;
        AveragePositionsResponse averagePositionsResponse2;
        EventManagersResponse eventManagersResponse8;
        EventBestPlayersSummaryResponse eventBestPlayersSummaryResponse;
        Object T6;
        EventManagersResponse eventManagersResponse9;
        AveragePositionsResponse averagePositionsResponse3;
        zu4 zu4Var21;
        FootballTeamSeasonStatistics footballTeamSeasonStatistics11;
        EventIncidentsResponse eventIncidentsResponse7;
        Double d9;
        int i2;
        FantasyPointsForEventResponse fantasyPointsForEventResponse;
        Object T7;
        Object T8;
        EventBestPlayersSummaryResponse eventBestPlayersSummaryResponse2;
        AveragePositionsResponse averagePositionsResponse4;
        EventStatisticsResponse eventStatisticsResponse5;
        TeamAverageRatingVersion teamAverageRatingVersion6;
        Double d10;
        Double d11;
        FootballTeamSeasonStatistics footballTeamSeasonStatistics12;
        FootballTeamSeasonStatistics footballTeamSeasonStatistics13;
        LineupsResponse lineupsResponse;
        FantasyPointsForEventResponse fantasyPointsForEventResponse2;
        String str;
        AveragePositionsResponse averagePositionsResponse5;
        EventIncidentsResponse eventIncidentsResponse8;
        Pair pair;
        boolean z;
        Boolean bool;
        boolean E;
        LinkedHashMap linkedHashMap;
        boolean w2;
        c9b c9bVar;
        UniqueTournament uniqueTournament;
        ?? r2;
        List<Incident> incidents;
        String str2;
        String str3;
        List split$default;
        List B0;
        List split$default2;
        List B02;
        long j;
        Iterator it;
        Iterator it2;
        String str4;
        String str5;
        String str6;
        int i3;
        String str7;
        String w3;
        Double kilometersCovered;
        Iterator it3;
        Iterator it4;
        Object obj3;
        String str8;
        Map<Integer, Float> map;
        List<FantasyPlayerEventStatistics> list;
        EventIncidentsResponse eventIncidentsResponse9;
        Float f;
        List<FantasyPlayerStatistic> statistics;
        int i4;
        FantasyPointsCalculatorItem fantasyPointsCalculatorItem;
        EventBestPlayer playerOfTheMatch;
        Player player;
        ku3 ku3Var = (ku3) this.M;
        lu3 lu3Var2 = lu3.a;
        int i5 = this.L;
        int i6 = 2;
        int i7 = 5;
        int i8 = 3;
        p06 p06Var2 = this.O;
        Event event2 = this.N;
        switch (i5) {
            case 0:
                y6a.M(obj);
                rq3 rq3Var = null;
                av4 t2 = xw3.t(ku3Var, null, new m06(p06Var2, event2, rq3Var, i7), 3);
                av4 t3 = xw3.t(ku3Var, null, new m06(p06Var2, event2, rq3Var, i6), 3);
                t = xw3.t(ku3Var, null, new m06(p06Var2, event2, rq3Var, 1), 3);
                ?? r4 = (!ok3.E(event2) || o3a.F(event2.getTournament()) == null || event2.getSeason() == null) ? 0 : 1;
                rq3 rq3Var2 = null;
                av4 p3 = yaa.p(ku3Var, r4, new n06(null, p06Var2, event2));
                p = yaa.p(ku3Var, r4, new l06(null, p06Var2, event2));
                av4 p4 = yaa.p(ku3Var, r4 ^ 1, new m06(p06Var2, event2, rq3Var2, i8));
                av4 p5 = yaa.p(ku3Var, c5n.O(p06Var2.i()), new m06(p06Var2, event2, rq3Var2, 4));
                p2 = yaa.p(ku3Var, ok3.C(event2), new m06(p06Var2, event2, rq3Var2, 6));
                av4 p6 = yaa.p(ku3Var, !ok3.E(event2) && event2.getHasEventPlayerHeatMap() && ok3.y(event2), new m06(p06Var2, event2, null, 0));
                this.M = null;
                this.r = t2;
                this.s = t;
                this.t = p3;
                this.u = p;
                this.v = p4;
                this.w = p5;
                this.x = p2;
                this.y = p6;
                this.K = r4;
                this.L = 1;
                w = t3.w(this);
                lu3 lu3Var3 = lu3.a;
                lu3Var = lu3Var2;
                if (w != lu3Var) {
                    zu4Var = p6;
                    i = r4;
                    zu4Var2 = t2;
                    zu4Var3 = p4;
                    zu4Var4 = p3;
                    zu4Var5 = p5;
                    EventManagersResponse eventManagersResponse10 = (EventManagersResponse) w;
                    this.M = null;
                    this.r = zu4Var2;
                    this.s = null;
                    this.t = zu4Var4;
                    this.u = p;
                    this.v = zu4Var3;
                    this.w = zu4Var5;
                    this.x = p2;
                    this.y = zu4Var;
                    this.z = eventManagersResponse10;
                    this.K = i;
                    this.L = 2;
                    T = t.T(this);
                    if (T != lu3Var) {
                        zu4 zu4Var22 = zu4Var5;
                        zu4Var6 = p2;
                        zu4Var7 = zu4Var22;
                        zu4Var8 = zu4Var;
                        eventManagersResponse = eventManagersResponse10;
                        zu4Var9 = zu4Var2;
                        eventIncidentsResponse = (EventIncidentsResponse) T;
                        if (zu4Var4 != null) {
                            this.M = null;
                            this.r = zu4Var9;
                            this.s = null;
                            this.t = null;
                            this.u = p;
                            this.v = zu4Var3;
                            this.w = zu4Var7;
                            this.x = zu4Var6;
                            this.y = zu4Var8;
                            this.z = eventManagersResponse;
                            this.A = eventIncidentsResponse;
                            this.K = i;
                            this.L = 3;
                            T2 = zu4Var4.T(this);
                            if (T2 != lu3Var) {
                                zu4Var10 = zu4Var7;
                                eventManagersResponse2 = eventManagersResponse;
                                eventIncidentsResponse2 = eventIncidentsResponse;
                                zu4Var11 = zu4Var9;
                                teamSeasonStatisticsResponse = (TeamSeasonStatisticsResponse) T2;
                                if (teamSeasonStatisticsResponse == null) {
                                    Object obj4 = (TeamSeasonStatistics) teamSeasonStatisticsResponse.getStatistics();
                                    eventManagersResponse3 = eventManagersResponse2;
                                    zu4Var7 = zu4Var10;
                                    eventIncidentsResponse = eventIncidentsResponse2;
                                    obj2 = obj4;
                                    zu4Var9 = zu4Var11;
                                    footballTeamSeasonStatistics = obj2 instanceof FootballTeamSeasonStatistics ? (FootballTeamSeasonStatistics) obj2 : null;
                                    if (p != null) {
                                        this.M = null;
                                        this.r = zu4Var9;
                                        this.s = null;
                                        this.t = null;
                                        this.u = null;
                                        this.v = zu4Var3;
                                        this.w = zu4Var7;
                                        this.x = zu4Var6;
                                        this.y = zu4Var8;
                                        this.z = eventManagersResponse3;
                                        this.A = eventIncidentsResponse;
                                        this.B = footballTeamSeasonStatistics;
                                        this.K = i;
                                        this.L = 4;
                                        T3 = p.T(this);
                                        if (T3 != lu3Var) {
                                            zu4Var12 = zu4Var9;
                                            teamSeasonStatisticsResponse2 = (TeamSeasonStatisticsResponse) T3;
                                            if (teamSeasonStatisticsResponse2 == null) {
                                                teamSeasonStatistics = (TeamSeasonStatistics) teamSeasonStatisticsResponse2.getStatistics();
                                                zu4Var9 = zu4Var12;
                                                zu4Var13 = zu4Var7;
                                                zu4Var14 = zu4Var8;
                                                footballTeamSeasonStatistics2 = footballTeamSeasonStatistics;
                                                zu4Var15 = zu4Var6;
                                                eventIncidentsResponse3 = eventIncidentsResponse;
                                                footballTeamSeasonStatistics3 = !(teamSeasonStatistics instanceof FootballTeamSeasonStatistics) ? (FootballTeamSeasonStatistics) teamSeasonStatistics : null;
                                                Double avgRating = footballTeamSeasonStatistics2 == null ? footballTeamSeasonStatistics2.getAvgRating() : null;
                                                Double avgRating2 = footballTeamSeasonStatistics3 == null ? footballTeamSeasonStatistics3.getAvgRating() : null;
                                                if (footballTeamSeasonStatistics2 != null || (avgRatingVersion = footballTeamSeasonStatistics2.getAvgRatingVersion()) == null) {
                                                    if (footballTeamSeasonStatistics3 == null) {
                                                        avgRatingVersion = footballTeamSeasonStatistics3.getAvgRatingVersion();
                                                    } else {
                                                        p06Var = p06Var2;
                                                        teamAverageRatingVersion = null;
                                                        event = event2;
                                                        if (zu4Var3 == null) {
                                                            this.M = null;
                                                            this.r = zu4Var9;
                                                            this.s = null;
                                                            this.t = null;
                                                            this.u = null;
                                                            this.v = null;
                                                            this.w = zu4Var13;
                                                            this.x = zu4Var15;
                                                            this.y = zu4Var14;
                                                            this.z = eventManagersResponse3;
                                                            this.A = eventIncidentsResponse3;
                                                            this.B = footballTeamSeasonStatistics2;
                                                            this.C = footballTeamSeasonStatistics3;
                                                            this.D = avgRating;
                                                            this.E = avgRating2;
                                                            this.F = teamAverageRatingVersion;
                                                            this.K = i;
                                                            this.L = 5;
                                                            T4 = zu4Var3.T(this);
                                                            if (T4 != lu3Var) {
                                                                zu4 zu4Var23 = zu4Var15;
                                                                zu4Var16 = zu4Var14;
                                                                eventManagersResponse5 = eventManagersResponse3;
                                                                d3 = avgRating;
                                                                d4 = avgRating2;
                                                                footballTeamSeasonStatistics6 = footballTeamSeasonStatistics3;
                                                                teamAverageRatingVersion3 = teamAverageRatingVersion;
                                                                zu4Var17 = zu4Var13;
                                                                zu4Var18 = zu4Var23;
                                                                EventStatisticsResponse eventStatisticsResponse6 = (EventStatisticsResponse) T4;
                                                                eventManagersResponse4 = eventManagersResponse5;
                                                                zu4Var14 = zu4Var16;
                                                                zu4Var15 = zu4Var18;
                                                                zu4Var13 = zu4Var17;
                                                                eventStatisticsResponse = eventStatisticsResponse6;
                                                                Double d12 = d4;
                                                                teamAverageRatingVersion2 = teamAverageRatingVersion3;
                                                                eventIncidentsResponse4 = eventIncidentsResponse3;
                                                                footballTeamSeasonStatistics5 = footballTeamSeasonStatistics2;
                                                                footballTeamSeasonStatistics4 = footballTeamSeasonStatistics6;
                                                                d2 = d3;
                                                                d = d12;
                                                                if (zu4Var14 != null) {
                                                                    this.M = null;
                                                                    this.r = zu4Var9;
                                                                    this.s = null;
                                                                    this.t = null;
                                                                    this.u = null;
                                                                    this.v = null;
                                                                    this.w = zu4Var13;
                                                                    this.x = zu4Var15;
                                                                    this.y = null;
                                                                    this.z = eventManagersResponse4;
                                                                    this.A = eventIncidentsResponse4;
                                                                    this.B = footballTeamSeasonStatistics5;
                                                                    this.C = footballTeamSeasonStatistics4;
                                                                    this.D = d2;
                                                                    this.E = d;
                                                                    this.F = teamAverageRatingVersion2;
                                                                    this.G = eventStatisticsResponse;
                                                                    this.K = i;
                                                                    this.L = 6;
                                                                    T5 = zu4Var14.T(this);
                                                                    if (T5 != lu3Var) {
                                                                        EventManagersResponse eventManagersResponse11 = eventManagersResponse4;
                                                                        eventIncidentsResponse5 = eventIncidentsResponse4;
                                                                        eventStatisticsResponse3 = eventStatisticsResponse;
                                                                        zu4Var19 = zu4Var13;
                                                                        zu4Var20 = zu4Var15;
                                                                        eventManagersResponse7 = eventManagersResponse11;
                                                                        zu4 zu4Var24 = zu4Var19;
                                                                        averagePositionsResponse = (AveragePositionsResponse) T5;
                                                                        footballTeamSeasonStatistics7 = footballTeamSeasonStatistics5;
                                                                        footballTeamSeasonStatistics8 = footballTeamSeasonStatistics4;
                                                                        d5 = d2;
                                                                        d6 = d;
                                                                        teamAverageRatingVersion4 = teamAverageRatingVersion2;
                                                                        eventStatisticsResponse2 = eventStatisticsResponse3;
                                                                        eventManagersResponse6 = eventManagersResponse7;
                                                                        zu4Var15 = zu4Var20;
                                                                        zu4Var13 = zu4Var24;
                                                                        if (zu4Var15 != null) {
                                                                            this.M = null;
                                                                            this.r = zu4Var9;
                                                                            this.s = null;
                                                                            this.t = null;
                                                                            this.u = null;
                                                                            this.v = null;
                                                                            this.w = zu4Var13;
                                                                            this.x = null;
                                                                            this.y = null;
                                                                            this.z = eventManagersResponse6;
                                                                            this.A = eventIncidentsResponse5;
                                                                            this.B = footballTeamSeasonStatistics7;
                                                                            this.C = footballTeamSeasonStatistics8;
                                                                            this.D = d5;
                                                                            this.E = d6;
                                                                            this.F = teamAverageRatingVersion4;
                                                                            this.G = eventStatisticsResponse2;
                                                                            this.H = averagePositionsResponse;
                                                                            this.K = i;
                                                                            this.L = 7;
                                                                            T6 = zu4Var15.T(this);
                                                                            if (T6 != lu3Var) {
                                                                                zu4 zu4Var25 = zu4Var13;
                                                                                eventManagersResponse9 = eventManagersResponse6;
                                                                                averagePositionsResponse3 = averagePositionsResponse;
                                                                                zu4Var21 = zu4Var25;
                                                                                zu4 zu4Var26 = zu4Var21;
                                                                                footballTeamSeasonStatistics9 = footballTeamSeasonStatistics7;
                                                                                d7 = d5;
                                                                                eventIncidentsResponse6 = eventIncidentsResponse5;
                                                                                footballTeamSeasonStatistics10 = footballTeamSeasonStatistics8;
                                                                                d8 = d6;
                                                                                teamAverageRatingVersion5 = teamAverageRatingVersion4;
                                                                                eventStatisticsResponse4 = eventStatisticsResponse2;
                                                                                averagePositionsResponse2 = averagePositionsResponse3;
                                                                                eventBestPlayersSummaryResponse = (EventBestPlayersSummaryResponse) T6;
                                                                                eventManagersResponse8 = eventManagersResponse9;
                                                                                zu4Var13 = zu4Var26;
                                                                                if (zu4Var13 != null) {
                                                                                    this.M = null;
                                                                                    this.r = zu4Var9;
                                                                                    this.s = null;
                                                                                    this.t = null;
                                                                                    this.u = null;
                                                                                    this.v = null;
                                                                                    this.w = null;
                                                                                    this.x = null;
                                                                                    this.y = null;
                                                                                    this.z = eventManagersResponse8;
                                                                                    this.A = eventIncidentsResponse6;
                                                                                    this.B = footballTeamSeasonStatistics9;
                                                                                    this.C = footballTeamSeasonStatistics10;
                                                                                    this.D = d7;
                                                                                    this.E = d8;
                                                                                    this.F = teamAverageRatingVersion5;
                                                                                    this.G = eventStatisticsResponse4;
                                                                                    this.H = averagePositionsResponse2;
                                                                                    this.I = eventBestPlayersSummaryResponse;
                                                                                    this.K = i;
                                                                                    this.L = 8;
                                                                                    T7 = zu4Var13.T(this);
                                                                                    break;
                                                                                } else {
                                                                                    footballTeamSeasonStatistics11 = footballTeamSeasonStatistics10;
                                                                                    eventIncidentsResponse7 = eventIncidentsResponse6;
                                                                                    d9 = d7;
                                                                                    i2 = i;
                                                                                    fantasyPointsForEventResponse = null;
                                                                                    this.M = null;
                                                                                    this.r = null;
                                                                                    this.s = null;
                                                                                    this.t = null;
                                                                                    this.u = null;
                                                                                    this.v = null;
                                                                                    this.w = null;
                                                                                    this.x = null;
                                                                                    this.y = null;
                                                                                    this.z = eventManagersResponse8;
                                                                                    this.A = eventIncidentsResponse7;
                                                                                    this.B = footballTeamSeasonStatistics9;
                                                                                    this.C = footballTeamSeasonStatistics11;
                                                                                    this.D = d9;
                                                                                    this.E = d8;
                                                                                    this.F = teamAverageRatingVersion5;
                                                                                    this.G = eventStatisticsResponse4;
                                                                                    this.H = averagePositionsResponse2;
                                                                                    this.I = eventBestPlayersSummaryResponse;
                                                                                    this.J = fantasyPointsForEventResponse;
                                                                                    this.K = i2;
                                                                                    this.L = 9;
                                                                                    T8 = zu4Var9.T(this);
                                                                                    if (T8 != lu3Var) {
                                                                                        eventBestPlayersSummaryResponse2 = eventBestPlayersSummaryResponse;
                                                                                        averagePositionsResponse4 = averagePositionsResponse2;
                                                                                        eventStatisticsResponse5 = eventStatisticsResponse4;
                                                                                        teamAverageRatingVersion6 = teamAverageRatingVersion5;
                                                                                        d10 = d9;
                                                                                        d11 = d8;
                                                                                        footballTeamSeasonStatistics12 = footballTeamSeasonStatistics11;
                                                                                        footballTeamSeasonStatistics13 = footballTeamSeasonStatistics9;
                                                                                        lineupsResponse = (LineupsResponse) T8;
                                                                                        if (lineupsResponse != null) {
                                                                                            return null;
                                                                                        }
                                                                                        p06 p06Var3 = p06Var;
                                                                                        Event event3 = event;
                                                                                        p06Var3.v(event3, lineupsResponse);
                                                                                        Lineups homeLineups$default = LineupsResponse.getHomeLineups$default(lineupsResponse, null, 1, null);
                                                                                        int i9 = 8;
                                                                                        Lineups awayLineups$default = LineupsResponse.getAwayLineups$default(lineupsResponse, null, 1, null);
                                                                                        fab.b(lineupsResponse, eventStatisticsResponse5, d10, d11, teamAverageRatingVersion6);
                                                                                        if (eventIncidentsResponse7 != null) {
                                                                                            dab.a(lineupsResponse, eventIncidentsResponse7.getIncidents());
                                                                                        }
                                                                                        if (eventBestPlayersSummaryResponse2 != null && (playerOfTheMatch = eventBestPlayersSummaryResponse2.getPlayerOfTheMatch()) != null && (player = playerOfTheMatch.getPlayer()) != null) {
                                                                                            dab.c(new Integer(player.getId()).intValue(), lineupsResponse);
                                                                                        }
                                                                                        if (fantasyPointsForEventResponse != null) {
                                                                                            String eventStatusType = fantasyPointsForEventResponse.getEventStatusType();
                                                                                            Map<Integer, Float> playerScores = fantasyPointsForEventResponse.getPlayerScores();
                                                                                            List<FantasyPlayerEventStatistics> playerStatistics = fantasyPointsForEventResponse.getPlayerStatistics();
                                                                                            FantasyLeagueConfig config = fantasyPointsForEventResponse.getConfig();
                                                                                            eventStatusType.getClass();
                                                                                            playerScores.getClass();
                                                                                            fantasyPointsForEventResponse2 = fantasyPointsForEventResponse;
                                                                                            str = "";
                                                                                            averagePositionsResponse5 = averagePositionsResponse4;
                                                                                            Iterator it5 = b.j(LineupsResponse.getHomeLineups$default(lineupsResponse, null, 1, null), LineupsResponse.getAwayLineups$default(lineupsResponse, null, 1, null)).iterator();
                                                                                            while (it5.hasNext()) {
                                                                                                Iterator it6 = ((Lineups) it5.next()).getPlayers().iterator();
                                                                                                while (it6.hasNext()) {
                                                                                                    PlayerData playerData = (PlayerData) it6.next();
                                                                                                    if (eventStatusType.equals(StatusKt.STATUS_NOT_STARTED)) {
                                                                                                        playerData.setFantasyPoints(playerScores.get(Integer.valueOf(playerData.getPlayer().getId())));
                                                                                                    } else if (config != null && playerStatistics != null) {
                                                                                                        Iterator it7 = playerStatistics.iterator();
                                                                                                        while (true) {
                                                                                                            if (it7.hasNext()) {
                                                                                                                obj3 = it7.next();
                                                                                                                it3 = it5;
                                                                                                                it4 = it6;
                                                                                                                if (((FantasyPlayerEventStatistics) obj3).getPlayerId() != playerData.getPlayer().getId()) {
                                                                                                                    it5 = it3;
                                                                                                                    it6 = it4;
                                                                                                                }
                                                                                                            } else {
                                                                                                                it3 = it5;
                                                                                                                it4 = it6;
                                                                                                                obj3 = null;
                                                                                                            }
                                                                                                        }
                                                                                                        FantasyPlayerEventStatistics fantasyPlayerEventStatistics = (FantasyPlayerEventStatistics) obj3;
                                                                                                        if (fantasyPlayerEventStatistics == null || (statistics = fantasyPlayerEventStatistics.getStatistics()) == null) {
                                                                                                            str8 = eventStatusType;
                                                                                                            map = playerScores;
                                                                                                            list = playerStatistics;
                                                                                                            eventIncidentsResponse9 = eventIncidentsResponse7;
                                                                                                            f = null;
                                                                                                        } else {
                                                                                                            str8 = eventStatusType;
                                                                                                            ArrayList arrayList = new ArrayList(k13.r(statistics, 10));
                                                                                                            Iterator it8 = statistics.iterator();
                                                                                                            while (it8.hasNext()) {
                                                                                                                FantasyPlayerStatistic fantasyPlayerStatistic = (FantasyPlayerStatistic) it8.next();
                                                                                                                Iterator it9 = it8;
                                                                                                                String key = fantasyPlayerStatistic.getKey();
                                                                                                                Map<Integer, Float> map2 = playerScores;
                                                                                                                String value = fantasyPlayerStatistic.getValue();
                                                                                                                List<FantasyPlayerEventStatistics> list2 = playerStatistics;
                                                                                                                Map<String, FantasyPointsCalculatorItem> calculator = config.getCalculator();
                                                                                                                EventIncidentsResponse eventIncidentsResponse10 = eventIncidentsResponse7;
                                                                                                                if (calculator == null || (fantasyPointsCalculatorItem = calculator.get(fantasyPlayerStatistic.getKey())) == null) {
                                                                                                                    i4 = 0;
                                                                                                                } else {
                                                                                                                    String fantasyPlayerPosition = fantasyPlayerEventStatistics.getFantasyPlayerPosition();
                                                                                                                    if (fantasyPlayerPosition == null) {
                                                                                                                        fantasyPlayerPosition = str;
                                                                                                                    }
                                                                                                                    i4 = fantasyPointsCalculatorItem.calculatePoints(fantasyPlayerStatistic, fantasyPlayerPosition);
                                                                                                                }
                                                                                                                arrayList.add(new ae7(key, value, i4));
                                                                                                                it8 = it9;
                                                                                                                playerScores = map2;
                                                                                                                playerStatistics = list2;
                                                                                                                eventIncidentsResponse7 = eventIncidentsResponse10;
                                                                                                            }
                                                                                                            map = playerScores;
                                                                                                            list = playerStatistics;
                                                                                                            eventIncidentsResponse9 = eventIncidentsResponse7;
                                                                                                            Iterator it10 = arrayList.iterator();
                                                                                                            int i10 = 0;
                                                                                                            while (it10.hasNext()) {
                                                                                                                i10 += ((ae7) it10.next()).c;
                                                                                                            }
                                                                                                            f = Float.valueOf(i10);
                                                                                                        }
                                                                                                        playerData.setFantasyPoints(f);
                                                                                                        eventStatusType = str8;
                                                                                                        it5 = it3;
                                                                                                        it6 = it4;
                                                                                                        playerScores = map;
                                                                                                        playerStatistics = list;
                                                                                                        eventIncidentsResponse7 = eventIncidentsResponse9;
                                                                                                    }
                                                                                                    it3 = it5;
                                                                                                    it4 = it6;
                                                                                                    str8 = eventStatusType;
                                                                                                    map = playerScores;
                                                                                                    list = playerStatistics;
                                                                                                    eventIncidentsResponse9 = eventIncidentsResponse7;
                                                                                                    eventStatusType = str8;
                                                                                                    it5 = it3;
                                                                                                    it6 = it4;
                                                                                                    playerScores = map;
                                                                                                    playerStatistics = list;
                                                                                                    eventIncidentsResponse7 = eventIncidentsResponse9;
                                                                                                }
                                                                                            }
                                                                                            eventIncidentsResponse8 = eventIncidentsResponse7;
                                                                                            Unit unit = Unit.a;
                                                                                        } else {
                                                                                            fantasyPointsForEventResponse2 = fantasyPointsForEventResponse;
                                                                                            str = "";
                                                                                            averagePositionsResponse5 = averagePositionsResponse4;
                                                                                            eventIncidentsResponse8 = eventIncidentsResponse7;
                                                                                        }
                                                                                        List<PlayerData> players = homeLineups$default.getPlayers();
                                                                                        List<PlayerData> players2 = awayLineups$default.getPlayers();
                                                                                        LinkedHashMap linkedHashMap2 = p06Var3.t;
                                                                                        if (linkedHashMap2.isEmpty()) {
                                                                                            for (PlayerData playerData2 : players) {
                                                                                                String jerseyNumber = playerData2.getJerseyNumber();
                                                                                                if (jerseyNumber != null) {
                                                                                                    linkedHashMap2.put(Integer.valueOf(playerData2.getPlayer().getId()), jerseyNumber);
                                                                                                }
                                                                                            }
                                                                                            for (PlayerData playerData3 : players2) {
                                                                                                String jerseyNumber2 = playerData3.getJerseyNumber();
                                                                                                if (jerseyNumber2 != null) {
                                                                                                    linkedHashMap2.put(Integer.valueOf(playerData3.getPlayer().getId()), jerseyNumber2);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        Context i11 = p06Var3.i();
                                                                                        long startTimestamp = event3.getStartTimestamp();
                                                                                        String eventStatusType2 = fantasyPointsForEventResponse2 != null ? fantasyPointsForEventResponse2.getEventStatusType() : null;
                                                                                        Iterator it11 = b.j(LineupsResponse.getHomeLineups$default(lineupsResponse, null, 1, null), LineupsResponse.getAwayLineups$default(lineupsResponse, null, 1, null)).iterator();
                                                                                        while (it11.hasNext()) {
                                                                                            Iterator it12 = ((Lineups) it11.next()).getPlayers().iterator();
                                                                                            while (it12.hasNext()) {
                                                                                                PlayerData playerData4 = (PlayerData) it12.next();
                                                                                                Long dateOfBirthTimestamp = playerData4.getPlayer().getDateOfBirthTimestamp();
                                                                                                if (dateOfBirthTimestamp != null) {
                                                                                                    long longValue = dateOfBirthTimestamp.longValue() * 1000;
                                                                                                    long v = yaa.v();
                                                                                                    LocalDate o = vxd.o(Instant.ofEpochMilli(longValue));
                                                                                                    LocalDate o2 = vxd.o(Instant.ofEpochMilli(v));
                                                                                                    j = startTimestamp;
                                                                                                    ChronoUnit chronoUnit = ChronoUnit.YEARS;
                                                                                                    it2 = it12;
                                                                                                    it = it11;
                                                                                                    int between = ((int) chronoUnit.between(o, o2)) - ((int) chronoUnit.between(vxd.o(Instant.ofEpochMilli(1000 * j)), Instant.ofEpochMilli(yaa.v()).atZone(ZoneId.systemDefault()).toLocalDate()));
                                                                                                    str4 = i11.getResources().getQuantityString(R.plurals.years_short, between, String.format(dla.d(), "%d", Arrays.copyOf(new Object[]{Integer.valueOf(between)}, 1)));
                                                                                                } else {
                                                                                                    j = startTimestamp;
                                                                                                    it = it11;
                                                                                                    it2 = it12;
                                                                                                    str4 = null;
                                                                                                }
                                                                                                PlayerEventStatistics statistics2 = playerData4.getStatistics();
                                                                                                if (!(statistics2 instanceof FootballPlayerEventStatistics)) {
                                                                                                    statistics2 = null;
                                                                                                }
                                                                                                FootballPlayerEventStatistics footballPlayerEventStatistics = (FootballPlayerEventStatistics) statistics2;
                                                                                                String string = (footballPlayerEventStatistics == null || (kilometersCovered = footballPlayerEventStatistics.getKilometersCovered()) == null) ? null : i11.getString(R.string.kilometers_format, yid.c("%.1f", Double.valueOf(kilometersCovered.doubleValue())));
                                                                                                Money proposedMarketValueRaw = playerData4.getPlayer().getProposedMarketValueRaw();
                                                                                                if (proposedMarketValueRaw != null) {
                                                                                                    Set set = o84.a;
                                                                                                    str5 = o84.a(i11, proposedMarketValueRaw, 0L, 12);
                                                                                                } else {
                                                                                                    str5 = null;
                                                                                                }
                                                                                                Float fantasyPoints = playerData4.getFantasyPoints();
                                                                                                if (fantasyPoints != null) {
                                                                                                    float floatValue = fantasyPoints.floatValue();
                                                                                                    str6 = ph0.v(new String[]{StatusKt.STATUS_NOT_STARTED, StatusKt.STATUS_CANCELED, StatusKt.STATUS_POSTPONED}, eventStatusType2) ? i11.getString(R.string.n_points, String.format(dla.d(), "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(floatValue)}, 1))) : i11.getString(R.string.fantasy_points_short, String.valueOf(wzb.b(floatValue)));
                                                                                                } else {
                                                                                                    str6 = null;
                                                                                                }
                                                                                                if (playerData4.getPlayer().getHeight() != null) {
                                                                                                    i3 = i9;
                                                                                                    w3 = v7a.w(i11, r2.intValue() / 100.0d, (r4 & 4) == 0, false);
                                                                                                    str7 = w3;
                                                                                                } else {
                                                                                                    i3 = i9;
                                                                                                    str7 = null;
                                                                                                }
                                                                                                playerData4.setInfo(new PlayerDataInfo(str4, string, str5, str6, str7));
                                                                                                i9 = i3;
                                                                                                it11 = it;
                                                                                                startTimestamp = j;
                                                                                                it12 = it2;
                                                                                            }
                                                                                        }
                                                                                        cab cabVar = cab.a;
                                                                                        if (ok3.E(event3)) {
                                                                                            List x = ph0.x(new FootballTeamSeasonStatistics[]{footballTeamSeasonStatistics13, footballTeamSeasonStatistics12});
                                                                                            List j2 = cab.j(x, bab.e, bab.f, bab.g, bab.h);
                                                                                            List j3 = cab.j(x, bab.i, bab.j, bab.k);
                                                                                            Pair e = cab.e(footballTeamSeasonStatistics13, j2);
                                                                                            Pair e2 = cab.e(footballTeamSeasonStatistics13, j3);
                                                                                            List list3 = cab.e;
                                                                                            Pair e3 = cab.e(footballTeamSeasonStatistics13, list3);
                                                                                            List list4 = cab.f;
                                                                                            Pair e4 = cab.e(footballTeamSeasonStatistics13, list4);
                                                                                            List list5 = cab.g;
                                                                                            pair = new Pair(new j06(e, e2, e3, e4, cab.e(footballTeamSeasonStatistics13, list5)), new j06(cab.e(footballTeamSeasonStatistics12, j2), cab.e(footballTeamSeasonStatistics12, j3), cab.e(footballTeamSeasonStatistics12, list3), cab.e(footballTeamSeasonStatistics12, list4), cab.e(footballTeamSeasonStatistics12, list5)));
                                                                                        } else {
                                                                                            xbb i12 = cab.i(lineupsResponse, w9b.e, w9b.f, w9b.g, w9b.h);
                                                                                            xbb i13 = cab.i(lineupsResponse, w9b.i, w9b.j, w9b.k);
                                                                                            xbb i14 = cab.i(lineupsResponse, w9b.l, w9b.m);
                                                                                            xbb i15 = cab.i(lineupsResponse, w9b.n, w9b.o);
                                                                                            List<PlayerData> players3 = LineupsResponse.getHomeLineups$default(lineupsResponse, null, 1, null).getPlayers();
                                                                                            List<PlayerData> players4 = LineupsResponse.getAwayLineups$default(lineupsResponse, null, 1, null).getPlayers();
                                                                                            pair = new Pair(new j06(cab.a(players3, i12), cab.a(players3, i13), cab.a(players3, i14), cab.a(players3, i15), null), new j06(cab.a(players4, i12), cab.a(players4, i13), cab.a(players4, i14), cab.a(players4, i15), null));
                                                                                        }
                                                                                        j06 j06Var = (j06) pair.a;
                                                                                        j06 j06Var2 = (j06) pair.b;
                                                                                        k06 c = fab.c(p06Var3.i(), homeLineups$default.getPlayers(), event3.getStartTimestamp(), fantasyPointsForEventResponse2 != null ? fantasyPointsForEventResponse2.getPlayerScores() : null, fantasyPointsForEventResponse2 != null ? fantasyPointsForEventResponse2.getEventStatusType() : null, j06Var);
                                                                                        k06 c2 = fab.c(p06Var3.i(), awayLineups$default.getPlayers(), event3.getStartTimestamp(), fantasyPointsForEventResponse2 != null ? fantasyPointsForEventResponse2.getPlayerScores() : null, fantasyPointsForEventResponse2 != null ? fantasyPointsForEventResponse2.getEventStatusType() : null, j06Var2);
                                                                                        ArrayList w0 = CollectionsKt.w0(awayLineups$default.getPlayers(), homeLineups$default.getPlayers());
                                                                                        if (!w0.isEmpty()) {
                                                                                            Iterator it13 = w0.iterator();
                                                                                            while (it13.hasNext()) {
                                                                                                if (((PlayerData) it13.next()).getAvgRating() != null) {
                                                                                                    z = true;
                                                                                                    Boolean hasEventPlayerStatistics = event3.getHasEventPlayerStatistics();
                                                                                                    bool = Boolean.TRUE;
                                                                                                    boolean c3 = Intrinsics.c(hasEventPlayerStatistics, bool);
                                                                                                    boolean z2 = !c3 || z;
                                                                                                    boolean E2 = ok3.E(event3);
                                                                                                    cab cabVar2 = cab.a;
                                                                                                    E = ok3.E(event3);
                                                                                                    ArrayList w02 = CollectionsKt.w0(LineupsResponse.getAwayLineups$default(lineupsResponse, null, 1, null).getPlayers(), LineupsResponse.getHomeLineups$default(lineupsResponse, null, 1, null).getPlayers());
                                                                                                    if (E) {
                                                                                                        xbb i16 = cab.i(lineupsResponse, w9b.e, w9b.f, w9b.g, w9b.h);
                                                                                                        xbb i17 = cab.i(lineupsResponse, w9b.i, w9b.j, w9b.k);
                                                                                                        xbb i18 = cab.i(lineupsResponse, w9b.l, w9b.m);
                                                                                                        xbb i19 = cab.i(lineupsResponse, w9b.n, w9b.o);
                                                                                                        int c4 = sub.c(k13.r(w02, 10));
                                                                                                        LinkedHashMap linkedHashMap3 = new LinkedHashMap(c4 >= 16 ? c4 : 16);
                                                                                                        Iterator it14 = w02.iterator();
                                                                                                        while (it14.hasNext()) {
                                                                                                            PlayerData playerData5 = (PlayerData) it14.next();
                                                                                                            Integer valueOf = Integer.valueOf(playerData5.getPlayer().getId());
                                                                                                            boolean z3 = E2;
                                                                                                            PlayerEventStatistics statistics3 = playerData5.getStatistics();
                                                                                                            boolean z4 = c3;
                                                                                                            if (!(statistics3 instanceof FootballPlayerEventStatistics)) {
                                                                                                                statistics3 = null;
                                                                                                            }
                                                                                                            FootballPlayerEventStatistics footballPlayerEventStatistics2 = (FootballPlayerEventStatistics) statistics3;
                                                                                                            x9b b = cab.b(playerData5, i16, footballPlayerEventStatistics2 != null ? footballPlayerEventStatistics2.getShotValueNormalized() : null);
                                                                                                            PlayerEventStatistics statistics4 = playerData5.getStatistics();
                                                                                                            if (!(statistics4 instanceof FootballPlayerEventStatistics)) {
                                                                                                                statistics4 = null;
                                                                                                            }
                                                                                                            FootballPlayerEventStatistics footballPlayerEventStatistics3 = (FootballPlayerEventStatistics) statistics4;
                                                                                                            x9b b2 = cab.b(playerData5, i17, footballPlayerEventStatistics3 != null ? footballPlayerEventStatistics3.getPassValueNormalized() : null);
                                                                                                            PlayerEventStatistics statistics5 = playerData5.getStatistics();
                                                                                                            if (!(statistics5 instanceof FootballPlayerEventStatistics)) {
                                                                                                                statistics5 = null;
                                                                                                            }
                                                                                                            FootballPlayerEventStatistics footballPlayerEventStatistics4 = (FootballPlayerEventStatistics) statistics5;
                                                                                                            x9b b3 = cab.b(playerData5, i18, footballPlayerEventStatistics4 != null ? footballPlayerEventStatistics4.getDribbleValueNormalized() : null);
                                                                                                            PlayerEventStatistics statistics6 = playerData5.getStatistics();
                                                                                                            if (!(statistics6 instanceof FootballPlayerEventStatistics)) {
                                                                                                                statistics6 = null;
                                                                                                            }
                                                                                                            FootballPlayerEventStatistics footballPlayerEventStatistics5 = (FootballPlayerEventStatistics) statistics6;
                                                                                                            linkedHashMap3.put(valueOf, new y9b(b, b2, b3, cab.b(playerData5, i19, footballPlayerEventStatistics5 != null ? footballPlayerEventStatistics5.getDefensiveValueNormalized() : null), null, lineupsResponse.getHasRatingComponents()));
                                                                                                            E2 = z3;
                                                                                                            c3 = z4;
                                                                                                        }
                                                                                                        linkedHashMap = linkedHashMap3;
                                                                                                    } else {
                                                                                                        List h = cab.h(w02, aab.XG, aab.XGOT, aab.TotalShots, aab.ShotsOnTarget);
                                                                                                        List h2 = cab.h(w02, aab.XA, aab.AccuratePasses, aab.KeyPasses);
                                                                                                        int c5 = sub.c(k13.r(w02, 10));
                                                                                                        linkedHashMap = new LinkedHashMap(c5 >= 16 ? c5 : 16);
                                                                                                        Iterator it15 = w02.iterator();
                                                                                                        while (it15.hasNext()) {
                                                                                                            PlayerData playerData6 = (PlayerData) it15.next();
                                                                                                            Integer valueOf2 = Integer.valueOf(playerData6.getPlayer().getId());
                                                                                                            SeasonRatingBreakdown seasonRatingBreakdown = playerData6.getSeasonRatingBreakdown();
                                                                                                            if (seasonRatingBreakdown == null) {
                                                                                                                seasonRatingBreakdown = new SeasonRatingBreakdown((SeasonRatingBreakdown.Shot) null, (SeasonRatingBreakdown.Pass) null, (SeasonRatingBreakdown.Dribble) null, (SeasonRatingBreakdown.Defending) null, (SeasonRatingBreakdown.Goalkeeping) null, 31, (DefaultConstructorMarker) null);
                                                                                                            }
                                                                                                            boolean hasRatingComponents = lineupsResponse.getHasRatingComponents();
                                                                                                            SeasonRatingBreakdown.Shot shot = seasonRatingBreakdown.getShot();
                                                                                                            x9b c6 = cab.c(seasonRatingBreakdown, shot != null ? shot.getValue() : null, h);
                                                                                                            SeasonRatingBreakdown.Pass pass = seasonRatingBreakdown.getPass();
                                                                                                            x9b c7 = cab.c(seasonRatingBreakdown, pass != null ? pass.getValue() : null, h2);
                                                                                                            SeasonRatingBreakdown.Dribble dribble = seasonRatingBreakdown.getDribble();
                                                                                                            x9b c8 = cab.c(seasonRatingBreakdown, dribble != null ? dribble.getValue() : null, cab.b);
                                                                                                            SeasonRatingBreakdown.Defending defending = seasonRatingBreakdown.getDefending();
                                                                                                            x9b c9 = cab.c(seasonRatingBreakdown, defending != null ? defending.getValue() : null, cab.c);
                                                                                                            SeasonRatingBreakdown.Goalkeeping goalkeeping = seasonRatingBreakdown.getGoalkeeping();
                                                                                                            linkedHashMap.put(valueOf2, new y9b(c6, c7, c8, c9, cab.c(seasonRatingBreakdown, goalkeeping != null ? goalkeeping.getValue() : null, cab.d), hasRatingComponents));
                                                                                                        }
                                                                                                    }
                                                                                                    boolean z5 = E2;
                                                                                                    boolean z6 = c3;
                                                                                                    w2 = ufa.w(event3, lineupsResponse);
                                                                                                    p06Var3.v = w2;
                                                                                                    if (Boolean.valueOf(w2).equals(bool)) {
                                                                                                        c9bVar = null;
                                                                                                    } else {
                                                                                                        Context i20 = p06Var3.i();
                                                                                                        String eventStatusType3 = fantasyPointsForEventResponse2 != null ? fantasyPointsForEventResponse2.getEventStatusType() : null;
                                                                                                        int id = Event.getHomeTeam$default(event3, null, 1, null).getId();
                                                                                                        int id2 = Event.getAwayTeam$default(event3, null, 1, null).getId();
                                                                                                        String p7 = tba.p(i20, Event.getHomeTeam$default(event3, null, 1, null));
                                                                                                        String p8 = tba.p(i20, Event.getAwayTeam$default(event3, null, 1, null));
                                                                                                        List<PlayerData> players5 = LineupsResponse.getHomeLineups$default(lineupsResponse, null, 1, null).getPlayers();
                                                                                                        ArrayList arrayList2 = new ArrayList(k13.r(players5, 10));
                                                                                                        for (PlayerData playerData7 : players5) {
                                                                                                            arrayList2.add(w8b.c(playerData7, z2, ok3.E(event3), (y9b) linkedHashMap.get(Integer.valueOf(playerData7.getPlayer().getId()))));
                                                                                                        }
                                                                                                        gv9 W = l6g.W(arrayList2);
                                                                                                        List<PlayerData> B03 = CollectionsKt.B0(CollectionsKt.L0(LineupsResponse.getAwayLineups$default(lineupsResponse, null, 1, null).getPlayers(), 11));
                                                                                                        ArrayList arrayList3 = new ArrayList(k13.r(B03, 10));
                                                                                                        for (PlayerData playerData8 : B03) {
                                                                                                            arrayList3.add(w8b.c(playerData8, z2, ok3.E(event3), (y9b) linkedHashMap.get(Integer.valueOf(playerData8.getPlayer().getId()))));
                                                                                                        }
                                                                                                        gv9 W2 = l6g.W(arrayList3);
                                                                                                        String formation = LineupsResponse.getHomeLineups$default(lineupsResponse, null, 1, null).getFormation();
                                                                                                        if (formation != null) {
                                                                                                            if (hkg.c0(i20)) {
                                                                                                                split$default2 = StringsKt__StringsKt.split$default(formation, new String[]{"-"}, false, 0, 6, null);
                                                                                                                formation = (split$default2 == null || (B02 = CollectionsKt.B0(split$default2)) == null) ? str : CollectionsKt.f0(B02, "-", null, null, null, 62);
                                                                                                            }
                                                                                                            str2 = formation;
                                                                                                        } else {
                                                                                                            str2 = null;
                                                                                                        }
                                                                                                        String formation2 = LineupsResponse.getAwayLineups$default(lineupsResponse, null, 1, null).getFormation();
                                                                                                        if (formation2 != null) {
                                                                                                            if (hkg.c0(i20)) {
                                                                                                                split$default = StringsKt__StringsKt.split$default(formation2, new String[]{"-"}, false, 0, 6, null);
                                                                                                                formation2 = (split$default == null || (B0 = CollectionsKt.B0(split$default)) == null) ? str : CollectionsKt.f0(B0, "-", null, null, null, 62);
                                                                                                            }
                                                                                                            str3 = formation2;
                                                                                                        } else {
                                                                                                            str3 = null;
                                                                                                        }
                                                                                                        String formation3 = LineupsResponse.getHomeLineups$default(lineupsResponse, null, 1, null).getFormation();
                                                                                                        Iterable a = formation3 != null ? w8b.a(formation3) : null;
                                                                                                        if (a == null) {
                                                                                                            a = km5.a;
                                                                                                        }
                                                                                                        gv9 W3 = l6g.W(a);
                                                                                                        String formation4 = LineupsResponse.getAwayLineups$default(lineupsResponse, null, 1, null).getFormation();
                                                                                                        List B04 = formation4 != null ? CollectionsKt.B0(w8b.a(formation4)) : null;
                                                                                                        if (B04 == null) {
                                                                                                            B04 = km5.a;
                                                                                                        }
                                                                                                        gv9 W4 = l6g.W(B04);
                                                                                                        int id3 = event3.getId();
                                                                                                        String fancyNumber = LineupsResponse.getHomeLineups$default(lineupsResponse, null, 1, null).getPlayerColor().getFancyNumber();
                                                                                                        m4j m4jVar = m4j.HOME;
                                                                                                        jxe[] jxeVarArr = jxe.a;
                                                                                                        c9bVar = new c9b(id, id2, p7, p8, W, W2, c, c2, str2, str3, W3, W4, w8b.b(id3, fancyNumber, "home"), w8b.b(event3.getId(), LineupsResponse.getAwayLineups$default(lineupsResponse, null, 1, null).getPlayerColor().getFancyNumber(), "away"), Boolean.valueOf(ok3.E(event3)).equals(Boolean.TRUE) ? lineupsResponse.getConfirmed() ? i20.getString(R.string.football_confirmed_lineups) : i20.getString(R.string.football_possible_lineups) : null, eventStatusType3, lineupsResponse.getPregameRatingShown(), lineupsResponse.getFirstTeamAverageRating(), lineupsResponse.getSecondTeamAverageRating(), lineupsResponse.getAvgRatingVersion());
                                                                                                    }
                                                                                                    uniqueTournament = event3.getTournament().getUniqueTournament();
                                                                                                    if (uniqueTournament != null || (r1 = tba.x(uniqueTournament)) == null) {
                                                                                                        String w4 = tba.w(event3.getTournament());
                                                                                                    }
                                                                                                    String str9 = w4;
                                                                                                    Manager homeManager$default = eventManagersResponse8 == null ? EventManagersResponse.getHomeManager$default(eventManagersResponse8, null, 1, null) : null;
                                                                                                    Manager awayManager$default = eventManagersResponse8 == null ? EventManagersResponse.getAwayManager$default(eventManagersResponse8, null, 1, null) : null;
                                                                                                    if (eventIncidentsResponse8 != null || (incidents = eventIncidentsResponse8.getIncidents()) == null) {
                                                                                                        r2 = 0;
                                                                                                    } else {
                                                                                                        r2 = new ArrayList();
                                                                                                        for (Object obj5 : incidents) {
                                                                                                            if (obj5 instanceof Incident.CardIncident) {
                                                                                                                r2.add(obj5);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    if (r2 == 0) {
                                                                                                        r2 = km5.a;
                                                                                                    }
                                                                                                    ArrayList arrayList4 = new ArrayList();
                                                                                                    for (Object obj6 : r2) {
                                                                                                        Manager manager = ((Incident.CardIncident) obj6).getManager();
                                                                                                        if (Intrinsics.c(manager != null ? new Integer(manager.getId()) : null, homeManager$default != null ? new Integer(homeManager$default.getId()) : null)) {
                                                                                                            arrayList4.add(obj6);
                                                                                                        }
                                                                                                    }
                                                                                                    ArrayList arrayList5 = new ArrayList();
                                                                                                    for (Object obj7 : r2) {
                                                                                                        Manager manager2 = ((Incident.CardIncident) obj7).getManager();
                                                                                                        if (Intrinsics.c(manager2 != null ? new Integer(manager2.getId()) : null, awayManager$default != null ? new Integer(awayManager$default.getId()) : null)) {
                                                                                                            arrayList5.add(obj7);
                                                                                                        }
                                                                                                    }
                                                                                                    LinkedHashMap linkedHashMap4 = linkedHashMap;
                                                                                                    boolean z7 = z2;
                                                                                                    gv9 a2 = ek8.a(p06Var3.i(), homeLineups$default.getPlayers(), homeLineups$default.getMissingPlayers(), linkedHashMap4, homeManager$default, arrayList4, p06Var3.v, str9, z7, z5, z6, Event.getHomeTeam$default(event3, null, 1, null).getGender());
                                                                                                    a2.getClass();
                                                                                                    p06Var3.m = a2;
                                                                                                    gv9 a3 = ek8.a(p06Var3.i(), awayLineups$default.getPlayers(), awayLineups$default.getMissingPlayers(), linkedHashMap4, awayManager$default, arrayList5, p06Var3.v, str9, z7, z5, z6, Event.getAwayTeam$default(event3, null, 1, null).getGender());
                                                                                                    a3.getClass();
                                                                                                    p06Var3.n = a3;
                                                                                                    p06Var3.n(new f06(null, new e9b(), null, r8b.b, bnf.d, null, null, false), new ft2(c9bVar, p06Var3, event3, homeLineups$default, awayLineups$default, lineupsResponse, fantasyPointsForEventResponse2, averagePositionsResponse5, 1));
                                                                                                    return lineupsResponse;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        z = false;
                                                                                        Boolean hasEventPlayerStatistics2 = event3.getHasEventPlayerStatistics();
                                                                                        bool = Boolean.TRUE;
                                                                                        boolean c32 = Intrinsics.c(hasEventPlayerStatistics2, bool);
                                                                                        if (c32) {
                                                                                        }
                                                                                        boolean E22 = ok3.E(event3);
                                                                                        cab cabVar22 = cab.a;
                                                                                        E = ok3.E(event3);
                                                                                        ArrayList w022 = CollectionsKt.w0(LineupsResponse.getAwayLineups$default(lineupsResponse, null, 1, null).getPlayers(), LineupsResponse.getHomeLineups$default(lineupsResponse, null, 1, null).getPlayers());
                                                                                        if (E) {
                                                                                        }
                                                                                        boolean z52 = E22;
                                                                                        boolean z62 = c32;
                                                                                        w2 = ufa.w(event3, lineupsResponse);
                                                                                        p06Var3.v = w2;
                                                                                        if (Boolean.valueOf(w2).equals(bool)) {
                                                                                        }
                                                                                        uniqueTournament = event3.getTournament().getUniqueTournament();
                                                                                        if (uniqueTournament != null) {
                                                                                        }
                                                                                        String w42 = tba.w(event3.getTournament());
                                                                                        String str92 = w42;
                                                                                        if (eventManagersResponse8 == null) {
                                                                                        }
                                                                                        if (eventManagersResponse8 == null) {
                                                                                        }
                                                                                        if (eventIncidentsResponse8 != null) {
                                                                                        }
                                                                                        r2 = 0;
                                                                                        if (r2 == 0) {
                                                                                        }
                                                                                        ArrayList arrayList42 = new ArrayList();
                                                                                        while (r3.hasNext()) {
                                                                                        }
                                                                                        ArrayList arrayList52 = new ArrayList();
                                                                                        while (r2.hasNext()) {
                                                                                        }
                                                                                        LinkedHashMap linkedHashMap42 = linkedHashMap;
                                                                                        boolean z72 = z2;
                                                                                        gv9 a22 = ek8.a(p06Var3.i(), homeLineups$default.getPlayers(), homeLineups$default.getMissingPlayers(), linkedHashMap42, homeManager$default, arrayList42, p06Var3.v, str92, z72, z52, z62, Event.getHomeTeam$default(event3, null, 1, null).getGender());
                                                                                        a22.getClass();
                                                                                        p06Var3.m = a22;
                                                                                        gv9 a32 = ek8.a(p06Var3.i(), awayLineups$default.getPlayers(), awayLineups$default.getMissingPlayers(), linkedHashMap42, awayManager$default, arrayList52, p06Var3.v, str92, z72, z52, z62, Event.getAwayTeam$default(event3, null, 1, null).getGender());
                                                                                        a32.getClass();
                                                                                        p06Var3.n = a32;
                                                                                        p06Var3.n(new f06(null, new e9b(), null, r8b.b, bnf.d, null, null, false), new ft2(c9bVar, p06Var3, event3, homeLineups$default, awayLineups$default, lineupsResponse, fantasyPointsForEventResponse2, averagePositionsResponse5, 1));
                                                                                        return lineupsResponse;
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else {
                                                                            AveragePositionsResponse averagePositionsResponse6 = averagePositionsResponse;
                                                                            footballTeamSeasonStatistics9 = footballTeamSeasonStatistics7;
                                                                            d7 = d5;
                                                                            eventIncidentsResponse6 = eventIncidentsResponse5;
                                                                            footballTeamSeasonStatistics10 = footballTeamSeasonStatistics8;
                                                                            d8 = d6;
                                                                            teamAverageRatingVersion5 = teamAverageRatingVersion4;
                                                                            eventStatisticsResponse4 = eventStatisticsResponse2;
                                                                            averagePositionsResponse2 = averagePositionsResponse6;
                                                                            eventManagersResponse8 = eventManagersResponse6;
                                                                            eventBestPlayersSummaryResponse = null;
                                                                            if (zu4Var13 != null) {
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    EventManagersResponse eventManagersResponse12 = eventManagersResponse4;
                                                                    eventIncidentsResponse5 = eventIncidentsResponse4;
                                                                    eventManagersResponse6 = eventManagersResponse12;
                                                                    footballTeamSeasonStatistics7 = footballTeamSeasonStatistics5;
                                                                    footballTeamSeasonStatistics8 = footballTeamSeasonStatistics4;
                                                                    d5 = d2;
                                                                    d6 = d;
                                                                    teamAverageRatingVersion4 = teamAverageRatingVersion2;
                                                                    eventStatisticsResponse2 = eventStatisticsResponse;
                                                                    averagePositionsResponse = null;
                                                                    if (zu4Var15 != null) {
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            FootballTeamSeasonStatistics footballTeamSeasonStatistics14 = footballTeamSeasonStatistics2;
                                                            footballTeamSeasonStatistics4 = footballTeamSeasonStatistics3;
                                                            eventIncidentsResponse4 = eventIncidentsResponse3;
                                                            footballTeamSeasonStatistics5 = footballTeamSeasonStatistics14;
                                                            eventManagersResponse4 = eventManagersResponse3;
                                                            d = avgRating2;
                                                            d2 = avgRating;
                                                            teamAverageRatingVersion2 = teamAverageRatingVersion;
                                                            eventStatisticsResponse = null;
                                                            if (zu4Var14 != null) {
                                                            }
                                                        }
                                                    }
                                                }
                                                TeamAverageRatingVersion teamAverageRatingVersion7 = avgRatingVersion;
                                                p06Var = p06Var2;
                                                teamAverageRatingVersion = teamAverageRatingVersion7;
                                                event = event2;
                                                if (zu4Var3 == null) {
                                                }
                                            } else {
                                                zu4Var9 = zu4Var12;
                                            }
                                        }
                                    }
                                    teamSeasonStatistics = null;
                                    zu4Var13 = zu4Var7;
                                    zu4Var14 = zu4Var8;
                                    zu4Var15 = zu4Var6;
                                    footballTeamSeasonStatistics2 = footballTeamSeasonStatistics;
                                    eventIncidentsResponse3 = eventIncidentsResponse;
                                    if (!(teamSeasonStatistics instanceof FootballTeamSeasonStatistics)) {
                                    }
                                    if (footballTeamSeasonStatistics2 == null) {
                                    }
                                    if (footballTeamSeasonStatistics3 == null) {
                                    }
                                    if (footballTeamSeasonStatistics2 != null) {
                                    }
                                    if (footballTeamSeasonStatistics3 == null) {
                                    }
                                } else {
                                    EventIncidentsResponse eventIncidentsResponse11 = eventIncidentsResponse2;
                                    eventManagersResponse = eventManagersResponse2;
                                    zu4Var7 = zu4Var10;
                                    eventIncidentsResponse = eventIncidentsResponse11;
                                    zu4Var9 = zu4Var11;
                                }
                            }
                        }
                        eventManagersResponse3 = eventManagersResponse;
                        obj2 = null;
                        if (obj2 instanceof FootballTeamSeasonStatistics) {
                        }
                        if (p != null) {
                        }
                        teamSeasonStatistics = null;
                        zu4Var13 = zu4Var7;
                        zu4Var14 = zu4Var8;
                        zu4Var15 = zu4Var6;
                        footballTeamSeasonStatistics2 = footballTeamSeasonStatistics;
                        eventIncidentsResponse3 = eventIncidentsResponse;
                        if (!(teamSeasonStatistics instanceof FootballTeamSeasonStatistics)) {
                        }
                        if (footballTeamSeasonStatistics2 == null) {
                        }
                        if (footballTeamSeasonStatistics3 == null) {
                        }
                        if (footballTeamSeasonStatistics2 != null) {
                        }
                        if (footballTeamSeasonStatistics3 == null) {
                        }
                    }
                }
                return lu3Var;
            case 1:
                i = this.K;
                zu4Var = this.y;
                ?? r7 = this.x;
                zu4Var5 = this.w;
                zu4Var3 = this.v;
                p = this.u;
                zu4Var4 = this.t;
                t = this.s;
                zu4Var2 = this.r;
                y6a.M(obj);
                lu3Var = lu3Var2;
                p2 = r7;
                w = obj;
                EventManagersResponse eventManagersResponse102 = (EventManagersResponse) w;
                this.M = null;
                this.r = zu4Var2;
                this.s = null;
                this.t = zu4Var4;
                this.u = p;
                this.v = zu4Var3;
                this.w = zu4Var5;
                this.x = p2;
                this.y = zu4Var;
                this.z = eventManagersResponse102;
                this.K = i;
                this.L = 2;
                T = t.T(this);
                if (T != lu3Var) {
                }
                return lu3Var;
            case 2:
                i = this.K;
                eventManagersResponse = this.z;
                zu4 zu4Var27 = this.y;
                zu4 zu4Var28 = this.x;
                zu4 zu4Var29 = this.w;
                zu4Var3 = this.v;
                p = this.u;
                zu4Var4 = this.t;
                zu4Var9 = this.r;
                y6a.M(obj);
                lu3Var = lu3Var2;
                zu4Var7 = zu4Var29;
                zu4Var6 = zu4Var28;
                zu4Var8 = zu4Var27;
                T = obj;
                eventIncidentsResponse = (EventIncidentsResponse) T;
                if (zu4Var4 != null) {
                }
                eventManagersResponse3 = eventManagersResponse;
                obj2 = null;
                if (obj2 instanceof FootballTeamSeasonStatistics) {
                }
                if (p != null) {
                }
                teamSeasonStatistics = null;
                zu4Var13 = zu4Var7;
                zu4Var14 = zu4Var8;
                zu4Var15 = zu4Var6;
                footballTeamSeasonStatistics2 = footballTeamSeasonStatistics;
                eventIncidentsResponse3 = eventIncidentsResponse;
                if (!(teamSeasonStatistics instanceof FootballTeamSeasonStatistics)) {
                }
                if (footballTeamSeasonStatistics2 == null) {
                }
                if (footballTeamSeasonStatistics3 == null) {
                }
                if (footballTeamSeasonStatistics2 != null) {
                }
                if (footballTeamSeasonStatistics3 == null) {
                }
                break;
            case 3:
                i = this.K;
                eventIncidentsResponse2 = this.A;
                EventManagersResponse eventManagersResponse13 = this.z;
                zu4Var8 = this.y;
                zu4Var6 = this.x;
                zu4 zu4Var30 = this.w;
                zu4Var3 = this.v;
                p = this.u;
                zu4Var11 = this.r;
                y6a.M(obj);
                zu4Var10 = zu4Var30;
                lu3Var = lu3Var2;
                eventManagersResponse2 = eventManagersResponse13;
                T2 = obj;
                teamSeasonStatisticsResponse = (TeamSeasonStatisticsResponse) T2;
                if (teamSeasonStatisticsResponse == null) {
                }
                break;
            case 4:
                i = this.K;
                footballTeamSeasonStatistics = this.B;
                eventIncidentsResponse = this.A;
                eventManagersResponse3 = this.z;
                zu4Var8 = this.y;
                zu4Var6 = this.x;
                zu4 zu4Var31 = this.w;
                zu4Var3 = this.v;
                zu4Var12 = this.r;
                y6a.M(obj);
                lu3Var = lu3Var2;
                zu4Var7 = zu4Var31;
                T3 = obj;
                teamSeasonStatisticsResponse2 = (TeamSeasonStatisticsResponse) T3;
                if (teamSeasonStatisticsResponse2 == null) {
                }
                break;
            case 5:
                i = this.K;
                teamAverageRatingVersion3 = this.F;
                d4 = this.E;
                d3 = this.D;
                footballTeamSeasonStatistics6 = this.C;
                footballTeamSeasonStatistics2 = this.B;
                eventIncidentsResponse3 = this.A;
                EventManagersResponse eventManagersResponse14 = this.z;
                zu4 zu4Var32 = this.y;
                zu4 zu4Var33 = this.x;
                zu4 zu4Var34 = this.w;
                zu4Var9 = this.r;
                y6a.M(obj);
                lu3Var = lu3Var2;
                eventManagersResponse5 = eventManagersResponse14;
                p06Var = p06Var2;
                event = event2;
                zu4Var17 = zu4Var34;
                zu4Var18 = zu4Var33;
                zu4Var16 = zu4Var32;
                T4 = obj;
                EventStatisticsResponse eventStatisticsResponse62 = (EventStatisticsResponse) T4;
                eventManagersResponse4 = eventManagersResponse5;
                zu4Var14 = zu4Var16;
                zu4Var15 = zu4Var18;
                zu4Var13 = zu4Var17;
                eventStatisticsResponse = eventStatisticsResponse62;
                Double d122 = d4;
                teamAverageRatingVersion2 = teamAverageRatingVersion3;
                eventIncidentsResponse4 = eventIncidentsResponse3;
                footballTeamSeasonStatistics5 = footballTeamSeasonStatistics2;
                footballTeamSeasonStatistics4 = footballTeamSeasonStatistics6;
                d2 = d3;
                d = d122;
                if (zu4Var14 != null) {
                }
                break;
            case 6:
                i = this.K;
                eventStatisticsResponse3 = this.G;
                teamAverageRatingVersion2 = this.F;
                d = this.E;
                d2 = this.D;
                footballTeamSeasonStatistics4 = this.C;
                footballTeamSeasonStatistics5 = this.B;
                EventIncidentsResponse eventIncidentsResponse12 = this.A;
                EventManagersResponse eventManagersResponse15 = this.z;
                zu4 zu4Var35 = this.x;
                zu4 zu4Var36 = this.w;
                zu4Var9 = this.r;
                y6a.M(obj);
                p06Var = p06Var2;
                event = event2;
                zu4Var19 = zu4Var36;
                zu4Var20 = zu4Var35;
                eventManagersResponse7 = eventManagersResponse15;
                eventIncidentsResponse5 = eventIncidentsResponse12;
                lu3Var = lu3Var2;
                T5 = obj;
                zu4 zu4Var242 = zu4Var19;
                averagePositionsResponse = (AveragePositionsResponse) T5;
                footballTeamSeasonStatistics7 = footballTeamSeasonStatistics5;
                footballTeamSeasonStatistics8 = footballTeamSeasonStatistics4;
                d5 = d2;
                d6 = d;
                teamAverageRatingVersion4 = teamAverageRatingVersion2;
                eventStatisticsResponse2 = eventStatisticsResponse3;
                eventManagersResponse6 = eventManagersResponse7;
                zu4Var15 = zu4Var20;
                zu4Var13 = zu4Var242;
                if (zu4Var15 != null) {
                }
                break;
            case 7:
                i = this.K;
                averagePositionsResponse3 = this.H;
                eventStatisticsResponse2 = this.G;
                teamAverageRatingVersion4 = this.F;
                d6 = this.E;
                d5 = this.D;
                footballTeamSeasonStatistics8 = this.C;
                FootballTeamSeasonStatistics footballTeamSeasonStatistics15 = this.B;
                eventIncidentsResponse5 = this.A;
                EventManagersResponse eventManagersResponse16 = this.z;
                zu4 zu4Var37 = this.w;
                zu4Var9 = this.r;
                y6a.M(obj);
                lu3Var = lu3Var2;
                footballTeamSeasonStatistics7 = footballTeamSeasonStatistics15;
                p06Var = p06Var2;
                event = event2;
                zu4Var21 = zu4Var37;
                eventManagersResponse9 = eventManagersResponse16;
                T6 = obj;
                zu4 zu4Var262 = zu4Var21;
                footballTeamSeasonStatistics9 = footballTeamSeasonStatistics7;
                d7 = d5;
                eventIncidentsResponse6 = eventIncidentsResponse5;
                footballTeamSeasonStatistics10 = footballTeamSeasonStatistics8;
                d8 = d6;
                teamAverageRatingVersion5 = teamAverageRatingVersion4;
                eventStatisticsResponse4 = eventStatisticsResponse2;
                averagePositionsResponse2 = averagePositionsResponse3;
                eventBestPlayersSummaryResponse = (EventBestPlayersSummaryResponse) T6;
                eventManagersResponse8 = eventManagersResponse9;
                zu4Var13 = zu4Var262;
                if (zu4Var13 != null) {
                }
                break;
            case 8:
                i = this.K;
                eventBestPlayersSummaryResponse = this.I;
                averagePositionsResponse2 = this.H;
                eventStatisticsResponse4 = this.G;
                teamAverageRatingVersion5 = this.F;
                d8 = this.E;
                Double d13 = this.D;
                footballTeamSeasonStatistics10 = this.C;
                FootballTeamSeasonStatistics footballTeamSeasonStatistics16 = this.B;
                eventIncidentsResponse6 = this.A;
                eventManagersResponse8 = this.z;
                zu4 zu4Var38 = this.r;
                y6a.M(obj);
                lu3Var = lu3Var2;
                d7 = d13;
                p06Var = p06Var2;
                event = event2;
                footballTeamSeasonStatistics9 = footballTeamSeasonStatistics16;
                zu4Var9 = zu4Var38;
                T7 = obj;
                Double d14 = d7;
                i2 = i;
                fantasyPointsForEventResponse = (FantasyPointsForEventResponse) T7;
                footballTeamSeasonStatistics11 = footballTeamSeasonStatistics10;
                eventIncidentsResponse7 = eventIncidentsResponse6;
                d9 = d14;
                this.M = null;
                this.r = null;
                this.s = null;
                this.t = null;
                this.u = null;
                this.v = null;
                this.w = null;
                this.x = null;
                this.y = null;
                this.z = eventManagersResponse8;
                this.A = eventIncidentsResponse7;
                this.B = footballTeamSeasonStatistics9;
                this.C = footballTeamSeasonStatistics11;
                this.D = d9;
                this.E = d8;
                this.F = teamAverageRatingVersion5;
                this.G = eventStatisticsResponse4;
                this.H = averagePositionsResponse2;
                this.I = eventBestPlayersSummaryResponse;
                this.J = fantasyPointsForEventResponse;
                this.K = i2;
                this.L = 9;
                T8 = zu4Var9.T(this);
                if (T8 != lu3Var) {
                }
                return lu3Var;
            case 9:
                fantasyPointsForEventResponse = this.J;
                eventBestPlayersSummaryResponse2 = this.I;
                averagePositionsResponse4 = this.H;
                eventStatisticsResponse5 = this.G;
                teamAverageRatingVersion6 = this.F;
                d11 = this.E;
                d10 = this.D;
                footballTeamSeasonStatistics12 = this.C;
                footballTeamSeasonStatistics13 = this.B;
                eventIncidentsResponse7 = this.A;
                EventManagersResponse eventManagersResponse17 = this.z;
                y6a.M(obj);
                eventManagersResponse8 = eventManagersResponse17;
                p06Var = p06Var2;
                event = event2;
                T8 = obj;
                lineupsResponse = (LineupsResponse) T8;
                if (lineupsResponse != null) {
                }
                break;
            default:
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
