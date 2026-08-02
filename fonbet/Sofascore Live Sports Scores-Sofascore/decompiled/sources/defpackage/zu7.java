package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.sofascore.model.Sports;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.results.R;
import com.sofascore.results.ads.iml.banner.AdBannerView;
import com.sofascore.results.event.details.view.odds.GambleRegulationFooterView;
import com.sofascore.results.featureWalkthrough.FeatureWalkthroughFullScreenDialog;
import com.sofascore.results.featuredtournament.FeaturedTournamentFragment;
import com.sofascore.results.featuredtournament.view.PromotionalOffersBannerView;
import com.sofascore.results.view.CupTreeView;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class zu7 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FeaturedTournamentFragment b;

    public /* synthetic */ zu7(FeaturedTournamentFragment featuredTournamentFragment, int i) {
        this.a = i;
        this.b = featuredTournamentFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        boolean z = true;
        Boolean bool = null;
        FeaturedTournamentFragment featuredTournamentFragment = this.b;
        switch (i) {
            case 0:
                Context requireContext = featuredTournamentFragment.requireContext();
                requireContext.getClass();
                g6b lifecycle = featuredTournamentFragment.getLifecycle();
                lifecycle.getClass();
                return new yu7(requireContext, lifecycle);
            case 1:
                Set set = aef.a;
                Context requireContext2 = featuredTournamentFragment.requireContext();
                requireContext2.getClass();
                return Boolean.valueOf(aef.h(requireContext2));
            case 2:
                Context requireContext3 = featuredTournamentFragment.requireContext();
                requireContext3.getClass();
                return new PromotionalOffersBannerView(requireContext3, null, 6);
            case 3:
                Context requireContext4 = featuredTournamentFragment.requireContext();
                requireContext4.getClass();
                return new tv7(requireContext4);
            case 4:
                Context requireContext5 = featuredTournamentFragment.requireContext();
                requireContext5.getClass();
                return new CupTreeView(requireContext5, null, 6);
            case 5:
                ut7 ut7Var = ut7.a;
                FeatureWalkthroughFullScreenDialog featureWalkthroughFullScreenDialog = new FeatureWalkthroughFullScreenDialog();
                featureWalkthroughFullScreenDialog.setArguments(hz8.E(new Pair("TYPE", ut7.e)));
                featureWalkthroughFullScreenDialog.p(featuredTournamentFragment.requireActivity().k(), "FeatureWalkthroughFullScreenDialog");
                return Unit.a;
            case 6:
                ut7 ut7Var2 = ut7.a;
                FeatureWalkthroughFullScreenDialog featureWalkthroughFullScreenDialog2 = new FeatureWalkthroughFullScreenDialog();
                featureWalkthroughFullScreenDialog2.setArguments(hz8.E(new Pair("TYPE", ut7.e)));
                featureWalkthroughFullScreenDialog2.p(featuredTournamentFragment.requireActivity().k(), "FeatureWalkthroughFullScreenDialog");
                return Unit.a;
            case 7:
                List list = (List) featuredTournamentFragment.G().q.d();
                if (list != null) {
                    if (!list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (((iv7) it.next()).b != null) {
                                bool = Boolean.valueOf(z);
                            }
                        }
                    }
                    z = false;
                    bool = Boolean.valueOf(z);
                }
                return Boolean.valueOf(Intrinsics.c(bool, Boolean.TRUE));
            case 8:
                Context requireContext6 = featuredTournamentFragment.requireContext();
                requireContext6.getClass();
                GambleRegulationFooterView gambleRegulationFooterView = new GambleRegulationFooterView(requireContext6, null, 6);
                gambleRegulationFooterView.j(null, true);
                return gambleRegulationFooterView;
            case 9:
                Context requireContext7 = featuredTournamentFragment.requireContext();
                requireContext7.getClass();
                AdBannerView adBannerView = new AdBannerView(requireContext7, null, 6);
                Context context = adBannerView.getContext();
                context.getClass();
                adBannerView.setPaddingRelative(adBannerView.getPaddingStart(), adBannerView.getPaddingTop(), adBannerView.getPaddingEnd(), ao2.s(8, context));
                Pair pair = new Pair(SearchResponseKt.SPORT_ENTITY, Sports.FOOTBALL);
                featuredTournamentFragment.G().i.getClass();
                adBannerView.setCustomTargeting(tub.h(pair, new Pair("unique_tournament_id", String.valueOf(270))));
                return adBannerView;
            case 10:
                Context requireContext8 = featuredTournamentFragment.requireContext();
                requireContext8.getClass();
                AdBannerView adBannerView2 = new AdBannerView(requireContext8, null, 6);
                Context context2 = adBannerView2.getContext();
                context2.getClass();
                int s = ao2.s(4, context2);
                Context context3 = adBannerView2.getContext();
                context3.getClass();
                int s2 = ao2.s(8, context3);
                adBannerView2.setPaddingRelative(s2, s, s2, s);
                Pair pair2 = new Pair(SearchResponseKt.SPORT_ENTITY, Sports.FOOTBALL);
                featuredTournamentFragment.G().i.getClass();
                adBannerView2.setCustomTargeting(tub.h(pair2, new Pair("unique_tournament_id", String.valueOf(270))));
                return adBannerView2;
            case 11:
                Context requireContext9 = featuredTournamentFragment.requireContext();
                requireContext9.getClass();
                nue nueVar = new nue(requireContext9);
                nueVar.setAnalyticsLocation("featured_tournament_tab");
                return nueVar;
            case 12:
                Context requireContext10 = featuredTournamentFragment.requireContext();
                requireContext10.getClass();
                return new cue(requireContext10);
            case 13:
                Context requireContext11 = featuredTournamentFragment.requireContext();
                requireContext11.getClass();
                return new dyi(requireContext11);
            default:
                LayoutInflater layoutInflater = featuredTournamentFragment.getLayoutInflater();
                krk krkVar = featuredTournamentFragment.l;
                krkVar.getClass();
                View inflate = layoutInflater.inflate(R.layout.view_featured_tournament_see_all_matches, (ViewGroup) ((jo8) krkVar).e, false);
                if (((TextView) nq8.B(R.id.link_text, inflate)) == null) {
                    yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.link_text)));
                    return null;
                }
                FrameLayout frameLayout = (FrameLayout) inflate;
                frameLayout.getClass();
                sea.v(frameLayout, false, true, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                frameLayout.setOnClickListener(new cd5(featuredTournamentFragment, 8));
                return frameLayout;
        }
    }
}
