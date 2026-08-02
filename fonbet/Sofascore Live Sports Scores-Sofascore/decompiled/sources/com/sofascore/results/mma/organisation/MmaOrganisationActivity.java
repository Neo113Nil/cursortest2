package com.sofascore.results.mma.organisation;

import android.app.assist.AssistContent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import com.sofascore.model.Sports;
import com.sofascore.model.favorites.FavoritesEventsData;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.results.R;
import com.sofascore.results.mvvm.base.AbstractActivity;
import com.sofascore.results.view.follownotification.FollowActionButton;
import com.sofascore.results.view.follownotification.NotificationsActionButton;
import defpackage.a66;
import defpackage.bpc;
import defpackage.cpc;
import defpackage.cqc;
import defpackage.dpc;
import defpackage.duf;
import defpackage.fpc;
import defpackage.kr9;
import defpackage.mnc;
import defpackage.mqi;
import defpackage.mz1;
import defpackage.otk;
import defpackage.rq3;
import defpackage.tub;
import defpackage.u8f;
import defpackage.un0;
import defpackage.v9b;
import defpackage.xw3;
import defpackage.ypa;
import defpackage.z1;
import defpackage.z8e;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/mma/organisation/MmaOrganisationActivity;", "Lcom/sofascore/results/mvvm/base/CollapsibleToolbarActivity;", "<init>", "()V", "inb", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MmaOrganisationActivity extends Hilt_MmaOrganisationActivity {
    public static final /* synthetic */ int T = 0;
    public final mqi M;
    public final otk N;
    public boolean O;
    public final mqi P;
    public Function0 Q;
    public NotificationsActionButton R;
    public FollowActionButton S;

    public MmaOrganisationActivity() {
        int i = 0;
        this.M = ypa.b(new bpc(this, i));
        int i2 = 1;
        int i3 = 2;
        this.N = new otk(duf.a.getOrCreateKotlinClass(fpc.class), new dpc(this, i2), new dpc(this, i), new dpc(this, i3));
        this.P = ypa.b(new bpc(this, i2));
        this.Q = new bpc(this, i3);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity
    public final void N() {
        fpc X = X();
        xw3.L(un0.z(X), null, null, new a66(X, null), 3);
    }

    public final fpc X() {
        return (fpc) this.N.getValue();
    }

    public final void Y(UniqueTournament uniqueTournament) {
        if (uniqueTournament == null) {
            return;
        }
        FavoritesEventsData favoritesEventsData = (FavoritesEventsData) X().l.a.getValue();
        int id = uniqueTournament.getId();
        FollowActionButton followActionButton = this.S;
        if (id <= 0) {
            if (followActionButton != null) {
                followActionButton.setVisibility(8);
            }
            NotificationsActionButton notificationsActionButton = this.R;
            if (notificationsActionButton != null) {
                notificationsActionButton.setVisibility(8);
                return;
            }
            return;
        }
        if (followActionButton != null) {
            followActionButton.setVisibility(0);
        }
        NotificationsActionButton notificationsActionButton2 = this.R;
        if (notificationsActionButton2 != null) {
            notificationsActionButton2.setVisibility(0);
        }
        FollowActionButton followActionButton2 = this.S;
        if (followActionButton2 != null) {
            followActionButton2.h(uniqueTournament, favoritesEventsData);
        }
        NotificationsActionButton notificationsActionButton3 = this.R;
        if (notificationsActionButton3 != null) {
            int i = NotificationsActionButton.g;
            notificationsActionButton3.i(uniqueTournament, favoritesEventsData, false);
        }
    }

    @Override // com.sofascore.results.mvvm.base.CollapsibleToolbarActivity, com.sofascore.results.mvvm.base.AbstractActivity, com.sofascore.results.base.BaseActivity, com.sofascore.results.base.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.o = Q().g;
        I(Q().b, tub.h(new Pair(SearchResponseKt.SPORT_ENTITY, Sports.MMA), new Pair("unique_tournament_id", String.valueOf(((Number) this.M.getValue()).intValue()))));
        Q().k.setAdapter((cqc) this.P.getValue());
        AbstractActivity.P(Q().h, 0, 4);
        Q().l.setOnChildScrollUpCallback(new u8f(3));
        Q().l.setOnRefreshListener(new kr9(this, 12));
        X().j.e(this, new z1(25, new v9b(1, this, MmaOrganisationActivity.class, "onHeadersResponseReceived", "onHeadersResponseReceived(Lcom/sofascore/model/mvvm/model/MmaOrganisationHeadFlags;)V", 0, 15)));
        X().h.e(this, new z1(25, new mnc(this, 4)));
        rq3 rq3Var = null;
        z8e.x(this, X().k, new cpc(this, rq3Var, 0));
        z8e.x(this, X().l, new cpc(this, rq3Var, 1));
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        getMenuInflater().inflate(R.menu.activity_favorite_notification_menu, menu);
        View actionView = menu.findItem(R.id.add_to_favorites).getActionView();
        this.S = actionView != null ? (FollowActionButton) actionView.findViewById(R.id.follow_button) : null;
        View actionView2 = menu.findItem(R.id.receive_notifications).getActionView();
        this.R = actionView2 != null ? (NotificationsActionButton) actionView2.findViewById(R.id.notifications_button) : null;
        return true;
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        menu.getClass();
        Y((UniqueTournament) X().h.d());
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // android.app.Activity
    public final void onProvideAssistContent(AssistContent assistContent) {
        assistContent.getClass();
        super.onProvideAssistContent(assistContent);
        UniqueTournament uniqueTournament = (UniqueTournament) X().h.d();
        if (uniqueTournament != null) {
            assistContent.setWebUri(Uri.parse(String.format("%s%s%s", Arrays.copyOf(new Object[]{getString(R.string.share_link), uniqueTournament.getWebUrl(), ""}, 3))));
        }
    }

    @Override // com.sofascore.results.base.BaseActivity
    public final String u() {
        return "OrganisationScreen";
    }

    @Override // com.sofascore.results.base.BaseActivity
    public final String y() {
        return mz1.j(((Number) this.M.getValue()).intValue(), super.y(), " id:");
    }
}
