package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.sofascore.common.mvvm.UnderlinedToolbar;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.util.ChatInterface;
import com.sofascore.results.R;
import com.sofascore.results.ads.iml.banner.AdBannerView;
import com.sofascore.results.chat.ChatActivity;
import com.sofascore.results.event.details.view.odds.FeaturedOddsView;
import com.sofascore.results.mvvm.base.SofaTabLayout;
import com.sofascore.results.tutorial.wizard.TutorialWizardView;
import com.sofascore.results.view.ToolbarBackgroundAppBarLayout;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class dq2 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivity b;

    public /* synthetic */ dq2(ChatActivity chatActivity, int i) {
        this.a = i;
        this.b = chatActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        ChatActivity chatActivity = this.b;
        switch (i) {
            case 0:
                int i2 = ChatActivity.Z;
                View inflate = chatActivity.getLayoutInflater().inflate(R.layout.activity_chat, (ViewGroup) null, false);
                int i3 = R.id.app_bar_layout;
                ToolbarBackgroundAppBarLayout toolbarBackgroundAppBarLayout = (ToolbarBackgroundAppBarLayout) nq8.B(R.id.app_bar_layout, inflate);
                if (toolbarBackgroundAppBarLayout != null) {
                    i3 = R.id.content_holder;
                    FrameLayout frameLayout = (FrameLayout) nq8.B(R.id.content_holder, inflate);
                    if (frameLayout != null) {
                        i3 = R.id.event_header;
                        FrameLayout frameLayout2 = (FrameLayout) nq8.B(R.id.event_header, inflate);
                        if (frameLayout2 != null) {
                            i3 = R.id.header_warning_icon_holder;
                            ConstraintLayout constraintLayout = (ConstraintLayout) nq8.B(R.id.header_warning_icon_holder, inflate);
                            if (constraintLayout != null) {
                                i3 = R.id.loading_view;
                                if (((ViewStub) nq8.B(R.id.loading_view, inflate)) != null) {
                                    i3 = R.id.non_event_header;
                                    View B = nq8.B(R.id.non_event_header, inflate);
                                    if (B != null) {
                                        int i4 = R.id.logo;
                                        ImageView imageView = (ImageView) nq8.B(R.id.logo, B);
                                        if (imageView != null) {
                                            i4 = R.id.primary_label;
                                            TextView textView = (TextView) nq8.B(R.id.primary_label, B);
                                            if (textView != null) {
                                                i4 = R.id.secondary_label;
                                                TextView textView2 = (TextView) nq8.B(R.id.secondary_label, B);
                                                if (textView2 != null) {
                                                    i4 = R.id.secondary_label_icon;
                                                    ImageView imageView2 = (ImageView) nq8.B(R.id.secondary_label_icon, B);
                                                    if (imageView2 != null) {
                                                        cv1 cv1Var = new cv1((ConstraintLayout) B, imageView, textView, textView2, imageView2);
                                                        i3 = R.id.odds_ads_container;
                                                        LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.odds_ads_container, inflate);
                                                        if (linearLayout != null) {
                                                            i3 = R.id.tabs;
                                                            SofaTabLayout sofaTabLayout = (SofaTabLayout) nq8.B(R.id.tabs, inflate);
                                                            if (sofaTabLayout != null) {
                                                                i3 = R.id.toolbar;
                                                                UnderlinedToolbar underlinedToolbar = (UnderlinedToolbar) nq8.B(R.id.toolbar, inflate);
                                                                if (underlinedToolbar != null) {
                                                                    i3 = R.id.toolbar_holder;
                                                                    FrameLayout frameLayout3 = (FrameLayout) nq8.B(R.id.toolbar_holder, inflate);
                                                                    if (frameLayout3 != null) {
                                                                        i3 = R.id.tutorial_view;
                                                                        TutorialWizardView tutorialWizardView = (TutorialWizardView) nq8.B(R.id.tutorial_view, inflate);
                                                                        if (tutorialWizardView != null) {
                                                                            i3 = R.id.view_pager;
                                                                            ViewPager2 viewPager2 = (ViewPager2) nq8.B(R.id.view_pager, inflate);
                                                                            if (viewPager2 != null) {
                                                                                i3 = R.id.warning_button;
                                                                                ImageView imageView3 = (ImageView) nq8.B(R.id.warning_button, inflate);
                                                                                if (imageView3 != null) {
                                                                                    return new uc((CoordinatorLayout) inflate, toolbarBackgroundAppBarLayout, frameLayout, frameLayout2, constraintLayout, cv1Var, linearLayout, sofaTabLayout, underlinedToolbar, frameLayout3, tutorialWizardView, viewPager2, imageView3);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        yhk.s("Missing required view with ID: ".concat(B.getResources().getResourceName(i4)));
                                        return null;
                                    }
                                }
                            }
                        }
                    }
                }
                yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
                return null;
            case 1:
                int i5 = ChatActivity.Z;
                FeaturedOddsView featuredOddsView = new FeaturedOddsView(chatActivity, null, 6, 0);
                featuredOddsView.setLocation(vmd.CHAT);
                featuredOddsView.setBackgroundColor(jq2.b);
                featuredOddsView.setAction(new eq2(chatActivity, 4));
                return featuredOddsView;
            case 2:
                int i6 = ChatActivity.Z;
                return new AdBannerView(chatActivity, null, 6);
            case 3:
                int i7 = ChatActivity.Z;
                ViewPager2 viewPager22 = chatActivity.R().l;
                SofaTabLayout sofaTabLayout2 = chatActivity.R().h;
                ChatInterface chatInterface = chatActivity.O;
                if (chatInterface != null) {
                    return new qr2(chatActivity, viewPager22, sofaTabLayout2, chatInterface);
                }
                Intrinsics.i("chatInterfaceModel");
                throw null;
            default:
                int i8 = ChatActivity.Z;
                return (Event) chatActivity.S().m.d();
        }
    }
}
