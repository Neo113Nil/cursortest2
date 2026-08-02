package defpackage;

import android.content.Context;
import android.content.Intent;
import com.sofascore.model.Sports;
import com.sofascore.results.R;
import com.sofascore.results.featureWalkthrough.FeatureWalkthroughFullScreenDialog;
import com.sofascore.results.league.fragment.details.LeagueDetailsFragment;
import com.sofascore.results.view.FeaturedMatchView;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class wua implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LeagueDetailsFragment b;

    public /* synthetic */ wua(LeagueDetailsFragment leagueDetailsFragment, int i) {
        this.a = i;
        this.b = leagueDetailsFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        vt7 vt7Var = null;
        LeagueDetailsFragment leagueDetailsFragment = this.b;
        switch (i) {
            case 0:
                String sportSlug = leagueDetailsFragment.G().getSportSlug();
                sportSlug.getClass();
                if (sportSlug.equals(Sports.FOOTBALL)) {
                    vt7Var = ut7.a;
                } else if (sportSlug.equals(Sports.BASKETBALL)) {
                    vt7Var = tt7.a;
                }
                if (vt7Var != null) {
                    FeatureWalkthroughFullScreenDialog featureWalkthroughFullScreenDialog = new FeatureWalkthroughFullScreenDialog();
                    featureWalkthroughFullScreenDialog.setArguments(hz8.E(new Pair("TYPE", vt7Var.getKey())));
                    featureWalkthroughFullScreenDialog.p(leagueDetailsFragment.requireActivity().k(), "FeatureWalkthroughFullScreenDialog");
                }
                return Unit.a;
            case 1:
                ((dsi) leagueDetailsFragment.t.getValue()).f(y4b.g);
                return Unit.a;
            case 2:
                leagueDetailsFragment.H().s = false;
                return Unit.a;
            case 3:
                Context requireContext = leagueDetailsFragment.requireContext();
                requireContext.getClass();
                return new FeaturedMatchView(requireContext, null, 6);
            case 4:
                Context requireContext2 = leagueDetailsFragment.requireContext();
                requireContext2.getClass();
                leagueDetailsFragment.startActivity(Intent.createChooser(uic.u(requireContext2), leagueDetailsFragment.getString(R.string.vote_for_your_goat)));
                return Unit.a;
            case 5:
                return Boolean.valueOf(!Intrinsics.c(leagueDetailsFragment.G().getSportSlug(), Sports.TENNIS));
            case 6:
                Context requireContext3 = leagueDetailsFragment.requireContext();
                requireContext3.getClass();
                return new tua(requireContext3);
            case 7:
                return Boolean.valueOf(b.j(Sports.TENNIS, Sports.BASKETBALL).contains(leagueDetailsFragment.G().getSportSlug()));
            case 8:
                Context requireContext4 = leagueDetailsFragment.requireContext();
                requireContext4.getClass();
                return new qrj(requireContext4);
            default:
                return Boolean.valueOf(Intrinsics.c(leagueDetailsFragment.G().getSportSlug(), Sports.TENNIS));
        }
    }
}
