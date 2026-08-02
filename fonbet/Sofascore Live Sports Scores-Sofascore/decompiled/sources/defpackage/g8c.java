package defpackage;

import android.content.Context;
import com.sofascore.model.database.MediaReactionType;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.PlayerData;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.network.response.EventResponse;
import com.sofascore.model.network.response.EventStatisticsResponse;
import com.sofascore.model.network.response.LineupsResponse;
import com.sofascore.model.network.response.TeamAverageRatingVersion;
import com.sofascore.model.newNetwork.mediaposts.MediaPost;
import com.sofascore.model.newNetwork.statistics.season.team.FootballTeamSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.team.TeamSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.team.TeamSeasonStatisticsResponse;
import com.sofascore.results.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class g8c extends hoi implements Function2 {
    public TeamAverageRatingVersion A;
    public Object B;
    public Serializable C;
    public Team D;
    public Team E;
    public String F;
    public bx7 G;
    public String H;
    public iy7 I;
    public int J;
    public int K;
    public int L;
    public int M;
    public long N;
    public int O;
    public /* synthetic */ Object P;
    public final /* synthetic */ MediaPost Q;
    public final /* synthetic */ u8c R;
    public av4 r;
    public LineupsResponse s;
    public Event t;
    public av4 u;
    public zu4 v;
    public zu4 w;
    public FootballTeamSeasonStatistics x;
    public Double y;
    public Double z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g8c(rq3 rq3Var, u8c u8cVar, MediaPost mediaPost) {
        super(2, rq3Var);
        this.Q = mediaPost;
        this.R = u8cVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        g8c g8cVar = new g8c(rq3Var, this.R, this.Q);
        g8cVar.P = obj;
        return g8cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g8c) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x0101, code lost:
    
        if (r10 == r9) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x00e6, code lost:
    
        if (r12 == r9) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0232  */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [int] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [int] */
    /* JADX WARN: Type inference failed for: r7v8, types: [zu4] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int intValue;
        av4 t;
        Object w;
        LineupsResponse lineupsResponse;
        Object T;
        Event event;
        String formation;
        boolean z;
        boolean z2;
        av4 p;
        zu4 p2;
        Event event2;
        boolean z3;
        LineupsResponse lineupsResponse2;
        Event event3;
        Object w2;
        av4 av4Var;
        boolean z4;
        LineupsResponse lineupsResponse3;
        av4 av4Var2;
        zu4 zu4Var;
        ?? r1;
        ?? r2;
        Object obj2;
        FootballTeamSeasonStatistics footballTeamSeasonStatistics;
        Object T2;
        Event event4;
        LineupsResponse lineupsResponse4;
        TeamSeasonStatisticsResponse teamSeasonStatisticsResponse;
        zu4 zu4Var2;
        LineupsResponse lineupsResponse5;
        Object obj3;
        int i;
        int i2;
        FootballTeamSeasonStatistics footballTeamSeasonStatistics2;
        Double avgRating;
        Double avgRating2;
        TeamAverageRatingVersion teamAverageRatingVersion;
        TeamAverageRatingVersion avgRatingVersion;
        fab fabVar;
        int i3;
        Event event5;
        int i4;
        Double d;
        LineupsResponse lineupsResponse6;
        EventStatisticsResponse eventStatisticsResponse;
        Object T3;
        TeamSeasonStatisticsResponse teamSeasonStatisticsResponse2;
        int i5;
        Double d2;
        boolean z5;
        bx7 F;
        Sport sport;
        String str;
        iy7 iy7Var;
        UniqueTournament uniqueTournament;
        Context context;
        String str2;
        Object T4;
        int i6;
        long j;
        Team team;
        String str3;
        Double d3;
        Double d4;
        Team team2;
        int i7;
        int i8;
        u8c u8cVar = this.R;
        Context context2 = u8cVar.a;
        ku3 ku3Var = (ku3) this.P;
        lu3 lu3Var = lu3.a;
        int i9 = this.O;
        int i10 = 5;
        int i11 = 4;
        int i12 = 3;
        MediaPost mediaPost = this.Q;
        rq3 rq3Var = null;
        switch (i9) {
            case 0:
                y6a.M(obj);
                Integer eventId = mediaPost.getEventId();
                if (eventId != null) {
                    intValue = eventId.intValue();
                    t = xw3.t(ku3Var, null, new w7c(u8cVar, intValue, rq3Var, i12), 3);
                    av4 t2 = xw3.t(ku3Var, null, new w7c(u8cVar, intValue, rq3Var, i11), 3);
                    this.P = ku3Var;
                    this.r = t;
                    this.J = intValue;
                    this.O = 1;
                    w = t2.w(this);
                    break;
                }
                return null;
            case 1:
                intValue = this.J;
                t = this.r;
                y6a.M(obj);
                w = obj;
                lineupsResponse = (LineupsResponse) w;
                if (lineupsResponse != null) {
                    this.P = ku3Var;
                    this.r = null;
                    this.s = lineupsResponse;
                    this.J = intValue;
                    this.O = 2;
                    T = t.T(this);
                    break;
                }
                return null;
            case 2:
                intValue = this.J;
                LineupsResponse lineupsResponse7 = this.s;
                y6a.M(obj);
                lineupsResponse = lineupsResponse7;
                T = obj;
                EventResponse eventResponse = (EventResponse) yaa.x((x2g) T);
                if (eventResponse != null && (event = eventResponse.getEvent()) != null && ((!ok3.C(event) || u8cVar.o) && (formation = LineupsResponse.getHomeLineups$default(lineupsResponse, null, 1, null).getFormation()) != null && formation.length() != 0 && LineupsResponse.getHomeLineups$default(lineupsResponse, null, 1, null).getPlayers().size() >= 11)) {
                    av4 t3 = xw3.t(ku3Var, null, new s7c(null, u8cVar, event), 3);
                    if (!Intrinsics.c(event.getHasEventPlayerStatistics(), Boolean.TRUE)) {
                        ArrayList w0 = CollectionsKt.w0(LineupsResponse.getAwayLineups$default(lineupsResponse, null, 1, null).getPlayers(), LineupsResponse.getHomeLineups$default(lineupsResponse, null, 1, null).getPlayers());
                        if (!w0.isEmpty()) {
                            Iterator it = w0.iterator();
                            while (it.hasNext()) {
                                if (((PlayerData) it.next()).getAvgRating() != null) {
                                }
                            }
                        }
                        z = false;
                        av4 t4 = xw3.t(ku3Var, null, new s7c(u8cVar, event, rq3Var, i10), 3);
                        if (ok3.E(event)) {
                            UniqueTournament uniqueTournament2 = event.getTournament().getUniqueTournament();
                            if ((uniqueTournament2 != null ? new Integer(uniqueTournament2.getId()) : null) != null && event.getSeason() != null) {
                                z2 = true;
                                p = yaa.p(ku3Var, z2, new f8c(null, u8cVar, event));
                                av4 p3 = yaa.p(ku3Var, z2, new e8c(null, u8cVar, event));
                                p2 = yaa.p(ku3Var, !z2, new s7c(u8cVar, event, rq3Var, i11));
                                LineupsResponse lineupsResponse8 = lineupsResponse;
                                event2 = event;
                                z3 = z;
                                av4 t5 = xw3.t(ku3Var, z45.a, new kv7(t4, t3, lineupsResponse8, event, z, (rq3) null), 2);
                                if (p != null) {
                                    this.P = null;
                                    this.r = null;
                                    this.s = lineupsResponse8;
                                    this.t = event2;
                                    this.u = p3;
                                    this.v = p2;
                                    this.w = t5;
                                    this.J = intValue;
                                    this.K = z3 ? 1 : 0;
                                    this.L = z2 ? 1 : 0;
                                    this.O = 3;
                                    w2 = p.w(this);
                                    lu3 lu3Var2 = lu3.a;
                                    if (w2 != lu3Var) {
                                        av4Var = t5;
                                        z4 = z2 ? 1 : 0;
                                        lineupsResponse3 = lineupsResponse8;
                                        av4Var2 = p3;
                                        teamSeasonStatisticsResponse = (TeamSeasonStatisticsResponse) w2;
                                        if (teamSeasonStatisticsResponse == null) {
                                            av4 av4Var3 = av4Var;
                                            obj2 = (TeamSeasonStatistics) teamSeasonStatisticsResponse.getStatistics();
                                            r2 = z3 ? 1 : 0;
                                            zu4Var = av4Var3;
                                            r1 = z4;
                                            footballTeamSeasonStatistics = obj2 instanceof FootballTeamSeasonStatistics ? (FootballTeamSeasonStatistics) obj2 : null;
                                            if (av4Var2 != null) {
                                                this.P = null;
                                                this.r = null;
                                                this.s = lineupsResponse3;
                                                this.t = event2;
                                                this.u = null;
                                                this.v = p2;
                                                this.w = zu4Var;
                                                this.x = footballTeamSeasonStatistics;
                                                this.J = intValue;
                                                this.K = r2;
                                                this.L = r1;
                                                this.O = 4;
                                                T2 = av4Var2.T(this);
                                                if (T2 != lu3Var) {
                                                    event4 = event2;
                                                    lineupsResponse4 = lineupsResponse3;
                                                    r1 = r1;
                                                    r2 = r2;
                                                    teamSeasonStatisticsResponse2 = (TeamSeasonStatisticsResponse) T2;
                                                    if (teamSeasonStatisticsResponse2 == null) {
                                                        zu4Var2 = zu4Var;
                                                        obj3 = (TeamSeasonStatistics) teamSeasonStatisticsResponse2.getStatistics();
                                                        lineupsResponse5 = lineupsResponse4;
                                                        i2 = r1;
                                                        i = r2;
                                                        footballTeamSeasonStatistics2 = !(obj3 instanceof FootballTeamSeasonStatistics) ? (FootballTeamSeasonStatistics) obj3 : null;
                                                        avgRating = footballTeamSeasonStatistics == null ? footballTeamSeasonStatistics.getAvgRating() : null;
                                                        avgRating2 = footballTeamSeasonStatistics2 == null ? footballTeamSeasonStatistics2.getAvgRating() : null;
                                                        if (footballTeamSeasonStatistics != null || (avgRatingVersion = footballTeamSeasonStatistics.getAvgRatingVersion()) == null) {
                                                            if (footballTeamSeasonStatistics2 == null) {
                                                                avgRatingVersion = footballTeamSeasonStatistics2.getAvgRatingVersion();
                                                            } else {
                                                                teamAverageRatingVersion = null;
                                                                fabVar = fab.a;
                                                                if (p2 == null) {
                                                                    this.P = null;
                                                                    this.r = null;
                                                                    this.s = lineupsResponse5;
                                                                    this.t = event4;
                                                                    this.u = null;
                                                                    this.v = null;
                                                                    this.w = zu4Var2;
                                                                    this.x = null;
                                                                    this.y = avgRating;
                                                                    this.z = avgRating2;
                                                                    this.A = teamAverageRatingVersion;
                                                                    this.B = fabVar;
                                                                    this.C = lineupsResponse5;
                                                                    this.J = intValue;
                                                                    this.K = i;
                                                                    this.L = i2;
                                                                    this.O = 5;
                                                                    T3 = p2.T(this);
                                                                    if (T3 != lu3Var) {
                                                                        lineupsResponse6 = lineupsResponse5;
                                                                        i8 = i2;
                                                                        i7 = i;
                                                                        eventStatisticsResponse = (EventStatisticsResponse) T3;
                                                                        Double d5 = avgRating2;
                                                                        i3 = i7;
                                                                        event5 = event4;
                                                                        i4 = intValue;
                                                                        d = d5;
                                                                        i5 = i8;
                                                                        fabVar.getClass();
                                                                        fab.b(lineupsResponse5, eventStatisticsResponse, avgRating, d, teamAverageRatingVersion);
                                                                        Double d6 = new Double(lineupsResponse6.getFirstTeamAverageRating());
                                                                        Double d7 = d6.doubleValue() > 0.0d ? d6 : null;
                                                                        d2 = new Double(lineupsResponse6.getSecondTeamAverageRating());
                                                                        if (d2.doubleValue() <= 0.0d) {
                                                                            d2 = null;
                                                                        }
                                                                        Team homeTeam$default = Event.getHomeTeam$default(event5, null, 1, null);
                                                                        Team awayTeam$default = Event.getAwayTeam$default(event5, null, 1, null);
                                                                        int id = mediaPost.getId();
                                                                        String string = context2.getString(lineupsResponse6.getConfirmed() ? R.string.feed_football_confirmed_lineups_title : R.string.feed_football_possible_lineups_title);
                                                                        z5 = true;
                                                                        Double d8 = d2;
                                                                        zu4 zu4Var3 = zu4Var2;
                                                                        F = uxf.F(event5, context2, false, false, null, null, 62);
                                                                        sport = mediaPost.getSport();
                                                                        if (sport != null || (r4 = sport.getSlug()) == null) {
                                                                            String str4 = "";
                                                                        }
                                                                        str = str4;
                                                                        long createdAtTimestamp = mediaPost.getCreatedAtTimestamp();
                                                                        Event event6 = event5;
                                                                        Integer F2 = o3a.F(event5.getTournament());
                                                                        uniqueTournament = event6.getTournament().getUniqueTournament();
                                                                        if (uniqueTournament != null) {
                                                                            context = context2;
                                                                            str2 = tba.x(uniqueTournament);
                                                                        } else {
                                                                            context = context2;
                                                                            str2 = null;
                                                                        }
                                                                        iy7Var = new iy7(F2, str2);
                                                                        this.P = null;
                                                                        this.r = null;
                                                                        this.s = null;
                                                                        this.t = null;
                                                                        this.u = null;
                                                                        this.v = null;
                                                                        this.w = null;
                                                                        this.x = null;
                                                                        this.y = null;
                                                                        this.z = null;
                                                                        this.A = null;
                                                                        this.B = d7;
                                                                        this.C = d8;
                                                                        this.D = homeTeam$default;
                                                                        this.E = awayTeam$default;
                                                                        this.F = string;
                                                                        this.G = F;
                                                                        this.H = str;
                                                                        this.I = iy7Var;
                                                                        this.J = i4;
                                                                        this.K = i3;
                                                                        this.L = i5;
                                                                        this.M = id;
                                                                        this.N = createdAtTimestamp;
                                                                        this.O = 6;
                                                                        T4 = zu4Var3.T(this);
                                                                        if (T4 == lu3Var) {
                                                                            return lu3Var;
                                                                        }
                                                                        i6 = id;
                                                                        j = createdAtTimestamp;
                                                                        team = homeTeam$default;
                                                                        str3 = string;
                                                                        d3 = d7;
                                                                        d4 = d8;
                                                                        team2 = awayTeam$default;
                                                                        Context context3 = context;
                                                                        return new u8b(i6, str3, null, j, str, F, new x43((MediaReactionType) null, 0, 0, (Boolean) null, 31), iy7Var, (j6c) T4, uxf.J(team, context3, d3, false, null, 28), uxf.J(team2, context3, d4, false, null, 28), i3 == 0 ? z5 : false);
                                                                    }
                                                                } else {
                                                                    Double d9 = avgRating2;
                                                                    i3 = i;
                                                                    event5 = event4;
                                                                    i4 = intValue;
                                                                    d = d9;
                                                                    lineupsResponse6 = lineupsResponse5;
                                                                    eventStatisticsResponse = null;
                                                                    i5 = i2;
                                                                    fabVar.getClass();
                                                                    fab.b(lineupsResponse5, eventStatisticsResponse, avgRating, d, teamAverageRatingVersion);
                                                                    Double d62 = new Double(lineupsResponse6.getFirstTeamAverageRating());
                                                                    if (d62.doubleValue() > 0.0d) {
                                                                    }
                                                                    d2 = new Double(lineupsResponse6.getSecondTeamAverageRating());
                                                                    if (d2.doubleValue() <= 0.0d) {
                                                                    }
                                                                    Team homeTeam$default2 = Event.getHomeTeam$default(event5, null, 1, null);
                                                                    Team awayTeam$default2 = Event.getAwayTeam$default(event5, null, 1, null);
                                                                    int id2 = mediaPost.getId();
                                                                    String string2 = context2.getString(lineupsResponse6.getConfirmed() ? R.string.feed_football_confirmed_lineups_title : R.string.feed_football_possible_lineups_title);
                                                                    z5 = true;
                                                                    Double d82 = d2;
                                                                    zu4 zu4Var32 = zu4Var2;
                                                                    F = uxf.F(event5, context2, false, false, null, null, 62);
                                                                    sport = mediaPost.getSport();
                                                                    if (sport != null) {
                                                                    }
                                                                    String str42 = "";
                                                                    str = str42;
                                                                    long createdAtTimestamp2 = mediaPost.getCreatedAtTimestamp();
                                                                    Event event62 = event5;
                                                                    Integer F22 = o3a.F(event5.getTournament());
                                                                    uniqueTournament = event62.getTournament().getUniqueTournament();
                                                                    if (uniqueTournament != null) {
                                                                    }
                                                                    iy7Var = new iy7(F22, str2);
                                                                    this.P = null;
                                                                    this.r = null;
                                                                    this.s = null;
                                                                    this.t = null;
                                                                    this.u = null;
                                                                    this.v = null;
                                                                    this.w = null;
                                                                    this.x = null;
                                                                    this.y = null;
                                                                    this.z = null;
                                                                    this.A = null;
                                                                    this.B = d7;
                                                                    this.C = d82;
                                                                    this.D = homeTeam$default2;
                                                                    this.E = awayTeam$default2;
                                                                    this.F = string2;
                                                                    this.G = F;
                                                                    this.H = str;
                                                                    this.I = iy7Var;
                                                                    this.J = i4;
                                                                    this.K = i3;
                                                                    this.L = i5;
                                                                    this.M = id2;
                                                                    this.N = createdAtTimestamp2;
                                                                    this.O = 6;
                                                                    T4 = zu4Var32.T(this);
                                                                    if (T4 == lu3Var) {
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        teamAverageRatingVersion = avgRatingVersion;
                                                        fabVar = fab.a;
                                                        if (p2 == null) {
                                                        }
                                                    } else {
                                                        lineupsResponse3 = lineupsResponse4;
                                                        event2 = event4;
                                                    }
                                                }
                                            }
                                            zu4Var2 = zu4Var;
                                            event4 = event2;
                                            lineupsResponse5 = lineupsResponse3;
                                            obj3 = null;
                                            i2 = r1;
                                            i = r2;
                                            if (!(obj3 instanceof FootballTeamSeasonStatistics)) {
                                            }
                                            if (footballTeamSeasonStatistics == null) {
                                            }
                                            if (footballTeamSeasonStatistics2 == null) {
                                            }
                                            if (footballTeamSeasonStatistics != null) {
                                            }
                                            if (footballTeamSeasonStatistics2 == null) {
                                            }
                                        } else {
                                            LineupsResponse lineupsResponse9 = lineupsResponse3;
                                            z2 = z4;
                                            t5 = av4Var;
                                            p3 = av4Var2;
                                            event3 = event2;
                                            lineupsResponse2 = lineupsResponse9;
                                            boolean z6 = z3;
                                            zu4Var = t5;
                                            r1 = z2;
                                            r2 = z6;
                                            lineupsResponse3 = lineupsResponse2;
                                            event2 = event3;
                                            av4Var2 = p3;
                                            obj2 = null;
                                            if (obj2 instanceof FootballTeamSeasonStatistics) {
                                            }
                                            if (av4Var2 != null) {
                                            }
                                            zu4Var2 = zu4Var;
                                            event4 = event2;
                                            lineupsResponse5 = lineupsResponse3;
                                            obj3 = null;
                                            i2 = r1;
                                            i = r2;
                                            if (!(obj3 instanceof FootballTeamSeasonStatistics)) {
                                            }
                                            if (footballTeamSeasonStatistics == null) {
                                            }
                                            if (footballTeamSeasonStatistics2 == null) {
                                            }
                                            if (footballTeamSeasonStatistics != null) {
                                            }
                                            if (footballTeamSeasonStatistics2 == null) {
                                            }
                                        }
                                    }
                                    return lu3Var;
                                }
                                lineupsResponse2 = lineupsResponse8;
                                event3 = event2;
                                boolean z62 = z3;
                                zu4Var = t5;
                                r1 = z2;
                                r2 = z62;
                                lineupsResponse3 = lineupsResponse2;
                                event2 = event3;
                                av4Var2 = p3;
                                obj2 = null;
                                if (obj2 instanceof FootballTeamSeasonStatistics) {
                                }
                                if (av4Var2 != null) {
                                }
                                zu4Var2 = zu4Var;
                                event4 = event2;
                                lineupsResponse5 = lineupsResponse3;
                                obj3 = null;
                                i2 = r1;
                                i = r2;
                                if (!(obj3 instanceof FootballTeamSeasonStatistics)) {
                                }
                                if (footballTeamSeasonStatistics == null) {
                                }
                                if (footballTeamSeasonStatistics2 == null) {
                                }
                                if (footballTeamSeasonStatistics != null) {
                                }
                                if (footballTeamSeasonStatistics2 == null) {
                                }
                            }
                        }
                        z2 = false;
                        p = yaa.p(ku3Var, z2, new f8c(null, u8cVar, event));
                        av4 p32 = yaa.p(ku3Var, z2, new e8c(null, u8cVar, event));
                        p2 = yaa.p(ku3Var, !z2, new s7c(u8cVar, event, rq3Var, i11));
                        LineupsResponse lineupsResponse82 = lineupsResponse;
                        event2 = event;
                        z3 = z;
                        av4 t52 = xw3.t(ku3Var, z45.a, new kv7(t4, t3, lineupsResponse82, event, z, (rq3) null), 2);
                        if (p != null) {
                        }
                    }
                    z = true;
                    av4 t42 = xw3.t(ku3Var, null, new s7c(u8cVar, event, rq3Var, i10), 3);
                    if (ok3.E(event)) {
                    }
                    z2 = false;
                    p = yaa.p(ku3Var, z2, new f8c(null, u8cVar, event));
                    av4 p322 = yaa.p(ku3Var, z2, new e8c(null, u8cVar, event));
                    p2 = yaa.p(ku3Var, !z2, new s7c(u8cVar, event, rq3Var, i11));
                    LineupsResponse lineupsResponse822 = lineupsResponse;
                    event2 = event;
                    z3 = z;
                    av4 t522 = xw3.t(ku3Var, z45.a, new kv7(t42, t3, lineupsResponse822, event, z, (rq3) null), 2);
                    if (p != null) {
                    }
                }
                return null;
            case 3:
                ?? r12 = this.L;
                ?? r22 = this.K;
                intValue = this.J;
                ?? r7 = this.w;
                p2 = this.v;
                av4Var2 = this.u;
                event2 = this.t;
                lineupsResponse3 = this.s;
                y6a.M(obj);
                av4Var = r7;
                z3 = r22;
                w2 = obj;
                z4 = r12;
                teamSeasonStatisticsResponse = (TeamSeasonStatisticsResponse) w2;
                if (teamSeasonStatisticsResponse == null) {
                }
                break;
            case 4:
                int i13 = this.L;
                int i14 = this.K;
                intValue = this.J;
                footballTeamSeasonStatistics = this.x;
                zu4Var = this.w;
                p2 = this.v;
                event4 = this.t;
                lineupsResponse4 = this.s;
                y6a.M(obj);
                T2 = obj;
                r1 = i13;
                r2 = i14;
                teamSeasonStatisticsResponse2 = (TeamSeasonStatisticsResponse) T2;
                if (teamSeasonStatisticsResponse2 == null) {
                }
                break;
            case 5:
                int i15 = this.L;
                int i16 = this.K;
                intValue = this.J;
                lineupsResponse5 = (LineupsResponse) this.C;
                fabVar = (fab) this.B;
                teamAverageRatingVersion = this.A;
                Double d10 = this.z;
                avgRating = this.y;
                zu4Var2 = this.w;
                event4 = this.t;
                LineupsResponse lineupsResponse10 = this.s;
                y6a.M(obj);
                lineupsResponse6 = lineupsResponse10;
                avgRating2 = d10;
                T3 = obj;
                i8 = i15;
                i7 = i16;
                eventStatisticsResponse = (EventStatisticsResponse) T3;
                Double d52 = avgRating2;
                i3 = i7;
                event5 = event4;
                i4 = intValue;
                d = d52;
                i5 = i8;
                fabVar.getClass();
                fab.b(lineupsResponse5, eventStatisticsResponse, avgRating, d, teamAverageRatingVersion);
                Double d622 = new Double(lineupsResponse6.getFirstTeamAverageRating());
                if (d622.doubleValue() > 0.0d) {
                }
                d2 = new Double(lineupsResponse6.getSecondTeamAverageRating());
                if (d2.doubleValue() <= 0.0d) {
                }
                Team homeTeam$default22 = Event.getHomeTeam$default(event5, null, 1, null);
                Team awayTeam$default22 = Event.getAwayTeam$default(event5, null, 1, null);
                int id22 = mediaPost.getId();
                String string22 = context2.getString(lineupsResponse6.getConfirmed() ? R.string.feed_football_confirmed_lineups_title : R.string.feed_football_possible_lineups_title);
                z5 = true;
                Double d822 = d2;
                zu4 zu4Var322 = zu4Var2;
                F = uxf.F(event5, context2, false, false, null, null, 62);
                sport = mediaPost.getSport();
                if (sport != null) {
                }
                String str422 = "";
                str = str422;
                long createdAtTimestamp22 = mediaPost.getCreatedAtTimestamp();
                Event event622 = event5;
                Integer F222 = o3a.F(event5.getTournament());
                uniqueTournament = event622.getTournament().getUniqueTournament();
                if (uniqueTournament != null) {
                }
                iy7Var = new iy7(F222, str2);
                this.P = null;
                this.r = null;
                this.s = null;
                this.t = null;
                this.u = null;
                this.v = null;
                this.w = null;
                this.x = null;
                this.y = null;
                this.z = null;
                this.A = null;
                this.B = d7;
                this.C = d822;
                this.D = homeTeam$default22;
                this.E = awayTeam$default22;
                this.F = string22;
                this.G = F;
                this.H = str;
                this.I = iy7Var;
                this.J = i4;
                this.K = i3;
                this.L = i5;
                this.M = id22;
                this.N = createdAtTimestamp22;
                this.O = 6;
                T4 = zu4Var322.T(this);
                if (T4 == lu3Var) {
                }
                break;
            case 6:
                long j2 = this.N;
                int i17 = this.M;
                int i18 = this.K;
                iy7Var = this.I;
                str = this.H;
                F = this.G;
                String str5 = this.F;
                team2 = this.E;
                Team team3 = this.D;
                d4 = (Double) this.C;
                Double d11 = (Double) this.B;
                y6a.M(obj);
                j = j2;
                i6 = i17;
                i3 = i18;
                str3 = str5;
                team = team3;
                z5 = true;
                d3 = d11;
                T4 = obj;
                context = context2;
                Context context32 = context;
                return new u8b(i6, str3, null, j, str, F, new x43((MediaReactionType) null, 0, 0, (Boolean) null, 31), iy7Var, (j6c) T4, uxf.J(team, context32, d3, false, null, 28), uxf.J(team2, context32, d4, false, null, 28), i3 == 0 ? z5 : false);
            default:
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
