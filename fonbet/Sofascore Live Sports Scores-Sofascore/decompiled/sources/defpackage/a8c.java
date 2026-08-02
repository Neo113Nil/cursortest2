package defpackage;

import android.content.Context;
import com.sofascore.model.database.MediaReactionType;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.network.response.AmericanFootballPlayerEventStatistics;
import com.sofascore.model.network.response.PlayerEventStatistics;
import com.sofascore.model.network.response.PlayerEventStatisticsResponse;
import com.sofascore.model.newNetwork.mediaposts.MediaPost;
import com.sofascore.results.R;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class a8c extends hoi implements et8 {
    public String A;
    public int B;
    public int C;
    public int D;
    public long E;
    public int F;
    public /* synthetic */ Event G;
    public /* synthetic */ Player H;
    public /* synthetic */ Team I;
    public final /* synthetic */ MediaPost J;
    public final /* synthetic */ ku3 K;
    public final /* synthetic */ u8c L;
    public String r;
    public zu4 s;
    public List t;
    public dti u;
    public Object v;
    public Object w;
    public ux7 x;
    public fy7 y;
    public gv9 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a8c(rq3 rq3Var, ku3 ku3Var, u8c u8cVar, MediaPost mediaPost) {
        super(4, rq3Var);
        this.J = mediaPost;
        this.K = ku3Var;
        this.L = u8cVar;
    }

    @Override // defpackage.et8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        a8c a8cVar = new a8c((rq3) obj4, this.K, this.L, this.J);
        a8cVar.G = (Event) obj;
        a8cVar.H = (Player) obj2;
        a8cVar.I = (Team) obj3;
        return a8cVar.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015c  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String slug;
        int i;
        MediaPost mediaPost;
        PlayerEventStatistics playerEventStatistics;
        Object w;
        zu4 zu4Var;
        int i2;
        lu3 lu3Var;
        List list;
        String str;
        dti dtiVar;
        Object T;
        zu4 zu4Var2;
        List list2;
        String str2;
        int i3;
        Context context;
        String str3;
        Integer num;
        Double d;
        Object T2;
        bx7 bx7Var;
        int i4;
        String str4;
        ux7 ux7Var;
        gv9 gv9Var;
        String str5;
        fy7 fy7Var;
        long j;
        PlayerEventStatisticsResponse playerEventStatisticsResponse;
        Player player;
        u8c u8cVar = this.L;
        Context context2 = u8cVar.a;
        Event event = this.G;
        Player player2 = this.H;
        Team team = this.I;
        lu3 lu3Var2 = lu3.a;
        int i5 = this.F;
        MediaPost mediaPost2 = this.J;
        if (i5 == 0) {
            y6a.M(obj);
            Integer playerId = mediaPost2.getPlayerId();
            if (playerId != null) {
                int intValue = playerId.intValue();
                Integer eventId = mediaPost2.getEventId();
                if (eventId != null) {
                    int intValue2 = eventId.intValue();
                    Sport sport = mediaPost2.getSport();
                    if (sport != null && (slug = sport.getSlug()) != null) {
                        i = intValue2;
                        mediaPost = mediaPost2;
                        playerEventStatistics = null;
                        av4 t = xw3.t(this.K, null, new y7c(u8cVar, i, intValue, null, 1), 3);
                        this.G = event;
                        this.H = player2;
                        this.I = team;
                        this.r = slug;
                        this.s = t;
                        this.B = intValue;
                        this.C = i;
                        this.F = 1;
                        w = t.w(this);
                        if (w != lu3Var2) {
                            zu4Var = t;
                            i2 = intValue;
                        }
                        return lu3Var2;
                    }
                }
            }
            return null;
        }
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 != 3) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                long j2 = this.E;
                int i6 = this.D;
                String str6 = this.A;
                gv9 gv9Var2 = this.z;
                fy7 fy7Var2 = this.y;
                ux7 ux7Var2 = this.x;
                bx7Var = (bx7) this.w;
                String str7 = (String) this.v;
                y6a.M(obj);
                ux7Var = ux7Var2;
                str4 = str7;
                T2 = obj;
                str5 = str6;
                gv9Var = gv9Var2;
                fy7Var = fy7Var2;
                j = j2;
                i4 = i6;
                playerEventStatisticsResponse = (PlayerEventStatisticsResponse) yaa.x((x2g) T2);
                if (playerEventStatisticsResponse != null || (player = playerEventStatisticsResponse.getPlayer()) == null || (r0 = player.getJerseyNumber()) == null) {
                    String str8 = "";
                }
                return new qu8(i4, null, null, j, str4, bx7Var, ux7Var, fy7Var, new x43((MediaReactionType) null, 0, 0, (Boolean) null, 31), gv9Var, str5, str8);
            }
            i3 = this.C;
            i2 = this.B;
            str2 = (String) this.w;
            Context context3 = (Context) this.v;
            dtiVar = this.u;
            list2 = this.t;
            zu4 zu4Var3 = this.s;
            slug = this.r;
            y6a.M(obj);
            mediaPost = mediaPost2;
            zu4Var2 = zu4Var3;
            context = context3;
            T = obj;
            dti dtiVar2 = dtiVar;
            String str9 = slug;
            PlayerEventStatisticsResponse playerEventStatisticsResponse2 = (PlayerEventStatisticsResponse) yaa.x((x2g) T);
            String position = playerEventStatisticsResponse2 == null ? playerEventStatisticsResponse2.getPosition() : null;
            Gender gender = player2.getGender();
            dtiVar2.getClass();
            String u = dti.u(context, gender, str2, position, false);
            if (list2.size() >= 4) {
                int id = mediaPost.getId();
                long createdAtTimestamp = mediaPost.getCreatedAtTimestamp();
                lu3 lu3Var3 = lu3Var2;
                bx7 F = uxf.F(event, context2, true, false, null, null, 60);
                ux7 G = uxf.G(player2);
                fy7 J = uxf.J(team, context2, null, false, null, 30);
                gv9 W = l6g.W(list2);
                this.G = null;
                this.H = null;
                this.I = null;
                this.r = null;
                this.s = null;
                this.t = null;
                this.u = null;
                this.v = str9;
                this.w = F;
                this.x = G;
                this.y = J;
                this.z = W;
                this.A = u;
                this.B = i2;
                this.C = i3;
                this.D = id;
                this.E = createdAtTimestamp;
                this.F = 3;
                T2 = zu4Var2.T(this);
                if (T2 == lu3Var3) {
                    return lu3Var3;
                }
                bx7Var = F;
                i4 = id;
                str4 = str9;
                ux7Var = G;
                gv9Var = W;
                str5 = u;
                fy7Var = J;
                j = createdAtTimestamp;
                playerEventStatisticsResponse = (PlayerEventStatisticsResponse) yaa.x((x2g) T2);
                if (playerEventStatisticsResponse != null) {
                }
                String str82 = "";
                return new qu8(i4, null, null, j, str4, bx7Var, ux7Var, fy7Var, new x43((MediaReactionType) null, 0, 0, (Boolean) null, 31), gv9Var, str5, str82);
            }
            return null;
        }
        int i7 = this.C;
        i2 = this.B;
        zu4Var = this.s;
        String str10 = this.r;
        y6a.M(obj);
        mediaPost = mediaPost2;
        slug = str10;
        w = obj;
        i = i7;
        playerEventStatistics = null;
        PlayerEventStatisticsResponse playerEventStatisticsResponse3 = (PlayerEventStatisticsResponse) yaa.x((x2g) w);
        if (playerEventStatisticsResponse3 != null) {
            PlayerEventStatistics statistics = playerEventStatisticsResponse3.getStatistics();
            if (!(statistics instanceof AmericanFootballPlayerEventStatistics)) {
                statistics = playerEventStatistics;
            }
            AmericanFootballPlayerEventStatistics americanFootballPlayerEventStatistics = (AmericanFootballPlayerEventStatistics) statistics;
            if (americanFootballPlayerEventStatistics != null) {
                List<String> tags = mediaPost.getTags();
                tags.getClass();
                if (tags.contains("passing")) {
                    Integer valueOf = Integer.valueOf(R.string.am_football_passing_yards_long);
                    Integer passingYards = americanFootballPlayerEventStatistics.getPassingYards();
                    Pair pair = new Pair(valueOf, passingYards != null ? yid.j(passingYards) : playerEventStatistics);
                    Integer valueOf2 = Integer.valueOf(R.string.am_football_completion_pct_short);
                    Integer passingCompletions = americanFootballPlayerEventStatistics.getPassingCompletions();
                    if (passingCompletions != null) {
                        if (americanFootballPlayerEventStatistics.getPassingAttempts() != null) {
                            d = Double.valueOf(r20.intValue() / 100.0d);
                            num = passingCompletions;
                        } else {
                            num = passingCompletions;
                            d = null;
                        }
                        Double b = yid.b(num, d);
                        if (b != null) {
                            str3 = mz1.i(wzb.a(b.doubleValue()), "%");
                            Regex regex = yid.a;
                            if (str3 == null) {
                                str3 = "-";
                            }
                            list = b.j(pair, new Pair(valueOf2, str3), new Pair(Integer.valueOf(R.string.am_football_passing_touchdowns_short), o02.y0(americanFootballPlayerEventStatistics.getPassingTouchdowns())), new Pair(Integer.valueOf(R.string.am_football_interceptions_thrown_short), o02.y0(americanFootballPlayerEventStatistics.getPassingInterceptions())));
                            lu3Var = lu3Var2;
                        }
                    }
                    str3 = null;
                    Regex regex2 = yid.a;
                    if (str3 == null) {
                    }
                    list = b.j(pair, new Pair(valueOf2, str3), new Pair(Integer.valueOf(R.string.am_football_passing_touchdowns_short), o02.y0(americanFootballPlayerEventStatistics.getPassingTouchdowns())), new Pair(Integer.valueOf(R.string.am_football_interceptions_thrown_short), o02.y0(americanFootballPlayerEventStatistics.getPassingInterceptions())));
                    lu3Var = lu3Var2;
                } else if (tags.contains("rushing")) {
                    Integer valueOf3 = Integer.valueOf(R.string.am_football_rushing_yards_long);
                    Integer rushingYards = americanFootballPlayerEventStatistics.getRushingYards();
                    Pair pair2 = new Pair(valueOf3, rushingYards != null ? yid.j(rushingYards) : null);
                    Integer valueOf4 = Integer.valueOf(R.string.am_football_rushing_attempts_short);
                    Integer rushingAttempts = americanFootballPlayerEventStatistics.getRushingAttempts();
                    String y0 = rushingAttempts != null ? o02.y0(rushingAttempts) : null;
                    Regex regex3 = yid.a;
                    if (y0 == null) {
                        y0 = "-";
                    }
                    Pair pair3 = new Pair(valueOf4, y0);
                    Pair pair4 = new Pair(Integer.valueOf(R.string.am_football_rushing_touchdowns_short), o02.y0(americanFootballPlayerEventStatistics.getRushingTouchdowns()));
                    Integer valueOf5 = Integer.valueOf(R.string.am_football_average_rushing_yards_per_attempt_short);
                    Double rushingYardsPerAttempt = americanFootballPlayerEventStatistics.getRushingYardsPerAttempt();
                    if (rushingYardsPerAttempt != null) {
                        lu3Var = lu3Var2;
                        str = rei.e(Double.valueOf(rushingYardsPerAttempt.doubleValue()), 0, 2);
                    } else {
                        lu3Var = lu3Var2;
                        str = null;
                    }
                    if (str == null) {
                        str = "-";
                    }
                    list = b.j(pair2, pair3, pair4, new Pair(valueOf5, str));
                } else {
                    lu3Var = lu3Var2;
                    if (tags.contains("receiving")) {
                        Integer valueOf6 = Integer.valueOf(R.string.am_football_receiving_yards_long);
                        Integer receivingYards = americanFootballPlayerEventStatistics.getReceivingYards();
                        Pair pair5 = new Pair(valueOf6, receivingYards != null ? yid.j(receivingYards) : null);
                        Integer valueOf7 = Integer.valueOf(R.string.am_football_receptions_short);
                        String y02 = o02.y0(americanFootballPlayerEventStatistics.getReceivingReceptions());
                        Regex regex4 = yid.a;
                        Pair pair6 = new Pair(valueOf7, y02);
                        Pair pair7 = new Pair(Integer.valueOf(R.string.am_football_receiving_touchdowns_short), o02.y0(americanFootballPlayerEventStatistics.getReceivingTouchdowns()));
                        Integer valueOf8 = Integer.valueOf(R.string.am_football_average_yards_per_reception_short);
                        Double receivingYardsPerReception = americanFootballPlayerEventStatistics.getReceivingYardsPerReception();
                        String e = receivingYardsPerReception != null ? rei.e(Double.valueOf(receivingYardsPerReception.doubleValue()), 0, 2) : null;
                        if (e == null) {
                            e = "-";
                        }
                        list = b.j(pair5, pair6, pair7, new Pair(valueOf8, e));
                    } else {
                        list = null;
                    }
                }
                if (list != null) {
                    dtiVar = dti.f;
                    String s = ok3.s(event);
                    this.G = event;
                    this.H = player2;
                    this.I = team;
                    this.r = slug;
                    this.s = zu4Var;
                    this.t = list;
                    this.u = dtiVar;
                    this.v = context2;
                    this.w = s;
                    this.B = i2;
                    this.C = i;
                    this.F = 2;
                    T = zu4Var.T(this);
                    lu3Var2 = lu3Var;
                    if (T != lu3Var2) {
                        zu4Var2 = zu4Var;
                        list2 = list;
                        str2 = s;
                        i3 = i;
                        context = context2;
                        dti dtiVar22 = dtiVar;
                        String str92 = slug;
                        PlayerEventStatisticsResponse playerEventStatisticsResponse22 = (PlayerEventStatisticsResponse) yaa.x((x2g) T);
                        if (playerEventStatisticsResponse22 == null) {
                        }
                        Gender gender2 = player2.getGender();
                        dtiVar22.getClass();
                        String u2 = dti.u(context, gender2, str2, position, false);
                        if (list2.size() >= 4) {
                        }
                    }
                    return lu3Var2;
                }
                return null;
            }
        }
        return playerEventStatistics;
    }
}
