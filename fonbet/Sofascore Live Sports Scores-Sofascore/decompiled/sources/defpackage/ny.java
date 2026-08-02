package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.ironsource.U3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.sofascore.model.FirebaseBundle;
import com.sofascore.model.odds.OddsCountryProvider;
import com.sofascore.results.crowdsourcing.CrowdsourcingIncidentDetailsFullScreenDialog;
import com.sofascore.results.event.details.EventDetailsFragment;
import com.sofascore.results.event.details.bottomSheet.EventPlayerOfTheMatchVoteBottomSheet;
import com.sofascore.results.fantasy.comparison.selectplayer.FantasyComparisonPlayersDialogFragment;
import com.sofascore.results.fantasy.competition.chat.FantasyCompetitionChatFragment;
import com.sofascore.results.fantasy.competition.fixtures.FantasyCompetitionFixturesFragment;
import com.sofascore.results.fantasy.competition.selector.FantasyCompetitionSelectorBottomSheet;
import com.sofascore.results.fantasy.competition.team.FantasyCompetitionMyTeamFragment;
import com.sofascore.results.player.statistics.compare.search.CompareSearchBottomSheet;
import com.sofascore.results.settings.developer.DeveloperOptionsFullScreenDialog;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class ny extends ot8 implements Function0 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ny(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.b = i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        zrh zrhVar;
        int i = 4;
        rq3 rq3Var = null;
        switch (this.b) {
            case 0:
                View view = (View) this.receiver;
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 30) {
                    y9.n(view);
                }
                if (i2 >= 29 && (r0 = zrj.a(view)) != null) {
                    break;
                }
                break;
            case 1:
                ((vy2) this.receiver).getClass();
                break;
            case 2:
                ((CompareSearchBottomSheet) this.receiver).j();
                break;
            case 3:
                ((yx3) this.receiver).getClass();
                String name = Thread.currentThread().getName();
                name.getClass();
                break;
            case 4:
                ((yx3) this.receiver).getClass();
                String name2 = Thread.currentThread().getName();
                name2.getClass();
                break;
            case 5:
                ((yx3) this.receiver).getClass();
                break;
            case 6:
                ((CrowdsourcingIncidentDetailsFullScreenDialog) this.receiver).k(false, false);
                break;
            case 7:
                q54 q54Var = (q54) this.receiver;
                q54Var.getClass();
                xw3.L(un0.z(q54Var), null, null, new o54(q54Var, null), 3);
                break;
            case 8:
                ((CrowdsourcingIncidentDetailsFullScreenDialog) this.receiver).k(false, false);
                break;
            case 9:
                ((CrowdsourcingIncidentDetailsFullScreenDialog) this.receiver).k(false, false);
                break;
            case 10:
                q54 q54Var2 = (q54) this.receiver;
                fdi fdiVar = q54Var2.u;
                a64 a64Var = a64.b;
                fdiVar.getClass();
                fdiVar.m(null, a64Var);
                fdi fdiVar2 = q54Var2.g;
                q44 q44Var = q44.b;
                fdiVar2.getClass();
                fdiVar2.m(null, q44Var);
                break;
            case 11:
                q54 q54Var3 = (q54) this.receiver;
                q54Var3.u.l(null);
                fdi fdiVar3 = q54Var3.g;
                q44 q44Var2 = q44.a;
                fdiVar3.getClass();
                fdiVar3.m(null, q44Var2);
                fdi fdiVar4 = q54Var3.t;
                scj scjVar = new scj("");
                fdiVar4.getClass();
                fdiVar4.m(null, scjVar);
                break;
            case 12:
                break;
            case 13:
                ((DeveloperOptionsFullScreenDialog) this.receiver).k(false, false);
                break;
            case 14:
                tr3 tr3Var = (tr3) this.receiver;
                tr3Var.getClass();
                xw3.L(un0.z(tr3Var), null, null, new xq3(tr3Var, rq3Var, i), 3);
                break;
            case 15:
                tr3 tr3Var2 = (tr3) this.receiver;
                tr3Var2.getClass();
                xw3.L(un0.z(tr3Var2), null, null, new sr3(tr3Var2, null), 3);
                break;
            case 16:
                tr3 tr3Var3 = (tr3) this.receiver;
                tr3Var3.getClass();
                xw3.L(un0.z(tr3Var3), null, null, new qr3(tr3Var3, null), 3);
                break;
            case 17:
                tr3 tr3Var4 = (tr3) this.receiver;
                tr3Var4.getClass();
                xw3.L(un0.z(tr3Var4), null, null, new er3(tr3Var4, null), 3);
                break;
            case 18:
                tr3 tr3Var5 = (tr3) this.receiver;
                tr3Var5.getClass();
                xw3.L(un0.z(tr3Var5), null, null, new xq3(tr3Var5, rq3Var, i), 3);
                break;
            case 19:
                tr3 tr3Var6 = (tr3) this.receiver;
                tr3Var6.getClass();
                xw3.L(un0.z(tr3Var6), null, null, new qu1(tr3Var6, null), 3);
                break;
            case 20:
                tr3 tr3Var7 = (tr3) this.receiver;
                tr3Var7.getClass();
                xw3.L(un0.z(tr3Var7), null, null, new qu1(tr3Var7, null), 3);
                break;
            case 21:
                ((EventDetailsFragment) this.receiver).P();
                break;
            case 22:
                ((EventDetailsFragment) this.receiver).O();
                break;
            case 23:
                ((EventPlayerOfTheMatchVoteBottomSheet) this.receiver).j();
                break;
            case 24:
                ((FantasyComparisonPlayersDialogFragment) this.receiver).k(false, false);
                break;
            case 25:
                ((gk7) this.receiver).k();
                break;
            case 26:
                ((FantasyCompetitionChatFragment) this.receiver).P();
                break;
            case 27:
                FantasyCompetitionFixturesFragment fantasyCompetitionFixturesFragment = (FantasyCompetitionFixturesFragment) this.receiver;
                OddsCountryProvider oddsCountryProvider = fantasyCompetitionFixturesFragment.D().s;
                if (oddsCountryProvider != null) {
                    Context requireContext = fantasyCompetitionFixturesFragment.requireContext();
                    requireContext.getClass();
                    vmd vmdVar = vmd.EVENT_DETAILS;
                    String slug = oddsCountryProvider.getProvider().getSlug();
                    double impressionCostDecrypted = oddsCountryProvider.getImpressionCostDecrypted() / 1000000.0d;
                    FirebaseBundle firebaseBundle = new FirebaseBundle();
                    firebaseBundle.putString("location", "fantasy");
                    firebaseBundle.putString(IronSourceConstants.EVENTS_PROVIDER, slug);
                    firebaseBundle.putDouble(U3.i.X, impressionCostDecrypted);
                    firebaseBundle.putString(InAppPurchaseMetaData.KEY_CURRENCY, "EUR");
                    ia0 ia0Var = ia0.q;
                    me4.d((f5d) me4.e(), "special_odds_impression", firebaseBundle, requireContext).a.e(n9e.K(firebaseBundle), null, "special_odds_impression", false);
                }
                break;
            case 28:
                FantasyCompetitionMyTeamFragment fantasyCompetitionMyTeamFragment = (FantasyCompetitionMyTeamFragment) this.receiver;
                pn3 pn3Var = (pn3) ((g9a) fantasyCompetitionMyTeamFragment.t.getValue()).h.d();
                if (pn3Var != null && (zrhVar = (zrh) pn3Var.a()) != null) {
                    WeakReference weakReference = new WeakReference(fantasyCompetitionMyTeamFragment.requireActivity());
                    g6b lifecycle = fantasyCompetitionMyTeamFragment.getLifecycle();
                    lifecycle.getClass();
                    if (lifecycle.b().compareTo(e6b.e) >= 0) {
                        ((g9a) fantasyCompetitionMyTeamFragment.t.getValue()).n(zrhVar, null);
                        FragmentActivity fragmentActivity = (FragmentActivity) weakReference.get();
                        if (fragmentActivity != null) {
                            zrhVar.f(fragmentActivity);
                        }
                    } else {
                        lifecycle.a(new ot6(lifecycle, fantasyCompetitionMyTeamFragment, zrhVar, weakReference, 0));
                    }
                }
                break;
            default:
                ((FantasyCompetitionSelectorBottomSheet) this.receiver).j();
                break;
        }
        return Unit.a;
    }
}
