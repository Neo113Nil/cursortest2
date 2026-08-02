package com.sofascore.results.player;

import android.app.assist.AssistContent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.PlayerHeadFlags;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.results.R;
import com.sofascore.results.view.follownotification.FollowActionButton;
import com.sofascore.results.view.follownotification.NotificationsActionButton;
import defpackage.as9;
import defpackage.aye;
import defpackage.cd5;
import defpackage.duf;
import defpackage.eqb;
import defpackage.g7a;
import defpackage.ile;
import defpackage.kle;
import defpackage.kr9;
import defpackage.lle;
import defpackage.mqi;
import defpackage.mz1;
import defpackage.ole;
import defpackage.otk;
import defpackage.ple;
import defpackage.pxg;
import defpackage.q5a;
import defpackage.rq3;
import defpackage.u8f;
import defpackage.un0;
import defpackage.v9b;
import defpackage.wyh;
import defpackage.xw3;
import defpackage.ypa;
import defpackage.z8e;
import defpackage.zxe;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/player/PlayerActivity;", "Lcom/sofascore/results/mvvm/base/CollapsibleToolbarActivity;", "<init>", "()V", "jle", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PlayerActivity extends Hilt_PlayerActivity {
    public static final /* synthetic */ int Z = 0;
    public final otk M;
    public final mqi N;
    public final mqi O;
    public final mqi P;
    public zxe S;
    public Integer T;
    public boolean U;
    public MenuItem W;
    public NotificationsActionButton X;
    public FollowActionButton Y;
    public final mqi Q = ypa.b(new ile(this, 3));
    public final mqi R = ypa.b(new ile(this, 4));
    public Function0 V = new ile(this, 5);

    public PlayerActivity() {
        int i = 0;
        int i2 = 1;
        int i3 = 2;
        this.M = new otk(duf.a.getOrCreateKotlinClass(ple.class), new lle(this, i2), new lle(this, i), new lle(this, i3));
        this.N = ypa.b(new ile(this, i));
        this.O = ypa.b(new ile(this, i2));
        this.P = ypa.b(new ile(this, i3));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity
    public final void N() {
        ple X = X();
        if (!X.u || X.v) {
            return;
        }
        X.u = false;
        xw3.L(un0.z(X), null, null, new ole(X, null), 3);
    }

    public final ple X() {
        return (ple) this.M.getValue();
    }

    public final int Y() {
        return ((Number) this.O.getValue()).intValue();
    }

    public final String Z() {
        Team team;
        Sport sport;
        Player player = X().l;
        if (player == null || (team = player.getTeam()) == null || (sport = team.getSport()) == null) {
            return null;
        }
        return sport.getSlug();
    }

    public final aye a0() {
        return (aye) this.N.getValue();
    }

    public final void b0(Player player) {
        if (player == null) {
            return;
        }
        List list = (List) X().A.a.getValue();
        FollowActionButton followActionButton = this.Y;
        if (followActionButton != null) {
            followActionButton.setVisibility(0);
        }
        NotificationsActionButton notificationsActionButton = this.X;
        if (notificationsActionButton != null) {
            notificationsActionButton.setVisibility(0);
        }
        FollowActionButton followActionButton2 = this.Y;
        if (followActionButton2 != null) {
            String Z2 = Z();
            list.getClass();
            if (!player.getDeceased() && !player.getRetired() && !player.getDisabled()) {
                Set set = wyh.z;
                String sportSlug = player.getSportSlug();
                if (sportSlug != null) {
                    Z2 = sportSlug;
                }
                if (CollectionsKt.R(set, Z2)) {
                    followActionButton2.setFollowableItem(player);
                    followActionButton2.g(list);
                }
            }
            followActionButton2.setVisibility(8);
        }
        NotificationsActionButton notificationsActionButton2 = this.X;
        if (notificationsActionButton2 != null) {
            String Z3 = Z();
            list.getClass();
            if (!player.getDeceased() && !player.getRetired() && !player.getDisabled()) {
                Set set2 = wyh.z;
                String sportSlug2 = player.getSportSlug();
                if (sportSlug2 != null) {
                    Z3 = sportSlug2;
                }
                if (CollectionsKt.R(set2, Z3)) {
                    notificationsActionButton2.setFollowableItem(player);
                    notificationsActionButton2.g(list);
                    return;
                }
            }
            notificationsActionButton2.setVisibility(8);
            notificationsActionButton2.setClickable(true);
        }
    }

    public final void c0() {
        boolean z;
        MenuItem menuItem = this.W;
        if (menuItem != null) {
            Set set = wyh.a;
            if (wyh.i(Z())) {
                PlayerHeadFlags playerHeadFlags = (PlayerHeadFlags) X().q.d();
                if (Intrinsics.c(playerHeadFlags != null ? Boolean.valueOf(playerHeadFlags.getStatistics()) : null, Boolean.TRUE)) {
                    z = true;
                    menuItem.setVisible(z);
                }
            }
            z = false;
            menuItem.setVisible(z);
        }
    }

    @Override // com.sofascore.results.mvvm.base.CollapsibleToolbarActivity, com.sofascore.results.mvvm.base.AbstractActivity, com.sofascore.results.base.BaseActivity, com.sofascore.results.base.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        intent.getClass();
        this.S = (zxe) g7a.y(intent, "SELECT_TAB", zxe.class);
        Bundle extras = getIntent().getExtras();
        rq3 rq3Var = null;
        this.T = extras != null ? Integer.valueOf(extras.getInt("POSITION_ON_FANTASY")) : null;
        Q().k.setAdapter(a0());
        this.x.a = Integer.valueOf(Y());
        Q().h.setSelectedTabIndicatorColor(getColor(R.color.on_color_primary));
        this.o = Q().g;
        if (Y() == 12994) {
            R().setOnClickListener(new cd5(this, 27));
        }
        Q().l.setOnChildScrollUpCallback(new u8f(3));
        Q().l.setOnRefreshListener(new kr9(this, 19));
        int i = 0;
        if (((Boolean) this.R.getValue()).booleanValue()) {
            Q().d.setExpanded(false);
        }
        X().q.e(this, new eqb(11, new v9b(1, this, PlayerActivity.class, "onHeadersResponseReceived", "onHeadersResponseReceived(Lcom/sofascore/model/mvvm/model/PlayerHeadFlags;)V", 0, 24)));
        q5a.I(this, a0());
        z8e.x(this, X().z, new kle(this, rq3Var, i));
        z8e.w(this, X().A, new kle(this, rq3Var, 1));
        as9.l(R(), Y(), null);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        getMenuInflater().inflate(R.menu.activity_player_menu, menu);
        this.W = menu.findItem(R.id.menu_item_compare);
        View actionView = menu.findItem(R.id.add_to_favorites).getActionView();
        this.Y = actionView != null ? (FollowActionButton) actionView.findViewById(R.id.follow_button) : null;
        View actionView2 = menu.findItem(R.id.receive_notifications).getActionView();
        this.X = actionView2 != null ? (NotificationsActionButton) actionView2.findViewById(R.id.notifications_button) : null;
        c0();
        return true;
    }

    @Override // com.sofascore.results.base.BaseActivity, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != R.id.menu_item_compare) {
            return super.onOptionsItemSelected(menuItem);
        }
        Player player = X().l;
        if (player == null) {
            return true;
        }
        pxg.c(this, player.getId(), null, X().m, X().n, X().o, Z(), Z());
        return true;
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        menu.getClass();
        PlayerHeadFlags playerHeadFlags = (PlayerHeadFlags) X().q.d();
        b0(playerHeadFlags != null ? playerHeadFlags.getPlayer() : null);
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // android.app.Activity
    public final void onProvideAssistContent(AssistContent assistContent) {
        assistContent.getClass();
        super.onProvideAssistContent(assistContent);
        Player player = X().l;
        if (player != null) {
            assistContent.setWebUri(Uri.parse(String.format("%s%s%s", Arrays.copyOf(new Object[]{getString(R.string.share_link), player.getWebUrl(), ""}, 3))));
        }
    }

    @Override // com.sofascore.results.base.BaseActivity
    public final String u() {
        return "PlayerScreen";
    }

    @Override // com.sofascore.results.base.BaseActivity
    public final String y() {
        return mz1.j(Y(), super.y(), " id:");
    }
}
