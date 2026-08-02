package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textfield.TextInputEditText;
import com.sofascore.model.fantasy.FantasyCompetitionType;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.results.R;
import com.sofascore.results.dialog.FollowSubStagesDialog;
import com.sofascore.results.dialog.FollowSubStagesViewModel;
import com.sofascore.results.fantasy.comparison.FantasyPlayerComparisonActivity;
import com.sofascore.results.fantasy.comparison.selectplayer.FantasyComparisonPlayersDialogFragment;
import com.sofascore.results.fantasy.competition.home.bottomsheet.playeroftheround.FantasyPlayersOfTheRoundBottomSheet;
import com.sofascore.results.fantasy.competition.managerprofile.FantasyManagerProfileActivity;
import com.sofascore.results.fantasy.competition.team.FantasyCompetitionMyTeamFragment;
import com.sofascore.results.fantasy.competition.team.bottomsheet.FantasyOptimiseSquadBottomSheet;
import com.sofascore.results.fantasy.competition.team.player.FantasyFootballPlayerBottomSheet;
import com.sofascore.results.fantasy.finished.FantasyFinishedCompetitionsActivity;
import com.sofascore.results.fantasy.highlights.gameweek.potgw.FantasyFootballPlayerGameweekHighlightsBottomSheet;
import com.sofascore.results.fantasy.highlights.gameweek.potgw.FantasyGameweekHighlightsPOTGWFragment;
import com.sofascore.results.fantasy.league.leaderboard.FantasyLeagueLeaderboardFragment;
import com.sofascore.results.fantasy.league.settings.bottomsheet.invite.FantasyInviteToLeagueBottomSheet;
import com.sofascore.results.fantasy.onboarding.components.bottomSheet.FantasySectionedInfoType;
import com.sofascore.results.fantasy.teammanagement.substitutions.FantasySubstitutionsActivity;
import com.sofascore.results.fantasy.teammanagement.transfers.review.FantasyTransfersReviewFragment;
import com.sofascore.results.fantasy.ui.components.view.FantasyNotificationsActionButton;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import com.sofascore.results.fantasy.userteam.FantasyUserSquadActivity;
import com.sofascore.results.fantasy.walkthrough.createteam.FantasyWalkthroughCreateTeamFragment;
import com.sofascore.results.fantasy.weekly.FantasyEliteFaceoffRevealDialog;
import com.sofascore.results.feedback.FeedbackActivity;
import com.sofascore.results.main.fantasy.bottomsheet.FantasySectionedBottomSheetFragment;
import com.sofascore.results.main.fantasy.center.elitefaceoff.FantasyEliteFaceoffIntroBottomSheet;
import com.sofascore.results.view.SofaTextInputLayout;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.internal.FieldOrOneOfBinding;
import java.io.File;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class qo6 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qo6(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0076 A[LOOP:0: B:15:0x0070->B:17:0x0076, LOOP_END] */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        ProtoAdapter adapter_delegate$lambda$0;
        int c;
        int i = this.a;
        int i2 = 3;
        boolean z = false;
        rq3 rq3Var = null;
        Object obj = this.b;
        switch (i) {
            case 0:
                Bundle requireArguments = ((FantasyComparisonPlayersDialogFragment) obj).requireArguments();
                requireArguments.getClass();
                Serializable M = gz8.M(requireArguments, "INDEX_EXTRA", nc7.class);
                if (M != null) {
                    return (nc7) M;
                }
                a70.p("Serializable INDEX_EXTRA not found");
                return null;
            case 1:
                FantasyCompetitionMyTeamFragment fantasyCompetitionMyTeamFragment = (FantasyCompetitionMyTeamFragment) obj;
                fantasyCompetitionMyTeamFragment.l();
                g9i g9iVar = fantasyCompetitionMyTeamFragment.u;
                if (g9iVar != null) {
                    g9iVar.e(null);
                }
                g9i g9iVar2 = fantasyCompetitionMyTeamFragment.D().p;
                if (g9iVar2 != null) {
                    g9iVar2.e(null);
                }
                return Unit.a;
            case 2:
                return ((pu6) obj).l().f;
            case 3:
                FantasyEliteFaceoffIntroBottomSheet fantasyEliteFaceoffIntroBottomSheet = (FantasyEliteFaceoffIntroBottomSheet) obj;
                Context requireContext = fantasyEliteFaceoffIntroBottomSheet.requireContext();
                requireContext.getClass();
                nv.A(requireContext, "finish", "faceoff_introductory_modal");
                ypb ypbVar = (ypb) fantasyEliteFaceoffIntroBottomSheet.C.getValue();
                xw3.L(un0.z(ypbVar), null, null, new qu1(ypbVar, ((kw6) fantasyEliteFaceoffIntroBottomSheet.B.getValue()).f, rq3Var, 17), 3);
                fantasyEliteFaceoffIntroBottomSheet.j();
                return Unit.a;
            case 4:
                FantasyEliteFaceoffRevealDialog fantasyEliteFaceoffRevealDialog = (FantasyEliteFaceoffRevealDialog) obj;
                Context requireContext2 = fantasyEliteFaceoffRevealDialog.requireContext();
                requireContext2.getClass();
                nv.A(requireContext2, "faceoff_reveal", "create_lineup");
                pu6 pu6Var = (pu6) fantasyEliteFaceoffRevealDialog.B.getValue();
                xw3.L(un0.z(pu6Var), null, null, new qu1(pu6Var, fantasyEliteFaceoffRevealDialog.v().f, rq3Var, 8), 3);
                fantasyEliteFaceoffRevealDialog.k(false, false);
                return Unit.a;
            case 5:
                int i3 = FantasyFinishedCompetitionsActivity.M;
                return ad.a(((FantasyFinishedCompetitionsActivity) obj).getLayoutInflater());
            case 6:
                FantasyFootballPlayerBottomSheet fantasyFootballPlayerBottomSheet = (FantasyFootballPlayerBottomSheet) obj;
                Context requireContext3 = fantasyFootballPlayerBottomSheet.requireContext();
                requireContext3.getClass();
                nv.A(requireContext3, "player_compare", "player_modal");
                int i4 = FantasyPlayerComparisonActivity.L;
                Context requireContext4 = fantasyFootballPlayerBottomSheet.requireContext();
                requireContext4.getClass();
                ml4.p0(requireContext4, fantasyFootballPlayerBottomSheet.M().k, fantasyFootballPlayerBottomSheet.M().m, Integer.valueOf(fantasyFootballPlayerBottomSheet.M().j.a), fantasyFootballPlayerBottomSheet.M().o);
                return Unit.a;
            case 7:
                FantasyGameweekHighlightsPOTGWFragment fantasyGameweekHighlightsPOTGWFragment = (FantasyGameweekHighlightsPOTGWFragment) obj;
                kj7 kj7Var = ((o07) ((eoh) fantasyGameweekHighlightsPOTGWFragment.D().j).getValue()).a;
                if (kj7Var != null) {
                    FragmentActivity requireActivity = fantasyGameweekHighlightsPOTGWFragment.requireActivity();
                    requireActivity.getClass();
                    FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel = kj7Var.a;
                    int i5 = fantasyGameweekHighlightsPOTGWFragment.D().g;
                    FantasyCompetitionType fantasyCompetitionType = fantasyGameweekHighlightsPOTGWFragment.D().h;
                    int i6 = fantasyGameweekHighlightsPOTGWFragment.D().i;
                    boolean z2 = ((o07) ((eoh) fantasyGameweekHighlightsPOTGWFragment.D().j).getValue()).d;
                    fantasyCompetitionType.getClass();
                    FantasyFootballPlayerGameweekHighlightsBottomSheet fantasyFootballPlayerGameweekHighlightsBottomSheet = new FantasyFootballPlayerGameweekHighlightsBottomSheet();
                    fantasyFootballPlayerGameweekHighlightsBottomSheet.setArguments(fz8.C(fz8.F(SearchResponseKt.PLAYER_ENTITY, fantasyRoundPlayerUiModel), fz8.D(i5, "competitionId"), fz8.G("competitionType", fantasyCompetitionType), fz8.D(i6, "roundId"), fz8.J("tripleCaptain", false), fz8.J("assetsRestricted", z2)));
                    AppCompatActivity appCompatActivity = requireActivity instanceof AppCompatActivity ? (AppCompatActivity) requireActivity : null;
                    if (appCompatActivity != null) {
                        wca.x(appCompatActivity.getLifecycle()).b(new r1(fantasyFootballPlayerGameweekHighlightsBottomSheet, appCompatActivity, rq3Var, i2));
                    }
                }
                return Unit.a;
            case 8:
                return ((e37) obj).n().e;
            case 9:
                FantasyLeagueLeaderboardFragment fantasyLeagueLeaderboardFragment = (FantasyLeagueLeaderboardFragment) obj;
                FragmentActivity requireActivity2 = fantasyLeagueLeaderboardFragment.requireActivity();
                requireActivity2.getClass();
                ev6 ev6Var = fantasyLeagueLeaderboardFragment.D().k;
                j67 j67Var = fantasyLeagueLeaderboardFragment.D().l;
                ev6Var.getClass();
                j67Var.getClass();
                FantasyInviteToLeagueBottomSheet fantasyInviteToLeagueBottomSheet = new FantasyInviteToLeagueBottomSheet();
                fantasyInviteToLeagueBottomSheet.setArguments(fz8.C(fz8.G("FANTASY_COMPETITION_EXTRA", ev6Var), fz8.G("FANTASY_LEAGUE_EXTRA", j67Var)));
                AppCompatActivity appCompatActivity2 = requireActivity2 instanceof AppCompatActivity ? (AppCompatActivity) requireActivity2 : null;
                if (appCompatActivity2 != null) {
                    wca.x(appCompatActivity2.getLifecycle()).b(new r1(fantasyInviteToLeagueBottomSheet, appCompatActivity2, rq3Var, i2));
                }
                return Unit.a;
            case 10:
                int i7 = FantasyManagerProfileActivity.N;
                return yd3.a(((FantasyManagerProfileActivity) obj).getLayoutInflater());
            case 11:
                ((r77) obj).u(t67.a);
                return Unit.a;
            case 12:
                return FantasyNotificationsActionButton.b((FantasyNotificationsActionButton) obj);
            case 13:
                ((wb7) obj).u(true);
                return Unit.a;
            case 14:
                Context requireContext5 = ((FantasyOptimiseSquadBottomSheet) obj).requireContext();
                requireContext5.getClass();
                return new ds8(requireContext5);
            case 15:
                int i8 = FantasyPlayerComparisonActivity.L;
                return ad.a(((FantasyPlayerComparisonActivity) obj).getLayoutInflater());
            case 16:
                return Boolean.valueOf(((FantasyPlayersOfTheRoundBottomSheet) obj).requireArguments().getBoolean("assetsRestricted"));
            case 17:
                Object K = gz8.K(((FantasySectionedBottomSheetFragment) obj).requireArguments(), "FANTASY_SECTIONED_INFO_TYPE", FantasySectionedInfoType.class);
                if (K != null) {
                    return (FantasySectionedInfoType) K;
                }
                a70.r("Required value was null.");
                return null;
            case 18:
                int i9 = FantasySubstitutionsActivity.M;
                return yd3.a(((FantasySubstitutionsActivity) obj).getLayoutInflater());
            case 19:
                Context requireContext6 = ((FantasyTransfersReviewFragment) obj).requireContext();
                requireContext6.getClass();
                return new ds8(requireContext6);
            case 20:
                int i10 = FantasyUserSquadActivity.N;
                return yd3.a(((FantasyUserSquadActivity) obj).getLayoutInflater());
            case 21:
                Context requireContext7 = ((FantasyWalkthroughCreateTeamFragment) obj).requireContext();
                requireContext7.getClass();
                return new ds8(requireContext7);
            case 22:
                return Boolean.valueOf(!((vp7) obj).k().g);
            case 23:
                return Integer.valueOf(((vt7) obj).d().size());
            case 24:
                int i11 = FeedbackActivity.M;
                View inflate = ((FeedbackActivity) obj).getLayoutInflater().inflate(R.layout.activity_feedback, (ViewGroup) null, false);
                int i12 = R.id.faq_button;
                TextView textView = (TextView) nq8.B(R.id.faq_button, inflate);
                if (textView != null) {
                    i12 = R.id.faq_image;
                    if (((ImageView) nq8.B(R.id.faq_image, inflate)) != null) {
                        i12 = R.id.feedback_edit;
                        TextInputEditText textInputEditText = (TextInputEditText) nq8.B(R.id.feedback_edit, inflate);
                        if (textInputEditText != null) {
                            i12 = R.id.feedback_edit_layout;
                            SofaTextInputLayout sofaTextInputLayout = (SofaTextInputLayout) nq8.B(R.id.feedback_edit_layout, inflate);
                            if (sofaTextInputLayout != null) {
                                i12 = R.id.feedback_email;
                                TextInputEditText textInputEditText2 = (TextInputEditText) nq8.B(R.id.feedback_email, inflate);
                                if (textInputEditText2 != null) {
                                    i12 = R.id.feedback_email_layout;
                                    SofaTextInputLayout sofaTextInputLayout2 = (SofaTextInputLayout) nq8.B(R.id.feedback_email_layout, inflate);
                                    if (sofaTextInputLayout2 != null) {
                                        i12 = R.id.feedback_image;
                                        ShapeableImageView shapeableImageView = (ShapeableImageView) nq8.B(R.id.feedback_image, inflate);
                                        if (shapeableImageView != null) {
                                            i12 = R.id.feedback_image_button;
                                            ImageView imageView = (ImageView) nq8.B(R.id.feedback_image_button, inflate);
                                            if (imageView != null) {
                                                i12 = R.id.feedback_image_cancel;
                                                ImageView imageView2 = (ImageView) nq8.B(R.id.feedback_image_cancel, inflate);
                                                if (imageView2 != null) {
                                                    i12 = R.id.feedback_image_text;
                                                    TextView textView2 = (TextView) nq8.B(R.id.feedback_image_text, inflate);
                                                    if (textView2 != null) {
                                                        i12 = R.id.feedback_send_button;
                                                        MaterialButton materialButton = (MaterialButton) nq8.B(R.id.feedback_send_button, inflate);
                                                        if (materialButton != null) {
                                                            i12 = R.id.no_internet_view;
                                                            ViewStub viewStub = (ViewStub) nq8.B(R.id.no_internet_view, inflate);
                                                            if (viewStub != null) {
                                                                i12 = R.id.title;
                                                                if (((TextView) nq8.B(R.id.title, inflate)) != null) {
                                                                    i12 = R.id.toolbar;
                                                                    View B = nq8.B(R.id.toolbar, inflate);
                                                                    if (B != null) {
                                                                        z3f.b(B);
                                                                        i12 = R.id.toolbar_holder;
                                                                        if (((AppBarLayout) nq8.B(R.id.toolbar_holder, inflate)) != null) {
                                                                            return new fd((CoordinatorLayout) inflate, textView, textInputEditText, sofaTextInputLayout, textInputEditText2, sofaTextInputLayout2, shapeableImageView, imageView, imageView2, textView2, materialButton, viewStub);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i12)));
                return null;
            case 25:
                adapter_delegate$lambda$0 = FieldOrOneOfBinding.adapter_delegate$lambda$0((FieldOrOneOfBinding) obj);
                return adapter_delegate$lambda$0;
            case 26:
                File file = (File) obj;
                synchronized (l18.e) {
                    l18.d.remove(file.getAbsolutePath());
                }
                return Unit.a;
            case 27:
                z41 z41Var = (z41) obj;
                g7h g7hVar = (g7h) z41Var.c;
                mi3 mi3Var = (mi3) z41Var.b;
                synchronized (g7hVar) {
                    ((LinkedHashSet) g7hVar.b).remove(mi3Var);
                }
                return Unit.a;
            case 28:
                ((t58) obj).a.await();
                return Unit.a;
            default:
                yzc yzcVar = ((FollowSubStagesViewModel) ((FollowSubStagesDialog) obj).v.getValue()).k;
                Map map = (tee) yzcVar.d();
                if (map == null) {
                    map = lm5.a;
                    map.getClass();
                }
                Collection values = map.values();
                if (!(values instanceof Collection) || !values.isEmpty()) {
                    Iterator it = values.iterator();
                    while (it.hasNext()) {
                        if (!((Boolean) it.next()).booleanValue()) {
                            Set keySet = map.keySet();
                            c = sub.c(k13.r(keySet, 10));
                            if (c < 16) {
                                c = 16;
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap(c);
                            for (Object obj2 : keySet) {
                                ((Number) obj2).intValue();
                                linkedHashMap.put(obj2, Boolean.valueOf(!z));
                            }
                            yzcVar.j(l6g.X(linkedHashMap));
                            return Unit.a;
                        }
                    }
                }
                z = true;
                Set keySet2 = map.keySet();
                c = sub.c(k13.r(keySet2, 10));
                if (c < 16) {
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(c);
                while (r1.hasNext()) {
                }
                yzcVar.j(l6g.X(linkedHashMap2));
                return Unit.a;
        }
    }
}
