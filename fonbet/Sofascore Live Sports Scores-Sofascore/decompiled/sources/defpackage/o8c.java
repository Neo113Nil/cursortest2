package defpackage;

import android.content.Context;
import com.sofascore.model.Sports;
import com.sofascore.model.TeamSelection;
import com.sofascore.model.database.MediaReactionType;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.ShotMapPoint;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.network.response.PlayerEventStatistics;
import com.sofascore.model.network.response.PlayerEventStatisticsResponse;
import com.sofascore.model.network.response.StatisticsForPeriod;
import com.sofascore.model.newNetwork.FootballShotmapItem;
import com.sofascore.model.newNetwork.FootballShotmapResponse;
import com.sofascore.model.newNetwork.HockeyShotmapItem;
import com.sofascore.model.newNetwork.PlayerShotmapResponse;
import com.sofascore.model.newNetwork.mediaposts.MediaPost;
import com.sofascore.results.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class o8c extends hoi implements et8 {
    public gv9 A;
    public gv9 B;
    public int C;
    public int D;
    public int E;
    public int F;
    public long G;
    public int H;
    public /* synthetic */ Event I;
    public /* synthetic */ Player J;
    public /* synthetic */ Team K;
    public final /* synthetic */ MediaPost L;
    public final /* synthetic */ u8c M;
    public final /* synthetic */ ku3 N;
    public String r;
    public String s;
    public av4 t;
    public List u;
    public zu4 v;
    public List w;
    public bx7 x;
    public fy7 y;
    public ux7 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o8c(rq3 rq3Var, ku3 ku3Var, u8c u8cVar, MediaPost mediaPost) {
        super(4, rq3Var);
        this.L = mediaPost;
        this.M = u8cVar;
        this.N = ku3Var;
    }

    @Override // defpackage.et8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        o8c o8cVar = new o8c((rq3) obj4, this.N, this.M, this.L);
        o8cVar.I = (Event) obj;
        o8cVar.J = (Player) obj2;
        o8cVar.K = (Team) obj3;
        return o8cVar.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0648  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x06c6  */
    /* JADX WARN: Type inference failed for: r2v16, types: [av4, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.List, kotlin.coroutines.CoroutineContext] */
    /* JADX WARN: Type inference failed for: r35v0 */
    /* JADX WARN: Type inference failed for: r35v1, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r35v2 */
    /* JADX WARN: Type inference failed for: r5v6, types: [av4, kotlin.coroutines.CoroutineContext, rq3] */
    /* JADX WARN: Type inference failed for: r5v8, types: [kotlin.coroutines.CoroutineContext, rq3] */
    /* JADX WARN: Type inference failed for: r6v46, types: [zu4] */
    /* JADX WARN: Type inference failed for: r8v2, types: [av4, kotlin.coroutines.CoroutineContext] */
    /* JADX WARN: Type inference failed for: r9v22, types: [zu4] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        MediaPost mediaPost;
        int i;
        lu3 lu3Var;
        int i2;
        String str;
        Pair pair;
        String str2;
        String str3;
        Context context;
        Player player;
        Team team;
        Event event;
        Object w;
        String str4;
        int i3;
        String str5;
        Team team2;
        lu3 lu3Var2;
        int i4;
        int i5;
        int i6;
        Player player2;
        Object w2;
        int i7;
        Context context2;
        int i8;
        Object w3;
        lu3 lu3Var3;
        av4 av4Var;
        int i9;
        String str6;
        av4 av4Var2;
        String str7;
        FootballShotmapResponse footballShotmapResponse;
        Context context3;
        av4 av4Var3;
        Object w4;
        List<FootballShotmapItem> list;
        String str8;
        String str9;
        PlayerEventStatistics statistics;
        Object obj2;
        PlayerShotmapResponse playerShotmapResponse;
        List<ShotMapPoint> shotmap;
        Object T;
        List<ShotMapPoint> list2;
        int i10;
        String str10;
        PlayerEventStatisticsResponse playerEventStatisticsResponse;
        String str11;
        ArrayList arrayList;
        lu3 lu3Var4;
        Double d;
        Object T2;
        gv9 gv9Var;
        String str12;
        gv9 gv9Var2;
        int i11;
        bx7 bx7Var;
        String str13;
        ux7 ux7Var;
        fy7 fy7Var;
        long j;
        List<StatisticsForPeriod> periods;
        PlayerEventStatistics statistics2;
        Object obj3;
        List<HockeyShotmapItem> list3;
        u8c u8cVar = this.M;
        Context context4 = u8cVar.a;
        Event event2 = this.I;
        Player player3 = this.J;
        Team team3 = this.K;
        lu3 lu3Var5 = lu3.a;
        int i12 = this.H;
        ku3 ku3Var = this.N;
        MediaPost mediaPost2 = this.L;
        av4 av4Var4 = null;
        av4 av4Var5 = null;
        av4Var4 = null;
        switch (i12) {
            case 0:
                y6a.M(obj);
                Integer playerId = mediaPost2.getPlayerId();
                if (playerId != null) {
                    int intValue = playerId.intValue();
                    Integer eventId = mediaPost2.getEventId();
                    if (eventId != null) {
                        int intValue2 = eventId.intValue();
                        int i13 = Event.getHomeTeam$default(event2, null, 1, null).getId() == team3.getId() ? 1 : 0;
                        List<String> tags = mediaPost2.getTags();
                        Sport sport = mediaPost2.getSport();
                        String slug = sport != null ? sport.getSlug() : null;
                        tags.getClass();
                        mediaPost = mediaPost2;
                        if (tags.contains("exceptional")) {
                            if (slug != null) {
                                int hashCode = slug.hashCode();
                                i = intValue;
                                lu3Var = lu3Var5;
                                i2 = i13;
                                if (hashCode != -2002238939) {
                                    if (hashCode != 394668909) {
                                        if (hashCode == 727149765 && slug.equals(Sports.BASKETBALL)) {
                                            if (tags.contains("quarter")) {
                                                pair = new Pair(context4.getString(R.string.basketball_points_quarter_title), context4.getString(R.string.basketball_points_quarter_body));
                                            } else if (tags.contains("secondHalf")) {
                                                pair = new Pair(context4.getString(R.string.basketball_activated_second_half_title), context4.getString(R.string.basketball_activated_second_half_body));
                                            } else if (tags.contains("points")) {
                                                pair = new Pair(context4.getString(R.string.basketball_shotmap_on_fire_title), context4.getString(R.string.basketball_shotmap_on_fire_body));
                                            } else if (tags.contains("firstHalf")) {
                                                pair = new Pair(context4.getString(R.string.basketball_second_half_shutdown_title), context4.getString(R.string.basketball_second_half_shutdown_body));
                                            } else if (tags.contains("quarterGreat")) {
                                                pair = new Pair(context4.getString(R.string.basketball_one_great_quarter_title), context4.getString(R.string.basketball_one_great_quarter_body));
                                            } else if (tags.contains("quarterSingle")) {
                                                pair = new Pair(context4.getString(R.string.basketball_one_ok_quarter_title), context4.getString(R.string.basketball_one_ok_quarter_body));
                                            } else if (tags.contains("shotHigh")) {
                                                pair = new Pair(context4.getString(R.string.basketball_shotmap_on_target_title), context4.getString(R.string.basketball_shotmap_on_target_body));
                                            } else if (tags.contains("shotLow")) {
                                                pair = new Pair(context4.getString(R.string.off_target_title), context4.getString(R.string.off_target_body));
                                            } else if (tags.contains("centerScore")) {
                                                pair = new Pair(context4.getString(R.string.basketball_center_threes_title), context4.getString(R.string.basketball_center_threes_body));
                                            } else {
                                                str = null;
                                                pair = new Pair(null, null);
                                            }
                                            str = null;
                                        }
                                    } else if (slug.equals(Sports.FOOTBALL)) {
                                        if (tags.contains("goal")) {
                                            pair = new Pair(context4.getString(R.string.football_what_a_striker_title), context4.getString(R.string.football_what_a_striker_body));
                                        } else if (tags.contains("shotOnTarget")) {
                                            pair = new Pair(context4.getString(R.string.football_sharpshooter_title), context4.getString(R.string.football_sharpshooter_body));
                                        } else if (tags.contains("shotMiss")) {
                                            pair = new Pair(context4.getString(R.string.off_target_title), context4.getString(R.string.off_target_body));
                                        } else if (tags.contains("shot")) {
                                            pair = new Pair(context4.getString(R.string.football_rapid_fire_title), context4.getString(R.string.football_rapid_fire_body));
                                        } else if (tags.contains("goalShot")) {
                                            pair = new Pair(context4.getString(R.string.football_x_goals_x_shots_title), context4.getString(R.string.football_x_goals_x_shots_body));
                                        } else {
                                            str = null;
                                            pair = new Pair(null, null);
                                        }
                                        str = null;
                                    }
                                } else if (slug.equals(Sports.ICE_HOCKEY)) {
                                    if (tags.contains("goal")) {
                                        pair = new Pair(context4.getString(R.string.hockey_attacker_title), context4.getString(R.string.hockey_attacker_body));
                                    } else if (tags.contains("shotMiss")) {
                                        pair = new Pair(context4.getString(R.string.hockey_missed_shots_title), context4.getString(R.string.hockey_missed_shots_body));
                                    } else if (tags.contains("shotPercentage")) {
                                        pair = new Pair(context4.getString(R.string.hockey_high_shot_percentage_title), context4.getString(R.string.hockey_high_shot_percentage_body));
                                    } else if (tags.contains("shot")) {
                                        pair = new Pair(context4.getString(R.string.hockey_rapid_fire_title), context4.getString(R.string.hockey_rapid_fire_2_body));
                                    } else {
                                        str = null;
                                        pair = new Pair(null, null);
                                    }
                                    str = null;
                                }
                                PlayerEventStatisticsResponse playerEventStatisticsResponse2 = (PlayerEventStatisticsResponse) yaa.x((x2g) T2);
                                return new zr1(i11, str12, str13, j, bx7Var, Sports.BASKETBALL, ux7Var, fy7Var, gv9Var, gv9Var2, (playerEventStatisticsResponse2 != null || (statistics2 = playerEventStatisticsResponse2.getStatistics()) == null) ? d : statistics2.getRating(), new x43((MediaReactionType) null, 0, 0, (Boolean) null, 31));
                            }
                            i = intValue;
                            lu3Var = lu3Var5;
                            i2 = i13;
                            str = null;
                            pair = new Pair(null, null);
                        } else {
                            str = null;
                            pair = new Pair(null, null);
                            i = intValue;
                            lu3Var = lu3Var5;
                            i2 = i13;
                        }
                        str2 = (String) pair.a;
                        str3 = (String) pair.b;
                        Sport sport2 = mediaPost.getSport();
                        String slug2 = sport2 != null ? sport2.getSlug() : str;
                        if (slug2 != null) {
                            int hashCode2 = slug2.hashCode();
                            if (hashCode2 == -2002238939) {
                                context = context4;
                                player = player3;
                                team = team3;
                                String str14 = str;
                                int i14 = i;
                                lu3 lu3Var6 = lu3Var;
                                int i15 = i2;
                                if (!slug2.equals(Sports.ICE_HOCKEY)) {
                                    return str14;
                                }
                                ?? r8 = str14;
                                event = event2;
                                av4 t = xw3.t(ku3Var, r8, new gz6(u8cVar, intValue2, i14, event2, (rq3) null, 5), 3);
                                this.I = event;
                                this.J = player;
                                this.K = team;
                                this.r = str2;
                                this.s = str3;
                                this.t = r8;
                                this.C = i14;
                                this.D = intValue2;
                                this.E = i15;
                                this.H = 6;
                                w = t.w(this);
                                if (w == lu3Var6) {
                                    return lu3Var6;
                                }
                                str4 = str2;
                                i3 = i15;
                                str5 = str3;
                                obj3 = r8;
                                list3 = (List) yaa.x((x2g) w);
                                if (list3 != null) {
                                    return obj3;
                                }
                                for (HockeyShotmapItem hockeyShotmapItem : list3) {
                                    if (event.shouldReverseTeams()) {
                                        hockeyShotmapItem.mirror();
                                    }
                                }
                                Context context5 = context;
                                return new bq9(mediaPost.getId(), str4, str5, mediaPost.getCreatedAtTimestamp(), uxf.F(event, context5, true, false, null, null, 60), Sports.ICE_HOCKEY, uxf.G(player), uxf.J(team, context5, null, false, null, 30), l6g.W(list3), i3 != 0 ? TeamSelection.First : TeamSelection.Second, new x43((MediaReactionType) null, 0, 0, (Boolean) null, 31));
                            }
                            if (hashCode2 == 394668909) {
                                team2 = team3;
                                u8cVar = u8cVar;
                                int i16 = i;
                                lu3Var2 = lu3Var;
                                String str15 = str;
                                i4 = i2;
                                if (!slug2.equals(Sports.FOOTBALL)) {
                                    return str15;
                                }
                                ?? r5 = str15;
                                y7c y7cVar = new y7c(u8cVar, intValue2, i16, r5, 6);
                                i5 = i16;
                                i6 = intValue2;
                                av4 t2 = xw3.t(ku3Var, r5, y7cVar, 3);
                                this.I = event2;
                                player2 = player3;
                                this.J = player2;
                                this.K = team2;
                                this.r = str2;
                                this.s = str3;
                                this.t = r5;
                                this.C = i5;
                                this.D = i6;
                                this.E = i4;
                                this.H = 1;
                                w2 = t2.w(this);
                                av4Var5 = r5;
                                if (w2 == lu3Var2) {
                                    return lu3Var2;
                                }
                                int i17 = i6;
                                int i18 = i5;
                                footballShotmapResponse = (FootballShotmapResponse) yaa.x((x2g) w2);
                                av4Var4 = av4Var5;
                                if (footballShotmapResponse != null) {
                                    List<FootballShotmapItem> shotmap2 = footballShotmapResponse.getShotmap();
                                    av4Var4 = av4Var5;
                                    if (shotmap2 != null) {
                                        context3 = context4;
                                        av4Var3 = av4Var5;
                                        av4 t3 = xw3.t(ku3Var, av4Var3, new y7c(u8cVar, i17, i18, av4Var5, 9), 3);
                                        this.I = event2;
                                        this.J = player2;
                                        this.K = team2;
                                        this.r = str2;
                                        this.s = str3;
                                        this.t = av4Var3;
                                        this.u = shotmap2;
                                        this.C = i18;
                                        this.D = i17;
                                        this.E = i4;
                                        this.H = 2;
                                        w4 = t3.w(this);
                                        if (w4 == lu3Var2) {
                                            return lu3Var2;
                                        }
                                        list = shotmap2;
                                        str8 = str2;
                                        str9 = str3;
                                        PlayerEventStatisticsResponse playerEventStatisticsResponse3 = (PlayerEventStatisticsResponse) yaa.x((x2g) w4);
                                        Context context6 = context3;
                                        return new sk8(mediaPost.getId(), str8, str9, mediaPost.getCreatedAtTimestamp(), uxf.F(event2, context6, true, false, null, null, 60), Sports.FOOTBALL, uxf.G(player2), uxf.J(team2, context6, null, false, null, 30), l6g.W(CollectionsKt.B0(list)), i4 == 0 ? vk8.a : vk8.b, event2.getHasXg(), (playerEventStatisticsResponse3 != null || (statistics = playerEventStatisticsResponse3.getStatistics()) == null) ? av4Var3 : statistics.getRating(), new x43((MediaReactionType) null, 0, 0, (Boolean) null, 31));
                                    }
                                }
                            } else if (hashCode2 == 727149765 && slug2.equals(Sports.BASKETBALL)) {
                                ?? r52 = str;
                                i7 = i;
                                av4 t4 = xw3.t(ku3Var, r52, new y7c(u8cVar, intValue2, i7, r52, 8), 3);
                                av4 t5 = xw3.t(ku3Var, r52, new y7c(u8cVar, intValue2, i7, r52, 7), 3);
                                context2 = context4;
                                y7c y7cVar2 = new y7c(u8cVar, intValue2, i7, r52, 5);
                                ?? r2 = r52;
                                i8 = intValue2;
                                av4 t6 = xw3.t(ku3Var, r2, y7cVar2, 3);
                                this.I = event2;
                                this.J = player3;
                                this.K = team3;
                                this.r = str2;
                                this.s = str3;
                                this.t = t4;
                                this.u = r2;
                                this.v = t6;
                                this.C = i7;
                                this.D = i8;
                                int i19 = i2;
                                this.E = i19;
                                this.H = 3;
                                w3 = t5.w(this);
                                lu3Var3 = lu3Var;
                                if (w3 != lu3Var3) {
                                    av4Var = t6;
                                    i9 = i19;
                                    str6 = str3;
                                    av4Var2 = t4;
                                    str7 = str2;
                                    obj2 = r2;
                                    playerShotmapResponse = (PlayerShotmapResponse) yaa.x((x2g) w3);
                                    if (playerShotmapResponse != null || (shotmap = playerShotmapResponse.getShotmap()) == null) {
                                        return obj2;
                                    }
                                    this.I = event2;
                                    this.J = player3;
                                    this.K = team3;
                                    this.r = str7;
                                    this.s = str6;
                                    this.t = obj2;
                                    this.u = obj2;
                                    this.v = av4Var;
                                    this.w = shotmap;
                                    this.C = i7;
                                    this.D = i8;
                                    this.E = i9;
                                    this.H = 4;
                                    T = av4Var2.T(this);
                                    if (T != lu3Var3) {
                                        list2 = shotmap;
                                        i10 = i8;
                                        str10 = str6;
                                        int i20 = i7;
                                        playerEventStatisticsResponse = (PlayerEventStatisticsResponse) yaa.x((x2g) T);
                                        if (playerEventStatisticsResponse != null || (periods = playerEventStatisticsResponse.getPeriods()) == null) {
                                            str11 = str10;
                                            arrayList = null;
                                        } else {
                                            ArrayList arrayList2 = new ArrayList(k13.r(periods, 10));
                                            for (StatisticsForPeriod statisticsForPeriod : periods) {
                                                String str16 = str10;
                                                arrayList2.add(new as1(statisticsForPeriod.getPeriod(), statisticsForPeriod.getStatistics() != null));
                                                str10 = str16;
                                            }
                                            str11 = str10;
                                            arrayList = arrayList2;
                                        }
                                        int id = mediaPost.getId();
                                        long createdAtTimestamp = mediaPost.getCreatedAtTimestamp();
                                        lu3Var4 = lu3Var3;
                                        av4 av4Var6 = av4Var;
                                        ArrayList arrayList3 = arrayList;
                                        String str17 = str11;
                                        Context context7 = context2;
                                        bx7 F = uxf.F(event2, context7, true, false, null, null, 60);
                                        fy7 J = uxf.J(team3, context7, null, false, null, 30);
                                        ux7 G = uxf.G(player3);
                                        gv9 W = l6g.W(list2);
                                        gv9 W2 = arrayList3 == null ? l6g.W(arrayList3) : null;
                                        d = null;
                                        this.I = null;
                                        this.J = null;
                                        this.K = null;
                                        this.r = str7;
                                        this.s = str17;
                                        this.t = null;
                                        this.u = null;
                                        this.v = null;
                                        this.w = null;
                                        this.x = F;
                                        this.y = J;
                                        this.z = G;
                                        this.A = W;
                                        this.B = W2;
                                        this.C = i20;
                                        this.D = i10;
                                        this.E = i9;
                                        this.F = id;
                                        this.G = createdAtTimestamp;
                                        this.H = 5;
                                        T2 = av4Var6.T(this);
                                        if (T2 != lu3Var4) {
                                            return lu3Var4;
                                        }
                                        String str18 = str7;
                                        gv9Var = W;
                                        str12 = str18;
                                        gv9Var2 = W2;
                                        i11 = id;
                                        bx7Var = F;
                                        str13 = str17;
                                        ux7Var = G;
                                        fy7Var = J;
                                        j = createdAtTimestamp;
                                        PlayerEventStatisticsResponse playerEventStatisticsResponse22 = (PlayerEventStatisticsResponse) yaa.x((x2g) T2);
                                        return new zr1(i11, str12, str13, j, bx7Var, Sports.BASKETBALL, ux7Var, fy7Var, gv9Var, gv9Var2, (playerEventStatisticsResponse22 != null || (statistics2 = playerEventStatisticsResponse22.getStatistics()) == null) ? d : statistics2.getRating(), new x43((MediaReactionType) null, 0, 0, (Boolean) null, 31));
                                    }
                                }
                                return lu3Var3;
                            }
                        }
                        return str;
                    }
                }
                return av4Var4;
            case 1:
                int i21 = this.E;
                i6 = this.D;
                i5 = this.C;
                str3 = this.s;
                String str19 = this.r;
                y6a.M(obj);
                player2 = player3;
                team2 = team3;
                lu3Var2 = lu3Var5;
                str2 = str19;
                i4 = i21;
                mediaPost = mediaPost2;
                w2 = obj;
                int i172 = i6;
                int i182 = i5;
                footballShotmapResponse = (FootballShotmapResponse) yaa.x((x2g) w2);
                av4Var4 = av4Var5;
                if (footballShotmapResponse != null) {
                }
                return av4Var4;
            case 2:
                int i22 = this.E;
                list = this.u;
                String str20 = this.s;
                String str21 = this.r;
                y6a.M(obj);
                str8 = str21;
                i4 = i22;
                mediaPost = mediaPost2;
                str9 = str20;
                av4Var3 = null;
                context3 = context4;
                player2 = player3;
                team2 = team3;
                w4 = obj;
                PlayerEventStatisticsResponse playerEventStatisticsResponse32 = (PlayerEventStatisticsResponse) yaa.x((x2g) w4);
                if (playerEventStatisticsResponse32 != null) {
                    break;
                }
                Context context62 = context3;
                return new sk8(mediaPost.getId(), str8, str9, mediaPost.getCreatedAtTimestamp(), uxf.F(event2, context62, true, false, null, null, 60), Sports.FOOTBALL, uxf.G(player2), uxf.J(team2, context62, null, false, null, 30), l6g.W(CollectionsKt.B0(list)), i4 == 0 ? vk8.a : vk8.b, event2.getHasXg(), (playerEventStatisticsResponse32 != null || (statistics = playerEventStatisticsResponse32.getStatistics()) == null) ? av4Var3 : statistics.getRating(), new x43((MediaReactionType) null, 0, 0, (Boolean) null, 31));
            case 3:
                i9 = this.E;
                int i23 = this.D;
                i7 = this.C;
                ?? r6 = this.v;
                av4Var2 = this.t;
                str6 = this.s;
                str7 = this.r;
                y6a.M(obj);
                i8 = i23;
                obj2 = 0;
                mediaPost = mediaPost2;
                context2 = context4;
                w3 = obj;
                av4Var = r6;
                lu3Var3 = lu3Var5;
                playerShotmapResponse = (PlayerShotmapResponse) yaa.x((x2g) w3);
                if (playerShotmapResponse != null) {
                    break;
                }
                return obj2;
            case 4:
                i9 = this.E;
                int i24 = this.D;
                i7 = this.C;
                List<ShotMapPoint> list4 = this.w;
                ?? r9 = this.v;
                str6 = this.s;
                str7 = this.r;
                y6a.M(obj);
                mediaPost = mediaPost2;
                list2 = list4;
                context2 = context4;
                av4Var = r9;
                lu3Var3 = lu3Var5;
                T = obj;
                i10 = i24;
                str10 = str6;
                int i202 = i7;
                playerEventStatisticsResponse = (PlayerEventStatisticsResponse) yaa.x((x2g) T);
                if (playerEventStatisticsResponse != null) {
                    break;
                }
                str11 = str10;
                arrayList = null;
                int id2 = mediaPost.getId();
                long createdAtTimestamp2 = mediaPost.getCreatedAtTimestamp();
                lu3Var4 = lu3Var3;
                av4 av4Var62 = av4Var;
                ArrayList arrayList32 = arrayList;
                String str172 = str11;
                Context context72 = context2;
                bx7 F2 = uxf.F(event2, context72, true, false, null, null, 60);
                fy7 J2 = uxf.J(team3, context72, null, false, null, 30);
                ux7 G2 = uxf.G(player3);
                gv9 W3 = l6g.W(list2);
                if (arrayList32 == null) {
                }
                d = null;
                this.I = null;
                this.J = null;
                this.K = null;
                this.r = str7;
                this.s = str172;
                this.t = null;
                this.u = null;
                this.v = null;
                this.w = null;
                this.x = F2;
                this.y = J2;
                this.z = G2;
                this.A = W3;
                this.B = W2;
                this.C = i202;
                this.D = i10;
                this.E = i9;
                this.F = id2;
                this.G = createdAtTimestamp2;
                this.H = 5;
                T2 = av4Var62.T(this);
                if (T2 != lu3Var4) {
                }
                break;
            case 5:
                long j2 = this.G;
                int i25 = this.F;
                gv9 gv9Var3 = this.B;
                gv9 gv9Var4 = this.A;
                ux7 ux7Var2 = this.z;
                fy7 fy7Var2 = this.y;
                bx7 bx7Var2 = this.x;
                String str22 = this.s;
                String str23 = this.r;
                y6a.M(obj);
                i11 = i25;
                d = null;
                gv9Var2 = gv9Var3;
                gv9Var = gv9Var4;
                ux7Var = ux7Var2;
                fy7Var = fy7Var2;
                str13 = str22;
                str12 = str23;
                bx7Var = bx7Var2;
                T2 = obj;
                j = j2;
                PlayerEventStatisticsResponse playerEventStatisticsResponse222 = (PlayerEventStatisticsResponse) yaa.x((x2g) T2);
                return new zr1(i11, str12, str13, j, bx7Var, Sports.BASKETBALL, ux7Var, fy7Var, gv9Var, gv9Var2, (playerEventStatisticsResponse222 != null || (statistics2 = playerEventStatisticsResponse222.getStatistics()) == null) ? d : statistics2.getRating(), new x43((MediaReactionType) null, 0, 0, (Boolean) null, 31));
            case 6:
                i3 = this.E;
                String str24 = this.s;
                String str25 = this.r;
                y6a.M(obj);
                str4 = str25;
                str5 = str24;
                mediaPost = mediaPost2;
                context = context4;
                event = event2;
                player = player3;
                team = team3;
                w = obj;
                obj3 = null;
                list3 = (List) yaa.x((x2g) w);
                if (list3 != null) {
                }
                break;
            default:
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
