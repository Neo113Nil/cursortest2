package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.blaze.blazesdk.custom_views.BlazeTextView;
import com.blaze.blazesdk.custom_views.BlazeTextWithIconButton;
import com.blaze.blazesdk.first_time_slide.ui.FirstTimeSlideCustomView;
import com.sofascore.model.fantasy.FantasyCompetitionType;
import com.sofascore.model.fantasy.FantasyPlayerPriceChanges;
import com.sofascore.results.R;
import com.sofascore.results.dialog.AdditionalOddsModal;
import com.sofascore.results.event.odds.model.OddsEventUIModel;
import com.sofascore.results.fantasy.teammanagement.substitutions.FantasySubstitutionsActivity;
import com.sofascore.results.fantasy.teammanagement.transfers.FantasyTransfersActivity;
import com.sofascore.results.fantasy.walkthrough.createteam.FantasyWalkthroughCreateTeamFragment;
import com.sofascore.results.featuredtournament.FeaturedTournamentFragment;
import com.sofascore.results.feed.FeedFragment;
import com.sofascore.results.feed.compose.model.FeedbackType;
import com.sofascore.results.league.LeagueActivity;
import com.sofascore.results.player.PlayerActivity;
import com.sofascore.results.team.TeamActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class n37 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n37(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        float f;
        int i = this.a;
        int i2 = 3;
        int i3 = 0;
        rq3 rq3Var = null;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                j67 j67Var = (j67) obj2;
                Function1 function1 = (Function1) obj;
                if (j67Var != null) {
                    function1.invoke(j67Var);
                }
                return Unit.a;
            case 1:
                ((Function1) obj).invoke(((f57) obj2).a);
                return Unit.a;
            case 2:
                f57 f57Var = (f57) obj;
                ((Function2) obj2).invoke(f57Var.a, f57Var.b);
                return Unit.a;
            case 3:
                h67 h67Var = (h67) obj2;
                xw3.L(un0.z(h67Var), null, null, new t3(h67Var, ((t57) ((w57) obj)).a, rq3Var, 9), 3);
                return Unit.a;
            case 4:
                ((Function1) obj).invoke((FantasyCompetitionType) obj2);
                return Unit.a;
            case 5:
                y97 y97Var = (y97) obj;
                ((ct8) obj2).invoke(y97Var.a, y97Var.b, y97Var.c);
                return Unit.a;
            case 6:
                ((Function1) obj).invoke(((z97) obj2).a);
                return Unit.a;
            case 7:
                ((Function1) obj).invoke((ja7) obj2);
                return Unit.a;
            case 8:
                gc7 gc7Var = (gc7) obj;
                nv.A((Context) obj2, "optimise_lineup", null);
                xw3.L(un0.z(gc7Var), null, null, new fc7(gc7Var, rq3Var, i3), 3);
                return Unit.a;
            case 9:
                xnh xnhVar = (xnh) obj;
                if (((ksa) obj2).h() == 0) {
                    float i4 = r0.i() / xnhVar.h();
                    if (i4 > 1.0f) {
                        i4 = 1.0f;
                    }
                    f = 1.0f - i4;
                } else {
                    f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                }
                return Float.valueOf(f);
            case 10:
                ((Function1) obj).invoke(Integer.valueOf(((FantasyPlayerPriceChanges) obj2).getPlayerId()));
                return Unit.a;
            case 11:
                Context context = (Context) obj2;
                int i5 = ((az6) obj).f.c;
                nj7[] nj7VarArr = nj7.a;
                nv.A(context, "open_rules", null);
                StringBuilder sb = new StringBuilder("https://www.sofascore.com/fantasy/rules");
                sb.append("?competitionId=" + i5);
                sb.append("#scoring");
                p4h.w(context, sb.toString());
                return Unit.a;
            case 12:
                ((Function1) obj).invoke((tf7) obj2);
                return Unit.a;
            case 13:
                ((Function1) obj).invoke(Integer.valueOf(((mj7) obj2).a));
                return Unit.a;
            case 14:
                z8e.z((px0) obj2, ((FantasySubstitutionsActivity) obj).getOnBackPressedDispatcher());
                return Unit.a;
            case 15:
                Context context2 = (Context) obj2;
                nv.A(context2, "open_team", null);
                int i6 = TeamActivity.Z;
                jle.r(context2, ((zwi) obj).a.a, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                return Unit.a;
            case 16:
                ((Function1) obj).invoke((vl7) obj2);
                return Unit.a;
            case 17:
                Context context3 = (Context) obj2;
                dm7 dm7Var = (dm7) obj;
                nv.A(context3, "open_player", null);
                int i7 = PlayerActivity.Z;
                jle.q(context3, dm7Var.b, 0, null, null, false, Integer.valueOf(dm7Var.h), null, 444);
                return Unit.a;
            case 18:
                Function1 function12 = (Function1) obj;
                kj7 kj7Var = (kj7) obj2;
                if (function12 != null) {
                    function12.invoke(kj7Var);
                }
                return Unit.a;
            case 19:
                z8e.z((px0) obj2, ((FantasyTransfersActivity) obj).getOnBackPressedDispatcher());
                return Unit.a;
            case 20:
                Context context4 = (Context) obj2;
                int i8 = ((ao7) obj).g.c;
                nj7[] nj7VarArr2 = nj7.a;
                context4.getClass();
                nv.A(context4, "open_rules", null);
                StringBuilder sb2 = new StringBuilder("https://www.sofascore.com/fantasy/rules");
                sb2.append("?competitionId=" + i8);
                sb2.append("#transfers");
                p4h.w(context4, sb2.toString());
                return Unit.a;
            case 21:
                Context context5 = (Context) obj2;
                int i9 = ((po7) ((ro7) obj)).a.c.c;
                nj7[] nj7VarArr3 = nj7.a;
                context5.getClass();
                nv.A(context5, "open_rules", null);
                StringBuilder sb3 = new StringBuilder("https://www.sofascore.com/fantasy/rules");
                sb3.append("?competitionId=" + i9);
                sb3.append("#scoring");
                p4h.w(context5, sb3.toString());
                return Unit.a;
            case 22:
                FantasyWalkthroughCreateTeamFragment fantasyWalkthroughCreateTeamFragment = (FantasyWalkthroughCreateTeamFragment) obj2;
                Context requireContext = fantasyWalkthroughCreateTeamFragment.requireContext();
                requireContext.getClass();
                nv.A(requireContext, "discard_team", null);
                z8e.z((px0) obj, fantasyWalkthroughCreateTeamFragment.requireActivity().getOnBackPressedDispatcher());
                return Unit.a;
            case 23:
                ((Function1) obj).invoke(((qp7) obj2).g ? yo7.a : xo7.a);
                return Unit.a;
            case 24:
                Window window = (Window) obj2;
                bka bkaVar = new bka((View) obj);
                int i10 = Build.VERSION.SDK_INT;
                (i10 >= 35 ? new aal(window, bkaVar) : i10 >= 30 ? new z9l(window, bkaVar) : new y9l(window, bkaVar)).C(false);
                return Unit.a;
            case 25:
                Context context6 = (Context) obj2;
                OddsEventUIModel oddsEventUIModel = (OddsEventUIModel) obj;
                oddsEventUIModel.getClass();
                AdditionalOddsModal additionalOddsModal = new AdditionalOddsModal();
                additionalOddsModal.setArguments(fz8.C(fz8.F("ARG_EVENT", oddsEventUIModel)));
                if (context6 instanceof csk) {
                    context6 = ((csk) context6).getBaseContext();
                }
                AppCompatActivity appCompatActivity = context6 instanceof AppCompatActivity ? (AppCompatActivity) context6 : null;
                if (appCompatActivity != null) {
                    wca.x(appCompatActivity.getLifecycle()).b(new r1(additionalOddsModal, appCompatActivity, rq3Var, i2));
                }
                return Unit.a;
            case 26:
                a99 a99Var = LeagueActivity.h0;
                Context requireContext2 = ((FeaturedTournamentFragment) obj2).requireContext();
                requireContext2.getClass();
                ((qv7) obj).getClass();
                boj bojVar = boj.PLAYERS;
                a99.A(a99Var, requireContext2, 270, null, null, null, null, null, 4024);
                return Unit.a;
            case 27:
                my7 C = ((FeedFragment) obj2).C();
                Set<FeedbackType> set = ((gy7) obj).a;
                set.getClass();
                for (FeedbackType feedbackType : set) {
                    nv.Y(C.f, feedbackType.c, kv.FEEDBACK, feedbackType.e, null, feedbackType.d, feedbackType.f, 16);
                }
                return Unit.a;
            case 28:
                FirstTimeSlideCustomView firstTimeSlideCustomView = (FirstTimeSlideCustomView) obj;
                int i11 = FirstTimeSlideCustomView.d;
                View inflate = LayoutInflater.from((Context) obj2).inflate(R.layout.blaze_layout_player_first_time_slide, (ViewGroup) firstTimeSlideCustomView, false);
                firstTimeSlideCustomView.addView(inflate);
                int i12 = R.id.blaze_firstTimeSlideCtaButton;
                BlazeTextWithIconButton blazeTextWithIconButton = (BlazeTextWithIconButton) nq8.B(R.id.blaze_firstTimeSlideCtaButton, inflate);
                if (blazeTextWithIconButton != null) {
                    i12 = R.id.blaze_firstTimeSlideItemsRV;
                    RecyclerView recyclerView = (RecyclerView) nq8.B(R.id.blaze_firstTimeSlideItemsRV, inflate);
                    if (recyclerView != null) {
                        i12 = R.id.blaze_firstTimeSlideMainTitle;
                        BlazeTextView blazeTextView = (BlazeTextView) nq8.B(R.id.blaze_firstTimeSlideMainTitle, inflate);
                        if (blazeTextView != null) {
                            i12 = R.id.blaze_firstTimeSlideSubTitle;
                            BlazeTextView blazeTextView2 = (BlazeTextView) nq8.B(R.id.blaze_firstTimeSlideSubTitle, inflate);
                            if (blazeTextView2 != null) {
                                return new kkm((ConstraintLayout) inflate, blazeTextWithIconButton, recyclerView, blazeTextView, blazeTextView2);
                            }
                        }
                    }
                }
                yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i12)));
                return null;
            default:
                ((fsf) obj2).a = tgj.x((se8) obj, tge.a);
                return Unit.a;
        }
    }

    public /* synthetic */ n37(int i, Object obj, Function1 function1) {
        this.a = i;
        this.b = function1;
        this.c = obj;
    }
}
