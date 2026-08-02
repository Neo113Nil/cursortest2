package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.ui.platform.ComposeView;
import com.sofascore.local_persistance.BrandingTournament;
import com.sofascore.model.Sports;
import com.sofascore.model.firebase.AdType;
import com.sofascore.model.mvvm.model.OffersBannerLayout;
import com.sofascore.results.R;
import com.sofascore.results.ads.iml.banner.AdBannerView;
import com.sofascore.results.event.details.view.odds.GambleRegulationFooterView;
import com.sofascore.results.event.details.view.promotion.PromotionBannerView;
import com.sofascore.results.featuredtournament.view.PromotionalOffersBannerView;
import com.sofascore.results.league.fragment.details.LeagueDetailsFragment;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class uua implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LeagueDetailsFragment b;

    public /* synthetic */ uua(LeagueDetailsFragment leagueDetailsFragment, int i) {
        this.a = i;
        this.b = leagueDetailsFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BrandingTournament brandingTournament;
        SharedPreferences d;
        SharedPreferences d2;
        int i = this.a;
        int i2 = 29;
        r3 = false;
        boolean z = false;
        r3 = false;
        r3 = false;
        boolean z2 = false;
        r3 = false;
        boolean z3 = false;
        LeagueDetailsFragment leagueDetailsFragment = this.b;
        switch (i) {
            case 0:
                Context requireContext = leagueDetailsFragment.requireContext();
                requireContext.getClass();
                ka9 ka9Var = new ka9(requireContext);
                ka9Var.a.d = new qm4(i2, leagueDetailsFragment, ka9Var);
                return ka9Var;
            case 1:
                Context requireContext2 = leagueDetailsFragment.requireContext();
                requireContext2.getClass();
                return new v6j(requireContext2);
            case 2:
                BrandingTournament brandingTournament2 = leagueDetailsFragment.C().q;
                return Boolean.valueOf((brandingTournament2 != null ? brandingTournament2.getBackground() : null) == null);
            case 3:
                return Boolean.valueOf(Intrinsics.c(leagueDetailsFragment.G().getSportSlug(), Sports.TENNIS));
            case 4:
                Context requireContext3 = leagueDetailsFragment.requireContext();
                requireContext3.getClass();
                return new r6j(requireContext3);
            case 5:
                Context requireContext4 = leagueDetailsFragment.requireContext();
                requireContext4.getClass();
                ComposeView composeView = new ComposeView(requireContext4, null, 6);
                composeView.setContent(new tc3(-836315855, new xua(leagueDetailsFragment, false ? 1 : 0), true));
                return composeView;
            case 6:
                return Boolean.valueOf(b.j(Sports.FOOTBALL, Sports.BASKETBALL).contains(leagueDetailsFragment.G().getSportSlug()));
            case 7:
                Context requireContext5 = leagueDetailsFragment.requireContext();
                requireContext5.getClass();
                return new nue(requireContext5);
            case 8:
                Context requireContext6 = leagueDetailsFragment.requireContext();
                requireContext6.getClass();
                return new cue(requireContext6);
            case 9:
                Context requireContext7 = leagueDetailsFragment.requireContext();
                requireContext7.getClass();
                return new nb9(requireContext7);
            case 10:
                Context requireContext8 = leagueDetailsFragment.requireContext();
                requireContext8.getClass();
                return new ib9(requireContext8);
            case 11:
                Context requireContext9 = leagueDetailsFragment.requireContext();
                requireContext9.getClass();
                PromotionBannerView promotionBannerView = new PromotionBannerView(requireContext9, null, 6);
                wnn.y(promotionBannerView, fv.LEAGUE_SCREEN);
                return promotionBannerView;
            case 12:
                Context requireContext10 = leagueDetailsFragment.requireContext();
                requireContext10.getClass();
                return new dyi(requireContext10);
            case 13:
                return Boolean.valueOf(leagueDetailsFragment.H().k == null || (brandingTournament = leagueDetailsFragment.H().k) == null || brandingTournament.getOddsProviderId() != null);
            case 14:
                Context requireContext11 = leagueDetailsFragment.requireContext();
                requireContext11.getClass();
                AdBannerView adBannerView = new AdBannerView(requireContext11, null, 6);
                adBannerView.c(AdType.Banner.MainScreenSmall);
                return adBannerView;
            case 15:
                Context requireContext12 = leagueDetailsFragment.requireContext();
                requireContext12.getClass();
                return new GambleRegulationFooterView(requireContext12, null, 6);
            case 16:
                return Boolean.valueOf(leagueDetailsFragment.C().t());
            case 17:
                Context requireContext13 = leagueDetailsFragment.requireContext();
                requireContext13.getClass();
                return new y1f(requireContext13);
            case 18:
                Integer F = o3a.F(leagueDetailsFragment.G());
                if (F != null && F.intValue() == 132) {
                    z3 = true;
                }
                return Boolean.valueOf(z3);
            case 19:
                Context requireContext14 = leagueDetailsFragment.requireContext();
                requireContext14.getClass();
                return new lxa(requireContext14);
            case 20:
                Context requireContext15 = leagueDetailsFragment.requireContext();
                requireContext15.getClass();
                ii5 ii5Var = new ii5(requireContext15);
                ii5Var.setClickable(true);
                return ii5Var;
            case 21:
                bga bgaVar = xld.a;
                Context requireContext16 = leagueDetailsFragment.requireContext();
                requireContext16.getClass();
                if (xld.g(requireContext16)) {
                    Set set = aef.a;
                    Context requireContext17 = leagueDetailsFragment.requireContext();
                    requireContext17.getClass();
                    if (aef.h(requireContext17)) {
                        BrandingTournament brandingTournament3 = leagueDetailsFragment.C().q;
                        if ((brandingTournament3 != null ? Boolean.valueOf(tz9.H(brandingTournament3)) : null) == null) {
                            z2 = true;
                        }
                    }
                }
                return Boolean.valueOf(z2);
            case 22:
                Context requireContext18 = leagueDetailsFragment.requireContext();
                requireContext18.getClass();
                return new hza(requireContext18);
            case 23:
                Context requireContext19 = leagueDetailsFragment.requireContext();
                requireContext19.getClass();
                PromotionalOffersBannerView promotionalOffersBannerView = new PromotionalOffersBannerView(requireContext19, null, 6);
                promotionalOffersBannerView.setVisibility(8);
                return promotionalOffersBannerView;
            case 24:
                Context requireContext20 = leagueDetailsFragment.requireContext();
                requireContext20.getClass();
                if (c5n.O(requireContext20) && leagueDetailsFragment.C().t != null) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 25:
                Context requireContext21 = leagueDetailsFragment.requireContext();
                requireContext21.getClass();
                PromotionBannerView promotionBannerView2 = new PromotionBannerView(requireContext21, null, 6);
                vdf n = promotionBannerView2.n(bef.s, fv.LEAGUE_SCREEN, OffersBannerLayout.Clean);
                String string = promotionBannerView2.getContext().getString(R.string.sofascore_fantasy);
                string.getClass();
                n.d = string;
                String string2 = promotionBannerView2.getContext().getString(R.string.fantasy_banner_entry_point_text);
                string2.getClass();
                n.e = string2;
                String string3 = promotionBannerView2.getContext().getString(R.string.fantasy_play_now_button);
                string3.getClass();
                n.f = string3;
                n.k = 2131231472;
                n.l = new ij8(26, leagueDetailsFragment, promotionBannerView2);
                n.m = new uua(leagueDetailsFragment, i2);
                n.a();
                promotionBannerView2.setVisibility(0);
                return promotionBannerView2;
            case 26:
                Integer F2 = o3a.F(leagueDetailsFragment.G());
                if (F2 == null || F2.intValue() != 16) {
                    return null;
                }
                Context requireContext22 = leagueDetailsFragment.requireContext();
                requireContext22.getClass();
                SharedPreferences sharedPreferences = uic.j;
                if (sharedPreferences == null) {
                    Context applicationContext = requireContext22.getApplicationContext();
                    synchronized (uic.i) {
                        d2 = a5f.d(applicationContext);
                        uic.j = d2;
                    }
                    d2.getClass();
                    sharedPreferences = d2;
                }
                String string4 = sharedPreferences.getString("PR_XAIST", "");
                if (string4 != null && string4.length() != 0) {
                    return null;
                }
                yea yeaVar = j58.a;
                if (!j58.j() || ke0.m.contains(-8)) {
                    return null;
                }
                Context requireContext23 = leagueDetailsFragment.requireContext();
                requireContext23.getClass();
                SharedPreferences sharedPreferences2 = uic.j;
                if (sharedPreferences2 == null) {
                    Context applicationContext2 = requireContext23.getApplicationContext();
                    synchronized (uic.i) {
                        d = a5f.d(applicationContext2);
                        uic.j = d;
                    }
                    d.getClass();
                    sharedPreferences2 = d;
                }
                if (!sharedPreferences2.getBoolean("IN_APP_PURCHASE_AVAILABLE", true)) {
                    return null;
                }
                Context requireContext24 = leagueDetailsFragment.requireContext();
                requireContext24.getClass();
                return new iuh(requireContext24);
            case 27:
                Context requireContext25 = leagueDetailsFragment.requireContext();
                requireContext25.getClass();
                return new bva(requireContext25);
            case 28:
                Context requireContext26 = leagueDetailsFragment.requireContext();
                requireContext26.getClass();
                return new oxe(requireContext26);
            default:
                Context requireContext27 = leagueDetailsFragment.requireContext();
                requireContext27.getClass();
                nv.A(requireContext27, "open_fantasy", "league_details");
                v9g.H(leagueDetailsFragment, leagueDetailsFragment.C().t, 2);
                return Unit.a;
        }
    }
}
