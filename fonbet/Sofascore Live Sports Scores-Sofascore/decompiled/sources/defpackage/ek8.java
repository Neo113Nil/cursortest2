package defpackage;

import android.content.Context;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.Manager;
import com.sofascore.model.mvvm.model.PlayerData;
import com.sofascore.model.mvvm.model.PlayerDataInfo;
import com.sofascore.model.mvvm.model.TestingRatings;
import com.sofascore.model.network.response.FootballPlayerEventStatistics;
import com.sofascore.results.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class ek8 {
    public static gv9 a(Context context, List list, List list2, LinkedHashMap linkedHashMap, Manager manager, ArrayList arrayList, boolean z, String str, boolean z2, boolean z3, boolean z4, Gender gender) {
        list.getClass();
        str.getClass();
        Set set = d9b.a;
        return d9b.a(list, list2, null, manager, arrayList, z, new i9b(new n9k(R.string.starting_players, gender)), new i9b(new q9k(R.string.substitutions)), Boolean.valueOf(z4).equals(Boolean.TRUE) ? new g9b(new q9k(R.string.rating_lineups_info, l6g.K(str))) : null, new dk8(context, z2, z3, linkedHashMap), new dk8(z2, z3, context, linkedHashMap), null, 2052);
    }

    public static p9b b(PlayerData playerData, Context context, boolean z, boolean z2, y9b y9bVar, boolean z3) {
        q9b q9bVar;
        TestingRatings ratingVersions;
        FootballPlayerEventStatistics footballStatistics = playerData.getFootballStatistics();
        boolean z4 = yid.m(footballStatistics != null ? footballStatistics.getMinutesPlayed() : null) > 0 || (z2 && playerData.getSeasonRatingBreakdown() != null);
        int id = playerData.getPlayer().getId();
        Set set = d9b.a;
        String c = d9b.c(playerData);
        String jerseyNumber = playerData.getJerseyNumber();
        boolean isTopRated = playerData.getPlayer().getIsTopRated();
        gv9 b = d9b.b(playerData, Sports.FOOTBALL);
        gv9 e = d9b.e(playerData, context);
        FootballPlayerEventStatistics footballStatistics2 = playerData.getFootballStatistics();
        Double rating = footballStatistics2 != null ? footballStatistics2.getRating() : null;
        Double avgRating = playerData.getAvgRating();
        FootballPlayerEventStatistics footballStatistics3 = playerData.getFootballStatistics();
        Double alternative = (footballStatistics3 == null || (ratingVersions = footballStatistics3.getRatingVersions()) == null) ? null : ratingVersions.getAlternative();
        Integer teamId = playerData.getTeamId();
        PlayerDataInfo info = playerData.getInfo();
        String age = info != null ? info.getAge() : null;
        PlayerDataInfo info2 = playerData.getInfo();
        String kilometersCovered = info2 != null ? info2.getKilometersCovered() : null;
        PlayerDataInfo info3 = playerData.getInfo();
        String value = info3 != null ? info3.getValue() : null;
        PlayerDataInfo info4 = playerData.getInfo();
        String height = info4 != null ? info4.getHeight() : null;
        PlayerDataInfo info5 = playerData.getInfo();
        String fantasyPoints = info5 != null ? info5.getFantasyPoints() : null;
        Country country = playerData.getPlayer().getCountry();
        k9b k9bVar = new k9b(z, rating, avgRating, z2, alternative, teamId, age, kilometersCovered, value, height, fantasyPoints, country != null ? country.getAlpha2() : null);
        if (y9bVar != null) {
            q9bVar = new q9b(y9bVar.a, y9bVar.b, y9bVar.c, y9bVar.d, y9bVar.f, z4 && y9bVar.e);
        } else {
            q9bVar = null;
        }
        return new p9b(id, c, jerseyNumber, isTopRated, b, e, k9bVar, q9bVar, null, null, !z3, 768);
    }
}
