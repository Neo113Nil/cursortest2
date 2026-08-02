package com.sofascore.results.team;

import android.app.assist.AssistContent;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.sofascore.local_persistance.BrandingTeam;
import com.sofascore.model.favorites.FavoritesEventsData;
import com.sofascore.model.mvvm.model.Category;
import com.sofascore.model.mvvm.model.CategoryTransferWindow;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.TeamDetailsHeadFlags;
import com.sofascore.results.R;
import com.sofascore.results.view.follownotification.FollowActionButton;
import com.sofascore.results.view.follownotification.NotificationsActionButton;
import defpackage.c1g;
import defpackage.chf;
import defpackage.duf;
import defpackage.gz8;
import defpackage.hq4;
import defpackage.hs4;
import defpackage.hui;
import defpackage.imf;
import defpackage.ioe;
import defpackage.iui;
import defpackage.iz2;
import defpackage.joa;
import defpackage.jui;
import defpackage.kui;
import defpackage.lui;
import defpackage.mqi;
import defpackage.mui;
import defpackage.mz1;
import defpackage.nui;
import defpackage.otk;
import defpackage.p2g;
import defpackage.pxg;
import defpackage.q5a;
import defpackage.rq3;
import defpackage.t4j;
import defpackage.tz9;
import defpackage.u2g;
import defpackage.u4j;
import defpackage.u8f;
import defpackage.un0;
import defpackage.w2g;
import defpackage.wyh;
import defpackage.xw3;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z45;
import defpackage.z8e;
import java.time.LocalDateTime;
import java.time.Year;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/team/TeamActivity;", "Lcom/sofascore/results/mvvm/base/CollapsibleToolbarActivity;", "<init>", "()V", "jle", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TeamActivity extends Hilt_TeamActivity {
    public static final /* synthetic */ int Z = 0;
    public final mqi M;
    public final otk N;
    public final mqi O;
    public boolean T;
    public NotificationsActionButton U;
    public FollowActionButton V;
    public MenuItem W;
    public t4j X;
    public final mqi P = ypa.b(new iui(this, 3));
    public final mqi Q = ypa.b(new iui(this, 4));
    public final mqi R = ypa.b(new iui(this, 5));
    public Function0 S = new iui(this, 6);
    public final joa Y = ypa.a(ysa.c, new iui(this, 7));

    public TeamActivity() {
        int i = 1;
        this.M = ypa.b(new iui(this, i));
        int i2 = 2;
        this.N = new otk(duf.a.getOrCreateKotlinClass(nui.class), new kui(this, i), new kui(this, 0), new kui(this, i2));
        this.O = ypa.b(new iui(this, i2));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity
    public final void N() {
        nui X = X();
        iz2 z = un0.z(X);
        hs4 hs4Var = z45.a;
        xw3.L(z, hq4.c, null, new mui(X, null), 2);
    }

    public final nui X() {
        return (nui) this.N.getValue();
    }

    public final BrandingTeam Y() {
        return (BrandingTeam) this.Y.getValue();
    }

    public final Team Z() {
        return (Team) X().k.d();
    }

    public final int a0() {
        return ((Number) this.M.getValue()).intValue();
    }

    public final u4j b0() {
        return (u4j) this.R.getValue();
    }

    public final void c0(Team team) {
        if (team == null) {
            return;
        }
        FavoritesEventsData favoritesEventsData = (FavoritesEventsData) X().A.a.getValue();
        FollowActionButton followActionButton = this.V;
        if (followActionButton != null) {
            followActionButton.setVisibility(0);
        }
        NotificationsActionButton notificationsActionButton = this.U;
        if (notificationsActionButton != null) {
            notificationsActionButton.setVisibility(0);
        }
        FollowActionButton followActionButton2 = this.V;
        if (followActionButton2 != null) {
            followActionButton2.h(team, favoritesEventsData);
        }
        NotificationsActionButton notificationsActionButton2 = this.U;
        if (notificationsActionButton2 != null) {
            int i = NotificationsActionButton.g;
            notificationsActionButton2.i(team, favoritesEventsData, false);
        }
    }

    public final void d0() {
        Sport sport;
        Team Z2 = Z();
        String slug = (Z2 == null || (sport = Z2.getSport()) == null) ? null : sport.getSlug();
        TeamDetailsHeadFlags teamDetailsHeadFlags = (TeamDetailsHeadFlags) X().m.d();
        if (wyh.i(slug)) {
            if (Intrinsics.c(teamDetailsHeadFlags != null ? Boolean.valueOf(teamDetailsHeadFlags.getStatistics()) : null, Boolean.TRUE)) {
                MenuItem menuItem = this.W;
                if (menuItem != null) {
                    menuItem.setVisible(true);
                }
                MenuItem menuItem2 = this.W;
                if (menuItem2 != null) {
                    menuItem2.setIcon(getDrawable(wyh.e(slug) ? R.drawable.ic_compare_players : R.drawable.ic_compare_teams));
                    return;
                }
                return;
            }
        }
        if (teamDetailsHeadFlags != null) {
            Q().i.getMenu().removeItem(R.id.menu_item_compare);
            this.W = null;
        } else {
            MenuItem menuItem3 = this.W;
            if (menuItem3 != null) {
                menuItem3.setVisible(false);
            }
        }
    }

    public final void e0(int i) {
        boolean z;
        Boolean bool;
        Category category;
        List<CategoryTransferWindow> transferPeriod;
        Object u2gVar;
        boolean z2;
        if (i == b0().D(t4j.f)) {
            z = true;
        } else if (i == b0().D(t4j.c)) {
            Team Z2 = Z();
            if (Z2 == null || (category = Z2.getCategory()) == null || (transferPeriod = category.getTransferPeriod()) == null) {
                bool = null;
            } else {
                DateTimeFormatter formatter = new DateTimeFormatterBuilder().appendPattern("MM-dd HH:mm").parseDefaulting(ChronoField.YEAR, Year.now().getValue()).toFormatter();
                LocalDateTime now = LocalDateTime.now(ZoneOffset.UTC);
                if (!transferPeriod.isEmpty()) {
                    for (CategoryTransferWindow categoryTransferWindow : transferPeriod) {
                        try {
                            p2g p2gVar = w2g.b;
                            LocalDateTime parse = LocalDateTime.parse(categoryTransferWindow.getActiveFrom(), formatter);
                            if (now.isBefore(parse)) {
                                parse = parse.plusYears(-1L);
                            }
                            LocalDateTime plusYears = LocalDateTime.parse(categoryTransferWindow.getActiveTo(), formatter).plusYears(parse.getYear() - now.getYear());
                            if (plusYears.isBefore(parse)) {
                                plusYears = plusYears.plusYears(1L);
                            }
                            plusYears.getClass();
                            u2gVar = Boolean.valueOf(now.compareTo((Object) parse) >= 0 && now.compareTo((Object) plusYears) <= 0);
                        } catch (Throwable th) {
                            p2g p2gVar2 = w2g.b;
                            u2gVar = new u2g(th);
                        }
                        Object obj = Boolean.FALSE;
                        if (u2gVar instanceof u2g) {
                            u2gVar = obj;
                        }
                        if (((Boolean) u2gVar).booleanValue()) {
                            z2 = true;
                            break;
                        }
                    }
                }
                z2 = false;
                bool = Boolean.valueOf(z2);
            }
            z = Intrinsics.c(bool, Boolean.TRUE);
        } else {
            z = false;
        }
        if (z) {
            Q().e.y(0);
        } else {
            Q().e.y(1);
        }
    }

    @Override // com.sofascore.results.mvvm.base.CollapsibleToolbarActivity, com.sofascore.results.mvvm.base.AbstractActivity, com.sofascore.results.base.BaseActivity, com.sofascore.results.base.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        GradientDrawable gradientDrawable;
        super.onCreate(bundle);
        BrandingTeam Y = Y();
        rq3 rq3Var = null;
        if (Y != null) {
            c1g L = tz9.L(this, Y.getBackgroundColor(), Y.getBackgroundGradientColor());
            if (L == null) {
                gradientDrawable = null;
            } else {
                GradientDrawable.Orientation orientation = GradientDrawable.Orientation.LEFT_RIGHT;
                int i = L.a;
                gradientDrawable = new GradientDrawable(orientation, new int[]{i, L.b, i});
            }
            if (gradientDrawable != null) {
                Q().a.setBackground(gradientDrawable);
            }
        }
        Bundle extras = getIntent().getExtras();
        this.X = extras != null ? (t4j) gz8.M(extras, "INITIAL_TAB", t4j.class) : null;
        z8e.x(this, X().z, new jui(this, rq3Var, 0));
        int i2 = 1;
        z8e.x(this, X().A, new jui(this, rq3Var, i2));
        Q().k.setAdapter(b0());
        q5a.I(this, b0());
        this.x.a = Integer.valueOf(a0());
        Q().h.setSelectedTabIndicatorColor(getColor(R.color.on_color_primary));
        this.o = Q().g;
        Q().l.setOnChildScrollUpCallback(new u8f(3));
        Q().l.setOnRefreshListener(new imf(this, 21));
        X().m.e(this, new ioe(20, new chf(1, this, TeamActivity.class, "onHeadersResponseReceived", "onHeadersResponseReceived(Lcom/sofascore/model/mvvm/model/TeamDetailsHeadFlags;)V", 0, 18)));
        X().n.e(this, new ioe(20, new hui(this, i2)));
        X().k.e(this, new ioe(20, new hui(this, 2)));
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        getMenuInflater().inflate(R.menu.activity_team_menu, menu);
        this.W = menu.findItem(R.id.menu_item_compare);
        View actionView = menu.findItem(R.id.add_to_favorites).getActionView();
        this.V = actionView != null ? (FollowActionButton) actionView.findViewById(R.id.follow_button) : null;
        View actionView2 = menu.findItem(R.id.receive_notifications).getActionView();
        this.U = actionView2 != null ? (NotificationsActionButton) actionView2.findViewById(R.id.notifications_button) : null;
        d0();
        return true;
    }

    @Override // com.sofascore.results.base.BaseActivity, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        TeamActivity teamActivity;
        menuItem.getClass();
        if (menuItem.getItemId() == R.id.menu_item_compare) {
            int a0 = a0();
            Integer num = X().v;
            Integer num2 = X().w;
            String str = X().x;
            Team Z2 = Z();
            String sportSlug = Z2 != null ? Z2.getSportSlug() : null;
            Team Z3 = Z();
            teamActivity = this;
            pxg.d(teamActivity, a0, null, num, num2, str, sportSlug, Z3 != null ? Z3.getSportSlug() : null);
        } else {
            teamActivity = this;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        menu.getClass();
        TeamDetailsHeadFlags teamDetailsHeadFlags = (TeamDetailsHeadFlags) X().m.d();
        c0(teamDetailsHeadFlags != null ? teamDetailsHeadFlags.getTeam() : null);
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // android.app.Activity
    public final void onProvideAssistContent(AssistContent assistContent) {
        assistContent.getClass();
        super.onProvideAssistContent(assistContent);
        Team team = (Team) X().k.d();
        if (team != null) {
            assistContent.setWebUri(Uri.parse(String.format("%s%s%s", Arrays.copyOf(new Object[]{getString(R.string.share_link), team.getWebUrl(), ""}, 3))));
        }
    }

    @Override // com.sofascore.results.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        nui X = X();
        xw3.L(un0.z(X), null, null, new lui(X, null, 0), 3);
    }

    @Override // com.sofascore.results.base.BaseActivity
    public final String u() {
        return "TeamScreen";
    }

    @Override // com.sofascore.results.base.BaseActivity
    public final String y() {
        return mz1.j(a0(), super.y(), " id:");
    }
}
