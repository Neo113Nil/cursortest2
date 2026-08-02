package ge;

import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.g0;
import androidx.lifecycle.x;
import com.sports.insider.MyApp;
import com.sports.insider.ui.faq.articles.FaqContentFragment;
import com.sports.insider.ui.live.LiveFragment;
import com.sports.insider.ui.onboarding.BoardSiAcademyFragment;
import com.sports.insider.ui.onboarding.NoEthernetFragment;
import com.sports.insider.ui.onboarding.SportInsiderFragment;
import com.sports.insider.ui.pays.LivePayFragment;
import com.sports.insider.ui.pays.PayExpressFragment;
import com.sports.insider.ui.pays.PayPremiumFragment;
import com.sports.insider.ui.pays.VipAccessFragment;
import com.sports.insider.ui.prediction.ExpressFragment;
import com.sports.insider.ui.prediction.PredictionFragment;
import com.sports.insider.ui.viewpage.ViewCloudFragment;
import com.sports.insider.ui.viewpage.ViewImageFragment;
import com.sports.insider.ui.viewpage.ViewPageEventFragment;
import com.sports.insider.ui.viewpage.ViewPageFragment;
import com.sports.insider.ui.views.OopsButton;
import e.z;
import ec.a0;
import eg.c0;
import kotlin.jvm.internal.Intrinsics;
import rc.b0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d extends z {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9962d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f9963e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Fragment fragment, int i5) {
        super(true);
        this.f9962d = i5;
        this.f9963e = fragment;
    }

    @Override // e.z
    public final void b() {
        OopsButton oopsButton;
        switch (this.f9962d) {
            case 0:
                a.a.r((LiveFragment) this.f9963e).e();
                break;
            case 1:
                BoardSiAcademyFragment boardSiAcademyFragment = (BoardSiAcademyFragment) this.f9963e;
                try {
                    if (boardSiAcademyFragment.J()) {
                        boardSiAcademyFragment.I();
                        rc.g gVar = (rc.g) boardSiAcademyFragment.f6928c.getValue();
                        gVar.getClass();
                        c0.t(MyApp.f6830c, b0.b(), null, new rc.c(gVar, null, 3), 2);
                    } else {
                        boardSiAcademyFragment.L("BoardSiAcademyFragmentByOnBackPressed");
                    }
                    break;
                } catch (Exception e7) {
                    zc.d.b(4, "OnBackPressedCallback", e7);
                    return;
                }
            case 2:
                NoEthernetFragment noEthernetFragment = (NoEthernetFragment) this.f9963e;
                try {
                    if (((g0) noEthernetFragment.getLifecycle()).f2169d.a(x.f2256d)) {
                        c0.t(MyApp.f6830c, b0.b(), null, new rc.c(new rc.g(), null, 7), 2);
                        a.a.r(noEthernetFragment).e();
                        break;
                    }
                } catch (Exception e9) {
                    zc.d.b(4, "NoEthernetFragment backCallback", e9);
                    return;
                }
                break;
            case 3:
                a0 a0Var = (a0) ((SportInsiderFragment) this.f9963e).f22459a;
                if (a0Var != null && (oopsButton = a0Var.f8851b) != null) {
                    oopsButton.setVisibility(0);
                    break;
                }
                break;
            case 4:
                a.a.r((LivePayFragment) this.f9963e).e();
                break;
            case 5:
                a.a.r((PayExpressFragment) this.f9963e).e();
                break;
            case 6:
                a.a.r((PayPremiumFragment) this.f9963e).e();
                break;
            case 7:
                a.a.r((VipAccessFragment) this.f9963e).e();
                break;
            case 8:
                a.a.r((ExpressFragment) this.f9963e).e();
                break;
            case 9:
                a.a.r((PredictionFragment) this.f9963e).e();
                break;
            case 10:
                a.a.r((ViewCloudFragment) this.f9963e).e();
                break;
            case 11:
                a.a.r((ViewImageFragment) this.f9963e).e();
                break;
            case 12:
                ViewPageEventFragment viewPageEventFragment = (ViewPageEventFragment) this.f9963e;
                d dVar = viewPageEventFragment.f7080e;
                WebView webView = viewPageEventFragment.f7077b;
                if (webView != null && webView.canGoBack()) {
                    WebView webView2 = viewPageEventFragment.f7077b;
                    if (webView2 != null) {
                        webView2.goBack();
                    }
                    dVar.f(true);
                    break;
                } else {
                    if (this.f8455b) {
                        dVar.f(false);
                    }
                    a.a.r(viewPageEventFragment).e();
                    break;
                }
                break;
            case 13:
                ViewPageFragment viewPageFragment = (ViewPageFragment) this.f9963e;
                d dVar2 = viewPageFragment.f7085c;
                WebView webView3 = viewPageFragment.f7083a;
                if (webView3 != null && webView3.canGoBack()) {
                    WebView webView4 = viewPageFragment.f7083a;
                    if (webView4 != null) {
                        webView4.goBack();
                    }
                    dVar2.f(true);
                    break;
                } else {
                    if (this.f8455b) {
                        dVar2.f(false);
                    }
                    y1.r rVar = viewPageFragment.f7084b;
                    if (rVar != null) {
                        rVar.e();
                        break;
                    }
                }
                break;
            case 14:
                a.a.r((FaqContentFragment) this.f9963e).e();
                break;
            default:
                b2.j jVar = ((y1.r) this.f9963e).f25625b;
                if (!jVar.f2991f.isEmpty()) {
                    y1.b0 f6 = jVar.f();
                    Intrinsics.checkNotNull(f6);
                    if (jVar.l(f6.f25534b.f3017e, true, false)) {
                        jVar.b();
                        break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(y1.r rVar) {
        super(false);
        this.f9962d = 15;
        this.f9963e = rVar;
    }
}
