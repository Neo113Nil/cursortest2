package defpackage;

import android.content.Context;
import android.content.Intent;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.results.player.statistics.compare.SeasonComparisonActivity;
import com.sofascore.results.player.statistics.compare.model.ComparisonSeasonInfo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class pxg {
    public static ComparisonSeasonInfo a(Integer num, Integer num2, String str) {
        if (num == null || num2 == null) {
            return null;
        }
        if (num.intValue() == -1000) {
            return new ComparisonSeasonInfo.TennisYearInfo(String.valueOf(-num2.intValue()));
        }
        int intValue = num.intValue();
        int intValue2 = num2.intValue();
        if (str == null) {
            str = Season.SubSeasonType.OVERALL.getLabel();
        }
        return new ComparisonSeasonInfo.UniqueTournamentSeasonInfo(intValue, intValue2, str);
    }

    public static Intent b(Context context, e73 e73Var, int i, Integer num, ComparisonSeasonInfo comparisonSeasonInfo, ComparisonSeasonInfo comparisonSeasonInfo2, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) SeasonComparisonActivity.class);
        intent.putExtra("ENTITY_TYPE", e73Var);
        intent.putExtra("ENTITY_ID_1", i);
        intent.putExtra("ENTITY_ID_2", num);
        intent.putExtra("PRESELECTED_SEASON_INFO", comparisonSeasonInfo);
        intent.putExtra("PRESELECTED_SEASON_INFO_2", comparisonSeasonInfo2);
        intent.putExtra("SPORT", str);
        intent.putExtra("ANALYTICS_TYPE", str2);
        return intent;
    }

    public static void c(Context context, int i, Integer num, Integer num2, Integer num3, String str, String str2, String str3) {
        int i2 = SeasonComparisonActivity.L;
        context.getClass();
        context.startActivity(b(context, e73.a, i, num, a(num2, num3, str), null, str2, str3));
    }

    public static void d(Context context, int i, Integer num, Integer num2, Integer num3, String str, String str2, String str3) {
        int i2 = SeasonComparisonActivity.L;
        context.getClass();
        context.startActivity(b(context, e73.b, i, num, a(num2, num3, str), null, str2, str3));
    }
}
