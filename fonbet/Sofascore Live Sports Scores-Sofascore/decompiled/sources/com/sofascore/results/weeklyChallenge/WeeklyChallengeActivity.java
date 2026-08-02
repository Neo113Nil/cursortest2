package com.sofascore.results.weeklyChallenge;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import com.sofascore.common.mvvm.UnderlinedToolbar;
import com.sofascore.results.R;
import com.sofascore.results.mvvm.base.AbstractActivity;
import com.sofascore.results.service.WeeklyChallengeWorker;
import com.sofascore.results.weeklyChallenge.WeeklyChallengeActivity;
import com.sofascore.results.weeklyChallenge.WeeklyChallengeViewModel;
import com.sofascore.results.weeklyChallenge.leaderboard.LeaderboardInfoModal;
import com.sofascore.results.weeklyChallenge.ui.components.bottomSheet.WeeklyChallengeNotificationsBottomSheet;
import defpackage.bti;
import defpackage.duf;
import defpackage.eq3;
import defpackage.fgd;
import defpackage.hkg;
import defpackage.j4l;
import defpackage.joa;
import defpackage.k4l;
import defpackage.ktd;
import defpackage.ltd;
import defpackage.mha;
import defpackage.mqi;
import defpackage.nf6;
import defpackage.otk;
import defpackage.p15;
import defpackage.p2l;
import defpackage.qdj;
import defpackage.r1;
import defpackage.rq3;
import defpackage.sy0;
import defpackage.vxd;
import defpackage.wca;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.zzc;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/weeklyChallenge/WeeklyChallengeActivity;", "Lcom/sofascore/results/mvvm/base/AbstractActivity;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WeeklyChallengeActivity extends AbstractActivity {
    public static final /* synthetic */ int O = 0;
    public final mqi J;
    public final otk K = new otk(duf.a.getOrCreateKotlinClass(WeeklyChallengeViewModel.class), new p2l(this, 1), new p2l(this, 0), new p2l(this, 2));
    public final joa L;
    public MenuItem M;
    public MenuItem N;

    public WeeklyChallengeActivity() {
        final int i = 0;
        this.J = ypa.b(new Function0(this) { // from class: o2l
            public final /* synthetic */ WeeklyChallengeActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                WeeklyChallengeActivity weeklyChallengeActivity = this.b;
                switch (i2) {
                    case 0:
                        int i3 = WeeklyChallengeActivity.O;
                        return bti.a(weeklyChallengeActivity.getLayoutInflater());
                    default:
                        int i4 = WeeklyChallengeActivity.O;
                        return new k4l(weeklyChallengeActivity, weeklyChallengeActivity.Q().i, weeklyChallengeActivity.Q().g);
                }
            }
        });
        final int i2 = 1;
        this.L = ypa.a(ysa.c, new Function0(this) { // from class: o2l
            public final /* synthetic */ WeeklyChallengeActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                WeeklyChallengeActivity weeklyChallengeActivity = this.b;
                switch (i22) {
                    case 0:
                        int i3 = WeeklyChallengeActivity.O;
                        return bti.a(weeklyChallengeActivity.getLayoutInflater());
                    default:
                        int i4 = WeeklyChallengeActivity.O;
                        return new k4l(weeklyChallengeActivity, weeklyChallengeActivity.Q().i, weeklyChallengeActivity.Q().g);
                }
            }
        });
    }

    public final bti Q() {
        return (bti) this.J.getValue();
    }

    public final void R() {
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 33 ? eq3.b(this, "android.permission.POST_NOTIFICATIONS") == 0 : new fgd(this).b.areNotificationsEnabled()) {
            NotificationManager notificationManager = (NotificationManager) getSystemService(NotificationManager.class);
            NotificationChannel notificationChannel = notificationManager != null ? notificationManager.getNotificationChannel("user_weekly_challenge") : null;
            if ((notificationChannel == null || notificationChannel.getImportance() == 0) ? false : true) {
                z = true;
            }
        }
        MenuItem menuItem = this.N;
        if (menuItem != null) {
            menuItem.setVisible(z);
        }
        MenuItem menuItem2 = this.M;
        if (menuItem2 != null) {
            menuItem2.setVisible(!z);
        }
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity, com.sofascore.results.base.BaseActivity, com.sofascore.results.base.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(Q().a);
        H((UnderlinedToolbar) Q().h.c);
        String string = getString(R.string.weekly_challenge);
        string.getClass();
        setTitle(string);
        AbstractActivity.O(Q().g, Integer.valueOf(hkg.X(this)), getColor(R.color.on_color_primary));
        Q().c.setBackground(sy0.a);
        joa joaVar = this.L;
        ((k4l) joaVar.getValue()).x(j4l.d);
        Q().i.setAdapter((k4l) joaVar.getValue());
        int D = ((k4l) joaVar.getValue()).D(j4l.b);
        Integer valueOf = Integer.valueOf(D);
        if (D < 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            Q().i.c(valueOf.intValue(), false);
        }
        zzc zzcVar = ((WeeklyChallengeViewModel) this.K.getValue()).E;
        p15 p15Var = new p15(new qdj(this, 16), 1);
        zzcVar.getClass();
        zzcVar.a.e(this, p15Var);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        getMenuInflater().inflate(R.menu.activity_weekly_competition_menu, menu);
        this.N = menu.findItem(R.id.menu_disable_notifications);
        this.M = menu.findItem(R.id.menu_enable_notifications);
        R();
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.sofascore.results.base.BaseActivity, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        int i = 3;
        rq3 rq3Var = null;
        if (itemId == R.id.menu_leaderboard_info) {
            WeeklyChallengeViewModel.LeaderboardInfoType leaderboardInfoType = WeeklyChallengeViewModel.LeaderboardInfoType.FULL_LEADERBOARD_INFO;
            leaderboardInfoType.getClass();
            LeaderboardInfoModal leaderboardInfoModal = new LeaderboardInfoModal();
            Bundle bundle = new Bundle();
            bundle.putSerializable("info_type", leaderboardInfoType);
            leaderboardInfoModal.setArguments(bundle);
            WeeklyChallengeActivity weeklyChallengeActivity = this instanceof AppCompatActivity ? this : null;
            if (weeklyChallengeActivity != null) {
                wca.x(weeklyChallengeActivity.getLifecycle()).b(new r1(leaderboardInfoModal, weeklyChallengeActivity, rq3Var, i));
            }
        } else if (itemId == R.id.menu_enable_notifications) {
            WeeklyChallengeNotificationsBottomSheet weeklyChallengeNotificationsBottomSheet = new WeeklyChallengeNotificationsBottomSheet();
            WeeklyChallengeActivity weeklyChallengeActivity2 = this instanceof AppCompatActivity ? this : null;
            if (weeklyChallengeActivity2 != null) {
                wca.x(weeklyChallengeActivity2.getLifecycle()).b(new r1(weeklyChallengeNotificationsBottomSheet, weeklyChallengeActivity2, rq3Var, i));
            }
        } else if (itemId == R.id.menu_disable_notifications) {
            WeeklyChallengeNotificationsBottomSheet weeklyChallengeNotificationsBottomSheet2 = new WeeklyChallengeNotificationsBottomSheet();
            WeeklyChallengeActivity weeklyChallengeActivity3 = this instanceof AppCompatActivity ? this : null;
            if (weeklyChallengeActivity3 != null) {
                wca.x(weeklyChallengeActivity3.getLifecycle()).b(new r1(weeklyChallengeNotificationsBottomSheet2, weeklyChallengeActivity3, rq3Var, i));
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // com.sofascore.results.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        R();
    }

    @Override // com.sofascore.results.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
        Context applicationContext = getApplicationContext();
        applicationContext.getClass();
        ktd A = mha.A(new ktd(WeeklyChallengeWorker.class));
        mha.y(A);
        vxd.h(applicationContext).b("WeeklyChallengeWorker-".concat(""), nf6.a, (ltd) A.a());
    }

    @Override // com.sofascore.results.base.BaseActivity
    public final String u() {
        return "ChallengeScreen";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity
    public final void N() {
    }
}
