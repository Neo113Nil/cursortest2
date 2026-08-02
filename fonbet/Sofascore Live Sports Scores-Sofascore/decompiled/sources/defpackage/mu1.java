package defpackage;

import android.content.Context;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.sofascore.model.FirebaseBundle;
import com.sofascore.results.bettingtips.fragment.BetBoostFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class mu1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ BetBoostFragment b;

    public /* synthetic */ mu1(BetBoostFragment betBoostFragment, int i) {
        this.a = i;
        this.b = betBoostFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        BetBoostFragment betBoostFragment = this.b;
        switch (i) {
            case 0:
                Context requireContext = betBoostFragment.requireContext();
                requireContext.getClass();
                nv.z0(requireContext, kv.IMPRESSION, "claim_button", "bet_boost_tab");
                return Unit.a;
            case 1:
                Context requireContext2 = betBoostFragment.requireContext();
                requireContext2.getClass();
                FirebaseBundle firebaseBundle = new FirebaseBundle();
                firebaseBundle.putString(IronSourceConstants.EVENTS_PROVIDER, "bet365");
                firebaseBundle.putString("type", "bet_boost");
                ia0 ia0Var = ia0.q;
                FirebaseAnalytics d = me4.d((f5d) me4.e(), "non_monetized_odds_impression", firebaseBundle, requireContext2);
                d.a.e(n9e.K(firebaseBundle), null, "non_monetized_odds_impression", false);
                return Unit.a;
            case 2:
                Context requireContext3 = betBoostFragment.requireContext();
                requireContext3.getClass();
                return new g8b(requireContext3);
            default:
                Context requireContext4 = betBoostFragment.requireContext();
                requireContext4.getClass();
                return new lu1(requireContext4);
        }
    }
}
