package defpackage;

import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.sofascore.results.R;
import com.sofascore.results.ads.UpgradeSofascoreActivity;
import com.sofascore.results.profile.LoginScreenActivity;
import com.sofascore.results.profile.UserProfileActivity;
import com.sofascore.results.profile.view.ProfileClickableRowView;
import com.sofascore.results.view.CirclePageIndicator;
import com.sofascore.results.view.header.CollapsibleProfileHeaderView;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class pfk implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ UserProfileActivity b;

    public /* synthetic */ pfk(UserProfileActivity userProfileActivity, int i) {
        this.a = i;
        this.b = userProfileActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        UserProfileActivity userProfileActivity = this.b;
        switch (i) {
            case 0:
                int i2 = UserProfileActivity.S;
                nv.z0(userProfileActivity, kv.CLICK, "upgrade_sofascore", "user_profile");
                Intent intent = new Intent(userProfileActivity, (Class<?>) UpgradeSofascoreActivity.class);
                intent.putExtra("preselectYearlyAds", false);
                userProfileActivity.startActivity(intent);
                return Unit.a;
            case 1:
                return Boolean.valueOf(!userProfileActivity.P);
            case 2:
                int i3 = UserProfileActivity.S;
                nv.z0(userProfileActivity, kv.CLICK, "login_button", "user_profile");
                Intent intent2 = new Intent(userProfileActivity, (Class<?>) LoginScreenActivity.class);
                intent2.addFlags(67108864);
                userProfileActivity.startActivityForResult(intent2, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE);
                return Unit.a;
            case 3:
                int i4 = UserProfileActivity.S;
                nv.z0(userProfileActivity, kv.CLICK, "login_button", "user_profile");
                Intent intent3 = new Intent(userProfileActivity, (Class<?>) LoginScreenActivity.class);
                intent3.addFlags(67108864);
                userProfileActivity.startActivityForResult(intent3, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE);
                return Unit.a;
            case 4:
                int i5 = UserProfileActivity.S;
                View inflate = userProfileActivity.getLayoutInflater().inflate(R.layout.activity_user_profile, (ViewGroup) null, false);
                int i6 = R.id.announcement_progress_bar;
                CirclePageIndicator circlePageIndicator = (CirclePageIndicator) nq8.B(R.id.announcement_progress_bar, inflate);
                if (circlePageIndicator != null) {
                    i6 = R.id.announcements_view_pager;
                    ViewPager2 viewPager2 = (ViewPager2) nq8.B(R.id.announcements_view_pager, inflate);
                    if (viewPager2 != null) {
                        i6 = R.id.app_bar;
                        if (((AppBarLayout) nq8.B(R.id.app_bar, inflate)) != null) {
                            i6 = R.id.badges_info;
                            View B = nq8.B(R.id.badges_info, inflate);
                            if (B != null) {
                                int i7 = R.id.close;
                                if (((ImageView) nq8.B(R.id.close, B)) != null) {
                                    i7 = R.id.icon_info;
                                    if (((ImageView) nq8.B(R.id.icon_info, B)) != null) {
                                        ConstraintLayout constraintLayout = (ConstraintLayout) B;
                                        int i8 = R.id.information_text;
                                        if (((TextView) nq8.B(R.id.information_text, B)) != null) {
                                            i8 = R.id.read_more;
                                            if (((TextView) nq8.B(R.id.read_more, B)) != null) {
                                                woc wocVar = new woc(constraintLayout);
                                                i6 = R.id.container;
                                                if (((LinearLayout) nq8.B(R.id.container, inflate)) != null) {
                                                    i6 = R.id.coordinator_layout;
                                                    if (((CoordinatorLayout) nq8.B(R.id.coordinator_layout, inflate)) != null) {
                                                        i6 = R.id.faq;
                                                        ProfileClickableRowView profileClickableRowView = (ProfileClickableRowView) nq8.B(R.id.faq, inflate);
                                                        if (profileClickableRowView != null) {
                                                            i6 = R.id.feedback;
                                                            ProfileClickableRowView profileClickableRowView2 = (ProfileClickableRowView) nq8.B(R.id.feedback, inflate);
                                                            if (profileClickableRowView2 != null) {
                                                                i6 = R.id.menu;
                                                                View B2 = nq8.B(R.id.menu, inflate);
                                                                if (B2 != null) {
                                                                    int i9 = R.id.contributions;
                                                                    ProfileClickableRowView profileClickableRowView3 = (ProfileClickableRowView) nq8.B(R.id.contributions, B2);
                                                                    if (profileClickableRowView3 != null) {
                                                                        i9 = R.id.editor;
                                                                        ProfileClickableRowView profileClickableRowView4 = (ProfileClickableRowView) nq8.B(R.id.editor, B2);
                                                                        if (profileClickableRowView4 != null) {
                                                                            i9 = R.id.leaderboards;
                                                                            ProfileClickableRowView profileClickableRowView5 = (ProfileClickableRowView) nq8.B(R.id.leaderboards, B2);
                                                                            if (profileClickableRowView5 != null) {
                                                                                i9 = R.id.my_predictions;
                                                                                ProfileClickableRowView profileClickableRowView6 = (ProfileClickableRowView) nq8.B(R.id.my_predictions, B2);
                                                                                if (profileClickableRowView6 != null) {
                                                                                    i9 = R.id.weekly_challenge;
                                                                                    ProfileClickableRowView profileClickableRowView7 = (ProfileClickableRowView) nq8.B(R.id.weekly_challenge, B2);
                                                                                    if (profileClickableRowView7 != null) {
                                                                                        djf djfVar = new djf((CardView) B2, profileClickableRowView3, profileClickableRowView4, profileClickableRowView5, profileClickableRowView6, profileClickableRowView7, 12);
                                                                                        i6 = R.id.no_internet_view;
                                                                                        ViewStub viewStub = (ViewStub) nq8.B(R.id.no_internet_view, inflate);
                                                                                        if (viewStub != null) {
                                                                                            i6 = R.id.profile_header;
                                                                                            CollapsibleProfileHeaderView collapsibleProfileHeaderView = (CollapsibleProfileHeaderView) nq8.B(R.id.profile_header, inflate);
                                                                                            if (collapsibleProfileHeaderView != null) {
                                                                                                i6 = R.id.referral_compose_view;
                                                                                                ComposeView composeView = (ComposeView) nq8.B(R.id.referral_compose_view, inflate);
                                                                                                if (composeView != null) {
                                                                                                    i6 = R.id.sofa_season_banner;
                                                                                                    ComposeView composeView2 = (ComposeView) nq8.B(R.id.sofa_season_banner, inflate);
                                                                                                    if (composeView2 != null) {
                                                                                                        i6 = R.id.support_container;
                                                                                                        if (((CardView) nq8.B(R.id.support_container, inflate)) != null) {
                                                                                                            i6 = R.id.toolbar;
                                                                                                            View B3 = nq8.B(R.id.toolbar, inflate);
                                                                                                            if (B3 != null) {
                                                                                                                z3f b = z3f.b(B3);
                                                                                                                i6 = R.id.toolbar_holder;
                                                                                                                if (((AppBarLayout) nq8.B(R.id.toolbar_holder, inflate)) != null) {
                                                                                                                    i6 = R.id.tooltip_anchor;
                                                                                                                    if (((Space) nq8.B(R.id.tooltip_anchor, inflate)) != null) {
                                                                                                                        i6 = R.id.upgrade_sofascore_sticky_header;
                                                                                                                        View B4 = nq8.B(R.id.upgrade_sofascore_sticky_header, inflate);
                                                                                                                        if (B4 != null) {
                                                                                                                            TextView textView = (TextView) nq8.B(R.id.label, B4);
                                                                                                                            if (textView != null) {
                                                                                                                                return new cf((LinearLayout) inflate, circlePageIndicator, viewPager2, wocVar, profileClickableRowView, profileClickableRowView2, djfVar, viewStub, collapsibleProfileHeaderView, composeView, composeView2, b, new dk2((LinearLayout) B4, textView, 14));
                                                                                                                            }
                                                                                                                            yhk.s("Missing required view with ID: ".concat(B4.getResources().getResourceName(R.id.label)));
                                                                                                                            return null;
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
                                                                            }
                                                                        }
                                                                    }
                                                                    yhk.s("Missing required view with ID: ".concat(B2.getResources().getResourceName(i9)));
                                                                    return null;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        i7 = i8;
                                    }
                                }
                                yhk.s("Missing required view with ID: ".concat(B.getResources().getResourceName(i7)));
                                return null;
                            }
                        }
                    }
                }
                yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i6)));
                return null;
            case 5:
                int i10 = UserProfileActivity.S;
                return new r8f(userProfileActivity);
            default:
                int i11 = UserProfileActivity.S;
                yk ykVar = new yk(userProfileActivity);
                ykVar.setOnDismissListener(new j0(userProfileActivity, 6));
                return ykVar;
        }
    }
}
