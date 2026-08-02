package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.ProductDetails;
import com.sofascore.results.event.EventActivity;
import com.sofascore.results.main.MainActivity;
import com.sofascore.results.profile.LoginScreenActivity;
import com.sofascore.results.weeklyChallenge.leaderboard.WeeklyLeaderboardFragment;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class r4l implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ WeeklyLeaderboardFragment b;

    public /* synthetic */ r4l(WeeklyLeaderboardFragment weeklyLeaderboardFragment, ComposeView composeView) {
        this.a = 0;
        this.b = weeklyLeaderboardFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Activity activity;
        BillingClient billingClient;
        int i = this.a;
        WeeklyLeaderboardFragment weeklyLeaderboardFragment = this.b;
        switch (i) {
            case 0:
                mea meaVar = (mea) obj;
                meaVar.getClass();
                if (meaVar == mea.a) {
                    ia0 ia0Var = ia0.q;
                    if (!ok3.p().e().getIsLoggedIn()) {
                        r4a.M(weeklyLeaderboardFragment.D().D);
                        de deVar = weeklyLeaderboardFragment.t;
                        int i2 = LoginScreenActivity.M;
                        FragmentActivity requireActivity = weeklyLeaderboardFragment.requireActivity();
                        requireActivity.getClass();
                        deVar.a(wxf.v(requireActivity, null, 6), null);
                        break;
                    }
                }
                Context requireContext = weeklyLeaderboardFragment.requireContext();
                requireContext.getClass();
                nv.z0(requireContext, kv.CLICK, "start_voting", "challenge");
                Integer num = weeklyLeaderboardFragment.D().q;
                if (num != null) {
                    int intValue = num.intValue();
                    wxf wxfVar = EventActivity.h0;
                    Context requireContext2 = weeklyLeaderboardFragment.requireContext();
                    requireContext2.getClass();
                    wxf.B(requireContext2, intValue, null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                } else {
                    boolean z = MainActivity.n0;
                    Context requireContext3 = weeklyLeaderboardFragment.requireContext();
                    requireContext3.getClass();
                    f8h.z(requireContext3, fz8.C(fz8.H("open_action", "select_matches_tab")), 4);
                }
            case 1:
                joa joaVar = weeklyLeaderboardFragment.u;
                int intValue2 = ((Integer) obj).intValue();
                krk krkVar = weeklyLeaderboardFragment.l;
                krkVar.getClass();
                FrameLayout frameLayout = ((wrh) krkVar).c;
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                if (layoutParams == null) {
                    yhk.s("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    break;
                } else {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    layoutParams2.topMargin = intValue2;
                    frameLayout.setLayoutParams(layoutParams2);
                    if (((LinearLayout) joaVar.getValue()) != null) {
                        krk krkVar2 = weeklyLeaderboardFragment.l;
                        krkVar2.getClass();
                        if (((wrh) krkVar2).c.getChildCount() == 0) {
                            krk krkVar3 = weeklyLeaderboardFragment.l;
                            krkVar3.getClass();
                            ((wrh) krkVar3).c.addView((LinearLayout) joaVar.getValue());
                        }
                    }
                    break;
                }
            case 2:
                int intValue3 = ((Integer) obj).intValue();
                wxf wxfVar2 = EventActivity.h0;
                Context requireContext4 = weeklyLeaderboardFragment.requireContext();
                requireContext4.getClass();
                wxf.B(requireContext4, intValue3, null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                break;
            default:
                ProductDetails productDetails = (ProductDetails) obj;
                productDetails.getClass();
                sn3 C = weeklyLeaderboardFragment.C();
                BillingFlowParams build = BillingFlowParams.newBuilder().setProductDetailsParamsList(a.c(BillingFlowParams.ProductDetailsParams.newBuilder().setProductDetails(productDetails).build())).build();
                build.getClass();
                WeakReference weakReference = C.j;
                if (weakReference != null && (activity = (Activity) weakReference.get()) != null && (billingClient = C.g) != null) {
                    billingClient.launchBillingFlow(activity, build);
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ r4l(WeeklyLeaderboardFragment weeklyLeaderboardFragment, int i) {
        this.a = i;
        this.b = weeklyLeaderboardFragment;
    }
}
