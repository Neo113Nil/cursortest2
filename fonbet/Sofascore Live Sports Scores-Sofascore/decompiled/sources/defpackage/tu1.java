package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.sofascore.results.R;
import com.sofascore.results.ads.iml.banner.AdBannerView;
import com.sofascore.results.bettingtips.BettingTipsActivity;
import com.sofascore.results.mvvm.base.SofaTabLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class tu1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ BettingTipsActivity b;

    public /* synthetic */ tu1(BettingTipsActivity bettingTipsActivity, int i) {
        this.a = i;
        this.b = bettingTipsActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        BettingTipsActivity bettingTipsActivity = this.b;
        switch (i) {
            case 0:
                int i2 = BettingTipsActivity.Q;
                View inflate = bettingTipsActivity.getLayoutInflater().inflate(R.layout.activity_betting_tips, (ViewGroup) null, false);
                int i3 = R.id.ad_banner_view;
                AdBannerView adBannerView = (AdBannerView) nq8.B(R.id.ad_banner_view, inflate);
                if (adBannerView != null) {
                    i3 = R.id.info_banner;
                    if (((ViewStub) nq8.B(R.id.info_banner, inflate)) != null) {
                        i3 = R.id.main_coordinator_layout;
                        if (((CoordinatorLayout) nq8.B(R.id.main_coordinator_layout, inflate)) != null) {
                            i3 = R.id.no_internet_view;
                            ViewStub viewStub = (ViewStub) nq8.B(R.id.no_internet_view, inflate);
                            if (viewStub != null) {
                                i3 = R.id.tabs;
                                SofaTabLayout sofaTabLayout = (SofaTabLayout) nq8.B(R.id.tabs, inflate);
                                if (sofaTabLayout != null) {
                                    i3 = R.id.toolbar;
                                    View B = nq8.B(R.id.toolbar, inflate);
                                    if (B != null) {
                                        djf a = djf.a(B);
                                        i3 = R.id.toolbar_holder;
                                        if (((AppBarLayout) nq8.B(R.id.toolbar_holder, inflate)) != null) {
                                            i3 = R.id.vpMain;
                                            ViewPager2 viewPager2 = (ViewPager2) nq8.B(R.id.vpMain, inflate);
                                            if (viewPager2 != null) {
                                                return new tc((ConstraintLayout) inflate, adBannerView, viewStub, sofaTabLayout, a, viewPager2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
                return null;
            case 1:
                int i4 = BettingTipsActivity.Q;
                return new fv1(bettingTipsActivity, bettingTipsActivity.R().f, bettingTipsActivity.R().d);
            case 2:
                int i5 = BettingTipsActivity.Q;
                return new tu1(bettingTipsActivity, 4);
            case 3:
                int i6 = BettingTipsActivity.Q;
                return new lkj(bettingTipsActivity, km5.a);
            default:
                int i7 = BettingTipsActivity.Q;
                bettingTipsActivity.S().F();
                return Unit.a;
        }
    }
}
