package defpackage;

import android.content.Context;
import com.sofascore.model.Sports;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.results.ads.iml.banner.AdBannerView;
import com.sofascore.results.event.details.view.odds.GambleRegulationFooterView;
import com.sofascore.results.fantasy.competition.fixtures.FantasyCompetitionFixturesFragment;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class tp6 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FantasyCompetitionFixturesFragment b;

    public /* synthetic */ tp6(FantasyCompetitionFixturesFragment fantasyCompetitionFixturesFragment, int i) {
        this.a = i;
        this.b = fantasyCompetitionFixturesFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        FantasyCompetitionFixturesFragment fantasyCompetitionFixturesFragment = this.b;
        switch (i) {
            case 0:
                Context requireContext = fantasyCompetitionFixturesFragment.requireContext();
                requireContext.getClass();
                return new sp6(requireContext);
            case 1:
                fantasyCompetitionFixturesFragment.n();
                return Unit.a;
            case 2:
                Context requireContext2 = fantasyCompetitionFixturesFragment.requireContext();
                requireContext2.getClass();
                GambleRegulationFooterView gambleRegulationFooterView = new GambleRegulationFooterView(requireContext2, null, 6);
                gambleRegulationFooterView.j(null, true);
                return gambleRegulationFooterView;
            case 3:
                Context requireContext3 = fantasyCompetitionFixturesFragment.requireContext();
                requireContext3.getClass();
                AdBannerView adBannerView = new AdBannerView(requireContext3, null, 6);
                Context context = adBannerView.getContext();
                context.getClass();
                int s = ao2.s(4, context);
                Context context2 = adBannerView.getContext();
                context2.getClass();
                int s2 = ao2.s(8, context2);
                adBannerView.setPaddingRelative(s2, s, s2, s);
                adBannerView.setCustomTargeting(tub.h(new Pair(SearchResponseKt.SPORT_ENTITY, Sports.FOOTBALL), new Pair("page", "fantasy")));
                return adBannerView;
            default:
                Context requireContext4 = fantasyCompetitionFixturesFragment.requireContext();
                requireContext4.getClass();
                AdBannerView adBannerView2 = new AdBannerView(requireContext4, null, 6);
                Context context3 = adBannerView2.getContext();
                context3.getClass();
                int s3 = ao2.s(4, context3);
                Context context4 = adBannerView2.getContext();
                context4.getClass();
                int s4 = ao2.s(8, context4);
                adBannerView2.setPaddingRelative(s4, s3, s4, s3);
                adBannerView2.setCustomTargeting(tub.h(new Pair(SearchResponseKt.SPORT_ENTITY, Sports.FOOTBALL), new Pair("page", "fantasy")));
                return adBannerView2;
        }
    }
}
