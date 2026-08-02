package defpackage;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.sofascore.model.Sports;
import com.sofascore.model.cuptree.CupTreesResponse;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.newNetwork.WSCGameData;
import com.sofascore.results.event.boxscoreAnimation.EventBoxScoreFragmentNew;
import com.sofascore.results.event.matches.EventMatchesFragment;
import com.sofascore.results.event.odds.additionalodds.AdditionalOddsFragment;
import com.sofascore.results.event.odds.eventrecomended.EventRecommendedOddsFragment;
import com.sofascore.results.event.odds.oddscomparison.AdditionalOddsComparisonFragment;
import com.sofascore.results.fantasy.teammanagement.transfers.review.FantasyTransfersReviewFragment;
import com.sofascore.results.fantasy.teammanagement.transfers.selectreplacement.FantasyTransfersSelectReplacementDialogFragment;
import com.sofascore.results.featureWalkthrough.FeatureWalkthroughFullScreenDialog;
import com.sofascore.results.featuredtournament.FeaturedTournamentFragment;
import com.sofascore.results.league.LeagueActivity;
import com.sofascore.results.mma.fighter.MmaFighterActivity;
import com.sofascore.results.mma.organisation.MmaOrganisationActivity;
import com.sofascore.results.onboarding.OnboardingViewModel;
import com.sofascore.results.player.PlayerActivity;
import com.sofascore.results.pots.mostAwards.bottomSheet.POTSPlayerAwardsBottomSheet;
import com.sofascore.results.profile.editor.ProfileEditorTournamentsModal;
import com.sofascore.results.team.TeamActivity;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class pi implements Function0 {
    public final /* synthetic */ int a;
    public final Object b;
    public final /* synthetic */ Object c;

    public pi(zg9 zg9Var, eh9 eh9Var) {
        this.a = 15;
        this.c = zg9Var;
        this.b = eh9Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        y74 y74Var;
        tp5 tp5Var;
        int i = this.a;
        int i2 = 1;
        int i3 = 0;
        IOException iOException = null;
        iOException = null;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ly3 defaultViewModelCreationExtras = ((AdditionalOddsComparisonFragment) obj).getDefaultViewModelCreationExtras();
                defaultViewModelCreationExtras.getClass();
                return k53.B0(defaultViewModelCreationExtras, new oi((AdditionalOddsComparisonFragment) obj2, i3));
            case 1:
                ly3 defaultViewModelCreationExtras2 = ((AdditionalOddsFragment) obj).getDefaultViewModelCreationExtras();
                defaultViewModelCreationExtras2.getClass();
                return k53.B0(defaultViewModelCreationExtras2, new oi((AdditionalOddsFragment) obj2, i2));
            case 2:
                long currentTimeMillis = System.currentTimeMillis();
                boh bohVar = (boh) obj;
                if (currentTimeMillis - bohVar.h() >= 200) {
                    bohVar.i(currentTimeMillis);
                    ((f31) obj2).b();
                }
                return Unit.a;
            case 3:
                ((Function1) obj).invoke(((y83) obj2).c);
                return Unit.a;
            case 4:
                ((Function1) obj).invoke(Integer.valueOf(((kfk) obj2).a));
                return Unit.a;
            case 5:
                gv9 gv9Var = ((gj5) obj).u;
                if (gv9Var != null && (y74Var = ((pj5) obj2).q) != null) {
                    y74Var.invoke(gv9Var);
                }
                return Unit.a;
            case 6:
                long currentTimeMillis2 = System.currentTimeMillis();
                boh bohVar2 = (boh) obj;
                if (currentTimeMillis2 - bohVar2.h() >= 200) {
                    bohVar2.i(currentTimeMillis2);
                    FragmentActivity fragmentActivity = (FragmentActivity) obj2;
                    if (fragmentActivity != null) {
                        st7 st7Var = st7.a;
                        FeatureWalkthroughFullScreenDialog featureWalkthroughFullScreenDialog = new FeatureWalkthroughFullScreenDialog();
                        featureWalkthroughFullScreenDialog.setArguments(hz8.E(new Pair("TYPE", st7.e)));
                        featureWalkthroughFullScreenDialog.p(fragmentActivity.k(), "FeatureWalkthroughFullScreenDialog");
                    }
                }
                return Unit.a;
            case 7:
                ly3 defaultViewModelCreationExtras3 = ((EventBoxScoreFragmentNew) obj).getDefaultViewModelCreationExtras();
                defaultViewModelCreationExtras3.getClass();
                return k53.B0(defaultViewModelCreationExtras3, new oi((EventBoxScoreFragmentNew) obj2, 5));
            case 8:
                ly3 defaultViewModelCreationExtras4 = ((EventMatchesFragment) obj).getDefaultViewModelCreationExtras();
                defaultViewModelCreationExtras4.getClass();
                return k53.B0(defaultViewModelCreationExtras4, new oi((EventMatchesFragment) obj2, 6));
            case 9:
                ly3 defaultViewModelCreationExtras5 = ((EventRecommendedOddsFragment) obj).getDefaultViewModelCreationExtras();
                defaultViewModelCreationExtras5.getClass();
                return k53.B0(defaultViewModelCreationExtras5, new oi((EventRecommendedOddsFragment) obj2, 7));
            case 10:
                kj7 kj7Var = (kj7) obj2;
                ((Function2) obj).invoke(Integer.valueOf(kj7Var.a.a), Integer.valueOf(kj7Var.b));
                return Unit.a;
            case 11:
                FragmentActivity requireActivity = ((FantasyTransfersReviewFragment) obj).requireActivity();
                requireActivity.getClass();
                return hkg.D(requireActivity, ((d6d) ((mqi) obj2).getValue()).h.l);
            case 12:
                FragmentActivity requireActivity2 = ((FantasyTransfersSelectReplacementDialogFragment) obj).requireActivity();
                requireActivity2.getClass();
                return hkg.D(requireActivity2, ((d6d) ((mqi) obj2).getValue()).h.l);
            case 13:
                FeaturedTournamentFragment featuredTournamentFragment = (FeaturedTournamentFragment) obj;
                featuredTournamentFragment.t(featuredTournamentFragment.E(), new j87(18, (CupTreesResponse) obj2, featuredTournamentFragment));
                return Unit.a;
            case 14:
                Context context = (Context) obj2;
                if (obj instanceof Team) {
                    Set set = wyh.a;
                    Team team = (Team) obj;
                    if (wyh.m(team.getSportSlug())) {
                        joa joaVar = l5i.a;
                        l5i.k(context, team.getType(), team.getId());
                    } else if (Intrinsics.c(team.getSportSlug(), Sports.MMA)) {
                        int i4 = MmaFighterActivity.U;
                        f7a.x(team.getId(), context);
                    } else {
                        int i5 = TeamActivity.Z;
                        jle.r((Context) obj2, team.getId(), null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                    }
                } else if (obj instanceof Player) {
                    int i6 = PlayerActivity.Z;
                    jle.q((Context) obj2, ((Player) obj).getId(), 0, null, null, false, null, null, IronSourceError.ERROR_CODE_INIT_FAILED);
                } else if (obj instanceof UniqueTournament) {
                    UniqueTournament uniqueTournament = (UniqueTournament) obj;
                    if (Intrinsics.c(uniqueTournament.getCategory().getSport().getSlug(), Sports.MMA)) {
                        int i7 = MmaOrganisationActivity.T;
                        inb.F(uniqueTournament.getId(), context);
                    } else {
                        a99.A(LeagueActivity.h0, (Context) obj2, Integer.valueOf(uniqueTournament.getId()), Integer.valueOf(uniqueTournament.getId()), null, null, null, null, 4088);
                    }
                }
                return Unit.a;
            case 15:
                zg9 zg9Var = (zg9) obj2;
                eh9 eh9Var = (eh9) obj;
                tp5 tp5Var2 = tp5.INTERNAL_ERROR;
                try {
                } catch (IOException e) {
                    iOException = e;
                    tp5Var = tp5Var2;
                } catch (Throwable th) {
                    th = th;
                    tp5Var = tp5Var2;
                    zg9Var.e(tp5Var, tp5Var2, iOException);
                    wol.b(eh9Var);
                    throw th;
                }
                if (!eh9Var.e(true, this)) {
                    throw new IOException("Required SETTINGS preface not received");
                }
                while (eh9Var.e(false, this)) {
                }
                tp5Var = tp5.NO_ERROR;
                try {
                    try {
                        zg9Var.e(tp5Var, tp5.CANCEL, null);
                    } catch (IOException e2) {
                        iOException = e2;
                        tp5 tp5Var3 = tp5.PROTOCOL_ERROR;
                        zg9Var.e(tp5Var3, tp5Var3, iOException);
                        wol.b(eh9Var);
                        return Unit.a;
                    }
                    wol.b(eh9Var);
                    return Unit.a;
                } catch (Throwable th2) {
                    th = th2;
                    zg9Var.e(tp5Var, tp5Var2, iOException);
                    wol.b(eh9Var);
                    throw th;
                }
            case 16:
                int i8 = PlayerActivity.Z;
                Context context2 = (Context) obj;
                Integer num = ((u75) obj2).a;
                jle.q(context2, num != null ? num.intValue() : -1, 0, null, null, false, null, null, IronSourceError.ERROR_CODE_INIT_FAILED);
                return Unit.a;
            case 17:
                int i9 = PlayerActivity.Z;
                Context context3 = (Context) obj;
                Integer num2 = ((w75) obj2).a;
                jle.q(context3, num2 != null ? num2.intValue() : -1, 0, null, null, false, null, null, IronSourceError.ERROR_CODE_INIT_FAILED);
                return Unit.a;
            case 18:
                ((Function1) obj).invoke(new rya(((u2f) obj2).a));
                return Unit.a;
            case 19:
                o4b o4bVar = (o4b) obj2;
                m4b m4bVar = (m4b) obj;
                int i10 = m4bVar.a;
                y3b y3bVar = m4bVar.b;
                x3b x3bVar = m4bVar.d;
                e4b e4bVar = new e4b(i10, x3bVar != null ? Integer.valueOf(x3bVar.a) : null, o4bVar.i(), y3bVar, m4bVar.g, o4bVar.l);
                o4bVar.m = e4bVar;
                return e4bVar;
            case 20:
                Context context4 = (Context) obj;
                WSCGameData game = ((o5c) obj2).a.getGame();
                Integer valueOf = game != null ? Integer.valueOf(game.getEventId()) : null;
                ia9 ia9Var = ia9.MEDIA;
                zu[] zuVarArr = zu.a;
                nv.B0(context4, valueOf, ia9Var);
                return Unit.a;
            case 21:
                Context context5 = (Context) obj;
                WSCGameData game2 = ((n5c) obj2).a.getGame();
                Integer valueOf2 = game2 != null ? Integer.valueOf(game2.getEventId()) : null;
                ia9 ia9Var2 = ia9.MEDIA;
                zu[] zuVarArr2 = zu.a;
                nv.B0(context5, valueOf2, ia9Var2);
                return Unit.a;
            case 22:
                ((Function1) obj).invoke(new pgd((fhd) obj2));
                return Unit.a;
            case 23:
                return new qsd(((OnboardingViewModel) obj).m, (String) obj2);
            case 24:
                lue lueVar = ((v1e) obj).l;
                q1e q1eVar = (q1e) obj2;
                p1e p1eVar = q1eVar.b;
                o1e o1eVar = p1eVar instanceof o1e ? (o1e) p1eVar : null;
                return new i1e(lueVar, o1eVar != null ? o1eVar.a : null, q1eVar.c);
            case 25:
                int i11 = PlayerActivity.Z;
                POTSPlayerAwardsBottomSheet pOTSPlayerAwardsBottomSheet = (POTSPlayerAwardsBottomSheet) obj;
                Context requireContext = pOTSPlayerAwardsBottomSheet.requireContext();
                requireContext.getClass();
                n2e n2eVar = (n2e) obj2;
                jle.q(requireContext, ((r2e) pOTSPlayerAwardsBottomSheet.C.getValue()).g, n2eVar.a, Integer.valueOf(n2eVar.e), zxe.d, false, null, null, 480);
                return Unit.a;
            case 26:
                a3e a3eVar = (a3e) obj2;
                ((Function1) obj).invoke(new v2e(a3eVar.a, a3eVar.b));
                return Unit.a;
            case 27:
                a99.A(LeagueActivity.h0, (Context) obj, Integer.valueOf(((ri5) obj2).a), 0, null, null, null, null, 4088);
                return Unit.a;
            case 28:
                a99 a99Var = LeagueActivity.h0;
                Context requireContext2 = ((ProfileEditorTournamentsModal) obj).requireContext();
                requireContext2.getClass();
                a99.A(a99Var, requireContext2, Integer.valueOf(((ri5) obj2).a), 0, null, null, null, null, 4088);
                return Unit.a;
            default:
                vt2 vt2Var = (vt2) obj;
                if (vt2Var.c) {
                    ((Function1) obj2).invoke(vt2Var.a);
                }
                return Unit.a;
        }
    }

    public /* synthetic */ pi(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
