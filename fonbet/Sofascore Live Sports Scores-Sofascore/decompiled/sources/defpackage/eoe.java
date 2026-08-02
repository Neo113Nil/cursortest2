package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.PlayerActiveSuspension;
import com.sofascore.model.Sports;
import com.sofascore.model.firebase.AdType;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.R;
import com.sofascore.results.ads.iml.banner.AdBannerView;
import com.sofascore.results.event.details.view.promotion.PromotionBannerView;
import com.sofascore.results.featuredtournament.view.PromotionalOffersBannerView;
import com.sofascore.results.player.details.PlayerDetailsFragment;
import com.sofascore.results.view.SuggestEditView;
import com.vungle.ads.internal.protos.Sdk;
import java.io.Serializable;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class eoe implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PlayerDetailsFragment b;

    public /* synthetic */ eoe(PlayerDetailsFragment playerDetailsFragment, int i) {
        this.a = i;
        this.b = playerDetailsFragment;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        if (defpackage.aef.h(r9) != false) goto L18;
     */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        List<PlayerActiveSuspension> activeSeasonSuspensions;
        UniqueTournament primaryUniqueTournament;
        int i = this.a;
        boolean z = true;
        boolean z2 = true;
        z = true;
        int i2 = 0;
        Integer num = null;
        PlayerDetailsFragment playerDetailsFragment = this.b;
        switch (i) {
            case 0:
                Context requireContext = playerDetailsFragment.requireContext();
                requireContext.getClass();
                return new n4c(requireContext);
            case 1:
                Context requireContext2 = playerDetailsFragment.requireContext();
                requireContext2.getClass();
                r04 r04Var = new r04(requireContext2, null);
                o8.d(r04Var, 0, 7);
                return r04Var;
            case 2:
                return Boolean.valueOf(playerDetailsFragment.E().getUnderage());
            case 3:
                Context requireContext3 = playerDetailsFragment.requireContext();
                requireContext3.getClass();
                ComposeView composeView = new ComposeView(requireContext3, null, 6);
                composeView.setContent(new tc3(1571210648, new foe(playerDetailsFragment, z ? 1 : 0), true));
                return composeView;
            case 4:
                return Boolean.valueOf(playerDetailsFragment.requireArguments().getBoolean("SCROLL_TO_TRANSFERS", false));
            case 5:
                if (playerDetailsFragment.E().getInjury() == null && ((activeSeasonSuspensions = playerDetailsFragment.E().getActiveSeasonSuspensions()) == null || activeSeasonSuspensions.isEmpty())) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 6:
                Context requireContext4 = playerDetailsFragment.requireContext();
                requireContext4.getClass();
                ComposeView composeView2 = new ComposeView(requireContext4, null, 6);
                composeView2.setContent(new tc3(-453220580, new foe(playerDetailsFragment, i2), true));
                return composeView2;
            case 7:
                return Boolean.valueOf(Intrinsics.c(playerDetailsFragment.E().getSportSlug(), Sports.BASEBALL));
            case 8:
                PlayerDetailsFragment playerDetailsFragment2 = this.b;
                Context requireContext5 = playerDetailsFragment2.requireContext();
                requireContext5.getClass();
                v91 v91Var = new v91(requireContext5);
                v91Var.l = new v9b(1, playerDetailsFragment2, PlayerDetailsFragment.class, "onBaseballKeyStatisticsCardAction", "onBaseballKeyStatisticsCardAction(Lcom/sofascore/results/player/details/compose/BaseballPlayerKeyStatisticsCardAction;)V", 0, 27);
                return v91Var;
            case 9:
                Context requireContext6 = playerDetailsFragment.requireContext();
                requireContext6.getClass();
                AdBannerView adBannerView = new AdBannerView(requireContext6, null, 6);
                adBannerView.c(AdType.Banner.MainScreenSmall);
                return adBannerView;
            case 10:
                Context requireContext7 = playerDetailsFragment.requireContext();
                requireContext7.getClass();
                ooe ooeVar = new ooe(requireContext7);
                ooeVar.a.d = new bba(playerDetailsFragment, 24);
                return ooeVar;
            case 11:
                Integer managerId = playerDetailsFragment.E().getManagerId();
                if (managerId == null) {
                    managerId = null;
                }
                if (managerId == null) {
                    return null;
                }
                int intValue = managerId.intValue();
                Context requireContext8 = playerDetailsFragment.requireContext();
                requireContext8.getClass();
                q52 q52Var = new q52(requireContext8);
                q52Var.j();
                String string = playerDetailsFragment.getString(R.string.manager_profile);
                string.getClass();
                q52Var.setText(string);
                q52Var.setOnClickListener(new l8(playerDetailsFragment, intValue, 7));
                return q52Var;
            case 12:
                LayoutInflater from = LayoutInflater.from(playerDetailsFragment.requireContext());
                krk krkVar = playerDetailsFragment.l;
                krkVar.getClass();
                loe a = loe.a(from, ((oo8) krkVar).d);
                ((ConstraintLayout) a.d.b).setVisibility(8);
                ConstraintLayout constraintLayout = (ConstraintLayout) a.e.j;
                constraintLayout.getClass();
                sea.v(constraintLayout, true, true, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                return a;
            case 13:
                Context requireContext9 = playerDetailsFragment.requireContext();
                requireContext9.getClass();
                return new moe(requireContext9);
            case 14:
                Context requireContext10 = playerDetailsFragment.requireContext();
                requireContext10.getClass();
                bzg bzgVar = new bzg(requireContext10, false);
                o8.d(bzgVar, 0, 7);
                return bzgVar;
            case 15:
                Context requireContext11 = playerDetailsFragment.requireContext();
                requireContext11.getClass();
                return new zue(requireContext11);
            case 16:
                Context requireContext12 = playerDetailsFragment.requireContext();
                requireContext12.getClass();
                SuggestEditView suggestEditView = new SuggestEditView(requireContext12, null, 6);
                suggestEditView.d.c.setOnClickListener(new s61(9, new zbe(2, playerDetailsFragment, suggestEditView)));
                return suggestEditView;
            case 17:
                ((dsi) playerDetailsFragment.v.getValue()).f(zxe.e);
                return Unit.a;
            case 18:
                Context requireContext13 = playerDetailsFragment.requireContext();
                requireContext13.getClass();
                nv.z0(requireContext13, kv.CLICK, "view_media", "player_details");
                ((dsi) playerDetailsFragment.v.getValue()).f(zxe.g);
                return Unit.a;
            case 19:
                Bundle requireArguments = playerDetailsFragment.requireArguments();
                requireArguments.getClass();
                Serializable M = gz8.M(requireArguments, "PLAYER", Player.class);
                if (M != null) {
                    return (Player) M;
                }
                a70.p("Serializable PLAYER not found");
                return null;
            case 20:
                Set set = aef.a;
                Context requireContext14 = playerDetailsFragment.requireContext();
                requireContext14.getClass();
                Team team = playerDetailsFragment.E().getTeam();
                if (team != null && (primaryUniqueTournament = team.getPrimaryUniqueTournament()) != null) {
                    num = Integer.valueOf(primaryUniqueTournament.getId());
                }
                return Boolean.valueOf(aef.e(requireContext14, num));
            case 21:
                Context requireContext15 = playerDetailsFragment.requireContext();
                requireContext15.getClass();
                PromotionBannerView promotionBannerView = new PromotionBannerView(requireContext15, null, 6);
                wnn.y(promotionBannerView, fv.PLAYER_SCREEN);
                return promotionBannerView;
            case 22:
                Set set2 = aef.a;
                Context requireContext16 = playerDetailsFragment.requireContext();
                requireContext16.getClass();
                bef d = aef.d(requireContext16, playerDetailsFragment.E());
                if (d == null) {
                    return null;
                }
                Context requireContext17 = playerDetailsFragment.requireContext();
                requireContext17.getClass();
                PromotionBannerView promotionBannerView2 = new PromotionBannerView(requireContext17, null, 6);
                wnn.x(promotionBannerView2, d, fv.PLAYER_SCREEN);
                promotionBannerView2.setVisibility(0);
                return promotionBannerView2;
            case 23:
                bga bgaVar = xld.a;
                Context requireContext18 = playerDetailsFragment.requireContext();
                requireContext18.getClass();
                if (xld.g(requireContext18)) {
                    Set set3 = aef.a;
                    Context requireContext19 = playerDetailsFragment.requireContext();
                    requireContext19.getClass();
                    break;
                }
                z2 = false;
                return Boolean.valueOf(z2);
            case 24:
                Context requireContext20 = playerDetailsFragment.requireContext();
                requireContext20.getClass();
                return new PromotionalOffersBannerView(requireContext20, null, 6);
            default:
                return Boolean.valueOf(((ple) playerDetailsFragment.u.getValue()).w != null);
        }
    }
}
