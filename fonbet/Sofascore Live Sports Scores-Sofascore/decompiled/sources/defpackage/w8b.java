package defpackage;

import android.graphics.Color;
import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.mvvm.model.Incident;
import com.sofascore.model.mvvm.model.PlayerData;
import com.sofascore.model.mvvm.model.PlayerDataInfo;
import com.sofascore.model.mvvm.model.TestingRatings;
import com.sofascore.model.network.response.FootballPlayerEventStatistics;
import com.sofascore.results.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class w8b {
    public static ArrayList a(String str) {
        List split$default;
        List c = a.c(1);
        split$default = StringsKt__StringsKt.split$default(str, new String[]{"-"}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList(k13.r(split$default, 10));
        Iterator it = split$default.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(Integer.parseInt((String) it.next())));
        }
        return CollectionsKt.w0(arrayList, c);
    }

    public static sda b(int i, String str, String str2) {
        String str3 = (Intrinsics.c(uaa.c, "api.sofascore.com/") ? "https://img.sofascore.com/" : dmi.q("https://", uaa.c)).concat("api/v1/") + "event/" + i + "/jersey/" + str2 + "/player/clean";
        return new sda(str3, ljg.j(str != null ? Color.parseColor(str) : -16777216, str3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r19v4 */
    public static n8b c(PlayerData playerData, boolean z, boolean z2, y9b y9bVar) {
        Integer num;
        ?? r19;
        Integer num2;
        Integer num3;
        TestingRatings ratingVersions;
        int i;
        int i2;
        Incident.SubstitutionIncident substitutionIncident;
        int i3;
        playerData.getClass();
        int id = playerData.getPlayer().getId();
        String C = tba.C(playerData.getPlayer());
        if (C == null) {
            C = tba.t(playerData.getPlayer());
        }
        Throwable th = null;
        String str = Intrinsics.c(playerData.getCaptain(), Boolean.TRUE) ? "(c) " : null;
        if (str == null) {
            str = "";
        }
        String q = dmi.q(str, C);
        Integer teamId = playerData.getTeamId();
        String jerseyNumber = playerData.getJerseyNumber();
        FootballPlayerEventStatistics footballStatistics = playerData.getFootballStatistics();
        Double rating = footballStatistics != null ? footballStatistics.getRating() : null;
        Double avgRating = playerData.getAvgRating();
        PlayerDataInfo info = playerData.getInfo();
        String age = info != null ? info.getAge() : null;
        PlayerDataInfo info2 = playerData.getInfo();
        String kilometersCovered = info2 != null ? info2.getKilometersCovered() : null;
        PlayerDataInfo info3 = playerData.getInfo();
        String value = info3 != null ? info3.getValue() : null;
        PlayerDataInfo info4 = playerData.getInfo();
        String height = info4 != null ? info4.getHeight() : null;
        Country country = playerData.getPlayer().getCountry();
        String alpha2 = country != null ? country.getAlpha2() : null;
        fk2 a = x8b.a(playerData.getCardIncidents());
        List<Incident.SubstitutionIncident> substitutionIncidents = playerData.getSubstitutionIncidents();
        if (substitutionIncidents == null || (substitutionIncident = (Incident.SubstitutionIncident) CollectionsKt.firstOrNull(substitutionIncidents)) == null) {
            num = null;
        } else {
            boolean injury = substitutionIncident.getInjury();
            if (injury) {
                i3 = R.drawable.ic_swap_injured_lineups;
            } else {
                if (injury) {
                    zzl.b();
                    return null;
                }
                i3 = R.drawable.ic_swap_lineups;
            }
            num = Integer.valueOf(i3);
        }
        boolean isTopRated = playerData.getPlayer().getIsTopRated();
        List<Incident.GoalIncident> goalIncidents = playerData.getGoalIncidents();
        if (goalIncidents != null) {
            if (goalIncidents.isEmpty()) {
                i2 = 0;
            } else {
                i2 = 0;
                for (Incident.GoalIncident goalIncident : goalIncidents) {
                    Throwable th2 = th;
                    if ((Intrinsics.c(goalIncident.getIncidentClass(), "regular") || Intrinsics.c(goalIncident.getIncidentClass(), "penalty")) && (i2 = i2 + 1) < 0) {
                        b.p();
                        throw th2;
                    }
                    th = th2;
                }
            }
            r19 = th;
            num2 = Integer.valueOf(i2);
        } else {
            r19 = 0;
            num2 = null;
        }
        int m = yid.m(num2);
        List<Incident.GoalIncident> assistIncidents = playerData.getAssistIncidents();
        int m2 = yid.m(assistIncidents != null ? Integer.valueOf(assistIncidents.size()) : r19);
        List<Incident.GoalIncident> goalIncidents2 = playerData.getGoalIncidents();
        if (goalIncidents2 != null) {
            if (goalIncidents2.isEmpty()) {
                i = 0;
            } else {
                Iterator it = goalIncidents2.iterator();
                int i4 = 0;
                while (it.hasNext()) {
                    if (Intrinsics.c(((Incident.GoalIncident) it.next()).getIncidentClass(), Incident.GoalIncident.TYPE_OWN_GOAL) && (i4 = i4 + 1) < 0) {
                        b.p();
                        throw r19;
                    }
                }
                i = i4;
            }
            num3 = Integer.valueOf(i);
        } else {
            num3 = r19;
        }
        int m3 = yid.m(num3);
        FootballPlayerEventStatistics footballStatistics2 = playerData.getFootballStatistics();
        Double alternative = (footballStatistics2 == null || (ratingVersions = footballStatistics2.getRatingVersions()) == null) ? r19 : ratingVersions.getAlternative();
        PlayerDataInfo info5 = playerData.getInfo();
        return new n8b(id, q, teamId, jerseyNumber, z, rating, avgRating, z2, age, kilometersCovered, value, height, info5 != null ? info5.getFantasyPoints() : r19, alpha2, a, num, isTopRated, m, m2, m3, playerData.getPlayer().getDisabled(), alternative, y9bVar);
    }
}
