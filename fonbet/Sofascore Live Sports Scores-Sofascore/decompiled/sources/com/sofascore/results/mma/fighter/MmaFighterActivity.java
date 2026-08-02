package com.sofascore.results.mma.fighter;

import android.app.assist.AssistContent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.sofascore.model.favorites.FavoritesEventsData;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.results.R;
import com.sofascore.results.mma.fighter.editfighter.MmaEditFighterDialog;
import com.sofascore.results.view.follownotification.FollowActionButton;
import com.sofascore.results.view.follownotification.NotificationsActionButton;
import defpackage.aoc;
import defpackage.duf;
import defpackage.eqb;
import defpackage.fz8;
import defpackage.kr9;
import defpackage.mnc;
import defpackage.mqi;
import defpackage.mz1;
import defpackage.nnc;
import defpackage.onc;
import defpackage.otk;
import defpackage.pj7;
import defpackage.pnc;
import defpackage.rnc;
import defpackage.rq3;
import defpackage.u8f;
import defpackage.un0;
import defpackage.voc;
import defpackage.xw3;
import defpackage.ypa;
import defpackage.z8e;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/mma/fighter/MmaFighterActivity;", "Lcom/sofascore/results/mvvm/base/CollapsibleToolbarActivity;", "<init>", "()V", "f7a", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MmaFighterActivity extends Hilt_MmaFighterActivity {
    public static final /* synthetic */ int U = 0;
    public final mqi M;
    public final otk N;
    public final mqi O;
    public Function0 P;
    public MenuItem Q;
    public NotificationsActionButton R;
    public FollowActionButton S;
    public boolean T;

    public MmaFighterActivity() {
        int i = 0;
        this.M = ypa.b(new nnc(this, i));
        int i2 = 1;
        int i3 = 2;
        this.N = new otk(duf.a.getOrCreateKotlinClass(rnc.class), new pnc(this, i2), new pnc(this, i), new pnc(this, i3));
        this.O = ypa.b(new nnc(this, i2));
        this.P = new nnc(this, i3);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity
    public final void N() {
        rnc X = X();
        xw3.L(un0.z(X), null, null, new pj7(X, null), 3);
    }

    public final rnc X() {
        return (rnc) this.N.getValue();
    }

    public final Team Y() {
        aoc aocVar = (aoc) X().h.d();
        if (aocVar != null) {
            return aocVar.a;
        }
        return null;
    }

    public final void Z(Team team) {
        if (team == null) {
            return;
        }
        FavoritesEventsData favoritesEventsData = (FavoritesEventsData) X().j.a.getValue();
        boolean disabled = team.getDisabled();
        FollowActionButton followActionButton = this.S;
        if (disabled) {
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
            followActionButton2.h(team, favoritesEventsData);
        }
        NotificationsActionButton notificationsActionButton3 = this.R;
        if (notificationsActionButton3 != null) {
            int i = NotificationsActionButton.g;
            notificationsActionButton3.i(team, favoritesEventsData, false);
        }
    }

    @Override // com.sofascore.results.mvvm.base.CollapsibleToolbarActivity, com.sofascore.results.mvvm.base.AbstractActivity, com.sofascore.results.base.BaseActivity, com.sofascore.results.base.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.o = Q().g;
        Q().k.setAdapter((voc) this.O.getValue());
        Q().l.setOnChildScrollUpCallback(new u8f(3));
        Q().l.setOnRefreshListener(new kr9(this, 11));
        int i = 0;
        X().h.e(this, new eqb(6, new mnc(this, i)));
        rq3 rq3Var = null;
        z8e.x(this, X().i, new onc(this, rq3Var, i));
        z8e.x(this, X().j, new onc(this, rq3Var, 1));
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        getMenuInflater().inflate(R.menu.activity_mma_fighter_menu, menu);
        this.Q = menu.findItem(R.id.menu_item_edit);
        View actionView = menu.findItem(R.id.add_to_favorites).getActionView();
        this.S = actionView != null ? (FollowActionButton) actionView.findViewById(R.id.follow_button) : null;
        View actionView2 = menu.findItem(R.id.receive_notifications).getActionView();
        this.R = actionView2 != null ? (NotificationsActionButton) actionView2.findViewById(R.id.notifications_button) : null;
        return true;
    }

    @Override // com.sofascore.results.base.BaseActivity, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        Team Y;
        menuItem.getClass();
        if (menuItem.getItemId() != R.id.menu_item_edit || (Y = Y()) == null) {
            return super.onOptionsItemSelected(menuItem);
        }
        MmaEditFighterDialog mmaEditFighterDialog = new MmaEditFighterDialog();
        mmaEditFighterDialog.setArguments(fz8.C(fz8.G("ARG_FIGHTER", Y)));
        mmaEditFighterDialog.p(k(), "MmaEditFighterDialog");
        return true;
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        menu.getClass();
        Z(Y());
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // android.app.Activity
    public final void onProvideAssistContent(AssistContent assistContent) {
        assistContent.getClass();
        super.onProvideAssistContent(assistContent);
        Team Y = Y();
        if (Y != null) {
            assistContent.setWebUri(Uri.parse(String.format("%s%s%s", Arrays.copyOf(new Object[]{getString(R.string.share_link), Y.getWebUrl(), ""}, 3))));
        }
    }

    @Override // com.sofascore.results.base.BaseActivity
    public final String u() {
        return "TeamScreen";
    }

    @Override // com.sofascore.results.base.BaseActivity
    public final String y() {
        return mz1.j(((Number) this.M.getValue()).intValue(), super.y(), " id:");
    }
}
