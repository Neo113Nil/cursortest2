package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import com.facebook.ads.internal.dynamicloading.FlashPreferences;
import com.sofascore.local_persistance.BrandingEvent;
import com.sofascore.model.branding.PartnerOfferType;
import com.sofascore.model.mvvm.model.BaseballRole;
import com.sofascore.model.mvvm.model.DbMyPlayer;
import com.sofascore.model.mvvm.model.PlayerHeadFlags;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.PointType;
import com.sofascore.model.newNetwork.PointTypeSerializer;
import com.sofascore.model.newNetwork.statistics.season.player.PlayerSeasonStatisticsInfo;
import com.sofascore.results.R;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class jie implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ jie(ox4 ox4Var) {
        this.a = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x011a, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.c(r0.getString("PREF_MANAGE_ODDS_ADDS_V2", "under_18"), "25_or_older") != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0132, code lost:
    
        if (defpackage.jhk.a.contains(com.sofascore.model.mvvm.model.UserSegmentationType.Bettor) != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x017b, code lost:
    
        if (defpackage.jhk.a.contains(com.sofascore.model.mvvm.model.UserSegmentationType.Bettor) != false) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007a  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        nlg V0;
        int _init_$lambda$0;
        PointType _init_$lambda$1;
        Boolean bool;
        boolean z;
        boolean z2;
        boolean z3;
        int i = 10;
        Boolean bool2 = null;
        switch (this.a) {
            case 0:
                throw fn0.h(obj);
            case 1:
                MatchResult matchResult = (MatchResult) obj;
                matchResult.getClass();
                return Integer.valueOf(Integer.parseInt(matchResult.getValue()));
            case 2:
                PlayerSeasonStatisticsInfo playerSeasonStatisticsInfo = (PlayerSeasonStatisticsInfo) obj;
                playerSeasonStatisticsInfo.getClass();
                List<Team> previousTeams = playerSeasonStatisticsInfo.getPreviousTeams();
                if (previousTeams == null) {
                    previousTeams = km5.a;
                }
                return CollectionsKt.x0(previousTeams, playerSeasonStatisticsInfo.getTeam());
            case 3:
                Team team = (Team) obj;
                if (team != null) {
                    return Integer.valueOf(team.getId());
                }
                return null;
            case 4:
                glg glgVar = (glg) obj;
                glgVar.getClass();
                V0 = glgVar.V0("SELECT * FROM my_players");
                try {
                    int r = w1a.r(V0, "playerId");
                    int r2 = w1a.r(V0, "notificationsEnabled");
                    ArrayList arrayList = new ArrayList();
                    while (V0.U0()) {
                        arrayList.add(new DbMyPlayer((int) V0.getLong(r), ((int) V0.getLong(r2)) != 0));
                    }
                    return arrayList;
                } finally {
                }
            case 5:
                glg glgVar2 = (glg) obj;
                glgVar2.getClass();
                V0 = glgVar2.V0("SELECT DISTINCT * from (SELECT DISTINCT team_sport_slug FROM players UNION SELECT DISTINCT teams.sport_slug FROM my_teams, teams WHERE teams.id = my_teams.teamId AND teams.type = 1)");
                try {
                    ArrayList arrayList2 = new ArrayList();
                    while (V0.U0()) {
                        arrayList2.add(V0.isNull(0) ? null : V0.F0(0));
                    }
                    return arrayList2;
                } finally {
                }
            case 6:
                glg glgVar3 = (glg) obj;
                glgVar3.getClass();
                V0 = glgVar3.V0("SELECT playerId FROM my_players");
                try {
                    ArrayList arrayList3 = new ArrayList();
                    while (V0.U0()) {
                        arrayList3.add(Integer.valueOf((int) V0.getLong(0)));
                    }
                    return arrayList3;
                } finally {
                }
            case 7:
                return String.valueOf(((Integer) obj).intValue());
            case 8:
                String str = (String) obj;
                str.getClass();
                return str;
            case 9:
                ((List) obj).getClass();
                return Boolean.TRUE;
            case 10:
                npe npeVar = (npe) obj;
                yzd yzdVar = fqe.B;
                npeVar.getClass();
                return npeVar.b;
            case 11:
                List list = (List) obj;
                list.getClass();
                return Boolean.valueOf(list.size() > 1);
            case 12:
                View view = (View) obj;
                view.getClass();
                return Boolean.valueOf(view.getId() == R.id.statistic_label);
            case 13:
                BaseballRole baseballRole = (BaseballRole) obj;
                baseballRole.getClass();
                return baseballRole.getSerialName();
            case 14:
                glg glgVar4 = (glg) obj;
                glgVar4.getClass();
                V0 = glgVar4.V0("DELETE FROM player_of_the_match_vote_table");
                try {
                    V0.U0();
                    V0.close();
                    return Unit.a;
                } finally {
                }
            case 15:
                List list2 = (List) obj;
                list2.getClass();
                if ((list2.size() != 1 || Intrinsics.c(list2.get(0), Season.SubSeasonType.OVERALL.getLabel())) && list2.size() <= 1) {
                    r4 = false;
                }
                return Boolean.valueOf(r4);
            case 16:
                ((View) obj).getClass();
                return Unit.a;
            case 17:
                ((View) obj).getClass();
                return Unit.a;
            case 18:
                ((PlayerHeadFlags) obj).getClass();
                return Boolean.TRUE;
            case 19:
                _init_$lambda$0 = PointTypeSerializer._init_$lambda$0((PointType) obj);
                return Integer.valueOf(_init_$lambda$0);
            case 20:
                _init_$lambda$1 = PointTypeSerializer._init_$lambda$1(((Integer) obj).intValue());
                return _init_$lambda$1;
            case 21:
                ((SharedPreferences) obj).getClass();
                return Boolean.valueOf(!r13.getBoolean("skip_consent_dialog", false));
            case 22:
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                sharedPreferences.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                long j = sharedPreferences.getLong("PREF_FIRST_RUN_TIMESTAMP", currentTimeMillis);
                long j2 = sharedPreferences.getLong("PREF_LAST_MAIN_MATCHES_INTERSTITIAL_AD_SHOWN", 0L);
                long j3 = sharedPreferences.getLong("PREF_MATCH_OF_THE_WEEK_MUTED_UNTIL", 0L);
                LocalDate o = vxd.o(Instant.ofEpochMilli(j));
                LocalDate o2 = vxd.o(Instant.ofEpochMilli(currentTimeMillis));
                ChronoUnit chronoUnit = ChronoUnit.DAYS;
                return Boolean.valueOf(((int) chronoUnit.between(o, o2)) > 10 && ((int) chronoUnit.between(vxd.o(Instant.ofEpochMilli(j2)), Instant.ofEpochMilli(currentTimeMillis).atZone(ZoneId.systemDefault()).toLocalDate())) >= 1 && j3 < currentTimeMillis);
            case 23:
                Context context = (Context) obj;
                context.getClass();
                List c = nwb.c(context);
                SharedPreferences sharedPreferences2 = uic.j;
                if (sharedPreferences2 == null) {
                    Context applicationContext = context.getApplicationContext();
                    synchronized (uic.i) {
                        sharedPreferences2 = a5f.d(applicationContext);
                        uic.j = sharedPreferences2;
                    }
                    sharedPreferences2.getClass();
                }
                boolean z4 = sharedPreferences2.getBoolean("PREF_PROVIDER_ODDS_ENABLE", true);
                Map.Entry v = ccd.v(context);
                if (v != null) {
                    if (!c.contains(v.getKey()) && z4) {
                        if (zu3.V.hasMcc(Integer.valueOf(ke0.c))) {
                            SharedPreferences sharedPreferences3 = uic.j;
                            if (sharedPreferences3 == null) {
                                Context applicationContext2 = context.getApplicationContext();
                                synchronized (uic.i) {
                                    sharedPreferences3 = a5f.d(applicationContext2);
                                    uic.j = sharedPreferences3;
                                }
                                sharedPreferences3.getClass();
                            }
                            ccd ccdVar = vl.b;
                            break;
                        }
                        if (((BrandingEvent) v.getValue()).getBettorsOnly()) {
                            Set set = jhk.a;
                            break;
                        }
                        z2 = true;
                        bool = Boolean.valueOf(z2);
                    }
                    z2 = false;
                    bool = Boolean.valueOf(z2);
                } else {
                    bool = null;
                }
                Boolean bool3 = Boolean.TRUE;
                boolean c2 = Intrinsics.c(bool, bool3);
                Map.Entry w = ccd.w(context);
                if (w != null) {
                    if (!c.contains(w.getKey()) && PartnerOfferType.INSTANCE.fromValue(((BrandingEvent) w.getValue()).getOfferType()) != null) {
                        if (((BrandingEvent) w.getValue()).getBettorsOnly()) {
                            Set set2 = jhk.a;
                            break;
                        }
                        z = true;
                        bool2 = Boolean.valueOf(z);
                    }
                    z = false;
                    bool2 = Boolean.valueOf(z);
                }
                boolean c3 = Intrinsics.c(bool2, bool3);
                if (!c2 && !c3) {
                    r4 = false;
                }
                return Boolean.valueOf(r4);
            case 24:
                ((SharedPreferences) obj).getClass();
                return Boolean.TRUE;
            case 25:
                ((SharedPreferences) obj).getClass();
                return Boolean.TRUE;
            case 26:
                ((SharedPreferences) obj).getClass();
                return Boolean.TRUE;
            case 27:
                SharedPreferences sharedPreferences4 = (SharedPreferences) obj;
                sharedPreferences4.getClass();
                if (sharedPreferences4.getInt("ask_counter_v3", 0) + 1 > 40) {
                    boolean z5 = System.currentTimeMillis() - Math.max(sharedPreferences4.getLong(FlashPreferences.SP_KEY_LAST_CONFIG_UPDATE_TIMESTAMP, 0L), sharedPreferences4.getLong("PREF_FIRST_RUN_TIMESTAMP", System.currentTimeMillis())) < 259200000;
                    boolean containsKey = c1c.c.a.containsKey(Integer.valueOf(ke0.c));
                    if (!z5 && !containsKey && sharedPreferences4.getBoolean("ask_review_v3", true)) {
                        z3 = true;
                        if (!z3) {
                            int i2 = sharedPreferences4.getInt("ask_counter_v3", 0) + 1;
                            SharedPreferences.Editor edit = sharedPreferences4.edit();
                            edit.getClass();
                            edit.putInt("ask_counter_v3", i2);
                            edit.apply();
                        }
                        return Boolean.valueOf(z3);
                    }
                }
                z3 = false;
                if (!z3) {
                }
                return Boolean.valueOf(z3);
            case 28:
                ((SharedPreferences) obj).getClass();
                return Boolean.TRUE;
            default:
                Context context2 = (Context) obj;
                context2.getClass();
                Boolean bool4 = (Boolean) n9e.x(context2, new a7d(i));
                bool4.booleanValue();
                return bool4;
        }
    }

    public /* synthetic */ jie(int i) {
        this.a = i;
    }
}
