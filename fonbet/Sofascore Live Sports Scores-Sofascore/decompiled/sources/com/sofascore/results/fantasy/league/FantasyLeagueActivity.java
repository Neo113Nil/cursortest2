package com.sofascore.results.fantasy.league;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.sofascore.common.mvvm.UnderlinedToolbar;
import com.sofascore.results.R;
import com.sofascore.results.base.BaseActivity;
import com.sofascore.results.fantasy.league.FantasyLeagueActivity;
import com.sofascore.results.fantasy.league.settings.bottomsheet.invite.FantasyInviteToLeagueBottomSheet;
import com.sofascore.results.mvvm.base.AbstractActivity;
import defpackage.bti;
import defpackage.dmi;
import defpackage.duf;
import defpackage.ev6;
import defpackage.f37;
import defpackage.fz8;
import defpackage.h37;
import defpackage.i37;
import defpackage.ia0;
import defpackage.j37;
import defpackage.j41;
import defpackage.j67;
import defpackage.l37;
import defpackage.lq2;
import defpackage.mqi;
import defpackage.ok3;
import defpackage.otk;
import defpackage.r1;
import defpackage.rq3;
import defpackage.sub;
import defpackage.ty0;
import defpackage.uaa;
import defpackage.un0;
import defpackage.vxd;
import defpackage.wca;
import defpackage.xw3;
import defpackage.ypa;
import defpackage.z8e;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/sofascore/results/fantasy/league/FantasyLeagueActivity;", "Lcom/sofascore/results/mvvm/base/AbstractActivity;", "Llq2;", "<init>", "()V", "inb", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FantasyLeagueActivity extends Hilt_FantasyLeagueActivity implements lq2 {
    public static final /* synthetic */ int N = 0;
    public final mqi K;
    public final otk L;
    public final mqi M;

    public FantasyLeagueActivity() {
        final int i = 0;
        this.K = ypa.b(new Function0(this) { // from class: g37
            public final /* synthetic */ FantasyLeagueActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                FantasyLeagueActivity fantasyLeagueActivity = this.b;
                switch (i2) {
                    case 0:
                        int i3 = FantasyLeagueActivity.N;
                        return bti.a(fantasyLeagueActivity.getLayoutInflater());
                    case 1:
                        int i4 = FantasyLeagueActivity.N;
                        FantasyLeagueActivity fantasyLeagueActivity2 = this.b;
                        return new l37(fantasyLeagueActivity2, fantasyLeagueActivity2.Q().i, fantasyLeagueActivity2.Q().g, fantasyLeagueActivity2.R().f, fantasyLeagueActivity2.R().g);
                    default:
                        int i5 = FantasyLeagueActivity.N;
                        fantasyLeagueActivity.S().F();
                        return Unit.a;
                }
            }
        });
        final int i2 = 1;
        final int i3 = 2;
        this.L = new otk(duf.a.getOrCreateKotlinClass(j37.class), new h37(this, i2), new h37(this, i), new h37(this, i3));
        this.M = ypa.b(new Function0(this) { // from class: g37
            public final /* synthetic */ FantasyLeagueActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                FantasyLeagueActivity fantasyLeagueActivity = this.b;
                switch (i22) {
                    case 0:
                        int i32 = FantasyLeagueActivity.N;
                        return bti.a(fantasyLeagueActivity.getLayoutInflater());
                    case 1:
                        int i4 = FantasyLeagueActivity.N;
                        FantasyLeagueActivity fantasyLeagueActivity2 = this.b;
                        return new l37(fantasyLeagueActivity2, fantasyLeagueActivity2.Q().i, fantasyLeagueActivity2.Q().g, fantasyLeagueActivity2.R().f, fantasyLeagueActivity2.R().g);
                    default:
                        int i5 = FantasyLeagueActivity.N;
                        fantasyLeagueActivity.S().F();
                        return Unit.a;
                }
            }
        });
        new Function0(this) { // from class: g37
            public final /* synthetic */ FantasyLeagueActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                FantasyLeagueActivity fantasyLeagueActivity = this.b;
                switch (i22) {
                    case 0:
                        int i32 = FantasyLeagueActivity.N;
                        return bti.a(fantasyLeagueActivity.getLayoutInflater());
                    case 1:
                        int i4 = FantasyLeagueActivity.N;
                        FantasyLeagueActivity fantasyLeagueActivity2 = this.b;
                        return new l37(fantasyLeagueActivity2, fantasyLeagueActivity2.Q().i, fantasyLeagueActivity2.Q().g, fantasyLeagueActivity2.R().f, fantasyLeagueActivity2.R().g);
                    default:
                        int i5 = FantasyLeagueActivity.N;
                        fantasyLeagueActivity.S().F();
                        return Unit.a;
                }
            }
        };
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity
    public final void N() {
        j37 R = R();
        xw3.L(un0.z(R), null, null, new i37(R, null, 0), 3);
    }

    public final bti Q() {
        return (bti) this.K.getValue();
    }

    public final j37 R() {
        return (j37) this.L.getValue();
    }

    public final l37 S() {
        return (l37) this.M.getValue();
    }

    @Override // defpackage.lq2
    public final void a() {
        Q().i.post(new f37(this, 1));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity, com.sofascore.results.base.BaseActivity, com.sofascore.results.base.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.x.a = Integer.valueOf(R().f.a);
        String string = R().f.d() ? getString(R.string.fantasy_global_league) : R().f.b;
        string.getClass();
        AbstractActivity.M(this, Q().h, string, R().g.e, vxd.j(R().g.a, (Intrinsics.c(uaa.c, "api.sofascore.com/") ? "https://img.sofascore.com/" : dmi.q("https://", uaa.c)).concat("api/v1/"), "category/", "/image"), 24);
        I(Q().b, sub.d(new Pair("page", "fantasy")));
        this.o = Q().f;
        Q().g.setSelectedTabIndicatorColor(getColor(R.color.on_color_primary));
        ((UnderlinedToolbar) Q().h.c).setBackground(null);
        Q().c.setBackground(new ty0(R().g.a));
        Q().i.setAdapter(S());
        Q().a.post(new f37(this, 0));
        z8e.x(this, R().m, new r1(this, null, 28));
        Q().i.a(new j41(this, 6));
        setContentView(Q().a);
        CoordinatorLayout coordinatorLayout = Q().a;
        coordinatorLayout.getClass();
        BaseActivity.r(this, coordinatorLayout);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        String str = R().f.d;
        ia0 ia0Var = ia0.q;
        if (Intrinsics.c(str, ok3.p().e().getId()) && !R().g.w) {
            getMenuInflater().inflate(R.menu.menu_invite, menu);
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.sofascore.results.base.BaseActivity, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != R.id.invite) {
            return super.onOptionsItemSelected(menuItem);
        }
        ev6 ev6Var = R().g;
        j67 j67Var = R().f;
        ev6Var.getClass();
        j67Var.getClass();
        FantasyInviteToLeagueBottomSheet fantasyInviteToLeagueBottomSheet = new FantasyInviteToLeagueBottomSheet();
        fantasyInviteToLeagueBottomSheet.setArguments(fz8.C(fz8.G("FANTASY_COMPETITION_EXTRA", ev6Var), fz8.G("FANTASY_LEAGUE_EXTRA", j67Var)));
        rq3 rq3Var = null;
        FantasyLeagueActivity fantasyLeagueActivity = this instanceof AppCompatActivity ? this : null;
        if (fantasyLeagueActivity == null) {
            return true;
        }
        wca.x(fantasyLeagueActivity.getLifecycle()).b(new r1(fantasyInviteToLeagueBottomSheet, fantasyLeagueActivity, rq3Var, 3));
        return true;
    }

    @Override // com.sofascore.results.base.BaseActivity
    public final String u() {
        return "FantasyLeagueScreen";
    }

    @Override // defpackage.lq2
    public final void b() {
    }

    @Override // defpackage.lq2
    public final void c() {
    }
}
