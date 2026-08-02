package defpackage;

import android.content.SharedPreferences;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import com.sofascore.results.ads.Hilt_UpgradeSofascoreActivity;
import com.sofascore.results.main.Hilt_SurveyActivity;
import com.sofascore.results.main.search.Hilt_SearchActivity;
import com.sofascore.results.main.start.Hilt_StartActivity;
import com.sofascore.results.main.start.StartActivity;
import com.sofascore.results.player.statistics.compare.Hilt_SeasonComparisonActivity;
import com.sofascore.results.profile.Hilt_ProfileActivity;
import com.sofascore.results.profile.Hilt_UserProfileActivity;
import com.sofascore.results.profile.predictions.Hilt_ProfilePredictionsActivity;
import com.sofascore.results.profile.topLeaderboards.Hilt_ProfileTopLeaderboardsActivity;
import com.sofascore.results.ranking.Hilt_RankingsActivity;
import com.sofascore.results.referee.Hilt_RefereeActivity;
import com.sofascore.results.referral.Hilt_ReferralActivity;
import com.sofascore.results.sofaSeason.Hilt_SofaSeasonActivity;
import com.sofascore.results.stagesport.Hilt_StageCategoryActivity;
import com.sofascore.results.stagesport.Hilt_StageDetailsActivity;
import com.sofascore.results.team.Hilt_TeamActivity;
import com.sofascore.results.team.trophy.Hilt_TeamTrophyCompareActivity;
import com.sofascore.results.tv.Hilt_TVChannelEditorActivity;
import com.sofascore.results.tv.Hilt_TVScheduleActivity;
import com.sofascore.results.venue.Hilt_VenueActivity;
import com.sofascore.results.wc26.widget.configurationActivity.Hilt_WorldCupWidgetConfigActivity;
import com.sofascore.results.weeklyChallenge.predictions.Hilt_WeeklyPredictionsActivity;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class cb9 implements zpd {
    public final /* synthetic */ int a;
    public final /* synthetic */ AppCompatActivity b;

    public /* synthetic */ cb9(AppCompatActivity appCompatActivity, int i) {
        this.a = i;
        this.b = appCompatActivity;
    }

    @Override // defpackage.zpd
    public final void a(ComponentActivity componentActivity) {
        int i = this.a;
        AppCompatActivity appCompatActivity = this.b;
        switch (i) {
            case 0:
                ((Hilt_ProfileActivity) appCompatActivity).q();
                break;
            case 1:
                ((Hilt_ProfilePredictionsActivity) appCompatActivity).q();
                break;
            case 2:
                ((Hilt_ProfileTopLeaderboardsActivity) appCompatActivity).q();
                break;
            case 3:
                ((Hilt_RankingsActivity) appCompatActivity).q();
                break;
            case 4:
                ((Hilt_RefereeActivity) appCompatActivity).q();
                break;
            case 5:
                ((Hilt_ReferralActivity) appCompatActivity).q();
                break;
            case 6:
                ((Hilt_SearchActivity) appCompatActivity).q();
                break;
            case 7:
                ((Hilt_SeasonComparisonActivity) appCompatActivity).q();
                break;
            case 8:
                ((Hilt_SofaSeasonActivity) appCompatActivity).q();
                break;
            case 9:
                ((Hilt_StageCategoryActivity) appCompatActivity).q();
                break;
            case 10:
                ((Hilt_StageDetailsActivity) appCompatActivity).q();
                break;
            case 11:
                Hilt_StartActivity hilt_StartActivity = (Hilt_StartActivity) appCompatActivity;
                if (!hilt_StartActivity.k) {
                    hilt_StartActivity.k = true;
                    gc4 gc4Var = (gc4) ((wbi) hilt_StartActivity.f());
                    ((StartActivity) hilt_StartActivity).n = (SharedPreferences) gc4Var.a.l.get();
                    break;
                }
                break;
            case 12:
                ((Hilt_SurveyActivity) appCompatActivity).q();
                break;
            case 13:
                ((Hilt_TVChannelEditorActivity) appCompatActivity).q();
                break;
            case 14:
                ((Hilt_TVScheduleActivity) appCompatActivity).q();
                break;
            case 15:
                ((Hilt_TeamActivity) appCompatActivity).q();
                break;
            case 16:
                ((Hilt_TeamTrophyCompareActivity) appCompatActivity).q();
                break;
            case 17:
                ((Hilt_UpgradeSofascoreActivity) appCompatActivity).q();
                break;
            case 18:
                ((Hilt_UserProfileActivity) appCompatActivity).q();
                break;
            case 19:
                ((Hilt_VenueActivity) appCompatActivity).q();
                break;
            case 20:
                ((Hilt_WeeklyPredictionsActivity) appCompatActivity).q();
                break;
            default:
                ((Hilt_WorldCupWidgetConfigActivity) appCompatActivity).q();
                break;
        }
    }
}
