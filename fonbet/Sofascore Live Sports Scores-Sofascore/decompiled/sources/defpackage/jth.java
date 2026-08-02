package defpackage;

import android.content.SharedPreferences;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.network.response.PlayerOrTeam;
import com.sofascore.model.network.response.SeasonEventData;
import com.sofascore.model.network.response.SeasonPlayersData;
import com.sofascore.model.network.response.SeasonTorneoData;
import com.sofascore.model.network.response.SkillRadar;
import com.sofascore.model.network.response.SofaSeason;
import com.sofascore.model.network.response.SofaSeasonResponse;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class jth extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ kth t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jth(kth kthVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = kthVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        kth kthVar = this.t;
        switch (i) {
            case 0:
                return new jth(kthVar, rq3Var, 0);
            default:
                return new jth(kthVar, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((jth) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:135:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x08d5 A[LOOP:5: B:165:0x08cf->B:167:0x08d5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x06bf  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0735  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x05b6  */
    /* JADX WARN: Type inference failed for: r3v37, types: [km5] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String d;
        Object d2;
        Gender gender;
        Team team;
        Object obj2;
        int i;
        char c;
        int i2;
        Pair pair;
        q9k q9kVar;
        q9k q9kVar2;
        SeasonTorneoData torneoView;
        ArrayList arrayList;
        Object value;
        int i3;
        yz0 yz0Var;
        boolean z;
        Player player;
        Object value2;
        int i4 = this.r;
        kth kthVar = this.t;
        int i5 = 1;
        switch (i4) {
            case 0:
                SharedPreferences sharedPreferences = kthVar.f;
                lu3 lu3Var = lu3.a;
                int i6 = this.s;
                boolean z2 = false;
                if (i6 == 0) {
                    y6a.M(obj);
                    wt3.v(kthVar.g.b, "SOFA_SEASON_SHOWN_2025", true);
                    if (sharedPreferences.getBoolean("DEV_MODE_SHOW_SOFA_SEASON", false)) {
                        d = sharedPreferences.getString("DEV_MODE_SOFA_SEASON_ID", "10FBB22F-30DD-417D-9AFA-69A544B3B46C");
                        if (d == null) {
                            d = "";
                        }
                    } else {
                        Calendar calendar = ke0.a;
                        d = ke0.d(kthVar.i());
                    }
                    dhk dhkVar = kthVar.e;
                    this.s = 1;
                    d2 = dhkVar.d(d, this);
                    if (d2 == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i6 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    d2 = obj;
                }
                SofaSeasonResponse sofaSeasonResponse = (SofaSeasonResponse) d2;
                SofaSeason sofaSeason = sofaSeasonResponse != null ? sofaSeasonResponse.getSofaSeason() : null;
                fdi fdiVar = kthVar.h;
                if (sofaSeason == null) {
                    do {
                        value2 = fdiVar.getValue();
                    } while (!fdiVar.k(value2, hth.a((hth) value2, rlh.b, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, false, 62)));
                } else {
                    PlayerOrTeam playerOrTeam = (PlayerOrTeam) CollectionsKt.firstOrNull(sofaSeason.getPlayersData().getPlayers());
                    if (playerOrTeam == null || (player = playerOrTeam.getPlayer()) == null || (gender = player.getGender()) == null) {
                        gender = (playerOrTeam == null || (team = playerOrTeam.getTeam()) == null) ? null : team.getGender();
                        if (gender == null) {
                            gender = Gender.Male;
                        }
                    }
                    x3f x3fVar = ehk.e;
                    String title = sofaSeason.getSkillRadar().getTitle();
                    x3fVar.getClass();
                    title.getClass();
                    Iterator it = ehk.h.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            if (((ehk) obj2).d.equals(title)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    ehk ehkVar = (ehk) obj2;
                    if (ehkVar == null) {
                        ehkVar = ehk.f;
                    }
                    ehk ehkVar2 = ehkVar;
                    b7 K = l6g.K(new lmi(sofaSeason.getSkillRadar().getFrequency(), vv3.FREQUENCY), new lmi(sofaSeason.getSkillRadar().getCoverage(), vv3.COVERAGE), new lmi(sofaSeason.getSkillRadar().getDepth(), vv3.DEPTH), new lmi(sofaSeason.getSkillRadar().getStyle(), vv3.STYLE), new lmi(sofaSeason.getSkillRadar().getPopularity(), vv3.POPULARITY));
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(new eaa(l6g.K(new jjj(new q9k(R.string.season_25_title), null, 6), new caa(new q9k(R.string.season_25_opening_this_year)))));
                    List<Double> monthStats = sofaSeason.getMonthStats();
                    monthStats.getClass();
                    ArrayList arrayList3 = new ArrayList(11);
                    for (int i7 = 0; i7 < 11; i7++) {
                        arrayList3.add(null);
                    }
                    int size = 11 - monthStats.size();
                    if (size < 0) {
                        size = 0;
                    }
                    int i8 = 0;
                    for (Object obj3 : monthStats) {
                        int i9 = i8 + 1;
                        if (i8 < 0) {
                            b.q();
                            throw null;
                        }
                        double doubleValue = ((Number) obj3).doubleValue();
                        int i10 = i8 + size;
                        if (i10 < 0 || i10 >= 11) {
                            z = z2;
                        } else {
                            z = z2;
                            arrayList3.set(i10, Double.valueOf(doubleValue));
                        }
                        z2 = z;
                        i8 = i9;
                    }
                    boolean z3 = z2;
                    ArrayList arrayList4 = new ArrayList(k13.r(arrayList3, 10));
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        Double d3 = (Double) it2.next();
                        if (d3 != null) {
                            i3 = i5;
                            double doubleValue2 = d3.doubleValue();
                            double doubleValue3 = d3.doubleValue();
                            int i11 = R.color.rating_00;
                            if (doubleValue3 != 0.0d) {
                                if (doubleValue3 < 6.0d) {
                                    i11 = R.color.rating_10;
                                } else if (doubleValue3 < 6.5d) {
                                    i11 = R.color.rating_60;
                                } else if (doubleValue3 < 7.0d) {
                                    i11 = R.color.rating_65;
                                } else if (doubleValue3 < 8.0d) {
                                    i11 = R.color.rating_70;
                                } else if (doubleValue3 < 9.0d) {
                                    i11 = R.color.rating_80;
                                } else if (doubleValue3 <= 10.0d) {
                                    i11 = R.color.rating_90;
                                }
                            }
                            yz0Var = new yz0(doubleValue2, i11);
                        } else {
                            i3 = i5;
                            yz0Var = null;
                        }
                        arrayList4.add(yz0Var);
                        i5 = i3;
                    }
                    int i12 = i5;
                    yp2 yp2Var = new yp2(size, l6g.W(arrayList4));
                    int i13 = size == 0 ? z3 ? 1 : 0 : size + 1;
                    jjj jjjVar = new jjj(new q9k(R.string.season_25_calendar_intro_header), new q9k(R.string.season_25_calendar_intro_subheader), 4);
                    fvc fvcVar = new fvc(yp2Var, new o9k(R.string.season_25_calendar_intro_title, l6g.L(new Pair("monthIndex", Integer.valueOf(i13)))), i13 != 0 ? new q9k(R.string.season_25_calendar_month_subheader) : new q9k(R.string.season_25_calendar_year_subheader), new o9k(R.string.season_25_share_calendar_intro_title, l6g.L(new Pair("monthIndex", Integer.valueOf(i13)))));
                    fm8[] fm8VarArr = new fm8[2];
                    fm8VarArr[z3 ? 1 : 0] = jjjVar;
                    fm8VarArr[i12] = fvcVar;
                    arrayList2.add(new hvc(l6g.K(fm8VarArr)));
                    List<Sport> sports = sofaSeason.getSports();
                    q9k q9kVar3 = sports.size() >= 3 ? new q9k(R.string.season_25_top_sports_handful_intro) : new q9k(R.string.season_25_top_sports_favourite_intro);
                    fm8 omjVar = sports.size() >= 3 ? new omj(new q9k(R.string.season_25_top_sports_handful_subheader), new q9k(R.string.season_25_share_top_sports_handful), CollectionsKt.L0(sports, 3)) : new nmj((Sport) CollectionsKt.Y(sports), new q9k(R.string.season_25_top_sports_favourite_subheader), new q9k(R.string.season_25_share_top_sports_favourite));
                    fm8[] fm8VarArr2 = new fm8[2];
                    fm8VarArr2[z3 ? 1 : 0] = new jjj(q9kVar3, null, 6);
                    fm8VarArr2[i12] = omjVar;
                    arrayList2.add(new pmj(l6g.K(fm8VarArr2)));
                    SeasonEventData eventsData = sofaSeason.getEventsData();
                    xbb b = a.b();
                    int attendedCount = eventsData.getAttendedCount();
                    List list = dla.a;
                    b.add(new jjj(new p9k(R.plurals.season_25_top_events_intro_header, attendedCount, l6g.K(dla.i(Integer.valueOf(eventsData.getAttendedCount())))), new q9k(R.string.season_25_top_events_intro_subheader), 4));
                    b.add(new dlj(new q9k(R.string.season_25_top_events_remember_header), (Event) CollectionsKt.Y(eventsData.getEvents()), new p9k(R.plurals.season_25_top_events_remember_subheader, eventsData.getOpenCount(), l6g.K(dla.i(Integer.valueOf(eventsData.getOpenCount())))), new p9k(R.plurals.season_25_share_top_events_remember_subheader, eventsData.getOpenCount(), l6g.K(dla.i(Integer.valueOf(eventsData.getOpenCount()))))));
                    if (eventsData.getEvents().size() >= 3) {
                        b.add(new elj(new q9k(R.string.season_25_top_events_three), new q9k(R.string.season_25_share_top_events_three), CollectionsKt.L0(eventsData.getEvents(), 3)));
                    }
                    Unit unit = Unit.a;
                    arrayList2.add(new flj(l6g.W(a.a(b))));
                    List<Team> teams = sofaSeason.getTeams();
                    q9k q9kVar4 = teams.size() > i12 ? new q9k(R.string.season_25_top_teams_multiple) : new q9k(R.string.season_25_top_teams_one);
                    jjj jjjVar2 = new jjj(new q9k(R.string.season_25_top_teams_intro), null, 6);
                    q9k q9kVar5 = teams.size() == 1 ? new q9k(R.string.season_25_share_top_teams_one) : new q9k(R.string.season_25_share_top_teams_multiple);
                    if (teams.size() == 1) {
                        i = 4000;
                        c = 1;
                    } else {
                        char c2 = 1;
                        if (teams.size() <= 3) {
                            i = 7000;
                            c = c2;
                        } else {
                            i = 8000;
                            c = c2;
                        }
                    }
                    ooj oojVar = new ooj(q9kVar4, teams, i, q9kVar5);
                    fm8[] fm8VarArr3 = new fm8[2];
                    fm8VarArr3[z3 ? 1 : 0] = jjjVar2;
                    fm8VarArr3[c] = oojVar;
                    arrayList2.add(new mpj(l6g.K(fm8VarArr3)));
                    SeasonPlayersData playersData = sofaSeason.getPlayersData();
                    PlayerOrTeam playerOrTeam2 = (PlayerOrTeam) CollectionsKt.Y(playersData.getPlayers());
                    Boolean isTopOneFan = playersData.isTopOneFan();
                    Boolean bool = Boolean.TRUE;
                    if (Intrinsics.c(isTopOneFan, bool)) {
                        pair = new Pair(new q9k(R.string.season_25_top_player_number_one_header), new q9k(R.string.season_25_top_player_number_one_subheader));
                        i2 = 99;
                    } else if (Intrinsics.c(playersData.isTopOnePercentFan(), bool)) {
                        i2 = 99;
                        pair = new Pair(new q9k(R.string.season_25_top_player_one_percent_header, l6g.K(yid.r(1))), new q9k(R.string.season_25_top_player_one_percent_subheader, l6g.K(yid.r(99))));
                    } else {
                        i2 = 99;
                        pair = new Pair(new n9k(R.string.season_25_top_player_standard_header, gender), new q9k(R.string.season_25_top_player_standard_subheader));
                    }
                    r9k r9kVar = (r9k) pair.a;
                    q9k q9kVar6 = (q9k) pair.b;
                    if (Intrinsics.c(playersData.isTopOneFan(), bool)) {
                        q9kVar2 = new q9k(R.string.season_25_share_top_player_number_one_subheader);
                    } else if (Intrinsics.c(playersData.isTopOnePercentFan(), bool)) {
                        q9kVar2 = new q9k(R.string.season_25__share_top_player_one_percent_subheader, l6g.K(yid.r(i2)));
                    } else {
                        q9kVar = null;
                        jjj jjjVar3 = new jjj(new p9k(R.plurals.season_25_top_player_intro_header, playersData.getOpenCount(), l6g.K(dla.i(Integer.valueOf(playersData.getOpenCount())))), new n9k(R.string.season_25_top_player_intro_subheader, gender), 4);
                        Player player2 = playerOrTeam2.getPlayer();
                        Team team2 = playerOrTeam2.getTeam();
                        int profileViewCount = playersData.getProfileViewCount();
                        Boolean isTopOneFan2 = playersData.isTopOneFan();
                        boolean booleanValue = isTopOneFan2 == null ? isTopOneFan2.booleanValue() : z3 ? 1 : 0;
                        Boolean isTopOnePercentFan = playersData.isTopOnePercentFan();
                        ylj yljVar = new ylj(r9kVar, player2, team2, profileViewCount, booleanValue, isTopOnePercentFan == null ? isTopOnePercentFan.booleanValue() : z3 ? 1 : 0, q9kVar6, new n9k(R.string.season_25_share_top_player, gender), q9kVar);
                        fm8[] fm8VarArr4 = new fm8[2];
                        fm8VarArr4[z3 ? 1 : 0] = jjjVar3;
                        fm8VarArr4[1] = yljVar;
                        arrayList2.add(new emj(l6g.K(fm8VarArr4)));
                        if (sofaSeason.getPlayersData().getPlayers().size() >= 3) {
                            gv9 W = l6g.W(sofaSeason.getPlayersData().getPlayers());
                            jjj jjjVar4 = new jjj(new q9k(R.string.season_25_top_players_intro_header), null, 6);
                            gmj gmjVar = new gmj(W.size() > 3 ? new q9k(R.string.season_25_top_players_top_five) : new q9k(R.string.season_25_top_players_top_three), W, W.size() > 3 ? 8000 : 7000, new q9k(R.string.season_25_share_top_players));
                            fm8[] fm8VarArr5 = new fm8[2];
                            fm8VarArr5[z3 ? 1 : 0] = jjjVar4;
                            fm8VarArr5[1] = gmjVar;
                            arrayList2.add(new jmj(l6g.K(fm8VarArr5)));
                            List<Player> lineupPlayers = sofaSeason.getPlayersData().getLineupPlayers();
                            if (lineupPlayers != null) {
                                jjj jjjVar5 = new jjj(new q9k(R.string.season_25_lineup_intro), null, 6);
                                v8b v8bVar = new v8b(lineupPlayers, new q9k(R.string.season_25_share_lineup_intro));
                                fm8[] fm8VarArr6 = new fm8[2];
                                fm8VarArr6[z3 ? 1 : 0] = jjjVar5;
                                fm8VarArr6[1] = v8bVar;
                                arrayList2.add(new eab(l6g.K(fm8VarArr6)));
                            }
                        }
                        ArrayList arrayList5 = new ArrayList();
                        jjj jjjVar6 = new jjj(new q9k(R.string.season_25_bonus_intro), null, 6);
                        torneoView = sofaSeason.getTorneoView();
                        boolean c3 = Intrinsics.c(sofaSeason.getContributorTopOnePercent(), bool);
                        Integer predictorVotesCount = sofaSeason.getPredictorVotesCount();
                        if (torneoView != null && !c3 && predictorVotesCount == null) {
                            arrayList = km5.a;
                        } else if (torneoView == null) {
                            nqj nqjVar = new nqj(new p9k(R.plurals.season_25_bonus_torneo_header, torneoView.getAdditionsCount(), l6g.K(dla.i(Integer.valueOf(torneoView.getAdditionsCount())))), torneoView.getAdditionsCount(), torneoView.getEvent(), torneoView.getViewsCount(), new p9k(R.plurals.season_25_share_bonus_torneo_header, torneoView.getAdditionsCount(), l6g.K(dla.i(Integer.valueOf(torneoView.getAdditionsCount())))), new q9k(R.string.season_25_share_bonus_torneo_match));
                            fm8[] fm8VarArr7 = new fm8[2];
                            fm8VarArr7[z3 ? 1 : 0] = jjjVar6;
                            fm8VarArr7[1] = nqjVar;
                            arrayList5.add(new z80(l6g.K(fm8VarArr7)));
                            arrayList = arrayList5;
                        } else {
                            arrayList = arrayList5;
                            if (c3) {
                                i4f i4fVar = new i4f(false, new q9k(R.string.season_25_bonus_contributor_header, l6g.K(yid.r(1))), new q9k(R.string.season_25_bonus_contributor_subheader), new q9k(R.string.season_25_share_bonus_contributor_header), new q9k(R.string.season_25_share_bonus_contributor_subheader, l6g.K(yid.r(1))));
                                fm8[] fm8VarArr8 = new fm8[2];
                                fm8VarArr8[z3 ? 1 : 0] = jjjVar6;
                                fm8VarArr8[1] = i4fVar;
                                arrayList5.add(new z80(l6g.K(fm8VarArr8)));
                                arrayList = arrayList5;
                            } else if (predictorVotesCount != null) {
                                i4f i4fVar2 = new i4f(true, new p9k(R.plurals.season_25_bonus_predictor_header, predictorVotesCount.intValue(), l6g.K(dla.i(predictorVotesCount), yid.r(5))), new q9k(R.string.season_25_bonus_predictor_subheader), new q9k(R.string.season_25_share_bonus_predictor_header), new q9k(R.string.season_25_share_bonus_predictor_subheader, l6g.K(yid.r(5))));
                                fm8[] fm8VarArr9 = new fm8[2];
                                fm8VarArr9[z3 ? 1 : 0] = jjjVar6;
                                fm8VarArr9[1] = i4fVar2;
                                arrayList5.add(new z80(l6g.K(fm8VarArr9)));
                                arrayList = arrayList5;
                            }
                        }
                        arrayList2.addAll(arrayList);
                        SkillRadar skillRadar = sofaSeason.getSkillRadar();
                        n1k n1kVar = (sofaSeason.getTorneoView() == null || sofaSeason.getPredictorVotesCount() != null || Intrinsics.c(sofaSeason.getContributorTopOnePercent(), bool)) ? new n1k(k1h.h, k1h.g, new r13(k1h.i)) : new n1k(k1h.k, k1h.j, new r13(k1h.l));
                        b7 b7Var = (b7) n1kVar.a;
                        b7 b7Var2 = (b7) n1kVar.b;
                        long j = ((r13) n1kVar.c).a;
                        ArrayList arrayList6 = new ArrayList();
                        List<Pair> j2 = b.j(new Pair(Integer.valueOf(skillRadar.getFrequency()), vv3.FREQUENCY), new Pair(Integer.valueOf(skillRadar.getCoverage()), vv3.COVERAGE), new Pair(Integer.valueOf(skillRadar.getDepth()), vv3.DEPTH), new Pair(Integer.valueOf(skillRadar.getStyle()), vv3.STYLE), new Pair(Integer.valueOf(skillRadar.getPopularity()), vv3.POPULARITY));
                        arrayList6.add(new skh(b7Var, b7Var2, j, l6g.K(new jjj(new q9k(R.string.season_25_attributes_intro), null, 2)), "skill_intro"));
                        for (Pair pair2 : j2) {
                            int intValue = ((Number) pair2.a).intValue();
                            vv3 vv3Var = (vv3) pair2.b;
                            arrayList6.add(new skh(b7Var, b7Var2, j, l6g.K(new nkh(intValue, vv3Var)), vv3Var.h));
                        }
                        arrayList6.add(new skh(b7Var, b7Var2, j, l6g.K(new tkh(new q9k(R.string.season_25_attribute_overview), l6g.K(new lmi(skillRadar.getFrequency(), vv3.FREQUENCY), new lmi(skillRadar.getCoverage(), vv3.COVERAGE), new lmi(skillRadar.getDepth(), vv3.DEPTH), new lmi(skillRadar.getStyle(), vv3.STYLE), new lmi(skillRadar.getPopularity(), vv3.POPULARITY)), new q9k(R.string.season_25_share_attribute_overview))), "skill_radar"));
                        arrayList2.addAll(arrayList6);
                        Team team3 = (Team) CollectionsKt.Y(sofaSeason.getTeams());
                        PlayerOrTeam playerOrTeam3 = (PlayerOrTeam) CollectionsKt.Y(sofaSeason.getPlayersData().getPlayers());
                        Sport sport = (Sport) CollectionsKt.Y(sofaSeason.getSports());
                        jjj jjjVar7 = new jjj(new q9k(R.string.season_25_fan_type_intro), null, 6);
                        mmi mmiVar = new mmi(ehkVar2, new q9k(R.string.season_25_share_fan_type_intro));
                        fm8[] fm8VarArr10 = new fm8[2];
                        fm8VarArr10[z3 ? 1 : 0] = jjjVar7;
                        fm8VarArr10[1] = mmiVar;
                        arrayList2.addAll(b.j(new omi(l6g.K(fm8VarArr10), 39), new omi(l6g.K(new pmi(ehkVar2, K, team3, playerOrTeam3, sofaSeason.getEventsData().getAttendedCount(), sport)), 55)));
                        do {
                            value = fdiVar.getValue();
                        } while (!fdiVar.k(value, hth.a((hth) value, l6g.W(arrayList2), 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, false, 62)));
                    }
                    q9kVar = q9kVar2;
                    jjj jjjVar32 = new jjj(new p9k(R.plurals.season_25_top_player_intro_header, playersData.getOpenCount(), l6g.K(dla.i(Integer.valueOf(playersData.getOpenCount())))), new n9k(R.string.season_25_top_player_intro_subheader, gender), 4);
                    Player player22 = playerOrTeam2.getPlayer();
                    Team team22 = playerOrTeam2.getTeam();
                    int profileViewCount2 = playersData.getProfileViewCount();
                    Boolean isTopOneFan22 = playersData.isTopOneFan();
                    if (isTopOneFan22 == null) {
                    }
                    Boolean isTopOnePercentFan2 = playersData.isTopOnePercentFan();
                    ylj yljVar2 = new ylj(r9kVar, player22, team22, profileViewCount2, booleanValue, isTopOnePercentFan2 == null ? isTopOnePercentFan2.booleanValue() : z3 ? 1 : 0, q9kVar6, new n9k(R.string.season_25_share_top_player, gender), q9kVar);
                    fm8[] fm8VarArr42 = new fm8[2];
                    fm8VarArr42[z3 ? 1 : 0] = jjjVar32;
                    fm8VarArr42[1] = yljVar2;
                    arrayList2.add(new emj(l6g.K(fm8VarArr42)));
                    if (sofaSeason.getPlayersData().getPlayers().size() >= 3) {
                    }
                    ArrayList arrayList52 = new ArrayList();
                    jjj jjjVar62 = new jjj(new q9k(R.string.season_25_bonus_intro), null, 6);
                    torneoView = sofaSeason.getTorneoView();
                    boolean c32 = Intrinsics.c(sofaSeason.getContributorTopOnePercent(), bool);
                    Integer predictorVotesCount2 = sofaSeason.getPredictorVotesCount();
                    if (torneoView != null) {
                    }
                    if (torneoView == null) {
                    }
                    arrayList2.addAll(arrayList);
                    SkillRadar skillRadar2 = sofaSeason.getSkillRadar();
                    if (sofaSeason.getTorneoView() == null) {
                    }
                    b7 b7Var3 = (b7) n1kVar.a;
                    b7 b7Var22 = (b7) n1kVar.b;
                    long j3 = ((r13) n1kVar.c).a;
                    ArrayList arrayList62 = new ArrayList();
                    List<Pair> j22 = b.j(new Pair(Integer.valueOf(skillRadar2.getFrequency()), vv3.FREQUENCY), new Pair(Integer.valueOf(skillRadar2.getCoverage()), vv3.COVERAGE), new Pair(Integer.valueOf(skillRadar2.getDepth()), vv3.DEPTH), new Pair(Integer.valueOf(skillRadar2.getStyle()), vv3.STYLE), new Pair(Integer.valueOf(skillRadar2.getPopularity()), vv3.POPULARITY));
                    arrayList62.add(new skh(b7Var3, b7Var22, j3, l6g.K(new jjj(new q9k(R.string.season_25_attributes_intro), null, 2)), "skill_intro"));
                    while (r4.hasNext()) {
                    }
                    arrayList62.add(new skh(b7Var3, b7Var22, j3, l6g.K(new tkh(new q9k(R.string.season_25_attribute_overview), l6g.K(new lmi(skillRadar2.getFrequency(), vv3.FREQUENCY), new lmi(skillRadar2.getCoverage(), vv3.COVERAGE), new lmi(skillRadar2.getDepth(), vv3.DEPTH), new lmi(skillRadar2.getStyle(), vv3.STYLE), new lmi(skillRadar2.getPopularity(), vv3.POPULARITY)), new q9k(R.string.season_25_share_attribute_overview))), "skill_radar"));
                    arrayList2.addAll(arrayList62);
                    Team team32 = (Team) CollectionsKt.Y(sofaSeason.getTeams());
                    PlayerOrTeam playerOrTeam32 = (PlayerOrTeam) CollectionsKt.Y(sofaSeason.getPlayersData().getPlayers());
                    Sport sport2 = (Sport) CollectionsKt.Y(sofaSeason.getSports());
                    jjj jjjVar72 = new jjj(new q9k(R.string.season_25_fan_type_intro), null, 6);
                    mmi mmiVar2 = new mmi(ehkVar2, new q9k(R.string.season_25_share_fan_type_intro));
                    fm8[] fm8VarArr102 = new fm8[2];
                    fm8VarArr102[z3 ? 1 : 0] = jjjVar72;
                    fm8VarArr102[1] = mmiVar2;
                    arrayList2.addAll(b.j(new omi(l6g.K(fm8VarArr102), 39), new omi(l6g.K(new pmi(ehkVar2, K, team32, playerOrTeam32, sofaSeason.getEventsData().getAttendedCount(), sport2)), 55)));
                    do {
                        value = fdiVar.getValue();
                    } while (!fdiVar.k(value, hth.a((hth) value, l6g.W(arrayList2), 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, false, 62)));
                }
                return Unit.a;
            default:
                lu3 lu3Var2 = lu3.a;
                int i14 = this.s;
                if (i14 == 0) {
                    y6a.M(obj);
                    g62 g62Var = kthVar.j;
                    Unit unit2 = Unit.a;
                    this.s = 1;
                    if (g62Var.q(this, unit2) == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i14 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
        }
    }
}
