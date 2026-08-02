package com.sofascore.results.stagesport;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.ViewStub;
import androidx.viewpager2.widget.ViewPager2;
import com.android.billingclient.api.BillingClient;
import com.sofascore.model.favorites.FavoritesStagesData;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.StageSeason;
import com.sofascore.model.mvvm.model.UniqueStage;
import com.sofascore.results.R;
import com.sofascore.results.stagesport.StageDetailsActivity;
import com.sofascore.results.view.ToolbarBackgroundAppBarLayout;
import com.sofascore.results.view.follownotification.NotificationsActionButton;
import defpackage.chf;
import defpackage.deh;
import defpackage.duf;
import defpackage.fff;
import defpackage.gz8;
import defpackage.i5i;
import defpackage.ioe;
import defpackage.joa;
import defpackage.jp6;
import defpackage.l5i;
import defpackage.m1f;
import defpackage.mz1;
import defpackage.n4i;
import defpackage.o4i;
import defpackage.otk;
import defpackage.p2i;
import defpackage.pco;
import defpackage.q5a;
import defpackage.qhd;
import defpackage.rfi;
import defpackage.rq3;
import defpackage.u8f;
import defpackage.wy0;
import defpackage.z8e;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/stagesport/StageDetailsActivity;", "Lcom/sofascore/results/mvvm/base/CollapsibleToolbarActivity;", "<init>", "()V", BillingClient.FeatureType.PRODUCT_DETAILS, "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StageDetailsActivity extends Hilt_StageDetailsActivity {
    public static final fff T = new fff(2);
    public final otk M = new otk(duf.a.getOrCreateKotlinClass(n4i.class), new p2i(this, 1), new p2i(this, 0), new p2i(this, 2));
    public o4i N;
    public boolean O;
    public Stage P;
    public NotificationsActionButton Q;
    public List R;
    public jp6 S;

    public final n4i X() {
        return (n4i) this.M.getValue();
    }

    public final void Y(Stage stage) {
        Stage stageEvent = stage.getStageEvent();
        if (stageEvent == null) {
            stageEvent = stage;
        }
        this.P = stageEvent;
        StageSeason stageSeason = stage.getStageSeason();
        UniqueStage uniqueStage = stageSeason != null ? stageSeason.getUniqueStage() : null;
        if (uniqueStage != null) {
            ToolbarBackgroundAppBarLayout toolbarBackgroundAppBarLayout = Q().d;
            joa joaVar = l5i.a;
            i5i b = l5i.b(stage);
            toolbarBackgroundAppBarLayout.setBackground(b != null ? new wy0(uniqueStage.getId(), b.a) : new wy0(uniqueStage.getId(), uniqueStage.getName()));
        }
        Stage stage2 = this.P;
        Q().e.setVisibility(0);
        pco.G(Q().e, new deh(10, this, stage2));
        Q().e.y(0);
    }

    public final void Z(List list) {
        Stage stage;
        if (list == null || (stage = this.P) == null) {
            return;
        }
        FavoritesStagesData favoritesStagesData = (FavoritesStagesData) X().r.a.getValue();
        if (list.isEmpty()) {
            this.R = null;
            NotificationsActionButton notificationsActionButton = this.Q;
            if (notificationsActionButton != null) {
                int i = NotificationsActionButton.g;
                notificationsActionButton.setFollowableItem(stage);
                notificationsActionButton.h(favoritesStagesData);
                return;
            }
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Stage) it.next()).setStageEvent(stage);
        }
        this.R = list;
        NotificationsActionButton notificationsActionButton2 = this.Q;
        if (notificationsActionButton2 != null) {
            if (list.isEmpty()) {
                notificationsActionButton2.setFollowableItem(stage);
            } else {
                notificationsActionButton2.setFollowableItem(new qhd(stage, list));
            }
            notificationsActionButton2.h(favoritesStagesData);
        }
    }

    @Override // com.sofascore.results.mvvm.base.CollapsibleToolbarActivity, com.sofascore.results.mvvm.base.AbstractActivity, com.sofascore.results.base.BaseActivity, com.sofascore.results.base.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Q().h.setSelectedTabIndicatorColor(getColor(R.color.on_color_primary));
        Bundle extras = getIntent().getExtras();
        rq3 rq3Var = null;
        this.N = extras != null ? (o4i) gz8.M(extras, "INITIAL_TAB", o4i.class) : null;
        Q().l.setOnChildScrollUpCallback(new u8f(3));
        ViewStub viewStub = Q().g;
        X();
        this.o = viewStub;
        final int i = 0;
        q5a.H(this, Q().h, Q().k, new Function1(this) { // from class: o2i
            public final /* synthetic */ StageDetailsActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = i;
                StageDetailsActivity stageDetailsActivity = this.b;
                switch (i2) {
                    case 0:
                        o4i o4iVar = (o4i) obj;
                        fff fffVar = StageDetailsActivity.T;
                        o4iVar.getClass();
                        ViewPager2 viewPager2 = stageDetailsActivity.Q().k;
                        jp6 jp6Var = stageDetailsActivity.S;
                        if (jp6Var != null) {
                            return Boolean.valueOf(q5a.K(viewPager2, jp6Var.D(o4iVar)));
                        }
                        Intrinsics.i("viewPagerAdapter");
                        throw null;
                    default:
                        Stage stage = (Stage) obj;
                        fff fffVar2 = StageDetailsActivity.T;
                        stage.getClass();
                        stageDetailsActivity.Y(stage);
                        return Unit.a;
                }
            }
        }, new rfi(14));
        z8e.x(this, X().r, new m1f(this, rq3Var, 19));
        final int i2 = 1;
        X().m.e(this, new ioe(11, new Function1(this) { // from class: o2i
            public final /* synthetic */ StageDetailsActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i22 = i2;
                StageDetailsActivity stageDetailsActivity = this.b;
                switch (i22) {
                    case 0:
                        o4i o4iVar = (o4i) obj;
                        fff fffVar = StageDetailsActivity.T;
                        o4iVar.getClass();
                        ViewPager2 viewPager2 = stageDetailsActivity.Q().k;
                        jp6 jp6Var = stageDetailsActivity.S;
                        if (jp6Var != null) {
                            return Boolean.valueOf(q5a.K(viewPager2, jp6Var.D(o4iVar)));
                        }
                        Intrinsics.i("viewPagerAdapter");
                        throw null;
                    default:
                        Stage stage = (Stage) obj;
                        fff fffVar2 = StageDetailsActivity.T;
                        stage.getClass();
                        stageDetailsActivity.Y(stage);
                        return Unit.a;
                }
            }
        }));
        X().q.e(this, new ioe(11, new chf(1, this, StageDetailsActivity.class, "onHeadersResponseReceived", "onHeadersResponseReceived(Lcom/sofascore/results/stagesport/viewmodel/StageDetailsViewModel$StageDetailsHeadFlags;)V", 0, 13)));
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        getMenuInflater().inflate(R.menu.activity_stage_menu, menu);
        View actionView = menu.findItem(R.id.add_to_favorites).getActionView();
        this.Q = actionView != null ? (NotificationsActionButton) actionView.findViewById(R.id.notifications_button) : null;
        return true;
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        menu.getClass();
        Z(this.R);
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // com.sofascore.results.base.BaseActivity
    public final String u() {
        return "StageEventScreen";
    }

    @Override // com.sofascore.results.base.BaseActivity
    public final String y() {
        if (this.P == null) {
            return mz1.j(X().i, super.y(), " id:");
        }
        String y = super.y();
        Stage stage = this.P;
        return y + " id:" + (stage != null ? Integer.valueOf(stage.getId()) : null);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity
    public final void N() {
    }
}
