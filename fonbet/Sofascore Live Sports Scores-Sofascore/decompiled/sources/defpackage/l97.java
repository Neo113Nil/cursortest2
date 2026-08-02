package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.sofascore.local_persistance.Brand;
import com.sofascore.model.branding.BrandLocation;
import com.sofascore.model.branding.BrandType;
import com.sofascore.model.chat.TournamentSeasonPair;
import com.sofascore.model.database.VoteType;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.MmaEvent;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.StageType;
import com.sofascore.model.mvvm.model.Tournament;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.newNetwork.PredictedEvent;
import com.sofascore.model.newNetwork.Vote;
import com.sofascore.model.odds.FeaturedOddsWithProvider;
import com.sofascore.model.profile.VoteStatistics;
import com.sofascore.results.R;
import com.sofascore.results.bettingtips.BettingTipsActivity;
import com.sofascore.results.chat.ChatActivity;
import com.sofascore.results.event.details.view.promotion.PromotionBannerView;
import com.sofascore.results.event.odds.model.OddsEventUIModel;
import com.sofascore.results.event.statistics.view.football.FootballShotmapView;
import com.sofascore.results.fantasy.transfers.FantasyTransferHistoryBottomSheet;
import com.sofascore.results.fantasy.walkthrough.createteam.FantasyWalkthroughCreateTeamFragment;
import com.sofascore.results.featuredtournament.view.FeaturedTournamentOddsView;
import com.sofascore.results.league.LeagueActivity;
import com.sofascore.results.mma.fighter.details.MmaFighterRankingsModal;
import com.sofascore.results.onboarding.OnboardingViewModel;
import com.sofascore.results.profile.predictions.CorrectPredictionsModal;
import com.sofascore.results.profile.view.ProfilePredictionStatisticsView;
import com.sofascore.results.sofaSeason.SofaSeasonActivity;
import com.sofascore.results.view.follownotification.NotificationsActionButton;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class l97 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ l97(i73 i73Var, Function1 function1, e93 e93Var) {
        this.a = 27;
        this.b = i73Var;
        this.d = function1;
        this.c = e93Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str;
        String a;
        int i = this.a;
        int i2 = 17;
        int i3 = 1;
        int i4 = 3;
        rq3 rq3Var = null;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                Function1 function1 = (Function1) obj;
                ((t97) obj3).k(null);
                ev6 ev6Var = ((pb7) ((wb7) obj2).k.a.getValue()).f;
                if (ev6Var != null) {
                    function1.invoke(Integer.valueOf(ev6Var.c));
                }
                break;
            case 1:
                Context context = (Context) obj3;
                ao7 ao7Var = (ao7) obj2;
                e1d e1dVar = (e1d) obj;
                if (((vn7) e1dVar.getValue()).l >= 0 || ((vn7) e1dVar.getValue()).g) {
                    ao7Var.t();
                } else {
                    String string = context.getString(R.string.fantasy_confirm_addition_transfers_title);
                    string.getClass();
                    String string2 = context.getString(R.string.fantasy_confirm_addition_transfers_body);
                    string2.getClass();
                    String quantityString = context.getResources().getQuantityString(R.plurals.fantasy_confirm_addition_transfers_body_1, ((vn7) e1dVar.getValue()).l, Integer.valueOf(((vn7) e1dVar.getValue()).l));
                    String string3 = context.getString(R.string.confirm);
                    string3.getClass();
                    zic.O(context, string, string2, string3, R.color.primary_default, quantityString, new av6(0, ao7Var, ao7.class, "confirmTransfers", "confirmTransfers()V", 0, 22));
                }
                break;
            case 2:
                String str2 = (String) obj2;
                ro7 ro7Var = (ro7) obj;
                FragmentActivity O = hkg.O((Context) obj3);
                if (O != null) {
                    int i5 = ((po7) ro7Var).a.c.c;
                    str2.getClass();
                    FantasyTransferHistoryBottomSheet fantasyTransferHistoryBottomSheet = new FantasyTransferHistoryBottomSheet();
                    Bundle bundle = new Bundle();
                    bundle.putString("USER_ID_EXTRA", str2);
                    bundle.putInt("competitionId", i5);
                    fantasyTransferHistoryBottomSheet.setArguments(bundle);
                    AppCompatActivity appCompatActivity = O instanceof AppCompatActivity ? (AppCompatActivity) O : null;
                    if (appCompatActivity != null) {
                        wca.x(appCompatActivity.getLifecycle()).b(new r1(fantasyTransferHistoryBottomSheet, appCompatActivity, rq3Var, i4));
                    }
                }
                break;
            case 3:
                List list = (List) obj2;
                FantasyWalkthroughCreateTeamFragment fantasyWalkthroughCreateTeamFragment = (FantasyWalkthroughCreateTeamFragment) obj;
                Context context2 = ((ComposeView) obj3).getContext();
                context2.getClass();
                FragmentActivity K = hkg.K(context2);
                if (K != null) {
                    Intent intent = new Intent();
                    intent.putParcelableArrayListExtra("squad", new ArrayList<>(list));
                    intent.putExtra("roundId", fantasyWalkthroughCreateTeamFragment.C().k().b);
                    Unit unit = Unit.a;
                    z8e.C(K, -1, intent);
                }
                break;
            case 4:
                vp7 vp7Var = (vp7) obj;
                nv.A((Context) obj3, "auto_select", null);
                ((Function0) obj2).invoke();
                vp7Var.getClass();
                xw3.L(un0.z(vp7Var), null, null, new zi7(vp7Var, rq3Var, i3), 3);
                break;
            case 5:
                Context context3 = (Context) obj3;
                OddsEventUIModel oddsEventUIModel = (OddsEventUIModel) obj2;
                ((Function1) obj).invoke(zkd.a);
                int i6 = BettingTipsActivity.Q;
                context3.startActivity(tol.w(context3, Integer.valueOf(oddsEventUIModel.a), oddsEventUIModel.c));
                break;
            case 6:
                Event event = (Event) obj2;
                FeaturedOddsWithProvider featuredOddsWithProvider = (FeaturedOddsWithProvider) obj;
                int i7 = FeaturedTournamentOddsView.d;
                Context context4 = ((FeaturedTournamentOddsView) obj3).getContext();
                context4.getClass();
                nv.c0(context4, event.getStatus().getType(), featuredOddsWithProvider.getCountryProvider(), featuredOddsWithProvider.getFeaturedOdds().getMarketName(), event.getId(), vmd.FEATURED_TOURNAMENT, null);
                break;
            case 7:
                Integer num = (Integer) obj3;
                FootballShotmapView footballShotmapView = (FootballShotmapView) obj2;
                wk8 wk8Var = (wk8) obj;
                if (num != null) {
                    int intValue = num.intValue();
                    Context context5 = footballShotmapView.getContext();
                    context5.getClass();
                    nv.D(context5, intValue, "shot_click", wk8Var.l);
                }
                break;
            case 8:
                View view = (View) obj;
                ((asf) obj3).a = true;
                View.OnLayoutChangeListener onLayoutChangeListener = (View.OnLayoutChangeListener) ((fsf) obj2).a;
                if (onLayoutChangeListener != null) {
                    view.removeOnLayoutChangeListener(onLayoutChangeListener);
                }
                break;
            case 9:
                ConnectivityManager connectivityManager = (ConnectivityManager) obj2;
                c2a c2aVar = (c2a) obj;
                if (((asf) obj3).a) {
                    rik o = rik.o();
                    int i8 = kbl.a;
                    o.getClass();
                    connectivityManager.unregisterNetworkCallback(c2aVar);
                }
                break;
            case 10:
                break;
            case 11:
                ksa ksaVar = (ksa) obj2;
                rra rraVar = (rra) ((ay4) obj3).getValue();
                break;
            case 12:
                LeagueActivity leagueActivity = (LeagueActivity) obj3;
                Tournament tournament = (Tournament) obj2;
                Season season = (Season) obj;
                a99 a99Var = LeagueActivity.h0;
                if (leagueActivity.S().l.getCurrentItem() == 0) {
                    tu[] tuVarArr = tu.a;
                    str = "bubble";
                } else {
                    tu[] tuVarArr2 = tu.a;
                    str = "bubble_other_tab";
                }
                int i9 = ChatActivity.Z;
                UniqueTournament uniqueTournament = tournament.getUniqueTournament();
                uic.w(leagueActivity, new TournamentSeasonPair(uniqueTournament != null ? uniqueTournament.getId() : 0, tba.w(tournament), season, tournament.getCategory().getSport().getSlug()), str, 56);
                break;
            case 13:
                MmaEvent mmaEvent = (MmaEvent) obj3;
                xvb xvbVar = (xvb) obj2;
                String str3 = (String) obj;
                Gender gender = mmaEvent.getGender();
                if (gender != null) {
                    Context context6 = xvbVar.getContext();
                    context6.getClass();
                    UniqueTournament uniqueTournament2 = mmaEvent.getTournament().getUniqueTournament();
                    r4 = uniqueTournament2 != null ? uniqueTournament2.getId() : 0;
                    Context context7 = xvbVar.getContext();
                    context7.getClass();
                    String q = tnf.q(context7, str3);
                    MmaFighterRankingsModal mmaFighterRankingsModal = new MmaFighterRankingsModal();
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("UNIQUE_TOURNAMENT_ID", r4);
                    bundle2.putString("WEIGHT_CLASS", str3);
                    bundle2.putSerializable("GENDER", gender);
                    bundle2.putString(NativeAdContent.ViewTag.AD_TITLE, q);
                    mmaFighterRankingsModal.setArguments(bundle2);
                    if (context6 instanceof csk) {
                        context6 = ((csk) context6).getBaseContext();
                    }
                    AppCompatActivity appCompatActivity2 = context6 instanceof AppCompatActivity ? (AppCompatActivity) context6 : null;
                    if (appCompatActivity2 != null) {
                        wca.x(appCompatActivity2.getLifecycle()).b(new r1(mmaFighterRankingsModal, appCompatActivity2, rq3Var, i4));
                    }
                }
                break;
            case 14:
                nv.q((Context) obj3, Integer.valueOf(((mwb) obj2).a), BrandLocation.MatchOfTheWeek, ((Brand) obj).getSlug(), BrandType.BANNER);
                break;
            case 15:
                ku3 ku3Var = (ku3) obj2;
                dfh dfhVar = (dfh) obj;
                if (((Boolean) ((Function1) ((dfh) obj3).d.b).invoke(efh.b)).booleanValue()) {
                    xw3.L(ku3Var, null, null, new u87(dfhVar, rq3Var, 10), 3);
                }
                break;
            case 16:
                Function0 function0 = (Function0) obj;
                int size = ((ArrayList) obj3).size() - ((trg) obj2).a().size();
                while (r4 < size) {
                    function0.invoke();
                    r4++;
                }
                break;
            case 17:
                NotificationsActionButton notificationsActionButton = (NotificationsActionButton) obj3;
                Stage stage = (Stage) obj2;
                int i10 = NotificationsActionButton.g;
                Context context8 = notificationsActionButton.getContext();
                context8.getClass();
                nv.y(context8, vu.MUTE_NOTIFICATION, xu.STAGE, stage.getId(), notificationsActionButton.getFollowSource());
                Context context9 = notificationsActionButton.getContext();
                context9.getClass();
                u0a.I(stage.getId(), context9);
                ((HashSet) obj).add(StageType.MUTED);
                notificationsActionButton.setState(jb.Muted);
                break;
            case 18:
                OnboardingViewModel onboardingViewModel = (OnboardingViewModel) obj2;
                c6d c6dVar = (c6d) obj;
                int i11 = ((ysd) obj3).a;
                zic zicVar = xsd.c;
                if (i11 == 1) {
                    onboardingViewModel.x(new brd(zsd.GetStarted));
                    o13.E(c6dVar);
                    c6dVar.a.add(jsd.INSTANCE);
                }
                break;
            case 19:
                vu8 vu8Var = (vu8) obj3;
                mlh mlhVar = (mlh) obj2;
                dvd dvdVar = (dvd) obj;
                if (vu8Var != null) {
                    mlhVar.a(mlhVar.c(vu8Var) - mlhVar.t);
                }
                List w = v9g.w(mlhVar, null, mlhVar.t, null);
                ef3 ef3Var = (ef3) CollectionsKt.j0(w);
                Integer num2 = ef3Var != null ? ef3Var.b : null;
                List i12 = dvdVar.i(num2);
                if (num2 != null && !i12.isEmpty()) {
                    i12 = CollectionsKt.w0(CollectionsKt.S(i12, 1), a.c(new ef3(((ef3) CollectionsKt.Y(i12)).a, null, num2)));
                }
                break;
            case 20:
                StringBuilder sb = new StringBuilder("Attempting to assign conflicting values '");
                sb.append(obj3);
                sb.append("' and '");
                sb.append(obj2);
                sb.append("' to field '");
                break;
            case 21:
                VoteStatistics voteStatistics = (VoteStatistics) obj2;
                String str4 = (String) obj;
                int i13 = ProfilePredictionStatisticsView.c;
                Context context10 = ((l2d) obj3).getContext();
                if (context10 != null) {
                    if (str4 == null) {
                        str4 = "";
                    }
                    voteStatistics.getClass();
                    CorrectPredictionsModal correctPredictionsModal = new CorrectPredictionsModal();
                    correctPredictionsModal.setArguments(fz8.C(fz8.G("VOTE_STATISTICS", voteStatistics), fz8.H("ANALYTICS_TYPE", str4)));
                    if (context10 instanceof csk) {
                        context10 = ((csk) context10).getBaseContext();
                    }
                    AppCompatActivity appCompatActivity3 = context10 instanceof AppCompatActivity ? (AppCompatActivity) context10 : null;
                    if (appCompatActivity3 != null) {
                        wca.x(appCompatActivity3.getLifecycle()).b(new r1(correctPredictionsModal, appCompatActivity3, rq3Var, i4));
                    }
                }
                break;
            case 22:
                maf mafVar = (maf) obj2;
                PredictedEvent predictedEvent = (PredictedEvent) obj;
                VoteType voteType = ((Vote) obj3).getVoteType();
                if (voteType != null) {
                    ((Function2) mafVar.g).invoke(Integer.valueOf(predictedEvent.getId()), voteType);
                }
                break;
            case 23:
                PromotionBannerView promotionBannerView = (PromotionBannerView) obj3;
                int i14 = PromotionBannerView.t;
                Context context11 = promotionBannerView.getContext();
                context11.getClass();
                nv.p0(context11, (fv) obj2, (String) obj, "banner", promotionBannerView.o);
                break;
            case 24:
                PromotionBannerView promotionBannerView2 = (PromotionBannerView) obj3;
                bef befVar = (bef) obj;
                int i15 = PromotionBannerView.t;
                Context context12 = promotionBannerView2.getContext();
                context12.getClass();
                nv.o0(context12, (fv) obj2, befVar.b, "banner", promotionBannerView2.o);
                Function0 function02 = promotionBannerView2.s;
                if (function02 != null) {
                    function02.invoke();
                } else {
                    Context context13 = promotionBannerView2.getContext();
                    context13.getClass();
                    String str5 = befVar.d;
                    if (str5 == null) {
                        str5 = promotionBannerView2.k;
                    }
                    bea.G(context13, str5);
                }
                break;
            case 25:
                ghf ghfVar = (ghf) obj3;
                csf csfVar = (csf) obj2;
                csf csfVar2 = (csf) obj;
                boolean b = ghfVar.b();
                ku3 ku3Var2 = ghfVar.a;
                xnh xnhVar = ghfVar.h;
                int i16 = 2;
                if (b) {
                    ((eoh) ghfVar.d).setValue(Boolean.FALSE);
                    xnh xnhVar2 = ghfVar.f;
                    float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    xnhVar2.i(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    xw3.L(ku3Var2, null, null, new we3(ghfVar, f, rq3Var, i16), 3);
                }
                ghfVar.g.i(csfVar.a);
                float f2 = csfVar2.a;
                if (xnhVar.h() != f2) {
                    xnhVar.i(f2);
                    if (ghfVar.b()) {
                        xw3.L(ku3Var2, null, null, new we3(ghfVar, f2, rq3Var, i16), 3);
                    }
                }
                break;
            case 26:
                xw3.L((ku3) obj3, null, null, new k50((Function2) obj2, (Function2) obj, rq3Var, i2), 3);
                break;
            case 27:
                Function1 function12 = (Function1) obj;
                e93 e93Var = (e93) obj2;
                n4 n4Var = ((i73) obj3).a;
                if (!(n4Var instanceof y63)) {
                    if (!(n4Var instanceof z63)) {
                        if (n4Var != null) {
                            zzl.b();
                            break;
                        } else {
                            function12.invoke(new exg(e93Var));
                        }
                    } else {
                        function12.invoke(new mxg(((z63) n4Var).b));
                    }
                } else {
                    function12.invoke(new hxg(((y63) n4Var).b));
                }
                break;
            case 28:
                rgh rghVar = (rgh) obj2;
                Function1 function13 = (Function1) obj;
                if (((n19) obj3) == n19.a) {
                    rghVar.f(new vbc(i2, function13));
                }
                break;
            default:
                Function0 function03 = (Function0) obj3;
                e1d e1dVar2 = (e1d) obj2;
                Context context14 = (Context) obj;
                int i17 = SofaSeasonActivity.L;
                tfi c = ((hth) e1dVar2.getValue()).c();
                if (c != null && (a = c.a()) != null) {
                    nv.r0(context14, iv.CLOSE, String.valueOf(((hth) e1dVar2.getValue()).b + 1), a);
                }
                function03.invoke();
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ l97(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ l97(Function1 function1, Context context, OddsEventUIModel oddsEventUIModel) {
        this.a = 5;
        this.d = function1;
        this.b = context;
        this.c = oddsEventUIModel;
    }
}
