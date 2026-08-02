package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.telephony.TelephonyManager;
import android.view.View;
import androidx.compose.runtime.e;
import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.TournamentRoundWrapper;
import com.sofascore.model.newNetwork.TeamOfTheWeekPlayer;
import com.sofascore.model.newNetwork.TeamOfTheWeekResponse;
import com.sofascore.model.newNetwork.TeamOfTheWeekRoundsResponseKt;
import com.sofascore.results.R;
import com.sofascore.results.league.fragment.details.compose.model.TeamOfTheWeekFieldUIData;
import com.sofascore.results.league.fragment.details.compose.model.TeamOfTheWeekPlayerUIData;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class qha {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;
    public static final /* synthetic */ int c = 0;
    public static final /* synthetic */ int d = 0;
    public static final /* synthetic */ int e = 0;

    public static Integer A(Context context, String str, String str2, boolean z) {
        context.getClass();
        if (!((Boolean) n9e.x(context, new sx0(str2, z, 7))).booleanValue()) {
            return null;
        }
        boolean z2 = Intrinsics.c(str, context.getString(R.string.sofascore_rating)) || Intrinsics.c(str, context.getString(R.string.average_sofascore_rating));
        int hashCode = str2.hashCode();
        if (hashCode == 428700453) {
            if (!str2.equals("league_top_stats")) {
                return null;
            }
            Integer valueOf = Integer.valueOf(R.string.rating_top_stats_specific);
            if (z2) {
                return valueOf;
            }
            return null;
        }
        if (hashCode == 429176892) {
            if (!str2.equals("league_top_teams")) {
                return null;
            }
            Integer valueOf2 = Integer.valueOf(R.string.rating_top_teams_specific);
            if (z2) {
                return valueOf2;
            }
            return null;
        }
        if (hashCode != 1067837112 || !str2.equals("league_top_players")) {
            return null;
        }
        if (!z) {
            Integer valueOf3 = Integer.valueOf(R.string.rating_top_players_specific_criteria);
            if (z2) {
                return valueOf3;
            }
            return null;
        }
        Integer valueOf4 = Integer.valueOf(R.string.nba_top_players_criteria);
        List j = b.j(Integer.valueOf(R.string.sofascore_rating), Integer.valueOf(R.string.average_sofascore_rating), Integer.valueOf(R.string.points_basketball), Integer.valueOf(R.string.rebounds), Integer.valueOf(R.string.basketball_assists), Integer.valueOf(R.string.basketball_minutes_per_game), Integer.valueOf(R.string.field_goals_percentage_made), Integer.valueOf(R.string.free_throws_percentage_made), Integer.valueOf(R.string.three_points_percentage_made), Integer.valueOf(R.string.defensive_rebounds), Integer.valueOf(R.string.offensive_rebounds), Integer.valueOf(R.string.steals), Integer.valueOf(R.string.turnovers), Integer.valueOf(R.string.blocks), Integer.valueOf(R.string.assist_to_turnover_ratio), Integer.valueOf(R.string.plus_minus_per_game), Integer.valueOf(R.string.performance_index_rating_long));
        ArrayList arrayList = new ArrayList(k13.r(j, 10));
        Iterator it = j.iterator();
        while (it.hasNext()) {
            arrayList.add(context.getString(((Number) it.next()).intValue()));
        }
        if (CollectionsKt.R(arrayList, str)) {
            return valueOf4;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final jjg B() {
        boolean z;
        Network activeNetwork;
        jjg jjgVar = jjg.NETWORK_CONNECTION_TYPE_UNKNOWN;
        Context context = hkg.a;
        if (context == null) {
            return jjgVar;
        }
        Object systemService = context.getSystemService("connectivity");
        systemService.getClass();
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        int i = 0;
        try {
            activeNetwork = connectivityManager.getActiveNetwork();
        } catch (Throwable unused) {
        }
        if (activeNetwork != null) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
            Boolean valueOf = networkCapabilities != null ? Boolean.valueOf(networkCapabilities.hasTransport(1)) : null;
            if (valueOf != null) {
                z = valueOf.booleanValue();
                if (!z) {
                    return jjg.NETWORK_CONNECTION_TYPE_WIFI;
                }
                try {
                    Object systemService2 = context.getSystemService("phone");
                    systemService2.getClass();
                    i = ((TelephonyManager) systemService2).getDataNetworkType();
                } catch (Throwable unused2) {
                }
                jjg jjgVar2 = jjg.NETWORK_CONNECTION_TYPE_UNKNOWN;
                if (i == 15) {
                    jjgVar = jjg.NETWORK_CONNECTION_TYPE_H_PLUS;
                }
                if (jjgVar == jjgVar2 && i == 13) {
                    jjgVar = jjg.NETWORK_CONNECTION_TYPE_4G;
                }
                if (jjgVar != jjgVar2) {
                    return jjgVar;
                }
                if (i == 0) {
                    return jjg.NETWORK_CONNECTION_TYPE_2G;
                }
                if (i == 3) {
                    return jjg.NETWORK_CONNECTION_TYPE_3G;
                }
                switch (i) {
                    case 8:
                    case 9:
                    case 10:
                        return jjg.NETWORK_CONNECTION_TYPE_3G_PLUS;
                    default:
                        return jjg.NETWORK_CONNECTION_TYPE_2G;
                }
            }
        }
        z = false;
        if (!z) {
        }
    }

    public static final q0f C(View view) {
        q0f q0fVar = (q0f) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (q0fVar != null) {
            return q0fVar;
        }
        q0f q0fVar2 = new q0f();
        view.setTag(R.id.pooling_container_listener_holder_tag, q0fVar2);
        return q0fVar2;
    }

    public static boolean D(Context context, String str) {
        SharedPreferences d2;
        context.getClass();
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (uic.i) {
                d2 = a5f.d(applicationContext);
                uic.j = d2;
            }
            d2.getClass();
            sharedPreferences = d2;
        }
        return sharedPreferences.getBoolean("open_pinned_v2" + str, true);
    }

    public static boolean E(Context context) {
        SharedPreferences d2;
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (uic.i) {
                d2 = a5f.d(applicationContext);
                uic.j = d2;
            }
            d2.getClass();
            sharedPreferences = d2;
        }
        return sharedPreferences.getBoolean("pinned_leagues_redesign_opened", false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x01ff, code lost:
    
        if (r3 == null) goto L109;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static xxi F(Context context, String str, int i, List list, TournamentRoundWrapper tournamentRoundWrapper, TeamOfTheWeekResponse teamOfTheWeekResponse, boolean z, boolean z2, boolean z3, nn6 nn6Var, boolean z4, TeamOfTheWeekFieldUIData teamOfTheWeekFieldUIData, gv9 gv9Var) {
        String str2;
        String string;
        String i2;
        TeamOfTheWeekFieldUIData teamOfTheWeekFieldUIData2;
        gv9 gv9Var2;
        boolean z5;
        String str3;
        String str4;
        TeamOfTheWeekFieldUIData teamOfTheWeekFieldUIData3;
        String i3;
        String c2;
        List<TeamOfTheWeekPlayer> players;
        List B0;
        Iterator it;
        int i4;
        xoe xoeVar;
        Team awayTeam$default;
        List split$default;
        String str5;
        Double f;
        Long dateFrom;
        context.getClass();
        str.getClass();
        list.getClass();
        String str6 = TeamOfTheWeekRoundsResponseKt.TOTW_ROUND;
        if (tournamentRoundWrapper == null || (str2 = tournamentRoundWrapper.getTotwType()) == null) {
            str2 = TeamOfTheWeekRoundsResponseKt.TOTW_ROUND;
        }
        if (str2.equals(TeamOfTheWeekRoundsResponseKt.TOTW_SEASON)) {
            string = (z || z2) ? context.getString(R.string.team_of_the_tournament) : context.getString(R.string.team_of_the_season);
            string.getClass();
        } else {
            string = z ? context.getString(R.string.football_team_of_the_round) : context.getString(R.string.team_of_the_week);
            string.getClass();
        }
        String r = (!str2.equals(TeamOfTheWeekRoundsResponseKt.TOTW_TIMESPAN) || tournamentRoundWrapper == null || (dateFrom = tournamentRoundWrapper.getDateFrom()) == null) ? null : rik.r(tournamentRoundWrapper.getDateTo(), dateFrom.longValue());
        long createdAtTimestamp = tournamentRoundWrapper != null ? tournamentRoundWrapper.getCreatedAtTimestamp() : 0L;
        if (createdAtTimestamp <= 0) {
            i2 = "";
        } else {
            bi4 bi4Var = bi4.PATTERN_DMM;
            ConcurrentHashMap concurrentHashMap = hk4.a;
            i2 = wv8.i(context.getString(R.string.date_published), " ", fc6.i(createdAtTimestamp, hk4.a(bi4Var.d())));
        }
        boolean z6 = true;
        if (teamOfTheWeekResponse != null) {
            boolean equals = str2.equals(TeamOfTheWeekRoundsResponseKt.TOTW_SEASON);
            split$default = StringsKt__StringsKt.split$default(teamOfTheWeekResponse.getFormation(), new String[]{"-"}, false, 0, 6, null);
            ArrayList arrayList = new ArrayList();
            Iterator it2 = split$default.iterator();
            while (it2.hasNext()) {
                Integer intOrNull = StringsKt.toIntOrNull((String) it2.next());
                if (intOrNull != null) {
                    arrayList.add(intOrNull);
                }
            }
            gv9 W = l6g.W(CollectionsKt.w0(a.c(1), CollectionsKt.B0(arrayList)));
            List<TeamOfTheWeekPlayer> players2 = teamOfTheWeekResponse.getPlayers();
            ArrayList arrayList2 = new ArrayList(k13.r(players2, 10));
            for (TeamOfTheWeekPlayer teamOfTheWeekPlayer : players2) {
                Player player = teamOfTheWeekPlayer.getPlayer();
                int id = player != null ? player.getId() : 0;
                Player player2 = teamOfTheWeekPlayer.getPlayer();
                if (player2 == null || (str5 = tba.C(player2)) == null) {
                    str5 = "";
                }
                Team team = teamOfTheWeekPlayer.getTeam();
                int id2 = team != null ? team.getId() : 0;
                String rating = teamOfTheWeekPlayer.getRating();
                arrayList2.add(new TeamOfTheWeekPlayerUIData(id, str5, id2, equals, Double.valueOf((rating == null || (f = kotlin.text.b.f(rating)) == null) ? 0.0d : f.doubleValue())));
            }
            teamOfTheWeekFieldUIData2 = new TeamOfTheWeekFieldUIData(W, l6g.W(arrayList2), str);
        } else {
            teamOfTheWeekFieldUIData2 = teamOfTheWeekFieldUIData;
        }
        if (teamOfTheWeekResponse != null && (players = teamOfTheWeekResponse.getPlayers()) != null && (B0 = CollectionsKt.B0(players)) != null) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = B0.iterator();
            while (it3.hasNext()) {
                TeamOfTheWeekPlayer teamOfTheWeekPlayer2 = (TeamOfTheWeekPlayer) it3.next();
                Player player3 = teamOfTheWeekPlayer2.getPlayer();
                if (player3 == null) {
                    it = it3;
                    xoeVar = null;
                } else {
                    Event event = teamOfTheWeekPlayer2.getEvent();
                    String rating2 = teamOfTheWeekPlayer2.getRating();
                    Double f2 = rating2 != null ? kotlin.text.b.f(rating2) : null;
                    Team team2 = teamOfTheWeekPlayer2.getTeam();
                    if (teamOfTheWeekPlayer2.getEvent() == null || teamOfTheWeekPlayer2.getTeam() == null) {
                        it = it3;
                    } else {
                        Event event2 = teamOfTheWeekPlayer2.getEvent();
                        it = it3;
                        Integer valueOf = (event2 == null || (awayTeam$default = Event.getAwayTeam$default(event2, null, 1, null)) == null) ? null : Integer.valueOf(awayTeam$default.getId());
                        Team team3 = teamOfTheWeekPlayer2.getTeam();
                        if (Intrinsics.c(valueOf, team3 != null ? Integer.valueOf(team3.getId()) : null)) {
                            i4 = 2;
                            xoeVar = new xoe(player3, event, f2, null, team2, i4, null);
                        }
                    }
                    i4 = 1;
                    xoeVar = new xoe(player3, event, f2, null, team2, i4, null);
                }
                if (xoeVar != null) {
                    arrayList3.add(xoeVar);
                }
                it3 = it;
            }
            gv9Var2 = l6g.W(arrayList3);
        }
        gv9Var2 = gv9Var == null ? rlh.b : gv9Var;
        ArrayList arrayList4 = new ArrayList(k13.r(list, 10));
        Iterator it4 = list.iterator();
        while (it4.hasNext()) {
            TournamentRoundWrapper tournamentRoundWrapper2 = (TournamentRoundWrapper) it4.next();
            boolean z7 = z6;
            tournamentRoundWrapper2.getClass();
            gv9 gv9Var3 = gv9Var2;
            String totwType = tournamentRoundWrapper2.getTotwType();
            String str7 = string;
            int hashCode = totwType.hashCode();
            String str8 = r;
            if (hashCode == -2076435561) {
                str4 = str6;
                teamOfTheWeekFieldUIData3 = teamOfTheWeekFieldUIData2;
                if (totwType.equals(TeamOfTheWeekRoundsResponseKt.TOTW_TIMESPAN)) {
                    i3 = wv8.i(context.getString(R.string.week_number), " ", tournamentRoundWrapper2.getRoundName());
                    arrayList4.add(new k7g(tournamentRoundWrapper2, i3));
                    gv9Var2 = gv9Var3;
                    teamOfTheWeekFieldUIData2 = teamOfTheWeekFieldUIData3;
                    z6 = z7;
                    string = str7;
                    r = str8;
                    str6 = str4;
                }
            } else if (hashCode == -906335517) {
                str4 = str6;
                teamOfTheWeekFieldUIData3 = teamOfTheWeekFieldUIData2;
                if (totwType.equals(TeamOfTheWeekRoundsResponseKt.TOTW_SEASON)) {
                    i3 = (z || z2) ? context.getString(R.string.football_tournament) : context.getString(R.string.season);
                    i3.getClass();
                    arrayList4.add(new k7g(tournamentRoundWrapper2, i3));
                    gv9Var2 = gv9Var3;
                    teamOfTheWeekFieldUIData2 = teamOfTheWeekFieldUIData3;
                    z6 = z7;
                    string = str7;
                    r = str8;
                    str6 = str4;
                }
            } else if (hashCode == 108704142 && totwType.equals(str6)) {
                try {
                    int parseInt = Integer.parseInt(tournamentRoundWrapper2.getRoundName());
                    i3 = context.getString(R.string.round) + " " + parseInt;
                    str4 = str6;
                    teamOfTheWeekFieldUIData3 = teamOfTheWeekFieldUIData2;
                } catch (NumberFormatException unused) {
                    if (StringsKt.J(tournamentRoundWrapper2.getRoundName(), "2nd leg", false)) {
                        str4 = str6;
                        teamOfTheWeekFieldUIData3 = teamOfTheWeekFieldUIData2;
                        c2 = lnb.o(d7g.c(context, tournamentRoundWrapper2.getRoundName().substring(0, StringsKt.P(tournamentRoundWrapper2.getRoundName(), "2nd leg", 0, false, 6) - 1), str), " ", context.getString(R.string.second_leg));
                    } else {
                        str4 = str6;
                        teamOfTheWeekFieldUIData3 = teamOfTheWeekFieldUIData2;
                        Regex regex = d7g.a;
                        c2 = d7g.c(context, tournamentRoundWrapper2.getRoundName(), str);
                    }
                    i3 = c2;
                }
                arrayList4.add(new k7g(tournamentRoundWrapper2, i3));
                gv9Var2 = gv9Var3;
                teamOfTheWeekFieldUIData2 = teamOfTheWeekFieldUIData3;
                z6 = z7;
                string = str7;
                r = str8;
                str6 = str4;
            } else {
                str4 = str6;
                teamOfTheWeekFieldUIData3 = teamOfTheWeekFieldUIData2;
            }
            i3 = "";
            arrayList4.add(new k7g(tournamentRoundWrapper2, i3));
            gv9Var2 = gv9Var3;
            teamOfTheWeekFieldUIData2 = teamOfTheWeekFieldUIData3;
            z6 = z7;
            string = str7;
            r = str8;
            str6 = str4;
        }
        gv9 gv9Var4 = gv9Var2;
        String str9 = string;
        String str10 = r;
        TeamOfTheWeekFieldUIData teamOfTheWeekFieldUIData4 = teamOfTheWeekFieldUIData2;
        boolean z8 = z6;
        gv9 W2 = l6g.W(arrayList4);
        if (teamOfTheWeekFieldUIData4 != null) {
            str3 = i2;
            z5 = z8;
        } else {
            String str11 = i2;
            z5 = false;
            str3 = str11;
        }
        return new xxi(str, i, W2, tournamentRoundWrapper, str9, str10, str3, teamOfTheWeekFieldUIData4, z5, z3, nn6Var, z4, gv9Var4);
    }

    public static final float G(of3 of3Var) {
        av8 av8Var = (av8) of3Var;
        long j = ((a7k) av8Var.k(d7k.a)).l.b.c;
        long j2 = r5k.l;
        if ((1095216660480L & j) != 4294967296L) {
            j = j2;
        }
        return ((kx4) av8Var.k(dh3.h)).C(j) / 2.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0136 A[Catch: all -> 0x0137, TryCatch #12 {all -> 0x0137, blocks: (B:30:0x008e, B:32:0x0097, B:35:0x00a8, B:52:0x0136, B:63:0x012f, B:70:0x013a, B:71:0x013f, B:72:0x0140, B:59:0x0128), top: B:29:0x008e, outer: #13, inners: #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final qol H(uae uaeVar, s18 s18Var, Function1 function1) {
        Throwable th;
        Throwable th2;
        Throwable th3;
        Throwable th4;
        int K0;
        s18Var.getClass();
        tha t = s18Var.t(uaeVar);
        try {
            long size = t.size();
            long j = size - 22;
            if (j < 0) {
                throw new IOException("not a zip: size=" + t.size());
            }
            long max = Math.max(size - 65558, 0L);
            do {
                lof lofVar = new lof(t.f(j));
                try {
                    if (lofVar.K0() == 101010256) {
                        int m = lofVar.m() & 65535;
                        int m2 = lofVar.m() & 65535;
                        long m3 = lofVar.m() & 65535;
                        if (m3 != (lofVar.m() & 65535) || m != 0 || m2 != 0) {
                            throw new IOException("unsupported zip: spanned");
                        }
                        lofVar.skip(4L);
                        int m4 = lofVar.m() & 65535;
                        h12 h12Var = new h12(m3, 4294967295L & lofVar.K0(), m4);
                        lofVar.k0(m4);
                        lofVar.close();
                        long j2 = j - 20;
                        if (j2 > 0) {
                            lofVar = new lof(t.f(j2));
                            try {
                                if (lofVar.K0() == 117853008) {
                                    int K02 = lofVar.K0();
                                    long b0 = lofVar.b0();
                                    if (lofVar.K0() != 1 || K02 != 0) {
                                        throw new IOException("unsupported zip: spanned");
                                    }
                                    lofVar = new lof(t.f(b0));
                                    try {
                                        K0 = lofVar.K0();
                                    } catch (Throwable th5) {
                                        th3 = th5;
                                    }
                                    if (K0 != 101075792) {
                                        throw new IOException("bad zip: expected " + x(101075792) + " but was " + x(K0));
                                    }
                                    lofVar.skip(12L);
                                    int K03 = lofVar.K0();
                                    int K04 = lofVar.K0();
                                    long b02 = lofVar.b0();
                                    if (b02 != lofVar.b0() || K03 != 0 || K04 != 0) {
                                        throw new IOException("unsupported zip: spanned");
                                    }
                                    lofVar.skip(8L);
                                    h12 h12Var2 = new h12(b02, lofVar.b0(), m4);
                                    try {
                                        Unit unit = Unit.a;
                                        try {
                                            th4 = null;
                                        } catch (Throwable th6) {
                                            th4 = th6;
                                        }
                                        h12Var = h12Var2;
                                    } catch (Throwable th7) {
                                        th3 = th7;
                                        h12Var = h12Var2;
                                        try {
                                            lofVar.close();
                                            Unit unit2 = Unit.a;
                                        } catch (Throwable th8) {
                                            de6.a(th3, th8);
                                        }
                                        th4 = th3;
                                        if (th4 == null) {
                                        }
                                    }
                                    if (th4 == null) {
                                        throw th4;
                                    }
                                }
                                Unit unit3 = Unit.a;
                                try {
                                    th2 = null;
                                } catch (Throwable th9) {
                                    th2 = th9;
                                }
                            } catch (Throwable th10) {
                                try {
                                    lofVar.close();
                                    Unit unit4 = Unit.a;
                                } catch (Throwable th11) {
                                    de6.a(th10, th11);
                                }
                                th2 = th10;
                            }
                            if (th2 != null) {
                                throw th2;
                            }
                        }
                        ArrayList arrayList = new ArrayList();
                        lofVar = new lof(t.f(h12Var.b));
                        try {
                            long j3 = h12Var.a;
                            for (long j4 = 0; j4 < j3; j4++) {
                                pol J = J(lofVar);
                                if (J.h >= h12Var.b) {
                                    throw new IOException("bad zip: local file header offset >= central directory offset");
                                }
                                if (((Boolean) function1.invoke(J)).booleanValue()) {
                                    arrayList.add(J);
                                }
                            }
                            Unit unit5 = Unit.a;
                            try {
                                th = null;
                            } catch (Throwable th12) {
                                th = th12;
                            }
                        } catch (Throwable th13) {
                            try {
                                lofVar.close();
                                Unit unit6 = Unit.a;
                            } catch (Throwable th14) {
                                de6.a(th13, th14);
                            }
                            th = th13;
                        }
                        if (th != null) {
                            throw th;
                        }
                        qol qolVar = new qol(uaeVar, s18Var, m(arrayList));
                        try {
                            t.close();
                            Unit unit7 = Unit.a;
                        } catch (Throwable unused) {
                        }
                        return qolVar;
                    }
                    lofVar.close();
                    j--;
                } finally {
                    lofVar.close();
                }
            } while (j >= max);
            throw new IOException("not a zip: end of central directory signature not found");
        } finally {
        }
    }

    public static boolean I(oha ohaVar, String str) {
        Boolean bool;
        Map map;
        Boolean bool2 = Boolean.FALSE;
        oha ohaVar2 = (ohaVar == null || (map = ohaVar.h) == null) ? null : (oha) map.get(str);
        if (ohaVar2 != null && (bool = ohaVar2.b) != null) {
            bool2 = bool;
        }
        return bool2.booleanValue();
    }

    public static final pol J(lof lofVar) {
        int K0 = lofVar.K0();
        if (K0 != 33639248) {
            yhk.t("bad zip: expected ", x(33639248), " but was ", x(K0));
            return null;
        }
        lofVar.skip(4L);
        short m = lofVar.m();
        int i = m & 65535;
        if ((m & 1) != 0) {
            is8.e("unsupported zip: general purpose bit flag=".concat(x(i)));
            return null;
        }
        int m2 = lofVar.m() & 65535;
        int m3 = lofVar.m() & 65535;
        int m4 = lofVar.m() & 65535;
        long K02 = lofVar.K0() & 4294967295L;
        esf esfVar = new esf();
        esfVar.a = lofVar.K0() & 4294967295L;
        esf esfVar2 = new esf();
        esfVar2.a = lofVar.K0() & 4294967295L;
        int m5 = lofVar.m() & 65535;
        int m6 = lofVar.m() & 65535;
        int m7 = lofVar.m() & 65535;
        lofVar.skip(8L);
        esf esfVar3 = new esf();
        esfVar3.a = lofVar.K0() & 4294967295L;
        String k0 = lofVar.k0(m5);
        if (StringsKt.K(k0, (char) 0)) {
            is8.e("bad zip: filename contains 0x00");
            return null;
        }
        long j = esfVar2.a == 4294967295L ? 8L : 0L;
        if (esfVar.a == 4294967295L) {
            j += 8;
        }
        if (esfVar3.a == 4294967295L) {
            j += 8;
        }
        long j2 = j;
        fsf fsfVar = new fsf();
        fsf fsfVar2 = new fsf();
        fsf fsfVar3 = new fsf();
        asf asfVar = new asf();
        K(lofVar, m6, new ji4(asfVar, j2, esfVar2, lofVar, esfVar, esfVar3, fsfVar, fsfVar2, fsfVar3));
        if (j2 > 0 && !asfVar.a) {
            is8.e("bad zip: zip64 extra required but absent");
            return null;
        }
        String k02 = lofVar.k0(m7);
        String str = uae.b;
        return new pol(tnf.j("/", false).e(k0), c.n(k0, "/", false), k02, K02, esfVar.a, esfVar2.a, m2, esfVar3.a, m4, m3, (Long) fsfVar.a, (Long) fsfVar2.a, (Long) fsfVar3.a, 57344);
    }

    public static final void K(lof lofVar, int i, Function2 function2) {
        x52 x52Var = lofVar.b;
        long j = i;
        while (j != 0) {
            if (j < 4) {
                is8.e("bad zip: truncated header in extra field");
                return;
            }
            int m = lofVar.m() & 65535;
            long m2 = lofVar.m() & 65535;
            long j2 = j - 4;
            if (j2 < m2) {
                is8.e("bad zip: truncated value in extra field");
                return;
            }
            lofVar.o(m2);
            long j3 = x52Var.b;
            function2.invoke(Integer.valueOf(m), Long.valueOf(m2));
            long j4 = (x52Var.b + m2) - j3;
            if (j4 < 0) {
                is8.e(ljg.j(m, "unsupported zip: too many bytes processed for "));
                return;
            } else {
                if (j4 > 0) {
                    x52Var.skip(j4);
                }
                j = j2 - m2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003a, code lost:
    
        if (r0 != null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int L(oha ohaVar, String str) {
        Map map;
        Integer num = null;
        oha ohaVar2 = (ohaVar == null || (map = ohaVar.h) == null) ? null : (oha) map.get(str);
        if (ohaVar2 != null) {
            Integer num2 = ohaVar2.c;
            Long l = ohaVar2.d;
            if (num2 != null) {
                num = num2;
            } else if (l != null && l.longValue() <= 2147483647L && l.longValue() >= -2147483648L) {
                num = Integer.valueOf(l.intValue());
            }
        }
        num = 0;
        return num.intValue();
    }

    public static final pol M(lof lofVar, pol polVar) {
        int K0 = lofVar.K0();
        if (K0 != 67324752) {
            yhk.t("bad zip: expected ", x(67324752), " but was ", x(K0));
            return null;
        }
        lofVar.skip(2L);
        short m = lofVar.m();
        int i = m & 65535;
        if ((m & 1) != 0) {
            is8.e("unsupported zip: general purpose bit flag=".concat(x(i)));
            return null;
        }
        lofVar.skip(18L);
        int m2 = lofVar.m() & 65535;
        lofVar.skip(lofVar.m() & 65535);
        if (polVar == null) {
            lofVar.skip(m2);
            return null;
        }
        fsf fsfVar = new fsf();
        fsf fsfVar2 = new fsf();
        fsf fsfVar3 = new fsf();
        K(lofVar, m2, new rol(lofVar, fsfVar, fsfVar2, fsfVar3));
        return new pol(polVar.a, polVar.b, polVar.c, polVar.d, polVar.e, polVar.f, polVar.g, polVar.h, polVar.i, polVar.j, polVar.k, polVar.l, polVar.m, (Integer) fsfVar.a, (Integer) fsfVar2.a, (Integer) fsfVar3.a);
    }

    public static long N(nkk nkkVar, int i, int i2) {
        nkkVar.E(i);
        if (nkkVar.c() < 5) {
            return C.TIME_UNSET;
        }
        int f = nkkVar.f();
        if ((8388608 & f) != 0 || ((2096896 & f) >> 8) != i2 || (f & 32) == 0 || nkkVar.s() < 7 || nkkVar.c() < 7 || (nkkVar.s() & 16) != 16) {
            return C.TIME_UNSET;
        }
        nkkVar.e(new byte[6], 0, 6);
        return ((r0[0] & 255) << 25) | ((r0[1] & 255) << 17) | ((r0[2] & 255) << 9) | ((r0[3] & 255) << 1) | ((r0[4] & 255) >> 7);
    }

    public static String O(oha ohaVar, String str, String str2) {
        Map map;
        oha ohaVar2 = (ohaVar == null || (map = ohaVar.h) == null) ? null : (oha) map.get(str);
        return ohaVar2 == null ? str2 : ohaVar2.a;
    }

    public static final String P(bwh bwhVar) {
        bwhVar.request(Long.MAX_VALUE);
        return q(bwhVar.u(), bwhVar.u().c);
    }

    public static final void Q(View view, u6b u6bVar) {
        view.getClass();
        view.setTag(R.id.view_tree_lifecycle_owner, u6bVar);
    }

    public static final float R(of3 of3Var) {
        float f = ((p75) ((av8) of3Var).k(l7a.c)).a;
        if (Float.isNaN(f)) {
            f = 0.0f;
        }
        float f2 = (f - qlh.c) / 2.0f;
        return f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : f2;
    }

    public static b2p S(Future future) {
        try {
            return b2p.l(mha.J(future));
        } catch (Exception unused) {
            return u1p.a;
        } catch (Throwable th) {
            new Exception(th);
            return u1p.a;
        }
    }

    public static b7p T(ExecutorService executorService) {
        return executorService instanceof b7p ? (b7p) executorService : executorService instanceof ScheduledExecutorService ? new m8p((ScheduledExecutorService) executorService) : new j8p(executorService);
    }

    /* JADX WARN: Code restructure failed: missing block: B:205:0x03b9, code lost:
    
        if (r39 != false) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x032f, code lost:
    
        if (r4 != false) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x02ff, code lost:
    
        if (r4 != false) goto L206;
     */
    /* JADX WARN: Removed duplicated region for block: B:156:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0410 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04aa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x05d0  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0630  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0669  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x067c  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x076d  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x068a  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0633  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0614  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x05f7  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0305  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final vcj vcjVar, final CharSequence charSequence, final Function2 function2, final uaj uajVar, final ct8 ct8Var, final Function2 function22, final Function2 function23, final Function2 function24, final Function2 function25, final boolean z, final boolean z2, final boolean z3, final wzc wzcVar, final p3e p3eVar, final n9j n9jVar, final Function2 function26, of3 of3Var, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        av8 av8Var;
        int i6;
        boolean z4;
        float f;
        int ordinal;
        float f2;
        g0i I;
        int ordinal2;
        g0i g0iVar;
        float f3;
        int ordinal3;
        float f4;
        int ordinal4;
        float f5;
        int ordinal5;
        int[] iArr;
        boolean g;
        Object O;
        ry ryVar;
        k4a k4aVar;
        a99 a99Var;
        long j;
        boolean g2;
        Object O2;
        a99 a99Var2;
        Object O3;
        int i7;
        char c2;
        n9j n9jVar2;
        tc3 tc3Var;
        Object O4;
        Function2 function27;
        p3e p3eVar2;
        Function2 function28;
        a99 a99Var3;
        n9j n9jVar3;
        int i8;
        tc3 tc3Var2;
        tc3 tc3Var3;
        Object O5;
        tc3 tc3Var4;
        tc3 tc3Var5;
        boolean z5;
        tc3 H;
        int ordinal6;
        int i9;
        int i10;
        ry ryVar2 = ry.H;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(546805032);
        if ((i & 6) == 0) {
            i3 = (av8Var2.e(vcjVar.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i4 = i3 | (av8Var2.i(charSequence) ? 32 : 16);
        } else {
            i4 = i3;
        }
        if ((i & 384) == 0) {
            i4 |= av8Var2.i(function2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= av8Var2.g(uajVar) ? com.ironsource.mediationsdk.metadata.a.o : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= av8Var2.i(ct8Var) ? 16384 : 8192;
        }
        int i11 = i & 196608;
        int i12 = C.DEFAULT_BUFFER_SEGMENT_SIZE;
        if (i11 == 0) {
            i4 |= av8Var2.i(function22) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i4 |= av8Var2.i(function23) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i4 |= av8Var2.i(function24) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 |= av8Var2.i(null) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i4 |= av8Var2.i(null) ? 536870912 : 268435456;
        }
        int i13 = i4;
        if ((i2 & 6) == 0) {
            i5 = i2 | (av8Var2.i(function25) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= av8Var2.h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= av8Var2.h(z2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= av8Var2.h(z3) ? com.ironsource.mediationsdk.metadata.a.o : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= av8Var2.g(wzcVar) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            if (av8Var2.g(p3eVar)) {
                i12 = 131072;
            }
            i5 |= i12;
        }
        if ((i2 & 1572864) == 0) {
            i5 |= av8Var2.g(n9jVar) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i5 |= av8Var2.i(function26) ? 8388608 : 4194304;
        }
        int i14 = i5;
        if (av8Var2.T(i13 & 1, ((306783379 & i13) == 306783378 && (i14 & 4793491) == 4793490) ? false : true)) {
            boolean booleanValue = ((Boolean) xw3.z(wzcVar, av8Var2, (i14 >> 12) & 14).getValue()).booleanValue();
            k4a k4aVar2 = booleanValue ? k4a.a : charSequence.length() == 0 ? k4a.b : k4a.c;
            long j2 = !z2 ? n9jVar.z : z3 ? n9jVar.A : booleanValue ? n9jVar.x : n9jVar.y;
            a7k a7kVar = (a7k) av8Var2.k(d7k.a);
            dfj dfjVar = a7kVar.j;
            dfj dfjVar2 = a7kVar.l;
            long c3 = dfjVar.c();
            long j3 = r13.i;
            if ((!e8k.a(c3, j3) || e8k.a(dfjVar2.c(), j3)) && (e8k.a(dfjVar.c(), j3) || !e8k.a(dfjVar2.c(), j3))) {
                i6 = i13;
                z4 = false;
            } else {
                i6 = i13;
                z4 = true;
            }
            long c4 = dfjVar2.c();
            if (z4 && c4 == 16) {
                c4 = j2;
            }
            long c5 = dfjVar.c();
            long j4 = (z4 && c5 == 16) ? j2 : c5;
            boolean z6 = ct8Var != null;
            int i15 = i6;
            long j5 = c4;
            axj L = yso.L(k4aVar2, "TextFieldInputState", av8Var2, 48, 0);
            t01 t01Var = L.a;
            g0i I2 = ufa.I(bwc.b, av8Var2);
            q4k q4kVar = lz.f;
            k4a k4aVar3 = (k4a) t01Var.w();
            av8Var2.d0(-1436405362);
            int ordinal7 = k4aVar3.ordinal();
            float f6 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (ordinal7 != 0) {
                if (ordinal7 != 1) {
                    if (ordinal7 != 2) {
                        zzl.b();
                        return;
                    }
                } else if (z6) {
                    f = 0.0f;
                    av8Var2.s(false);
                    Float valueOf = Float.valueOf(f);
                    k4a k4aVar4 = (k4a) ((eoh) L.d).getValue();
                    av8Var2.d0(-1436405362);
                    ordinal = k4aVar4.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal != 2) {
                                zzl.b();
                                return;
                            }
                        } else if (z6) {
                            f2 = 0.0f;
                            av8Var2.s(false);
                            Float valueOf2 = Float.valueOf(f2);
                            L.f();
                            av8Var2.d0(-709912974);
                            av8Var2.s(false);
                            vwj x = yso.x(L, valueOf, valueOf2, I2, q4kVar, av8Var2, 196608);
                            bwc bwcVar = bwc.d;
                            g0i I3 = ufa.I(bwcVar, av8Var2);
                            I = ufa.I(bwc.e, av8Var2);
                            k4a k4aVar5 = (k4a) t01Var.w();
                            av8Var2.d0(-1093194547);
                            ordinal2 = k4aVar5.ordinal();
                            if (ordinal2 != 0) {
                                g0iVar = I3;
                                if (ordinal2 != 1) {
                                    if (ordinal2 != 2) {
                                        zzl.b();
                                        return;
                                    }
                                }
                                f3 = 0.0f;
                                av8Var2.s(false);
                                Float valueOf3 = Float.valueOf(f3);
                                k4a k4aVar6 = (k4a) L.g();
                                av8Var2.d0(-1093194547);
                                ordinal3 = k4aVar6.ordinal();
                                if (ordinal3 != 0) {
                                    if (ordinal3 != 1) {
                                        if (ordinal3 != 2) {
                                            zzl.b();
                                            return;
                                        }
                                    }
                                    f4 = 0.0f;
                                    av8Var2.s(false);
                                    Float valueOf4 = Float.valueOf(f4);
                                    twj f7 = L.f();
                                    av8Var2.d0(-984009111);
                                    k4a k4aVar7 = k4a.a;
                                    boolean z7 = z6;
                                    k4a k4aVar8 = k4a.b;
                                    g0i g0iVar2 = (!f7.c(k4aVar7, k4aVar8) && (f7.c(k4aVar8, k4aVar7) || f7.c(k4a.c, k4aVar8))) ? I : g0iVar;
                                    av8Var2.s(false);
                                    vwj x2 = yso.x(L, valueOf3, valueOf4, g0iVar2, q4kVar, av8Var2, 196608);
                                    k4a k4aVar9 = (k4a) t01Var.w();
                                    av8Var2.d0(-1258455321);
                                    ordinal4 = k4aVar9.ordinal();
                                    if (ordinal4 != 0) {
                                        if (ordinal4 != 1) {
                                            if (ordinal4 != 2) {
                                                zzl.b();
                                                return;
                                            }
                                        } else if (z7) {
                                            f5 = 0.0f;
                                            av8Var2.s(false);
                                            Float valueOf5 = Float.valueOf(f5);
                                            k4a k4aVar10 = (k4a) L.g();
                                            av8Var2.d0(-1258455321);
                                            ordinal5 = k4aVar10.ordinal();
                                            if (ordinal5 != 0) {
                                                if (ordinal5 != 1) {
                                                    if (ordinal5 != 2) {
                                                        zzl.b();
                                                        return;
                                                    }
                                                }
                                            }
                                            f6 = 1.0f;
                                            av8Var2.s(false);
                                            Float valueOf6 = Float.valueOf(f6);
                                            L.f();
                                            av8Var2.d0(2126293195);
                                            av8Var2.s(false);
                                            vwj x3 = yso.x(L, valueOf5, valueOf6, g0iVar, q4kVar, av8Var2, 196608);
                                            g0i I4 = ufa.I(bwcVar, av8Var2);
                                            k4a k4aVar11 = (k4a) L.g();
                                            av8Var2.d0(-12973394);
                                            iArr = oaj.a;
                                            long j6 = iArr[k4aVar11.ordinal()] == 1 ? j5 : j4;
                                            av8Var2.s(false);
                                            j23 f8 = r13.f(j6);
                                            g = av8Var2.g(f8);
                                            O = av8Var2.O();
                                            a99 a99Var4 = nf3.a;
                                            if (!g || O == a99Var4) {
                                                ryVar = ryVar2;
                                                q4k q4kVar2 = new q4k(ryVar, new oo(f8, 9));
                                                av8Var2.n0(q4kVar2);
                                                O = q4kVar2;
                                            } else {
                                                ryVar = ryVar2;
                                            }
                                            q4k q4kVar3 = (q4k) O;
                                            k4aVar = (k4a) t01Var.w();
                                            av8Var2.d0(-12973394);
                                            if (iArr[k4aVar.ordinal()] == 1) {
                                                a99Var = a99Var4;
                                                j = j5;
                                            } else {
                                                a99Var = a99Var4;
                                                j = j4;
                                            }
                                            r13 e2 = vxd.e(av8Var2, false, j);
                                            k4a k4aVar12 = (k4a) L.g();
                                            av8Var2.d0(-12973394);
                                            long j7 = iArr[k4aVar12.ordinal()] == 1 ? j5 : j4;
                                            av8Var2.s(false);
                                            r13 r13Var = new r13(j7);
                                            L.f();
                                            av8Var2.d0(1954111929);
                                            av8Var2.s(false);
                                            vwj x4 = yso.x(L, e2, r13Var, I4, q4kVar3, av8Var2, 196608);
                                            av8Var2.d0(-464752477);
                                            av8Var2.s(false);
                                            j23 f9 = r13.f(j2);
                                            g2 = av8Var2.g(f9);
                                            O2 = av8Var2.O();
                                            a99Var2 = a99Var;
                                            if (!g2 || O2 == a99Var2) {
                                                q4k q4kVar4 = new q4k(ryVar, new oo(f9, 9));
                                                av8Var2.n0(q4kVar4);
                                                O2 = q4kVar4;
                                            }
                                            av8Var2.d0(-464752477);
                                            av8Var2.s(false);
                                            r13 r13Var2 = new r13(j2);
                                            av8Var2.d0(-464752477);
                                            av8Var2.s(false);
                                            r13 r13Var3 = new r13(j2);
                                            L.f();
                                            av8Var2.d0(1190923886);
                                            av8Var2.s(false);
                                            vwj x5 = yso.x(L, r13Var2, r13Var3, I4, (q4k) O2, av8Var2, 196608);
                                            O3 = av8Var2.O();
                                            if (O3 == a99Var2) {
                                                O3 = new naj();
                                                av8Var2.n0(O3);
                                            }
                                            naj najVar = (naj) O3;
                                            if (ct8Var == null) {
                                                av8Var2.d0(-1891724857);
                                                av8Var2.s(false);
                                                n9jVar2 = n9jVar;
                                                i7 = 4;
                                                tc3Var = null;
                                                c2 = 2048;
                                            } else {
                                                av8Var2.d0(-1891724856);
                                                i7 = 4;
                                                c2 = 2048;
                                                n9jVar2 = n9jVar;
                                                tc3 H2 = yqo.H(-1076580032, av8Var2, new btc(dfjVar, dfjVar2, x, x5, z4, x4, ct8Var, najVar));
                                                av8Var2.s(false);
                                                tc3Var = H2;
                                            }
                                            long j8 = !z2 ? n9jVar2.D : z3 ? n9jVar2.E : booleanValue ? n9jVar2.B : n9jVar2.C;
                                            O4 = av8Var2.O();
                                            if (O4 == a99Var2) {
                                                O4 = goh.c(new m56(x2, i7));
                                                av8Var2.n0(O4);
                                            }
                                            cdi cdiVar = (cdi) O4;
                                            if (function22 == null && charSequence.length() == 0 && ((Boolean) cdiVar.getValue()).booleanValue()) {
                                                av8Var2.d0(-1890614312);
                                                long j9 = j8;
                                                n9jVar3 = n9jVar2;
                                                p3eVar2 = p3eVar;
                                                function28 = function26;
                                                a99Var3 = a99Var2;
                                                i8 = i15;
                                                tc3Var2 = null;
                                                function27 = function24;
                                                tc3 H3 = yqo.H(1405547205, av8Var2, new maj(x2, j9, dfjVar, function22));
                                                av8Var2.s(false);
                                                tc3Var3 = H3;
                                            } else {
                                                function27 = function24;
                                                p3eVar2 = p3eVar;
                                                function28 = function26;
                                                a99Var3 = a99Var2;
                                                n9jVar3 = n9jVar2;
                                                i8 = i15;
                                                tc3Var2 = null;
                                                av8Var2.d0(-1890217110);
                                                av8Var2.s(false);
                                                tc3Var3 = null;
                                            }
                                            O5 = av8Var2.O();
                                            if (O5 == a99Var3) {
                                                O5 = goh.c(new m56(x3, 5));
                                                av8Var2.n0(O5);
                                            }
                                            av8Var2.d0(-1889500886);
                                            av8Var2.s(false);
                                            av8Var2.d0(-1888924534);
                                            av8Var2.s(false);
                                            long j10 = !z2 ? n9jVar3.r : z3 ? n9jVar3.s : booleanValue ? n9jVar3.p : n9jVar3.q;
                                            if (function23 == null) {
                                                av8Var2.d0(-1888749663);
                                                av8Var2.s(false);
                                                tc3Var4 = tc3Var2;
                                            } else {
                                                av8Var2.d0(-1888749662);
                                                tc3 H4 = yqo.H(-1736293487, av8Var2, new laj(j10, function23, 0));
                                                av8Var2.s(false);
                                                tc3Var4 = H4;
                                            }
                                            long j11 = !z2 ? n9jVar3.v : z3 ? n9jVar3.w : booleanValue ? n9jVar3.t : n9jVar3.u;
                                            if (function27 == null) {
                                                av8Var2.d0(-1888469888);
                                                av8Var2.s(false);
                                                tc3Var5 = tc3Var2;
                                            } else {
                                                av8Var2.d0(-1888469887);
                                                tc3 H5 = yqo.H(1334518521, av8Var2, new laj(j11, function27, 1));
                                                av8Var2.s(false);
                                                tc3Var5 = H5;
                                            }
                                            long j12 = !z2 ? n9jVar3.H : z3 ? n9jVar3.I : booleanValue ? n9jVar3.F : n9jVar3.G;
                                            if (function25 == null) {
                                                av8Var2.d0(-1888176380);
                                                av8Var2.s(false);
                                                z5 = false;
                                                H = tc3Var2;
                                            } else {
                                                av8Var2.d0(-1888176379);
                                                z5 = false;
                                                H = yqo.H(837168720, av8Var2, new z72(j12, dfjVar2, function25, 1));
                                                av8Var2.s(false);
                                            }
                                            ordinal6 = vcjVar.ordinal();
                                            if (ordinal6 == 0) {
                                                tc3 tc3Var6 = tc3Var2;
                                                av8Var2.d0(-1887830698);
                                                vha.c(function2, tc3Var, tc3Var3, tc3Var4, tc3Var5, tc3Var6, tc3Var6, z, uajVar, new paj(new apa(0, 7, cdi.class, x, U3.i.X, "getValue()Ljava/lang/Object;")), yqo.H(-1729858187, av8Var2, new vi4(7, function26)), H, p3eVar, av8Var2, ((i8 >> 3) & 112) | 6 | ((i14 << 21) & 234881024) | ((i8 << 18) & 1879048192), ((i14 >> 6) & 7168) | 48);
                                                av8Var = av8Var2;
                                                av8Var.s(false);
                                                Unit unit = Unit.a;
                                            } else {
                                                if (ordinal6 != 1) {
                                                    throw dmi.h(av8Var2, 493292232, z5);
                                                }
                                                av8Var2.d0(-1886778186);
                                                Object O6 = av8Var2.O();
                                                if (O6 == a99Var3) {
                                                    i9 = 1879048192;
                                                    i10 = 234881024;
                                                    O6 = e.f(new njh(0L));
                                                    av8Var2.n0(O6);
                                                } else {
                                                    i9 = 1879048192;
                                                    i10 = 234881024;
                                                }
                                                e1d e1dVar = (e1d) O6;
                                                tc3 H6 = yqo.H(528115858, av8Var2, new kaj(e1dVar, uajVar, p3eVar2, function28));
                                                int i16 = i9;
                                                tc3 tc3Var7 = tc3Var;
                                                paj pajVar = new paj(new apa(0, 8, cdi.class, x, U3.i.X, "getValue()Ljava/lang/Object;"));
                                                boolean g3 = ((i8 & 7168) == 2048) | av8Var2.g(x);
                                                Object O7 = av8Var2.O();
                                                if (g3 || O7 == a99Var3) {
                                                    O7 = new dvi(12, uajVar, x, e1dVar);
                                                    av8Var2.n0(O7);
                                                }
                                                ufa.c(function2, tc3Var3, tc3Var7, tc3Var4, tc3Var5, tc3Var2, tc3Var2, z, uajVar, pajVar, (Function1) O7, H6, H, p3eVar2, av8Var2, ((i8 >> 3) & 112) | 6 | ((i14 << 21) & i10) | ((i8 << 18) & i16), (57344 & (i14 >> 3)) | 384);
                                                av8Var = av8Var2;
                                                av8Var.s(false);
                                                Unit unit2 = Unit.a;
                                            }
                                        }
                                    }
                                    f5 = 1.0f;
                                    av8Var2.s(false);
                                    Float valueOf52 = Float.valueOf(f5);
                                    k4a k4aVar102 = (k4a) L.g();
                                    av8Var2.d0(-1258455321);
                                    ordinal5 = k4aVar102.ordinal();
                                    if (ordinal5 != 0) {
                                    }
                                    f6 = 1.0f;
                                    av8Var2.s(false);
                                    Float valueOf62 = Float.valueOf(f6);
                                    L.f();
                                    av8Var2.d0(2126293195);
                                    av8Var2.s(false);
                                    vwj x32 = yso.x(L, valueOf52, valueOf62, g0iVar, q4kVar, av8Var2, 196608);
                                    g0i I42 = ufa.I(bwcVar, av8Var2);
                                    k4a k4aVar112 = (k4a) L.g();
                                    av8Var2.d0(-12973394);
                                    iArr = oaj.a;
                                    if (iArr[k4aVar112.ordinal()] == 1) {
                                    }
                                    av8Var2.s(false);
                                    j23 f82 = r13.f(j6);
                                    g = av8Var2.g(f82);
                                    O = av8Var2.O();
                                    a99 a99Var42 = nf3.a;
                                    if (g) {
                                    }
                                    ryVar = ryVar2;
                                    q4k q4kVar22 = new q4k(ryVar, new oo(f82, 9));
                                    av8Var2.n0(q4kVar22);
                                    O = q4kVar22;
                                    q4k q4kVar32 = (q4k) O;
                                    k4aVar = (k4a) t01Var.w();
                                    av8Var2.d0(-12973394);
                                    if (iArr[k4aVar.ordinal()] == 1) {
                                    }
                                    r13 e22 = vxd.e(av8Var2, false, j);
                                    k4a k4aVar122 = (k4a) L.g();
                                    av8Var2.d0(-12973394);
                                    if (iArr[k4aVar122.ordinal()] == 1) {
                                    }
                                    av8Var2.s(false);
                                    r13 r13Var4 = new r13(j7);
                                    L.f();
                                    av8Var2.d0(1954111929);
                                    av8Var2.s(false);
                                    vwj x42 = yso.x(L, e22, r13Var4, I42, q4kVar32, av8Var2, 196608);
                                    av8Var2.d0(-464752477);
                                    av8Var2.s(false);
                                    j23 f92 = r13.f(j2);
                                    g2 = av8Var2.g(f92);
                                    O2 = av8Var2.O();
                                    a99Var2 = a99Var;
                                    if (!g2) {
                                    }
                                    q4k q4kVar42 = new q4k(ryVar, new oo(f92, 9));
                                    av8Var2.n0(q4kVar42);
                                    O2 = q4kVar42;
                                    av8Var2.d0(-464752477);
                                    av8Var2.s(false);
                                    r13 r13Var22 = new r13(j2);
                                    av8Var2.d0(-464752477);
                                    av8Var2.s(false);
                                    r13 r13Var32 = new r13(j2);
                                    L.f();
                                    av8Var2.d0(1190923886);
                                    av8Var2.s(false);
                                    vwj x52 = yso.x(L, r13Var22, r13Var32, I42, (q4k) O2, av8Var2, 196608);
                                    O3 = av8Var2.O();
                                    if (O3 == a99Var2) {
                                    }
                                    naj najVar2 = (naj) O3;
                                    if (ct8Var == null) {
                                    }
                                    if (!z2) {
                                    }
                                    O4 = av8Var2.O();
                                    if (O4 == a99Var2) {
                                    }
                                    cdi cdiVar2 = (cdi) O4;
                                    if (function22 == null) {
                                    }
                                    function27 = function24;
                                    p3eVar2 = p3eVar;
                                    function28 = function26;
                                    a99Var3 = a99Var2;
                                    n9jVar3 = n9jVar2;
                                    i8 = i15;
                                    tc3Var2 = null;
                                    av8Var2.d0(-1890217110);
                                    av8Var2.s(false);
                                    tc3Var3 = null;
                                    O5 = av8Var2.O();
                                    if (O5 == a99Var3) {
                                    }
                                    av8Var2.d0(-1889500886);
                                    av8Var2.s(false);
                                    av8Var2.d0(-1888924534);
                                    av8Var2.s(false);
                                    if (!z2) {
                                    }
                                    if (function23 == null) {
                                    }
                                    if (!z2) {
                                    }
                                    if (function27 == null) {
                                    }
                                    long j122 = !z2 ? n9jVar3.H : z3 ? n9jVar3.I : booleanValue ? n9jVar3.F : n9jVar3.G;
                                    if (function25 == null) {
                                    }
                                    ordinal6 = vcjVar.ordinal();
                                    if (ordinal6 == 0) {
                                    }
                                }
                                f4 = 1.0f;
                                av8Var2.s(false);
                                Float valueOf42 = Float.valueOf(f4);
                                twj f72 = L.f();
                                av8Var2.d0(-984009111);
                                k4a k4aVar72 = k4a.a;
                                boolean z72 = z6;
                                k4a k4aVar82 = k4a.b;
                                if (f72.c(k4aVar72, k4aVar82)) {
                                    av8Var2.s(false);
                                    vwj x22 = yso.x(L, valueOf3, valueOf42, g0iVar2, q4kVar, av8Var2, 196608);
                                    k4a k4aVar92 = (k4a) t01Var.w();
                                    av8Var2.d0(-1258455321);
                                    ordinal4 = k4aVar92.ordinal();
                                    if (ordinal4 != 0) {
                                    }
                                    f5 = 1.0f;
                                    av8Var2.s(false);
                                    Float valueOf522 = Float.valueOf(f5);
                                    k4a k4aVar1022 = (k4a) L.g();
                                    av8Var2.d0(-1258455321);
                                    ordinal5 = k4aVar1022.ordinal();
                                    if (ordinal5 != 0) {
                                    }
                                    f6 = 1.0f;
                                    av8Var2.s(false);
                                    Float valueOf622 = Float.valueOf(f6);
                                    L.f();
                                    av8Var2.d0(2126293195);
                                    av8Var2.s(false);
                                    vwj x322 = yso.x(L, valueOf522, valueOf622, g0iVar, q4kVar, av8Var2, 196608);
                                    g0i I422 = ufa.I(bwcVar, av8Var2);
                                    k4a k4aVar1122 = (k4a) L.g();
                                    av8Var2.d0(-12973394);
                                    iArr = oaj.a;
                                    if (iArr[k4aVar1122.ordinal()] == 1) {
                                    }
                                    av8Var2.s(false);
                                    j23 f822 = r13.f(j6);
                                    g = av8Var2.g(f822);
                                    O = av8Var2.O();
                                    a99 a99Var422 = nf3.a;
                                    if (g) {
                                    }
                                    ryVar = ryVar2;
                                    q4k q4kVar222 = new q4k(ryVar, new oo(f822, 9));
                                    av8Var2.n0(q4kVar222);
                                    O = q4kVar222;
                                    q4k q4kVar322 = (q4k) O;
                                    k4aVar = (k4a) t01Var.w();
                                    av8Var2.d0(-12973394);
                                    if (iArr[k4aVar.ordinal()] == 1) {
                                    }
                                    r13 e222 = vxd.e(av8Var2, false, j);
                                    k4a k4aVar1222 = (k4a) L.g();
                                    av8Var2.d0(-12973394);
                                    if (iArr[k4aVar1222.ordinal()] == 1) {
                                    }
                                    av8Var2.s(false);
                                    r13 r13Var42 = new r13(j7);
                                    L.f();
                                    av8Var2.d0(1954111929);
                                    av8Var2.s(false);
                                    vwj x422 = yso.x(L, e222, r13Var42, I422, q4kVar322, av8Var2, 196608);
                                    av8Var2.d0(-464752477);
                                    av8Var2.s(false);
                                    j23 f922 = r13.f(j2);
                                    g2 = av8Var2.g(f922);
                                    O2 = av8Var2.O();
                                    a99Var2 = a99Var;
                                    if (!g2) {
                                    }
                                    q4k q4kVar422 = new q4k(ryVar, new oo(f922, 9));
                                    av8Var2.n0(q4kVar422);
                                    O2 = q4kVar422;
                                    av8Var2.d0(-464752477);
                                    av8Var2.s(false);
                                    r13 r13Var222 = new r13(j2);
                                    av8Var2.d0(-464752477);
                                    av8Var2.s(false);
                                    r13 r13Var322 = new r13(j2);
                                    L.f();
                                    av8Var2.d0(1190923886);
                                    av8Var2.s(false);
                                    vwj x522 = yso.x(L, r13Var222, r13Var322, I422, (q4k) O2, av8Var2, 196608);
                                    O3 = av8Var2.O();
                                    if (O3 == a99Var2) {
                                    }
                                    naj najVar22 = (naj) O3;
                                    if (ct8Var == null) {
                                    }
                                    if (!z2) {
                                    }
                                    O4 = av8Var2.O();
                                    if (O4 == a99Var2) {
                                    }
                                    cdi cdiVar22 = (cdi) O4;
                                    if (function22 == null) {
                                    }
                                    function27 = function24;
                                    p3eVar2 = p3eVar;
                                    function28 = function26;
                                    a99Var3 = a99Var2;
                                    n9jVar3 = n9jVar2;
                                    i8 = i15;
                                    tc3Var2 = null;
                                    av8Var2.d0(-1890217110);
                                    av8Var2.s(false);
                                    tc3Var3 = null;
                                    O5 = av8Var2.O();
                                    if (O5 == a99Var3) {
                                    }
                                    av8Var2.d0(-1889500886);
                                    av8Var2.s(false);
                                    av8Var2.d0(-1888924534);
                                    av8Var2.s(false);
                                    if (!z2) {
                                    }
                                    if (function23 == null) {
                                    }
                                    if (!z2) {
                                    }
                                    if (function27 == null) {
                                    }
                                    long j1222 = !z2 ? n9jVar3.H : z3 ? n9jVar3.I : booleanValue ? n9jVar3.F : n9jVar3.G;
                                    if (function25 == null) {
                                    }
                                    ordinal6 = vcjVar.ordinal();
                                    if (ordinal6 == 0) {
                                    }
                                }
                                av8Var2.s(false);
                                vwj x222 = yso.x(L, valueOf3, valueOf42, g0iVar2, q4kVar, av8Var2, 196608);
                                k4a k4aVar922 = (k4a) t01Var.w();
                                av8Var2.d0(-1258455321);
                                ordinal4 = k4aVar922.ordinal();
                                if (ordinal4 != 0) {
                                }
                                f5 = 1.0f;
                                av8Var2.s(false);
                                Float valueOf5222 = Float.valueOf(f5);
                                k4a k4aVar10222 = (k4a) L.g();
                                av8Var2.d0(-1258455321);
                                ordinal5 = k4aVar10222.ordinal();
                                if (ordinal5 != 0) {
                                }
                                f6 = 1.0f;
                                av8Var2.s(false);
                                Float valueOf6222 = Float.valueOf(f6);
                                L.f();
                                av8Var2.d0(2126293195);
                                av8Var2.s(false);
                                vwj x3222 = yso.x(L, valueOf5222, valueOf6222, g0iVar, q4kVar, av8Var2, 196608);
                                g0i I4222 = ufa.I(bwcVar, av8Var2);
                                k4a k4aVar11222 = (k4a) L.g();
                                av8Var2.d0(-12973394);
                                iArr = oaj.a;
                                if (iArr[k4aVar11222.ordinal()] == 1) {
                                }
                                av8Var2.s(false);
                                j23 f8222 = r13.f(j6);
                                g = av8Var2.g(f8222);
                                O = av8Var2.O();
                                a99 a99Var4222 = nf3.a;
                                if (g) {
                                }
                                ryVar = ryVar2;
                                q4k q4kVar2222 = new q4k(ryVar, new oo(f8222, 9));
                                av8Var2.n0(q4kVar2222);
                                O = q4kVar2222;
                                q4k q4kVar3222 = (q4k) O;
                                k4aVar = (k4a) t01Var.w();
                                av8Var2.d0(-12973394);
                                if (iArr[k4aVar.ordinal()] == 1) {
                                }
                                r13 e2222 = vxd.e(av8Var2, false, j);
                                k4a k4aVar12222 = (k4a) L.g();
                                av8Var2.d0(-12973394);
                                if (iArr[k4aVar12222.ordinal()] == 1) {
                                }
                                av8Var2.s(false);
                                r13 r13Var422 = new r13(j7);
                                L.f();
                                av8Var2.d0(1954111929);
                                av8Var2.s(false);
                                vwj x4222 = yso.x(L, e2222, r13Var422, I4222, q4kVar3222, av8Var2, 196608);
                                av8Var2.d0(-464752477);
                                av8Var2.s(false);
                                j23 f9222 = r13.f(j2);
                                g2 = av8Var2.g(f9222);
                                O2 = av8Var2.O();
                                a99Var2 = a99Var;
                                if (!g2) {
                                }
                                q4k q4kVar4222 = new q4k(ryVar, new oo(f9222, 9));
                                av8Var2.n0(q4kVar4222);
                                O2 = q4kVar4222;
                                av8Var2.d0(-464752477);
                                av8Var2.s(false);
                                r13 r13Var2222 = new r13(j2);
                                av8Var2.d0(-464752477);
                                av8Var2.s(false);
                                r13 r13Var3222 = new r13(j2);
                                L.f();
                                av8Var2.d0(1190923886);
                                av8Var2.s(false);
                                vwj x5222 = yso.x(L, r13Var2222, r13Var3222, I4222, (q4k) O2, av8Var2, 196608);
                                O3 = av8Var2.O();
                                if (O3 == a99Var2) {
                                }
                                naj najVar222 = (naj) O3;
                                if (ct8Var == null) {
                                }
                                if (!z2) {
                                }
                                O4 = av8Var2.O();
                                if (O4 == a99Var2) {
                                }
                                cdi cdiVar222 = (cdi) O4;
                                if (function22 == null) {
                                }
                                function27 = function24;
                                p3eVar2 = p3eVar;
                                function28 = function26;
                                a99Var3 = a99Var2;
                                n9jVar3 = n9jVar2;
                                i8 = i15;
                                tc3Var2 = null;
                                av8Var2.d0(-1890217110);
                                av8Var2.s(false);
                                tc3Var3 = null;
                                O5 = av8Var2.O();
                                if (O5 == a99Var3) {
                                }
                                av8Var2.d0(-1889500886);
                                av8Var2.s(false);
                                av8Var2.d0(-1888924534);
                                av8Var2.s(false);
                                if (!z2) {
                                }
                                if (function23 == null) {
                                }
                                if (!z2) {
                                }
                                if (function27 == null) {
                                }
                                long j12222 = !z2 ? n9jVar3.H : z3 ? n9jVar3.I : booleanValue ? n9jVar3.F : n9jVar3.G;
                                if (function25 == null) {
                                }
                                ordinal6 = vcjVar.ordinal();
                                if (ordinal6 == 0) {
                                }
                            } else {
                                g0iVar = I3;
                            }
                            f3 = 1.0f;
                            av8Var2.s(false);
                            Float valueOf32 = Float.valueOf(f3);
                            k4a k4aVar62 = (k4a) L.g();
                            av8Var2.d0(-1093194547);
                            ordinal3 = k4aVar62.ordinal();
                            if (ordinal3 != 0) {
                            }
                            f4 = 1.0f;
                            av8Var2.s(false);
                            Float valueOf422 = Float.valueOf(f4);
                            twj f722 = L.f();
                            av8Var2.d0(-984009111);
                            k4a k4aVar722 = k4a.a;
                            boolean z722 = z6;
                            k4a k4aVar822 = k4a.b;
                            if (f722.c(k4aVar722, k4aVar822)) {
                            }
                            av8Var2.s(false);
                            vwj x2222 = yso.x(L, valueOf32, valueOf422, g0iVar2, q4kVar, av8Var2, 196608);
                            k4a k4aVar9222 = (k4a) t01Var.w();
                            av8Var2.d0(-1258455321);
                            ordinal4 = k4aVar9222.ordinal();
                            if (ordinal4 != 0) {
                            }
                            f5 = 1.0f;
                            av8Var2.s(false);
                            Float valueOf52222 = Float.valueOf(f5);
                            k4a k4aVar102222 = (k4a) L.g();
                            av8Var2.d0(-1258455321);
                            ordinal5 = k4aVar102222.ordinal();
                            if (ordinal5 != 0) {
                            }
                            f6 = 1.0f;
                            av8Var2.s(false);
                            Float valueOf62222 = Float.valueOf(f6);
                            L.f();
                            av8Var2.d0(2126293195);
                            av8Var2.s(false);
                            vwj x32222 = yso.x(L, valueOf52222, valueOf62222, g0iVar, q4kVar, av8Var2, 196608);
                            g0i I42222 = ufa.I(bwcVar, av8Var2);
                            k4a k4aVar112222 = (k4a) L.g();
                            av8Var2.d0(-12973394);
                            iArr = oaj.a;
                            if (iArr[k4aVar112222.ordinal()] == 1) {
                            }
                            av8Var2.s(false);
                            j23 f82222 = r13.f(j6);
                            g = av8Var2.g(f82222);
                            O = av8Var2.O();
                            a99 a99Var42222 = nf3.a;
                            if (g) {
                            }
                            ryVar = ryVar2;
                            q4k q4kVar22222 = new q4k(ryVar, new oo(f82222, 9));
                            av8Var2.n0(q4kVar22222);
                            O = q4kVar22222;
                            q4k q4kVar32222 = (q4k) O;
                            k4aVar = (k4a) t01Var.w();
                            av8Var2.d0(-12973394);
                            if (iArr[k4aVar.ordinal()] == 1) {
                            }
                            r13 e22222 = vxd.e(av8Var2, false, j);
                            k4a k4aVar122222 = (k4a) L.g();
                            av8Var2.d0(-12973394);
                            if (iArr[k4aVar122222.ordinal()] == 1) {
                            }
                            av8Var2.s(false);
                            r13 r13Var4222 = new r13(j7);
                            L.f();
                            av8Var2.d0(1954111929);
                            av8Var2.s(false);
                            vwj x42222 = yso.x(L, e22222, r13Var4222, I42222, q4kVar32222, av8Var2, 196608);
                            av8Var2.d0(-464752477);
                            av8Var2.s(false);
                            j23 f92222 = r13.f(j2);
                            g2 = av8Var2.g(f92222);
                            O2 = av8Var2.O();
                            a99Var2 = a99Var;
                            if (!g2) {
                            }
                            q4k q4kVar42222 = new q4k(ryVar, new oo(f92222, 9));
                            av8Var2.n0(q4kVar42222);
                            O2 = q4kVar42222;
                            av8Var2.d0(-464752477);
                            av8Var2.s(false);
                            r13 r13Var22222 = new r13(j2);
                            av8Var2.d0(-464752477);
                            av8Var2.s(false);
                            r13 r13Var32222 = new r13(j2);
                            L.f();
                            av8Var2.d0(1190923886);
                            av8Var2.s(false);
                            vwj x52222 = yso.x(L, r13Var22222, r13Var32222, I42222, (q4k) O2, av8Var2, 196608);
                            O3 = av8Var2.O();
                            if (O3 == a99Var2) {
                            }
                            naj najVar2222 = (naj) O3;
                            if (ct8Var == null) {
                            }
                            if (!z2) {
                            }
                            O4 = av8Var2.O();
                            if (O4 == a99Var2) {
                            }
                            cdi cdiVar2222 = (cdi) O4;
                            if (function22 == null) {
                            }
                            function27 = function24;
                            p3eVar2 = p3eVar;
                            function28 = function26;
                            a99Var3 = a99Var2;
                            n9jVar3 = n9jVar2;
                            i8 = i15;
                            tc3Var2 = null;
                            av8Var2.d0(-1890217110);
                            av8Var2.s(false);
                            tc3Var3 = null;
                            O5 = av8Var2.O();
                            if (O5 == a99Var3) {
                            }
                            av8Var2.d0(-1889500886);
                            av8Var2.s(false);
                            av8Var2.d0(-1888924534);
                            av8Var2.s(false);
                            if (!z2) {
                            }
                            if (function23 == null) {
                            }
                            if (!z2) {
                            }
                            if (function27 == null) {
                            }
                            long j122222 = !z2 ? n9jVar3.H : z3 ? n9jVar3.I : booleanValue ? n9jVar3.F : n9jVar3.G;
                            if (function25 == null) {
                            }
                            ordinal6 = vcjVar.ordinal();
                            if (ordinal6 == 0) {
                            }
                        }
                    }
                    f2 = 1.0f;
                    av8Var2.s(false);
                    Float valueOf22 = Float.valueOf(f2);
                    L.f();
                    av8Var2.d0(-709912974);
                    av8Var2.s(false);
                    vwj x6 = yso.x(L, valueOf, valueOf22, I2, q4kVar, av8Var2, 196608);
                    bwc bwcVar2 = bwc.d;
                    g0i I32 = ufa.I(bwcVar2, av8Var2);
                    I = ufa.I(bwc.e, av8Var2);
                    k4a k4aVar52 = (k4a) t01Var.w();
                    av8Var2.d0(-1093194547);
                    ordinal2 = k4aVar52.ordinal();
                    if (ordinal2 != 0) {
                    }
                    f3 = 1.0f;
                    av8Var2.s(false);
                    Float valueOf322 = Float.valueOf(f3);
                    k4a k4aVar622 = (k4a) L.g();
                    av8Var2.d0(-1093194547);
                    ordinal3 = k4aVar622.ordinal();
                    if (ordinal3 != 0) {
                    }
                    f4 = 1.0f;
                    av8Var2.s(false);
                    Float valueOf4222 = Float.valueOf(f4);
                    twj f7222 = L.f();
                    av8Var2.d0(-984009111);
                    k4a k4aVar7222 = k4a.a;
                    boolean z7222 = z6;
                    k4a k4aVar8222 = k4a.b;
                    if (f7222.c(k4aVar7222, k4aVar8222)) {
                    }
                    av8Var2.s(false);
                    vwj x22222 = yso.x(L, valueOf322, valueOf4222, g0iVar2, q4kVar, av8Var2, 196608);
                    k4a k4aVar92222 = (k4a) t01Var.w();
                    av8Var2.d0(-1258455321);
                    ordinal4 = k4aVar92222.ordinal();
                    if (ordinal4 != 0) {
                    }
                    f5 = 1.0f;
                    av8Var2.s(false);
                    Float valueOf522222 = Float.valueOf(f5);
                    k4a k4aVar1022222 = (k4a) L.g();
                    av8Var2.d0(-1258455321);
                    ordinal5 = k4aVar1022222.ordinal();
                    if (ordinal5 != 0) {
                    }
                    f6 = 1.0f;
                    av8Var2.s(false);
                    Float valueOf622222 = Float.valueOf(f6);
                    L.f();
                    av8Var2.d0(2126293195);
                    av8Var2.s(false);
                    vwj x322222 = yso.x(L, valueOf522222, valueOf622222, g0iVar, q4kVar, av8Var2, 196608);
                    g0i I422222 = ufa.I(bwcVar2, av8Var2);
                    k4a k4aVar1122222 = (k4a) L.g();
                    av8Var2.d0(-12973394);
                    iArr = oaj.a;
                    if (iArr[k4aVar1122222.ordinal()] == 1) {
                    }
                    av8Var2.s(false);
                    j23 f822222 = r13.f(j6);
                    g = av8Var2.g(f822222);
                    O = av8Var2.O();
                    a99 a99Var422222 = nf3.a;
                    if (g) {
                    }
                    ryVar = ryVar2;
                    q4k q4kVar222222 = new q4k(ryVar, new oo(f822222, 9));
                    av8Var2.n0(q4kVar222222);
                    O = q4kVar222222;
                    q4k q4kVar322222 = (q4k) O;
                    k4aVar = (k4a) t01Var.w();
                    av8Var2.d0(-12973394);
                    if (iArr[k4aVar.ordinal()] == 1) {
                    }
                    r13 e222222 = vxd.e(av8Var2, false, j);
                    k4a k4aVar1222222 = (k4a) L.g();
                    av8Var2.d0(-12973394);
                    if (iArr[k4aVar1222222.ordinal()] == 1) {
                    }
                    av8Var2.s(false);
                    r13 r13Var42222 = new r13(j7);
                    L.f();
                    av8Var2.d0(1954111929);
                    av8Var2.s(false);
                    vwj x422222 = yso.x(L, e222222, r13Var42222, I422222, q4kVar322222, av8Var2, 196608);
                    av8Var2.d0(-464752477);
                    av8Var2.s(false);
                    j23 f922222 = r13.f(j2);
                    g2 = av8Var2.g(f922222);
                    O2 = av8Var2.O();
                    a99Var2 = a99Var;
                    if (!g2) {
                    }
                    q4k q4kVar422222 = new q4k(ryVar, new oo(f922222, 9));
                    av8Var2.n0(q4kVar422222);
                    O2 = q4kVar422222;
                    av8Var2.d0(-464752477);
                    av8Var2.s(false);
                    r13 r13Var222222 = new r13(j2);
                    av8Var2.d0(-464752477);
                    av8Var2.s(false);
                    r13 r13Var322222 = new r13(j2);
                    L.f();
                    av8Var2.d0(1190923886);
                    av8Var2.s(false);
                    vwj x522222 = yso.x(L, r13Var222222, r13Var322222, I422222, (q4k) O2, av8Var2, 196608);
                    O3 = av8Var2.O();
                    if (O3 == a99Var2) {
                    }
                    naj najVar22222 = (naj) O3;
                    if (ct8Var == null) {
                    }
                    if (!z2) {
                    }
                    O4 = av8Var2.O();
                    if (O4 == a99Var2) {
                    }
                    cdi cdiVar22222 = (cdi) O4;
                    if (function22 == null) {
                    }
                    function27 = function24;
                    p3eVar2 = p3eVar;
                    function28 = function26;
                    a99Var3 = a99Var2;
                    n9jVar3 = n9jVar2;
                    i8 = i15;
                    tc3Var2 = null;
                    av8Var2.d0(-1890217110);
                    av8Var2.s(false);
                    tc3Var3 = null;
                    O5 = av8Var2.O();
                    if (O5 == a99Var3) {
                    }
                    av8Var2.d0(-1889500886);
                    av8Var2.s(false);
                    av8Var2.d0(-1888924534);
                    av8Var2.s(false);
                    if (!z2) {
                    }
                    if (function23 == null) {
                    }
                    if (!z2) {
                    }
                    if (function27 == null) {
                    }
                    long j1222222 = !z2 ? n9jVar3.H : z3 ? n9jVar3.I : booleanValue ? n9jVar3.F : n9jVar3.G;
                    if (function25 == null) {
                    }
                    ordinal6 = vcjVar.ordinal();
                    if (ordinal6 == 0) {
                    }
                }
            }
            f = 1.0f;
            av8Var2.s(false);
            Float valueOf7 = Float.valueOf(f);
            k4a k4aVar42 = (k4a) ((eoh) L.d).getValue();
            av8Var2.d0(-1436405362);
            ordinal = k4aVar42.ordinal();
            if (ordinal != 0) {
            }
            f2 = 1.0f;
            av8Var2.s(false);
            Float valueOf222 = Float.valueOf(f2);
            L.f();
            av8Var2.d0(-709912974);
            av8Var2.s(false);
            vwj x62 = yso.x(L, valueOf7, valueOf222, I2, q4kVar, av8Var2, 196608);
            bwc bwcVar22 = bwc.d;
            g0i I322 = ufa.I(bwcVar22, av8Var2);
            I = ufa.I(bwc.e, av8Var2);
            k4a k4aVar522 = (k4a) t01Var.w();
            av8Var2.d0(-1093194547);
            ordinal2 = k4aVar522.ordinal();
            if (ordinal2 != 0) {
            }
            f3 = 1.0f;
            av8Var2.s(false);
            Float valueOf3222 = Float.valueOf(f3);
            k4a k4aVar6222 = (k4a) L.g();
            av8Var2.d0(-1093194547);
            ordinal3 = k4aVar6222.ordinal();
            if (ordinal3 != 0) {
            }
            f4 = 1.0f;
            av8Var2.s(false);
            Float valueOf42222 = Float.valueOf(f4);
            twj f72222 = L.f();
            av8Var2.d0(-984009111);
            k4a k4aVar72222 = k4a.a;
            boolean z72222 = z6;
            k4a k4aVar82222 = k4a.b;
            if (f72222.c(k4aVar72222, k4aVar82222)) {
            }
            av8Var2.s(false);
            vwj x222222 = yso.x(L, valueOf3222, valueOf42222, g0iVar2, q4kVar, av8Var2, 196608);
            k4a k4aVar922222 = (k4a) t01Var.w();
            av8Var2.d0(-1258455321);
            ordinal4 = k4aVar922222.ordinal();
            if (ordinal4 != 0) {
            }
            f5 = 1.0f;
            av8Var2.s(false);
            Float valueOf5222222 = Float.valueOf(f5);
            k4a k4aVar10222222 = (k4a) L.g();
            av8Var2.d0(-1258455321);
            ordinal5 = k4aVar10222222.ordinal();
            if (ordinal5 != 0) {
            }
            f6 = 1.0f;
            av8Var2.s(false);
            Float valueOf6222222 = Float.valueOf(f6);
            L.f();
            av8Var2.d0(2126293195);
            av8Var2.s(false);
            vwj x3222222 = yso.x(L, valueOf5222222, valueOf6222222, g0iVar, q4kVar, av8Var2, 196608);
            g0i I4222222 = ufa.I(bwcVar22, av8Var2);
            k4a k4aVar11222222 = (k4a) L.g();
            av8Var2.d0(-12973394);
            iArr = oaj.a;
            if (iArr[k4aVar11222222.ordinal()] == 1) {
            }
            av8Var2.s(false);
            j23 f8222222 = r13.f(j6);
            g = av8Var2.g(f8222222);
            O = av8Var2.O();
            a99 a99Var4222222 = nf3.a;
            if (g) {
            }
            ryVar = ryVar2;
            q4k q4kVar2222222 = new q4k(ryVar, new oo(f8222222, 9));
            av8Var2.n0(q4kVar2222222);
            O = q4kVar2222222;
            q4k q4kVar3222222 = (q4k) O;
            k4aVar = (k4a) t01Var.w();
            av8Var2.d0(-12973394);
            if (iArr[k4aVar.ordinal()] == 1) {
            }
            r13 e2222222 = vxd.e(av8Var2, false, j);
            k4a k4aVar12222222 = (k4a) L.g();
            av8Var2.d0(-12973394);
            if (iArr[k4aVar12222222.ordinal()] == 1) {
            }
            av8Var2.s(false);
            r13 r13Var422222 = new r13(j7);
            L.f();
            av8Var2.d0(1954111929);
            av8Var2.s(false);
            vwj x4222222 = yso.x(L, e2222222, r13Var422222, I4222222, q4kVar3222222, av8Var2, 196608);
            av8Var2.d0(-464752477);
            av8Var2.s(false);
            j23 f9222222 = r13.f(j2);
            g2 = av8Var2.g(f9222222);
            O2 = av8Var2.O();
            a99Var2 = a99Var;
            if (!g2) {
            }
            q4k q4kVar4222222 = new q4k(ryVar, new oo(f9222222, 9));
            av8Var2.n0(q4kVar4222222);
            O2 = q4kVar4222222;
            av8Var2.d0(-464752477);
            av8Var2.s(false);
            r13 r13Var2222222 = new r13(j2);
            av8Var2.d0(-464752477);
            av8Var2.s(false);
            r13 r13Var3222222 = new r13(j2);
            L.f();
            av8Var2.d0(1190923886);
            av8Var2.s(false);
            vwj x5222222 = yso.x(L, r13Var2222222, r13Var3222222, I4222222, (q4k) O2, av8Var2, 196608);
            O3 = av8Var2.O();
            if (O3 == a99Var2) {
            }
            naj najVar222222 = (naj) O3;
            if (ct8Var == null) {
            }
            if (!z2) {
            }
            O4 = av8Var2.O();
            if (O4 == a99Var2) {
            }
            cdi cdiVar222222 = (cdi) O4;
            if (function22 == null) {
            }
            function27 = function24;
            p3eVar2 = p3eVar;
            function28 = function26;
            a99Var3 = a99Var2;
            n9jVar3 = n9jVar2;
            i8 = i15;
            tc3Var2 = null;
            av8Var2.d0(-1890217110);
            av8Var2.s(false);
            tc3Var3 = null;
            O5 = av8Var2.O();
            if (O5 == a99Var3) {
            }
            av8Var2.d0(-1889500886);
            av8Var2.s(false);
            av8Var2.d0(-1888924534);
            av8Var2.s(false);
            if (!z2) {
            }
            if (function23 == null) {
            }
            if (!z2) {
            }
            if (function27 == null) {
            }
            long j12222222 = !z2 ? n9jVar3.H : z3 ? n9jVar3.I : booleanValue ? n9jVar3.F : n9jVar3.G;
            if (function25 == null) {
            }
            ordinal6 = vcjVar.ordinal();
            if (ordinal6 == 0) {
            }
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2() { // from class: jaj
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(i | 1);
                    int K2 = aba.K(i2);
                    qha.a(vcj.this, charSequence, function2, uajVar, ct8Var, function22, function23, function24, function25, z, z2, z3, wzcVar, p3eVar, n9jVar, function26, (of3) obj, K, K2);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(long j, dfj dfjVar, Function2 function2, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(396611577);
        int i2 = (av8Var.f(j) ? 4 : 2) | i | (av8Var.g(dfjVar) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= av8Var.i(function2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            w1a.f(j, dfjVar, function2, av8Var, i2 & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new tff(j, dfjVar, function2, i, 1);
        }
    }

    public static final void c(long j, Function2 function2, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(590397809);
        int i2 = (av8Var.f(j) ? 4 : 2) | i | (av8Var.i(function2) ? 32 : 16);
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            tol.b(lo3.a.a(new r13(j)), function2, av8Var, (i2 & 112) | 8);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new o47(j, function2, i, 4);
        }
    }

    public static final void d(final float f, final int i, long j, of3 of3Var) {
        final long j2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-173491901);
        int i2 = (av8Var.d(f) ? 4 : 2) | i | (av8Var.f(j) ? 32 : 16);
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            j2 = j;
            kq9.b(s6a.N(R.drawable.ic_arrow_drop_down_16, 6, av8Var), null, haa.v(bkh.l(utc.a, 16.0f), f), j2, av8Var, ((i2 << 6) & 7168) | 48, 0);
        } else {
            j2 = j;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2(j2, i, f) { // from class: arh
                public final /* synthetic */ float a;
                public final /* synthetic */ long b;

                {
                    this.a = f;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(1);
                    qha.d(this.a, K, this.b, (of3) obj);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(int i, int i2, of3 of3Var, xtc xtcVar, String str, String str2, String str3, Function0 function0) {
        String str4;
        int i3;
        int i4;
        Function0 function02;
        int i5;
        xtc xtcVar2;
        String str5;
        Function0 function03;
        eqf u;
        int i6;
        String str6;
        Function0 function04;
        xtc xtcVar3;
        boolean z;
        String str7;
        Function0 function05;
        str.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(41827424);
        int i7 = i | (av8Var.g(str) ? 4 : 2) | (av8Var.g(str2) ? 32 : 16) | 384;
        if ((i2 & 8) == 0) {
            str4 = str3;
            if (av8Var.g(str4)) {
                i3 = com.ironsource.mediationsdk.metadata.a.o;
                int i8 = i7 | i3;
                i4 = i2 & 16;
                if (i4 == 0) {
                    i5 = i8 | 24576;
                    function02 = function0;
                } else {
                    function02 = function0;
                    i5 = i8 | (av8Var.i(function02) ? 16384 : 8192);
                }
                if (av8Var.T(i5 & 1, (i5 & 9363) == 9362)) {
                    av8Var.W();
                    xtcVar2 = xtcVar;
                    str5 = str4;
                    function03 = function02;
                } else {
                    av8Var.Y();
                    int i9 = i & 1;
                    utc utcVar = utc.a;
                    if (i9 == 0 || av8Var.B()) {
                        if ((i2 & 8) != 0) {
                            if (str2 == null) {
                                str4 = ljg.k(av8Var, 1541453640, R.string.button_add, av8Var, false);
                            } else {
                                av8Var.d0(1541453175);
                                av8Var.s(false);
                                str4 = str2;
                            }
                            i5 &= -7169;
                        }
                        if (i4 != 0) {
                            Object O = av8Var.O();
                            if (O == nf3.a) {
                                O = new ila(26);
                                av8Var.n0(O);
                            }
                            i6 = i5;
                            str6 = str4;
                            function04 = (Function0) O;
                        } else {
                            i6 = i5;
                            str6 = str4;
                            function04 = function02;
                        }
                        xtcVar3 = utcVar;
                    } else {
                        av8Var.W();
                        if ((i2 & 8) != 0) {
                            i5 &= -7169;
                        }
                        xtcVar3 = xtcVar;
                        i6 = i5;
                        str6 = str4;
                        function04 = function02;
                    }
                    av8Var.t();
                    xtc d0 = l98.d0(bkh.d(xtcVar3, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1);
                    u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
                    int hashCode = Long.hashCode(av8Var.T);
                    aee m = av8Var.m();
                    xtc C = fqj.C(av8Var, d0);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(zg3Var);
                    } else {
                        av8Var.q0();
                    }
                    f50 f50Var = hf3.g;
                    waa.K(av8Var, a2, f50Var);
                    ff3 ff3Var = hf3.f;
                    waa.K(av8Var, m, ff3Var);
                    Integer valueOf = Integer.valueOf(hashCode);
                    f50 f50Var2 = hf3.j;
                    waa.K(av8Var, valueOf, f50Var2);
                    ry ryVar = hf3.k;
                    waa.J(av8Var, ryVar);
                    f50 f50Var3 = hf3.d;
                    waa.K(av8Var, C, f50Var3);
                    l8g a3 = k8g.a(ww9.b, uxf.m, av8Var, 48);
                    int hashCode2 = Long.hashCode(av8Var.T);
                    aee m2 = av8Var.m();
                    xtc C2 = fqj.C(av8Var, utcVar);
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(zg3Var);
                    } else {
                        av8Var.q0();
                    }
                    waa.K(av8Var, a3, f50Var);
                    waa.K(av8Var, m2, ff3Var);
                    bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
                    waa.K(av8Var, C2, f50Var3);
                    if (str2 == null || str2.length() == 0) {
                        z = false;
                        av8Var.d0(1267294967);
                        kq9.a(haa.t(R.drawable.ic_warning, 0, av8Var), null, bkh.l(utcVar, 16.0f), lz.D(R.color.alert, av8Var), av8Var, 440, 0);
                        bf3.u(utcVar, 8.0f, av8Var, false);
                    } else {
                        av8Var.d0(1267607292);
                        z = false;
                        av8Var.s(false);
                    }
                    yf8 yf8Var = xth.a;
                    xtc xtcVar4 = xtcVar3;
                    udj.c(str, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.e(), av8Var, i6 & 14, 24960, 110586);
                    av8Var = av8Var;
                    av8Var.s(true);
                    if (str2 != null) {
                        av8Var.d0(1615345763);
                        udj.c(str2, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.f(), av8Var, (i6 >> 3) & 14, 0, 131066);
                        av8Var = av8Var;
                        av8Var.s(false);
                        str7 = str6;
                        function05 = function04;
                    } else {
                        av8Var.d0(1615523827);
                        str7 = str6;
                        function05 = function04;
                        ktm.c(str7, xth.f(), function05, null, null, 0L, 0L, av8Var, ((i6 >> 9) & 14) | ((i6 >> 6) & 896), 120);
                        av8Var.s(false);
                    }
                    av8Var.s(true);
                    str5 = str7;
                    function03 = function05;
                    xtcVar2 = xtcVar4;
                }
                u = av8Var.u();
                if (u == null) {
                    u.d = new s52(i, i2, xtcVar2, str, str2, str5, function03);
                    return;
                }
                return;
            }
        } else {
            str4 = str3;
        }
        i3 = 1024;
        int i82 = i7 | i3;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        if (av8Var.T(i5 & 1, (i5 & 9363) == 9362)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void f(final String str, final boolean z, final lrh lrhVar, final Function0 function0, xtc xtcVar, boolean z2, final ct8 ct8Var, ct8 ct8Var2, boolean z3, final boolean z4, wzc wzcVar, tt2 tt2Var, of3 of3Var, final int i, final int i2) {
        int i3;
        ct8 ct8Var3;
        int i4;
        boolean z5;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        final boolean z6;
        final wzc wzcVar2;
        final tt2 tt2Var2;
        final ct8 ct8Var4;
        final boolean z7;
        final xtc xtcVar2;
        str.getClass();
        lrhVar.getClass();
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-282554978);
        int i10 = (av8Var.g(str) ? 4 : 2) | i | (av8Var.h(z) ? 32 : 16);
        if ((i & 384) == 0) {
            i10 |= av8Var.g(lrhVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 3072) == 0) {
            i10 |= av8Var.i(function0) ? com.ironsource.mediationsdk.metadata.a.o : 1024;
        }
        int i11 = i10 | 24576;
        int i12 = i2 & 32;
        if (i12 != 0) {
            i3 = i10 | 221184;
        } else {
            i3 = i11 | (av8Var.h(z2) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE);
        }
        if ((i & 1572864) == 0) {
            i3 |= av8Var.i(ct8Var) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        int i13 = i2 & 128;
        if (i13 != 0) {
            i4 = i3 | 12582912;
            ct8Var3 = ct8Var2;
        } else {
            ct8Var3 = ct8Var2;
            i4 = i3 | (av8Var.i(ct8Var3) ? 8388608 : 4194304);
        }
        int i14 = i2 & NotificationCompat.FLAG_LOCAL_ONLY;
        if (i14 != 0) {
            i5 = i4 | 100663296;
            z5 = z3;
        } else {
            z5 = z3;
            i5 = i4 | (av8Var.h(z5) ? 67108864 : 33554432);
        }
        if ((i & 805306368) == 0) {
            i6 = i5 | (av8Var.h(z4) ? 536870912 : 268435456);
        } else {
            i6 = i5;
        }
        int i15 = i2 & 1024;
        char c2 = i15 != 0 ? (char) 6 : av8Var.g(wzcVar) ? (char) 4 : (char) 2;
        int i16 = i2 & com.ironsource.mediationsdk.metadata.a.o;
        if (i16 != 0) {
            i8 = c2 | '0';
            i7 = i16;
        } else {
            i7 = i16;
            i8 = c2 | (av8Var.g(tt2Var) ? ' ' : (char) 16);
        }
        int i17 = i8;
        if ((i2 & 4096) != 0) {
            i9 = i17 | 384;
        } else {
            i9 = i17 | (av8Var.g(null) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        }
        if (av8Var.T(i6 & 1, ((i6 & 306783379) == 306783378 && (i9 & 147) == 146) ? false : true)) {
            final boolean z8 = i12 != 0 ? true : z2;
            final ct8 ct8Var5 = i13 != 0 ? null : ct8Var3;
            final boolean z9 = i14 != 0 ? true : z5;
            final wzc wzcVar3 = i15 != 0 ? null : wzcVar;
            final tt2 tt2Var3 = i7 != 0 ? null : tt2Var;
            Object O = av8Var.O();
            if (O == nf3.a) {
                O = e.f(Boolean.FALSE);
                av8Var.n0(O);
            }
            final e1d e1dVar = (e1d) O;
            final cdi b2 = a60.b(((Boolean) e1dVar.getValue()).booleanValue() ? -180.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, s02.h0(400, 0, jg5.a, 2), "dropdown_arrow_rotation_animation", av8Var, 3072, 20);
            final Integer num = null;
            tol.b(l7a.c.a(new p75(Float.NaN)), yqo.H(-1394323234, av8Var, new Function2() { // from class: drh
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    final ct8 ct8Var6;
                    Object obj3;
                    final e1d e1dVar2;
                    final tt2 tt2Var4;
                    of3 of3Var2 = (of3) obj;
                    int intValue = ((Integer) obj2).intValue();
                    av8 av8Var2 = (av8) of3Var2;
                    if (av8Var2.T(intValue & 1, (intValue & 3) != 2)) {
                        final ct8 ct8Var7 = ct8.this;
                        float f = ct8Var7 != null ? 8.0f : 12.0f;
                        Integer num2 = num;
                        final boolean z10 = z;
                        d7e d7eVar = null;
                        if (num2 == null || z10) {
                            num2 = null;
                        }
                        if (num2 == null) {
                            av8Var2.d0(-1654551192);
                        } else {
                            av8Var2.d0(-1654551191);
                            d7eVar = haa.t(num2.intValue(), 0, av8Var2);
                        }
                        av8Var2.s(false);
                        av8Var2.d0(85180117);
                        utc utcVar = utc.a;
                        xtc a2 = bkh.a(utcVar, 32.0f, 32.0f);
                        a99 a99Var = nf3.a;
                        if (d7eVar != null) {
                            xtc A = wnn.A(utcVar, o7g.a(24.0f));
                            boolean i18 = av8Var2.i(d7eVar);
                            Object O2 = av8Var2.O();
                            if (i18 || O2 == a99Var) {
                                O2 = new qfg(d7eVar, 21);
                                av8Var2.n0(O2);
                            }
                            a2 = a2.z(td4.X(A, (Function1) O2));
                        }
                        av8Var2.s(false);
                        n7g a3 = o7g.a(24.0f);
                        t3e t3eVar = q72.a;
                        final lrh lrhVar2 = lrhVar;
                        v72 b3 = q72.b(lrhVar2.l, 30);
                        p72 a4 = q72.a(lrhVar2.b(z10, av8Var2), 0L, lrhVar2.b(z10, av8Var2), 0L, av8Var2, 10);
                        qz1 H = fcp.H(lrhVar2.a(z10, av8Var2), 1.5f);
                        ct8 ct8Var8 = ct8Var5;
                        t3e t3eVar2 = new t3e(f, 8.0f, ct8Var8 != null ? 8.0f : 12.0f, 8.0f);
                        final boolean z11 = z9;
                        boolean h = av8Var2.h(z11) | av8Var2.h(z10);
                        final Function0 function02 = function0;
                        boolean g = h | av8Var2.g(function02);
                        final tt2 tt2Var5 = tt2Var3;
                        boolean g2 = g | av8Var2.g(tt2Var5);
                        final boolean z12 = z4;
                        boolean h2 = g2 | av8Var2.h(z12);
                        Object O3 = av8Var2.O();
                        e1d e1dVar3 = e1dVar;
                        if (h2 || O3 == a99Var) {
                            ct8Var6 = ct8Var8;
                            e1dVar2 = e1dVar3;
                            obj3 = new Function0() { // from class: yqh
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    if (z11) {
                                        boolean z13 = z10;
                                        Function0 function03 = function02;
                                        if (!z13) {
                                            function03.invoke();
                                        } else if (tt2Var5 != null) {
                                            e1dVar2.setValue(Boolean.valueOf(!((Boolean) r2.getValue()).booleanValue()));
                                        } else if (z12) {
                                            function03.invoke();
                                        }
                                    }
                                    return Unit.a;
                                }
                            };
                            tt2Var4 = tt2Var5;
                            av8Var2.n0(obj3);
                        } else {
                            ct8Var6 = ct8Var8;
                            tt2Var4 = tt2Var5;
                            obj3 = O3;
                            e1dVar2 = e1dVar3;
                        }
                        final String str2 = str;
                        final boolean z13 = z8;
                        final cdi cdiVar = b2;
                        final float f2 = f;
                        final e1d e1dVar4 = e1dVar2;
                        iz8.e((Function0) obj3, a2, z13, a3, a4, b3, H, t3eVar2, wzcVar3, yqo.H(1490189038, av8Var2, new ct8() { // from class: zqh
                            @Override // defpackage.ct8
                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                long j;
                                float f3;
                                boolean z14;
                                of3 of3Var3 = (of3) obj5;
                                int intValue2 = ((Integer) obj6).intValue();
                                ((n8g) obj4).getClass();
                                av8 av8Var3 = (av8) of3Var3;
                                if (av8Var3.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                                    utc utcVar2 = utc.a;
                                    ct8 ct8Var9 = ct8.this;
                                    lrh lrhVar3 = lrhVar2;
                                    boolean z15 = z10;
                                    boolean z16 = z13;
                                    if (ct8Var9 == null) {
                                        av8Var3.d0(1439691285);
                                        av8Var3.s(false);
                                    } else {
                                        av8Var3.d0(1439691286);
                                        ct8Var9.invoke(new r13(lrhVar3.c(z15, z16, av8Var3)), av8Var3, 0);
                                        bf3.u(utcVar2, 4.0f, av8Var3, false);
                                    }
                                    lrhVar3.getClass();
                                    if (z15) {
                                        av8Var3.d0(1370829514);
                                        j = ((r13) lrhVar3.d.invoke(av8Var3, 0)).a;
                                        av8Var3.s(false);
                                    } else if (z16) {
                                        av8Var3.d0(1370832322);
                                        j = ((r13) lrhVar3.c.invoke(av8Var3, 0)).a;
                                        av8Var3.s(false);
                                    } else {
                                        av8Var3.d0(1370831018);
                                        j = ((r13) lrhVar3.e.invoke(av8Var3, 0)).a;
                                        av8Var3.s(false);
                                    }
                                    yf8 yf8Var = xth.a;
                                    udj.c(str2, null, j, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var3, 0, 0, 131066);
                                    ct8 ct8Var10 = ct8Var6;
                                    if (ct8Var10 == null) {
                                        av8Var3.d0(1440062293);
                                        av8Var3.s(false);
                                        z14 = z16;
                                        f3 = 4.0f;
                                    } else {
                                        f3 = 4.0f;
                                        ljg.r(4.0f, 1440062294, av8Var3, av8Var3, utcVar2);
                                        z14 = z16;
                                        ct8Var10.invoke(new r13(lrhVar3.c(z15, z14, av8Var3)), av8Var3, 0);
                                        av8Var3.s(false);
                                    }
                                    tt2 tt2Var6 = tt2Var4;
                                    if (tt2Var6 == null) {
                                        av8Var3.d0(1440252819);
                                        av8Var3.s(false);
                                    } else {
                                        ljg.r(f3, 1440252820, av8Var3, av8Var3, utcVar2);
                                        qha.d(((Number) cdiVar.getValue()).floatValue(), 0, lrhVar3.c(z15, z14, av8Var3), av8Var3);
                                        e1d e1dVar5 = e1dVar4;
                                        boolean booleanValue = ((Boolean) e1dVar5.getValue()).booleanValue();
                                        long floatToRawIntBits = (Float.floatToRawIntBits(8.0f) & 4294967295L) | (Float.floatToRawIntBits(-f2) << 32);
                                        Object O4 = av8Var3.O();
                                        if (O4 == nf3.a) {
                                            O4 = new tra(19, e1dVar5);
                                            av8Var3.n0(O4);
                                        }
                                        qha.h(tt2Var6, booleanValue, floatToRawIntBits, (Function0) O4, av8Var3, 3072);
                                        av8Var3.s(false);
                                    }
                                } else {
                                    av8Var3.W();
                                }
                                return Unit.a;
                            }
                        }), av8Var2, 805306368, 0);
                    } else {
                        av8Var2.W();
                    }
                    return Unit.a;
                }
            }), av8Var, 56);
            xtcVar2 = utc.a;
            ct8Var4 = ct8Var5;
            z7 = z9;
            tt2Var2 = tt2Var3;
            z6 = z8;
            wzcVar2 = wzcVar3;
        } else {
            av8Var.W();
            z6 = z2;
            wzcVar2 = wzcVar;
            tt2Var2 = tt2Var;
            ct8Var4 = ct8Var3;
            z7 = z5;
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2() { // from class: erh
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(i | 1);
                    qha.f(str, z, lrhVar, function0, xtcVar2, z6, ct8Var, ct8Var4, z7, z4, wzcVar2, tt2Var2, (of3) obj, K, i2);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void g(int i, Function0 function0, xtc xtcVar, lrh lrhVar, boolean z, boolean z2, boolean z3, of3 of3Var, int i2, int i3) {
        int i4;
        lrh lrhVar2;
        int i5;
        boolean z4;
        int i6;
        int i7;
        boolean z5;
        boolean z6;
        boolean z7;
        xtc xtcVar2;
        boolean z8;
        eqf u;
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(957850659);
        if ((i2 & 6) == 0) {
            i4 = (av8Var.e(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= av8Var.i(function0) ? 32 : 16;
        }
        int i8 = i4 | 384;
        int i9 = i3 & 8;
        if (i9 != 0) {
            i8 = i4 | 3456;
        } else if ((i2 & 3072) == 0) {
            lrhVar2 = lrhVar;
            i8 |= av8Var.g(lrhVar2) ? com.ironsource.mediationsdk.metadata.a.o : 1024;
            i5 = i3 & 16;
            if (i5 == 0) {
                i8 |= 24576;
            } else if ((i2 & 24576) == 0) {
                z4 = z;
                i8 |= av8Var.h(z4) ? 16384 : 8192;
                i6 = 196608 | i8;
                i7 = i3 & 64;
                if (i7 != 0) {
                    i6 = 1769472 | i8;
                } else if ((1572864 & i2) == 0) {
                    z5 = z3;
                    i6 |= av8Var.h(z5) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                    if (av8Var.T(i6 & 1, (599187 & i6) == 599186)) {
                        av8Var.W();
                        z6 = z5;
                        z7 = z4;
                        xtcVar2 = xtcVar;
                        z8 = z2;
                    } else {
                        if (i9 != 0) {
                            lrhVar2 = irh.m;
                        }
                        if (i5 != 0) {
                            z4 = false;
                        }
                        boolean z9 = i7 == 0 ? z5 : false;
                        tol.b(l7a.c.a(new p75(Float.NaN)), yqo.H(1032620259, av8Var, new bl1(lrhVar2, z4, z9, function0, i)), av8Var, 56);
                        xtcVar2 = utc.a;
                        z7 = z4;
                        z6 = z9;
                        z8 = true;
                    }
                    lrh lrhVar3 = lrhVar2;
                    u = av8Var.u();
                    if (u == null) {
                        u.d = new m17(i, function0, xtcVar2, lrhVar3, z7, z8, z6, i2, i3);
                        return;
                    }
                    return;
                }
                z5 = z3;
                if (av8Var.T(i6 & 1, (599187 & i6) == 599186)) {
                }
                lrh lrhVar32 = lrhVar2;
                u = av8Var.u();
                if (u == null) {
                }
            }
            z4 = z;
            i6 = 196608 | i8;
            i7 = i3 & 64;
            if (i7 != 0) {
            }
            z5 = z3;
            if (av8Var.T(i6 & 1, (599187 & i6) == 599186)) {
            }
            lrh lrhVar322 = lrhVar2;
            u = av8Var.u();
            if (u == null) {
            }
        }
        lrhVar2 = lrhVar;
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        z4 = z;
        i6 = 196608 | i8;
        i7 = i3 & 64;
        if (i7 != 0) {
        }
        z5 = z3;
        if (av8Var.T(i6 & 1, (599187 & i6) == 599186)) {
        }
        lrh lrhVar3222 = lrhVar2;
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void h(tt2 tt2Var, boolean z, long j, Function0 function0, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(656588600);
        int i2 = i | (av8Var.g(tt2Var) ? 4 : 2) | (av8Var.h(z) ? 32 : 16) | (av8Var.f(j) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            u10.a(z, function0, null, j, null, null, o7g.a(8.0f), lz.D(R.color.surface_P, av8Var), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, yqo.H(888649203, av8Var, new yya(26, tt2Var, function0)), av8Var, ((i2 >> 3) & 14) | 48 | ((i2 << 3) & 7168), 1844);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new g30(tt2Var, z, j, function0, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void i(final int i, float f, long j, of3 of3Var, final int i2, final int i3) {
        int i4;
        final long j2;
        eqf u;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1527405858);
        if ((i2 & 6) == 0) {
            i4 = (av8Var.e(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= av8Var.d(f) ? 32 : 16;
        }
        int i6 = i3 & 4;
        if (i6 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            j2 = j;
            i4 |= av8Var.f(j2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
            if (av8Var.T(i4 & 1, (i4 & 147) == 146)) {
                av8Var.W();
            } else {
                if (i5 != 0) {
                    f = 16.0f;
                }
                long j3 = i6 != 0 ? r13.i : j2;
                int i7 = i4 << 3;
                kq9.b(s6a.N(i, (i7 & 112) | 6, av8Var), null, bkh.l(utc.a, f), j3, av8Var, (i7 & 7168) | 48, 0);
                j2 = j3;
            }
            final float f2 = f;
            u = av8Var.u();
            if (u == null) {
                u.d = new Function2() { // from class: brh
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        qha.i(i, f2, j2, (of3) obj, aba.K(i2 | 1), i3);
                        return Unit.a;
                    }
                };
                return;
            }
            return;
        }
        j2 = j;
        if (av8Var.T(i4 & 1, (i4 & 147) == 146)) {
        }
        final float f22 = f;
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void j(long j, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1099330015);
        if ((i & 6) == 0) {
            i2 = (av8Var.f(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            cdi M = hda.M((j / 1000) + 86400, av8Var, 0);
            utc utcVar = utc.a;
            xtc h = ljg.h(8.0f, bkh.d(utcVar, 1.0f), lz.D(R.color.secondary_highlight, av8Var), 8.0f);
            l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, h);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            kq9.b(s6a.N(R.drawable.ic_sale_mark, 6, av8Var), null, bkh.l(utcVar, 16.0f), lz.D(R.color.success, av8Var), av8Var, 432, 0);
            nq8.h(av8Var, bkh.p(utcVar, 8.0f));
            String w = oea.w(R.string.countdown_ends_in, new Object[]{String.format("%02d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(((js8) M.getValue()).e), Integer.valueOf(((js8) M.getValue()).f), Integer.valueOf(((js8) M.getValue()).g)}, 3))}, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(w, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.e(), av8Var, 0, 0, 131066);
            nq8.h(av8Var, new goa(1.0f, true));
            udj.c(oea.w(R.string.percent_off, new Object[]{yid.r(50)}, av8Var), l98.c0(n9e.q(utcVar, lz.D(R.color.success, av8Var), o7g.a(2.0f)), 6.0f, 2.0f), lz.D(R.color.surface_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.c(), av8Var, 0, 0, 131064);
            av8Var = av8Var;
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new fr1(j, xtcVar2, i);
        }
    }

    public static final void k(Uri.Builder builder, String str, String str2, boolean z) {
        builder.getClass();
        str.getClass();
        str2.getClass();
        Uri build = builder.build();
        if (build.getQueryParameter(str) == null) {
            builder.appendQueryParameter(str, str2).getClass();
            return;
        }
        if (z) {
            builder.clearQuery();
            Set<String> queryParameterNames = build.getQueryParameterNames();
            queryParameterNames.getClass();
            for (String str3 : queryParameterNames) {
                builder.appendQueryParameter(str3, Intrinsics.c(str3, str) ? str2 : build.getQueryParameter(str3));
            }
        }
    }

    public static int l(und undVar, boolean z) {
        int i = undVar.b;
        int i2 = undVar.c;
        int i3 = z ? i2 : i;
        if (!z) {
            i = i2;
        }
        byte[][] bArr = (byte[][]) undVar.d;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            byte b2 = -1;
            int i6 = 0;
            for (int i7 = 0; i7 < i; i7++) {
                byte b3 = z ? bArr[i5][i7] : bArr[i7][i5];
                if (b3 == b2) {
                    i6++;
                } else {
                    if (i6 >= 5) {
                        i4 += i6 - 2;
                    }
                    i6 = 1;
                    b2 = b3;
                }
            }
            if (i6 >= 5) {
                i4 = (i6 - 2) + i4;
            }
        }
        return i4;
    }

    public static final LinkedHashMap m(ArrayList arrayList) {
        String str = uae.b;
        uae j = tnf.j("/", false);
        LinkedHashMap i = tub.i(new Pair(j, new pol(j, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532)));
        for (pol polVar : CollectionsKt.H0(arrayList, new q6i(23))) {
            if (((pol) i.put(polVar.a, polVar)) == null) {
                while (true) {
                    uae uaeVar = polVar.a;
                    uae c2 = uaeVar.c();
                    if (c2 != null) {
                        pol polVar2 = (pol) i.get(c2);
                        if (polVar2 != null) {
                            polVar2.q.add(uaeVar);
                            break;
                        }
                        pol polVar3 = new pol(c2, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532);
                        i.put(c2, polVar3);
                        polVar3.q.add(uaeVar);
                        polVar = polVar3;
                    }
                }
            }
        }
        return i;
    }

    public static long n(boolean z, int i, zy0 zy0Var, long j, long j2, int i2, boolean z2, long j3, long j4, long j5, long j6) {
        zy0Var.getClass();
        if (j6 != Long.MAX_VALUE && z2) {
            if (i2 != 0) {
                long j7 = j2 + 900000;
                if (j6 < j7) {
                    return j7;
                }
            }
            return j6;
        }
        if (z) {
            long scalb = zy0Var == zy0.b ? j * i : (long) Math.scalb(j, i - 1);
            if (scalb > 18000000) {
                scalb = 18000000;
            }
            return j2 + scalb;
        }
        if (z2) {
            long j8 = i2 == 0 ? j2 + j3 : j2 + j5;
            return (j4 == j5 || i2 != 0) ? j8 : (j5 - j4) + j8;
        }
        if (j2 == -1) {
            return Long.MAX_VALUE;
        }
        return j2 + j3;
    }

    public static final void o(View view) {
        view.getClass();
        w4h a2 = b5h.a((Function2) pea.u(view).b);
        while (a2.hasNext()) {
            ArrayList arrayList = C((View) a2.next()).a;
            int size = arrayList.size();
            while (true) {
                size--;
                if (-1 < size) {
                    ((fsk) arrayList.get(size)).a.e();
                }
            }
        }
    }

    public static void p(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                yhk.s(ljg.j(i2, "at index "));
                return;
            }
        }
    }

    public static final String q(w52 w52Var, long j) {
        if (j == 0) {
            return "";
        }
        a1h a1hVar = w52Var.a;
        if (a1hVar == null) {
            a70.r("Unreacheable");
            return null;
        }
        if (a1hVar.a() < j) {
            byte[] L = yaa.L(w52Var, (int) j);
            return b0a.B(0, L.length, L);
        }
        byte[] bArr = a1hVar.a;
        int i = a1hVar.b;
        String B = b0a.B(i, Math.min(a1hVar.c, ((int) j) + i), bArr);
        w52Var.skip(j);
        return B;
    }

    public static final int r(int i, List list) {
        int i2;
        int i3 = ((c8e) CollectionsKt.h0(list)).c;
        if (i > ((c8e) CollectionsKt.h0(list)).c) {
            s3a.a("Index " + i + " should be less or equal than last line's end " + i3);
        }
        int size = list.size() - 1;
        int i4 = 0;
        while (true) {
            if (i4 > size) {
                i2 = -(i4 + 1);
                break;
            }
            i2 = (i4 + size) >>> 1;
            c8e c8eVar = (c8e) list.get(i2);
            char c2 = c8eVar.b > i ? (char) 1 : c8eVar.c <= i ? (char) 65535 : (char) 0;
            if (c2 >= 0) {
                if (c2 <= 0) {
                    break;
                }
                size = i2 - 1;
            } else {
                i4 = i2 + 1;
            }
        }
        if (i2 >= 0 && i2 < list.size()) {
            return i2;
        }
        StringBuilder t = lnb.t(i2, "Found paragraph index ", " should be in range [0, ");
        t.append(list.size());
        t.append(").\nDebug info: index=");
        t.append(i);
        t.append(", paragraphs=[");
        t.append(ycb.a(list, null, new clc(11), 31));
        t.append(']');
        s3a.a(t.toString());
        return i2;
    }

    public static final int s(int i, List list) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            c8e c8eVar = (c8e) list.get(i3);
            char c2 = c8eVar.d > i ? (char) 1 : c8eVar.e <= i ? (char) 65535 : (char) 0;
            if (c2 < 0) {
                i2 = i3 + 1;
            } else {
                if (c2 <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final int t(float f, ArrayList arrayList) {
        if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return 0;
        }
        if (f >= ((c8e) CollectionsKt.h0(arrayList)).g) {
            return arrayList.size() - 1;
        }
        int size = arrayList.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            c8e c8eVar = (c8e) arrayList.get(i2);
            char c2 = c8eVar.f > f ? (char) 1 : c8eVar.g <= f ? (char) 65535 : (char) 0;
            if (c2 < 0) {
                i = i2 + 1;
            } else {
                if (c2 <= 0) {
                    return i2;
                }
                size = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public static final void u(ArrayList arrayList, long j, Function1 function1) {
        int size = arrayList.size();
        for (int r = r(pej.g(j), arrayList); r < size; r++) {
            c8e c8eVar = (c8e) arrayList.get(r);
            if (c8eVar.b >= pej.f(j)) {
                return;
            }
            if (c8eVar.b != c8eVar.c) {
                function1.invoke(c8eVar);
            }
        }
    }

    public static ujc v(ujc ujcVar, ema emaVar, dfj dfjVar, kx4 kx4Var, sf8 sf8Var) {
        if (ujcVar != null && emaVar == ujcVar.a && g7a.C(dfjVar, emaVar).equals(ujcVar.b) && kx4Var.j() == ujcVar.c.a && sf8Var == ujcVar.d) {
            return ujcVar;
        }
        ujc ujcVar2 = ujc.h;
        if (ujcVar2 != null && emaVar == ujcVar2.a && g7a.C(dfjVar, emaVar).equals(ujcVar2.b) && kx4Var.j() == ujcVar2.c.a && sf8Var == ujcVar2.d) {
            return ujcVar2;
        }
        ujc ujcVar3 = new ujc(emaVar, g7a.C(dfjVar, emaVar), new nx4(kx4Var.j(), kx4Var.getFontScale()), sf8Var);
        ujc.h = ujcVar3;
        return ujcVar3;
    }

    public static final u6b w(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            u6b u6bVar = tag instanceof u6b ? (u6b) tag : null;
            if (u6bVar != null) {
                return u6bVar;
            }
            Object r = mha.r(view);
            view = r instanceof View ? (View) r : null;
        }
        return null;
    }

    public static final String x(int i) {
        StringBuilder sb = new StringBuilder("0x");
        String num = Integer.toString(i, CharsKt.checkRadix(16));
        num.getClass();
        sb.append(num);
        return sb.toString();
    }

    public static Integer y(Context context, String str, String str2) {
        context.getClass();
        if (!((Boolean) n9e.x(context, new cfi(str2, 4))).booleanValue()) {
            return null;
        }
        if (!Intrinsics.c(str, context.getString(R.string.sofascore_rating)) && !Intrinsics.c(str, context.getString(R.string.average_sofascore_rating))) {
            return null;
        }
        int hashCode = str2.hashCode();
        if (hashCode == 428700453) {
            if (str2.equals("league_top_stats")) {
                return Integer.valueOf(R.string.rating_top_stats_general);
            }
            return null;
        }
        if (hashCode == 429176892) {
            if (str2.equals("league_top_teams")) {
                return Integer.valueOf(R.string.rating_top_teams_general);
            }
            return null;
        }
        if (hashCode == 1067837112 && str2.equals("league_top_players")) {
            return Integer.valueOf(R.string.rating_top_players_general);
        }
        return null;
    }

    public static final fo z(uaj uajVar) {
        if (uajVar instanceof uaj) {
            return uxf.o;
        }
        is8.c(uajVar, "Unknown position: ");
        return null;
    }
}
