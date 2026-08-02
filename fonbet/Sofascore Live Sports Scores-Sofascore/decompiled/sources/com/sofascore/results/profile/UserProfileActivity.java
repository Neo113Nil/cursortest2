package com.sofascore.results.profile;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.cardview.widget.CardView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.sofascore.common.mvvm.UnderlinedToolbar;
import com.sofascore.local_persistance.UserAccount;
import com.sofascore.model.profile.UserBadge;
import com.sofascore.results.R;
import com.sofascore.results.feedback.FeedbackActivity;
import com.sofascore.results.mvvm.base.AbstractActivity;
import com.sofascore.results.profile.UserProfileActivity;
import com.sofascore.results.profile.predictions.ProfilePredictionsActivity;
import com.sofascore.results.profile.topLeaderboards.ProfileTopLeaderboardsActivity;
import com.sofascore.results.profile.view.BadgesInfoBottomSheet;
import com.sofascore.results.profile.view.ProfileClickableRowView;
import com.sofascore.results.settings.SettingsActivity;
import com.sofascore.results.view.header.CollapsibleProfileHeaderView;
import com.sofascore.results.weeklyChallenge.WeeklyChallengeActivity;
import defpackage.a99;
import defpackage.agk;
import defpackage.ce;
import defpackage.cf;
import defpackage.de;
import defpackage.djf;
import defpackage.duf;
import defpackage.fej;
import defpackage.fuf;
import defpackage.hta;
import defpackage.ia0;
import defpackage.ioe;
import defpackage.joa;
import defpackage.kuj;
import defpackage.mj5;
import defpackage.mqi;
import defpackage.nv;
import defpackage.ogj;
import defpackage.ok3;
import defpackage.otk;
import defpackage.p4h;
import defpackage.pdk;
import defpackage.pfk;
import defpackage.qfk;
import defpackage.r1;
import defpackage.r8f;
import defpackage.rq3;
import defpackage.ta0;
import defpackage.tc3;
import defpackage.u4g;
import defpackage.un0;
import defpackage.vak;
import defpackage.vfk;
import defpackage.wca;
import defpackage.wlj;
import defpackage.xw3;
import defpackage.yhk;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z8e;
import defpackage.zsk;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\u0010²\u0006\f\u0010\u000b\u001a\u00020\n8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\r\u001a\u0004\u0018\u00010\f8\nX\u008a\u0084\u0002²\u0006\f\u0010\u000f\u001a\u00020\u000e8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/sofascore/results/profile/UserProfileActivity;", "Lcom/sofascore/results/mvvm/base/AbstractActivity;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "Landroid/view/View;", "v", "", "onClick", "(Landroid/view/View;)V", "Lush;", "bannerState", "Lcom/sofascore/model/profile/ReferralResponse;", "referralDetails", "", "isUserReferred", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UserProfileActivity extends Hilt_UserProfileActivity implements View.OnClickListener {
    public static final /* synthetic */ int S = 0;
    public final mqi K;
    public final otk L;
    public final otk M;
    public final joa N;
    public boolean O;
    public boolean P;
    public final de Q;
    public final joa R;

    public UserProfileActivity() {
        int i = 4;
        this.K = ypa.b(new pfk(this, i));
        new vak(this);
        vfk vfkVar = new vfk(this, 0);
        fuf fufVar = duf.a;
        this.L = new otk(fufVar.getOrCreateKotlinClass(agk.class), new vfk(this, 1), vfkVar, new vfk(this, 2));
        int i2 = 3;
        int i3 = 5;
        this.M = new otk(fufVar.getOrCreateKotlinClass(u4g.class), new vfk(this, i), new vfk(this, i2), new vfk(this, i3));
        pfk pfkVar = new pfk(this, i3);
        ysa ysaVar = ysa.c;
        this.N = ypa.a(ysaVar, pfkVar);
        this.Q = registerForActivityResult(new ce(i2), new ogj(this));
        this.R = ypa.a(ysaVar, new pfk(this, 6));
    }

    public final cf Q() {
        return (cf) this.K.getValue();
    }

    public final agk R() {
        return (agk) this.L.getValue();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@NotNull View v) {
        v.getClass();
        if (z8e.T(v, 1000L)) {
            int id = v.getId();
            if (id == R.id.weekly_challenge) {
                nv.e0(this, hta.WEEKLY_CHALLENGE, "profile");
                startActivity(new Intent(this, (Class<?>) WeeklyChallengeActivity.class));
                return;
            }
            rq3 rq3Var = null;
            if (id == R.id.editor) {
                nv.m0(this, "editor", "own_profile");
                Intent intent = new Intent(this, (Class<?>) ProfileDetailsActivity.class);
                intent.putExtra("screen_name", "profile_editor");
                intent.putExtra("OPEN_PROFILE_ID", (String) null);
                startActivity(intent);
                return;
            }
            if (id == R.id.my_predictions) {
                nv.m0(this, "predictions", "own_profile");
                Intent intent2 = new Intent(this, (Class<?>) ProfilePredictionsActivity.class);
                intent2.putExtra("OPEN_PROFILE_ID", (String) null);
                startActivity(intent2);
                return;
            }
            if (id == R.id.contributions) {
                nv.m0(this, "contributions", "own_profile");
                Intent intent3 = new Intent(this, (Class<?>) ProfileDetailsActivity.class);
                intent3.putExtra("screen_name", "contribution_performance");
                intent3.putExtra("OPEN_PROFILE_ID", (String) null);
                startActivity(intent3);
                return;
            }
            if (id == R.id.leaderboards) {
                nv.e0(this, hta.TOP_PREDICTORS, "profile");
                Intent intent4 = new Intent(this, (Class<?>) ProfileTopLeaderboardsActivity.class);
                intent4.putExtra("INITIAL_TAB", (Serializable) null);
                startActivity(intent4);
                return;
            }
            if (id == R.id.badges_info) {
                BadgesInfoBottomSheet badgesInfoBottomSheet = new BadgesInfoBottomSheet();
                UserProfileActivity userProfileActivity = this instanceof AppCompatActivity ? this : null;
                if (userProfileActivity != null) {
                    wca.x(userProfileActivity.getLifecycle()).b(new r1(badgesInfoBottomSheet, userProfileActivity, rq3Var, 3));
                    return;
                }
                return;
            }
            if (id == R.id.faq) {
                nv.m0(this, "FAQ", "own_profile");
                p4h.w(this, "https://sofascore.helpscoutdocs.com/");
            } else if (id == R.id.feedback) {
                nv.m0(this, "give_feedback", "own_profile");
                startActivity(new Intent(this, (Class<?>) FeedbackActivity.class));
            }
        }
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity, com.sofascore.results.base.BaseActivity, com.sofascore.results.base.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(Q().a);
        AbstractActivity.M(this, Q().l, getString(R.string.profile), null, null, 60);
        ((UnderlinedToolbar) Q().l.c).setBackground(null);
        this.o = Q().h;
        djf djfVar = Q().g;
        ((ProfileClickableRowView) djfVar.g).setOnClickListener(this);
        ((ProfileClickableRowView) djfVar.d).setOnClickListener(this);
        ((ProfileClickableRowView) djfVar.f).setOnClickListener(this);
        ((ProfileClickableRowView) djfVar.c).setOnClickListener(this);
        ((ProfileClickableRowView) djfVar.e).setOnClickListener(this);
        Q().d.b.setOnClickListener(this);
        Q().e.setOnClickListener(this);
        Q().f.setOnClickListener(this);
        Q().c.setAdapter((r8f) this.N.getValue());
        Q().b.setupWithViewPager(Q().c);
        final int i = 1;
        R().s.e(this, new ioe(26, new Function1(this) { // from class: rfk
            public final /* synthetic */ UserProfileActivity b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:75:0x0225  */
            /* JADX WARN: Removed duplicated region for block: B:95:0x0229  */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke(Object obj) {
                Object[] objArr;
                int i2 = i;
                char c = 1;
                UserProfileActivity userProfileActivity = this.b;
                switch (i2) {
                    case 0:
                        int i3 = UserProfileActivity.S;
                        int i4 = tfk.a[((cg) obj).a.ordinal()];
                        joa joaVar = userProfileActivity.R;
                        if (i4 == 1) {
                            ((yk) joaVar.getValue()).show();
                        } else {
                            ((yk) joaVar.getValue()).dismiss();
                        }
                        return Unit.a;
                    default:
                        UserAccount userAccount = (UserAccount) obj;
                        int i5 = UserProfileActivity.S;
                        userAccount.getClass();
                        CollapsibleProfileHeaderView collapsibleProfileHeaderView = userProfileActivity.Q().i;
                        pfk pfkVar = new pfk(userProfileActivity, 3);
                        sfk sfkVar = new sfk(userProfileActivity, userAccount, 0);
                        sfk sfkVar2 = new sfk(userProfileActivity, userAccount, c == true ? 1 : 0);
                        bv1 bv1Var = collapsibleProfileHeaderView.a;
                        TextView textView = (TextView) bv1Var.d;
                        FrameLayout frameLayout = (FrameLayout) bv1Var.h;
                        ImageView imageView = (ImageView) bv1Var.f;
                        textView.setVisibility((!userAccount.getIsLoggedIn() || userAccount.getJoinDate() == 0) ? 8 : 0);
                        if (userAccount.getJoinDate() != 0) {
                            long joinDate = userAccount.getJoinDate();
                            bi4 bi4Var = bi4.PATTERN_DMY;
                            ConcurrentHashMap concurrentHashMap = hk4.a;
                            ((TextView) bv1Var.d).setText(collapsibleProfileHeaderView.getContext().getString(R.string.joined, fc6.i(joinDate, hk4.a(bi4Var.d()))));
                        }
                        as9.t(imageView, userAccount.getImageUrl());
                        collapsibleProfileHeaderView.setUserName(userAccount.getNickname());
                        if (userAccount.getIsLoggedIn()) {
                            frameLayout.removeAllViews();
                            TypedValue typedValue = new TypedValue();
                            imageView.getContext().getTheme().resolveAttribute(android.R.attr.selectableItemBackgroundBorderless, typedValue, true);
                            imageView.setBackgroundResource(typedValue.resourceId);
                            z8e.a0(imageView, 1000L, new yj1(sfkVar, 23));
                        } else {
                            if (frameLayout.getChildCount() == 0) {
                                View inflate = LayoutInflater.from(collapsibleProfileHeaderView.getContext()).inflate(R.layout.view_profile_header_unregistered, (ViewGroup) null, false);
                                AppCompatButton appCompatButton = (AppCompatButton) nq8.B(R.id.button_sign_in, inflate);
                                if (appCompatButton == null) {
                                    yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.button_sign_in)));
                                    return null;
                                }
                                appCompatButton.setOnClickListener(new s0(pfkVar, 15));
                                frameLayout.addView((LinearLayout) inflate);
                                collapsibleProfileHeaderView.b(null, false, null);
                            }
                            imageView.setBackground(null);
                            imageView.setOnClickListener(null);
                        }
                        ((ConstraintLayout) bv1Var.b).setVisibility(userAccount.getIsLoggedIn() ? 0 : 8);
                        MaterialButton materialButton = (MaterialButton) bv1Var.j;
                        materialButton.setVisibility(0);
                        z8e.a0(materialButton, 1000L, new yj1(sfkVar2, 24));
                        djf djfVar2 = userProfileActivity.Q().g;
                        ((ProfileClickableRowView) djfVar2.d).setVisibility(userAccount.getIsEditor() ? 0 : 8);
                        ((ProfileClickableRowView) djfVar2.c).setVisibility(userAccount.getIsActiveCrowdsourcer() ? 0 : 8);
                        ((CardView) djfVar2.b).setVisibility(userAccount.getIsLoggedIn() ? 0 : 8);
                        userProfileActivity.Q().c.setVisibility((!userAccount.getIsLoggedIn() || ((r8f) userProfileActivity.N.getValue()).getItemCount() <= 0) ? 8 : 0);
                        userProfileActivity.Q().i.b(UserBadge.INSTANCE.get(userAccount.getUserBadge()), userAccount.getIsEditor(), userAccount.getEditorName());
                        SharedPreferences sharedPreferences = uic.j;
                        if (sharedPreferences == null) {
                            Context applicationContext = userProfileActivity.getApplicationContext();
                            synchronized (uic.i) {
                                sharedPreferences = a5f.d(applicationContext);
                                uic.j = sharedPreferences;
                            }
                            sharedPreferences.getClass();
                        }
                        if (sharedPreferences.getBoolean("IN_APP_PURCHASE_AVAILABLE", true)) {
                            UserAccount userAccount2 = (UserAccount) userProfileActivity.R().s.d();
                            if (!Intrinsics.c(userAccount2 != null ? Boolean.valueOf(jca.G(userAccount2)) : null, Boolean.FALSE)) {
                                SharedPreferences sharedPreferences2 = uic.j;
                                if (sharedPreferences2 == null) {
                                    Context applicationContext2 = userProfileActivity.getApplicationContext();
                                    synchronized (uic.i) {
                                        sharedPreferences2 = a5f.d(applicationContext2);
                                        uic.j = sharedPreferences2;
                                    }
                                    sharedPreferences2.getClass();
                                }
                                String string = sharedPreferences2.getString("PR_XAIST", null);
                                if (string == null || string.length() == 0) {
                                    objArr = false;
                                    userProfileActivity.Q().m.b.setVisibility(0);
                                    userProfileActivity.Q().m.c.setText(objArr == false ? R.string.view_subscription_plans : R.string.upgrade_sofascore);
                                }
                            }
                            objArr = true;
                            userProfileActivity.Q().m.b.setVisibility(0);
                            userProfileActivity.Q().m.c.setText(objArr == false ? R.string.view_subscription_plans : R.string.upgrade_sofascore);
                        } else {
                            userProfileActivity.Q().m.b.setVisibility(8);
                        }
                        if (userAccount.getIsLoggedIn() && !userProfileActivity.O) {
                            userProfileActivity.O = true;
                            boolean z = ((r8f) userProfileActivity.N.getValue()).getItemCount() > 1;
                            userProfileActivity.Q().c.setUserInputEnabled(z);
                            userProfileActivity.Q().b.setVisibility(z ? 0 : 8);
                        } else if (!userAccount.getIsLoggedIn() && userProfileActivity.O) {
                            userProfileActivity.O = false;
                            ((r8f) userProfileActivity.N.getValue()).s();
                            userProfileActivity.Q().b.setVisibility(8);
                        }
                        return Unit.a;
                }
            }
        }));
        z8e.x(this, R().v, new pdk(this, null, 3));
        ComposeView composeView = Q().k;
        a99 a99Var = a99.i;
        composeView.setViewCompositionStrategy(a99Var);
        composeView.setContent(new tc3(-1878365591, new qfk(this, composeView, 2), true));
        final int i2 = 0;
        zsk zskVar = new zsk(getLifecycle(), 0);
        zskVar.b(composeView, new fej(13, this, zskVar), new pfk(this, i));
        ComposeView composeView2 = Q().j;
        composeView2.setViewCompositionStrategy(a99Var);
        composeView2.setContent(new tc3(306514515, new qfk(this, composeView2, i2), true));
        R().m.e(this, new ioe(26, new wlj(1, this, UserProfileActivity.class, "onProfileResponseReceived", "onProfileResponseReceived(Lcom/sofascore/model/profile/ProfileData;)V", 0, 4)));
        ((u4g) this.M.getValue()).l.e(this, new ioe(26, new Function1(this) { // from class: rfk
            public final /* synthetic */ UserProfileActivity b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:75:0x0225  */
            /* JADX WARN: Removed duplicated region for block: B:95:0x0229  */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke(Object obj) {
                Object[] objArr;
                int i22 = i2;
                char c = 1;
                UserProfileActivity userProfileActivity = this.b;
                switch (i22) {
                    case 0:
                        int i3 = UserProfileActivity.S;
                        int i4 = tfk.a[((cg) obj).a.ordinal()];
                        joa joaVar = userProfileActivity.R;
                        if (i4 == 1) {
                            ((yk) joaVar.getValue()).show();
                        } else {
                            ((yk) joaVar.getValue()).dismiss();
                        }
                        return Unit.a;
                    default:
                        UserAccount userAccount = (UserAccount) obj;
                        int i5 = UserProfileActivity.S;
                        userAccount.getClass();
                        CollapsibleProfileHeaderView collapsibleProfileHeaderView = userProfileActivity.Q().i;
                        pfk pfkVar = new pfk(userProfileActivity, 3);
                        sfk sfkVar = new sfk(userProfileActivity, userAccount, 0);
                        sfk sfkVar2 = new sfk(userProfileActivity, userAccount, c == true ? 1 : 0);
                        bv1 bv1Var = collapsibleProfileHeaderView.a;
                        TextView textView = (TextView) bv1Var.d;
                        FrameLayout frameLayout = (FrameLayout) bv1Var.h;
                        ImageView imageView = (ImageView) bv1Var.f;
                        textView.setVisibility((!userAccount.getIsLoggedIn() || userAccount.getJoinDate() == 0) ? 8 : 0);
                        if (userAccount.getJoinDate() != 0) {
                            long joinDate = userAccount.getJoinDate();
                            bi4 bi4Var = bi4.PATTERN_DMY;
                            ConcurrentHashMap concurrentHashMap = hk4.a;
                            ((TextView) bv1Var.d).setText(collapsibleProfileHeaderView.getContext().getString(R.string.joined, fc6.i(joinDate, hk4.a(bi4Var.d()))));
                        }
                        as9.t(imageView, userAccount.getImageUrl());
                        collapsibleProfileHeaderView.setUserName(userAccount.getNickname());
                        if (userAccount.getIsLoggedIn()) {
                            frameLayout.removeAllViews();
                            TypedValue typedValue = new TypedValue();
                            imageView.getContext().getTheme().resolveAttribute(android.R.attr.selectableItemBackgroundBorderless, typedValue, true);
                            imageView.setBackgroundResource(typedValue.resourceId);
                            z8e.a0(imageView, 1000L, new yj1(sfkVar, 23));
                        } else {
                            if (frameLayout.getChildCount() == 0) {
                                View inflate = LayoutInflater.from(collapsibleProfileHeaderView.getContext()).inflate(R.layout.view_profile_header_unregistered, (ViewGroup) null, false);
                                AppCompatButton appCompatButton = (AppCompatButton) nq8.B(R.id.button_sign_in, inflate);
                                if (appCompatButton == null) {
                                    yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.button_sign_in)));
                                    return null;
                                }
                                appCompatButton.setOnClickListener(new s0(pfkVar, 15));
                                frameLayout.addView((LinearLayout) inflate);
                                collapsibleProfileHeaderView.b(null, false, null);
                            }
                            imageView.setBackground(null);
                            imageView.setOnClickListener(null);
                        }
                        ((ConstraintLayout) bv1Var.b).setVisibility(userAccount.getIsLoggedIn() ? 0 : 8);
                        MaterialButton materialButton = (MaterialButton) bv1Var.j;
                        materialButton.setVisibility(0);
                        z8e.a0(materialButton, 1000L, new yj1(sfkVar2, 24));
                        djf djfVar2 = userProfileActivity.Q().g;
                        ((ProfileClickableRowView) djfVar2.d).setVisibility(userAccount.getIsEditor() ? 0 : 8);
                        ((ProfileClickableRowView) djfVar2.c).setVisibility(userAccount.getIsActiveCrowdsourcer() ? 0 : 8);
                        ((CardView) djfVar2.b).setVisibility(userAccount.getIsLoggedIn() ? 0 : 8);
                        userProfileActivity.Q().c.setVisibility((!userAccount.getIsLoggedIn() || ((r8f) userProfileActivity.N.getValue()).getItemCount() <= 0) ? 8 : 0);
                        userProfileActivity.Q().i.b(UserBadge.INSTANCE.get(userAccount.getUserBadge()), userAccount.getIsEditor(), userAccount.getEditorName());
                        SharedPreferences sharedPreferences = uic.j;
                        if (sharedPreferences == null) {
                            Context applicationContext = userProfileActivity.getApplicationContext();
                            synchronized (uic.i) {
                                sharedPreferences = a5f.d(applicationContext);
                                uic.j = sharedPreferences;
                            }
                            sharedPreferences.getClass();
                        }
                        if (sharedPreferences.getBoolean("IN_APP_PURCHASE_AVAILABLE", true)) {
                            UserAccount userAccount2 = (UserAccount) userProfileActivity.R().s.d();
                            if (!Intrinsics.c(userAccount2 != null ? Boolean.valueOf(jca.G(userAccount2)) : null, Boolean.FALSE)) {
                                SharedPreferences sharedPreferences2 = uic.j;
                                if (sharedPreferences2 == null) {
                                    Context applicationContext2 = userProfileActivity.getApplicationContext();
                                    synchronized (uic.i) {
                                        sharedPreferences2 = a5f.d(applicationContext2);
                                        uic.j = sharedPreferences2;
                                    }
                                    sharedPreferences2.getClass();
                                }
                                String string = sharedPreferences2.getString("PR_XAIST", null);
                                if (string == null || string.length() == 0) {
                                    objArr = false;
                                    userProfileActivity.Q().m.b.setVisibility(0);
                                    userProfileActivity.Q().m.c.setText(objArr == false ? R.string.view_subscription_plans : R.string.upgrade_sofascore);
                                }
                            }
                            objArr = true;
                            userProfileActivity.Q().m.b.setVisibility(0);
                            userProfileActivity.Q().m.c.setText(objArr == false ? R.string.view_subscription_plans : R.string.upgrade_sofascore);
                        } else {
                            userProfileActivity.Q().m.b.setVisibility(8);
                        }
                        if (userAccount.getIsLoggedIn() && !userProfileActivity.O) {
                            userProfileActivity.O = true;
                            boolean z = ((r8f) userProfileActivity.N.getValue()).getItemCount() > 1;
                            userProfileActivity.Q().c.setUserInputEnabled(z);
                            userProfileActivity.Q().b.setVisibility(z ? 0 : 8);
                        } else if (!userAccount.getIsLoggedIn() && userProfileActivity.O) {
                            userProfileActivity.O = false;
                            ((r8f) userProfileActivity.N.getValue()).s();
                            userProfileActivity.Q().b.setVisibility(8);
                        }
                        return Unit.a;
                }
            }
        }));
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.profile_settings_menu, menu);
        return true;
    }

    @Override // com.sofascore.results.base.BaseActivity, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() == R.id.action_settings) {
            nv.m0(this, "settings", "own_profile");
            Intent intent = new Intent(this, (Class<?>) SettingsActivity.class);
            intent.putExtra("open", (String) null);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // com.sofascore.results.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        R().h.a();
    }

    @Override // com.sofascore.results.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        agk R = R();
        rq3 rq3Var = null;
        xw3.L(un0.z(R), null, null, new pdk(R, rq3Var, 5), 3);
        int i = 14;
        xw3.L(un0.z(R), null, null, new mj5(R, rq3Var, i), 3);
        z8e.a0(Q().m.b, 1000L, new pfk(this, 0));
        agk R2 = R();
        xw3.L(un0.z(R2), null, null, new kuj(R2, rq3Var, 6), 3);
        agk R3 = R();
        xw3.L(un0.z(R3), null, null, new mj5(R3, rq3Var, i), 3);
        CollapsibleProfileHeaderView collapsibleProfileHeaderView = Q().i;
        ViewGroup.LayoutParams layoutParams = collapsibleProfileHeaderView.getLayoutParams();
        if (layoutParams == null) {
            yhk.s("null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout.LayoutParams");
            return;
        }
        ta0 ta0Var = (ta0) layoutParams;
        ia0 ia0Var = ia0.q;
        ta0Var.a = ok3.p().e().getIsLoggedIn() ? 19 : 0;
        collapsibleProfileHeaderView.setLayoutParams(ta0Var);
    }

    @Override // com.sofascore.results.base.BaseActivity
    public final String u() {
        return "ProfileScreen";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity
    public final void N() {
    }
}
