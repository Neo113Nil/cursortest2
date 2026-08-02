package defpackage;

import android.view.LayoutInflater;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import com.sofascore.results.base.Hilt_BaseActivity;
import com.sofascore.results.bettingtips.Hilt_BettingTipsActivity;
import com.sofascore.results.buzzer.Hilt_BuzzerActivity;
import com.sofascore.results.chat.Hilt_ChatActivity;
import com.sofascore.results.event.Hilt_EventActivity;
import com.sofascore.results.fantasy.competition.Hilt_FantasyCompetitionActivity;
import com.sofascore.results.fantasy.competition.articles.Hilt_FantasyNewsArticlesActivity;
import com.sofascore.results.fantasy.competition.managerprofile.Hilt_FantasyManagerProfileActivity;
import com.sofascore.results.fantasy.finished.Hilt_FantasyFinishedCompetitionsActivity;
import com.sofascore.results.fantasy.highlights.gameweek.Hilt_FantasyGameweekHighlightsActivity;
import com.sofascore.results.fantasy.league.Hilt_FantasyLeagueActivity;
import com.sofascore.results.fantasy.onboarding.Hilt_FantasyOnboardingActivity;
import com.sofascore.results.fantasy.teammanagement.transfers.Hilt_FantasyTransfersActivity;
import com.sofascore.results.fantasy.userteam.Hilt_FantasyUserSquadActivity;
import com.sofascore.results.feedback.Hilt_FeedbackActivity;
import com.sofascore.results.league.Hilt_LeagueActivity;
import com.sofascore.results.league.historical.Hilt_LeagueHistoricalDataActivity;
import com.sofascore.results.main.Hilt_MainActivity;
import com.sofascore.results.manager.Hilt_ManagerActivity;
import com.sofascore.results.mma.fightNight.Hilt_MmaFightNightActivity;
import com.sofascore.results.mma.fighter.Hilt_MmaFighterActivity;
import com.sofascore.results.mma.organisation.Hilt_MmaOrganisationActivity;
import com.sofascore.results.notifications.Hilt_NotificationSettingsActivity;
import com.sofascore.results.onboarding.Hilt_OnboardingActivity;
import com.sofascore.results.player.Hilt_PlayerActivity;
import com.sofascore.results.pots.Hilt_POTSActivity;
import com.sofascore.results.profile.Hilt_LoginScreenActivity;
import com.sofascore.results.settings.about.Hilt_AboutActivity;
import com.sofascore.results.settings.deleteAccount.Hilt_DeleteAccountActivity;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ab0 implements zpd {
    public final /* synthetic */ int a;
    public final /* synthetic */ AppCompatActivity b;

    public /* synthetic */ ab0(AppCompatActivity appCompatActivity, int i) {
        this.a = i;
        this.b = appCompatActivity;
    }

    @Override // defpackage.zpd
    public final void a(ComponentActivity componentActivity) {
        int i = this.a;
        AppCompatActivity appCompatActivity = this.b;
        switch (i) {
            case 0:
                kb0 m = appCompatActivity.m();
                ub0 ub0Var = (ub0) m;
                LayoutInflater from = LayoutInflater.from(ub0Var.k);
                if (from.getFactory() == null) {
                    from.setFactory2(ub0Var);
                } else {
                    from.getFactory2();
                }
                appCompatActivity.getSavedStateRegistry().a("androidx:appcompat");
                m.f();
                break;
            case 1:
                ((Hilt_AboutActivity) appCompatActivity).q();
                break;
            case 2:
                ((Hilt_BaseActivity) appCompatActivity).q();
                break;
            case 3:
                ((Hilt_BettingTipsActivity) appCompatActivity).q();
                break;
            case 4:
                ((Hilt_BuzzerActivity) appCompatActivity).q();
                break;
            case 5:
                ((Hilt_ChatActivity) appCompatActivity).q();
                break;
            case 6:
                ((Hilt_DeleteAccountActivity) appCompatActivity).q();
                break;
            case 7:
                ((Hilt_EventActivity) appCompatActivity).q();
                break;
            case 8:
                ((Hilt_FantasyCompetitionActivity) appCompatActivity).q();
                break;
            case 9:
                ((Hilt_FantasyFinishedCompetitionsActivity) appCompatActivity).q();
                break;
            case 10:
                ((Hilt_FantasyGameweekHighlightsActivity) appCompatActivity).q();
                break;
            case 11:
                ((Hilt_FantasyLeagueActivity) appCompatActivity).q();
                break;
            case 12:
                ((Hilt_FantasyManagerProfileActivity) appCompatActivity).q();
                break;
            case 13:
                ((Hilt_FantasyNewsArticlesActivity) appCompatActivity).q();
                break;
            case 14:
                ((Hilt_FantasyOnboardingActivity) appCompatActivity).q();
                break;
            case 15:
                ((Hilt_FantasyTransfersActivity) appCompatActivity).q();
                break;
            case 16:
                ((Hilt_FantasyUserSquadActivity) appCompatActivity).q();
                break;
            case 17:
                ((Hilt_FeedbackActivity) appCompatActivity).q();
                break;
            case 18:
                ((Hilt_LeagueActivity) appCompatActivity).q();
                break;
            case 19:
                ((Hilt_LeagueHistoricalDataActivity) appCompatActivity).q();
                break;
            case 20:
                ((Hilt_LoginScreenActivity) appCompatActivity).q();
                break;
            case 21:
                ((Hilt_MainActivity) appCompatActivity).q();
                break;
            case 22:
                ((Hilt_ManagerActivity) appCompatActivity).q();
                break;
            case 23:
                ((Hilt_MmaFightNightActivity) appCompatActivity).q();
                break;
            case 24:
                ((Hilt_MmaFighterActivity) appCompatActivity).q();
                break;
            case 25:
                ((Hilt_MmaOrganisationActivity) appCompatActivity).q();
                break;
            case 26:
                ((Hilt_NotificationSettingsActivity) appCompatActivity).q();
                break;
            case 27:
                ((Hilt_OnboardingActivity) appCompatActivity).q();
                break;
            case 28:
                ((Hilt_POTSActivity) appCompatActivity).q();
                break;
            default:
                ((Hilt_PlayerActivity) appCompatActivity).q();
                break;
        }
    }
}
